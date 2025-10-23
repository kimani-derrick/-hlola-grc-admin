package L1;

import java.io.Serializable;
import z5.C1526h;
/* loaded from: classes.dex */
public final class i extends F5.c {

    /* renamed from: t  reason: collision with root package name */
    public /* synthetic */ Object f1916t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ j f1917u;

    /* renamed from: v  reason: collision with root package name */
    public int f1918v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, D5.d dVar) {
        super(dVar);
        this.f1917u = jVar;
    }

    @Override // F5.a
    public final Object p(Object obj) {
        this.f1916t = obj;
        this.f1918v |= Integer.MIN_VALUE;
        Serializable a7 = this.f1917u.a(null, this);
        if (a7 == E5.a.f612q) {
            return a7;
        }
        return new C1526h(a7);
    }
}
