package Z5;

import Z4.B;
/* loaded from: classes.dex */
public final class g extends F5.c {

    /* renamed from: t  reason: collision with root package name */
    public B f4896t;

    /* renamed from: u  reason: collision with root package name */
    public /* synthetic */ Object f4897u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ B f4898v;

    /* renamed from: w  reason: collision with root package name */
    public int f4899w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(B b7, D5.d dVar) {
        super(dVar);
        this.f4898v = b7;
    }

    @Override // F5.a
    public final Object p(Object obj) {
        this.f4897u = obj;
        this.f4899w |= Integer.MIN_VALUE;
        return this.f4898v.a(null, this);
    }
}
