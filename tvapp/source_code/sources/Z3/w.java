package Z3;

import g4.C0736a;
import java.nio.charset.Charset;
import java.security.SecureRandom;
/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f4737a = 0;

    static {
        Charset.forName("UTF-8");
    }

    public static int a() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr = new byte[4];
        int i7 = 0;
        while (i7 == 0) {
            secureRandom.nextBytes(bArr);
            i7 = ((bArr[0] & Byte.MAX_VALUE) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        }
        return i7;
    }

    public static final C0736a b(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i7 = 0; i7 < str.length(); i7++) {
            char charAt = str.charAt(i7);
            if (charAt >= '!' && charAt <= '~') {
                bArr[i7] = (byte) charAt;
            } else {
                throw new RuntimeException("Not a printable ASCII character: " + charAt);
            }
        }
        return C0736a.a(bArr);
    }
}
