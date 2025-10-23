package V;
/* loaded from: classes.dex */
public final class D extends F5.c {

    /* renamed from: t  reason: collision with root package name */
    public Object f3504t;

    /* renamed from: u  reason: collision with root package name */
    public Object f3505u;

    /* renamed from: v  reason: collision with root package name */
    public /* synthetic */ Object f3506v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ H f3507w;

    /* renamed from: x  reason: collision with root package name */
    public int f3508x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(H h7, D5.d dVar) {
        super(dVar);
        this.f3507w = h7;
    }

    @Override // F5.a
    public final Object p(Object obj) {
        this.f3506v = obj;
        this.f3508x |= Integer.MIN_VALUE;
        return this.f3507w.g(this);
    }
}
