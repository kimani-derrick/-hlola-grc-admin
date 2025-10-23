package z1;

import L5.p;
import W5.InterfaceC0116x;
import Z5.s;
import com.boxhdo.android.tv.ui.playerLoading.PlayerLoadingFragment;
import com.boxhdo.android.tv.ui.playerLoading.PlayerLoadingViewModel;
import k3.AbstractC0958a;
import z5.C1530l;
/* renamed from: z1.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1503b extends F5.i implements p {

    /* renamed from: u  reason: collision with root package name */
    public int f16402u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ PlayerLoadingFragment f16403v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1503b(D5.d dVar, PlayerLoadingFragment playerLoadingFragment) {
        super(2, dVar);
        this.f16403v = playerLoadingFragment;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new C1503b(dVar, this.f16403v);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((C1503b) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        E5.a aVar = E5.a.f612q;
        int i7 = this.f16402u;
        if (i7 != 0) {
            if (i7 == 1) {
                AbstractC0958a.H(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0958a.H(obj);
            PlayerLoadingFragment playerLoadingFragment = this.f16403v;
            T4.c cVar = new T4.c(29, ((PlayerLoadingViewModel) playerLoadingFragment.f7885I0.getValue()).f7890i);
            C1502a c1502a = new C1502a(null, playerLoadingFragment);
            this.f16402u = 1;
            if (s.e(cVar, c1502a, this) == aVar) {
                return aVar;
            }
        }
        return C1530l.f16479a;
    }
}
