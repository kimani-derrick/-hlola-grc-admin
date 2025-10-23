package s3;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import k3.C0959b;
/* loaded from: classes.dex */
public final class V {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f13916a;

    /* renamed from: b  reason: collision with root package name */
    public C1175g0 f13917b;

    public void a(String str, Bundle bundle) {
        String uri;
        C1175g0 c1175g0 = this.f13917b;
        C1169d0 c1169d0 = c1175g0.f14065z;
        C1175g0.i(c1169d0);
        c1169d0.D();
        if (!c1175g0.j()) {
            if (bundle.isEmpty()) {
                uri = null;
            } else {
                str = (str == null || str.isEmpty()) ? "auto" : "auto";
                Uri.Builder builder = new Uri.Builder();
                builder.path(str);
                for (String str2 : bundle.keySet()) {
                    builder.appendQueryParameter(str2, bundle.getString(str2));
                }
                uri = builder.build().toString();
            }
            if (!TextUtils.isEmpty(uri)) {
                T t5 = c1175g0.f14063x;
                C1175g0.h(t5);
                t5.f13890N.j(uri);
                C1175g0.h(t5);
                c1175g0.f14037D.getClass();
                t5.f13891O.g(System.currentTimeMillis());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean b() {
        switch (this.f13916a) {
            case 0:
                C1175g0 c1175g0 = this.f13917b;
                boolean z7 = false;
                try {
                    T1.j a7 = C0959b.a(c1175g0.f14056q);
                    if (a7 == null) {
                        C1154I c1154i = c1175g0.f14064y;
                        C1175g0.i(c1154i);
                        c1154i.f13803D.d("Failed to get PackageManager for Install Referrer Play Store compatibility check");
                        c1175g0 = c1175g0;
                    } else {
                        int i7 = a7.c("com.android.vending", 128).versionCode;
                        c1175g0 = i7;
                        if (i7 >= 80837300) {
                            z7 = true;
                            c1175g0 = i7;
                        }
                    }
                } catch (Exception e3) {
                    C1154I c1154i2 = c1175g0.f14064y;
                    C1175g0.i(c1154i2);
                    c1154i2.f13803D.c(e3, "Failed to retrieve Play Store version for Install Referrer");
                }
                return z7;
            default:
                C1175g0 c1175g02 = this.f13917b;
                if (TextUtils.isEmpty(c1175g02.f14057r)) {
                    C1154I c1154i3 = c1175g02.f14064y;
                    C1175g0.i(c1154i3);
                    if (c1154i3.L(3)) {
                        return true;
                    }
                }
                return false;
        }
    }

    public boolean c() {
        T t5 = this.f13917b.f14063x;
        C1175g0.h(t5);
        if (t5.f13891O.f() > 0) {
            return true;
        }
        return false;
    }

    public boolean d() {
        if (!c()) {
            return false;
        }
        C1175g0 c1175g0 = this.f13917b;
        c1175g0.f14037D.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        T t5 = c1175g0.f14063x;
        C1175g0.h(t5);
        if (currentTimeMillis - t5.f13891O.f() <= c1175g0.f14062w.J(null, AbstractC1203v.f14298U)) {
            return false;
        }
        return true;
    }

    public /* synthetic */ V(C1175g0 c1175g0, int i7) {
        this.f13916a = i7;
        this.f13917b = c1175g0;
    }

    public V(q1 q1Var) {
        this.f13916a = 0;
        this.f13917b = q1Var.f14185B;
    }
}
