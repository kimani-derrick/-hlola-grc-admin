package b5;
/* loaded from: classes.dex */
public final class l extends F5.c {

    /* renamed from: t  reason: collision with root package name */
    public /* synthetic */ Object f7164t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ n f7165u;

    /* renamed from: v  reason: collision with root package name */
    public int f7166v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(n nVar, D5.d dVar) {
        super(dVar);
        this.f7165u = nVar;
    }

    @Override // F5.a
    public final Object p(Object obj) {
        this.f7164t = obj;
        this.f7166v |= Integer.MIN_VALUE;
        return this.f7165u.c(null, null, this);
    }
}
