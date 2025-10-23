package M2;

import Z2.AbstractC0156a;
import Z2.H;
import android.graphics.Bitmap;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import e2.InterfaceC0604f;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class b implements InterfaceC0604f {

    /* renamed from: H  reason: collision with root package name */
    public static final b f2219H = new b("", null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);

    /* renamed from: I  reason: collision with root package name */
    public static final String f2220I;

    /* renamed from: J  reason: collision with root package name */
    public static final String f2221J;

    /* renamed from: K  reason: collision with root package name */
    public static final String f2222K;

    /* renamed from: L  reason: collision with root package name */
    public static final String f2223L;

    /* renamed from: M  reason: collision with root package name */
    public static final String f2224M;

    /* renamed from: N  reason: collision with root package name */
    public static final String f2225N;

    /* renamed from: O  reason: collision with root package name */
    public static final String f2226O;

    /* renamed from: P  reason: collision with root package name */
    public static final String f2227P;

    /* renamed from: Q  reason: collision with root package name */
    public static final String f2228Q;

    /* renamed from: R  reason: collision with root package name */
    public static final String f2229R;

    /* renamed from: S  reason: collision with root package name */
    public static final String f2230S;

    /* renamed from: T  reason: collision with root package name */
    public static final String f2231T;

    /* renamed from: U  reason: collision with root package name */
    public static final String f2232U;

    /* renamed from: V  reason: collision with root package name */
    public static final String f2233V;
    public static final String W;

    /* renamed from: X  reason: collision with root package name */
    public static final String f2234X;

    /* renamed from: Y  reason: collision with root package name */
    public static final String f2235Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final A4.a f2236Z;

    /* renamed from: A  reason: collision with root package name */
    public final float f2237A;

    /* renamed from: B  reason: collision with root package name */
    public final boolean f2238B;

    /* renamed from: C  reason: collision with root package name */
    public final int f2239C;

    /* renamed from: D  reason: collision with root package name */
    public final int f2240D;

    /* renamed from: E  reason: collision with root package name */
    public final float f2241E;
    public final int F;

    /* renamed from: G  reason: collision with root package name */
    public final float f2242G;

    /* renamed from: q  reason: collision with root package name */
    public final CharSequence f2243q;

    /* renamed from: r  reason: collision with root package name */
    public final Layout.Alignment f2244r;

    /* renamed from: s  reason: collision with root package name */
    public final Layout.Alignment f2245s;

    /* renamed from: t  reason: collision with root package name */
    public final Bitmap f2246t;

    /* renamed from: u  reason: collision with root package name */
    public final float f2247u;

    /* renamed from: v  reason: collision with root package name */
    public final int f2248v;

    /* renamed from: w  reason: collision with root package name */
    public final int f2249w;

    /* renamed from: x  reason: collision with root package name */
    public final float f2250x;

    /* renamed from: y  reason: collision with root package name */
    public final int f2251y;

    /* renamed from: z  reason: collision with root package name */
    public final float f2252z;

    static {
        int i7 = H.f4603a;
        f2220I = Integer.toString(0, 36);
        f2221J = Integer.toString(1, 36);
        f2222K = Integer.toString(2, 36);
        f2223L = Integer.toString(3, 36);
        f2224M = Integer.toString(4, 36);
        f2225N = Integer.toString(5, 36);
        f2226O = Integer.toString(6, 36);
        f2227P = Integer.toString(7, 36);
        f2228Q = Integer.toString(8, 36);
        f2229R = Integer.toString(9, 36);
        f2230S = Integer.toString(10, 36);
        f2231T = Integer.toString(11, 36);
        f2232U = Integer.toString(12, 36);
        f2233V = Integer.toString(13, 36);
        W = Integer.toString(14, 36);
        f2234X = Integer.toString(15, 36);
        f2235Y = Integer.toString(16, 36);
        f2236Z = new A4.a(9);
    }

    public b(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f, int i7, int i8, float f7, int i9, int i10, float f8, float f9, float f10, boolean z7, int i11, int i12, float f11) {
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            AbstractC0156a.f(bitmap == null);
        }
        this.f2243q = charSequence instanceof Spanned ? SpannedString.valueOf(charSequence) : charSequence != null ? charSequence.toString() : null;
        this.f2244r = alignment;
        this.f2245s = alignment2;
        this.f2246t = bitmap;
        this.f2247u = f;
        this.f2248v = i7;
        this.f2249w = i8;
        this.f2250x = f7;
        this.f2251y = i9;
        this.f2252z = f9;
        this.f2237A = f10;
        this.f2238B = z7;
        this.f2239C = i11;
        this.f2240D = i10;
        this.f2241E = f8;
        this.F = i12;
        this.f2242G = f11;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, M2.a] */
    public final a a() {
        ?? obj = new Object();
        obj.f2205a = this.f2243q;
        obj.f2206b = this.f2246t;
        obj.f2207c = this.f2244r;
        obj.d = this.f2245s;
        obj.f2208e = this.f2247u;
        obj.f = this.f2248v;
        obj.f2209g = this.f2249w;
        obj.f2210h = this.f2250x;
        obj.f2211i = this.f2251y;
        obj.f2212j = this.f2240D;
        obj.f2213k = this.f2241E;
        obj.f2214l = this.f2252z;
        obj.f2215m = this.f2237A;
        obj.n = this.f2238B;
        obj.f2216o = this.f2239C;
        obj.f2217p = this.F;
        obj.f2218q = this.f2242G;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (TextUtils.equals(this.f2243q, bVar.f2243q) && this.f2244r == bVar.f2244r && this.f2245s == bVar.f2245s) {
            Bitmap bitmap = bVar.f2246t;
            Bitmap bitmap2 = this.f2246t;
            if (bitmap2 != null ? !(bitmap == null || !bitmap2.sameAs(bitmap)) : bitmap == null) {
                if (this.f2247u == bVar.f2247u && this.f2248v == bVar.f2248v && this.f2249w == bVar.f2249w && this.f2250x == bVar.f2250x && this.f2251y == bVar.f2251y && this.f2252z == bVar.f2252z && this.f2237A == bVar.f2237A && this.f2238B == bVar.f2238B && this.f2239C == bVar.f2239C && this.f2240D == bVar.f2240D && this.f2241E == bVar.f2241E && this.F == bVar.F && this.f2242G == bVar.f2242G) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2243q, this.f2244r, this.f2245s, this.f2246t, Float.valueOf(this.f2247u), Integer.valueOf(this.f2248v), Integer.valueOf(this.f2249w), Float.valueOf(this.f2250x), Integer.valueOf(this.f2251y), Float.valueOf(this.f2252z), Float.valueOf(this.f2237A), Boolean.valueOf(this.f2238B), Integer.valueOf(this.f2239C), Integer.valueOf(this.f2240D), Float.valueOf(this.f2241E), Integer.valueOf(this.F), Float.valueOf(this.f2242G)});
    }
}
