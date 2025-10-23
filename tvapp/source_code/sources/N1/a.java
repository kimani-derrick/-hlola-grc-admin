package N1;

import z5.C1526h;
/* loaded from: classes.dex */
public final class a extends F5.c {

    /* renamed from: t  reason: collision with root package name */
    public /* synthetic */ Object f2397t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ b f2398u;

    /* renamed from: v  reason: collision with root package name */
    public int f2399v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, D5.d dVar) {
        super(dVar);
        this.f2398u = bVar;
    }

    @Override // F5.a
    public final Object p(Object obj) {
        this.f2397t = obj;
        this.f2399v |= Integer.MIN_VALUE;
        Object a7 = this.f2398u.a(0L, this);
        if (a7 == E5.a.f612q) {
            return a7;
        }
        return new C1526h(a7);
    }
}
