package o2;

import H2.o0;
import Z2.AbstractC0156a;
import Z2.y;
import a3.C0201a;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import e2.C0593J;
import e2.K;
import k2.w;
/* renamed from: o2.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1066d extends P1.c {

    /* renamed from: r  reason: collision with root package name */
    public final y f12910r;

    /* renamed from: s  reason: collision with root package name */
    public final y f12911s;

    /* renamed from: t  reason: collision with root package name */
    public int f12912t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f12913u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f12914v;

    /* renamed from: w  reason: collision with root package name */
    public int f12915w;

    public C1066d(w wVar) {
        super(wVar);
        this.f12910r = new y(AbstractC0156a.d);
        this.f12911s = new y(4);
    }

    public final boolean E(y yVar) {
        int u7 = yVar.u();
        int i7 = (u7 >> 4) & 15;
        int i8 = u7 & 15;
        if (i8 == 7) {
            this.f12915w = i7;
            if (i7 != 5) {
                return true;
            }
            return false;
        }
        throw new o0(AbstractC0515y1.l("Video format not supported: ", i8));
    }

    public final boolean F(long j7, y yVar) {
        int i7;
        int u7 = yVar.u();
        byte[] bArr = yVar.f4691a;
        int i8 = yVar.f4692b;
        int i9 = (bArr[i8 + 1] & 255) << 8;
        yVar.f4692b = i8 + 3;
        long j8 = (((bArr[i8 + 2] & 255) | i9 | (((bArr[i8] & 255) << 24) >> 8)) * 1000) + j7;
        w wVar = (w) this.f2765q;
        if (u7 == 0 && !this.f12913u) {
            byte[] bArr2 = new byte[yVar.a()];
            y yVar2 = new y(bArr2);
            yVar.e(bArr2, 0, yVar.a());
            C0201a a7 = C0201a.a(yVar2);
            this.f12912t = a7.f5010b;
            C0593J c0593j = new C0593J();
            c0593j.f9605k = "video/avc";
            c0593j.f9602h = a7.f5015i;
            c0593j.f9609p = a7.f5011c;
            c0593j.f9610q = a7.d;
            c0593j.f9613t = a7.f5014h;
            c0593j.f9607m = a7.f5009a;
            wVar.e(new K(c0593j));
            this.f12913u = true;
            return false;
        } else if (u7 != 1 || !this.f12913u) {
            return false;
        } else {
            if (this.f12915w == 1) {
                i7 = 1;
            } else {
                i7 = 0;
            }
            if (!this.f12914v && i7 == 0) {
                return false;
            }
            y yVar3 = this.f12911s;
            byte[] bArr3 = yVar3.f4691a;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[2] = 0;
            int i10 = 4 - this.f12912t;
            int i11 = 0;
            while (yVar.a() > 0) {
                yVar.e(yVar3.f4691a, i10, this.f12912t);
                yVar3.F(0);
                int x7 = yVar3.x();
                y yVar4 = this.f12910r;
                yVar4.F(0);
                wVar.d(4, yVar4);
                wVar.d(x7, yVar);
                i11 = i11 + 4 + x7;
            }
            ((w) this.f2765q).c(j8, i7, i11, 0, null);
            this.f12914v = true;
            return true;
        }
    }
}
