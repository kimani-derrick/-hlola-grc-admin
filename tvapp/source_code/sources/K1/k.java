package K1;

import java.io.Serializable;
import z5.C1526h;
/* loaded from: classes.dex */
public final class k extends F5.c {

    /* renamed from: t  reason: collision with root package name */
    public l f1592t;

    /* renamed from: u  reason: collision with root package name */
    public /* synthetic */ Object f1593u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ l f1594v;

    /* renamed from: w  reason: collision with root package name */
    public int f1595w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, D5.d dVar) {
        super(dVar);
        this.f1594v = lVar;
    }

    @Override // F5.a
    public final Object p(Object obj) {
        this.f1593u = obj;
        this.f1595w |= Integer.MIN_VALUE;
        Serializable a7 = this.f1594v.a(this);
        if (a7 == E5.a.f612q) {
            return a7;
        }
        return new C1526h(a7);
    }
}
