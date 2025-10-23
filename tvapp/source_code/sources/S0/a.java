package S0;

import W5.AbstractC0113u;
import W5.G;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC0113u f2939a;

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC0113u f2940b;

    /* renamed from: c  reason: collision with root package name */
    public final AbstractC0113u f2941c;
    public final AbstractC0113u d;

    /* renamed from: e  reason: collision with root package name */
    public final W0.a f2942e;
    public final int f;

    /* renamed from: g  reason: collision with root package name */
    public final Bitmap.Config f2943g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f2944h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f2945i;

    /* renamed from: j  reason: collision with root package name */
    public final Drawable f2946j;

    /* renamed from: k  reason: collision with root package name */
    public final Drawable f2947k;

    /* renamed from: l  reason: collision with root package name */
    public final Drawable f2948l;

    /* renamed from: m  reason: collision with root package name */
    public final int f2949m;
    public final int n;

    /* renamed from: o  reason: collision with root package name */
    public final int f2950o;

    public a() {
        d6.d dVar = G.f3945a;
        X5.e eVar = b6.o.f7208a.f4295v;
        d6.c cVar = G.f3946b;
        W0.a aVar = W0.a.f3742a;
        Bitmap.Config config = X0.e.f4060b;
        this.f2939a = eVar;
        this.f2940b = cVar;
        this.f2941c = cVar;
        this.d = cVar;
        this.f2942e = aVar;
        this.f = 3;
        this.f2943g = config;
        this.f2944h = true;
        this.f2945i = false;
        this.f2946j = null;
        this.f2947k = null;
        this.f2948l = null;
        this.f2949m = 1;
        this.n = 1;
        this.f2950o = 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (M5.g.a(this.f2939a, aVar.f2939a) && M5.g.a(this.f2940b, aVar.f2940b) && M5.g.a(this.f2941c, aVar.f2941c) && M5.g.a(this.d, aVar.d) && M5.g.a(this.f2942e, aVar.f2942e) && this.f == aVar.f && this.f2943g == aVar.f2943g && this.f2944h == aVar.f2944h && this.f2945i == aVar.f2945i && M5.g.a(this.f2946j, aVar.f2946j) && M5.g.a(this.f2947k, aVar.f2947k) && M5.g.a(this.f2948l, aVar.f2948l) && this.f2949m == aVar.f2949m && this.n == aVar.n && this.f2950o == aVar.f2950o) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i8;
        int i9;
        int hashCode = this.f2940b.hashCode();
        int hashCode2 = this.f2941c.hashCode();
        int hashCode3 = this.d.hashCode();
        this.f2942e.getClass();
        int hashCode4 = W0.a.class.hashCode();
        int hashCode5 = (this.f2943g.hashCode() + ((s.h.b(this.f) + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + (this.f2939a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        int i10 = 1237;
        if (this.f2944h) {
            i7 = 1231;
        } else {
            i7 = 1237;
        }
        int i11 = (hashCode5 + i7) * 31;
        if (this.f2945i) {
            i10 = 1231;
        }
        int i12 = (i11 + i10) * 31;
        int i13 = 0;
        Drawable drawable = this.f2946j;
        if (drawable != null) {
            i8 = drawable.hashCode();
        } else {
            i8 = 0;
        }
        int i14 = (i12 + i8) * 31;
        Drawable drawable2 = this.f2947k;
        if (drawable2 != null) {
            i9 = drawable2.hashCode();
        } else {
            i9 = 0;
        }
        int i15 = (i14 + i9) * 31;
        Drawable drawable3 = this.f2948l;
        if (drawable3 != null) {
            i13 = drawable3.hashCode();
        }
        int b7 = s.h.b(this.f2949m);
        return s.h.b(this.f2950o) + ((s.h.b(this.n) + ((b7 + ((i15 + i13) * 31)) * 31)) * 31);
    }
}
