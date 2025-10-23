package M0;
/* loaded from: classes.dex */
public final class j extends F5.c {

    /* renamed from: t  reason: collision with root package name */
    public /* synthetic */ Object f2158t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ l f2159u;

    /* renamed from: v  reason: collision with root package name */
    public int f2160v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, D5.d dVar) {
        super(dVar);
        this.f2159u = lVar;
    }

    @Override // F5.a
    public final Object p(Object obj) {
        this.f2158t = obj;
        this.f2160v |= Integer.MIN_VALUE;
        return this.f2159u.b(null, this);
    }
}
