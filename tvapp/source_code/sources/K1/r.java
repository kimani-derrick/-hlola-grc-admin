package K1;

import f1.C0694v;
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    public final C0694v f1614a;

    /* renamed from: b  reason: collision with root package name */
    public final J1.p f1615b;

    public r(C0694v c0694v, J1.p pVar) {
        M5.g.f(c0694v, "movieRepository");
        M5.g.f(pVar, "seasonMapper");
        this.f1614a = c0694v;
        this.f1615b = pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r11, com.boxhdo.domain.type.MediaType r13, D5.d r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof K1.q
            if (r0 == 0) goto L13
            r0 = r14
            K1.q r0 = (K1.q) r0
            int r1 = r0.f1613w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1613w = r1
            goto L18
        L13:
            K1.q r0 = new K1.q
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.f1611u
            E5.a r1 = E5.a.f612q
            int r2 = r0.f1613w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            K1.r r11 = r0.f1610t
            k3.AbstractC0958a.H(r14)
            goto L57
        L29:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L31:
            k3.AbstractC0958a.H(r14)
            com.boxhdo.domain.type.MediaType r14 = com.boxhdo.domain.type.MediaType.f8096s
            if (r13 != r14) goto L3a
            r8 = r3
            goto L3c
        L3a:
            r13 = 2
            r8 = r13
        L3c:
            r0.f1610t = r10
            r0.f1613w = r3
            f1.v r5 = r10.f1614a
            r5.getClass()
            n5.y r13 = g1.b.f10508a
            f1.l r13 = new f1.l
            r9 = 0
            r4 = r13
            r6 = r11
            r4.<init>(r5, r6, r8, r9)
            java.lang.Object r14 = g1.b.a(r13, r0)
            if (r14 != r1) goto L56
            return r1
        L56:
            r11 = r10
        L57:
            Y0.c r14 = (Y0.c) r14
            boolean r12 = r14 instanceof Y0.b
            if (r12 == 0) goto L6c
            J1.p r11 = r11.f1615b
            Y0.b r14 = (Y0.b) r14
            java.lang.Object r12 = r14.f4309a
            com.boxhdo.android.data.model.response.ListSeasonResponse r12 = (com.boxhdo.android.data.model.response.ListSeasonResponse) r12
            com.boxhdo.domain.model.ListSeason r11 = r11.s(r12)
            java.util.List r11 = r11.f8013a
            goto L78
        L6c:
            boolean r11 = r14 instanceof Y0.a
            if (r11 == 0) goto L79
            Y0.a r14 = (Y0.a) r14
            java.lang.Throwable r11 = r14.f4308a
            z5.g r11 = k3.AbstractC0958a.m(r11)
        L78:
            return r11
        L79:
            F0.c r11 = new F0.c
            r11.<init>()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: K1.r.a(long, com.boxhdo.domain.type.MediaType, D5.d):java.lang.Object");
    }
}
