package S0;

import W5.AbstractC0113u;
import android.graphics.Bitmap;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final P1.c f2951a;

    /* renamed from: b  reason: collision with root package name */
    public final T0.g f2952b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2953c;
    public final AbstractC0113u d;

    /* renamed from: e  reason: collision with root package name */
    public final AbstractC0113u f2954e;
    public final AbstractC0113u f;

    /* renamed from: g  reason: collision with root package name */
    public final AbstractC0113u f2955g;

    /* renamed from: h  reason: collision with root package name */
    public final W0.a f2956h;

    /* renamed from: i  reason: collision with root package name */
    public final int f2957i;

    /* renamed from: j  reason: collision with root package name */
    public final Bitmap.Config f2958j;

    /* renamed from: k  reason: collision with root package name */
    public final Boolean f2959k;

    /* renamed from: l  reason: collision with root package name */
    public final Boolean f2960l;

    /* renamed from: m  reason: collision with root package name */
    public final int f2961m;
    public final int n;

    /* renamed from: o  reason: collision with root package name */
    public final int f2962o;

    public b(P1.c cVar, T0.g gVar, int i7, AbstractC0113u abstractC0113u, AbstractC0113u abstractC0113u2, AbstractC0113u abstractC0113u3, AbstractC0113u abstractC0113u4, W0.a aVar, int i8, Bitmap.Config config, Boolean bool, Boolean bool2, int i9, int i10, int i11) {
        this.f2951a = cVar;
        this.f2952b = gVar;
        this.f2953c = i7;
        this.d = abstractC0113u;
        this.f2954e = abstractC0113u2;
        this.f = abstractC0113u3;
        this.f2955g = abstractC0113u4;
        this.f2956h = aVar;
        this.f2957i = i8;
        this.f2958j = config;
        this.f2959k = bool;
        this.f2960l = bool2;
        this.f2961m = i9;
        this.n = i10;
        this.f2962o = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (M5.g.a(this.f2951a, bVar.f2951a) && M5.g.a(this.f2952b, bVar.f2952b) && this.f2953c == bVar.f2953c && M5.g.a(this.d, bVar.d) && M5.g.a(this.f2954e, bVar.f2954e) && M5.g.a(this.f, bVar.f) && M5.g.a(this.f2955g, bVar.f2955g) && M5.g.a(this.f2956h, bVar.f2956h) && this.f2957i == bVar.f2957i && this.f2958j == bVar.f2958j && M5.g.a(this.f2959k, bVar.f2959k) && M5.g.a(this.f2960l, bVar.f2960l) && this.f2961m == bVar.f2961m && this.n == bVar.n && this.f2962o == bVar.f2962o) {
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
        int i21 = 0;
        P1.c cVar = this.f2951a;
        if (cVar != null) {
            i7 = cVar.hashCode();
        } else {
            i7 = 0;
        }
        int i22 = i7 * 31;
        T0.g gVar = this.f2952b;
        if (gVar != null) {
            i8 = gVar.hashCode();
        } else {
            i8 = 0;
        }
        int i23 = (i22 + i8) * 31;
        int i24 = this.f2953c;
        if (i24 != 0) {
            i9 = s.h.b(i24);
        } else {
            i9 = 0;
        }
        int i25 = (i23 + i9) * 31;
        AbstractC0113u abstractC0113u = this.d;
        if (abstractC0113u != null) {
            i10 = abstractC0113u.hashCode();
        } else {
            i10 = 0;
        }
        int i26 = (i25 + i10) * 31;
        AbstractC0113u abstractC0113u2 = this.f2954e;
        if (abstractC0113u2 != null) {
            i11 = abstractC0113u2.hashCode();
        } else {
            i11 = 0;
        }
        int i27 = (i26 + i11) * 31;
        AbstractC0113u abstractC0113u3 = this.f;
        if (abstractC0113u3 != null) {
            i12 = abstractC0113u3.hashCode();
        } else {
            i12 = 0;
        }
        int i28 = (i27 + i12) * 31;
        AbstractC0113u abstractC0113u4 = this.f2955g;
        if (abstractC0113u4 != null) {
            i13 = abstractC0113u4.hashCode();
        } else {
            i13 = 0;
        }
        int i29 = (i28 + i13) * 31;
        if (this.f2956h != null) {
            i14 = W0.a.class.hashCode();
        } else {
            i14 = 0;
        }
        int i30 = (i29 + i14) * 31;
        int i31 = this.f2957i;
        if (i31 != 0) {
            i15 = s.h.b(i31);
        } else {
            i15 = 0;
        }
        int i32 = (i30 + i15) * 31;
        Bitmap.Config config = this.f2958j;
        if (config != null) {
            i16 = config.hashCode();
        } else {
            i16 = 0;
        }
        int i33 = (i32 + i16) * 31;
        Boolean bool = this.f2959k;
        if (bool != null) {
            i17 = bool.hashCode();
        } else {
            i17 = 0;
        }
        int i34 = (i33 + i17) * 31;
        Boolean bool2 = this.f2960l;
        if (bool2 != null) {
            i18 = bool2.hashCode();
        } else {
            i18 = 0;
        }
        int i35 = (i34 + i18) * 31;
        int i36 = this.f2961m;
        if (i36 != 0) {
            i19 = s.h.b(i36);
        } else {
            i19 = 0;
        }
        int i37 = (i35 + i19) * 31;
        int i38 = this.n;
        if (i38 != 0) {
            i20 = s.h.b(i38);
        } else {
            i20 = 0;
        }
        int i39 = (i37 + i20) * 31;
        int i40 = this.f2962o;
        if (i40 != 0) {
            i21 = s.h.b(i40);
        }
        return i39 + i21;
    }
}
