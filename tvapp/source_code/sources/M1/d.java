package M1;

import java.io.Serializable;
import z5.C1526h;
/* loaded from: classes.dex */
public final class d extends F5.c {

    /* renamed from: t  reason: collision with root package name */
    public /* synthetic */ Object f2185t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ e f2186u;

    /* renamed from: v  reason: collision with root package name */
    public int f2187v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, D5.d dVar) {
        super(dVar);
        this.f2186u = eVar;
    }

    @Override // F5.a
    public final Object p(Object obj) {
        this.f2185t = obj;
        this.f2187v |= Integer.MIN_VALUE;
        Serializable a7 = this.f2186u.a(null, this);
        if (a7 == E5.a.f612q) {
            return a7;
        }
        return new C1526h(a7);
    }
}
