package K1;

import z5.C1526h;
/* renamed from: K1.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0056g extends F5.c {

    /* renamed from: t  reason: collision with root package name */
    public /* synthetic */ Object f1584t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ h f1585u;

    /* renamed from: v  reason: collision with root package name */
    public int f1586v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0056g(h hVar, D5.d dVar) {
        super(dVar);
        this.f1585u = hVar;
    }

    @Override // F5.a
    public final Object p(Object obj) {
        this.f1584t = obj;
        this.f1586v |= Integer.MIN_VALUE;
        Object a7 = this.f1585u.a(null, 0L, 0, null, null, null, this);
        if (a7 == E5.a.f612q) {
            return a7;
        }
        return new C1526h(a7);
    }
}
