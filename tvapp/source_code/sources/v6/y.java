package v6;

import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public final class y implements InterfaceC1342g {

    /* renamed from: q  reason: collision with root package name */
    public final D f15424q;

    /* renamed from: r  reason: collision with root package name */
    public final C1341f f15425r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f15426s;

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, v6.f] */
    public y(D d) {
        M5.g.f(d, "sink");
        this.f15424q = d;
        this.f15425r = new Object();
    }

    @Override // v6.InterfaceC1342g
    public final InterfaceC1342g G(String str) {
        M5.g.f(str, "string");
        if (!this.f15426s) {
            this.f15425r.o0(str);
            a();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // v6.InterfaceC1342g
    public final InterfaceC1342g I(long j7) {
        if (!this.f15426s) {
            this.f15425r.j0(j7);
            a();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // v6.InterfaceC1342g
    public final InterfaceC1342g N(int i7) {
        if (!this.f15426s) {
            this.f15425r.i0(i7);
            a();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final InterfaceC1342g a() {
        if (!this.f15426s) {
            C1341f c1341f = this.f15425r;
            long r3 = c1341f.r();
            if (r3 > 0) {
                this.f15424q.v(c1341f, r3);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // v6.InterfaceC1342g
    public final C1341f c() {
        return this.f15425r;
    }

    @Override // v6.D, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        D d = this.f15424q;
        if (!this.f15426s) {
            try {
                C1341f c1341f = this.f15425r;
                long j7 = c1341f.f15388r;
                if (j7 > 0) {
                    d.v(c1341f, j7);
                }
                th = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                d.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                }
            }
            this.f15426s = true;
            if (th != null) {
                throw th;
            }
        }
    }

    @Override // v6.D
    public final H d() {
        return this.f15424q.d();
    }

    @Override // v6.InterfaceC1342g
    public final InterfaceC1342g e(byte[] bArr) {
        M5.g.f(bArr, "source");
        if (!this.f15426s) {
            C1341f c1341f = this.f15425r;
            c1341f.getClass();
            c1341f.g0(bArr, 0, bArr.length);
            a();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // v6.InterfaceC1342g, v6.D, java.io.Flushable
    public final void flush() {
        if (!this.f15426s) {
            C1341f c1341f = this.f15425r;
            long j7 = c1341f.f15388r;
            int i7 = (j7 > 0L ? 1 : (j7 == 0L ? 0 : -1));
            D d = this.f15424q;
            if (i7 > 0) {
                d.v(c1341f, j7);
            }
            d.flush();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // v6.InterfaceC1342g
    public final InterfaceC1342g g(byte[] bArr, int i7, int i8) {
        M5.g.f(bArr, "source");
        if (!this.f15426s) {
            this.f15425r.g0(bArr, i7, i8);
            a();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // v6.InterfaceC1342g
    public final InterfaceC1342g i(C1344i c1344i) {
        M5.g.f(c1344i, "byteString");
        if (!this.f15426s) {
            this.f15425r.f0(c1344i);
            a();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f15426s;
    }

    @Override // v6.InterfaceC1342g
    public final InterfaceC1342g k(long j7) {
        if (!this.f15426s) {
            this.f15425r.k0(j7);
            a();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // v6.InterfaceC1342g
    public final InterfaceC1342g q(int i7, int i8, String str) {
        M5.g.f(str, "string");
        if (!this.f15426s) {
            this.f15425r.n0(i7, i8, str);
            a();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // v6.InterfaceC1342g
    public final InterfaceC1342g s(int i7) {
        if (!this.f15426s) {
            this.f15425r.m0(i7);
            a();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final String toString() {
        return "buffer(" + this.f15424q + ')';
    }

    @Override // v6.D
    public final void v(C1341f c1341f, long j7) {
        M5.g.f(c1341f, "source");
        if (!this.f15426s) {
            this.f15425r.v(c1341f, j7);
            a();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // v6.InterfaceC1342g
    public final InterfaceC1342g w(int i7) {
        if (!this.f15426s) {
            this.f15425r.l0(i7);
            a();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        M5.g.f(byteBuffer, "source");
        if (!this.f15426s) {
            int write = this.f15425r.write(byteBuffer);
            a();
            return write;
        }
        throw new IllegalStateException("closed".toString());
    }
}
