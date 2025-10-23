package f4;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.Cipher;
import r0.AbstractC1111a;
/* loaded from: classes.dex */
public final class c implements S3.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f10408a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f10409b;

    public c(int i7, byte[] bArr) {
        this.f10408a = i7;
        switch (i7) {
            case 1:
                this.f10409b = new U3.d(0, bArr);
                return;
            case 2:
                this.f10409b = new U3.d(1, bArr);
                return;
            default:
                if (AbstractC1111a.f(2)) {
                    this.f10409b = new U3.b(bArr);
                    return;
                }
                throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
    }

    @Override // S3.a
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        int i7;
        int i8;
        switch (this.f10408a) {
            case 0:
                byte[] a7 = n.a(12);
                U3.b bVar = (U3.b) this.f10409b;
                bVar.getClass();
                if (a7.length == 12) {
                    if (bArr.length <= 2147483619) {
                        boolean z7 = bVar.f3435b;
                        int length = bArr.length;
                        if (z7) {
                            i7 = length + 28;
                        } else {
                            i7 = length + 16;
                        }
                        byte[] bArr3 = new byte[i7];
                        if (z7) {
                            System.arraycopy(a7, 0, bArr3, 0, 12);
                        }
                        AlgorithmParameterSpec a8 = U3.b.a(a7);
                        P5.b bVar2 = U3.b.f3433c;
                        ((Cipher) bVar2.get()).init(1, bVar.f3434a, a8);
                        if (bArr2 != null && bArr2.length != 0) {
                            ((Cipher) bVar2.get()).updateAAD(bArr2);
                        }
                        if (z7) {
                            i8 = 12;
                        } else {
                            i8 = 0;
                        }
                        int doFinal = ((Cipher) bVar2.get()).doFinal(bArr, 0, bArr.length, bArr3, i8);
                        if (doFinal == bArr.length + 16) {
                            return bArr3;
                        }
                        throw new GeneralSecurityException(AbstractC1111a.n(doFinal - bArr.length, "encryption failed; GCM tag must be 16 bytes, but got only ", " bytes"));
                    }
                    throw new GeneralSecurityException("plaintext too long");
                }
                throw new GeneralSecurityException("iv is wrong size");
            case 1:
                ByteBuffer allocate = ByteBuffer.allocate(bArr.length + 28);
                byte[] a9 = n.a(12);
                allocate.put(a9);
                ((U3.d) this.f10409b).b(allocate, a9, bArr, bArr2);
                return allocate.array();
            default:
                ByteBuffer allocate2 = ByteBuffer.allocate(bArr.length + 40);
                byte[] a10 = n.a(24);
                allocate2.put(a10);
                ((U3.d) this.f10409b).b(allocate2, a10, bArr, bArr2);
                return allocate2.array();
        }
    }

    @Override // S3.a
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        int i7;
        switch (this.f10408a) {
            case 0:
                byte[] copyOf = Arrays.copyOf(bArr, 12);
                U3.b bVar = (U3.b) this.f10409b;
                bVar.getClass();
                if (copyOf.length == 12) {
                    boolean z7 = bVar.f3435b;
                    if (z7) {
                        i7 = 28;
                    } else {
                        i7 = 16;
                    }
                    if (bArr.length >= i7) {
                        int i8 = 0;
                        if (z7 && !ByteBuffer.wrap(copyOf).equals(ByteBuffer.wrap(bArr, 0, 12))) {
                            throw new GeneralSecurityException("iv does not match prepended iv");
                        }
                        AlgorithmParameterSpec a7 = U3.b.a(copyOf);
                        P5.b bVar2 = U3.b.f3433c;
                        ((Cipher) bVar2.get()).init(2, bVar.f3434a, a7);
                        if (bArr2 != null && bArr2.length != 0) {
                            ((Cipher) bVar2.get()).updateAAD(bArr2);
                        }
                        if (z7) {
                            i8 = 12;
                        }
                        int length = bArr.length;
                        if (z7) {
                            length -= 12;
                        }
                        return ((Cipher) bVar2.get()).doFinal(bArr, i8, length);
                    }
                    throw new GeneralSecurityException("ciphertext too short");
                }
                throw new GeneralSecurityException("iv is wrong size");
            case 1:
                if (bArr.length >= 28) {
                    return ((U3.d) this.f10409b).a(ByteBuffer.wrap(bArr, 12, bArr.length - 12), Arrays.copyOf(bArr, 12), bArr2);
                }
                throw new GeneralSecurityException("ciphertext too short");
            default:
                if (bArr.length >= 40) {
                    return ((U3.d) this.f10409b).a(ByteBuffer.wrap(bArr, 24, bArr.length - 24), Arrays.copyOf(bArr, 24), bArr2);
                }
                throw new GeneralSecurityException("ciphertext too short");
        }
    }
}
