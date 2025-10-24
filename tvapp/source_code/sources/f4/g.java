package f4;

import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import k3.AbstractC0958a;
/* loaded from: classes.dex */
public final class g implements S3.a {

    /* renamed from: a  reason: collision with root package name */
    public final k f10417a;

    /* renamed from: b  reason: collision with root package name */
    public final S3.j f10418b;

    /* renamed from: c  reason: collision with root package name */
    public final int f10419c;

    public g(k kVar, S3.j jVar, int i7) {
        this.f10417a = kVar;
        this.f10418b = jVar;
        this.f10419c = i7;
    }

    @Override // S3.a
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        a aVar = (a) this.f10417a;
        aVar.getClass();
        int length = bArr.length;
        int i7 = aVar.f10402b;
        int i8 = Integer.MAX_VALUE - i7;
        if (length <= i8) {
            byte[] bArr3 = new byte[bArr.length + i7];
            byte[] a7 = n.a(i7);
            System.arraycopy(a7, 0, bArr3, 0, i7);
            aVar.a(bArr, 0, bArr.length, bArr3, aVar.f10402b, a7, true);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            return AbstractC0958a.i(bArr3, this.f10418b.b(AbstractC0958a.i(bArr2, bArr3, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8))));
        }
        throw new GeneralSecurityException(AbstractC0515y1.l("plaintext length can not exceed ", i8));
    }

    @Override // S3.a
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i7 = this.f10419c;
        if (length >= i7) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length - i7);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, bArr.length - i7, bArr.length);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            this.f10418b.a(copyOfRange2, AbstractC0958a.i(bArr2, copyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8)));
            a aVar = (a) this.f10417a;
            aVar.getClass();
            int length2 = copyOfRange.length;
            int i8 = aVar.f10402b;
            if (length2 >= i8) {
                byte[] bArr3 = new byte[i8];
                System.arraycopy(copyOfRange, 0, bArr3, 0, i8);
                int length3 = copyOfRange.length;
                int i9 = aVar.f10402b;
                byte[] bArr4 = new byte[length3 - i9];
                aVar.a(copyOfRange, i9, copyOfRange.length - i9, bArr4, 0, bArr3, false);
                return bArr4;
            }
            throw new GeneralSecurityException("ciphertext too short");
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
