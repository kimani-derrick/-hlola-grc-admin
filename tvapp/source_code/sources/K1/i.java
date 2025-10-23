package K1;

import z5.C1526h;
/* loaded from: classes.dex */
public final class i extends F5.c {

    /* renamed from: t  reason: collision with root package name */
    public /* synthetic */ Object f1588t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ j f1589u;

    /* renamed from: v  reason: collision with root package name */
    public int f1590v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, D5.d dVar) {
        super(dVar);
        this.f1589u = jVar;
    }

    @Override // F5.a
    public final Object p(Object obj) {
        this.f1588t = obj;
        this.f1590v |= Integer.MIN_VALUE;
        Object a7 = this.f1589u.a(this);
        if (a7 == E5.a.f612q) {
            return a7;
        }
        return new C1526h(a7);
    }
}
