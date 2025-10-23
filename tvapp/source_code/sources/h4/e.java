package h4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import o.C1051d;
/* loaded from: classes.dex */
public final class e extends BroadcastReceiver {

    /* renamed from: b  reason: collision with root package name */
    public static final AtomicReference f10983b = new AtomicReference();

    /* renamed from: a  reason: collision with root package name */
    public final Context f10984a;

    public e(Context context) {
        this.f10984a = context;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        synchronized (f.f10985k) {
            try {
                Iterator it = ((C1051d) f.f10986l.values()).iterator();
                while (it.hasNext()) {
                    ((f) it.next()).e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f10984a.unregisterReceiver(this);
    }
}
