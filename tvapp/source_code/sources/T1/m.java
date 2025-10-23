package T1;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final Q1.b f3250a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f3251b;

    public m(Q1.b bVar, byte[] bArr) {
        if (bVar != null) {
            if (bArr != null) {
                this.f3250a = bVar;
                this.f3251b = bArr;
                return;
            }
            throw new NullPointerException("bytes is null");
        }
        throw new NullPointerException("encoding is null");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (!this.f3250a.equals(mVar.f3250a)) {
            return false;
        }
        return Arrays.equals(this.f3251b, mVar.f3251b);
    }

    public final int hashCode() {
        return ((this.f3250a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f3251b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f3250a + ", bytes=[...]}";
    }
}
