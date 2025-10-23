package M0;

import android.graphics.drawable.Drawable;
/* loaded from: classes.dex */
public final class d extends e {

    /* renamed from: a  reason: collision with root package name */
    public final Drawable f2151a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f2152b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2153c;

    public d(Drawable drawable, boolean z7, int i7) {
        this.f2151a = drawable;
        this.f2152b = z7;
        this.f2153c = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (M5.g.a(this.f2151a, dVar.f2151a) && this.f2152b == dVar.f2152b && this.f2153c == dVar.f2153c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int hashCode = this.f2151a.hashCode() * 31;
        if (this.f2152b) {
            i7 = 1231;
        } else {
            i7 = 1237;
        }
        return s.h.b(this.f2153c) + ((hashCode + i7) * 31);
    }
}
