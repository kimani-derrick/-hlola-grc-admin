package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;
/* renamed from: com.google.crypto.tink.shaded.protobuf.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0523a implements P {
    protected int memoizedHashCode;

    public abstract int a(b0 b0Var);

    public final String c(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public abstract AbstractC0541t d();

    public final byte[] e() {
        try {
            int a7 = ((AbstractC0543v) this).a(null);
            byte[] bArr = new byte[a7];
            C0533k c0533k = new C0533k(a7, bArr);
            f(c0533k);
            if (a7 - c0533k.d == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e3) {
            throw new RuntimeException(c("byte array"), e3);
        }
    }

    public abstract void f(C0533k c0533k);
}
