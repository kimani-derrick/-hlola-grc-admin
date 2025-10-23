package K0;

import java.io.InputStream;
/* loaded from: classes.dex */
public final class h extends InputStream {

    /* renamed from: q  reason: collision with root package name */
    public final InputStream f1532q;

    /* renamed from: r  reason: collision with root package name */
    public int f1533r = 1073741824;

    public h(InputStream inputStream) {
        this.f1532q = inputStream;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f1533r;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f1532q.close();
    }

    @Override // java.io.InputStream
    public final int read() {
        int read = this.f1532q.read();
        if (read == -1) {
            this.f1533r = 0;
        }
        return read;
    }

    @Override // java.io.InputStream
    public final long skip(long j7) {
        return this.f1532q.skip(j7);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        int read = this.f1532q.read(bArr);
        if (read == -1) {
            this.f1533r = 0;
        }
        return read;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i7, int i8) {
        int read = this.f1532q.read(bArr, i7, i8);
        if (read == -1) {
            this.f1533r = 0;
        }
        return read;
    }
}
