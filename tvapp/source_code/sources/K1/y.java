package K1;

import z5.C1526h;
/* loaded from: classes.dex */
public final class y extends F5.c {

    /* renamed from: t  reason: collision with root package name */
    public z f1640t;

    /* renamed from: u  reason: collision with root package name */
    public /* synthetic */ Object f1641u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ z f1642v;

    /* renamed from: w  reason: collision with root package name */
    public int f1643w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(z zVar, D5.d dVar) {
        super(dVar);
        this.f1642v = zVar;
    }

    @Override // F5.a
    public final Object p(Object obj) {
        this.f1641u = obj;
        this.f1643w |= Integer.MIN_VALUE;
        Object a7 = this.f1642v.a(0, null, this);
        if (a7 == E5.a.f612q) {
            return a7;
        }
        return new C1526h(a7);
    }
}
