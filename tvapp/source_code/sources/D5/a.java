package D5;

import L5.p;
/* loaded from: classes.dex */
public abstract class a implements g {

    /* renamed from: q  reason: collision with root package name */
    public final h f523q;

    public a(h hVar) {
        this.f523q = hVar;
    }

    @Override // D5.i
    public final Object O(Object obj, p pVar) {
        return pVar.j(obj, this);
    }

    @Override // D5.i
    public g f(h hVar) {
        return p6.d.j(this, hVar);
    }

    @Override // D5.g
    public final h getKey() {
        return this.f523q;
    }

    @Override // D5.i
    public final i r(i iVar) {
        return p6.d.A(this, iVar);
    }

    @Override // D5.i
    public i x(h hVar) {
        return p6.d.t(this, hVar);
    }
}
