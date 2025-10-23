package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class T implements Parcelable {
    public static final Parcelable.Creator<T> CREATOR = new android.support.v4.media.a(9);

    /* renamed from: q  reason: collision with root package name */
    public ArrayList f5946q;

    /* renamed from: r  reason: collision with root package name */
    public ArrayList f5947r;

    /* renamed from: s  reason: collision with root package name */
    public C0248b[] f5948s;

    /* renamed from: t  reason: collision with root package name */
    public int f5949t;

    /* renamed from: u  reason: collision with root package name */
    public String f5950u;

    /* renamed from: v  reason: collision with root package name */
    public ArrayList f5951v;

    /* renamed from: w  reason: collision with root package name */
    public ArrayList f5952w;

    /* renamed from: x  reason: collision with root package name */
    public ArrayList f5953x;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeStringList(this.f5946q);
        parcel.writeStringList(this.f5947r);
        parcel.writeTypedArray(this.f5948s, i7);
        parcel.writeInt(this.f5949t);
        parcel.writeString(this.f5950u);
        parcel.writeStringList(this.f5951v);
        parcel.writeTypedList(this.f5952w);
        parcel.writeTypedList(this.f5953x);
    }
}
