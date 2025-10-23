package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
/* renamed from: com.google.android.gms.internal.measurement.i0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0435i0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int Y6 = w4.l0.Y(parcel);
        long j7 = 0;
        long j8 = 0;
        boolean z7 = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        Bundle bundle = null;
        String str4 = null;
        while (parcel.dataPosition() < Y6) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    j7 = w4.l0.L(parcel, readInt);
                    break;
                case 2:
                    j8 = w4.l0.L(parcel, readInt);
                    break;
                case 3:
                    z7 = w4.l0.I(parcel, readInt);
                    break;
                case 4:
                    str = w4.l0.i(parcel, readInt);
                    break;
                case 5:
                    str2 = w4.l0.i(parcel, readInt);
                    break;
                case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                    str3 = w4.l0.i(parcel, readInt);
                    break;
                case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                    bundle = w4.l0.f(parcel, readInt);
                    break;
                case '\b':
                    str4 = w4.l0.i(parcel, readInt);
                    break;
                default:
                    w4.l0.T(parcel, readInt);
                    break;
            }
        }
        w4.l0.m(parcel, Y6);
        return new C0405c0(j7, j8, z7, str, str2, str3, bundle, str4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C0405c0[i7];
    }
}
