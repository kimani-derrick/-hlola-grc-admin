package K0;
/* loaded from: classes.dex */
public final class d extends F5.c {

    /* renamed from: t  reason: collision with root package name */
    public Object f1519t;

    /* renamed from: u  reason: collision with root package name */
    public e6.f f1520u;

    /* renamed from: v  reason: collision with root package name */
    public /* synthetic */ Object f1521v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ e f1522w;

    /* renamed from: x  reason: collision with root package name */
    public int f1523x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, D5.d dVar) {
        super(dVar);
        this.f1522w = eVar;
    }

    @Override // F5.a
    public final Object p(Object obj) {
        this.f1521v = obj;
        this.f1523x |= Integer.MIN_VALUE;
        return this.f1522w.a(this);
    }
}
