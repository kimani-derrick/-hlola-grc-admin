package w0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import s3.C1199t;
/* loaded from: classes.dex */
public final class q0 implements Parcelable {
    public static final Parcelable.Creator<q0> CREATOR = new C1199t(6);

    /* renamed from: q  reason: collision with root package name */
    public int f15632q;

    /* renamed from: r  reason: collision with root package name */
    public int f15633r;

    /* renamed from: s  reason: collision with root package name */
    public int[] f15634s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f15635t;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f15632q + ", mGapDir=" + this.f15633r + ", mHasUnwantedGapAfter=" + this.f15635t + ", mGapPerSpan=" + Arrays.toString(this.f15634s) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f15632q);
        parcel.writeInt(this.f15633r);
        parcel.writeInt(this.f15635t ? 1 : 0);
        int[] iArr = this.f15634s;
        if (iArr != null && iArr.length > 0) {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f15634s);
            return;
        }
        parcel.writeInt(0);
    }
}
