package a4;

import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.util.Objects;
/* renamed from: a4.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0213e extends T3.c {

    /* renamed from: b  reason: collision with root package name */
    public final int f5157b;

    /* renamed from: c  reason: collision with root package name */
    public final int f5158c;
    public final C0212d d;

    public C0213e(int i7, int i8, C0212d c0212d) {
        this.f5157b = i7;
        this.f5158c = i8;
        this.d = c0212d;
    }

    public final int b() {
        C0212d c0212d = C0212d.f;
        int i7 = this.f5158c;
        C0212d c0212d2 = this.d;
        if (c0212d2 == c0212d) {
            return i7;
        }
        if (c0212d2 == C0212d.f5145c) {
            return i7 + 5;
        }
        if (c0212d2 == C0212d.d) {
            return i7 + 5;
        }
        if (c0212d2 == C0212d.f5146e) {
            return i7 + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0213e)) {
            return false;
        }
        C0213e c0213e = (C0213e) obj;
        if (c0213e.f5157b != this.f5157b || c0213e.b() != b() || c0213e.d != this.d) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f5157b), Integer.valueOf(this.f5158c), this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AES-CMAC Parameters (variant: ");
        sb.append(this.d);
        sb.append(", ");
        sb.append(this.f5158c);
        sb.append("-byte tags, and ");
        return AbstractC0515y1.n(sb, this.f5157b, "-byte key)");
    }
}
