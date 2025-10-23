package a6;
/* loaded from: classes.dex */
public final class i extends F5.c {

    /* renamed from: t  reason: collision with root package name */
    public j f5215t;

    /* renamed from: u  reason: collision with root package name */
    public Object f5216u;

    /* renamed from: v  reason: collision with root package name */
    public /* synthetic */ Object f5217v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ j f5218w;

    /* renamed from: x  reason: collision with root package name */
    public int f5219x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, D5.d dVar) {
        super(dVar);
        this.f5218w = jVar;
    }

    @Override // F5.a
    public final Object p(Object obj) {
        this.f5217v = obj;
        this.f5219x |= Integer.MIN_VALUE;
        return this.f5218w.a(null, this);
    }
}
