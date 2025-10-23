package a6;
/* loaded from: classes.dex */
public final class v implements D5.d, F5.d {

    /* renamed from: q  reason: collision with root package name */
    public final D5.d f5242q;

    /* renamed from: r  reason: collision with root package name */
    public final D5.i f5243r;

    public v(D5.d dVar, D5.i iVar) {
        this.f5242q = dVar;
        this.f5243r = iVar;
    }

    @Override // F5.d
    public final F5.d g() {
        D5.d dVar = this.f5242q;
        if (dVar instanceof F5.d) {
            return (F5.d) dVar;
        }
        return null;
    }

    @Override // D5.d
    public final D5.i k() {
        return this.f5243r;
    }

    @Override // D5.d
    public final void m(Object obj) {
        this.f5242q.m(obj);
    }
}
