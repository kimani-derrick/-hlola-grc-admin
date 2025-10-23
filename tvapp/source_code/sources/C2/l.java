package C2;

import Z2.H;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class l extends j {
    public static final Parcelable.Creator<l> CREATOR = new A2.a(11);

    /* renamed from: r  reason: collision with root package name */
    public final int f409r;

    /* renamed from: s  reason: collision with root package name */
    public final int f410s;

    /* renamed from: t  reason: collision with root package name */
    public final int f411t;

    /* renamed from: u  reason: collision with root package name */
    public final int[] f412u;

    /* renamed from: v  reason: collision with root package name */
    public final int[] f413v;

    public l(int i7, int i8, int i9, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f409r = i7;
        this.f410s = i8;
        this.f411t = i9;
        this.f412u = iArr;
        this.f413v = iArr2;
    }

    @Override // C2.j, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f409r == lVar.f409r && this.f410s == lVar.f410s && this.f411t == lVar.f411t && Arrays.equals(this.f412u, lVar.f412u) && Arrays.equals(this.f413v, lVar.f413v)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.f412u);
        return Arrays.hashCode(this.f413v) + ((hashCode + ((((((527 + this.f409r) * 31) + this.f410s) * 31) + this.f411t) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f409r);
        parcel.writeInt(this.f410s);
        parcel.writeInt(this.f411t);
        parcel.writeIntArray(this.f412u);
        parcel.writeIntArray(this.f413v);
    }

    public l(Parcel parcel) {
        super("MLLT");
        this.f409r = parcel.readInt();
        this.f410s = parcel.readInt();
        this.f411t = parcel.readInt();
        int[] createIntArray = parcel.createIntArray();
        int i7 = H.f4603a;
        this.f412u = createIntArray;
        this.f413v = parcel.createIntArray();
    }
}
