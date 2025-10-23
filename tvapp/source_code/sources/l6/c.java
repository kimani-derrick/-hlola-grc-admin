package l6;

import f5.C0700a;
import java.io.IOException;
import java.net.ProtocolException;
import v6.C1341f;
import v6.D;
/* loaded from: classes.dex */
public final class c extends v6.l {

    /* renamed from: r  reason: collision with root package name */
    public final long f12302r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f12303s;

    /* renamed from: t  reason: collision with root package name */
    public long f12304t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f12305u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ C0700a f12306v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(C0700a c0700a, D d, long j7) {
        super(d);
        M5.g.f(c0700a, "this$0");
        M5.g.f(d, "delegate");
        this.f12306v = c0700a;
        this.f12302r = j7;
    }

    public final IOException a(IOException iOException) {
        if (this.f12303s) {
            return iOException;
        }
        this.f12303s = true;
        return this.f12306v.a(false, true, iOException);
    }

    @Override // v6.l, v6.D, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f12305u) {
            return;
        }
        this.f12305u = true;
        long j7 = this.f12302r;
        if (j7 != -1 && this.f12304t != j7) {
            throw new ProtocolException("unexpected end of stream");
        }
        try {
            super.close();
            a(null);
        } catch (IOException e3) {
            throw a(e3);
        }
    }

    @Override // v6.l, v6.D, java.io.Flushable
    public final void flush() {
        try {
            super.flush();
        } catch (IOException e3) {
            throw a(e3);
        }
    }

    @Override // v6.l, v6.D
    public final void v(C1341f c1341f, long j7) {
        M5.g.f(c1341f, "source");
        if (!this.f12305u) {
            long j8 = this.f12302r;
            if (j8 != -1 && this.f12304t + j7 > j8) {
                throw new ProtocolException("expected " + j8 + " bytes but received " + (this.f12304t + j7));
            }
            try {
                super.v(c1341f, j7);
                this.f12304t += j7;
                return;
            } catch (IOException e3) {
                throw a(e3);
            }
        }
        throw new IllegalStateException("closed".toString());
    }
}
