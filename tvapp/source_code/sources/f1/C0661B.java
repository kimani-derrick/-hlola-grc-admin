package f1;

import W5.InterfaceC0116x;
import com.boxhdo.android.data.model.request.trakt.TraktWatchlistRequest;
import k3.AbstractC0958a;
import z5.C1530l;
/* renamed from: f1.B  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0661B extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public int f10208u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ C0669J f10209v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ TraktWatchlistRequest f10210w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0661B(C0669J c0669j, TraktWatchlistRequest traktWatchlistRequest, D5.d dVar) {
        super(2, dVar);
        this.f10209v = c0669j;
        this.f10210w = traktWatchlistRequest;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new C0661B(this.f10209v, this.f10210w, dVar);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((C0661B) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        E5.a aVar = E5.a.f612q;
        int i7 = this.f10208u;
        if (i7 != 0) {
            if (i7 == 1) {
                AbstractC0958a.H(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0958a.H(obj);
            this.f10208u = 1;
            if (((e1.r) this.f10209v.f10229a.get()).c(this.f10210w, this) == aVar) {
                return aVar;
            }
        }
        return new Y0.b(C1530l.f16479a);
    }
}
