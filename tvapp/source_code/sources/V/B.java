package V;
/* loaded from: classes.dex */
public final class B extends F5.c {

    /* renamed from: t  reason: collision with root package name */
    public H f3495t;

    /* renamed from: u  reason: collision with root package name */
    public /* synthetic */ Object f3496u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ H f3497v;

    /* renamed from: w  reason: collision with root package name */
    public int f3498w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(H h7, D5.d dVar) {
        super(dVar);
        this.f3497v = h7;
    }

    @Override // F5.a
    public final Object p(Object obj) {
        this.f3496u = obj;
        this.f3498w |= Integer.MIN_VALUE;
        return this.f3497v.e(this);
    }
}
