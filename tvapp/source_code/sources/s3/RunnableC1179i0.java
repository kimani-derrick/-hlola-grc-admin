package s3;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
/* renamed from: s3.i0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1179i0 implements Runnable {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f14087q;

    /* renamed from: r  reason: collision with root package name */
    public /* synthetic */ C1212z0 f14088r;

    public /* synthetic */ RunnableC1179i0(int i7) {
        this.f14087q = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        switch (this.f14087q) {
            case 0:
                this.f14088r.c0();
                return;
            case 1:
                C1212z0 c1212z0 = this.f14088r;
                c1212z0.D();
                if (c1212z0.B().f13887K.b()) {
                    c1212z0.b().f13802C.d("Deferred Deep Link already retrieved. Not fetching again.");
                    return;
                }
                long f = c1212z0.B().f13888L.f();
                c1212z0.B().f13888L.g(1 + f);
                if (f >= 5) {
                    c1212z0.b().f13810y.d("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                    c1212z0.B().f13887K.a(true);
                    return;
                }
                if (c1212z0.f14404H == null) {
                    c1212z0.f14404H = new E0(c1212z0, (C1175g0) c1212z0.f2765q, 2);
                }
                c1212z0.f14404H.b(0L);
                return;
            case 2:
                V v5 = this.f14088r.F;
                C1175g0 c1175g0 = v5.f13917b;
                C1169d0 c1169d0 = c1175g0.f14065z;
                C1175g0.i(c1169d0);
                c1169d0.D();
                if (v5.c()) {
                    boolean d = v5.d();
                    C1212z0 c1212z02 = c1175g0.F;
                    T t5 = c1175g0.f14063x;
                    if (d) {
                        C1175g0.h(t5);
                        t5.f13890N.j(null);
                        Bundle bundle = new Bundle();
                        bundle.putString("source", "(not set)");
                        bundle.putString("medium", "(not set)");
                        bundle.putString("_cis", "intent");
                        bundle.putLong("_cc", 1L);
                        C1175g0.g(c1212z02);
                        c1212z02.i0("auto", "_cmpx", bundle);
                    } else {
                        C1175g0.h(t5);
                        String i7 = t5.f13890N.i();
                        if (TextUtils.isEmpty(i7)) {
                            C1154I c1154i = c1175g0.f14064y;
                            C1175g0.i(c1154i);
                            c1154i.f13808w.d("Cache still valid but referrer not found");
                        } else {
                            long f7 = ((t5.f13891O.f() / 3600000) - 1) * 3600000;
                            Uri parse = Uri.parse(i7);
                            Bundle bundle2 = new Bundle();
                            Pair pair = new Pair(parse.getPath(), bundle2);
                            for (String str2 : parse.getQueryParameterNames()) {
                                bundle2.putString(str2, parse.getQueryParameter(str2));
                            }
                            ((Bundle) pair.second).putLong("_cc", f7);
                            Object obj = pair.first;
                            if (obj == null) {
                                str = "app";
                            } else {
                                str = (String) obj;
                            }
                            C1175g0.g(c1212z02);
                            c1212z02.i0(str, "_cmp", (Bundle) pair.second);
                        }
                        t5.f13890N.j(null);
                    }
                    C1175g0.h(t5);
                    t5.f13891O.g(0L);
                    return;
                }
                return;
            default:
                this.f14088r.c0();
                return;
        }
    }

    public RunnableC1179i0(C1212z0 c1212z0) {
        this.f14087q = 2;
        this.f14088r = c1212z0;
    }
}
