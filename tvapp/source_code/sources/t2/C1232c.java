package t2;

import H2.X;
import Z2.y;
import a.AbstractC0189a;
import androidx.fragment.app.D;
import e2.K;
import java.util.Arrays;
import k2.C0951p;
/* renamed from: t2.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1232c extends j {
    public C0951p n;

    /* renamed from: o  reason: collision with root package name */
    public X f14540o;

    @Override // t2.j
    public final long b(y yVar) {
        byte[] bArr = yVar.f4691a;
        if (bArr[0] == -1) {
            int i7 = (bArr[2] & 255) >> 4;
            if (i7 == 6 || i7 == 7) {
                yVar.G(4);
                yVar.A();
            }
            int E4 = AbstractC0189a.E(i7, yVar);
            yVar.F(0);
            return E4;
        }
        return -1L;
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [H2.X, java.lang.Object] */
    @Override // t2.j
    public final boolean c(y yVar, long j7, i iVar) {
        byte[] bArr = yVar.f4691a;
        C0951p c0951p = this.n;
        if (c0951p == null) {
            C0951p c0951p2 = new C0951p(17, bArr);
            this.n = c0951p2;
            iVar.f14556r = c0951p2.c(Arrays.copyOfRange(bArr, 9, yVar.f4693c), null);
            return true;
        }
        byte b7 = bArr[0];
        if ((b7 & Byte.MAX_VALUE) == 3) {
            D y0 = android.support.v4.media.session.b.y0(yVar);
            C0951p c0951p3 = new C0951p(c0951p.f12178a, c0951p.f12179b, c0951p.f12180c, c0951p.d, c0951p.f12181e, c0951p.f12182g, c0951p.f12183h, c0951p.f12185j, y0, c0951p.f12187l);
            this.n = c0951p3;
            ?? obj = new Object();
            obj.f999s = c0951p3;
            obj.f1000t = y0;
            obj.f997q = -1L;
            obj.f998r = -1L;
            this.f14540o = obj;
            return true;
        } else if (b7 != -1) {
            return true;
        } else {
            X x7 = this.f14540o;
            if (x7 != null) {
                x7.f997q = j7;
                iVar.f14557s = x7;
            }
            ((K) iVar.f14556r).getClass();
            return false;
        }
    }

    @Override // t2.j
    public final void d(boolean z7) {
        super.d(z7);
        if (z7) {
            this.n = null;
            this.f14540o = null;
        }
    }
}
