package v;

import android.view.ViewGroup;
import t.C1218d;
/* renamed from: v.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1303d extends ViewGroup.MarginLayoutParams {

    /* renamed from: A  reason: collision with root package name */
    public float f15093A;

    /* renamed from: B  reason: collision with root package name */
    public String f15094B;

    /* renamed from: C  reason: collision with root package name */
    public int f15095C;

    /* renamed from: D  reason: collision with root package name */
    public float f15096D;

    /* renamed from: E  reason: collision with root package name */
    public float f15097E;
    public int F;

    /* renamed from: G  reason: collision with root package name */
    public int f15098G;

    /* renamed from: H  reason: collision with root package name */
    public int f15099H;

    /* renamed from: I  reason: collision with root package name */
    public int f15100I;

    /* renamed from: J  reason: collision with root package name */
    public int f15101J;

    /* renamed from: K  reason: collision with root package name */
    public int f15102K;

    /* renamed from: L  reason: collision with root package name */
    public int f15103L;

    /* renamed from: M  reason: collision with root package name */
    public int f15104M;

    /* renamed from: N  reason: collision with root package name */
    public float f15105N;

    /* renamed from: O  reason: collision with root package name */
    public float f15106O;

    /* renamed from: P  reason: collision with root package name */
    public int f15107P;

    /* renamed from: Q  reason: collision with root package name */
    public int f15108Q;

    /* renamed from: R  reason: collision with root package name */
    public int f15109R;

    /* renamed from: S  reason: collision with root package name */
    public boolean f15110S;

    /* renamed from: T  reason: collision with root package name */
    public boolean f15111T;

    /* renamed from: U  reason: collision with root package name */
    public String f15112U;

    /* renamed from: V  reason: collision with root package name */
    public boolean f15113V;
    public boolean W;

    /* renamed from: X  reason: collision with root package name */
    public boolean f15114X;

    /* renamed from: Y  reason: collision with root package name */
    public boolean f15115Y;

    /* renamed from: Z  reason: collision with root package name */
    public boolean f15116Z;

    /* renamed from: a  reason: collision with root package name */
    public int f15117a;

    /* renamed from: a0  reason: collision with root package name */
    public int f15118a0;

    /* renamed from: b  reason: collision with root package name */
    public int f15119b;

    /* renamed from: b0  reason: collision with root package name */
    public int f15120b0;

    /* renamed from: c  reason: collision with root package name */
    public float f15121c;

    /* renamed from: c0  reason: collision with root package name */
    public int f15122c0;
    public int d;

    /* renamed from: d0  reason: collision with root package name */
    public int f15123d0;

    /* renamed from: e  reason: collision with root package name */
    public int f15124e;

    /* renamed from: e0  reason: collision with root package name */
    public int f15125e0;
    public int f;

    /* renamed from: f0  reason: collision with root package name */
    public int f15126f0;

    /* renamed from: g  reason: collision with root package name */
    public int f15127g;

    /* renamed from: g0  reason: collision with root package name */
    public float f15128g0;

    /* renamed from: h  reason: collision with root package name */
    public int f15129h;

    /* renamed from: h0  reason: collision with root package name */
    public int f15130h0;

    /* renamed from: i  reason: collision with root package name */
    public int f15131i;

    /* renamed from: i0  reason: collision with root package name */
    public int f15132i0;

    /* renamed from: j  reason: collision with root package name */
    public int f15133j;

    /* renamed from: j0  reason: collision with root package name */
    public float f15134j0;

    /* renamed from: k  reason: collision with root package name */
    public int f15135k;

    /* renamed from: k0  reason: collision with root package name */
    public C1218d f15136k0;

    /* renamed from: l  reason: collision with root package name */
    public int f15137l;

    /* renamed from: m  reason: collision with root package name */
    public int f15138m;
    public int n;

    /* renamed from: o  reason: collision with root package name */
    public float f15139o;

    /* renamed from: p  reason: collision with root package name */
    public int f15140p;

    /* renamed from: q  reason: collision with root package name */
    public int f15141q;

    /* renamed from: r  reason: collision with root package name */
    public int f15142r;

    /* renamed from: s  reason: collision with root package name */
    public int f15143s;

    /* renamed from: t  reason: collision with root package name */
    public int f15144t;

    /* renamed from: u  reason: collision with root package name */
    public int f15145u;

    /* renamed from: v  reason: collision with root package name */
    public int f15146v;

    /* renamed from: w  reason: collision with root package name */
    public int f15147w;

    /* renamed from: x  reason: collision with root package name */
    public int f15148x;

    /* renamed from: y  reason: collision with root package name */
    public int f15149y;

    /* renamed from: z  reason: collision with root package name */
    public float f15150z;

    public final void a() {
        this.f15115Y = false;
        this.f15113V = true;
        this.W = true;
        int i7 = ((ViewGroup.MarginLayoutParams) this).width;
        if (i7 == -2 && this.f15110S) {
            this.f15113V = false;
            if (this.f15099H == 0) {
                this.f15099H = 1;
            }
        }
        int i8 = ((ViewGroup.MarginLayoutParams) this).height;
        if (i8 == -2 && this.f15111T) {
            this.W = false;
            if (this.f15100I == 0) {
                this.f15100I = 1;
            }
        }
        if (i7 == 0 || i7 == -1) {
            this.f15113V = false;
            if (i7 == 0 && this.f15099H == 1) {
                ((ViewGroup.MarginLayoutParams) this).width = -2;
                this.f15110S = true;
            }
        }
        if (i8 == 0 || i8 == -1) {
            this.W = false;
            if (i8 == 0 && this.f15100I == 1) {
                ((ViewGroup.MarginLayoutParams) this).height = -2;
                this.f15111T = true;
            }
        }
        if (this.f15121c != -1.0f || this.f15117a != -1 || this.f15119b != -1) {
            this.f15115Y = true;
            this.f15113V = true;
            this.W = true;
            if (!(this.f15136k0 instanceof t.f)) {
                this.f15136k0 = new t.f();
            }
            ((t.f) this.f15136k0).y(this.f15109R);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x00ca, code lost:
        if (r1 > 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00cc, code lost:
        ((android.view.ViewGroup.MarginLayoutParams) r9).rightMargin = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00d9, code lost:
        if (r1 > 0) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00eb  */
    @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void resolveLayoutDirection(int r10) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v.C1303d.resolveLayoutDirection(int):void");
    }
}
