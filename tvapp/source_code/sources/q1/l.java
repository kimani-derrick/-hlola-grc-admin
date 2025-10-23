package q1;

import com.google.android.gms.internal.measurement.AbstractC0515y1;
/* loaded from: classes.dex */
public final class l implements m {

    /* renamed from: a  reason: collision with root package name */
    public final int f13253a;

    public l(int i7) {
        this.f13253a = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof l) && this.f13253a == ((l) obj).f13253a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f13253a;
    }

    public final String toString() {
        return AbstractC0515y1.n(new StringBuilder("TVTextId(value="), this.f13253a, ")");
    }
}
