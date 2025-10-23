package S0;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.os.Build;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final Context f3042a;

    /* renamed from: b  reason: collision with root package name */
    public final Bitmap.Config f3043b;

    /* renamed from: c  reason: collision with root package name */
    public final ColorSpace f3044c;
    public final T0.f d;

    /* renamed from: e  reason: collision with root package name */
    public final int f3045e;
    public final boolean f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f3046g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f3047h;

    /* renamed from: i  reason: collision with root package name */
    public final String f3048i;

    /* renamed from: j  reason: collision with root package name */
    public final h6.r f3049j;

    /* renamed from: k  reason: collision with root package name */
    public final p f3050k;

    /* renamed from: l  reason: collision with root package name */
    public final m f3051l;

    /* renamed from: m  reason: collision with root package name */
    public final int f3052m;
    public final int n;

    /* renamed from: o  reason: collision with root package name */
    public final int f3053o;

    public k(Context context, Bitmap.Config config, ColorSpace colorSpace, T0.f fVar, int i7, boolean z7, boolean z8, boolean z9, String str, h6.r rVar, p pVar, m mVar, int i8, int i9, int i10) {
        this.f3042a = context;
        this.f3043b = config;
        this.f3044c = colorSpace;
        this.d = fVar;
        this.f3045e = i7;
        this.f = z7;
        this.f3046g = z8;
        this.f3047h = z9;
        this.f3048i = str;
        this.f3049j = rVar;
        this.f3050k = pVar;
        this.f3051l = mVar;
        this.f3052m = i8;
        this.n = i9;
        this.f3053o = i10;
    }

    public static k a(k kVar, Bitmap.Config config) {
        Context context = kVar.f3042a;
        ColorSpace colorSpace = kVar.f3044c;
        T0.f fVar = kVar.d;
        int i7 = kVar.f3045e;
        boolean z7 = kVar.f;
        boolean z8 = kVar.f3046g;
        boolean z9 = kVar.f3047h;
        String str = kVar.f3048i;
        h6.r rVar = kVar.f3049j;
        p pVar = kVar.f3050k;
        m mVar = kVar.f3051l;
        int i8 = kVar.f3052m;
        int i9 = kVar.n;
        int i10 = kVar.f3053o;
        kVar.getClass();
        return new k(context, config, colorSpace, fVar, i7, z7, z8, z9, str, rVar, pVar, mVar, i8, i9, i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (M5.g.a(this.f3042a, kVar.f3042a) && this.f3043b == kVar.f3043b && ((Build.VERSION.SDK_INT < 26 || M5.g.a(this.f3044c, kVar.f3044c)) && M5.g.a(this.d, kVar.d) && this.f3045e == kVar.f3045e && this.f == kVar.f && this.f3046g == kVar.f3046g && this.f3047h == kVar.f3047h && M5.g.a(this.f3048i, kVar.f3048i) && M5.g.a(this.f3049j, kVar.f3049j) && M5.g.a(this.f3050k, kVar.f3050k) && M5.g.a(this.f3051l, kVar.f3051l) && this.f3052m == kVar.f3052m && this.n == kVar.n && this.f3053o == kVar.f3053o)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i8;
        int i9;
        int hashCode = (this.f3043b.hashCode() + (this.f3042a.hashCode() * 31)) * 31;
        ColorSpace colorSpace = this.f3044c;
        int i10 = 0;
        if (colorSpace != null) {
            i7 = colorSpace.hashCode();
        } else {
            i7 = 0;
        }
        int b7 = (s.h.b(this.f3045e) + ((this.d.hashCode() + ((hashCode + i7) * 31)) * 31)) * 31;
        int i11 = 1237;
        if (this.f) {
            i8 = 1231;
        } else {
            i8 = 1237;
        }
        int i12 = (b7 + i8) * 31;
        if (this.f3046g) {
            i9 = 1231;
        } else {
            i9 = 1237;
        }
        int i13 = (i12 + i9) * 31;
        if (this.f3047h) {
            i11 = 1231;
        }
        int i14 = (i13 + i11) * 31;
        String str = this.f3048i;
        if (str != null) {
            i10 = str.hashCode();
        }
        int hashCode2 = this.f3050k.f3063a.hashCode();
        int hashCode3 = this.f3051l.f3056q.hashCode();
        int b8 = s.h.b(this.f3052m);
        return s.h.b(this.f3053o) + ((s.h.b(this.n) + ((b8 + ((hashCode3 + ((hashCode2 + ((((i14 + i10) * 31) + Arrays.hashCode(this.f3049j.f11195q)) * 31)) * 31)) * 31)) * 31)) * 31);
    }
}
