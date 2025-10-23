package d5;

import android.os.Parcel;
import android.os.Parcelable;
/* renamed from: d5.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0555a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z7;
        boolean z8;
        boolean z9;
        M5.g.f(parcel, "parcel");
        int readInt = parcel.readInt();
        float readFloat = parcel.readFloat();
        if (parcel.readByte() != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (parcel.readByte() != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (parcel.readByte() != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        return new C0556b(readInt, readFloat, z7, z8, z9);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i7) {
        return new C0556b[i7];
    }
}
