package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import s3.InterfaceC1206w0;
/* renamed from: com.google.android.gms.internal.measurement.g0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0425g0 extends I implements Z {
    public final InterfaceC1206w0 d;

    public BinderC0425g0(InterfaceC1206w0 interfaceC1206w0) {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
        this.d = interfaceC1206w0;
    }

    @Override // com.google.android.gms.internal.measurement.Z
    public final int a() {
        return System.identityHashCode(this.d);
    }

    @Override // com.google.android.gms.internal.measurement.Z
    public final void x(long j7, Bundle bundle, String str, String str2) {
        this.d.a(j7, bundle, str, str2);
    }

    @Override // com.google.android.gms.internal.measurement.I
    public final boolean y(int i7, Parcel parcel, Parcel parcel2) {
        if (i7 != 1) {
            if (i7 != 2) {
                return false;
            }
            int identityHashCode = System.identityHashCode(this.d);
            parcel2.writeNoException();
            parcel2.writeInt(identityHashCode);
        } else {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            long readLong = parcel.readLong();
            H.d(parcel);
            x(readLong, (Bundle) H.a(parcel, Bundle.CREATOR), readString, readString2);
            parcel2.writeNoException();
        }
        return true;
    }
}
