package V;

import W5.InterfaceC0116x;
import z5.C1530l;
/* loaded from: classes.dex */
public final class l extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public L5.p f3557u;

    /* renamed from: v  reason: collision with root package name */
    public int f3558v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ C4.b f3559w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(C4.b bVar, D5.d dVar) {
        super(2, dVar);
        this.f3559w = bVar;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new l(this.f3559w, dVar);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((l) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0057 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0055 -> B:18:0x0058). Please submit an issue!!! */
    @Override // F5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(java.lang.Object r7) {
        /*
            r6 = this;
            E5.a r0 = E5.a.f612q
            int r1 = r6.f3558v
            r2 = 2
            r3 = 1
            C4.b r4 = r6.f3559w
            if (r1 == 0) goto L20
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            k3.AbstractC0958a.H(r7)
            goto L58
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            L5.p r1 = r6.f3557u
            k3.AbstractC0958a.H(r7)
            goto L4c
        L20:
            k3.AbstractC0958a.H(r7)
            java.lang.Object r7 = r4.f424u
            java.util.concurrent.atomic.AtomicInteger r7 = (java.util.concurrent.atomic.AtomicInteger) r7
            int r7 = r7.get()
            if (r7 <= 0) goto L65
        L2d:
            java.lang.Object r7 = r4.f421r
            W5.x r7 = (W5.InterfaceC0116x) r7
            D5.i r7 = r7.n()
            W5.AbstractC0117y.g(r7)
            java.lang.Object r7 = r4.f422s
            r1 = r7
            L5.p r1 = (L5.p) r1
            r6.f3557u = r1
            r6.f3558v = r3
            java.lang.Object r7 = r4.f423t
            Y5.b r7 = (Y5.b) r7
            java.lang.Object r7 = r7.y(r6)
            if (r7 != r0) goto L4c
            return r0
        L4c:
            r5 = 0
            r6.f3557u = r5
            r6.f3558v = r2
            java.lang.Object r7 = r1.j(r7, r6)
            if (r7 != r0) goto L58
            return r0
        L58:
            java.lang.Object r7 = r4.f424u
            java.util.concurrent.atomic.AtomicInteger r7 = (java.util.concurrent.atomic.AtomicInteger) r7
            int r7 = r7.decrementAndGet()
            if (r7 != 0) goto L2d
            z5.l r7 = z5.C1530l.f16479a
            return r7
        L65:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: V.l.p(java.lang.Object):java.lang.Object");
    }
}
