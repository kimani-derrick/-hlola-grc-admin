package P5;

import f4.i;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Random;
import javax.crypto.Cipher;
/* loaded from: classes.dex */
public final class b extends ThreadLocal {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2813a;

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.f2813a) {
            case 0:
                return new Random();
            case 1:
                try {
                    return (Cipher) i.f10422b.f10424a.a("AES/GCM/NoPadding");
                } catch (GeneralSecurityException e3) {
                    throw new IllegalStateException(e3);
                }
            case 2:
                try {
                    return (Cipher) i.f10422b.f10424a.a("AES/GCM-SIV/NoPadding");
                } catch (GeneralSecurityException e7) {
                    throw new IllegalStateException(e7);
                }
            case 3:
                try {
                    return (Cipher) i.f10422b.f10424a.a("AES/CTR/NoPadding");
                } catch (GeneralSecurityException e8) {
                    throw new IllegalStateException(e8);
                }
            case 4:
                try {
                    return (Cipher) i.f10422b.f10424a.a("AES/ECB/NOPADDING");
                } catch (GeneralSecurityException e9) {
                    throw new IllegalStateException(e9);
                }
            case 5:
                try {
                    return (Cipher) i.f10422b.f10424a.a("AES/CTR/NOPADDING");
                } catch (GeneralSecurityException e10) {
                    throw new IllegalStateException(e10);
                }
            case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                SecureRandom secureRandom = new SecureRandom();
                secureRandom.nextLong();
                return secureRandom;
            case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                return 0L;
            default:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(i6.b.f11393e);
                return simpleDateFormat;
        }
    }
}
