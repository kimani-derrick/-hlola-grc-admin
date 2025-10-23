package e1;
/* renamed from: e1.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0577k extends F5.c {

    /* renamed from: t  reason: collision with root package name */
    public String f9388t;

    /* renamed from: u  reason: collision with root package name */
    public /* synthetic */ Object f9389u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ C0580n f9390v;

    /* renamed from: w  reason: collision with root package name */
    public int f9391w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0577k(C0580n c0580n, D5.d dVar) {
        super(dVar);
        this.f9390v = c0580n;
    }

    @Override // F5.a
    public final Object p(Object obj) {
        this.f9389u = obj;
        this.f9391w |= Integer.MIN_VALUE;
        return this.f9390v.b(false, this);
    }
}
