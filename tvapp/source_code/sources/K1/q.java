package K1;

import z5.C1526h;
/* loaded from: classes.dex */
public final class q extends F5.c {

    /* renamed from: t  reason: collision with root package name */
    public r f1610t;

    /* renamed from: u  reason: collision with root package name */
    public /* synthetic */ Object f1611u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ r f1612v;

    /* renamed from: w  reason: collision with root package name */
    public int f1613w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r rVar, D5.d dVar) {
        super(dVar);
        this.f1612v = rVar;
    }

    @Override // F5.a
    public final Object p(Object obj) {
        this.f1611u = obj;
        this.f1613w |= Integer.MIN_VALUE;
        Object a7 = this.f1612v.a(0L, null, this);
        if (a7 == E5.a.f612q) {
            return a7;
        }
        return new C1526h(a7);
    }
}
