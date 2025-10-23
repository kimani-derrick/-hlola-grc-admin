package C2;

import Z2.H;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class d extends j {
    public static final Parcelable.Creator<d> CREATOR = new A2.a(7);

    /* renamed from: r  reason: collision with root package name */
    public final String f388r;

    /* renamed from: s  reason: collision with root package name */
    public final boolean f389s;

    /* renamed from: t  reason: collision with root package name */
    public final boolean f390t;

    /* renamed from: u  reason: collision with root package name */
    public final String[] f391u;

    /* renamed from: v  reason: collision with root package name */
    public final j[] f392v;

    public d(Parcel parcel) {
        super("CTOC");
        String readString = parcel.readString();
        int i7 = H.f4603a;
        this.f388r = readString;
        this.f389s = parcel.readByte() != 0;
        this.f390t = parcel.readByte() != 0;
        this.f391u = parcel.createStringArray();
        int readInt = parcel.readInt();
        this.f392v = new j[readInt];
        for (int i8 = 0; i8 < readInt; i8++) {
            this.f392v[i8] = (j) parcel.readParcelable(j.class.getClassLoader());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f389s == dVar.f389s && this.f390t == dVar.f390t && H.a(this.f388r, dVar.f388r) && Arrays.equals(this.f391u, dVar.f391u) && Arrays.equals(this.f392v, dVar.f392v)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i8 = (((527 + (this.f389s ? 1 : 0)) * 31) + (this.f390t ? 1 : 0)) * 31;
        String str = this.f388r;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        return i8 + i7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f388r);
        parcel.writeByte(this.f389s ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f390t ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f391u);
        j[] jVarArr = this.f392v;
        parcel.writeInt(jVarArr.length);
        for (j jVar : jVarArr) {
            parcel.writeParcelable(jVar, 0);
        }
    }

    public d(String str, boolean z7, boolean z8, String[] strArr, j[] jVarArr) {
        super("CTOC");
        this.f388r = str;
        this.f389s = z7;
        this.f390t = z8;
        this.f391u = strArr;
        this.f392v = jVarArr;
    }
}
