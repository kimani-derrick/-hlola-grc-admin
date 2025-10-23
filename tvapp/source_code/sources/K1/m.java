package K1;

import z5.C1526h;
/* loaded from: classes.dex */
public final class m extends F5.c {

    /* renamed from: t  reason: collision with root package name */
    public n f1598t;

    /* renamed from: u  reason: collision with root package name */
    public /* synthetic */ Object f1599u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ n f1600v;

    /* renamed from: w  reason: collision with root package name */
    public int f1601w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, D5.d dVar) {
        super(dVar);
        this.f1600v = nVar;
    }

    @Override // F5.a
    public final Object p(Object obj) {
        this.f1599u = obj;
        this.f1601w |= Integer.MIN_VALUE;
        Object a7 = this.f1600v.a(0L, this);
        if (a7 == E5.a.f612q) {
            return a7;
        }
        return new C1526h(a7);
    }
}
