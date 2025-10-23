package f4;

import java.security.SecureRandom;
/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a  reason: collision with root package name */
    public static final P5.b f10428a = new P5.b(6);

    public static byte[] a(int i7) {
        byte[] bArr = new byte[i7];
        ((SecureRandom) f10428a.get()).nextBytes(bArr);
        return bArr;
    }
}
