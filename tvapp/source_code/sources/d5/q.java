package d5;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class q implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z7;
        M5.g.f(parcel, "parcel");
        r rVar = r.values()[parcel.readInt()];
        int readInt = parcel.readInt();
        float readFloat = parcel.readFloat();
        boolean z8 = true;
        if (parcel.readByte() != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (parcel.readByte() == 0) {
            z8 = false;
        }
        return new s(rVar, readInt, readFloat, z7, z8);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i7) {
        return new s[i7];
    }
}
