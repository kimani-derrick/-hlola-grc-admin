package V;
/* loaded from: classes.dex */
public final class t extends F5.c {

    /* renamed from: t  reason: collision with root package name */
    public /* synthetic */ Object f3571t;

    /* renamed from: u  reason: collision with root package name */
    public int f3572u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ u f3573v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(u uVar, D5.d dVar) {
        super(dVar);
        this.f3573v = uVar;
    }

    @Override // F5.a
    public final Object p(Object obj) {
        this.f3571t = obj;
        this.f3572u |= Integer.MIN_VALUE;
        return this.f3573v.a(null, this);
    }
}
