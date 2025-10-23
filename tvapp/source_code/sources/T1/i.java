package T1;

import H2.C0002c;
import android.util.Base64;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final String f3240a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f3241b;

    /* renamed from: c  reason: collision with root package name */
    public final Q1.c f3242c;

    public i(String str, byte[] bArr, Q1.c cVar) {
        this.f3240a = str;
        this.f3241b = bArr;
        this.f3242c = cVar;
    }

    public static C0002c a() {
        C0002c c0002c = new C0002c(12, (byte) 0);
        c0002c.N(Q1.c.f2849q);
        return c0002c;
    }

    public final i b(Q1.c cVar) {
        C0002c a7 = a();
        a7.K(this.f3240a);
        a7.N(cVar);
        a7.f1018s = this.f3241b;
        return a7.l();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f3240a.equals(iVar.f3240a) && Arrays.equals(this.f3241b, iVar.f3241b) && this.f3242c.equals(iVar.f3242c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f3240a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f3241b)) * 1000003) ^ this.f3242c.hashCode();
    }

    public final String toString() {
        String encodeToString;
        byte[] bArr = this.f3241b;
        if (bArr == null) {
            encodeToString = "";
        } else {
            encodeToString = Base64.encodeToString(bArr, 2);
        }
        return "TransportContext(" + this.f3240a + ", " + this.f3242c + ", " + encodeToString + ")";
    }
}
