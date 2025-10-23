package android.support.v4.media;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new a(3);

    /* renamed from: q  reason: collision with root package name */
    public final int f5259q;

    /* renamed from: r  reason: collision with root package name */
    public final float f5260r;

    public RatingCompat(int i7, float f) {
        this.f5259q = i7;
        this.f5260r = f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.f5259q;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Rating:style=");
        sb.append(this.f5259q);
        sb.append(" rating=");
        float f = this.f5260r;
        sb.append(f < 0.0f ? "unrated" : String.valueOf(f));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f5259q);
        parcel.writeFloat(this.f5260r);
    }
}
