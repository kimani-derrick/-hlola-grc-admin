package L1;

import z5.C1526h;
/* loaded from: classes.dex */
public final class f extends F5.c {

    /* renamed from: t  reason: collision with root package name */
    public Object f1907t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f1908u;

    /* renamed from: v  reason: collision with root package name */
    public /* synthetic */ Object f1909v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ g f1910w;

    /* renamed from: x  reason: collision with root package name */
    public int f1911x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, D5.d dVar) {
        super(dVar);
        this.f1910w = gVar;
    }

    @Override // F5.a
    public final Object p(Object obj) {
        this.f1909v = obj;
        this.f1911x |= Integer.MIN_VALUE;
        Object a7 = this.f1910w.a(this);
        if (a7 == E5.a.f612q) {
            return a7;
        }
        return new C1526h(a7);
    }
}
