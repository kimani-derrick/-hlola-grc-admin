package l6;

import f5.C0700a;
import java.io.IOException;
import java.net.ProtocolException;
import v6.C1341f;
import v6.F;
/* loaded from: classes.dex */
public final class d extends v6.m {

    /* renamed from: r  reason: collision with root package name */
    public final long f12307r;

    /* renamed from: s  reason: collision with root package name */
    public long f12308s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f12309t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f12310u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f12311v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ C0700a f12312w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(C0700a c0700a, F f, long j7) {
        super(f);
        M5.g.f(c0700a, "this$0");
        M5.g.f(f, "delegate");
        this.f12312w = c0700a;
        this.f12307r = j7;
        this.f12309t = true;
        if (j7 == 0) {
            a(null);
        }
    }

    @Override // v6.m, v6.F
    public final long L(C1341f c1341f, long j7) {
        M5.g.f(c1341f, "sink");
        if (!this.f12311v) {
            try {
                long L6 = this.f15398q.L(c1341f, j7);
                if (this.f12309t) {
                    this.f12309t = false;
                    C0700a c0700a = this.f12312w;
                    ((h6.n) c0700a.d).getClass();
                    M5.g.f((i) c0700a.f10431c, "call");
                }
                if (L6 == -1) {
                    a(null);
                    return -1L;
                }
                long j8 = this.f12308s + L6;
                long j9 = this.f12307r;
                if (j9 != -1 && j8 > j9) {
                    throw new ProtocolException("expected " + j9 + " bytes but received " + j8);
                }
                this.f12308s = j8;
                if (j8 == j9) {
                    a(null);
                }
                return L6;
            } catch (IOException e3) {
                throw a(e3);
            }
        }
        throw new IllegalStateException("closed".toString());
    }

    public final IOException a(IOException iOException) {
        if (this.f12310u) {
            return iOException;
        }
        this.f12310u = true;
        C0700a c0700a = this.f12312w;
        if (iOException == null && this.f12309t) {
            this.f12309t = false;
            ((h6.n) c0700a.d).getClass();
            M5.g.f((i) c0700a.f10431c, "call");
        }
        return c0700a.a(true, false, iOException);
    }

    @Override // v6.m, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f12311v) {
            return;
        }
        this.f12311v = true;
        try {
            super.close();
            a(null);
        } catch (IOException e3) {
            throw a(e3);
        }
    }
}
