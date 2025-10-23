package u2;

import Z2.AbstractC0156a;
import e2.C0593J;
import e2.K;
import java.util.Collections;
import java.util.List;
import k2.InterfaceC0948m;
/* renamed from: u2.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1271g implements h {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14781a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f14782b;

    /* renamed from: c  reason: collision with root package name */
    public long f14783c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public int f14784e;
    public final Object f;

    /* renamed from: g  reason: collision with root package name */
    public Object f14785g;

    public C1271g() {
        this.f14781a = 1;
        this.f = new Z2.y(10);
        this.f14783c = -9223372036854775807L;
    }

    @Override // u2.h
    public final void a() {
        switch (this.f14781a) {
            case 0:
                this.f14782b = false;
                this.f14783c = -9223372036854775807L;
                return;
            default:
                this.f14782b = false;
                this.f14783c = -9223372036854775807L;
                return;
        }
    }

    @Override // u2.h
    public final void c(Z2.y yVar) {
        k2.w[] wVarArr;
        switch (this.f14781a) {
            case 0:
                if (this.f14782b) {
                    if (this.d == 2) {
                        if (yVar.a() != 0) {
                            if (yVar.u() != 32) {
                                this.f14782b = false;
                            }
                            this.d--;
                            if (!this.f14782b) {
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    if (this.d == 1) {
                        if (yVar.a() != 0) {
                            if (yVar.u() != 0) {
                                this.f14782b = false;
                            }
                            this.d--;
                            if (!this.f14782b) {
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    int i7 = yVar.f4692b;
                    int a7 = yVar.a();
                    for (k2.w wVar : (k2.w[]) this.f14785g) {
                        yVar.F(i7);
                        wVar.d(a7, yVar);
                    }
                    this.f14784e += a7;
                    return;
                }
                return;
            default:
                AbstractC0156a.l((k2.w) this.f14785g);
                if (this.f14782b) {
                    int a8 = yVar.a();
                    int i8 = this.f14784e;
                    if (i8 < 10) {
                        int min = Math.min(a8, 10 - i8);
                        byte[] bArr = yVar.f4691a;
                        int i9 = yVar.f4692b;
                        Z2.y yVar2 = (Z2.y) this.f;
                        System.arraycopy(bArr, i9, yVar2.f4691a, this.f14784e, min);
                        if (this.f14784e + min == 10) {
                            yVar2.F(0);
                            if (73 == yVar2.u() && 68 == yVar2.u() && 51 == yVar2.u()) {
                                yVar2.G(3);
                                this.d = yVar2.t() + 10;
                            } else {
                                AbstractC0156a.K("Id3Reader", "Discarding invalid ID3 tag");
                                this.f14782b = false;
                                return;
                            }
                        }
                    }
                    int min2 = Math.min(a8, this.d - this.f14784e);
                    ((k2.w) this.f14785g).d(min2, yVar);
                    this.f14784e += min2;
                    return;
                }
                return;
        }
    }

    @Override // u2.h
    public final void d() {
        int i7;
        switch (this.f14781a) {
            case 0:
                if (this.f14782b) {
                    if (this.f14783c != -9223372036854775807L) {
                        for (k2.w wVar : (k2.w[]) this.f14785g) {
                            wVar.c(this.f14783c, 1, this.f14784e, 0, null);
                        }
                    }
                    this.f14782b = false;
                    return;
                }
                return;
            default:
                AbstractC0156a.l((k2.w) this.f14785g);
                if (this.f14782b && (i7 = this.d) != 0 && this.f14784e == i7) {
                    long j7 = this.f14783c;
                    if (j7 != -9223372036854775807L) {
                        ((k2.w) this.f14785g).c(j7, 1, i7, 0, null);
                    }
                    this.f14782b = false;
                    return;
                }
                return;
        }
    }

    @Override // u2.h
    public final void e(long j7, int i7) {
        switch (this.f14781a) {
            case 0:
                if ((i7 & 4) != 0) {
                    this.f14782b = true;
                    if (j7 != -9223372036854775807L) {
                        this.f14783c = j7;
                    }
                    this.f14784e = 0;
                    this.d = 2;
                    return;
                }
                return;
            default:
                if ((i7 & 4) != 0) {
                    this.f14782b = true;
                    if (j7 != -9223372036854775807L) {
                        this.f14783c = j7;
                    }
                    this.d = 0;
                    this.f14784e = 0;
                    return;
                }
                return;
        }
    }

    @Override // u2.h
    public final void f(InterfaceC0948m interfaceC0948m, F f) {
        switch (this.f14781a) {
            case 0:
                int i7 = 0;
                while (true) {
                    k2.w[] wVarArr = (k2.w[]) this.f14785g;
                    if (i7 < wVarArr.length) {
                        E e3 = (E) ((List) this.f).get(i7);
                        f.a();
                        f.b();
                        k2.w q5 = interfaceC0948m.q(f.d, 3);
                        C0593J c0593j = new C0593J();
                        f.b();
                        c0593j.f9597a = f.f14725e;
                        c0593j.f9605k = "application/dvbsubs";
                        c0593j.f9607m = Collections.singletonList(e3.f14721b);
                        c0593j.f9599c = e3.f14720a;
                        q5.e(new K(c0593j));
                        wVarArr[i7] = q5;
                        i7++;
                    } else {
                        return;
                    }
                }
            default:
                f.a();
                f.b();
                k2.w q7 = interfaceC0948m.q(f.d, 5);
                this.f14785g = q7;
                C0593J c0593j2 = new C0593J();
                f.b();
                c0593j2.f9597a = f.f14725e;
                c0593j2.f9605k = "application/id3";
                q7.e(new K(c0593j2));
                return;
        }
    }

    public C1271g(List list) {
        this.f14781a = 0;
        this.f = list;
        this.f14785g = new k2.w[list.size()];
        this.f14783c = -9223372036854775807L;
    }
}
