package V4;
/* loaded from: classes.dex */
public final class o implements U4.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ p f3711a;

    public o(p pVar) {
        this.f3711a = pVar;
    }

    @Override // U4.b
    public final void b(U4.h hVar) {
        p pVar = this.f3711a;
        synchronized (pVar) {
            pVar.d = true;
        }
        this.f3711a.g(hVar);
    }

    @Override // U4.b
    public final void a(U4.a aVar) {
    }
}
