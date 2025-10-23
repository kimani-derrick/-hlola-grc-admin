package Y2;

import Z2.AbstractC0156a;
import java.io.InputStream;
/* renamed from: Y2.o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0146o extends InputStream {

    /* renamed from: q  reason: collision with root package name */
    public final InterfaceC0144m f4408q;

    /* renamed from: r  reason: collision with root package name */
    public final C0148q f4409r;

    /* renamed from: t  reason: collision with root package name */
    public boolean f4411t = false;

    /* renamed from: u  reason: collision with root package name */
    public boolean f4412u = false;

    /* renamed from: s  reason: collision with root package name */
    public final byte[] f4410s = new byte[1];

    public C0146o(InterfaceC0144m interfaceC0144m, C0148q c0148q) {
        this.f4408q = interfaceC0144m;
        this.f4409r = c0148q;
    }

    public final void a() {
        if (!this.f4411t) {
            this.f4408q.c(this.f4409r);
            this.f4411t = true;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!this.f4412u) {
            this.f4408q.close();
            this.f4412u = true;
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f4410s;
        if (read(bArr, 0, bArr.length) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i7, int i8) {
        AbstractC0156a.k(!this.f4412u);
        a();
        int r3 = this.f4408q.r(bArr, i7, i8);
        if (r3 == -1) {
            return -1;
        }
        return r3;
    }
}
