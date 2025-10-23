package U3;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import k3.AbstractC0958a;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final int[] f3436a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3437b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f3438c;

    public c(byte[] bArr, int i7, int i8) {
        this.f3438c = i8;
        if (bArr.length == 32) {
            this.f3436a = a.c(bArr);
            this.f3437b = i7;
            return;
        }
        throw new InvalidKeyException("The key length in bytes must be 32.");
    }

    public final ByteBuffer a(int i7, byte[] bArr) {
        int[] b7 = b(a.c(bArr), i7);
        int[] iArr = (int[]) b7.clone();
        a.b(iArr);
        for (int i8 = 0; i8 < b7.length; i8++) {
            b7[i8] = b7[i8] + iArr[i8];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(b7, 0, 16);
        return order;
    }

    public final int[] b(int[] iArr, int i7) {
        int[] iArr2 = this.f3436a;
        switch (this.f3438c) {
            case 0:
                if (iArr.length == 3) {
                    int[] iArr3 = new int[16];
                    int[] iArr4 = a.f3432a;
                    System.arraycopy(iArr4, 0, iArr3, 0, iArr4.length);
                    System.arraycopy(iArr2, 0, iArr3, iArr4.length, 8);
                    iArr3[12] = i7;
                    System.arraycopy(iArr, 0, iArr3, 13, iArr.length);
                    return iArr3;
                }
                throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArr.length * 32)));
            default:
                if (iArr.length == 6) {
                    int[] iArr5 = new int[16];
                    int[] iArr6 = a.f3432a;
                    System.arraycopy(iArr6, 0, r5, 0, iArr6.length);
                    System.arraycopy(iArr2, 0, r5, iArr6.length, 8);
                    int[] iArr7 = {0, 0, 0, 0, iArr7[12], iArr7[13], iArr7[14], iArr7[15], 0, 0, 0, 0, iArr[0], iArr[1], iArr[2], iArr[3]};
                    a.b(iArr7);
                    int[] copyOf = Arrays.copyOf(iArr7, 8);
                    System.arraycopy(iArr6, 0, iArr5, 0, iArr6.length);
                    System.arraycopy(copyOf, 0, iArr5, iArr6.length, 8);
                    iArr5[12] = i7;
                    iArr5[13] = 0;
                    iArr5[14] = iArr[4];
                    iArr5[15] = iArr[5];
                    return iArr5;
                }
                throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArr.length * 32)));
        }
    }

    public final int c() {
        switch (this.f3438c) {
            case 0:
                return 12;
            default:
                return 24;
        }
    }

    public final void d(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        if (bArr.length == c()) {
            int remaining = byteBuffer2.remaining();
            int i7 = remaining / 64;
            int i8 = i7 + 1;
            for (int i9 = 0; i9 < i8; i9++) {
                ByteBuffer a7 = a(this.f3437b + i9, bArr);
                int i10 = 64;
                if (i9 == i7) {
                    i10 = remaining % 64;
                }
                AbstractC0958a.J(byteBuffer, byteBuffer2, a7, i10);
            }
            return;
        }
        throw new GeneralSecurityException("The nonce length (in bytes) must be " + c());
    }
}
