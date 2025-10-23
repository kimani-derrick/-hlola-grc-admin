package com.google.android.gms.internal.measurement;
/* loaded from: classes.dex */
public abstract class N {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f8382a = 0;

    static {
        byte b7 = (byte) (((byte) 1) | 2);
        if (b7 == 3) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        if ((b7 & 1) == 0) {
            sb.append(" hasDifferentDmaOwner");
        }
        if ((b7 & 2) == 0) {
            sb.append(" skipChecks");
        }
        throw new IllegalStateException("Missing required properties:".concat(String.valueOf(sb)));
    }
}
