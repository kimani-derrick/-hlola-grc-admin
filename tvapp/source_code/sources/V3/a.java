package V3;

import P5.b;
import f4.n;
import f4.o;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import r0.AbstractC1111a;
/* loaded from: classes.dex */
public final class a implements S3.a {

    /* renamed from: b  reason: collision with root package name */
    public static final b f3654b = new b(2);

    /* renamed from: a  reason: collision with root package name */
    public final SecretKeySpec f3655a;

    public a(byte[] bArr) {
        o.a(bArr.length);
        this.f3655a = new SecretKeySpec(bArr, "AES");
    }

    public static AlgorithmParameterSpec c(int i7, byte[] bArr) {
        try {
            Class.forName("javax.crypto.spec.GCMParameterSpec");
            return new GCMParameterSpec(128, bArr, 0, i7);
        } catch (ClassNotFoundException unused) {
            if ("The Android Project".equals(System.getProperty("java.vendor"))) {
                return new IvParameterSpec(bArr, 0, i7);
            }
            throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
        }
    }

    @Override // S3.a
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr.length <= 2147483619) {
            byte[] bArr3 = new byte[bArr.length + 28];
            byte[] a7 = n.a(12);
            System.arraycopy(a7, 0, bArr3, 0, 12);
            AlgorithmParameterSpec c5 = c(a7.length, a7);
            b bVar = f3654b;
            ((Cipher) bVar.get()).init(1, this.f3655a, c5);
            if (bArr2 != null && bArr2.length != 0) {
                ((Cipher) bVar.get()).updateAAD(bArr2);
            }
            int doFinal = ((Cipher) bVar.get()).doFinal(bArr, 0, bArr.length, bArr3, 12);
            if (doFinal == bArr.length + 16) {
                return bArr3;
            }
            throw new GeneralSecurityException(AbstractC1111a.n(doFinal - bArr.length, "encryption failed; GCM tag must be 16 bytes, but got only ", " bytes"));
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    @Override // S3.a
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        if (bArr.length >= 28) {
            AlgorithmParameterSpec c5 = c(12, bArr);
            b bVar = f3654b;
            ((Cipher) bVar.get()).init(2, this.f3655a, c5);
            if (bArr2 != null && bArr2.length != 0) {
                ((Cipher) bVar.get()).updateAAD(bArr2);
            }
            return ((Cipher) bVar.get()).doFinal(bArr, 12, bArr.length - 12);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
