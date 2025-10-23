package N0;
/* loaded from: classes.dex */
public final class f extends F5.c {

    /* renamed from: t  reason: collision with root package name */
    public i f2360t;

    /* renamed from: u  reason: collision with root package name */
    public k f2361u;

    /* renamed from: v  reason: collision with root package name */
    public /* synthetic */ Object f2362v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ i f2363w;

    /* renamed from: x  reason: collision with root package name */
    public int f2364x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i iVar, D5.d dVar) {
        super(dVar);
        this.f2363w = iVar;
    }

    @Override // F5.a
    public final Object p(Object obj) {
        this.f2362v = obj;
        this.f2364x |= Integer.MIN_VALUE;
        return this.f2363w.d(null, this);
    }
}
