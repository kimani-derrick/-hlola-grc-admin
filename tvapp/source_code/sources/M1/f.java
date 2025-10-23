package M1;

import com.google.android.gms.internal.measurement.K1;
import java.io.Serializable;
import z5.C1526h;
/* loaded from: classes.dex */
public final class f extends F5.c {

    /* renamed from: t  reason: collision with root package name */
    public K1 f2189t;

    /* renamed from: u  reason: collision with root package name */
    public /* synthetic */ Object f2190u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ K1 f2191v;

    /* renamed from: w  reason: collision with root package name */
    public int f2192w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(K1 k12, D5.d dVar) {
        super(dVar);
        this.f2191v = k12;
    }

    @Override // F5.a
    public final Object p(Object obj) {
        this.f2190u = obj;
        this.f2192w |= Integer.MIN_VALUE;
        Serializable n = this.f2191v.n(this);
        if (n == E5.a.f612q) {
            return n;
        }
        return new C1526h(n);
    }
}
