package f1;

import W5.InterfaceC0116x;
import com.boxhdo.android.data.model.response.EpisodeDetailResponse;
import java.io.IOException;
import k3.AbstractC0958a;
import w4.l0;
import z5.C1530l;
/* renamed from: f1.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0681i extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ C0694v f10271u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ long f10272v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0681i(C0694v c0694v, long j7, D5.d dVar) {
        super(2, dVar);
        this.f10271u = c0694v;
        this.f10272v = j7;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new C0681i(this.f10271u, this.f10272v, dVar);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((C0681i) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        AbstractC0958a.H(obj);
        g6.o oVar = g6.o.f10858a;
        C0694v c0694v = this.f10271u;
        String l7 = oVar.l(l0.s(c0694v.f10323b), this.f10272v, c0694v.f);
        if (U5.n.X(l7)) {
            return new Y0.a(new IOException());
        }
        EpisodeDetailResponse episodeDetailResponse = (EpisodeDetailResponse) c0694v.f10326g.a(EpisodeDetailResponse.class).a(l7);
        if (episodeDetailResponse != null) {
            return new Y0.b(episodeDetailResponse);
        }
        throw new H1.a(null);
    }
}
