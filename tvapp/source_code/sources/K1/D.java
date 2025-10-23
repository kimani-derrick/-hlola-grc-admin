package K1;

import f1.C0669J;
import f1.C0694v;
/* loaded from: classes.dex */
public final class D {

    /* renamed from: a  reason: collision with root package name */
    public final C0694v f1558a;

    /* renamed from: b  reason: collision with root package name */
    public final C0669J f1559b;

    public D(C0694v c0694v, C0669J c0669j) {
        M5.g.f(c0694v, "movieRepository");
        M5.g.f(c0669j, "traktRepository");
        this.f1558a = c0694v;
        this.f1559b = c0669j;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00af A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable a(com.boxhdo.domain.model.Movie r12, D5.d r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof K1.C
            if (r0 == 0) goto L13
            r0 = r13
            K1.C r0 = (K1.C) r0
            int r1 = r0.f1557y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1557y = r1
            goto L18
        L13:
            K1.C r0 = new K1.C
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.f1555w
            E5.a r1 = E5.a.f612q
            int r2 = r0.f1557y
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L42
            if (r2 == r5) goto L38
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            goto L33
        L2b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L33:
            k3.AbstractC0958a.H(r13)
            goto Lb0
        L38:
            java.util.ArrayList r12 = r0.f1554v
            java.util.ArrayList r2 = r0.f1553u
            K1.D r3 = r0.f1552t
            k3.AbstractC0958a.H(r13)
            goto L90
        L42:
            k3.AbstractC0958a.H(r13)
            f1.J r13 = r11.f1559b
            boolean r13 = r13.a()
            f1.v r2 = r11.f1558a
            if (r13 == 0) goto Lb7
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            com.boxhdo.android.data.model.request.trakt.TraktItemRequest r7 = new com.boxhdo.android.data.model.request.trakt.TraktItemRequest
            com.boxhdo.android.data.model.request.trakt.TraktIdsRequest r8 = new com.boxhdo.android.data.model.request.trakt.TraktIdsRequest
            long r9 = r12.f8033u
            r8.<init>(r9)
            r7.<init>(r8)
            com.boxhdo.domain.type.MediaType r8 = com.boxhdo.domain.type.MediaType.f8096s
            com.boxhdo.domain.type.MediaType r9 = r12.f8037y
            if (r9 != r8) goto L6f
            r13.add(r7)
            goto L72
        L6f:
            r3.add(r7)
        L72:
            r0.f1552t = r11
            r0.f1553u = r13
            r0.f1554v = r3
            r0.f1557y = r5
            r2.getClass()
            n5.y r5 = g1.b.f10508a
            f1.t r5 = new f1.t
            long r7 = r12.f8033u
            r5.<init>(r2, r7, r6)
            java.lang.Object r12 = g1.b.a(r5, r0)
            if (r12 != r1) goto L8d
            return r1
        L8d:
            r2 = r13
            r12 = r3
            r3 = r11
        L90:
            f1.J r13 = r3.f1559b
            com.boxhdo.android.data.model.request.trakt.TraktWatchlistRequest r3 = new com.boxhdo.android.data.model.request.trakt.TraktWatchlistRequest
            r3.<init>(r2, r6, r12, r6)
            r0.f1552t = r6
            r0.f1553u = r6
            r0.f1554v = r6
            r0.f1557y = r4
            r13.getClass()
            n5.y r12 = g1.b.f10508a
            f1.I r12 = new f1.I
            r12.<init>(r13, r3, r6)
            java.lang.Object r13 = g1.b.a(r12, r0)
            if (r13 != r1) goto Lb0
            return r1
        Lb0:
            Y0.c r13 = (Y0.c) r13
            java.io.Serializable r12 = a.AbstractC0189a.v(r13)
            goto Lcc
        Lb7:
            long r12 = r12.f8033u
            r0.f1557y = r3
            r2.getClass()
            n5.y r3 = g1.b.f10508a
            f1.s r3 = new f1.s
            r3.<init>(r2, r12, r6)
            java.lang.Object r13 = g1.b.a(r3, r0)
            if (r13 != r1) goto Lb0
            return r1
        Lcc:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: K1.D.a(com.boxhdo.domain.model.Movie, D5.d):java.io.Serializable");
    }
}
