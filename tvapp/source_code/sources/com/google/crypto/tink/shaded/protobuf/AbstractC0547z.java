package com.google.crypto.tink.shaded.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
/* renamed from: com.google.crypto.tink.shaded.protobuf.z  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0547z {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f9165a;

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f9166b;

    static {
        Charset.forName("US-ASCII");
        f9165a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f9166b = bArr;
        ByteBuffer.wrap(bArr);
        B5.e.l(bArr, 0, 0, false);
    }

    public static void a(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw new NullPointerException(str);
    }

    public static int b(long j7) {
        return (int) (j7 ^ (j7 >>> 32));
    }
}
