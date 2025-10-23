package f2;

import H2.A;
import e2.J0;
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final String f10357a;

    /* renamed from: b  reason: collision with root package name */
    public int f10358b;

    /* renamed from: c  reason: collision with root package name */
    public long f10359c;
    public final A d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f10360e;
    public boolean f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ h f10361g;

    public g(h hVar, String str, int i7, A a7) {
        long j7;
        this.f10361g = hVar;
        this.f10357a = str;
        this.f10358b = i7;
        if (a7 == null) {
            j7 = -1;
        } else {
            j7 = a7.d;
        }
        this.f10359c = j7;
        if (a7 != null && a7.a()) {
            this.d = a7;
        }
    }

    public final boolean a(C0695a c0695a) {
        A a7 = c0695a.d;
        if (a7 == null) {
            if (this.f10358b != c0695a.f10336c) {
                return true;
            }
            return false;
        }
        long j7 = this.f10359c;
        if (j7 == -1) {
            return false;
        }
        if (a7.d > j7) {
            return true;
        }
        A a8 = this.d;
        if (a8 == null) {
            return false;
        }
        J0 j02 = c0695a.f10335b;
        int b7 = j02.b(a7.f1180a);
        int b8 = j02.b(a8.f1180a);
        if (a7.d < a8.d || b7 < b8) {
            return false;
        }
        if (b7 > b8) {
            return true;
        }
        boolean a9 = a7.a();
        int i7 = a8.f1181b;
        if (a9) {
            int i8 = a7.f1181b;
            if (i8 > i7) {
                return true;
            }
            if (i8 == i7) {
                if (a7.f1182c > a8.f1182c) {
                    return true;
                }
            }
            return false;
        }
        int i9 = a7.f1183e;
        if (i9 == -1 || i9 > i7) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000e, code lost:
        if (r0 < r8.p()) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(e2.J0 r7, e2.J0 r8) {
        /*
            r6 = this;
            int r0 = r6.f10358b
            int r1 = r7.p()
            r2 = 0
            r3 = -1
            if (r0 < r1) goto L11
            int r7 = r8.p()
            if (r0 >= r7) goto L36
            goto L37
        L11:
            f2.h r1 = r6.f10361g
            e2.I0 r4 = r1.f10364a
            r7.o(r0, r4)
            e2.I0 r0 = r1.f10364a
            int r4 = r0.f9580E
        L1c:
            int r5 = r0.F
            if (r4 > r5) goto L36
            java.lang.Object r5 = r7.m(r4)
            int r5 = r8.b(r5)
            if (r5 == r3) goto L33
            e2.H0 r7 = r1.f10365b
            e2.H0 r7 = r8.g(r5, r7, r2)
            int r0 = r7.f9554s
            goto L37
        L33:
            int r4 = r4 + 1
            goto L1c
        L36:
            r0 = r3
        L37:
            r6.f10358b = r0
            if (r0 != r3) goto L3c
            return r2
        L3c:
            H2.A r7 = r6.d
            r0 = 1
            if (r7 != 0) goto L42
            return r0
        L42:
            java.lang.Object r7 = r7.f1180a
            int r7 = r8.b(r7)
            if (r7 == r3) goto L4b
            r2 = r0
        L4b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.g.b(e2.J0, e2.J0):boolean");
    }
}
