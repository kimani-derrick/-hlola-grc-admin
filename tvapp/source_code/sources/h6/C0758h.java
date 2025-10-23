package h6;

import java.util.ArrayList;
import java.util.Set;
import w4.l0;
/* renamed from: h6.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0758h {

    /* renamed from: c  reason: collision with root package name */
    public static final C0758h f11147c = new C0758h(A5.k.o0(new ArrayList()), null);

    /* renamed from: a  reason: collision with root package name */
    public final Set f11148a;

    /* renamed from: b  reason: collision with root package name */
    public final l0 f11149b;

    public C0758h(Set set, l0 l0Var) {
        M5.g.f(set, "pins");
        this.f11148a = set;
        this.f11149b = l0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.String r15, L5.a r16) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h6.C0758h.a(java.lang.String, L5.a):void");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0758h) {
            C0758h c0758h = (C0758h) obj;
            if (M5.g.a(c0758h.f11148a, this.f11148a) && M5.g.a(c0758h.f11149b, this.f11149b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int hashCode = (this.f11148a.hashCode() + 1517) * 41;
        l0 l0Var = this.f11149b;
        if (l0Var != null) {
            i7 = l0Var.hashCode();
        } else {
            i7 = 0;
        }
        return hashCode + i7;
    }
}
