package N4;

import t3.C1244h;
/* loaded from: classes.dex */
public final class h implements j {

    /* renamed from: a  reason: collision with root package name */
    public final C1244h f2537a;

    public h(C1244h c1244h) {
        this.f2537a = c1244h;
    }

    @Override // N4.j
    public final boolean a(O4.b bVar) {
        int i7 = bVar.f2724b;
        if (i7 == 3 || i7 == 4 || i7 == 5) {
            this.f2537a.b(bVar.f2723a);
            return true;
        }
        return false;
    }

    @Override // N4.j
    public final boolean b(Exception exc) {
        return false;
    }
}
