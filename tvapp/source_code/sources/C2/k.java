package C2;

import Z2.H;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class k extends j {
    public static final Parcelable.Creator<k> CREATOR = new A2.a(10);

    /* renamed from: r  reason: collision with root package name */
    public final String f406r;

    /* renamed from: s  reason: collision with root package name */
    public final String f407s;

    /* renamed from: t  reason: collision with root package name */
    public final String f408t;

    public k(Parcel parcel) {
        super("----");
        String readString = parcel.readString();
        int i7 = H.f4603a;
        this.f406r = readString;
        this.f407s = parcel.readString();
        this.f408t = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        if (H.a(this.f407s, kVar.f407s) && H.a(this.f406r, kVar.f406r) && H.a(this.f408t, kVar.f408t)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i8;
        int i9 = 0;
        String str = this.f406r;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        int i10 = (527 + i7) * 31;
        String str2 = this.f407s;
        if (str2 != null) {
            i8 = str2.hashCode();
        } else {
            i8 = 0;
        }
        int i11 = (i10 + i8) * 31;
        String str3 = this.f408t;
        if (str3 != null) {
            i9 = str3.hashCode();
        }
        return i11 + i9;
    }

    @Override // C2.j
    public final String toString() {
        return this.f405q + ": domain=" + this.f406r + ", description=" + this.f407s;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f405q);
        parcel.writeString(this.f406r);
        parcel.writeString(this.f408t);
    }

    public k(String str, String str2, String str3) {
        super("----");
        this.f406r = str;
        this.f407s = str2;
        this.f408t = str3;
    }
}
