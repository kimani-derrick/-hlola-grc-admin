package x1;

import F5.i;
import L5.p;
import W5.InterfaceC0116x;
import com.boxhdo.android.tv.ui.mylist.TvMyListViewModel;
import z5.C1530l;
/* loaded from: classes.dex */
public final class h extends i implements p {

    /* renamed from: u  reason: collision with root package name */
    public Object f16201u;

    /* renamed from: v  reason: collision with root package name */
    public Object f16202v;

    /* renamed from: w  reason: collision with root package name */
    public int f16203w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ TvMyListViewModel f16204x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ int f16205y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(TvMyListViewModel tvMyListViewModel, int i7, D5.d dVar) {
        super(2, dVar);
        this.f16204x = tvMyListViewModel;
        this.f16205y = i7;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new h(this.f16204x, this.f16205y, dVar);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((h) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ad  */
    @Override // F5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(java.lang.Object r9) {
        /*
            r8 = this;
            E5.a r0 = E5.a.f612q
            int r1 = r8.f16203w
            A5.t r2 = A5.t.f135q
            r3 = 4
            r4 = 3
            r5 = 2
            com.boxhdo.android.tv.ui.mylist.TvMyListViewModel r6 = r8.f16204x
            r7 = 1
            if (r1 == 0) goto L43
            if (r1 == r7) goto L3b
            if (r1 == r5) goto L32
            if (r1 == r4) goto L23
            if (r1 != r3) goto L1b
            k3.AbstractC0958a.H(r9)
            goto Lbf
        L1b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L23:
            java.lang.Object r1 = r8.f16202v
            r6 = r1
            com.boxhdo.android.tv.ui.mylist.TvMyListViewModel r6 = (com.boxhdo.android.tv.ui.mylist.TvMyListViewModel) r6
            java.lang.Object r1 = r8.f16201u
            k3.AbstractC0958a.H(r9)
            z5.h r9 = (z5.C1526h) r9
            java.lang.Object r9 = r9.f16471q
            goto L9a
        L32:
            k3.AbstractC0958a.H(r9)
            z5.h r9 = (z5.C1526h) r9
            java.lang.Object r9 = r9.f16471q
        L39:
            r1 = r9
            goto L83
        L3b:
            k3.AbstractC0958a.H(r9)
            z5.h r9 = (z5.C1526h) r9
            java.lang.Object r9 = r9.f16471q
            goto L5f
        L43:
            k3.AbstractC0958a.H(r9)
            M1.h r9 = r6.f7870g
            f1.J r9 = r9.f2197a
            boolean r9 = r9.a()
            int r1 = r8.f16205y
            if (r9 != 0) goto L78
            if (r1 != r7) goto Lbf
            r8.f16203w = r7
            N1.d r9 = r6.f
            java.io.Serializable r9 = r9.a(r8)
            if (r9 != r0) goto L5f
            return r0
        L5f:
            boolean r0 = r9 instanceof z5.C1525g
            r0 = r0 ^ r7
            if (r0 == 0) goto L6c
            r0 = r9
            java.util.List r0 = (java.util.List) r0
            Z5.w r1 = r6.f7873j
            r1.f(r0)
        L6c:
            java.lang.Throwable r9 = z5.C1526h.a(r9)
            if (r9 == 0) goto Lbf
            Z5.w r9 = r6.f7873j
            r9.f(r2)
            goto Lbf
        L78:
            r8.f16203w = r5
            com.google.android.gms.internal.measurement.K1 r9 = r6.f7871h
            java.io.Serializable r9 = r9.N(r1, r8)
            if (r9 != r0) goto L39
            return r0
        L83:
            boolean r9 = r1 instanceof z5.C1525g
            r9 = r9 ^ r7
            if (r9 == 0) goto Lbf
            r9 = r1
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.measurement.K1 r5 = r6.f7872i
            r8.f16201u = r1
            r8.f16202v = r6
            r8.f16203w = r4
            java.io.Serializable r9 = r5.E(r9, r8)
            if (r9 != r0) goto L9a
            return r0
        L9a:
            boolean r4 = r9 instanceof z5.C1525g
            r4 = r4 ^ r7
            if (r4 == 0) goto La7
            r4 = r9
            java.util.List r4 = (java.util.List) r4
            Z5.w r5 = r6.f7873j
            r5.f(r4)
        La7:
            java.lang.Throwable r4 = z5.C1526h.a(r9)
            if (r4 == 0) goto Lbf
            Z5.w r5 = r6.f7873j
            r5.f(r2)
            r8.f16201u = r1
            r8.f16202v = r9
            r8.f16203w = r3
            java.lang.Object r9 = r6.e(r4, r8)
            if (r9 != r0) goto Lbf
            return r0
        Lbf:
            z5.l r9 = z5.C1530l.f16479a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: x1.h.p(java.lang.Object):java.lang.Object");
    }
}
