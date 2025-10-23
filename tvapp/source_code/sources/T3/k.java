package T3;

import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.util.Objects;
/* loaded from: classes.dex */
public final class k extends c {

    /* renamed from: b  reason: collision with root package name */
    public final int f3350b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3351c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public final j f3352e;

    public k(int i7, int i8, int i9, j jVar) {
        this.f3350b = i7;
        this.f3351c = i8;
        this.d = i9;
        this.f3352e = jVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (kVar.f3350b != this.f3350b || kVar.f3351c != this.f3351c || kVar.d != this.d || kVar.f3352e != this.f3352e) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f3350b), Integer.valueOf(this.f3351c), Integer.valueOf(this.d), this.f3352e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AesEax Parameters (variant: ");
        sb.append(this.f3352e);
        sb.append(", ");
        sb.append(this.f3351c);
        sb.append("-byte IV, ");
        sb.append(this.d);
        sb.append("-byte tag, and ");
        return AbstractC0515y1.n(sb, this.f3350b, "-byte key)");
    }
}
