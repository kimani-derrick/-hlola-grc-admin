package t2;

import O3.E;
import Z2.AbstractC0156a;
import Z2.y;
import e2.C0593J;
import e2.K;
import g2.AbstractC0710a;
import java.util.ArrayList;
import java.util.Arrays;
import x2.C1461c;
/* loaded from: classes.dex */
public final class h extends j {

    /* renamed from: o  reason: collision with root package name */
    public static final byte[] f14553o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: p  reason: collision with root package name */
    public static final byte[] f14554p = {79, 112, 117, 115, 84, 97, 103, 115};
    public boolean n;

    public static boolean e(y yVar, byte[] bArr) {
        if (yVar.a() < bArr.length) {
            return false;
        }
        int i7 = yVar.f4692b;
        byte[] bArr2 = new byte[bArr.length];
        yVar.e(bArr2, 0, bArr.length);
        yVar.F(i7);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // t2.j
    public final long b(y yVar) {
        byte[] bArr = yVar.f4691a;
        byte b7 = 0;
        byte b8 = bArr[0];
        if (bArr.length > 1) {
            b7 = bArr[1];
        }
        return (this.f14564i * AbstractC0710a.e(b8, b7)) / 1000000;
    }

    @Override // t2.j
    public final boolean c(y yVar, long j7, i iVar) {
        if (e(yVar, f14553o)) {
            byte[] copyOf = Arrays.copyOf(yVar.f4691a, yVar.f4693c);
            int i7 = copyOf[9] & 255;
            ArrayList a7 = AbstractC0710a.a(copyOf);
            if (((K) iVar.f14556r) != null) {
                return true;
            }
            C0593J c0593j = new C0593J();
            c0593j.f9605k = "audio/opus";
            c0593j.f9617x = i7;
            c0593j.f9618y = 48000;
            c0593j.f9607m = a7;
            iVar.f14556r = new K(c0593j);
            return true;
        } else if (e(yVar, f14554p)) {
            AbstractC0156a.l((K) iVar.f14556r);
            if (this.n) {
                return true;
            }
            this.n = true;
            yVar.G(8);
            C1461c D6 = h4.b.D(E.t((String[]) h4.b.F(yVar, false, false).f11874r));
            if (D6 == null) {
                return true;
            }
            C0593J a8 = ((K) iVar.f14556r).a();
            C1461c c1461c = ((K) iVar.f14556r).f9685z;
            if (c1461c != null) {
                D6 = D6.a(c1461c.f16206q);
            }
            a8.f9603i = D6;
            iVar.f14556r = new K(a8);
            return true;
        } else {
            AbstractC0156a.l((K) iVar.f14556r);
            return false;
        }
    }

    @Override // t2.j
    public final void d(boolean z7) {
        super.d(z7);
        if (z7) {
            this.n = false;
        }
    }
}
