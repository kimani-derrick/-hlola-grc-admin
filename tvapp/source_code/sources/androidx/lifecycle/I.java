package androidx.lifecycle;

import W5.InterfaceC0116x;
import z5.C1530l;
/* loaded from: classes.dex */
public final class I extends F5.i implements L5.p {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ L5.p f6750A;

    /* renamed from: u  reason: collision with root package name */
    public M5.o f6751u;

    /* renamed from: v  reason: collision with root package name */
    public M5.o f6752v;

    /* renamed from: w  reason: collision with root package name */
    public int f6753w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ P1.c f6754x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ EnumC0337o f6755y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ InterfaceC0116x f6756z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(P1.c cVar, EnumC0337o enumC0337o, InterfaceC0116x interfaceC0116x, L5.p pVar, D5.d dVar) {
        super(2, dVar);
        this.f6754x = cVar;
        this.f6755y = enumC0337o;
        this.f6756z = interfaceC0116x;
        this.f6750A = pVar;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new I(this.f6754x, this.f6755y, this.f6756z, this.f6750A, dVar);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((I) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a2  */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, M5.o] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, M5.o] */
    @Override // F5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(java.lang.Object r18) {
        /*
            r17 = this;
            r1 = r17
            E5.a r0 = E5.a.f612q
            int r2 = r1.f6753w
            z5.l r3 = z5.C1530l.f16479a
            P1.c r5 = r1.f6754x
            r6 = 1
            if (r2 == 0) goto L22
            if (r2 != r6) goto L1a
            M5.o r2 = r1.f6752v
            M5.o r6 = r1.f6751u
            k3.AbstractC0958a.H(r18)     // Catch: java.lang.Throwable -> L17
            goto L7b
        L17:
            r0 = move-exception
            goto L92
        L1a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L22:
            k3.AbstractC0958a.H(r18)
            androidx.lifecycle.o r2 = r5.l()
            androidx.lifecycle.o r7 = androidx.lifecycle.EnumC0337o.f6817q
            if (r2 != r7) goto L2e
            return r3
        L2e:
            M5.o r2 = new M5.o
            r2.<init>()
            M5.o r7 = new M5.o
            r7.<init>()
            androidx.lifecycle.o r8 = r1.f6755y     // Catch: java.lang.Throwable -> L8f
            W5.x r11 = r1.f6756z     // Catch: java.lang.Throwable -> L8f
            L5.p r15 = r1.f6750A     // Catch: java.lang.Throwable -> L8f
            r1.f6751u = r2     // Catch: java.lang.Throwable -> L8f
            r1.f6752v = r7     // Catch: java.lang.Throwable -> L8f
            r1.f6753w = r6     // Catch: java.lang.Throwable -> L8f
            W5.g r14 = new W5.g     // Catch: java.lang.Throwable -> L8f
            D5.d r9 = w4.l0.x(r17)     // Catch: java.lang.Throwable -> L8f
            r14.<init>(r6, r9)     // Catch: java.lang.Throwable -> L8f
            r14.w()     // Catch: java.lang.Throwable -> L8f
            androidx.lifecycle.l r6 = androidx.lifecycle.EnumC0336n.Companion     // Catch: java.lang.Throwable -> L8f
            r6.getClass()     // Catch: java.lang.Throwable -> L8f
            androidx.lifecycle.n r9 = androidx.lifecycle.C0334l.c(r8)     // Catch: java.lang.Throwable -> L8f
            androidx.lifecycle.n r12 = androidx.lifecycle.C0334l.a(r8)     // Catch: java.lang.Throwable -> L8f
            e6.d r6 = e6.e.a()     // Catch: java.lang.Throwable -> L8f
            androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1 r13 = new androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1     // Catch: java.lang.Throwable -> L8f
            r8 = r13
            r10 = r2
            r4 = r13
            r13 = r14
            r16 = r14
            r14 = r6
            r8.<init>()     // Catch: java.lang.Throwable -> L8f
            r7.f2315q = r4     // Catch: java.lang.Throwable -> L8f
            r5.g(r4)     // Catch: java.lang.Throwable -> L8f
            java.lang.Object r4 = r16.v()     // Catch: java.lang.Throwable -> L8f
            if (r4 != r0) goto L79
            return r0
        L79:
            r6 = r2
            r2 = r7
        L7b:
            java.lang.Object r0 = r6.f2315q
            W5.a0 r0 = (W5.InterfaceC0093a0) r0
            if (r0 == 0) goto L85
            r4 = 0
            r0.b(r4)
        L85:
            java.lang.Object r0 = r2.f2315q
            androidx.lifecycle.s r0 = (androidx.lifecycle.InterfaceC0340s) r0
            if (r0 == 0) goto L8e
            r5.v(r0)
        L8e:
            return r3
        L8f:
            r0 = move-exception
            r6 = r2
            r2 = r7
        L92:
            java.lang.Object r3 = r6.f2315q
            W5.a0 r3 = (W5.InterfaceC0093a0) r3
            if (r3 == 0) goto L9c
            r4 = 0
            r3.b(r4)
        L9c:
            java.lang.Object r2 = r2.f2315q
            androidx.lifecycle.s r2 = (androidx.lifecycle.InterfaceC0340s) r2
            if (r2 == 0) goto La5
            r5.v(r2)
        La5:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.I.p(java.lang.Object):java.lang.Object");
    }
}
