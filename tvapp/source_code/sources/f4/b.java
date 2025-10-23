package f4;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import r0.AbstractC1111a;
/* loaded from: classes.dex */
public final class b implements S3.a {

    /* renamed from: e  reason: collision with root package name */
    public static final P5.b f10404e = new P5.b(4);
    public static final P5.b f = new P5.b(5);

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f10405a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f10406b;

    /* renamed from: c  reason: collision with root package name */
    public final SecretKeySpec f10407c;
    public final int d;

    public b(int i7, byte[] bArr) {
        if (AbstractC1111a.e(1)) {
            if (i7 != 12 && i7 != 16) {
                throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
            }
            this.d = i7;
            o.a(bArr.length);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            this.f10407c = secretKeySpec;
            Cipher cipher = (Cipher) f10404e.get();
            cipher.init(1, secretKeySpec);
            byte[] c5 = c(cipher.doFinal(new byte[16]));
            this.f10405a = c5;
            this.f10406b = c(c5);
            return;
        }
        throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
    }

    public static byte[] c(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i7 = 0;
        while (i7 < 15) {
            int i8 = i7 + 1;
            bArr2[i7] = (byte) (((bArr[i7] << 1) ^ ((bArr[i8] & 255) >>> 7)) & 255);
            i7 = i8;
        }
        bArr2[15] = (byte) (((bArr[0] >> 7) & 135) ^ (bArr[15] << 1));
        return bArr2;
    }

    public static byte[] e(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i7 = 0; i7 < length; i7++) {
            bArr3[i7] = (byte) (bArr[i7] ^ bArr2[i7]);
        }
        return bArr3;
    }

    @Override // S3.a
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3;
        int length = bArr.length;
        int i7 = this.d;
        if (length <= 2147483631 - i7) {
            byte[] bArr4 = new byte[bArr.length + i7 + 16];
            byte[] a7 = n.a(i7);
            System.arraycopy(a7, 0, bArr4, 0, i7);
            Cipher cipher = (Cipher) f10404e.get();
            SecretKeySpec secretKeySpec = this.f10407c;
            cipher.init(1, secretKeySpec);
            byte[] d = d(cipher, 0, a7, 0, a7.length);
            if (bArr2 == null) {
                bArr3 = new byte[0];
            } else {
                bArr3 = bArr2;
            }
            byte[] d7 = d(cipher, 1, bArr3, 0, bArr3.length);
            Cipher cipher2 = (Cipher) f.get();
            cipher2.init(1, secretKeySpec, new IvParameterSpec(d));
            cipher2.doFinal(bArr, 0, bArr.length, bArr4, this.d);
            byte[] d8 = d(cipher, 2, bArr4, this.d, bArr.length);
            int length2 = bArr.length + i7;
            for (int i8 = 0; i8 < 16; i8++) {
                bArr4[length2 + i8] = (byte) ((d7[i8] ^ d[i8]) ^ d8[i8]);
            }
            return bArr4;
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    @Override // S3.a
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        byte[] bArr3;
        int length = bArr.length;
        int i7 = this.d;
        int i8 = (length - i7) - 16;
        if (i8 >= 0) {
            Cipher cipher = (Cipher) f10404e.get();
            SecretKeySpec secretKeySpec = this.f10407c;
            cipher.init(1, secretKeySpec);
            byte[] d = d(cipher, 0, bArr, 0, this.d);
            if (bArr2 == null) {
                bArr3 = new byte[0];
            } else {
                bArr3 = bArr2;
            }
            byte[] d7 = d(cipher, 1, bArr3, 0, bArr3.length);
            byte[] d8 = d(cipher, 2, bArr, this.d, i8);
            int length2 = bArr.length - 16;
            byte b7 = 0;
            for (int i9 = 0; i9 < 16; i9++) {
                b7 = (byte) (b7 | (((bArr[length2 + i9] ^ d7[i9]) ^ d[i9]) ^ d8[i9]));
            }
            if (b7 == 0) {
                Cipher cipher2 = (Cipher) f.get();
                cipher2.init(1, secretKeySpec, new IvParameterSpec(d));
                return cipher2.doFinal(bArr, i7, i8);
            }
            throw new AEADBadTagException("tag mismatch");
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    public final byte[] d(Cipher cipher, int i7, byte[] bArr, int i8, int i9) {
        byte[] copyOf;
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) i7;
        byte[] bArr3 = this.f10405a;
        if (i9 == 0) {
            return cipher.doFinal(e(bArr2, bArr3));
        }
        byte[] doFinal = cipher.doFinal(bArr2);
        int i10 = 0;
        while (i9 - i10 > 16) {
            for (int i11 = 0; i11 < 16; i11++) {
                doFinal[i11] = (byte) (doFinal[i11] ^ bArr[(i8 + i10) + i11]);
            }
            doFinal = cipher.doFinal(doFinal);
            i10 += 16;
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i10 + i8, i8 + i9);
        if (copyOfRange.length == 16) {
            copyOf = e(copyOfRange, bArr3);
        } else {
            copyOf = Arrays.copyOf(this.f10406b, 16);
            for (int i12 = 0; i12 < copyOfRange.length; i12++) {
                copyOf[i12] = (byte) (copyOf[i12] ^ copyOfRange[i12]);
            }
            copyOf[copyOfRange.length] = (byte) (copyOf[copyOfRange.length] ^ 128);
        }
        return cipher.doFinal(e(doFinal, copyOf));
    }
}
