package n6;

import M5.g;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import l6.k;
import v6.C1341f;
/* loaded from: classes.dex */
public final class d extends a {

    /* renamed from: t  reason: collision with root package name */
    public long f12773t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ O4.a f12774u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(O4.a aVar, long j7) {
        super(aVar);
        g.f(aVar, "this$0");
        this.f12774u = aVar;
        this.f12773t = j7;
        if (j7 == 0) {
            a();
        }
    }

    @Override // n6.a, v6.F
    public final long L(C1341f c1341f, long j7) {
        g.f(c1341f, "sink");
        if (j7 >= 0) {
            if (!this.f12764r) {
                long j8 = this.f12773t;
                if (j8 == 0) {
                    return -1L;
                }
                long L6 = super.L(c1341f, Math.min(j8, j7));
                if (L6 != -1) {
                    long j9 = this.f12773t - L6;
                    this.f12773t = j9;
                    if (j9 == 0) {
                        a();
                    }
                    return L6;
                }
                ((k) this.f12774u.f2719c).l();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                a();
                throw protocolException;
            }
            throw new IllegalStateException("closed".toString());
        }
        throw new IllegalArgumentException(g.k(Long.valueOf(j7), "byteCount < 0: ").toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f12764r) {
            return;
        }
        if (this.f12773t != 0 && !i6.b.h(this, TimeUnit.MILLISECONDS)) {
            ((k) this.f12774u.f2719c).l();
            a();
        }
        this.f12764r = true;
    }
}
