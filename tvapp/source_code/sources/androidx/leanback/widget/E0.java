package androidx.leanback.widget;

import androidx.datastore.preferences.protobuf.C0230i;
/* loaded from: classes.dex */
public final class E0 extends r {

    /* renamed from: j  reason: collision with root package name */
    public final B4.b f6363j = new B4.b(0);

    public E0() {
        n(1);
    }

    @Override // androidx.leanback.widget.r
    public final boolean b(int i7, boolean z7) {
        int i8;
        int i9;
        if (this.f6642b.r() == 0) {
            return false;
        }
        if (!z7 && c(i7)) {
            return false;
        }
        int i10 = this.f6645g;
        if (i10 >= 0) {
            i8 = i10 + 1;
        } else {
            int i11 = this.f6647i;
            if (i11 != -1) {
                i8 = Math.min(i11, this.f6642b.r() - 1);
            } else {
                i8 = 0;
            }
        }
        boolean z8 = false;
        while (i8 < this.f6642b.r()) {
            Z5.n nVar = this.f6642b;
            Object[] objArr = this.f6641a;
            int q5 = nVar.q(i8, true, objArr, false);
            if (this.f >= 0 && this.f6645g >= 0) {
                if (this.f6643c) {
                    int i12 = i8 - 1;
                    i9 = (this.f6642b.s(i12) - this.f6642b.u(i12)) - this.d;
                } else {
                    int i13 = i8 - 1;
                    i9 = this.d + this.f6642b.u(i13) + this.f6642b.s(i13);
                }
            } else {
                if (this.f6643c) {
                    i9 = Integer.MAX_VALUE;
                } else {
                    i9 = Integer.MIN_VALUE;
                }
                this.f = i8;
            }
            this.f6645g = i8;
            this.f6642b.o(objArr[0], i8, q5, 0, i9);
            if (z7 || c(i7)) {
                return true;
            }
            i8++;
            z8 = true;
        }
        return z8;
    }

    @Override // androidx.leanback.widget.r
    public final void e(int i7, int i8, C0230i c0230i) {
        int o7;
        int i9;
        int i10;
        if (!this.f6643c ? i8 < 0 : i8 > 0) {
            if (this.f == 0) {
                return;
            }
            o7 = o();
            int s6 = this.f6642b.s(this.f);
            if (this.f6643c) {
                i9 = this.d;
            } else {
                i9 = -this.d;
            }
            i10 = s6 + i9;
        } else if (this.f6645g == this.f6642b.r() - 1) {
            return;
        } else {
            int i11 = this.f6645g;
            if (i11 >= 0) {
                o7 = i11 + 1;
            } else {
                int i12 = this.f6647i;
                if (i12 != -1) {
                    o7 = Math.min(i12, this.f6642b.r() - 1);
                } else {
                    o7 = 0;
                }
            }
            int u7 = this.f6642b.u(this.f6645g) + this.d;
            int s7 = this.f6642b.s(this.f6645g);
            if (this.f6643c) {
                u7 = -u7;
            }
            i10 = u7 + s7;
        }
        c0230i.b(o7, Math.abs(i10 - i7));
    }

    @Override // androidx.leanback.widget.r
    public final int f(int i7, boolean z7, int[] iArr) {
        if (iArr != null) {
            iArr[0] = 0;
            iArr[1] = i7;
        }
        if (this.f6643c) {
            return this.f6642b.s(i7);
        }
        return this.f6642b.u(i7) + this.f6642b.s(i7);
    }

    @Override // androidx.leanback.widget.r
    public final int h(int i7, boolean z7, int[] iArr) {
        if (iArr != null) {
            iArr[0] = 0;
            iArr[1] = i7;
        }
        if (this.f6643c) {
            return this.f6642b.s(i7) - this.f6642b.u(i7);
        }
        return this.f6642b.s(i7);
    }

    @Override // androidx.leanback.widget.r
    public final O2.e[] j(int i7, int i8) {
        O2.e eVar = this.f6646h[0];
        eVar.f2559a = 0;
        eVar.d(i7);
        this.f6646h[0].d(i8);
        return this.f6646h;
    }

    @Override // androidx.leanback.widget.r
    public final B4.b k(int i7) {
        return this.f6363j;
    }

    @Override // androidx.leanback.widget.r
    public final boolean m(int i7, boolean z7) {
        int i8;
        if (this.f6642b.r() == 0) {
            return false;
        }
        if (!z7 && d(i7)) {
            return false;
        }
        int i9 = ((C0321y) this.f6642b.f4918q).f6707u;
        boolean z8 = false;
        for (int o7 = o(); o7 >= i9; o7--) {
            Z5.n nVar = this.f6642b;
            Object[] objArr = this.f6641a;
            int q5 = nVar.q(o7, false, objArr, false);
            if (this.f >= 0 && this.f6645g >= 0) {
                if (this.f6643c) {
                    i8 = this.f6642b.s(o7 + 1) + this.d + q5;
                } else {
                    i8 = (this.f6642b.s(o7 + 1) - this.d) - q5;
                }
                this.f = o7;
            } else {
                if (this.f6643c) {
                    i8 = Integer.MIN_VALUE;
                } else {
                    i8 = Integer.MAX_VALUE;
                }
                this.f = o7;
                this.f6645g = o7;
            }
            this.f6642b.o(objArr[0], o7, q5, 0, i8);
            z8 = true;
            if (z7 || d(i7)) {
                break;
            }
        }
        return z8;
    }

    public final int o() {
        int i7 = this.f;
        if (i7 >= 0) {
            return i7 - 1;
        }
        int i8 = this.f6647i;
        return i8 != -1 ? Math.min(i8, this.f6642b.r() - 1) : this.f6642b.r() - 1;
    }
}
