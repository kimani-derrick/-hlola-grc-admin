package Z4;
/* loaded from: classes.dex */
public final class K extends F5.c {

    /* renamed from: t  reason: collision with root package name */
    public L f4769t;

    /* renamed from: u  reason: collision with root package name */
    public /* synthetic */ Object f4770u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ L f4771v;

    /* renamed from: w  reason: collision with root package name */
    public int f4772w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(L l7, D5.d dVar) {
        super(dVar);
        this.f4771v = l7;
    }

    @Override // F5.a
    public final Object p(Object obj) {
        this.f4770u = obj;
        this.f4772w |= Integer.MIN_VALUE;
        return L.a(this.f4771v, this);
    }
}
