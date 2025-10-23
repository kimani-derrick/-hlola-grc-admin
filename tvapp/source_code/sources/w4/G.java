package w4;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class G extends j0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f15895a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f15896b;

    public G(String str, byte[] bArr) {
        this.f15895a = str;
        this.f15896b = bArr;
    }

    public final boolean equals(Object obj) {
        G g7;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        if (this.f15895a.equals(((G) j0Var).f15895a)) {
            if (j0Var instanceof G) {
                g7 = (G) j0Var;
            } else {
                g7 = (G) j0Var;
            }
            if (Arrays.equals(this.f15896b, g7.f15896b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f15895a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f15896b);
    }

    public final String toString() {
        return "File{filename=" + this.f15895a + ", contents=" + Arrays.toString(this.f15896b) + "}";
    }
}
