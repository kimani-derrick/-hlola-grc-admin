package f4;

import H2.C0002c;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.List;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import k3.AbstractC0958a;
import r0.AbstractC1111a;
/* loaded from: classes.dex */
public final class d implements S3.c {

    /* renamed from: c  reason: collision with root package name */
    public static final List f10410c = Arrays.asList(64);
    public static final byte[] d = new byte[16];

    /* renamed from: e  reason: collision with root package name */
    public static final byte[] f10411e = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};

    /* renamed from: a  reason: collision with root package name */
    public final C0002c f10412a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f10413b;

    public d(byte[] bArr) {
        if (AbstractC1111a.e(1)) {
            if (f10410c.contains(Integer.valueOf(bArr.length))) {
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length / 2);
                this.f10413b = Arrays.copyOfRange(bArr, bArr.length / 2, bArr.length);
                this.f10412a = new C0002c(copyOfRange);
                return;
            }
            throw new InvalidKeyException(AbstractC0515y1.n(new StringBuilder("invalid key size: "), bArr.length, " bytes; key must have 64 bytes"));
        }
        throw new GeneralSecurityException("Can not use AES-SIV in FIPS-mode.");
    }

    @Override // S3.c
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr.length <= 2147483631) {
            Cipher cipher = (Cipher) i.f10422b.f10424a.a("AES/CTR/NoPadding");
            byte[] c5 = c(bArr2, bArr);
            byte[] bArr3 = (byte[]) c5.clone();
            bArr3[8] = (byte) (bArr3[8] & Byte.MAX_VALUE);
            bArr3[12] = (byte) (bArr3[12] & Byte.MAX_VALUE);
            cipher.init(1, new SecretKeySpec(this.f10413b, "AES"), new IvParameterSpec(bArr3));
            return AbstractC0958a.i(c5, cipher.doFinal(bArr));
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    @Override // S3.c
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        if (bArr.length >= 16) {
            Cipher cipher = (Cipher) i.f10422b.f10424a.a("AES/CTR/NoPadding");
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 16);
            byte[] bArr3 = (byte[]) copyOfRange.clone();
            bArr3[8] = (byte) (bArr3[8] & Byte.MAX_VALUE);
            bArr3[12] = (byte) (bArr3[12] & Byte.MAX_VALUE);
            cipher.init(2, new SecretKeySpec(this.f10413b, "AES"), new IvParameterSpec(bArr3));
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 16, bArr.length);
            byte[] doFinal = cipher.doFinal(copyOfRange2);
            if (copyOfRange2.length == 0 && doFinal == null && "The Android Project".equals(System.getProperty("java.vendor"))) {
                doFinal = new byte[0];
            }
            if (MessageDigest.isEqual(copyOfRange, c(bArr2, doFinal))) {
                return doFinal;
            }
            throw new AEADBadTagException("Integrity check failed.");
        }
        throw new GeneralSecurityException("Ciphertext too short.");
    }

    public final byte[] c(byte[]... bArr) {
        byte[] L6;
        int length = bArr.length;
        C0002c c0002c = this.f10412a;
        if (length == 0) {
            return c0002c.d(16, f10411e);
        }
        byte[] d7 = c0002c.d(16, d);
        for (int i7 = 0; i7 < bArr.length - 1; i7++) {
            byte[] bArr2 = bArr[i7];
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            d7 = AbstractC0958a.L(p6.l.o(d7), c0002c.d(16, bArr2));
        }
        byte[] bArr3 = bArr[bArr.length - 1];
        if (bArr3.length >= 16) {
            if (bArr3.length >= d7.length) {
                int length2 = bArr3.length - d7.length;
                L6 = Arrays.copyOf(bArr3, bArr3.length);
                for (int i8 = 0; i8 < d7.length; i8++) {
                    int i9 = length2 + i8;
                    L6[i9] = (byte) (L6[i9] ^ d7[i8]);
                }
            } else {
                throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
            }
        } else if (bArr3.length < 16) {
            byte[] copyOf = Arrays.copyOf(bArr3, 16);
            copyOf[bArr3.length] = Byte.MIN_VALUE;
            L6 = AbstractC0958a.L(copyOf, p6.l.o(d7));
        } else {
            throw new IllegalArgumentException("x must be smaller than a block.");
        }
        return c0002c.d(16, L6);
    }
}
