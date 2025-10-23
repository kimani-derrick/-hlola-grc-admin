package androidx.leanback.app;

import androidx.leanback.widget.AbstractC0287d0;
import androidx.leanback.widget.C0280a;
import androidx.leanback.widget.P;
/* loaded from: classes.dex */
public final class A extends P {

    /* renamed from: c  reason: collision with root package name */
    public final P f6151c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public final z f6152e;

    public A(P p3) {
        super(p3.f6438b);
        z zVar;
        this.f6151c = p3;
        e();
        if (p3 instanceof C0280a) {
            zVar = new z(1, this);
        } else {
            zVar = new z(0, this);
        }
        this.f6152e = zVar;
        e();
        p3.f6437a.registerObserver(this.f6152e);
    }

    @Override // androidx.leanback.widget.P
    public final Object a(int i7) {
        return this.f6151c.a(i7);
    }

    @Override // androidx.leanback.widget.P
    public final int d() {
        return this.d + 1;
    }

    public final void e() {
        this.d = -1;
        P p3 = this.f6151c;
        int d = p3.d() - 1;
        if (d >= 0) {
            ((AbstractC0287d0) p3.a(d)).getClass();
            this.d = d;
        }
    }
}
