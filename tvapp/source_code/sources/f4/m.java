package f4;

import d4.InterfaceC0554a;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.MessageDigest;
/* loaded from: classes.dex */
public final class m implements S3.j {

    /* renamed from: a  reason: collision with root package name */
    public final InterfaceC0554a f10426a;

    /* renamed from: b  reason: collision with root package name */
    public final int f10427b;

    public m(InterfaceC0554a interfaceC0554a, int i7) {
        this.f10426a = interfaceC0554a;
        this.f10427b = i7;
        if (i7 >= 10) {
            interfaceC0554a.d(i7, new byte[0]);
            return;
        }
        throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
    }

    @Override // S3.j
    public final void a(byte[] bArr, byte[] bArr2) {
        if (MessageDigest.isEqual(b(bArr2), bArr)) {
            return;
        }
        throw new GeneralSecurityException("invalid MAC");
    }

    @Override // S3.j
    public final byte[] b(byte[] bArr) {
        return this.f10426a.d(this.f10427b, bArr);
    }
}
