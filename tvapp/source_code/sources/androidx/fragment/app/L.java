package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class L implements Parcelable {
    public static final Parcelable.Creator<L> CREATOR = new android.support.v4.media.a(8);

    /* renamed from: q  reason: collision with root package name */
    public String f5900q;

    /* renamed from: r  reason: collision with root package name */
    public int f5901r;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f5900q);
        parcel.writeInt(this.f5901r);
    }
}
