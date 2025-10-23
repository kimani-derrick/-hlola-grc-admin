package C2;

import Z2.H;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class f extends j {
    public static final Parcelable.Creator<f> CREATOR = new A2.a(9);

    /* renamed from: r  reason: collision with root package name */
    public final String f396r;

    /* renamed from: s  reason: collision with root package name */
    public final String f397s;

    /* renamed from: t  reason: collision with root package name */
    public final String f398t;

    /* renamed from: u  reason: collision with root package name */
    public final byte[] f399u;

    public f(Parcel parcel) {
        super("GEOB");
        String readString = parcel.readString();
        int i7 = H.f4603a;
        this.f396r = readString;
        this.f397s = parcel.readString();
        this.f398t = parcel.readString();
        this.f399u = parcel.createByteArray();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        if (H.a(this.f396r, fVar.f396r) && H.a(this.f397s, fVar.f397s) && H.a(this.f398t, fVar.f398t) && Arrays.equals(this.f399u, fVar.f399u)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i8;
        int i9 = 0;
        String str = this.f396r;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        int i10 = (527 + i7) * 31;
        String str2 = this.f397s;
        if (str2 != null) {
            i8 = str2.hashCode();
        } else {
            i8 = 0;
        }
        int i11 = (i10 + i8) * 31;
        String str3 = this.f398t;
        if (str3 != null) {
            i9 = str3.hashCode();
        }
        return Arrays.hashCode(this.f399u) + ((i11 + i9) * 31);
    }

    @Override // C2.j
    public final String toString() {
        return this.f405q + ": mimeType=" + this.f396r + ", filename=" + this.f397s + ", description=" + this.f398t;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f396r);
        parcel.writeString(this.f397s);
        parcel.writeString(this.f398t);
        parcel.writeByteArray(this.f399u);
    }

    public f(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f396r = str;
        this.f397s = str2;
        this.f398t = str3;
        this.f399u = bArr;
    }
}
