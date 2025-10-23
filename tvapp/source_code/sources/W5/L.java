package W5;
/* loaded from: classes.dex */
public final class L extends N {

    /* renamed from: s  reason: collision with root package name */
    public final InterfaceC0099f f3951s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ P f3952t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(P p3, long j7, C0100g c0100g) {
        super(j7);
        this.f3952t = p3;
        this.f3951s = c0100g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f3951s.l(this.f3952t);
    }

    @Override // W5.N
    public final String toString() {
        return super.toString() + this.f3951s;
    }
}
