package b0;

import java.io.InputStream;
/* loaded from: classes.dex */
public final class f extends C0350b {
    public f(InputStream inputStream) {
        super(inputStream);
        if (!inputStream.markSupported()) {
            throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        }
        this.f6997q.mark(Integer.MAX_VALUE);
    }

    public final void b(long j7) {
        int i7 = this.f6999s;
        if (i7 > j7) {
            this.f6999s = 0;
            this.f6997q.reset();
        } else {
            j7 -= i7;
        }
        a((int) j7);
    }

    public f(byte[] bArr) {
        super(bArr);
        this.f6997q.mark(Integer.MAX_VALUE);
    }
}
