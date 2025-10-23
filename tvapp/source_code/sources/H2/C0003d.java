package H2;

import e2.C0593J;
/* renamed from: H2.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0003d implements d0 {

    /* renamed from: q  reason: collision with root package name */
    public final d0 f1049q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f1050r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ C0004e f1051s;

    public C0003d(C0004e c0004e, d0 d0Var) {
        this.f1051s = c0004e;
        this.f1049q = d0Var;
    }

    @Override // H2.d0
    public final boolean g() {
        if (!this.f1051s.b() && this.f1049q.g()) {
            return true;
        }
        return false;
    }

    @Override // H2.d0
    public final int k(androidx.fragment.app.D d, i2.g gVar, int i7) {
        C0004e c0004e = this.f1051s;
        if (c0004e.b()) {
            return -3;
        }
        if (this.f1050r) {
            gVar.f11331r = 4;
            return -4;
        }
        long m7 = c0004e.m();
        int k5 = this.f1049q.k(d, gVar, i7);
        if (k5 == -5) {
            e2.K k7 = (e2.K) d.f5884s;
            k7.getClass();
            int i8 = k7.f9671S;
            int i9 = k7.f9670R;
            if (i9 != 0 || i8 != 0) {
                if (c0004e.f1056u != 0) {
                    i9 = 0;
                }
                if (c0004e.f1057v != Long.MIN_VALUE) {
                    i8 = 0;
                }
                C0593J a7 = k7.a();
                a7.f9592A = i9;
                a7.f9593B = i8;
                d.f5884s = a7.a();
            }
            return -5;
        }
        long j7 = c0004e.f1057v;
        if (j7 != Long.MIN_VALUE && ((k5 == -4 && gVar.f11353v >= j7) || (k5 == -3 && m7 == Long.MIN_VALUE && !gVar.f11352u))) {
            gVar.f();
            gVar.f11331r = 4;
            this.f1050r = true;
            return -4;
        }
        return k5;
    }

    @Override // H2.d0
    public final void w() {
        this.f1049q.w();
    }

    @Override // H2.d0
    public final int x(long j7) {
        if (this.f1051s.b()) {
            return -3;
        }
        return this.f1049q.x(j7);
    }
}
