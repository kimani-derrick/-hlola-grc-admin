package androidx.versionedparcelable;

import A2.a;
import I0.b;
import I0.c;
import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new a(27);

    /* renamed from: q  reason: collision with root package name */
    public final c f6989q;

    public ParcelImpl(Parcel parcel) {
        this.f6989q = new b(parcel).h();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        new b(parcel).l(this.f6989q);
    }
}
