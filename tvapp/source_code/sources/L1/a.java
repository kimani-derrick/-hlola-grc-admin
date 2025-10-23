package L1;
/* loaded from: classes.dex */
public final class a extends F5.c {

    /* renamed from: t  reason: collision with root package name */
    public /* synthetic */ Object f1898t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ T4.c f1899u;

    /* renamed from: v  reason: collision with root package name */
    public int f1900v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(T4.c cVar, D5.d dVar) {
        super(dVar);
        this.f1899u = cVar;
    }

    @Override // F5.a
    public final Object p(Object obj) {
        this.f1898t = obj;
        this.f1900v |= Integer.MIN_VALUE;
        return this.f1899u.O(this);
    }
}
