package T3;

import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.util.Objects;
/* loaded from: classes.dex */
public final class n extends c {

    /* renamed from: b  reason: collision with root package name */
    public final int f3356b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3357c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public final j f3358e;

    public n(int i7, int i8, int i9, j jVar) {
        this.f3356b = i7;
        this.f3357c = i8;
        this.d = i9;
        this.f3358e = jVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (nVar.f3356b != this.f3356b || nVar.f3357c != this.f3357c || nVar.d != this.d || nVar.f3358e != this.f3358e) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f3356b), Integer.valueOf(this.f3357c), Integer.valueOf(this.d), this.f3358e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AesGcm Parameters (variant: ");
        sb.append(this.f3358e);
        sb.append(", ");
        sb.append(this.f3357c);
        sb.append("-byte IV, ");
        sb.append(this.d);
        sb.append("-byte tag, and ");
        return AbstractC0515y1.n(sb, this.f3356b, "-byte key)");
    }
}
