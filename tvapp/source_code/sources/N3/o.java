package N3;

import a.AbstractC0189a;
import java.io.Serializable;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class o implements l, Serializable {

    /* renamed from: q  reason: collision with root package name */
    public final Object f2515q;

    public o(Object obj) {
        this.f2515q = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            return AbstractC0189a.r(this.f2515q, ((o) obj).f2515q);
        }
        return false;
    }

    @Override // N3.l
    public final Object get() {
        return this.f2515q;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2515q});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f2515q);
        StringBuilder sb = new StringBuilder(valueOf.length() + 22);
        sb.append("Suppliers.ofInstance(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
