package S0;

import android.graphics.drawable.Drawable;
/* loaded from: classes.dex */
public final class c extends h {

    /* renamed from: a  reason: collision with root package name */
    public final Drawable f2963a;

    /* renamed from: b  reason: collision with root package name */
    public final g f2964b;

    /* renamed from: c  reason: collision with root package name */
    public final Throwable f2965c;

    public c(Drawable drawable, g gVar, Throwable th) {
        this.f2963a = drawable;
        this.f2964b = gVar;
        this.f2965c = th;
    }

    @Override // S0.h
    public final g a() {
        return this.f2964b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (M5.g.a(this.f2963a, cVar.f2963a)) {
                if (M5.g.a(this.f2964b, cVar.f2964b) && M5.g.a(this.f2965c, cVar.f2965c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        Drawable drawable = this.f2963a;
        if (drawable != null) {
            i7 = drawable.hashCode();
        } else {
            i7 = 0;
        }
        int hashCode = this.f2964b.hashCode();
        return this.f2965c.hashCode() + ((hashCode + (i7 * 31)) * 31);
    }
}
