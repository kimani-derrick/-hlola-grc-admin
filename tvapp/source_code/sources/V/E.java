package V;
/* loaded from: classes.dex */
public final class E extends F5.c {

    /* renamed from: t  reason: collision with root package name */
    public H f3509t;

    /* renamed from: u  reason: collision with root package name */
    public Object f3510u;

    /* renamed from: v  reason: collision with root package name */
    public Object f3511v;

    /* renamed from: w  reason: collision with root package name */
    public /* synthetic */ Object f3512w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ H f3513x;

    /* renamed from: y  reason: collision with root package name */
    public int f3514y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(H h7, D5.d dVar) {
        super(dVar);
        this.f3513x = h7;
    }

    @Override // F5.a
    public final Object p(Object obj) {
        this.f3512w = obj;
        this.f3514y |= Integer.MIN_VALUE;
        return this.f3513x.h(this, null, null);
    }
}
