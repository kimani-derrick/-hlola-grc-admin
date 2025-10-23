package h5;

import android.os.Parcel;
import android.os.Parcelable;
import d5.EnumC0557c;
/* loaded from: classes.dex */
public final class f implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z7;
        M5.g.f(parcel, "parcel");
        int readInt = parcel.readInt();
        boolean z8 = false;
        if (parcel.readByte() == 1) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (parcel.readByte() == 1) {
            z8 = true;
        }
        return new g(readInt, z7, z8, EnumC0557c.values()[parcel.readInt()]);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i7) {
        return new g[i7];
    }
}
