package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
/* renamed from: com.google.android.gms.internal.measurement.o2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0467o2 {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f8631a;

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f8632b;

    static {
        Charset.forName("US-ASCII");
        f8631a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f8632b = bArr;
        ByteBuffer.wrap(bArr);
        int length = bArr.length;
        try {
            if (length >= 0) {
                int i7 = (0 - 0) + length;
                if (i7 >= 0) {
                    if (i7 <= Integer.MAX_VALUE) {
                        return;
                    }
                    throw C0496u2.e();
                }
                throw C0496u2.d();
            }
            throw C0496u2.c();
        } catch (C0496u2 e3) {
            throw new IllegalArgumentException(e3);
        }
    }

    public static int a(long j7) {
        return (int) (j7 ^ (j7 >>> 32));
    }
}
