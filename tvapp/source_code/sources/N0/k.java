package N0;

import android.content.Context;
import java.util.List;
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final S0.g f2392a;

    /* renamed from: b  reason: collision with root package name */
    public final List f2393b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2394c;
    public final S0.g d;

    /* renamed from: e  reason: collision with root package name */
    public final T0.f f2395e;
    public final J0.c f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f2396g;

    public k(S0.g gVar, List list, int i7, S0.g gVar2, T0.f fVar, J0.c cVar, boolean z7) {
        this.f2392a = gVar;
        this.f2393b = list;
        this.f2394c = i7;
        this.d = gVar2;
        this.f2395e = fVar;
        this.f = cVar;
        this.f2396g = z7;
    }

    public final void a(S0.g gVar, i iVar) {
        Context context = gVar.f3017a;
        S0.g gVar2 = this.f2392a;
        if (context == gVar2.f3017a) {
            if (gVar.f3018b != S0.i.f3040b) {
                if (gVar.f3019c == gVar2.f3019c) {
                    if (gVar.f3036w == gVar2.f3036w) {
                        if (gVar.f3037x == gVar2.f3037x) {
                            return;
                        }
                        throw new IllegalStateException(("Interceptor '" + iVar + "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.").toString());
                    }
                    throw new IllegalStateException(("Interceptor '" + iVar + "' cannot modify the request's lifecycle.").toString());
                }
                throw new IllegalStateException(("Interceptor '" + iVar + "' cannot modify the request's target.").toString());
            }
            throw new IllegalStateException(("Interceptor '" + iVar + "' cannot set the request's data to null.").toString());
        }
        throw new IllegalStateException(("Interceptor '" + iVar + "' cannot modify the request's context.").toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(S0.g r14, D5.d r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof N0.j
            if (r0 == 0) goto L13
            r0 = r15
            N0.j r0 = (N0.j) r0
            int r1 = r0.f2391x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2391x = r1
            goto L18
        L13:
            N0.j r0 = new N0.j
            r0.<init>(r13, r15)
        L18:
            java.lang.Object r15 = r0.f2389v
            E5.a r1 = E5.a.f612q
            int r2 = r0.f2391x
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            N0.i r14 = r0.f2388u
            N0.k r0 = r0.f2387t
            k3.AbstractC0958a.H(r15)
            goto L71
        L2b:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L33:
            k3.AbstractC0958a.H(r15)
            java.util.List r15 = r13.f2393b
            int r2 = r13.f2394c
            if (r2 <= 0) goto L47
            int r4 = r2 + (-1)
            java.lang.Object r4 = r15.get(r4)
            N0.i r4 = (N0.i) r4
            r13.a(r14, r4)
        L47:
            java.lang.Object r15 = r15.get(r2)
            N0.i r15 = (N0.i) r15
            int r7 = r2 + 1
            N0.k r2 = new N0.k
            T0.f r9 = r13.f2395e
            J0.c r10 = r13.f
            S0.g r5 = r13.f2392a
            java.util.List r6 = r13.f2393b
            boolean r11 = r13.f2396g
            r4 = r2
            r8 = r14
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r0.f2387t = r13
            r0.f2388u = r15
            r0.f2391x = r3
            java.lang.Object r14 = r15.d(r2, r0)
            if (r14 != r1) goto L6d
            return r1
        L6d:
            r0 = r13
            r12 = r15
            r15 = r14
            r14 = r12
        L71:
            S0.h r15 = (S0.h) r15
            S0.g r1 = r15.a()
            r0.a(r1, r14)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: N0.k.b(S0.g, D5.d):java.lang.Object");
    }
}
