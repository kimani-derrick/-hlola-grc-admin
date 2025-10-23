package Z5;

import com.google.android.gms.internal.measurement.K1;
/* loaded from: classes.dex */
public final class e extends F5.c {

    /* renamed from: t  reason: collision with root package name */
    public /* synthetic */ Object f4888t;

    /* renamed from: u  reason: collision with root package name */
    public int f4889u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ K1 f4890v;

    /* renamed from: w  reason: collision with root package name */
    public K1 f4891w;

    /* renamed from: x  reason: collision with root package name */
    public c f4892x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(K1 k12, D5.d dVar) {
        super(dVar);
        this.f4890v = k12;
    }

    @Override // F5.a
    public final Object p(Object obj) {
        this.f4888t = obj;
        this.f4889u |= Integer.MIN_VALUE;
        return this.f4890v.t(null, this);
    }
}
