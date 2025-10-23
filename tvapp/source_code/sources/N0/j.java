package N0;
/* loaded from: classes.dex */
public final class j extends F5.c {

    /* renamed from: t  reason: collision with root package name */
    public k f2387t;

    /* renamed from: u  reason: collision with root package name */
    public i f2388u;

    /* renamed from: v  reason: collision with root package name */
    public /* synthetic */ Object f2389v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ k f2390w;

    /* renamed from: x  reason: collision with root package name */
    public int f2391x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, D5.d dVar) {
        super(dVar);
        this.f2390w = kVar;
    }

    @Override // F5.a
    public final Object p(Object obj) {
        this.f2389v = obj;
        this.f2391x |= Integer.MIN_VALUE;
        return this.f2390w.b(null, this);
    }
}
