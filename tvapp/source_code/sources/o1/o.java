package o1;

import W5.InterfaceC0116x;
import com.boxhdo.android.tv.ui.activity.player.TvPlayerActivity;
import z5.C1530l;
/* loaded from: classes.dex */
public final class o extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public int f12866u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ TvPlayerActivity f12867v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(D5.d dVar, TvPlayerActivity tvPlayerActivity) {
        super(2, dVar);
        this.f12867v = tvPlayerActivity;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new o(dVar, this.f12867v);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        ((o) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
        return E5.a.f612q;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0022 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:12:0x0023). Please submit an issue!!! */
    @Override // F5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(java.lang.Object r10) {
        /*
            r9 = this;
            E5.a r0 = E5.a.f612q
            int r1 = r9.f12866u
            r2 = 1
            if (r1 == 0) goto L15
            if (r1 != r2) goto Ld
            k3.AbstractC0958a.H(r10)
            goto L23
        Ld:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L15:
            k3.AbstractC0958a.H(r10)
        L18:
            r9.f12866u = r2
            r3 = 30000(0x7530, double:1.4822E-319)
            java.lang.Object r10 = W5.AbstractC0117y.f(r3, r9)
            if (r10 != r0) goto L23
            return r0
        L23:
            int r10 = com.boxhdo.android.tv.ui.activity.player.TvPlayerActivity.f7794Y
            com.boxhdo.android.tv.ui.activity.player.TvPlayerActivity r10 = r9.f12867v
            e2.p r1 = r10.c0()
            P1.c r1 = (P1.c) r1
            boolean r1 = r1.r()
            if (r1 == 0) goto L18
            com.boxhdo.android.tv.ui.activity.player.TvPlayerViewModel r3 = r10.d0()
            o1.v r1 = r10.b0()
            com.boxhdo.domain.model.Movie r4 = r1.f12880a
            e2.p r1 = r10.c0()
            e2.B r1 = (e2.C0585B) r1
            long r5 = r1.M()
            e2.p r10 = r10.c0()
            e2.B r10 = (e2.C0585B) r10
            long r7 = r10.R()
            r3.h(r4, r5, r7)
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o1.o.p(java.lang.Object):java.lang.Object");
    }
}
