package v4;

import java.io.InputStream;
/* renamed from: v4.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1331i extends InputStream {

    /* renamed from: q  reason: collision with root package name */
    public int f15339q;

    /* renamed from: r  reason: collision with root package name */
    public int f15340r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ C1333k f15341s;

    public C1331i(C1333k c1333k, C1330h c1330h) {
        this.f15341s = c1333k;
        this.f15339q = c1333k.W(c1330h.f15337a + 4);
        this.f15340r = c1330h.f15338b;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.f15340r == 0) {
            return -1;
        }
        C1333k c1333k = this.f15341s;
        c1333k.f15343q.seek(this.f15339q);
        int read = c1333k.f15343q.read();
        this.f15339q = c1333k.W(this.f15339q + 1);
        this.f15340r--;
        return read;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i7, int i8) {
        if (bArr != null) {
            if ((i7 | i8) < 0 || i8 > bArr.length - i7) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i9 = this.f15340r;
            if (i9 > 0) {
                if (i8 > i9) {
                    i8 = i9;
                }
                int i10 = this.f15339q;
                C1333k c1333k = this.f15341s;
                c1333k.y(i10, i7, i8, bArr);
                this.f15339q = c1333k.W(this.f15339q + i8);
                this.f15340r -= i8;
                return i8;
            }
            return -1;
        }
        throw new NullPointerException("buffer");
    }
}
