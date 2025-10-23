package S0;

import W5.AbstractC0113u;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.drawable.Drawable;
import android.os.Build;
import coil.target.GenericViewTarget;
import java.util.Arrays;
import java.util.List;
import z5.C1524f;
/* loaded from: classes.dex */
public final class g {

    /* renamed from: A  reason: collision with root package name */
    public final Integer f3005A;

    /* renamed from: B  reason: collision with root package name */
    public final Drawable f3006B;

    /* renamed from: C  reason: collision with root package name */
    public final Integer f3007C;

    /* renamed from: D  reason: collision with root package name */
    public final Drawable f3008D;

    /* renamed from: E  reason: collision with root package name */
    public final Integer f3009E;
    public final Drawable F;

    /* renamed from: G  reason: collision with root package name */
    public final b f3010G;

    /* renamed from: H  reason: collision with root package name */
    public final a f3011H;

    /* renamed from: I  reason: collision with root package name */
    public final int f3012I;

    /* renamed from: J  reason: collision with root package name */
    public final int f3013J;

    /* renamed from: K  reason: collision with root package name */
    public final int f3014K;

    /* renamed from: L  reason: collision with root package name */
    public final int f3015L;

    /* renamed from: M  reason: collision with root package name */
    public final int f3016M;

    /* renamed from: a  reason: collision with root package name */
    public final Context f3017a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f3018b;

    /* renamed from: c  reason: collision with root package name */
    public final GenericViewTarget f3019c;
    public final J0.c d;

    /* renamed from: e  reason: collision with root package name */
    public final Q0.b f3020e;
    public final String f;

    /* renamed from: g  reason: collision with root package name */
    public final Bitmap.Config f3021g;

    /* renamed from: h  reason: collision with root package name */
    public final ColorSpace f3022h;

    /* renamed from: i  reason: collision with root package name */
    public final C1524f f3023i;

    /* renamed from: j  reason: collision with root package name */
    public final K0.c f3024j;

    /* renamed from: k  reason: collision with root package name */
    public final List f3025k;

    /* renamed from: l  reason: collision with root package name */
    public final W0.a f3026l;

    /* renamed from: m  reason: collision with root package name */
    public final h6.r f3027m;
    public final p n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f3028o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f3029p;

    /* renamed from: q  reason: collision with root package name */
    public final boolean f3030q;

    /* renamed from: r  reason: collision with root package name */
    public final boolean f3031r;

    /* renamed from: s  reason: collision with root package name */
    public final AbstractC0113u f3032s;

    /* renamed from: t  reason: collision with root package name */
    public final AbstractC0113u f3033t;

    /* renamed from: u  reason: collision with root package name */
    public final AbstractC0113u f3034u;

    /* renamed from: v  reason: collision with root package name */
    public final AbstractC0113u f3035v;

    /* renamed from: w  reason: collision with root package name */
    public final P1.c f3036w;

    /* renamed from: x  reason: collision with root package name */
    public final T0.g f3037x;

    /* renamed from: y  reason: collision with root package name */
    public final m f3038y;

    /* renamed from: z  reason: collision with root package name */
    public final Q0.b f3039z;

