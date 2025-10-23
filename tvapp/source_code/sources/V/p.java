package V;

import java.io.FileOutputStream;
import java.io.OutputStream;
/* loaded from: classes.dex */
public final class p extends OutputStream {

    /* renamed from: q  reason: collision with root package name */
    public final FileOutputStream f3564q;

    public p(FileOutputStream fileOutputStream) {
        this.f3564q = fileOutputStream;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        this.f3564q.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i7) {
        this.f3564q.write(i7);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        M5.g.f(bArr, "b");
        this.f3564q.write(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i7, int i8) {
        M5.g.f(bArr, "bytes");
        this.f3564q.write(bArr, i7, i8);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
