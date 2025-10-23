package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new a(3);

    /* renamed from: q  reason: collision with root package name */
    public int f5267q;

    /* renamed from: r  reason: collision with root package name */
    public int f5268r;

    /* renamed from: s  reason: collision with root package name */
    public int f5269s;

    /* renamed from: t  reason: collision with root package name */
    public int f5270t;

    /* renamed from: u  reason: collision with root package name */
    public int f5271u;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f5267q);
        parcel.writeInt(this.f5269s);
        parcel.writeInt(this.f5270t);
        parcel.writeInt(this.f5271u);
        parcel.writeInt(this.f5268r);
    }
}
