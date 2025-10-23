package o6;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import v6.C1341f;
import v6.C1344i;
import v6.H;
import v6.InterfaceC1343h;
/* loaded from: classes.dex */
public final class v implements v6.F {

    /* renamed from: q  reason: collision with root package name */
    public final InterfaceC1343h f13071q;

    /* renamed from: r  reason: collision with root package name */
    public int f13072r;

    /* renamed from: s  reason: collision with root package name */
    public int f13073s;

    /* renamed from: t  reason: collision with root package name */
    public int f13074t;

    /* renamed from: u  reason: collision with root package name */
    public int f13075u;

    /* renamed from: v  reason: collision with root package name */
    public int f13076v;

    public v(InterfaceC1343h interfaceC1343h) {
        this.f13071q = interfaceC1343h;
    }

    @Override // v6.F
    public final long L(C1341f c1341f, long j7) {
        int i7;
        int readInt;
        M5.g.f(c1341f, "sink");
        do {
            int i8 = this.f13075u;
            InterfaceC1343h interfaceC1343h = this.f13071q;
            if (i8 == 0) {
                interfaceC1343h.p(this.f13076v);
                this.f13076v = 0;
                if ((this.f13073s & 4) != 0) {
                    return -1L;
                }
                i7 = this.f13074t;
                int t5 = i6.b.t(interfaceC1343h);
                this.f13075u = t5;
                this.f13072r = t5;
                int readByte = interfaceC1343h.readByte() & 255;
                this.f13073s = interfaceC1343h.readByte() & 255;
                Logger logger = w.f13077u;
                if (logger.isLoggable(Level.FINE)) {
                    C1344i c1344i = g.f13014a;
                    logger.fine(g.a(true, this.f13074t, this.f13072r, readByte, this.f13073s));
                }
                readInt = interfaceC1343h.readInt() & Integer.MAX_VALUE;
                this.f13074t = readInt;
                if (readByte != 9) {
                    throw new IOException(readByte + " != TYPE_CONTINUATION");
                }
            } else {
                long L6 = interfaceC1343h.L(c1341f, Math.min(j7, i8));
                if (L6 == -1) {
                    return -1L;
                }
                this.f13075u -= (int) L6;
                return L6;
            }
        } while (readInt == i7);
        throw new IOException("TYPE_CONTINUATION streamId changed");
    }

    @Override // v6.F
    public final H d() {
        return this.f13071q.d();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
