package com.google.firebase.sessions;

import M5.g;
import Z4.V;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
/* loaded from: classes.dex */
public final class SessionLifecycleService extends Service {

    /* renamed from: q  reason: collision with root package name */
    public final HandlerThread f9181q = new HandlerThread("FirebaseSessions_HandlerThread");

    /* renamed from: r  reason: collision with root package name */
    public V f9182r;

    /* renamed from: s  reason: collision with root package name */
    public Messenger f9183s;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        Object parcelableExtra;
        if (intent == null) {
            Log.d("SessionLifecycleService", "Service bound with null intent. Ignoring.");
            return null;
        }
        Log.d("SessionLifecycleService", "Service bound to new client on process " + intent.getAction());
        if (Build.VERSION.SDK_INT >= 33) {
            parcelableExtra = intent.getParcelableExtra("ClientCallbackMessenger", Messenger.class);
        } else {
            parcelableExtra = intent.getParcelableExtra("ClientCallbackMessenger");
        }
        Messenger messenger = (Messenger) parcelableExtra;
        if (messenger != null) {
            Message obtain = Message.obtain(null, 4, 0, 0);
            obtain.replyTo = messenger;
            V v5 = this.f9182r;
            if (v5 != null) {
                v5.sendMessage(obtain);
            }
        }
        Messenger messenger2 = this.f9183s;
        if (messenger2 == null) {
            return null;
        }
        return messenger2.getBinder();
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        HandlerThread handlerThread = this.f9181q;
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        g.e(looper, "handlerThread.looper");
        this.f9182r = new V(looper);
        this.f9183s = new Messenger(this.f9182r);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f9181q.quit();
    }
}
