package M1;

import com.google.android.gms.internal.measurement.K1;
import java.io.Serializable;
import z5.C1526h;
/* loaded from: classes.dex */
public final class c extends F5.c {

    /* renamed from: t  reason: collision with root package name */
    public K1 f2181t;

    /* renamed from: u  reason: collision with root package name */
    public /* synthetic */ Object f2182u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ K1 f2183v;

    /* renamed from: w  reason: collision with root package name */
    public int f2184w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(K1 k12, D5.d dVar) {
        super(dVar);
        this.f2183v = k12;
    }

    @Override // F5.a
    public final Object p(Object obj) {
        this.f2182u = obj;
        this.f2184w |= Integer.MIN_VALUE;
        Serializable E4 = this.f2183v.E(null, this);
        if (E4 == E5.a.f612q) {
            return E4;
        }
        return new C1526h(E4);
    }
}
