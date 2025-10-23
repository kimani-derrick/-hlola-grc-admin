package K1;

import z5.C1526h;
/* loaded from: classes.dex */
public final class u extends F5.c {

    /* renamed from: t  reason: collision with root package name */
    public v f1624t;

    /* renamed from: u  reason: collision with root package name */
    public int f1625u;

    /* renamed from: v  reason: collision with root package name */
    public int f1626v;

    /* renamed from: w  reason: collision with root package name */
    public /* synthetic */ Object f1627w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ v f1628x;

    /* renamed from: y  reason: collision with root package name */
    public int f1629y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(v vVar, D5.d dVar) {
        super(dVar);
        this.f1628x = vVar;
    }

    @Override // F5.a
    public final Object p(Object obj) {
        this.f1627w = obj;
        this.f1629y |= Integer.MIN_VALUE;
        Object a7 = this.f1628x.a(null, null, 0, 0, this);
        if (a7 == E5.a.f612q) {
            return a7;
        }
        return new C1526h(a7);
    }
}
