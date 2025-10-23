package v1;

import W5.InterfaceC0116x;
import com.boxhdo.android.tv.ui.movie_detail.TvMovieDetailViewModel;
import com.boxhdo.domain.model.Movie;
import z5.C1530l;
/* loaded from: classes.dex */
public final class t extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public int f15282u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ boolean f15283v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ TvMovieDetailViewModel f15284w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ Movie f15285x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(boolean z7, TvMovieDetailViewModel tvMovieDetailViewModel, Movie movie, D5.d dVar) {
        super(2, dVar);
        this.f15283v = z7;
        this.f15284w = tvMovieDetailViewModel;
        this.f15285x = movie;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new t(this.f15283v, this.f15284w, this.f15285x, dVar);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((t) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0069  */
    @Override // F5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(java.lang.Object r6) {
        /*
            r5 = this;
            E5.a r0 = E5.a.f612q
            int r1 = r5.f15282u
            r2 = 2
            com.boxhdo.android.tv.ui.movie_detail.TvMovieDetailViewModel r3 = r5.f15284w
            r4 = 1
            if (r1 == 0) goto L26
            if (r1 == r4) goto L1e
            if (r1 != r2) goto L16
            k3.AbstractC0958a.H(r6)
            z5.h r6 = (z5.C1526h) r6
            java.lang.Object r6 = r6.f16471q
            goto L64
        L16:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1e:
            k3.AbstractC0958a.H(r6)
            z5.h r6 = (z5.C1526h) r6
            java.lang.Object r6 = r6.f16471q
            goto L3a
        L26:
            k3.AbstractC0958a.H(r6)
            boolean r6 = r5.f15283v
            com.boxhdo.domain.model.Movie r1 = r5.f15285x
            if (r6 == 0) goto L59
            K1.d r6 = r3.f7849g
            r5.f15282u = r4
            java.io.Serializable r6 = r6.a(r1, r5)
            if (r6 != r0) goto L3a
            return r0
        L3a:
            boolean r0 = r6 instanceof z5.C1525g
            r0 = r0 ^ r4
            if (r0 == 0) goto L7f
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            r6.getClass()
            Z5.w r6 = r3.n
            java.lang.Object r6 = r6.getValue()
            com.boxhdo.domain.model.Movie r6 = (com.boxhdo.domain.model.Movie) r6
            if (r6 != 0) goto L4f
            goto L51
        L4f:
            r6.f8025M = r4
        L51:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
        L53:
            Z5.w r0 = r3.f7858q
            r0.f(r6)
            goto L7f
        L59:
            K1.D r6 = r3.f7850h
            r5.f15282u = r2
            java.io.Serializable r6 = r6.a(r1, r5)
            if (r6 != r0) goto L64
            return r0
        L64:
            boolean r0 = r6 instanceof z5.C1525g
            r0 = r0 ^ r4
            if (r0 == 0) goto L7f
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            r6.getClass()
            Z5.w r6 = r3.n
            java.lang.Object r6 = r6.getValue()
            com.boxhdo.domain.model.Movie r6 = (com.boxhdo.domain.model.Movie) r6
            if (r6 != 0) goto L79
            goto L7c
        L79:
            r0 = 0
            r6.f8025M = r0
        L7c:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            goto L53
        L7f:
            z5.l r6 = z5.C1530l.f16479a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: v1.t.p(java.lang.Object):java.lang.Object");
    }
}
