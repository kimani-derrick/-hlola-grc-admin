package androidx.leanback.widget;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
/* renamed from: androidx.leanback.widget.x  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0320x implements Parcelable {
    public static final Parcelable.Creator<C0320x> CREATOR = new Object();

    /* renamed from: q  reason: collision with root package name */
    public int f6664q;

    /* renamed from: r  reason: collision with root package name */
    public Bundle f6665r;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f6664q);
        parcel.writeBundle(this.f6665r);
    }
}
