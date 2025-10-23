package N2;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class e {

    /* renamed from: A  reason: collision with root package name */
    public static final int[] f2443A;

    /* renamed from: B  reason: collision with root package name */
    public static final boolean[] f2444B;

    /* renamed from: C  reason: collision with root package name */
    public static final int[] f2445C;

    /* renamed from: D  reason: collision with root package name */
    public static final int[] f2446D;

    /* renamed from: E  reason: collision with root package name */
    public static final int[] f2447E;
    public static final int[] F;

    /* renamed from: w  reason: collision with root package name */
    public static final int f2448w = c(2, 2, 2, 0);

    /* renamed from: x  reason: collision with root package name */
    public static final int f2449x;

    /* renamed from: y  reason: collision with root package name */
    public static final int[] f2450y;

    /* renamed from: z  reason: collision with root package name */
    public static final int[] f2451z;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f2452a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final SpannableStringBuilder f2453b = new SpannableStringBuilder();

    /* renamed from: c  reason: collision with root package name */
    public boolean f2454c;
    public boolean d;

    /* renamed from: e  reason: collision with root package name */
    public int f2455e;
    public boolean f;

    /* renamed from: g  reason: collision with root package name */
    public int f2456g;

    /* renamed from: h  reason: collision with root package name */
    public int f2457h;

    /* renamed from: i  reason: collision with root package name */
    public int f2458i;

    /* renamed from: j  reason: collision with root package name */
    public int f2459j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f2460k;

    /* renamed from: l  reason: collision with root package name */
    public int f2461l;

    /* renamed from: m  reason: collision with root package name */
    public int f2462m;
    public int n;

    /* renamed from: o  reason: collision with root package name */
    public int f2463o;

    /* renamed from: p  reason: collision with root package name */
    public int f2464p;

    /* renamed from: q  reason: collision with root package name */
    public int f2465q;

    /* renamed from: r  reason: collision with root package name */
    public int f2466r;

    /* renamed from: s  reason: collision with root package name */
    public int f2467s;

    /* renamed from: t  reason: collision with root package name */
    public int f2468t;

    /* renamed from: u  reason: collision with root package name */
    public int f2469u;

    /* renamed from: v  reason: collision with root package name */
    public int f2470v;

    static {
        int c5 = c(0, 0, 0, 0);
        f2449x = c5;
        int c6 = c(0, 0, 0, 3);
        f2450y = new int[]{0, 0, 0, 0, 0, 2, 0};
        f2451z = new int[]{0, 0, 0, 0, 0, 0, 2};
        f2443A = new int[]{3, 3, 3, 3, 3, 3, 1};
        f2444B = new boolean[]{false, false, false, true, true, true, false};
        f2445C = new int[]{c5, c6, c5, c5, c6, c5, c5};
        f2446D = new int[]{0, 1, 2, 3, 4, 3, 4};
        f2447E = new int[]{0, 0, 0, 0, 0, 3, 3};
        F = new int[]{c5, c5, c5, c5, c5, c6, c6};
    }

    public e() {
        d();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int c(int r4, int r5, int r6, int r7) {
        /*
            r0 = 4
            Z2.AbstractC0156a.i(r4, r0)
            Z2.AbstractC0156a.i(r5, r0)
            Z2.AbstractC0156a.i(r6, r0)
            Z2.AbstractC0156a.i(r7, r0)
            r0 = 0
            r1 = 1
            r2 = 255(0xff, float:3.57E-43)
            if (r7 == 0) goto L1b
            if (r7 == r1) goto L1b
            r3 = 2
            if (r7 == r3) goto L1f
            r3 = 3
            if (r7 == r3) goto L1d
        L1b:
            r7 = r2
            goto L21
        L1d:
            r7 = r0
            goto L21
        L1f:
            r7 = 127(0x7f, float:1.78E-43)
        L21:
            if (r4 <= r1) goto L25
            r4 = r2
            goto L26
        L25:
            r4 = r0
        L26:
            if (r5 <= r1) goto L2a
            r5 = r2
            goto L2b
        L2a:
            r5 = r0
        L2b:
            if (r6 <= r1) goto L2e
            r0 = r2
        L2e:
            int r4 = android.graphics.Color.argb(r7, r4, r5, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: N2.e.c(int, int, int, int):int");
    }

    public final void a(char c5) {
        SpannableStringBuilder spannableStringBuilder = this.f2453b;
        if (c5 == '\n') {
            ArrayList arrayList = this.f2452a;
            arrayList.add(b());
            spannableStringBuilder.clear();
            if (this.f2464p != -1) {
                this.f2464p = 0;
            }
            if (this.f2465q != -1) {
                this.f2465q = 0;
            }
            if (this.f2466r != -1) {
                this.f2466r = 0;
            }
            if (this.f2468t != -1) {
                this.f2468t = 0;
            }
            while (true) {
                if ((this.f2460k && arrayList.size() >= this.f2459j) || arrayList.size() >= 15) {
                    arrayList.remove(0);
                } else {
                    return;
                }
            }
        } else {
            spannableStringBuilder.append(c5);
        }
    }

    public final SpannableString b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f2453b);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.f2464p != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f2464p, length, 33);
            }
            if (this.f2465q != -1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f2465q, length, 33);
            }
            if (this.f2466r != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f2467s), this.f2466r, length, 33);
            }
            if (this.f2468t != -1) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f2469u), this.f2468t, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final void d() {
        this.f2452a.clear();
        this.f2453b.clear();
        this.f2464p = -1;
        this.f2465q = -1;
        this.f2466r = -1;
        this.f2468t = -1;
        this.f2470v = 0;
        this.f2454c = false;
        this.d = false;
        this.f2455e = 4;
        this.f = false;
        this.f2456g = 0;
        this.f2457h = 0;
        this.f2458i = 0;
        this.f2459j = 15;
        this.f2460k = true;
        this.f2461l = 0;
        this.f2462m = 0;
        this.n = 0;
        int i7 = f2449x;
        this.f2463o = i7;
        this.f2467s = f2448w;
        this.f2469u = i7;
    }

    public final void e(boolean z7, boolean z8) {
        int i7 = this.f2464p;
        SpannableStringBuilder spannableStringBuilder = this.f2453b;
        if (i7 != -1) {
            if (!z7) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f2464p, spannableStringBuilder.length(), 33);
                this.f2464p = -1;
            }
        } else if (z7) {
            this.f2464p = spannableStringBuilder.length();
        }
        if (this.f2465q != -1) {
            if (!z8) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f2465q, spannableStringBuilder.length(), 33);
                this.f2465q = -1;
            }
        } else if (z8) {
            this.f2465q = spannableStringBuilder.length();
        }
    }

    public final void f(int i7, int i8) {
        int i9 = this.f2466r;
        SpannableStringBuilder spannableStringBuilder = this.f2453b;
        if (i9 != -1 && this.f2467s != i7) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f2467s), this.f2466r, spannableStringBuilder.length(), 33);
        }
        if (i7 != f2448w) {
            this.f2466r = spannableStringBuilder.length();
            this.f2467s = i7;
        }
        if (this.f2468t != -1 && this.f2469u != i8) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f2469u), this.f2468t, spannableStringBuilder.length(), 33);
        }
        if (i8 != f2449x) {
            this.f2468t = spannableStringBuilder.length();
            this.f2469u = i8;
        }
    }
}
