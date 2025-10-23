package z1;

import L5.p;
import W5.InterfaceC0116x;
import androidx.lifecycle.EnumC0337o;
import androidx.lifecycle.P;
import com.boxhdo.android.tv.ui.playerLoading.PlayerLoadingFragment;
import k3.AbstractC0958a;
import z5.C1530l;
/* renamed from: z1.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1504c extends F5.i implements p {

    /* renamed from: u  reason: collision with root package name */
    public int f16404u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ PlayerLoadingFragment f16405v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1504c(D5.d dVar, PlayerLoadingFragment playerLoadingFragment) {
        super(2, dVar);
        this.f16405v = playerLoadingFragment;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new C1504c(dVar, this.f16405v);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((C1504c) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        E5.a aVar = E5.a.f612q;
        int i7 = this.f16404u;
        if (i7 != 0) {
            if (i7 == 1) {
                AbstractC0958a.H(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0958a.H(obj);
            EnumC0337o enumC0337o = EnumC0337o.f6819s;
            PlayerLoadingFragment playerLoadingFragment = this.f16405v;
            C1503b c1503b = new C1503b(null, playerLoadingFragment);
            this.f16404u = 1;
            if (P.k(playerLoadingFragment, enumC0337o, c1503b, this) == aVar) {
                return aVar;
            }
        }
        return C1530l.f16479a;
    }
}
