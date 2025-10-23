package C2;

import Z2.H;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class c extends j {
    public static final Parcelable.Creator<c> CREATOR = new A2.a(6);

    /* renamed from: r  reason: collision with root package name */
    public final String f382r;

    /* renamed from: s  reason: collision with root package name */
    public final int f383s;

    /* renamed from: t  reason: collision with root package name */
    public final int f384t;

    /* renamed from: u  reason: collision with root package name */
    public final long f385u;

    /* renamed from: v  reason: collision with root package name */
    public final long f386v;

    /* renamed from: w  reason: collision with root package name */
    public final j[] f387w;

    public c(Parcel parcel) {
        super("CHAP");
        String readString = parcel.readString();
        int i7 = H.f4603a;
        this.f382r = readString;
        this.f383s = parcel.readInt();
        this.f384t = parcel.readInt();
        this.f385u = parcel.readLong();
        this.f386v = parcel.readLong();
        int readInt = parcel.readInt();
        this.f387w = new j[readInt];
        for (int i8 = 0; i8 < readInt; i8++) {
            this.f387w[i8] = (j) parcel.readParcelable(j.class.getClassLoader());
        }
    }

    @Override // C2.j, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f383s == cVar.f383s && this.f384t == cVar.f384t && this.f385u == cVar.f385u && this.f386v == cVar.f386v && H.a(this.f382r, cVar.f382r) && Arrays.equals(this.f387w, cVar.f387w)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i8 = (((((((527 + this.f383s) * 31) + this.f384t) * 31) + ((int) this.f385u)) * 31) + ((int) this.f386v)) * 31;
        String str = this.f382r;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        return i8 + i7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f382r);
        parcel.writeInt(this.f383s);
        parcel.writeInt(this.f384t);
        parcel.writeLong(this.f385u);
        parcel.writeLong(this.f386v);
        j[] jVarArr = this.f387w;
        parcel.writeInt(jVarArr.length);
        for (j jVar : jVarArr) {
            parcel.writeParcelable(jVar, 0);
        }
    }

    public c(String str, int i7, int i8, long j7, long j8, j[] jVarArr) {
        super("CHAP");
        this.f382r = str;
        this.f383s = i7;
        this.f384t = i8;
        this.f385u = j7;
        this.f386v = j8;
        this.f387w = jVarArr;
    }
}
