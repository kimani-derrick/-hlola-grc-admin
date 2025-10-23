package w0;

import android.os.Parcel;
import android.os.Parcelable;
import s3.C1199t;
/* loaded from: classes.dex */
public final class B implements Parcelable {
    public static final Parcelable.Creator<B> CREATOR = new C1199t(5);

    /* renamed from: q  reason: collision with root package name */
    public int f15442q;

    /* renamed from: r  reason: collision with root package name */
    public int f15443r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f15444s;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f15442q);
        parcel.writeInt(this.f15443r);
        parcel.writeInt(this.f15444s ? 1 : 0);
    }
}
