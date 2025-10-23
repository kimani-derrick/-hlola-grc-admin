package com.google.android.gms.internal.measurement;

import android.os.Build;
/* loaded from: classes.dex */
public abstract class O {

    /* renamed from: a  reason: collision with root package name */
    public static final int f8386a;

    static {
        f8386a = Build.VERSION.SDK_INT >= 31 ? 33554432 : 0;
    }
}
