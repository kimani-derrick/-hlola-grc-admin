package K1;

import java.io.Serializable;
import z5.C1526h;
/* loaded from: classes.dex */
public final class A extends F5.c {

    /* renamed from: t  reason: collision with root package name */
    public B f1546t;

    /* renamed from: u  reason: collision with root package name */
    public /* synthetic */ Object f1547u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ B f1548v;

    /* renamed from: w  reason: collision with root package name */
    public int f1549w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(B b7, D5.d dVar) {
        super(dVar);
        this.f1548v = b7;
    }

    @Override // F5.a
    public final Object p(Object obj) {
        this.f1547u = obj;
        this.f1549w |= Integer.MIN_VALUE;
        Serializable a7 = this.f1548v.a(this);
        if (a7 == E5.a.f612q) {
            return a7;
        }
        return new C1526h(a7);
    }
}
