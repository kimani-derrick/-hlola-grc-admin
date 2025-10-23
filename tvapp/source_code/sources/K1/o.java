package K1;

import z5.C1526h;
/* loaded from: classes.dex */
public final class o extends F5.c {

    /* renamed from: t  reason: collision with root package name */
    public p f1604t;

    /* renamed from: u  reason: collision with root package name */
    public /* synthetic */ Object f1605u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ p f1606v;

    /* renamed from: w  reason: collision with root package name */
    public int f1607w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, D5.d dVar) {
        super(dVar);
        this.f1606v = pVar;
    }

    @Override // F5.a
    public final Object p(Object obj) {
        this.f1605u = obj;
        this.f1607w |= Integer.MIN_VALUE;
        Object a7 = this.f1606v.a(0L, this);
        if (a7 == E5.a.f612q) {
            return a7;
        }
        return new C1526h(a7);
    }
}
