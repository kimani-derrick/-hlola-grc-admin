package u1;

import L5.p;
import W5.InterfaceC0116x;
import com.boxhdo.android.tv.ui.login.TvLoginViewModel;
import com.boxhdo.domain.model.trakt.TraktDevice;
import z5.C1530l;
/* renamed from: u1.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1260f extends F5.i implements p {

    /* renamed from: u  reason: collision with root package name */
    public int f14681u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ TraktDevice f14682v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ TvLoginViewModel f14683w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1260f(TraktDevice traktDevice, TvLoginViewModel tvLoginViewModel, D5.d dVar) {
        super(2, dVar);
        this.f14682v = traktDevice;
        this.f14683w = tvLoginViewModel;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new C1260f(this.f14682v, this.f14683w, dVar);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        ((C1260f) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
        return E5.a.f612q;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0035 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0042 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0040 -> B:17:0x0043). Please submit an issue!!! */
    @Override // F5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(java.lang.Object r11) {
        /*
            r10 = this;
            E5.a r0 = E5.a.f612q
            int r1 = r10.f14681u
            com.boxhdo.android.tv.ui.login.TvLoginViewModel r2 = r10.f14683w
            com.boxhdo.domain.model.trakt.TraktDevice r3 = r10.f14682v
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L24
            if (r1 == r5) goto L20
            if (r1 != r4) goto L18
            k3.AbstractC0958a.H(r11)
            z5.h r11 = (z5.C1526h) r11
            java.lang.Object r11 = r11.f16471q
            goto L43
        L18:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L20:
            k3.AbstractC0958a.H(r11)
            goto L36
        L24:
            k3.AbstractC0958a.H(r11)
        L27:
            int r11 = r3.f8091e
            long r6 = (long) r11
            r8 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 * r8
            r10.f14681u = r5
            java.lang.Object r11 = W5.AbstractC0117y.f(r6, r10)
            if (r11 != r0) goto L36
            return r0
        L36:
            M1.e r11 = r2.f7844g
            java.lang.String r1 = r3.f8088a
            r10.f14681u = r4
            java.io.Serializable r11 = r11.a(r1, r10)
            if (r11 != r0) goto L43
            return r0
        L43:
            boolean r1 = r11 instanceof z5.C1525g
            r1 = r1 ^ r5
            if (r1 == 0) goto L27
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            r11.getClass()
            Z5.w r11 = r2.f7845h
            q1.f r1 = new q1.f
            u1.j r6 = u1.j.f14690a
            r1.<init>(r6)
            r11.f(r1)
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.C1260f.p(java.lang.Object):java.lang.Object");
    }
}
