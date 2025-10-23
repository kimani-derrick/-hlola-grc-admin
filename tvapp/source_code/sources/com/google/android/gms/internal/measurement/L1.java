package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
/* loaded from: classes.dex */
public final class L1 extends ContentObserver {
    @Override // android.database.ContentObserver
    public final void onChange(boolean z7) {
        R1.f8406k.incrementAndGet();
    }
}
