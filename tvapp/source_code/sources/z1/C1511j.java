package z1;

import L5.p;
import W5.InterfaceC0116x;
import com.boxhdo.android.tv.ui.playerLoading.PlayerLoadingViewModel;
import com.boxhdo.domain.model.EpisodeSource;
import k3.AbstractC0958a;
import q1.C1104f;
import z5.C1525g;
import z5.C1526h;
import z5.C1530l;
/* renamed from: z1.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1511j extends F5.i implements p {

    /* renamed from: u  reason: collision with root package name */
    public Object f16424u;

    /* renamed from: v  reason: collision with root package name */
    public int f16425v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ PlayerLoadingViewModel f16426w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ long f16427x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ long f16428y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1511j(PlayerLoadingViewModel playerLoadingViewModel, long j7, long j8, D5.d dVar) {
        super(2, dVar);
        this.f16426w = playerLoadingViewModel;
        this.f16427x = j7;
        this.f16428y = j8;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new C1511j(this.f16426w, this.f16427x, this.f16428y, dVar);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((C1511j) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        Object a7;
        E5.a aVar = E5.a.f612q;
        int i7 = this.f16425v;
        PlayerLoadingViewModel playerLoadingViewModel = this.f16426w;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 == 2) {
                    AbstractC0958a.H(obj);
                    return C1530l.f16479a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0958a.H(obj);
            a7 = ((C1526h) obj).f16471q;
        } else {
            AbstractC0958a.H(obj);
            playerLoadingViewModel.f7890i.f(new C1104f(C1508g.f16421c));
            this.f16425v = 1;
            a7 = playerLoadingViewModel.f7889h.a(this.f16427x, this);
            if (a7 == aVar) {
                return aVar;
            }
        }
        if (!(a7 instanceof C1525g)) {
            playerLoadingViewModel.f7890i.f(new C1104f(new C1509h((EpisodeSource) a7, this.f16428y)));
        }
        Throwable a8 = C1526h.a(a7);
        if (a8 != null) {
            playerLoadingViewModel.f7890i.f(new C1104f(C1508g.f16420b));
            this.f16424u = a7;
            this.f16425v = 2;
            if (playerLoadingViewModel.e(a8, this) == aVar) {
                return aVar;
            }
        }
        return C1530l.f16479a;
    }
}
