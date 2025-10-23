package n1;

import W5.InterfaceC0116x;
import com.boxhdo.android.tv.ui.activity.main.TVViewModel;
import z5.C1530l;
/* loaded from: classes.dex */
public final class i extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public int f12634u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ TVViewModel f12635v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(TVViewModel tVViewModel, D5.d dVar) {
        super(2, dVar);
        this.f12635v = tVViewModel;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new i(this.f12635v, dVar);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((i) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004a A[RETURN] */
    @Override // F5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(java.lang.Object r6) {
        /*
            r5 = this;
            E5.a r0 = E5.a.f612q
            int r1 = r5.f12634u
            r2 = 2
            r3 = 1
            com.boxhdo.android.tv.ui.activity.main.TVViewModel r4 = r5.f12635v
            if (r1 == 0) goto L28
            if (r1 == r3) goto L1f
            if (r1 != r2) goto L17
            k3.AbstractC0958a.H(r6)
            z5.h r6 = (z5.C1526h) r6
            r6.getClass()
            goto L4b
        L17:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1f:
            k3.AbstractC0958a.H(r6)
            z5.h r6 = (z5.C1526h) r6
            r6.getClass()
            goto L40
        L28:
            k3.AbstractC0958a.H(r6)
            M1.h r6 = r4.f7782g
            f1.J r6 = r6.f2197a
            boolean r6 = r6.a()
            if (r6 == 0) goto L4b
            r5.f12634u = r3
            com.google.android.gms.internal.measurement.K1 r6 = r4.f7783h
            java.lang.Object r6 = r6.s(r5)
            if (r6 != r0) goto L40
            return r0
        L40:
            com.google.android.gms.internal.measurement.K1 r6 = r4.f7784i
            r5.f12634u = r2
            java.io.Serializable r6 = r6.n(r5)
            if (r6 != r0) goto L4b
            return r0
        L4b:
            z5.l r6 = z5.C1530l.f16479a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: n1.i.p(java.lang.Object):java.lang.Object");
    }
}
