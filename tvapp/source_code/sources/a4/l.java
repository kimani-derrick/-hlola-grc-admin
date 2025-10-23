package a4;

import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.util.Objects;
/* loaded from: classes.dex */
public final class l extends T3.c {

    /* renamed from: b  reason: collision with root package name */
    public final int f5166b;

    /* renamed from: c  reason: collision with root package name */
    public final int f5167c;
    public final C0212d d;

    /* renamed from: e  reason: collision with root package name */
    public final C0212d f5168e;

    public l(int i7, int i8, C0212d c0212d, C0212d c0212d2) {
        this.f5166b = i7;
        this.f5167c = i8;
        this.d = c0212d;
        this.f5168e = c0212d2;
    }

    public final int b() {
        C0212d c0212d = C0212d.f5154o;
        int i7 = this.f5167c;
        C0212d c0212d2 = this.d;
        if (c0212d2 == c0212d) {
            return i7;
        }
        if (c0212d2 == C0212d.f5152l) {
            return i7 + 5;
        }
        if (c0212d2 == C0212d.f5153m) {
            return i7 + 5;
        }
        if (c0212d2 == C0212d.n) {
            return i7 + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (lVar.f5166b != this.f5166b || lVar.b() != b() || lVar.d != this.d || lVar.f5168e != this.f5168e) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f5166b), Integer.valueOf(this.f5167c), this.d, this.f5168e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HMAC Parameters (variant: ");
        sb.append(this.d);
        sb.append(", hashType: ");
        sb.append(this.f5168e);
        sb.append(", ");
        sb.append(this.f5167c);
        sb.append("-byte tags, and ");
        return AbstractC0515y1.n(sb, this.f5166b, "-byte key)");
    }
}
