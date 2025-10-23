package q1;

import W5.InterfaceC0116x;
import z5.C1530l;
/* loaded from: classes.dex */
public final class h extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public int f13236u;

    /* renamed from: v  reason: collision with root package name */
    public /* synthetic */ Object f13237v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ boolean f13238w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ i f13239x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ L5.p f13240y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(boolean z7, i iVar, L5.p pVar, D5.d dVar) {
        super(2, dVar);
        this.f13238w = z7;
        this.f13239x = iVar;
        this.f13240y = pVar;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        h hVar = new h(this.f13238w, this.f13239x, this.f13240y, dVar);
        hVar.f13237v = obj;
        return hVar;
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((h) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0054  */
    @Override // F5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(java.lang.Object r8) {
        /*
            r7 = this;
            E5.a r0 = E5.a.f612q
            int r1 = r7.f13236u
            boolean r2 = r7.f13238w
            r3 = 2
            r4 = 1
            q1.i r5 = r7.f13239x
            if (r1 == 0) goto L22
            if (r1 == r4) goto L1c
            if (r1 != r3) goto L14
            k3.AbstractC0958a.H(r8)
            goto L52
        L14:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1c:
            k3.AbstractC0958a.H(r8)     // Catch: java.lang.Exception -> L20
            goto L52
        L20:
            r8 = move-exception
            goto L3d
        L22:
            k3.AbstractC0958a.H(r8)
            java.lang.Object r8 = r7.f13237v
            W5.x r8 = (W5.InterfaceC0116x) r8
            if (r2 == 0) goto L32
            Z5.w r1 = r5.f13241e
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r1.f(r6)
        L32:
            L5.p r1 = r7.f13240y     // Catch: java.lang.Exception -> L20
            r7.f13236u = r4     // Catch: java.lang.Exception -> L20
            java.lang.Object r8 = r1.j(r8, r7)     // Catch: java.lang.Exception -> L20
            if (r8 != r0) goto L52
            return r0
        L3d:
            boolean r1 = r8 instanceof java.util.concurrent.CancellationException
            if (r1 != 0) goto L5e
            q1.l r8 = new q1.l
            r1 = 2131951844(0x7f1300e4, float:1.9540114E38)
            r8.<init>(r1)
            r7.f13236u = r3
            java.lang.Object r8 = r5.f(r8, r7)
            if (r8 != r0) goto L52
            return r0
        L52:
            if (r2 == 0) goto L5b
            Z5.w r8 = r5.f13241e
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r8.f(r0)
        L5b:
            z5.l r8 = z5.C1530l.f16479a
            return r8
        L5e:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.h.p(java.lang.Object):java.lang.Object");
    }
}
