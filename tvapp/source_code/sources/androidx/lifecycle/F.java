package androidx.lifecycle;

import android.os.Handler;
/* loaded from: classes.dex */
public final class F implements InterfaceC0342u {

    /* renamed from: y  reason: collision with root package name */
    public static final F f6733y = new F();

    /* renamed from: q  reason: collision with root package name */
    public int f6734q;

    /* renamed from: r  reason: collision with root package name */
    public int f6735r;

    /* renamed from: u  reason: collision with root package name */
    public Handler f6738u;

    /* renamed from: s  reason: collision with root package name */
    public boolean f6736s = true;

    /* renamed from: t  reason: collision with root package name */
    public boolean f6737t = true;

    /* renamed from: v  reason: collision with root package name */
    public final C0344w f6739v = new C0344w(this);

    /* renamed from: w  reason: collision with root package name */
    public final E1.b f6740w = new E1.b(11, this);

    /* renamed from: x  reason: collision with root package name */
    public final Z5.n f6741x = new Z5.n(this);

    public final void a() {
        int i7 = this.f6735r + 1;
        this.f6735r = i7;
        if (i7 == 1) {
            if (this.f6736s) {
                this.f6739v.G(EnumC0336n.ON_RESUME);
                this.f6736s = false;
                return;
            }
            Handler handler = this.f6738u;
            M5.g.c(handler);
            handler.removeCallbacks(this.f6740w);
        }
    }

    @Override // androidx.lifecycle.InterfaceC0342u
    public final P1.c q() {
        return this.f6739v;
    }
}
