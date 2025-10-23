package e1;

import W5.InterfaceC0116x;
import h6.B;
import z5.C1530l;
/* renamed from: e1.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0571e extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public B f9364u;

    /* renamed from: v  reason: collision with root package name */
    public B f9365v;

    /* renamed from: w  reason: collision with root package name */
    public int f9366w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ m6.e f9367x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ C0572f f9368y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0571e(m6.e eVar, C0572f c0572f, D5.d dVar) {
        super(2, dVar);
        this.f9367x = eVar;
        this.f9368y = c0572f;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new C0571e(this.f9367x, this.f9368y, dVar);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((C0571e) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0043  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x005c -> B:16:0x005f). Please submit an issue!!! */
    @Override // F5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(java.lang.Object r10) {
        /*
            r9 = this;
            E5.a r0 = E5.a.f612q
            int r1 = r9.f9366w
            m6.e r2 = r9.f9367x
            r3 = 1
            e1.f r4 = r9.f9368y
            if (r1 == 0) goto L1e
            if (r1 != r3) goto L16
            h6.B r1 = r9.f9365v
            h6.B r5 = r9.f9364u
            k3.AbstractC0958a.H(r10)
            r10 = r5
            goto L5f
        L16:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1e:
            k3.AbstractC0958a.H(r10)
            h6.B r10 = r2.f12450e
            H.e r1 = r10.b()
            g6.o r5 = g6.o.f10858a
            java.lang.String r5 = r5.r()
            h6.t r6 = r10.f11070a
            java.lang.String r6 = e1.C0572f.b(r4, r6)
            r1.o(r5, r6)
            h6.B r1 = r1.q()
            h6.G r5 = r2.b(r1)
        L3e:
            int r6 = r4.f9370b
            r7 = 5
            if (r6 >= r7) goto L87
            r6 = 408(0x198, float:5.72E-43)
            int r7 = r5.f11098t
            if (r7 != r6) goto L87
            r5.close()
            int r5 = r4.f9370b
            long r5 = (long) r5
            r7 = 100
            long r5 = r5 * r7
            r9.f9364u = r10
            r9.f9365v = r1
            r9.f9366w = r3
            java.lang.Object r5 = W5.AbstractC0117y.f(r5, r9)
            if (r5 != r0) goto L5f
            return r0
        L5f:
            int r5 = r4.f9370b
            int r5 = r5 + r3
            r4.f9370b = r5
            H.e r5 = r1.b()
            g6.o r6 = g6.o.f10858a
            java.lang.String r7 = r6.r()
            r5.B(r7)
            java.lang.String r6 = r6.r()
            h6.t r7 = r10.f11070a
            java.lang.String r7 = e1.C0572f.b(r4, r7)
            r5.o(r6, r7)
            h6.B r5 = r5.q()
            h6.G r5 = r2.b(r5)
            goto L3e
        L87:
            r10 = 0
            r4.f9370b = r10
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.C0571e.p(java.lang.Object):java.lang.Object");
    }
}
