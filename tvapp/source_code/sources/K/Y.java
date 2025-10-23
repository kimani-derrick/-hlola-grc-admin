package K;

import android.view.WindowInsets;
/* loaded from: classes.dex */
public class Y extends a0 {

    /* renamed from: a  reason: collision with root package name */
    public final WindowInsets.Builder f1463a;

    public Y() {
        this.f1463a = D.b.f();
    }

    @Override // K.a0
    public i0 b() {
        WindowInsets build;
        a();
        build = this.f1463a.build();
        i0 d = i0.d(build, null);
        d.f1495a.l(null);
        return d;
    }

    @Override // K.a0
    public void c(D.d dVar) {
        this.f1463a.setStableInsets(dVar.c());
    }

    @Override // K.a0
    public void d(D.d dVar) {
        this.f1463a.setSystemWindowInsets(dVar.c());
    }

    public Y(i0 i0Var) {
        super(i0Var);
        WindowInsets c5 = i0Var.c();
        this.f1463a = c5 != null ? D.b.g(c5) : D.b.f();
    }
}
