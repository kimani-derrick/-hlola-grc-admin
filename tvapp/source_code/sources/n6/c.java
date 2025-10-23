package n6;

import M5.g;
import U5.n;
import h6.r;
import h6.t;
import h6.z;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import l6.k;
import v6.C1341f;
import v6.InterfaceC1343h;
/* loaded from: classes.dex */
public final class c extends a {

    /* renamed from: t  reason: collision with root package name */
    public final t f12769t;

    /* renamed from: u  reason: collision with root package name */
    public long f12770u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f12771v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ O4.a f12772w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(O4.a aVar, t tVar) {
        super(aVar);
        g.f(aVar, "this$0");
        g.f(tVar, "url");
        this.f12772w = aVar;
        this.f12769t = tVar;
        this.f12770u = -1L;
        this.f12771v = true;
    }

    @Override // n6.a, v6.F
    public final long L(C1341f c1341f, long j7) {
        g.f(c1341f, "sink");
        if (j7 >= 0) {
            if (!this.f12764r) {
                if (!this.f12771v) {
                    return -1L;
                }
                long j8 = this.f12770u;
                int i7 = (j8 > 0L ? 1 : (j8 == 0L ? 0 : -1));
                O4.a aVar = this.f12772w;
                if (i7 == 0 || j8 == -1) {
                    if (j8 != -1) {
                        ((InterfaceC1343h) aVar.d).D();
                    }
                    try {
                        this.f12770u = ((InterfaceC1343h) aVar.d).Q();
                        String obj = U5.f.C0(((InterfaceC1343h) aVar.d).D()).toString();
                        if (this.f12770u >= 0 && (obj.length() <= 0 || n.b0(obj, ";", false))) {
                            if (this.f12770u == 0) {
                                this.f12771v = false;
                                aVar.f2721g = ((M2.e) aVar.f).A();
                                z zVar = (z) aVar.f2718b;
                                g.c(zVar);
                                r rVar = (r) aVar.f2721g;
                                g.c(rVar);
                                m6.d.b(zVar.f11273z, this.f12769t, rVar);
                                a();
                            }
                            if (!this.f12771v) {
                                return -1L;
                            }
                        } else {
                            throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f12770u + obj + '\"');
                        }
                    } catch (NumberFormatException e3) {
                        throw new ProtocolException(e3.getMessage());
                    }
                }
                long L6 = super.L(c1341f, Math.min(j7, this.f12770u));
                if (L6 != -1) {
                    this.f12770u -= L6;
                    return L6;
                }
                ((k) aVar.f2719c).l();
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
        if (this.f12771v && !i6.b.h(this, TimeUnit.MILLISECONDS)) {
            ((k) this.f12772w.f2719c).l();
            a();
        }
        this.f12764r = true;
    }
}
