package G2;

import Z2.H;
import android.os.Parcel;
import android.os.Parcelable;
import e2.InterfaceC0604f;
/* loaded from: classes.dex */
public final class a implements Comparable, Parcelable, InterfaceC0604f {
    public static final Parcelable.Creator<a> CREATOR = new A2.a(26);

    /* renamed from: t  reason: collision with root package name */
    public static final String f742t;

    /* renamed from: u  reason: collision with root package name */
    public static final String f743u;

    /* renamed from: v  reason: collision with root package name */
    public static final String f744v;

    /* renamed from: q  reason: collision with root package name */
    public final int f745q;

    /* renamed from: r  reason: collision with root package name */
    public final int f746r;

    /* renamed from: s  reason: collision with root package name */
    public final int f747s;

    static {
        int i7 = H.f4603a;
        f742t = Integer.toString(0, 36);
        f743u = Integer.toString(1, 36);
        f744v = Integer.toString(2, 36);
    }

    public a(int i7, int i8, int i9) {
        this.f745q = i7;
        this.f746r = i8;
        this.f747s = i9;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        a aVar = (a) obj;
        int i7 = this.f745q - aVar.f745q;
        if (i7 == 0) {
            int i8 = this.f746r - aVar.f746r;
            if (i8 == 0) {
                return this.f747s - aVar.f747s;
            }
            return i8;
        }
        return i7;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f745q == aVar.f745q && this.f746r == aVar.f746r && this.f747s == aVar.f747s) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f745q * 31) + this.f746r) * 31) + this.f747s;
    }

    public final String toString() {
        return this.f745q + "." + this.f746r + "." + this.f747s;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f745q);
        parcel.writeInt(this.f746r);
        parcel.writeInt(this.f747s);
    }

    public a(Parcel parcel) {
        this.f745q = parcel.readInt();
        this.f746r = parcel.readInt();
        this.f747s = parcel.readInt();
    }
}
