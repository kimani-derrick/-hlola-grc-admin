package H2;

import Y2.C0148q;
import Y2.InterfaceC0144m;
import Z2.AbstractC0156a;
import android.net.Uri;
import java.util.Map;
/* renamed from: H2.p  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0015p implements InterfaceC0144m {

    /* renamed from: q  reason: collision with root package name */
    public final InterfaceC0144m f1150q;

    /* renamed from: r  reason: collision with root package name */
    public final int f1151r;

    /* renamed from: s  reason: collision with root package name */
    public final O f1152s;

    /* renamed from: t  reason: collision with root package name */
    public final byte[] f1153t;

    /* renamed from: u  reason: collision with root package name */
    public int f1154u;

    public C0015p(Y2.V v5, int i7, O o7) {
        boolean z7;
        if (i7 > 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        AbstractC0156a.f(z7);
        this.f1150q = v5;
        this.f1151r = i7;
        this.f1152s = o7;
        this.f1153t = new byte[1];
        this.f1154u = i7;
    }

    @Override // Y2.InterfaceC0144m
    public final long c(C0148q c0148q) {
        throw new UnsupportedOperationException();
    }

    @Override // Y2.InterfaceC0144m
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // Y2.InterfaceC0144m
    public final Uri g() {
        return this.f1150q.g();
    }

    @Override // Y2.InterfaceC0144m
    public final void m(Y2.W w7) {
        w7.getClass();
        this.f1150q.m(w7);
    }

    @Override // Y2.InterfaceC0144m
    public final Map n() {
        return this.f1150q.n();
    }

    @Override // Y2.InterfaceC0141j
    public final int r(byte[] bArr, int i7, int i8) {
        long max;
        int i9 = this.f1154u;
        InterfaceC0144m interfaceC0144m = this.f1150q;
        if (i9 == 0) {
            byte[] bArr2 = this.f1153t;
            int i10 = 0;
            if (interfaceC0144m.r(bArr2, 0, 1) != -1) {
                int i11 = (bArr2[0] & 255) << 4;
                if (i11 != 0) {
                    byte[] bArr3 = new byte[i11];
                    int i12 = i11;
                    while (i12 > 0) {
                        int r3 = interfaceC0144m.r(bArr3, i10, i12);
                        if (r3 != -1) {
                            i10 += r3;
                            i12 -= r3;
                        }
                    }
                    while (i11 > 0 && bArr3[i11 - 1] == 0) {
                        i11--;
                    }
                    if (i11 > 0) {
                        Z2.y yVar = new Z2.y(i11, bArr3);
                        O o7 = this.f1152s;
                        if (!o7.f936l) {
                            max = o7.f933i;
                        } else {
                            max = Math.max(o7.f937m.k(true), o7.f933i);
                        }
                        long j7 = max;
                        int a7 = yVar.a();
                        c0 c0Var = o7.f935k;
                        c0Var.getClass();
                        c0Var.b(a7, yVar);
                        c0Var.c(j7, 1, a7, 0, null);
                        o7.f936l = true;
                    }
                }
                this.f1154u = this.f1151r;
            }
            return -1;
        }
        int r5 = interfaceC0144m.r(bArr, i7, Math.min(this.f1154u, i8));
        if (r5 != -1) {
            this.f1154u -= r5;
        }
        return r5;
    }
}
