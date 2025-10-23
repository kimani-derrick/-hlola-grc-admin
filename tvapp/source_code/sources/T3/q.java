package T3;

import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.util.Objects;
/* loaded from: classes.dex */
public final class q extends c {

    /* renamed from: b  reason: collision with root package name */
    public final int f3362b;

    /* renamed from: c  reason: collision with root package name */
    public final j f3363c;

    public q(int i7, j jVar) {
        this.f3362b = i7;
        this.f3363c = jVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (qVar.f3362b != this.f3362b || qVar.f3363c != this.f3363c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f3362b), this.f3363c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AesGcmSiv Parameters (variant: ");
        sb.append(this.f3363c);
        sb.append(", ");
        return AbstractC0515y1.n(sb, this.f3362b, "-byte key)");
    }
}
