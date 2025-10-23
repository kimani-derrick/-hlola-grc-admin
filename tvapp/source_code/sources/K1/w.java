package K1;

import z5.C1526h;
/* loaded from: classes.dex */
public final class w extends F5.c {

    /* renamed from: t  reason: collision with root package name */
    public x f1632t;

    /* renamed from: u  reason: collision with root package name */
    public int f1633u;

    /* renamed from: v  reason: collision with root package name */
    public int f1634v;

    /* renamed from: w  reason: collision with root package name */
    public /* synthetic */ Object f1635w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ x f1636x;

    /* renamed from: y  reason: collision with root package name */
    public int f1637y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(x xVar, D5.d dVar) {
        super(dVar);
        this.f1636x = xVar;
    }

    @Override // F5.a
    public final Object p(Object obj) {
        this.f1635w = obj;
        this.f1637y |= Integer.MIN_VALUE;
        Object a7 = this.f1636x.a(null, null, 0, 0, this);
        if (a7 == E5.a.f612q) {
            return a7;
        }
        return new C1526h(a7);
    }
}
