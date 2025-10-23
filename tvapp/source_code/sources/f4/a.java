package f4;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import r0.AbstractC1111a;
/* loaded from: classes.dex */
public final class a implements k {
    public static final P5.b d = new P5.b(3);

    /* renamed from: a  reason: collision with root package name */
    public final SecretKeySpec f10401a;

    /* renamed from: b  reason: collision with root package name */
    public final int f10402b;

    /* renamed from: c  reason: collision with root package name */
    public final int f10403c;

    public a(int i7, byte[] bArr) {
        if (AbstractC1111a.f(2)) {
            o.a(bArr.length);
            this.f10401a = new SecretKeySpec(bArr, "AES");
            int blockSize = ((Cipher) d.get()).getBlockSize();
            this.f10403c = blockSize;
            if (i7 >= 12 && i7 <= blockSize) {
                this.f10402b = i7;
                return;
            }
            throw new GeneralSecurityException("invalid IV size");
        }
        throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
    }

    public final void a(byte[] bArr, int i7, int i8, byte[] bArr2, int i9, byte[] bArr3, boolean z7) {
        int i10;
        Cipher cipher = (Cipher) d.get();
        byte[] bArr4 = new byte[this.f10403c];
        System.arraycopy(bArr3, 0, bArr4, 0, this.f10402b);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        SecretKeySpec secretKeySpec = this.f10401a;
        if (z7) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        cipher.init(i10, secretKeySpec, ivParameterSpec);
        if (cipher.doFinal(bArr, i7, i8, bArr2, i9) == i8) {
            return;
        }
        throw new GeneralSecurityException("stored output's length does not match input's length");
    }
}
