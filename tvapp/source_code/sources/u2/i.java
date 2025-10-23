package u2;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class i {

    /* renamed from: e  reason: collision with root package name */
    public static final byte[] f14786e = {0, 0, 1};

    /* renamed from: a  reason: collision with root package name */
    public boolean f14787a;

    /* renamed from: b  reason: collision with root package name */
    public int f14788b;

    /* renamed from: c  reason: collision with root package name */
    public int f14789c;
    public byte[] d;

    public final void a(byte[] bArr, int i7, int i8) {
        if (!this.f14787a) {
            return;
        }
        int i9 = i8 - i7;
        byte[] bArr2 = this.d;
        int length = bArr2.length;
        int i10 = this.f14788b;
        if (length < i10 + i9) {
            this.d = Arrays.copyOf(bArr2, (i10 + i9) * 2);
        }
        System.arraycopy(bArr, i7, this.d, this.f14788b, i9);
        this.f14788b += i9;
    }
}
