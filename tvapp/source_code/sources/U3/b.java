package U3;

import Z3.w;
import android.os.Build;
import f4.o;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Objects;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import r0.AbstractC1111a;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: c  reason: collision with root package name */
    public static final P5.b f3433c = new P5.b(1);

    /* renamed from: a  reason: collision with root package name */
    public final SecretKeySpec f3434a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f3435b;

    public b(byte[] bArr) {
        if (AbstractC1111a.f(2)) {
            o.a(bArr.length);
            this.f3434a = new SecretKeySpec(bArr, "AES");
            this.f3435b = true;
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }

    public static AlgorithmParameterSpec a(byte[] bArr) {
        Integer valueOf;
        int length = bArr.length;
        if ("The Android Project".equals(System.getProperty("java.vendor"))) {
            int i7 = w.f4737a;
            if (!Objects.equals(System.getProperty("java.vendor"), "The Android Project")) {
                valueOf = null;
            } else {
                valueOf = Integer.valueOf(Build.VERSION.SDK_INT);
            }
            if (valueOf == null || valueOf.intValue() <= 19) {
                return new IvParameterSpec(bArr, 0, length);
            }
        }
        return new GCMParameterSpec(128, bArr, 0, length);
    }
}
