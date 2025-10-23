package f1;

import W5.InterfaceC0116x;
import com.boxhdo.android.data.model.request.trakt.TraktWatchlistRequest;
import k3.AbstractC0958a;
import z5.C1530l;
/* renamed from: f1.I  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0668I extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public int f10226u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ C0669J f10227v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ TraktWatchlistRequest f10228w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0668I(C0669J c0669j, TraktWatchlistRequest traktWatchlistRequest, D5.d dVar) {
        super(2, dVar);
        this.f10227v = c0669j;
        this.f10228w = traktWatchlistRequest;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new C0668I(this.f10227v, this.f10228w, dVar);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((C0668I) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        E5.a aVar = E5.a.f612q;
        int i7 = this.f10226u;
        if (i7 != 0) {
            if (i7 == 1) {
                AbstractC0958a.H(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0958a.H(obj);
            this.f10226u = 1;
            if (((e1.r) this.f10227v.f10229a.get()).e(this.f10228w, this) == aVar) {
                return aVar;
            }
        }
        return new Y0.b(C1530l.f16479a);
    }
}
