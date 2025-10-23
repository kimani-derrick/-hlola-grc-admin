package Z5;
/* loaded from: classes.dex */
public final class a extends F5.c {

    /* renamed from: t  reason: collision with root package name */
    public a6.q f4878t;

    /* renamed from: u  reason: collision with root package name */
    public /* synthetic */ Object f4879u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ n f4880v;

    /* renamed from: w  reason: collision with root package name */
    public int f4881w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(n nVar, D5.d dVar) {
        super(dVar);
        this.f4880v = nVar;
    }

    @Override // F5.a
    public final Object p(Object obj) {
        this.f4879u = obj;
        this.f4881w |= Integer.MIN_VALUE;
        return this.f4880v.t(null, this);
    }
}
