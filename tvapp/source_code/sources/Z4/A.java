package Z4;
/* loaded from: classes.dex */
public final class A extends F5.c {

    /* renamed from: t  reason: collision with root package name */
    public /* synthetic */ Object f4738t;

    /* renamed from: u  reason: collision with root package name */
    public int f4739u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ B f4740v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(B b7, D5.d dVar) {
        super(dVar);
        this.f4740v = b7;
    }

    @Override // F5.a
    public final Object p(Object obj) {
        this.f4738t = obj;
        this.f4739u |= Integer.MIN_VALUE;
        return this.f4740v.a(null, this);
    }
}
