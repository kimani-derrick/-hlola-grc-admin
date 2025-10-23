package o4;
/* loaded from: classes.dex */
public final class m implements M4.b {

    /* renamed from: c  reason: collision with root package name */
    public static final f2.d f12945c = new f2.d(24);
    public static final U4.n d = new U4.n(2);

    /* renamed from: a  reason: collision with root package name */
    public M4.a f12946a;

    /* renamed from: b  reason: collision with root package name */
    public volatile M4.b f12947b;

    public m(f2.d dVar, M4.b bVar) {
        this.f12946a = dVar;
        this.f12947b = bVar;
    }

    public final void a(M4.a aVar) {
        M4.b bVar;
        M4.b bVar2;
        M4.b bVar3 = this.f12947b;
        U4.n nVar = d;
        if (bVar3 != nVar) {
            aVar.f(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.f12947b;
            if (bVar != nVar) {
                bVar2 = bVar;
            } else {
                this.f12946a = new T4.d(this.f12946a, 12, aVar);
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            aVar.f(bVar);
        }
    }

    @Override // M4.b
    public final Object get() {
        return this.f12947b.get();
    }
}
