package V;
/* loaded from: classes.dex */
public final class A extends F5.c {

    /* renamed from: t  reason: collision with root package name */
    public H f3491t;

    /* renamed from: u  reason: collision with root package name */
    public /* synthetic */ Object f3492u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ H f3493v;

    /* renamed from: w  reason: collision with root package name */
    public int f3494w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(H h7, D5.d dVar) {
        super(dVar);
        this.f3493v = h7;
    }

    @Override // F5.a
    public final Object p(Object obj) {
        this.f3492u = obj;
        this.f3494w |= Integer.MIN_VALUE;
        return this.f3493v.d(this);
    }
}
