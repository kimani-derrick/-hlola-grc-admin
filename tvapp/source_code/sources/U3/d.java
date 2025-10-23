package U3;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import javax.crypto.AEADBadTagException;
import p6.l;
import r0.AbstractC1111a;
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final c f3439a;

    /* renamed from: b  reason: collision with root package name */
    public final c f3440b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f3441c;

    public d(int i7, byte[] bArr) {
        this.f3441c = i7;
        if (AbstractC1111a.e(1)) {
            this.f3439a = d(1, bArr);
            this.f3440b = d(0, bArr);
            return;
        }
        throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
    }

    public static byte[] c(byte[] bArr, ByteBuffer byteBuffer) {
        int length;
        int i7;
        if (bArr.length % 16 == 0) {
            length = bArr.length;
        } else {
            length = (bArr.length + 16) - (bArr.length % 16);
        }
        int remaining = byteBuffer.remaining();
        int i8 = remaining % 16;
        if (i8 == 0) {
            i7 = remaining;
        } else {
            i7 = (remaining + 16) - i8;
        }
        int i9 = i7 + length;
        ByteBuffer order = ByteBuffer.allocate(i9 + 16).order(ByteOrder.LITTLE_ENDIAN);
        order.put(bArr);
        order.position(length);
        order.put(byteBuffer);
        order.position(i9);
        order.putLong(bArr.length);
        order.putLong(remaining);
        return order.array();
    }

    public final byte[] a(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) {
        if (byteBuffer.remaining() >= 16) {
            int position = byteBuffer.position();
            byte[] bArr3 = new byte[16];
            byteBuffer.position(byteBuffer.limit() - 16);
            byteBuffer.get(bArr3);
            byteBuffer.position(position);
            byteBuffer.limit(byteBuffer.limit() - 16);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            try {
                byte[] bArr4 = new byte[32];
                this.f3440b.a(0, bArr).get(bArr4);
                if (MessageDigest.isEqual(l.j(bArr4, c(bArr2, byteBuffer)), bArr3)) {
                    byteBuffer.position(position);
                    c cVar = this.f3439a;
                    cVar.getClass();
                    ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
                    cVar.d(bArr, allocate, byteBuffer);
                    return allocate.array();
                }
                throw new GeneralSecurityException("invalid MAC");
            } catch (GeneralSecurityException e3) {
                throw new AEADBadTagException(e3.toString());
            }
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    public final void b(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (byteBuffer.remaining() >= bArr2.length + 16) {
            int position = byteBuffer.position();
            c cVar = this.f3439a;
            cVar.getClass();
            if (byteBuffer.remaining() >= bArr2.length) {
                cVar.d(bArr, byteBuffer, ByteBuffer.wrap(bArr2));
                byteBuffer.position(position);
                byteBuffer.limit(byteBuffer.limit() - 16);
                if (bArr3 == null) {
                    bArr3 = new byte[0];
                }
                byte[] bArr4 = new byte[32];
                this.f3440b.a(0, bArr).get(bArr4);
                byte[] j7 = l.j(bArr4, c(bArr3, byteBuffer));
                byteBuffer.limit(byteBuffer.limit() + 16);
                byteBuffer.put(j7);
                return;
            }
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        throw new IllegalArgumentException("Given ByteBuffer output is too small");
    }

    public final c d(int i7, byte[] bArr) {
        switch (this.f3441c) {
            case 0:
                return new c(bArr, i7, 0);
            default:
                return new c(bArr, i7, 1);
        }
    }
}
