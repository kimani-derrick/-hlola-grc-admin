package w0;
/* renamed from: w0.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1352f implements F {

    /* renamed from: q  reason: collision with root package name */
    public final F f15531q;

    /* renamed from: r  reason: collision with root package name */
    public int f15532r = 0;

    /* renamed from: s  reason: collision with root package name */
    public int f15533s = -1;

    /* renamed from: t  reason: collision with root package name */
    public int f15534t = -1;

    /* renamed from: u  reason: collision with root package name */
    public Object f15535u = null;

    public C1352f(F f) {
        this.f15531q = f;
    }

    public final void a() {
        int i7 = this.f15532r;
        if (i7 == 0) {
            return;
        }
        F f = this.f15531q;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 == 3) {
                    f.m(this.f15533s, this.f15534t, this.f15535u);
                }
            } else {
                f.h(this.f15533s, this.f15534t);
            }
        } else {
            f.i(this.f15533s, this.f15534t);
        }
        this.f15535u = null;
        this.f15532r = 0;
    }

    @Override // w0.F
    public final void h(int i7, int i8) {
        int i9;
        if (this.f15532r == 2 && (i9 = this.f15533s) >= i7 && i9 <= i7 + i8) {
            this.f15534t += i8;
            this.f15533s = i7;
            return;
        }
        a();
        this.f15533s = i7;
        this.f15534t = i8;
        this.f15532r = 2;
    }

    @Override // w0.F
    public final void i(int i7, int i8) {
        int i9;
        if (this.f15532r == 1 && i7 >= (i9 = this.f15533s)) {
            int i10 = this.f15534t;
            if (i7 <= i9 + i10) {
                this.f15534t = i10 + i8;
                this.f15533s = Math.min(i7, i9);
                return;
            }
        }
        a();
        this.f15533s = i7;
        this.f15534t = i8;
        this.f15532r = 1;
    }

    @Override // w0.F
    public final void j(int i7, int i8) {
        a();
        this.f15531q.j(i7, i8);
    }

    @Override // w0.F
    public final void m(int i7, int i8, Object obj) {
        int i9;
        if (this.f15532r == 3) {
            int i10 = this.f15533s;
            int i11 = this.f15534t;
            if (i7 <= i10 + i11 && (i9 = i7 + i8) >= i10 && this.f15535u == obj) {
                this.f15533s = Math.min(i7, i10);
                this.f15534t = Math.max(i11 + i10, i9) - this.f15533s;
                return;
            }
        }
        a();
        this.f15533s = i7;
        this.f15534t = i8;
        this.f15535u = obj;
        this.f15532r = 3;
    }
}
