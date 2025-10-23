package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
/* renamed from: com.google.android.gms.internal.measurement.b0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0400b0 extends F implements Z {
    public C0400b0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy", 0);
    }

    @Override // com.google.android.gms.internal.measurement.Z
    public final int a() {
        Parcel B6 = B(y(), 2);
        int readInt = B6.readInt();
        B6.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.measurement.Z
    public final void x(long j7, Bundle bundle, String str, String str2) {
        Parcel y3 = y();
        y3.writeString(str);
        y3.writeString(str2);
        H.c(y3, bundle);
        y3.writeLong(j7);
        C(y3, 1);
    }
}
