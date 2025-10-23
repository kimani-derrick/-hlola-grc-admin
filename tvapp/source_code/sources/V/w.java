package V;

import W5.InterfaceC0106m;
/* loaded from: classes.dex */
public final class w extends F5.c {

    /* renamed from: t  reason: collision with root package name */
    public Object f3579t;

    /* renamed from: u  reason: collision with root package name */
    public H f3580u;

    /* renamed from: v  reason: collision with root package name */
    public InterfaceC0106m f3581v;

    /* renamed from: w  reason: collision with root package name */
    public /* synthetic */ Object f3582w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ H f3583x;

    /* renamed from: y  reason: collision with root package name */
    public int f3584y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(H h7, D5.d dVar) {
        super(dVar);
        this.f3583x = h7;
    }

    @Override // F5.a
    public final Object p(Object obj) {
        this.f3582w = obj;
        this.f3584y |= Integer.MIN_VALUE;
        return H.a(this.f3583x, null, this);
    }
}
