package K1;

import z5.C1526h;
/* renamed from: K1.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0054e extends F5.c {

    /* renamed from: t  reason: collision with root package name */
    public /* synthetic */ Object f1580t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ C0055f f1581u;

    /* renamed from: v  reason: collision with root package name */
    public int f1582v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0054e(C0055f c0055f, D5.d dVar) {
        super(dVar);
        this.f1581u = c0055f;
    }

    @Override // F5.a
    public final Object p(Object obj) {
        this.f1580t = obj;
        this.f1582v |= Integer.MIN_VALUE;
        Object a7 = this.f1581u.a(0L, this);
        if (a7 == E5.a.f612q) {
            return a7;
        }
        return new C1526h(a7);
    }
}
