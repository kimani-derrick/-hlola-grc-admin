package b0;

import android.media.MediaDataSource;
import java.io.IOException;
/* renamed from: b0.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0349a extends MediaDataSource {

    /* renamed from: q  reason: collision with root package name */
    public long f6993q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ f f6994r;

    public C0349a(f fVar) {
        this.f6994r = fVar;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j7, byte[] bArr, int i7, int i8) {
        if (i8 == 0) {
            return 0;
        }
        if (j7 < 0) {
            return -1;
        }
        try {
            long j8 = this.f6993q;
            int i9 = (j8 > j7 ? 1 : (j8 == j7 ? 0 : -1));
            f fVar = this.f6994r;
            if (i9 != 0) {
                if (j8 >= 0 && j7 >= j8 + fVar.f6997q.available()) {
                    return -1;
                }
                fVar.b(j7);
                this.f6993q = j7;
            }
            if (i8 > fVar.f6997q.available()) {
                i8 = fVar.f6997q.available();
            }
            int read = fVar.read(bArr, i7, i8);
            if (read >= 0) {
                this.f6993q += read;
                return read;
            }
        } catch (IOException unused) {
        }
        this.f6993q = -1L;
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
