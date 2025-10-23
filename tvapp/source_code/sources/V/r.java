package V;

import z5.C1530l;
/* loaded from: classes.dex */
public final class r extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public int f3566u;

    /* renamed from: v  reason: collision with root package name */
    public /* synthetic */ Object f3567v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ H f3568w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(H h7, D5.d dVar) {
        super(2, dVar);
        this.f3568w = h7;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        r rVar = new r(this.f3568w, dVar);
        rVar.f3567v = obj;
        return rVar;
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((r) h((D5.d) obj2, (o) obj)).p(C1530l.f16479a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0045, code lost:
        if (r7 == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0056, code lost:
        if (r7 == r0) goto L20;
     */
    @Override // F5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(java.lang.Object r7) {
        /*
            r6 = this;
            E5.a r0 = E5.a.f612q
            int r1 = r6.f3566u
            z5.l r2 = z5.C1530l.f16479a
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1b
            if (r1 == r4) goto L17
            if (r1 != r3) goto Lf
            goto L17
        Lf:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L17:
            k3.AbstractC0958a.H(r7)
            goto L7c
        L1b:
            k3.AbstractC0958a.H(r7)
            java.lang.Object r7 = r6.f3567v
            V.o r7 = (V.o) r7
            boolean r1 = r7 instanceof V.m
            V.H r5 = r6.f3568w
            if (r1 == 0) goto L6d
            V.m r7 = (V.m) r7
            r6.f3566u = r4
            Z5.w r1 = r5.f3533w
            java.lang.Object r1 = r1.getValue()
            V.I r1 = (V.I) r1
            boolean r3 = r1 instanceof V.C0084c
            if (r3 == 0) goto L39
            goto L5d
        L39:
            boolean r3 = r1 instanceof V.k
            if (r3 == 0) goto L4a
            V.I r7 = r7.f3560a
            if (r1 != r7) goto L48
            java.lang.Object r7 = r5.e(r6)
            if (r7 != r0) goto L48
            goto L5e
        L48:
            r7 = r2
            goto L5e
        L4a:
            V.J r7 = V.J.f3536a
            boolean r7 = M5.g.a(r1, r7)
            if (r7 == 0) goto L59
            java.lang.Object r7 = r5.e(r6)
            if (r7 != r0) goto L48
            goto L5e
        L59:
            boolean r7 = r1 instanceof V.C0091j
            if (r7 != 0) goto L61
        L5d:
            goto L48
        L5e:
            if (r7 != r0) goto L7c
            return r0
        L61:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Can't read in final state."
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        L6d:
            boolean r1 = r7 instanceof V.n
            if (r1 == 0) goto L7c
            V.n r7 = (V.n) r7
            r6.f3566u = r3
            java.lang.Object r7 = V.H.a(r5, r7, r6)
            if (r7 != r0) goto L7c
            return r0
        L7c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: V.r.p(java.lang.Object):java.lang.Object");
    }
}
