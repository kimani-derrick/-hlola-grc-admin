package n1;

import W5.InterfaceC0116x;
import com.boxhdo.android.tv.ui.activity.main.TVViewModel;
import z5.C1530l;
/* loaded from: classes.dex */
public final class e extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public Object f12627u;

    /* renamed from: v  reason: collision with root package name */
    public TVViewModel f12628v;

    /* renamed from: w  reason: collision with root package name */
    public int f12629w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ TVViewModel f12630x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(TVViewModel tVViewModel, D5.d dVar) {
        super(2, dVar);
        this.f12630x = tVViewModel;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new e(this.f12630x, dVar);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((e) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARN: Type inference failed for: r1v4, types: [L5.p, F5.i] */
    @Override // F5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(java.lang.Object r8) {
        /*
            r7 = this;
            E5.a r0 = E5.a.f612q
            int r1 = r7.f12629w
            r2 = 2
            com.boxhdo.android.tv.ui.activity.main.TVViewModel r3 = r7.f12630x
            r4 = 1
            if (r1 == 0) goto L24
            if (r1 == r4) goto L1c
            if (r1 != r2) goto L14
            com.boxhdo.android.tv.ui.activity.main.TVViewModel r3 = r7.f12628v
            k3.AbstractC0958a.H(r8)
            goto L6c
        L14:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1c:
            k3.AbstractC0958a.H(r8)
            z5.h r8 = (z5.C1526h) r8
            java.lang.Object r8 = r8.f16471q
            goto L32
        L24:
            k3.AbstractC0958a.H(r8)
            L1.g r8 = r3.f
            r7.f12629w = r4
            java.lang.Object r8 = r8.a(r7)
            if (r8 != r0) goto L32
            return r0
        L32:
            boolean r1 = r8 instanceof z5.C1525g
            r1 = r1 ^ r4
            if (r1 == 0) goto L51
            r1 = r8
            com.boxhdo.domain.model.LatestVersion r1 = (com.boxhdo.domain.model.LatestVersion) r1
            int r4 = r1.f8008r
            if (r4 <= r2) goto L51
            boolean r4 = r1.f8011u
            if (r4 == 0) goto L51
            Z5.w r4 = r3.f7786k
            q1.f r5 = new q1.f
            n1.g r6 = new n1.g
            r6.<init>(r1)
            r5.<init>(r6)
            r4.f(r5)
        L51:
            java.lang.Throwable r1 = z5.C1526h.a(r8)
            if (r1 == 0) goto L80
            r7.f12627u = r8
            r7.f12628v = r3
            r7.f12629w = r2
            d6.c r8 = W5.G.f3946b
            G1.a r1 = new G1.a
            r4 = 0
            r1.<init>(r2, r4)
            java.lang.Object r8 = W5.AbstractC0117y.y(r7, r8, r1)
            if (r8 != r0) goto L6c
            return r0
        L6c:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L80
            Z5.w r8 = r3.f7786k
            q1.f r0 = new q1.f
            n1.f r1 = n1.f.f12631a
            r0.<init>(r1)
            r8.f(r0)
        L80:
            z5.l r8 = z5.C1530l.f16479a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: n1.e.p(java.lang.Object):java.lang.Object");
    }
}
