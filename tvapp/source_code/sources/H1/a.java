package H1;

import M5.g;
import r0.AbstractC1111a;
/* loaded from: classes.dex */
public final class a extends Throwable {

    /* renamed from: q  reason: collision with root package name */
    public final String f878q;

    public a(String str) {
        super(str);
        this.f878q = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        if (g.a(this.f878q, ((a) obj).f878q)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f878q;
    }

    public final int hashCode() {
        String str = this.f878q;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return AbstractC1111a.t(new StringBuilder("ApiException(message="), this.f878q, ")");
    }
}
