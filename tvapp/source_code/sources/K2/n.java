package K2;

import H2.d0;
import Z2.AbstractC0156a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import r0.AbstractC1111a;
/* loaded from: classes.dex */
public final class n implements d0 {

    /* renamed from: q  reason: collision with root package name */
    public final int f1749q;

    /* renamed from: r  reason: collision with root package name */
    public final r f1750r;

    /* renamed from: s  reason: collision with root package name */
    public int f1751s = -1;

    public n(r rVar, int i7) {
        this.f1750r = rVar;
        this.f1749q = i7;
    }

    public final void a() {
        boolean z7;
        if (this.f1751s == -1) {
            z7 = true;
        } else {
            z7 = false;
        }
        AbstractC0156a.f(z7);
        r rVar = this.f1750r;
        rVar.i();
        rVar.f1787a0.getClass();
        int[] iArr = rVar.f1787a0;
        int i7 = this.f1749q;
        int i8 = iArr[i7];
        if (i8 == -1) {
            if (rVar.f1786Z.contains(rVar.f1785Y.a(i7))) {
                i8 = -3;
            }
            i8 = -2;
        } else {
            boolean[] zArr = rVar.f1790d0;
            if (!zArr[i8]) {
                zArr[i8] = true;
            }
            i8 = -2;
        }
        this.f1751s = i8;
    }

    public final boolean b() {
        int i7 = this.f1751s;
        if (i7 != -1 && i7 != -3 && i7 != -2) {
            return true;
        }
        return false;
    }

    @Override // H2.d0
    public final boolean g() {
        if (this.f1751s != -3) {
            if (b()) {
                int i7 = this.f1751s;
                r rVar = this.f1750r;
                if (rVar.x() || !rVar.f1773L[i7].u(rVar.f1796j0)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c7, code lost:
        if (((K2.k) r6.get(0)).f1695L == false) goto L66;
     */
    @Override // H2.d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int k(androidx.fragment.app.D r22, i2.g r23, int r24) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: K2.n.k(androidx.fragment.app.D, i2.g, int):int");
    }

    @Override // H2.d0
    public final void w() {
        int i7 = this.f1751s;
        r rVar = this.f1750r;
        if (i7 != -2) {
            if (i7 == -1) {
                rVar.D();
                return;
            } else if (i7 != -3) {
                rVar.D();
                q qVar = rVar.f1773L[i7];
                j2.k kVar = qVar.f1031h;
                if (kVar != null && kVar.getState() == 1) {
                    j2.j f = qVar.f1031h.f();
                    f.getClass();
                    throw f;
                }
                return;
            } else {
                return;
            }
        }
        rVar.i();
        throw new IOException(AbstractC1111a.r("Unable to bind a sample queue to TrackGroup with MIME type ", rVar.f1785Y.a(this.f1749q).f1136t[0].f9655B, "."));
    }

    @Override // H2.d0
    public final int x(long j7) {
        if (!b()) {
            return 0;
        }
        int i7 = this.f1751s;
        r rVar = this.f1750r;
        if (rVar.x()) {
            return 0;
        }
        q qVar = rVar.f1773L[i7];
        int r3 = qVar.r(rVar.f1796j0, j7);
        ArrayList arrayList = rVar.f1766D;
        Object obj = null;
        if (arrayList instanceof Collection) {
            if (!arrayList.isEmpty()) {
                obj = arrayList.get(arrayList.size() - 1);
            }
        } else {
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                do {
                    obj = it.next();
                } while (it.hasNext());
            }
        }
        k kVar = (k) obj;
        if (kVar != null && !kVar.f1695L) {
            r3 = Math.min(r3, kVar.e(i7) - qVar.p());
        }
        qVar.D(r3);
        return r3;
    }
}
