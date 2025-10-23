package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
/* loaded from: classes.dex */
public final class Y extends F implements W {
    public Y(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver", 0);
    }

    @Override // com.google.android.gms.internal.measurement.W
    public final void d(Bundle bundle) {
        Parcel y3 = y();
        H.c(y3, bundle);
        C(y3, 1);
    }
}
