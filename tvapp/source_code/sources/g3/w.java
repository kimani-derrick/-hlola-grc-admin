package g3;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.measurement.S;
import i3.C0771a;
import java.util.HashMap;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class w {

    /* renamed from: h  reason: collision with root package name */
    public static final Object f10830h = new Object();

    /* renamed from: i  reason: collision with root package name */
    public static w f10831i;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f10832a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final Context f10833b;

    /* renamed from: c  reason: collision with root package name */
    public volatile S f10834c;
    public final C0771a d;

    /* renamed from: e  reason: collision with root package name */
    public final long f10835e;
    public final long f;

    /* renamed from: g  reason: collision with root package name */
    public volatile Executor f10836g;

    /* JADX WARN: Type inference failed for: r3v2, types: [android.os.Handler, com.google.android.gms.internal.measurement.S] */
    public w(Context context, Looper looper) {
        K3.e eVar = new K3.e(1, this);
        this.f10833b = context.getApplicationContext();
        ?? handler = new Handler(looper, eVar);
        Looper.getMainLooper();
        this.f10834c = handler;
        this.d = C0771a.a();
        this.f10835e = 5000L;
        this.f = 300000L;
        this.f10836g = null;
    }

    public final void a(String str, String str2, q qVar, boolean z7) {
        u uVar = new u(str, str2, z7);
        synchronized (this.f10832a) {
            try {
                v vVar = (v) this.f10832a.get(uVar);
                if (vVar != null) {
                    if (vVar.f10825a.containsKey(qVar)) {
                        vVar.f10825a.remove(qVar);
                        if (vVar.f10825a.isEmpty()) {
                            this.f10834c.sendMessageDelayed(this.f10834c.obtainMessage(0, uVar), this.f10835e);
                        }
                    } else {
                        throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=".concat(uVar.toString()));
                    }
                } else {
                    throw new IllegalStateException("Nonexistent connection status for service config: ".concat(uVar.toString()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b(u uVar, q qVar, String str) {
        boolean z7;
        synchronized (this.f10832a) {
            try {
                v vVar = (v) this.f10832a.get(uVar);
                Executor executor = this.f10836g;
                if (vVar == null) {
                    vVar = new v(this, uVar);
                    vVar.f10825a.put(qVar, qVar);
                    vVar.a(str, executor);
                    this.f10832a.put(uVar, vVar);
                } else {
                    this.f10834c.removeMessages(0, uVar);
                    if (!vVar.f10825a.containsKey(qVar)) {
                        vVar.f10825a.put(qVar, qVar);
                        int i7 = vVar.f10826b;
                        if (i7 != 1) {
                            if (i7 == 2) {
                                vVar.a(str, executor);
                            }
                        } else {
                            qVar.onServiceConnected(vVar.f, vVar.d);
                        }
                    } else {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=".concat(uVar.toString()));
                    }
                }
                z7 = vVar.f10827c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z7;
    }
}
