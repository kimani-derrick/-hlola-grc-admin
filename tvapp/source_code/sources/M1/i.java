package M1;

import java.io.Serializable;
import z5.C1526h;
/* loaded from: classes.dex */
public final class i extends F5.c {

    /* renamed from: t  reason: collision with root package name */
    public /* synthetic */ Object f2198t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ T4.c f2199u;

    /* renamed from: v  reason: collision with root package name */
    public int f2200v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(T4.c cVar, D5.d dVar) {
        super(dVar);
        this.f2199u = cVar;
    }

    @Override // F5.a
    public final Object p(Object obj) {
        this.f2198t = obj;
        this.f2200v |= Integer.MIN_VALUE;
        Serializable P6 = this.f2199u.P(this);
        if (P6 == E5.a.f612q) {
            return P6;
        }
        return new C1526h(P6);
    }
}
