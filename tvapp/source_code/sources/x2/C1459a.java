package x2;

import android.os.Parcel;
import android.os.Parcelable;
/* renamed from: x2.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1459a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new C1461c(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i7) {
        return new C1461c[i7];
    }
}
