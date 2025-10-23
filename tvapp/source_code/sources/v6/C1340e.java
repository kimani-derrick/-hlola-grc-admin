package v6;

import a.AbstractC0189a;
import java.io.IOException;
import java.io.InputStream;
/* renamed from: v6.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1340e extends InputStream {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f15385q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ InterfaceC1343h f15386r;

    public /* synthetic */ C1340e(InterfaceC1343h interfaceC1343h, int i7) {
        this.f15385q = i7;
        this.f15386r = interfaceC1343h;
    }

    @Override // java.io.InputStream
    public final int available() {
        switch (this.f15385q) {
            case 0:
                return (int) Math.min(((C1341f) this.f15386r).f15388r, Integer.MAX_VALUE);
            default:
                z zVar = (z) this.f15386r;
                if (!zVar.f15429s) {
                    return (int) Math.min(zVar.f15428r.f15388r, Integer.MAX_VALUE);
                }
                throw new IOException("closed");
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f15385q) {
            case 0:
                return;
            default:
                ((z) this.f15386r).close();
                return;
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        switch (this.f15385q) {
            case 0:
                C1341f c1341f = (C1341f) this.f15386r;
                if (c1341f.f15388r > 0) {
                    return c1341f.readByte() & 255;
                }
                return -1;
            default:
                z zVar = (z) this.f15386r;
                if (zVar.f15429s) {
                    throw new IOException("closed");
                }
                C1341f c1341f2 = zVar.f15428r;
                if (c1341f2.f15388r == 0 && zVar.f15427q.L(c1341f2, 8192L) == -1) {
                    return -1;
                }
                return zVar.f15428r.readByte() & 255;
        }
    }

    public final String toString() {
        switch (this.f15385q) {
            case 0:
                return ((C1341f) this.f15386r) + ".inputStream()";
            default:
                return ((z) this.f15386r) + ".inputStream()";
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i7, int i8) {
        switch (this.f15385q) {
            case 0:
                M5.g.f(bArr, "sink");
                return ((C1341f) this.f15386r).X(bArr, i7, i8);
            default:
                M5.g.f(bArr, "data");
                z zVar = (z) this.f15386r;
                if (zVar.f15429s) {
                    throw new IOException("closed");
                }
                AbstractC0189a.m(bArr.length, i7, i8);
                C1341f c1341f = zVar.f15428r;
                if (c1341f.f15388r == 0 && zVar.f15427q.L(c1341f, 8192L) == -1) {
                    return -1;
                }
                return zVar.f15428r.X(bArr, i7, i8);
        }
    }

    private final void a() {
    }
}
