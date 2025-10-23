package C2;

import Z2.H;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class m extends j {
    public static final Parcelable.Creator<m> CREATOR = new A2.a(12);

    /* renamed from: r  reason: collision with root package name */
    public final String f414r;

    /* renamed from: s  reason: collision with root package name */
    public final byte[] f415s;

    public m(Parcel parcel) {
        super("PRIV");
        String readString = parcel.readString();
        int i7 = H.f4603a;
        this.f414r = readString;
        this.f415s = parcel.createByteArray();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        if (H.a(this.f414r, mVar.f414r) && Arrays.equals(this.f415s, mVar.f415s)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        String str = this.f414r;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        return Arrays.hashCode(this.f415s) + ((527 + i7) * 31);
    }

    @Override // C2.j
    public final String toString() {
        return this.f405q + ": owner=" + this.f414r;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f414r);
        parcel.writeByteArray(this.f415s);
    }

    public m(String str, byte[] bArr) {
        super("PRIV");
        this.f414r = str;
        this.f415s = bArr;
    }
}
