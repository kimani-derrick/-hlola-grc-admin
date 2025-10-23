package K1;

import z5.C1526h;
/* loaded from: classes.dex */
public final class E extends F5.c {

    /* renamed from: t  reason: collision with root package name */
    public F f1560t;

    /* renamed from: u  reason: collision with root package name */
    public int f1561u;

    /* renamed from: v  reason: collision with root package name */
    public int f1562v;

    /* renamed from: w  reason: collision with root package name */
    public /* synthetic */ Object f1563w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ F f1564x;

    /* renamed from: y  reason: collision with root package name */
    public int f1565y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(F f, D5.d dVar) {
        super(dVar);
        this.f1564x = f;
    }

    @Override // F5.a
    public final Object p(Object obj) {
        this.f1563w = obj;
        this.f1565y |= Integer.MIN_VALUE;
        Object a7 = this.f1564x.a(null, 0, 0, this);
        if (a7 == E5.a.f612q) {
            return a7;
        }
        return new C1526h(a7);
    }
}
