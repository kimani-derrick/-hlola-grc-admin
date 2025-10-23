package K2;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
/* loaded from: classes.dex */
public final class t implements Parcelable {
    public static final Parcelable.Creator<t> CREATOR = new s(1);

    /* renamed from: q  reason: collision with root package name */
    public final int f1812q;

    /* renamed from: r  reason: collision with root package name */
    public final int f1813r;

    /* renamed from: s  reason: collision with root package name */
    public final String f1814s;

    /* renamed from: t  reason: collision with root package name */
    public final String f1815t;

    /* renamed from: u  reason: collision with root package name */
    public final String f1816u;

    /* renamed from: v  reason: collision with root package name */
    public final String f1817v;

    public t(int i7, int i8, String str, String str2, String str3, String str4) {
        this.f1812q = i7;
        this.f1813r = i8;
        this.f1814s = str;
        this.f1815t = str2;
        this.f1816u = str3;
        this.f1817v = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t.class != obj.getClass()) {
            return false;
        }
        t tVar = (t) obj;
        if (this.f1812q == tVar.f1812q && this.f1813r == tVar.f1813r && TextUtils.equals(this.f1814s, tVar.f1814s) && TextUtils.equals(this.f1815t, tVar.f1815t) && TextUtils.equals(this.f1816u, tVar.f1816u) && TextUtils.equals(this.f1817v, tVar.f1817v)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i8;
        int i9;
        int i10 = ((this.f1812q * 31) + this.f1813r) * 31;
        int i11 = 0;
        String str = this.f1814s;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        int i12 = (i10 + i7) * 31;
        String str2 = this.f1815t;
        if (str2 != null) {
            i8 = str2.hashCode();
        } else {
            i8 = 0;
        }
        int i13 = (i12 + i8) * 31;
        String str3 = this.f1816u;
        if (str3 != null) {
            i9 = str3.hashCode();
        } else {
            i9 = 0;
        }
        int i14 = (i13 + i9) * 31;
        String str4 = this.f1817v;
        if (str4 != null) {
            i11 = str4.hashCode();
        }
        return i14 + i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f1812q);
        parcel.writeInt(this.f1813r);
        parcel.writeString(this.f1814s);
        parcel.writeString(this.f1815t);
        parcel.writeString(this.f1816u);
        parcel.writeString(this.f1817v);
    }

    public t(Parcel parcel) {
        this.f1812q = parcel.readInt();
        this.f1813r = parcel.readInt();
        this.f1814s = parcel.readString();
        this.f1815t = parcel.readString();
        this.f1816u = parcel.readString();
        this.f1817v = parcel.readString();
    }
}
