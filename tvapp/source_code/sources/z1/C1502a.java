package z1;

import L5.p;
import com.boxhdo.android.tv.ui.playerLoading.PlayerLoadingFragment;
import com.boxhdo.domain.model.Movie;
import com.boxhdo.domain.model.Vote;
import com.boxhdo.domain.type.MediaType;
import java.util.List;
import k3.AbstractC0958a;
import n0.C0999A;
import q1.C1104f;
import w4.l0;
import z5.C1530l;
/* renamed from: z1.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1502a extends F5.i implements p {

    /* renamed from: u  reason: collision with root package name */
    public /* synthetic */ Object f16400u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ PlayerLoadingFragment f16401v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1502a(D5.d dVar, PlayerLoadingFragment playerLoadingFragment) {
        super(2, dVar);
        this.f16401v = playerLoadingFragment;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        C1502a c1502a = new C1502a(dVar, this.f16401v);
        c1502a.f16400u = obj;
        return c1502a;
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        D5.d dVar = (D5.d) obj2;
        C1530l c1530l = C1530l.f16479a;
        ((C1502a) h(dVar, (C1104f) obj)).p(c1530l);
        return c1530l;
    }

    @Override // F5.a
    public final Object p(Object obj) {
        String str;
        AbstractC0958a.H(obj);
        Object a7 = ((C1104f) this.f16400u).a();
        if (a7 != null) {
            AbstractC1510i abstractC1510i = (AbstractC1510i) a7;
            if (!M5.g.a(abstractC1510i, C1508g.f16419a) && !M5.g.a(abstractC1510i, C1508g.f16420b)) {
                if (abstractC1510i instanceof C1509h) {
                    PlayerLoadingFragment playerLoadingFragment = this.f16401v;
                    C0999A o7 = l0.o(playerLoadingFragment);
                    long j7 = playerLoadingFragment.j0().f16408c;
                    String str2 = playerLoadingFragment.j0().f16406a;
                    String valueOf = String.valueOf(playerLoadingFragment.j0().f16411h);
                    String str3 = playerLoadingFragment.j0().f16412i;
                    if (str3 == null) {
                        str = "";
                    } else {
                        str = str3;
                    }
                    double d = playerLoadingFragment.j0().f16413j;
                    String str4 = playerLoadingFragment.j0().f16414k;
                    if (str4 == null) {
                        str4 = "";
                    }
                    o7.j(new C1506e(new Movie(j7, (String) null, valueOf, str2, 0L, str, str4, 0, (MediaType) null, (String) null, (String) null, false, 0, 0, (String) null, d, 0L, (List) null, (List) null, (List) null, (List) null, false, (Vote) null, 16744338), ((C1509h) abstractC1510i).f16422a, playerLoadingFragment.j0().f16409e, playerLoadingFragment.j0().f, playerLoadingFragment.j0().f16410g));
                    l0.o(playerLoadingFragment).k();
                } else {
                    M5.g.a(abstractC1510i, C1508g.f16421c);
                }
            }
        }
        return C1530l.f16479a;
    }
}
