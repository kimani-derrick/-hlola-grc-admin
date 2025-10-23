package s3;

import android.os.Bundle;
import java.util.Iterator;
import java.util.TreeSet;
import k.C0852F;
/* loaded from: classes.dex */
public final /* synthetic */ class B0 implements Runnable {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f13751q;

    /* renamed from: r  reason: collision with root package name */
    public /* synthetic */ Bundle f13752r;

    /* renamed from: s  reason: collision with root package name */
    public /* synthetic */ C1212z0 f13753s;

    public /* synthetic */ B0() {
        this.f13751q = 0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7;
        switch (this.f13751q) {
            case 0:
                C1212z0 c1212z0 = this.f13753s;
                Bundle bundle = this.f13752r;
                if (bundle == null) {
                    c1212z0.B().f13892P.f0(new Bundle());
                    return;
                }
                Bundle a02 = c1212z0.B().f13892P.a0();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    C0852F c0852f = c1212z0.f14407K;
                    C1175g0 c1175g0 = (C1175g0) c1212z0.f2765q;
                    if (hasNext) {
                        String next = it.next();
                        Object obj = bundle.get(next);
                        if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                            c1212z0.C();
                            if (x1.m0(obj)) {
                                c1212z0.C();
                                x1.h0(c0852f, null, 27, null, null, 0);
                            }
                            c1212z0.b().f13800A.b(next, obj, "Invalid default event parameter type. Name, value");
                        } else if (x1.K0(next)) {
                            c1212z0.b().f13800A.c(next, "Invalid default event parameter name. Name");
                        } else if (obj == null) {
                            a02.remove(next);
                        } else if (c1212z0.C().p0("param", next, c1175g0.f14062w.F(null, false), obj)) {
                            c1212z0.C().W(a02, next, obj);
                        }
                    } else {
                        c1212z0.C();
                        if (c1175g0.f14062w.C().u0(201500000)) {
                            i7 = 100;
                        } else {
                            i7 = 25;
                        }
                        if (a02.size() > i7) {
                            Iterator it2 = new TreeSet(a02.keySet()).iterator();
                            int i8 = 0;
                            while (it2.hasNext()) {
                                String str = (String) it2.next();
                                i8++;
                                if (i8 > i7) {
                                    a02.remove(str);
                                }
                            }
                            c1212z0.C();
                            x1.h0(c0852f, null, 26, null, null, 0);
                            c1212z0.b().f13800A.d("Too many default event parameters set. Discarding beyond event parameter limit");
                        }
                        c1212z0.B().f13892P.f0(a02);
                        R0 r3 = c1175g0.r();
                        r3.D();
                        r3.H();
                        r3.K(new A4.e(r3, r3.W(false), a02, 10));
                        return;
                    }
                }
                break;
            case 1:
                C1212z0 c1212z02 = this.f13753s;
                c1212z02.D();
                c1212z02.H();
                Bundle bundle2 = this.f13752r;
                g3.n.g(bundle2);
                String string = bundle2.getString("name");
                g3.n.c(string);
                C1175g0 c1175g02 = (C1175g0) c1212z02.f2765q;
                if (!c1175g02.j()) {
                    c1212z02.b().f13803D.d("Conditional property not cleared since app measurement is disabled");
                    return;
                }
                u1 u1Var = new u1(0L, null, string, "");
                try {
                    x1 C3 = c1212z02.C();
                    bundle2.getString("app_id");
                    c1175g02.r().M(new C1168d(bundle2.getString("app_id"), "", u1Var, bundle2.getLong("creation_timestamp"), bundle2.getBoolean("active"), bundle2.getString("trigger_event_name"), null, bundle2.getLong("trigger_timeout"), null, bundle2.getLong("time_to_live"), C3.S(bundle2.getString("expired_event_name"), bundle2.getBundle("expired_event_params"), "", bundle2.getLong("creation_timestamp"), true)));
                    return;
                } catch (IllegalArgumentException unused) {
                    return;
                }
            default:
                C1212z0 c1212z03 = this.f13753s;
                c1212z03.D();
                c1212z03.H();
                Bundle bundle3 = this.f13752r;
                g3.n.g(bundle3);
                String string2 = bundle3.getString("name");
                String string3 = bundle3.getString("origin");
                g3.n.c(string2);
                g3.n.c(string3);
                g3.n.g(bundle3.get("value"));
                C1175g0 c1175g03 = (C1175g0) c1212z03.f2765q;
                if (!c1175g03.j()) {
                    c1212z03.b().f13803D.d("Conditional property not set since app measurement is disabled");
                    return;
                }
                u1 u1Var2 = new u1(bundle3.getLong("triggered_timestamp"), bundle3.get("value"), string2, string3);
                try {
                    x1 C6 = c1212z03.C();
                    bundle3.getString("app_id");
                    C1201u S6 = C6.S(bundle3.getString("triggered_event_name"), bundle3.getBundle("triggered_event_params"), string3, 0L, true);
                    x1 C7 = c1212z03.C();
                    bundle3.getString("app_id");
                    C1201u S7 = C7.S(bundle3.getString("timed_out_event_name"), bundle3.getBundle("timed_out_event_params"), string3, 0L, true);
                    x1 C8 = c1212z03.C();
                    bundle3.getString("app_id");
                    c1175g03.r().M(new C1168d(bundle3.getString("app_id"), string3, u1Var2, bundle3.getLong("creation_timestamp"), false, bundle3.getString("trigger_event_name"), S7, bundle3.getLong("trigger_timeout"), S6, bundle3.getLong("time_to_live"), C8.S(bundle3.getString("expired_event_name"), bundle3.getBundle("expired_event_params"), string3, 0L, true)));
                    return;
                } catch (IllegalArgumentException unused2) {
                    return;
                }
        }
    }

    public /* synthetic */ B0(C1212z0 c1212z0, Bundle bundle, int i7) {
        this.f13751q = i7;
        this.f13752r = bundle;
        this.f13753s = c1212z0;
    }
}
