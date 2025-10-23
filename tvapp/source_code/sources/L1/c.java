package L1;

import z5.C1526h;
/* loaded from: classes.dex */
public final class c extends F5.c {

    /* renamed from: t  reason: collision with root package name */
    public /* synthetic */ Object f1902t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ d f1903u;

    /* renamed from: v  reason: collision with root package name */
    public int f1904v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, D5.d dVar2) {
        super(dVar2);
        this.f1903u = dVar;
    }

    @Override // F5.a
    public final Object p(Object obj) {
        this.f1902t = obj;
        this.f1904v |= Integer.MIN_VALUE;
        Object a7 = this.f1903u.a(this);
        if (a7 == E5.a.f612q) {
            return a7;
        }
        return new C1526h(a7);
    }
}
