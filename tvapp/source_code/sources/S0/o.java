package S0;

import android.graphics.drawable.Drawable;
/* loaded from: classes.dex */
public final class o extends h {

    /* renamed from: a  reason: collision with root package name */
    public final Drawable f3057a;

    /* renamed from: b  reason: collision with root package name */
    public final g f3058b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3059c;
    public final Q0.b d;

    /* renamed from: e  reason: collision with root package name */
    public final String f3060e;
    public final boolean f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f3061g;

    public o(Drawable drawable, g gVar, int i7, Q0.b bVar, String str, boolean z7, boolean z8) {
        this.f3057a = drawable;
        this.f3058b = gVar;
        this.f3059c = i7;
        this.d = bVar;
        this.f3060e = str;
        this.f = z7;
        this.f3061g = z8;
    }

    @Override // S0.h
    public final g a() {
        return this.f3058b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (M5.g.a(this.f3057a, oVar.f3057a) && M5.g.a(this.f3058b, oVar.f3058b) && this.f3059c == oVar.f3059c && M5.g.a(this.d, oVar.d) && M5.g.a(this.f3060e, oVar.f3060e) && this.f == oVar.f && this.f3061g == oVar.f3061g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i8;
        int b7 = (s.h.b(this.f3059c) + ((this.f3058b.hashCode() + (this.f3057a.hashCode() * 31)) * 31)) * 31;
        int i9 = 0;
        Q0.b bVar = this.d;
        if (bVar != null) {
            i7 = bVar.hashCode();
        } else {
            i7 = 0;
        }
        int i10 = (b7 + i7) * 31;
        String str = this.f3060e;
        if (str != null) {
            i9 = str.hashCode();
        }
        int i11 = (i10 + i9) * 31;
        int i12 = 1237;
        if (this.f) {
            i8 = 1231;
        } else {
            i8 = 1237;
        }
        int i13 = (i11 + i8) * 31;
        if (this.f3061g) {
            i12 = 1231;
        }
        return i13 + i12;
    }
}
