package com.google.android.gms.internal.measurement;

import android.os.Handler;
import android.os.Looper;
/* loaded from: classes.dex */
public class S extends Handler {
    public S(Looper looper) {
        super(looper);
        Looper.getMainLooper();
    }
}
