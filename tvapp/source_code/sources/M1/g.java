package M1;

import com.google.android.gms.internal.measurement.K1;
import java.io.Serializable;
import z5.C1526h;
/* loaded from: classes.dex */
public final class g extends F5.c {

    /* renamed from: t  reason: collision with root package name */
    public K1 f2193t;

    /* renamed from: u  reason: collision with root package name */
    public /* synthetic */ Object f2194u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ K1 f2195v;

    /* renamed from: w  reason: collision with root package name */
    public int f2196w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(K1 k12, D5.d dVar) {
        super(dVar);
        this.f2195v = k12;
    }

    @Override // F5.a
    public final Object p(Object obj) {
        this.f2194u = obj;
        this.f2196w |= Integer.MIN_VALUE;
        Serializable N6 = this.f2195v.N(0, this);
        if (N6 == E5.a.f612q) {
            return N6;
        }
        return new C1526h(N6);
    }
}
