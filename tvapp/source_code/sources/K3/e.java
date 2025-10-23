package K3;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import g3.n;
import g3.u;
import g3.v;
import g3.w;
/* loaded from: classes.dex */
public final class e implements Handler.Callback {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f1833q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ Object f1834r;

    public /* synthetic */ e(int i7, Object obj) {
        this.f1833q = i7;
        this.f1834r = obj;
    }

    private final boolean a(Message message) {
        if (message.what != 0) {
            return false;
        }
        AbstractC0515y1.v(message.obj);
        synchronized (((f) this.f1834r).f1836a) {
            throw null;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.f1833q) {
            case 0:
                return a(message);
            default:
                int i7 = message.what;
                if (i7 != 0) {
                    if (i7 != 1) {
                        return false;
                    }
                    synchronized (((w) this.f1834r).f10832a) {
                        try {
                            u uVar = (u) message.obj;
                            v vVar = (v) ((w) this.f1834r).f10832a.get(uVar);
                            if (vVar != null && vVar.f10826b == 3) {
                                Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback ".concat(String.valueOf(uVar)), new Exception());
                                ComponentName componentName = vVar.f;
                                if (componentName == null) {
                                    uVar.getClass();
                                    componentName = null;
                                }
                                if (componentName == null) {
                                    String str = uVar.f10823b;
                                    n.g(str);
                                    componentName = new ComponentName(str, "unknown");
                                }
                                vVar.onServiceDisconnected(componentName);
                            }
                        } finally {
                        }
                    }
                } else {
                    synchronized (((w) this.f1834r).f10832a) {
                        try {
                            u uVar2 = (u) message.obj;
                            v vVar2 = (v) ((w) this.f1834r).f10832a.get(uVar2);
                            if (vVar2 != null && vVar2.f10825a.isEmpty()) {
                                if (vVar2.f10827c) {
                                    vVar2.f10829g.f10834c.removeMessages(1, vVar2.f10828e);
                                    w wVar = vVar2.f10829g;
                                    wVar.d.b(wVar.f10833b, vVar2);
                                    vVar2.f10827c = false;
                                    vVar2.f10826b = 2;
                                }
                                ((w) this.f1834r).f10832a.remove(uVar2);
                            }
                        } finally {
                        }
                    }
                }
                return true;
        }
    }
}
