package t2;

import Z2.y;
import java.io.EOFException;
import k2.C0943h;
/* renamed from: t2.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1234e {

    /* renamed from: a  reason: collision with root package name */
    public final C1235f f14544a = new C1235f();

    /* renamed from: b  reason: collision with root package name */
    public final y f14545b = new y(0, new byte[65025]);

    /* renamed from: c  reason: collision with root package name */
    public int f14546c = -1;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f14547e;

    public final int a(int i7) {
        int i8;
        int i9 = 0;
        this.d = 0;
        do {
            int i10 = this.d;
            int i11 = i7 + i10;
            C1235f c1235f = this.f14544a;
            if (i11 >= c1235f.f14550c) {
                break;
            }
            int[] iArr = c1235f.f;
            this.d = i10 + 1;
            i8 = iArr[i10 + i7];
            i9 += i8;
        } while (i8 == 255);
        return i9;
    }

    public final boolean b(C0943h c0943h) {
        int i7;
        boolean z7 = this.f14547e;
        y yVar = this.f14545b;
        if (z7) {
            this.f14547e = false;
            yVar.C(0);
        }
        while (true) {
            boolean z8 = true;
            if (this.f14547e) {
                return true;
            }
            int i8 = this.f14546c;
            C1235f c1235f = this.f14544a;
            if (i8 < 0) {
                if (!c1235f.b(c0943h, -1L) || !c1235f.a(c0943h, true)) {
                    break;
                }
                int i9 = c1235f.d;
                if ((c1235f.f14548a & 1) == 1 && yVar.f4693c == 0) {
                    i9 += a(0);
                    i7 = this.d;
                } else {
                    i7 = 0;
                }
                try {
                    c0943h.d(i9);
                    this.f14546c = i7;
                } catch (EOFException unused) {
                }
            }
            int a7 = a(this.f14546c);
            int i10 = this.f14546c + this.d;
            if (a7 > 0) {
                yVar.b(yVar.f4693c + a7);
                try {
                    c0943h.e(yVar.f4691a, yVar.f4693c, a7, false);
                    yVar.E(yVar.f4693c + a7);
                    if (c1235f.f[i10 - 1] == 255) {
                        z8 = false;
                    }
                    this.f14547e = z8;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i10 == c1235f.f14550c) {
                i10 = -1;
            }
            this.f14546c = i10;
        }
        return false;
    }
}
