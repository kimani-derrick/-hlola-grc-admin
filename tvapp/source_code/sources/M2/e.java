package M2;

import O3.C;
import O3.E;
import O3.U;
import Z2.AbstractC0156a;
import android.os.SystemClock;
import g3.n;
import h6.q;
import h6.r;
import j3.C0837a;
import java.util.List;
import k2.C0943h;
import k2.InterfaceC0947l;
import k2.InterfaceC0948m;
import k2.InterfaceC0955t;
import k2.w;
import v6.InterfaceC1343h;
import x2.C1461c;
/* loaded from: classes.dex */
public final class e implements h, InterfaceC0947l, InterfaceC0948m {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f2259q;

    /* renamed from: r  reason: collision with root package name */
    public long f2260r;

    /* renamed from: s  reason: collision with root package name */
    public Object f2261s;

    public e(int i7) {
        this.f2259q = i7;
        switch (i7) {
            case 8:
                this.f2260r = 0L;
                return;
            default:
                return;
        }
    }

    public r A() {
        q qVar = new q(0);
        while (true) {
            String o7 = ((InterfaceC1343h) this.f2261s).o(this.f2260r);
            this.f2260r -= o7.length();
            if (o7.length() == 0) {
                return qVar.c();
            }
            int i02 = U5.f.i0(o7, ':', 1, false, 4);
            if (i02 != -1) {
                String substring = o7.substring(0, i02);
                M5.g.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                String substring2 = o7.substring(i02 + 1);
                M5.g.e(substring2, "this as java.lang.String).substring(startIndex)");
                qVar.b(substring, substring2);
            } else {
                if (o7.charAt(0) == ':') {
                    o7 = o7.substring(1);
                    M5.g.e(o7, "this as java.lang.String).substring(startIndex)");
                }
                qVar.b("", o7);
            }
        }
    }

    public boolean B(int i7) {
        boolean z7;
        if (i7 >= 64) {
            x();
            return ((e) this.f2261s).B(i7 - 64);
        }
        long j7 = 1 << i7;
        long j8 = this.f2260r;
        if ((j8 & j7) != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        long j9 = j8 & (~j7);
        this.f2260r = j9;
        long j10 = j7 - 1;
        this.f2260r = (j9 & j10) | Long.rotateRight((~j10) & j9, 1);
        e eVar = (e) this.f2261s;
        if (eVar != null) {
            if (eVar.y(0)) {
                D(63);
            }
            ((e) this.f2261s).B(0);
        }
        return z7;
    }

    public void C() {
        this.f2260r = 0L;
        e eVar = (e) this.f2261s;
        if (eVar != null) {
            eVar.C();
        }
    }

    public void D(int i7) {
        if (i7 >= 64) {
            x();
            ((e) this.f2261s).D(i7 - 64);
            return;
        }
        this.f2260r |= 1 << i7;
    }

    public void E(Exception exc) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (((Exception) this.f2261s) == null) {
            this.f2261s = exc;
            this.f2260r = 100 + elapsedRealtime;
        }
        if (elapsedRealtime >= this.f2260r) {
            Exception exc2 = (Exception) this.f2261s;
            if (exc2 != exc) {
                exc2.addSuppressed(exc);
            }
            Exception exc3 = (Exception) this.f2261s;
            this.f2261s = null;
            throw exc3;
        }
    }

    @Override // M2.h
    public int a(long j7) {
        if (this.f2260r > j7) {
            return 0;
        }
        return -1;
    }

    @Override // k2.InterfaceC0947l
    public void b() {
        ((InterfaceC0947l) this.f2261s).b();
    }

    @Override // k2.InterfaceC0947l
    public void d(int i7) {
        ((InterfaceC0947l) this.f2261s).d(i7);
    }

    @Override // k2.InterfaceC0947l
    public boolean e(byte[] bArr, int i7, int i8, boolean z7) {
        return ((InterfaceC0947l) this.f2261s).e(bArr, i7, i8, z7);
    }

    @Override // k2.InterfaceC0947l
    public long f() {
        return ((InterfaceC0947l) this.f2261s).f() - this.f2260r;
    }

    @Override // M2.h
    public List h(long j7) {
        if (j7 >= this.f2260r) {
            return (E) this.f2261s;
        }
        C c5 = E.f2597r;
        return U.f2621u;
    }

    @Override // k2.InterfaceC0947l
    public boolean i(byte[] bArr, int i7, int i8, boolean z7) {
        return ((InterfaceC0947l) this.f2261s).i(bArr, i7, i8, z7);
    }

