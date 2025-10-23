package C2;

import Z2.H;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class e extends j {
    public static final Parcelable.Creator<e> CREATOR = new A2.a(8);

    /* renamed from: r  reason: collision with root package name */
    public final String f393r;

    /* renamed from: s  reason: collision with root package name */
    public final String f394s;

    /* renamed from: t  reason: collision with root package name */
    public final String f395t;

    public e(Parcel parcel) {
        super("COMM");
        String readString = parcel.readString();
        int i7 = H.f4603a;
        this.f393r = readString;
        this.f394s = parcel.readString();
        this.f395t = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (H.a(this.f394s, eVar.f394s) && H.a(this.f393r, eVar.f393r) && H.a(this.f395t, eVar.f395t)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i8;
        int i9 = 0;
        String str = this.f393r;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        int i10 = (527 + i7) * 31;
        String str2 = this.f394s;
        if (str2 != null) {
            i8 = str2.hashCode();
        } else {
            i8 = 0;
        }
        int i11 = (i10 + i8) * 31;
        String str3 = this.f395t;
        if (str3 != null) {
            i9 = str3.hashCode();
        }
        return i11 + i9;
    }

    @Override // C2.j
    public final String toString() {
        return this.f405q + ": language=" + this.f393r + ", description=" + this.f394s;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f405q);
        parcel.writeString(this.f393r);
        parcel.writeString(this.f395t);
    }

    public e(String str, String str2, String str3) {
        super("COMM");
        this.f393r = str;
        this.f394s = str2;
        this.f395t = str3;
    }
}
