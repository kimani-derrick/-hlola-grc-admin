package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
/* renamed from: androidx.fragment.app.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0249c implements Parcelable {
    public static final Parcelable.Creator<C0249c> CREATOR = new android.support.v4.media.a(7);

    /* renamed from: q  reason: collision with root package name */
    public final List f6024q;

    /* renamed from: r  reason: collision with root package name */
    public final List f6025r;

    public C0249c(Parcel parcel) {
        this.f6024q = parcel.createStringArrayList();
        this.f6025r = parcel.createTypedArrayList(C0248b.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeStringList(this.f6024q);
        parcel.writeTypedList(this.f6025r);
    }

    public C0249c(ArrayList arrayList, ArrayList arrayList2) {
        this.f6024q = arrayList;
        this.f6025r = arrayList2;
    }
}
