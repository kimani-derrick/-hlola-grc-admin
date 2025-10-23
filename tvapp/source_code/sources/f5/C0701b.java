package f5;

import M5.g;
import d5.r;
import d5.s;
/* renamed from: f5.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0701b {

    /* renamed from: a  reason: collision with root package name */
    public int f10434a;

    /* renamed from: b  reason: collision with root package name */
    public int f10435b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f10436c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public int f10437e;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public int f10438g;

    /* renamed from: h  reason: collision with root package name */
    public int f10439h;

    public static boolean d(int i7) {
        if (i7 != Integer.MIN_VALUE && i7 != Integer.MAX_VALUE) {
            return false;
        }
        return true;
    }

    public static boolean e(s sVar) {
        if (!sVar.f9286u) {
            if (sVar.f9282q != r.f9277q) {
                return false;
            }
        }
        return true;
    }

    public final int a(s sVar) {
        int i7;
        g.f(sVar, "alignment");
        boolean z7 = this.f10436c;
        float f = sVar.f9284s;
        boolean z8 = sVar.f9285t;
        int i8 = sVar.f9283r;
        if (!z7) {
            if (z8) {
                i7 = (int) (this.d * f);
            } else {
                i7 = 0;
            }
            return i7 + i8;
        }
        int i9 = this.d;
        if (z8) {
            i9 = (int) ((1.0f - f) * i9);
        }
        return i9 - i8;
    }

    public final int b() {
        return this.d - this.f;
    }

    public final boolean c() {
        int i7;
        if (d(this.f10438g) && d(this.f10439h)) {
            return true;
        }
        if (!this.f10436c) {
            if (this.f10439h <= this.f10437e && (this.f10438g >= b() || d(this.f10438g))) {
                return true;
            }
        } else if (this.f10438g >= b() && ((i7 = this.f10439h) <= this.f10437e || d(i7))) {
            return true;
        }
        return false;
    }

    public final boolean f(int i7, int i8, s sVar) {
        boolean z7;
        if (d(this.f10438g)) {
            return false;
        }
        r rVar = sVar.f9282q;
        if (rVar != r.f9280t && (((z7 = this.f10436c) || rVar != r.f9279s) && (!z7 || rVar != r.f9278r))) {
            return false;
        }
        if (c()) {
            if (b() + i7 < this.f10438g + i8) {
                return false;
            }
            return true;
        }
        if (!this.f10436c) {
            if (d(this.f10439h)) {
                return false;
            }
        } else if (d(this.f10438g)) {
            return false;
        }
        if (e(sVar)) {
            return false;
        }
        return true;
    }

    public final boolean g(int i7, int i8, s sVar) {
        boolean z7;
        if (d(this.f10439h)) {
            return false;
        }
        r rVar = sVar.f9282q;
        if (rVar != r.f9280t && (((z7 = this.f10436c) || rVar != r.f9278r) && (!z7 || rVar != r.f9279s))) {
            return false;
        }
        if (c()) {
            if (i7 + this.f10437e > this.f10439h + i8) {
                return false;
            }
            return true;
        }
        if (!this.f10436c) {
            if (d(this.f10439h)) {
                return false;
            }
        } else if (d(this.f10438g)) {
            return false;
        }
        if (e(sVar)) {
            return false;
        }
        return true;
    }

    public final void h(int i7, int i8, int i9, int i10, s sVar) {
        int i11;
        boolean z7;
        boolean z8;
        g.f(sVar, "alignment");
        this.f10439h = i7;
        this.f10438g = i8;
        int a7 = a(sVar);
        boolean d = d(this.f10439h);
        r rVar = r.f9279s;
        r rVar2 = r.f9278r;
        r rVar3 = r.f9280t;
        int i12 = 0;
        r rVar4 = sVar.f9282q;
        if (d) {
            i11 = Integer.MIN_VALUE;
        } else if (g(i9, a7, sVar)) {
            i11 = i7 - this.f10437e;
        } else if ((rVar4 != rVar3 && (((z7 = this.f10436c) || rVar4 != rVar2) && (!z7 || rVar4 != rVar))) || e(sVar)) {
            i11 = i9 - a7;
        } else {
            i11 = 0;
        }
        this.f10434a = i11;
        if (d(this.f10438g)) {
            i12 = Integer.MAX_VALUE;
        } else if (f(i10, a7, sVar)) {
            i12 = i8 - b();
        } else if ((rVar4 != rVar3 && (((z8 = this.f10436c) || rVar4 != rVar) && (!z8 || rVar4 != rVar2))) || e(sVar)) {
            i12 = i10 - a7;
        }
        this.f10435b = i12;
    }
}
