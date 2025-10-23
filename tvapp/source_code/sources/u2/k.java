package u2;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class k {
    public static final byte[] f = {0, 0, 1};

    /* renamed from: a  reason: collision with root package name */
    public boolean f14804a;

    /* renamed from: b  reason: collision with root package name */
    public int f14805b;

    /* renamed from: c  reason: collision with root package name */
    public int f14806c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public byte[] f14807e;

    public final void a(byte[] bArr, int i7, int i8) {
        if (!this.f14804a) {
            return;
        }
        int i9 = i8 - i7;
        byte[] bArr2 = this.f14807e;
        int length = bArr2.length;
        int i10 = this.f14806c;
        if (length < i10 + i9) {
            this.f14807e = Arrays.copyOf(bArr2, (i10 + i9) * 2);
        }
        System.arraycopy(bArr, i7, this.f14807e, this.f14806c, i9);
        this.f14806c += i9;
    }
}
