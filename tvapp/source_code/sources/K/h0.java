package K;

import android.os.Build;
import android.view.View;
import java.util.Objects;
/* loaded from: classes.dex */
public class h0 {

    /* renamed from: b  reason: collision with root package name */
    public static final i0 f1492b;

    /* renamed from: a  reason: collision with root package name */
    public final i0 f1493a;

    static {
        a0 x7;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 30) {
            x7 = new Z();
        } else if (i7 >= 29) {
            x7 = new Y();
        } else {
            x7 = new X();
        }
        f1492b = x7.b().f1495a.a().f1495a.b().f1495a.c();
    }

    public h0(i0 i0Var) {
        this.f1493a = i0Var;
    }

    public i0 a() {
        return this.f1493a;
    }

    public i0 b() {
        return this.f1493a;
    }

    public i0 c() {
        return this.f1493a;
    }

    public C0034j e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        if (k() == h0Var.k() && j() == h0Var.j() && Objects.equals(h(), h0Var.h()) && Objects.equals(g(), h0Var.g()) && Objects.equals(e(), h0Var.e())) {
            return true;
        }
        return false;
    }

    public D.d f() {
        return h();
    }

    public D.d g() {
        return D.d.f428e;
    }

    public D.d h() {
        return D.d.f428e;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(k()), Boolean.valueOf(j()), h(), g(), e());
    }

    public i0 i(int i7, int i8, int i9, int i10) {
        return f1492b;
    }

    public boolean j() {
        return false;
    }

    public boolean k() {
        return false;
    }

    public void d(View view) {
    }

    public void l(D.d[] dVarArr) {
    }

    public void m(i0 i0Var) {
    }

    public void n(D.d dVar) {
    }
}