    public g(Context context, Object obj, GenericViewTarget genericViewTarget, J0.c cVar, Q0.b bVar, String str, Bitmap.Config config, ColorSpace colorSpace, int i7, C1524f c1524f, K0.c cVar2, List list, W0.a aVar, h6.r rVar, p pVar, boolean z7, boolean z8, boolean z9, boolean z10, int i8, int i9, int i10, AbstractC0113u abstractC0113u, AbstractC0113u abstractC0113u2, AbstractC0113u abstractC0113u3, AbstractC0113u abstractC0113u4, P1.c cVar3, T0.g gVar, int i11, m mVar, Q0.b bVar2, Integer num, Drawable drawable, Integer num2, Drawable drawable2, Integer num3, Drawable drawable3, b bVar3, a aVar2) {
        this.f3017a = context;
        this.f3018b = obj;
        this.f3019c = genericViewTarget;
        this.d = cVar;
        this.f3020e = bVar;
        this.f = str;
        this.f3021g = config;
        this.f3022h = colorSpace;
        this.f3012I = i7;
        this.f3023i = c1524f;
        this.f3024j = cVar2;
        this.f3025k = list;
        this.f3026l = aVar;
        this.f3027m = rVar;
        this.n = pVar;
        this.f3028o = z7;
        this.f3029p = z8;
        this.f3030q = z9;
        this.f3031r = z10;
        this.f3013J = i8;
        this.f3014K = i9;
        this.f3015L = i10;
        this.f3032s = abstractC0113u;
        this.f3033t = abstractC0113u2;
        this.f3034u = abstractC0113u3;
        this.f3035v = abstractC0113u4;
        this.f3036w = cVar3;
        this.f3037x = gVar;
        this.f3016M = i11;
        this.f3038y = mVar;
        this.f3039z = bVar2;
        this.f3005A = num;
        this.f3006B = drawable;
        this.f3007C = num2;
        this.f3008D = drawable2;
        this.f3009E = num3;
        this.F = drawable3;
        this.f3010G = bVar3;
        this.f3011H = aVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (M5.g.a(this.f3017a, gVar.f3017a) && M5.g.a(this.f3018b, gVar.f3018b) && M5.g.a(this.f3019c, gVar.f3019c) && M5.g.a(this.d, gVar.d) && M5.g.a(this.f3020e, gVar.f3020e) && M5.g.a(this.f, gVar.f) && this.f3021g == gVar.f3021g && ((Build.VERSION.SDK_INT < 26 || M5.g.a(this.f3022h, gVar.f3022h)) && this.f3012I == gVar.f3012I && M5.g.a(this.f3023i, gVar.f3023i) && M5.g.a(this.f3024j, gVar.f3024j) && M5.g.a(this.f3025k, gVar.f3025k) && M5.g.a(this.f3026l, gVar.f3026l) && M5.g.a(this.f3027m, gVar.f3027m) && M5.g.a(this.n, gVar.n) && this.f3028o == gVar.f3028o && this.f3029p == gVar.f3029p && this.f3030q == gVar.f3030q && this.f3031r == gVar.f3031r && this.f3013J == gVar.f3013J && this.f3014K == gVar.f3014K && this.f3015L == gVar.f3015L && M5.g.a(this.f3032s, gVar.f3032s) && M5.g.a(this.f3033t, gVar.f3033t) && M5.g.a(this.f3034u, gVar.f3034u) && M5.g.a(this.f3035v, gVar.f3035v) && M5.g.a(this.f3039z, gVar.f3039z) && M5.g.a(this.f3005A, gVar.f3005A) && M5.g.a(this.f3006B, gVar.f3006B) && M5.g.a(this.f3007C, gVar.f3007C) && M5.g.a(this.f3008D, gVar.f3008D) && M5.g.a(this.f3009E, gVar.f3009E) && M5.g.a(this.F, gVar.F) && M5.g.a(this.f3036w, gVar.f3036w) && M5.g.a(this.f3037x, gVar.f3037x) && this.f3016M == gVar.f3016M && M5.g.a(this.f3038y, gVar.f3038y) && M5.g.a(this.f3010G, gVar.f3010G) && M5.g.a(this.f3011H, gVar.f3011H))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int hashCode = (this.f3018b.hashCode() + (this.f3017a.hashCode() * 31)) * 31;
        int i23 = 0;
        GenericViewTarget genericViewTarget = this.f3019c;
        if (genericViewTarget != null) {
            i7 = genericViewTarget.hashCode();
        } else {
            i7 = 0;
        }
        int i24 = (hashCode + i7) * 31;
        J0.c cVar = this.d;
        if (cVar != null) {
            i8 = cVar.hashCode();
        } else {
            i8 = 0;
        }
        int i25 = (i24 + i8) * 31;
        Q0.b bVar = this.f3020e;
        if (bVar != null) {
            i9 = bVar.hashCode();
        } else {
            i9 = 0;
        }
        int i26 = (i25 + i9) * 31;
        String str = this.f;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int hashCode2 = (this.f3021g.hashCode() + ((i26 + i10) * 31)) * 31;
        ColorSpace colorSpace = this.f3022h;
        if (colorSpace != null) {
            i11 = colorSpace.hashCode();
        } else {
            i11 = 0;
        }
        int b7 = (s.h.b(this.f3012I) + ((hashCode2 + i11) * 31)) * 31;
        C1524f c1524f = this.f3023i;
        if (c1524f != null) {
            i12 = c1524f.hashCode();
        } else {
            i12 = 0;
        }
        int i27 = (b7 + i12) * 31;
        if (this.f3024j != null) {
            i13 = K0.c.class.hashCode();
        } else {
            i13 = 0;
        }
        int hashCode3 = this.f3025k.hashCode();
        this.f3026l.getClass();
        int hashCode4 = (this.n.f3063a.hashCode() + ((((W0.a.class.hashCode() + ((hashCode3 + ((i27 + i13) * 31)) * 31)) * 31) + Arrays.hashCode(this.f3027m.f11195q)) * 31)) * 31;
        int i28 = 1237;
        if (this.f3028o) {
            i14 = 1231;
        } else {
            i14 = 1237;
        }
        int i29 = (hashCode4 + i14) * 31;
        if (this.f3029p) {
            i15 = 1231;
        } else {
            i15 = 1237;
        }
        int i30 = (i29 + i15) * 31;
        if (this.f3030q) {
            i16 = 1231;
        } else {
            i16 = 1237;
        }
        int i31 = (i30 + i16) * 31;
        if (this.f3031r) {
            i28 = 1231;
        }
        int b8 = s.h.b(this.f3013J);
        int b9 = s.h.b(this.f3014K);
        int b10 = s.h.b(this.f3015L);
        int hashCode5 = this.f3032s.hashCode();
        int hashCode6 = this.f3033t.hashCode();
        int hashCode7 = this.f3034u.hashCode();
        int hashCode8 = this.f3035v.hashCode();
        int hashCode9 = this.f3036w.hashCode();
        int hashCode10 = this.f3037x.hashCode();
        int hashCode11 = (this.f3038y.f3056q.hashCode() + ((s.h.b(this.f3016M) + ((hashCode10 + ((hashCode9 + ((hashCode8 + ((hashCode7 + ((hashCode6 + ((hashCode5 + ((b10 + ((b9 + ((b8 + ((i31 + i28) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        Q0.b bVar2 = this.f3039z;
        if (bVar2 != null) {
            i17 = bVar2.hashCode();
        } else {
            i17 = 0;
        }
        int i32 = (hashCode11 + i17) * 31;
        Integer num = this.f3005A;
        if (num != null) {
            i18 = num.hashCode();
        } else {
            i18 = 0;
        }
        int i33 = (i32 + i18) * 31;
        Drawable drawable = this.f3006B;
        if (drawable != null) {
            i19 = drawable.hashCode();
        } else {
            i19 = 0;
        }
        int i34 = (i33 + i19) * 31;
        Integer num2 = this.f3007C;
        if (num2 != null) {
            i20 = num2.hashCode();
        } else {
            i20 = 0;
        }
        int i35 = (i34 + i20) * 31;
        Drawable drawable2 = this.f3008D;
        if (drawable2 != null) {
            i21 = drawable2.hashCode();
        } else {
            i21 = 0;
        }
        int i36 = (i35 + i21) * 31;
        Integer num3 = this.f3009E;
        if (num3 != null) {
            i22 = num3.hashCode();
        } else {
            i22 = 0;
        }
        int i37 = (i36 + i22) * 31;
        Drawable drawable3 = this.F;
        if (drawable3 != null) {
            i23 = drawable3.hashCode();
        }
        return this.f3011H.hashCode() + ((this.f3010G.hashCode() + ((i37 + i23) * 31)) * 31);
    }
}