    @Override // k2.InterfaceC0947l
    public long j() {
        return ((InterfaceC0947l) this.f2261s).j() - this.f2260r;
    }

    @Override // M2.h
    public long k(int i7) {
        boolean z7;
        if (i7 == 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        AbstractC0156a.f(z7);
        return this.f2260r;
    }

    @Override // k2.InterfaceC0948m
    public void l() {
        ((InterfaceC0948m) this.f2261s).l();
    }

    @Override // k2.InterfaceC0947l
    public void o(byte[] bArr, int i7, int i8) {
        ((InterfaceC0947l) this.f2261s).o(bArr, i7, i8);
    }

    @Override // k2.InterfaceC0947l
    public void p(int i7) {
        ((InterfaceC0947l) this.f2261s).p(i7);
    }

    @Override // k2.InterfaceC0948m
    public w q(int i7, int i8) {
        return ((InterfaceC0948m) this.f2261s).q(i7, i8);
    }

    @Override // Y2.InterfaceC0141j
    public int r(byte[] bArr, int i7, int i8) {
        return ((InterfaceC0947l) this.f2261s).r(bArr, i7, i8);
    }

    @Override // k2.InterfaceC0947l
    public void readFully(byte[] bArr, int i7, int i8) {
        ((InterfaceC0947l) this.f2261s).readFully(bArr, i7, i8);
    }

    @Override // k2.InterfaceC0947l
    public long s() {
        return ((InterfaceC0947l) this.f2261s).s() - this.f2260r;
    }

    @Override // k2.InterfaceC0948m
    public void t(InterfaceC0955t interfaceC0955t) {
        ((InterfaceC0948m) this.f2261s).t(new p2.c(this, interfaceC0955t));
    }

    public String toString() {
        switch (this.f2259q) {
            case 8:
                if (((e) this.f2261s) == null) {
                    return Long.toBinaryString(this.f2260r);
                }
                return ((e) this.f2261s).toString() + "xx" + Long.toBinaryString(this.f2260r);
            default:
                return super.toString();
        }
    }

    @Override // M2.h
    public int u() {
        return 1;
    }

    public void v(int i7) {
        if (i7 >= 64) {
            e eVar = (e) this.f2261s;
            if (eVar != null) {
                eVar.v(i7 - 64);
                return;
            }
            return;
        }
        this.f2260r &= ~(1 << i7);
    }

    public int w(int i7) {
        long j7;
        e eVar = (e) this.f2261s;
        if (eVar == null) {
            if (i7 >= 64) {
                j7 = this.f2260r;
                return Long.bitCount(j7);
            }
        } else if (i7 >= 64) {
            return Long.bitCount(this.f2260r) + eVar.w(i7 - 64);
        }
        j7 = this.f2260r & ((1 << i7) - 1);
        return Long.bitCount(j7);
    }

    public void x() {
        if (((e) this.f2261s) == null) {
            this.f2261s = new e(8);
        }
    }

    public boolean y(int i7) {
        if (i7 >= 64) {
            x();
            return ((e) this.f2261s).y(i7 - 64);
        } else if ((this.f2260r & (1 << i7)) != 0) {
            return true;
        } else {
            return false;
        }
    }

    public void z(int i7, boolean z7) {
        boolean z8;
        if (i7 >= 64) {
            x();
            ((e) this.f2261s).z(i7 - 64, z7);
            return;
        }
        long j7 = this.f2260r;
        if ((Long.MIN_VALUE & j7) != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        long j8 = (1 << i7) - 1;
        this.f2260r = ((j7 & (~j8)) << 1) | (j7 & j8);
        if (z7) {
            D(i7);
        } else {
            v(i7);
        }
        if (z8 || ((e) this.f2261s) != null) {
            x();
            ((e) this.f2261s).z(0, z8);
        }
    }

    public /* synthetic */ e(int i7, long j7, Object obj) {
        this.f2259q = i7;
        this.f2260r = j7;
        this.f2261s = obj;
    }

    public e(C0837a c0837a) {
        this.f2259q = 7;
        n.g(c0837a);
        this.f2261s = c0837a;
    }

    public e(C0943h c0943h, long j7) {
        this.f2259q = 4;
        this.f2261s = c0943h;
        AbstractC0156a.f(c0943h.f12166t >= j7);
        this.f2260r = j7;
    }

    public e(InterfaceC1343h interfaceC1343h) {
        this.f2259q = 2;
        this.f2261s = interfaceC1343h;
        this.f2260r = 262144L;
    }

    public e(C1461c c1461c, long j7) {
        this.f2259q = 6;
        this.f2261s = c1461c;
        this.f2260r = j7;
    }
}
