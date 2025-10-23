package M1;

import com.google.android.gms.internal.measurement.K1;
import z5.C1526h;
/* loaded from: classes.dex */
public final class j extends F5.c {

    /* renamed from: t  reason: collision with root package name */
    public K1 f2201t;

    /* renamed from: u  reason: collision with root package name */
    public /* synthetic */ Object f2202u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ K1 f2203v;

    /* renamed from: w  reason: collision with root package name */
    public int f2204w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(K1 k12, D5.d dVar) {
        super(dVar);
        this.f2203v = k12;
    }

    @Override // F5.a
    public final Object p(Object obj) {
        this.f2202u = obj;
        this.f2204w |= Integer.MIN_VALUE;
        Object s6 = this.f2203v.s(this);
        if (s6 == E5.a.f612q) {
            return s6;
        }
        return new C1526h(s6);
    }
}
