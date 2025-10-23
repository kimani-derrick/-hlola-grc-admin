package N4;

import r0.AbstractC1111a;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f2516a;

    /* renamed from: b  reason: collision with root package name */
    public final long f2517b;

    /* renamed from: c  reason: collision with root package name */
    public final long f2518c;

    public a(long j7, long j8, String str) {
        this.f2516a = str;
        this.f2517b = j7;
        this.f2518c = j8;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f2516a.equals(aVar.f2516a) && this.f2517b == aVar.f2517b && this.f2518c == aVar.f2518c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j7 = this.f2517b;
        long j8 = this.f2518c;
        return ((((this.f2516a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003) ^ ((int) (j8 ^ (j8 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallationTokenResult{token=");
        sb.append(this.f2516a);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.f2517b);
        sb.append(", tokenCreationTimestamp=");
        return AbstractC1111a.s(sb, this.f2518c, "}");
    }
}
