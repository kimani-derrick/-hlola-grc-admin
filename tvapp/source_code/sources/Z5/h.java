package Z5;
/* loaded from: classes.dex */
public final class h extends F5.c {

    /* renamed from: t  reason: collision with root package name */
    public i f4900t;

    /* renamed from: u  reason: collision with root package name */
    public Object f4901u;

    /* renamed from: v  reason: collision with root package name */
    public /* synthetic */ Object f4902v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ i f4903w;

    /* renamed from: x  reason: collision with root package name */
    public int f4904x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, D5.d dVar) {
        super(dVar);
        this.f4903w = iVar;
    }

    @Override // F5.a
    public final Object p(Object obj) {
        this.f4902v = obj;
        this.f4904x |= Integer.MIN_VALUE;
        return this.f4903w.a(null, this);
    }
}
