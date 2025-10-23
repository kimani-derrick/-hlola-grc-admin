package J4;

import java.io.OutputStream;
/* loaded from: classes.dex */
public final class b extends OutputStream {

    /* renamed from: q  reason: collision with root package name */
    public long f1425q;

    @Override // java.io.OutputStream
    public final void write(int i7) {
        this.f1425q++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f1425q += bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i7, int i8) {
        int i9;
        if (i7 < 0 || i7 > bArr.length || i8 < 0 || (i9 = i7 + i8) > bArr.length || i9 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.f1425q += i8;
    }
}
