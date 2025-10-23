package N4;

import t3.C1244h;
/* loaded from: classes.dex */
public final class g implements j {

    /* renamed from: a  reason: collision with root package name */
    public final k f2535a;

    /* renamed from: b  reason: collision with root package name */
    public final C1244h f2536b;

    public g(k kVar, C1244h c1244h) {
        this.f2535a = kVar;
        this.f2536b = c1244h;
    }

    @Override // N4.j
    public final boolean a(O4.b bVar) {
        if (bVar.f2724b == 4 && !this.f2535a.a(bVar)) {
            String str = bVar.f2725c;
            if (str != null) {
                this.f2536b.f14573a.l(new a(bVar.f2726e, bVar.f, str));
                return true;
            }
            throw new NullPointerException("Null token");
        }
        return false;
    }

    @Override // N4.j
    public final boolean b(Exception exc) {
        this.f2536b.a(exc);
        return true;
    }
}
