package M5;

import com.google.android.gms.internal.measurement.AbstractC0515y1;
import r0.AbstractC1111a;
/* loaded from: classes.dex */
public abstract class k extends b implements S5.c {

    /* renamed from: w  reason: collision with root package name */
    public final boolean f2311w;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public k(java.lang.Object r9, java.lang.Class r10, java.lang.String r11, java.lang.String r12, int r13) {
        /*
            r8 = this;
            r0 = 1
            r13 = r13 & r0
            r1 = 0
            if (r13 != r0) goto L7
            r7 = r0
            goto L8
        L7:
            r7 = r1
        L8:
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r2.<init>(r3, r4, r5, r6, r7)
            r8.f2311w = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: M5.k.<init>(java.lang.Object, java.lang.Class, java.lang.String, java.lang.String, int):void");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (d().equals(kVar.d()) && this.f2300t.equals(kVar.f2300t) && this.f2301u.equals(kVar.f2301u) && g.a(this.f2298r, kVar.f2298r)) {
                return true;
            }
            return false;
        } else if (!(obj instanceof S5.c)) {
            return false;
        } else {
            return obj.equals(g());
        }
    }

    public final S5.a g() {
        if (this.f2311w) {
            return this;
        }
        S5.a aVar = this.f2297q;
        if (aVar == null) {
            S5.a a7 = a();
            this.f2297q = a7;
            return a7;
        }
        return aVar;
    }

    public final int hashCode() {
        return this.f2301u.hashCode() + AbstractC0515y1.i(d().hashCode() * 31, 31, this.f2300t);
    }

    public final String toString() {
        S5.a g7 = g();
        if (g7 != this) {
            return g7.toString();
        }
        return AbstractC1111a.t(new StringBuilder("property "), this.f2300t, " (Kotlin reflection is not available)");
    }
}
