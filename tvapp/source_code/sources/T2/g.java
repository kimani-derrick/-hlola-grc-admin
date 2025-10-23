package T2;

import android.text.Layout;
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public String f3311a;

    /* renamed from: b  reason: collision with root package name */
    public int f3312b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f3313c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f3314e;

    /* renamed from: k  reason: collision with root package name */
    public float f3319k;

    /* renamed from: l  reason: collision with root package name */
    public String f3320l;

    /* renamed from: o  reason: collision with root package name */
    public Layout.Alignment f3322o;

    /* renamed from: p  reason: collision with root package name */
    public Layout.Alignment f3323p;

    /* renamed from: r  reason: collision with root package name */
    public b f3325r;
    public int f = -1;

    /* renamed from: g  reason: collision with root package name */
    public int f3315g = -1;

    /* renamed from: h  reason: collision with root package name */
    public int f3316h = -1;

    /* renamed from: i  reason: collision with root package name */
    public int f3317i = -1;

    /* renamed from: j  reason: collision with root package name */
    public int f3318j = -1;

    /* renamed from: m  reason: collision with root package name */
    public int f3321m = -1;
    public int n = -1;

    /* renamed from: q  reason: collision with root package name */
    public int f3324q = -1;

    /* renamed from: s  reason: collision with root package name */
    public float f3326s = Float.MAX_VALUE;

    public final void a(g gVar) {
        int i7;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (gVar != null) {
            if (!this.f3313c && gVar.f3313c) {
                this.f3312b = gVar.f3312b;
                this.f3313c = true;
            }
            if (this.f3316h == -1) {
                this.f3316h = gVar.f3316h;
            }
            if (this.f3317i == -1) {
                this.f3317i = gVar.f3317i;
            }
            if (this.f3311a == null && (str = gVar.f3311a) != null) {
                this.f3311a = str;
            }
            if (this.f == -1) {
                this.f = gVar.f;
            }
            if (this.f3315g == -1) {
                this.f3315g = gVar.f3315g;
            }
            if (this.n == -1) {
                this.n = gVar.n;
            }
            if (this.f3322o == null && (alignment2 = gVar.f3322o) != null) {
                this.f3322o = alignment2;
            }
            if (this.f3323p == null && (alignment = gVar.f3323p) != null) {
                this.f3323p = alignment;
            }
            if (this.f3324q == -1) {
                this.f3324q = gVar.f3324q;
            }
            if (this.f3318j == -1) {
                this.f3318j = gVar.f3318j;
                this.f3319k = gVar.f3319k;
            }
            if (this.f3325r == null) {
                this.f3325r = gVar.f3325r;
            }
            if (this.f3326s == Float.MAX_VALUE) {
                this.f3326s = gVar.f3326s;
            }
            if (!this.f3314e && gVar.f3314e) {
                this.d = gVar.d;
                this.f3314e = true;
            }
            if (this.f3321m == -1 && (i7 = gVar.f3321m) != -1) {
                this.f3321m = i7;
            }
        }
    }
}
