package androidx.emoji2.text;

import H2.C0002c;
import k3.AbstractC0958a;
/* loaded from: classes.dex */
public final class d extends AbstractC0958a {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ e f5833c;

    public d(e eVar) {
        this.f5833c = eVar;
    }

    @Override // k3.AbstractC0958a
    public final void A(Throwable th) {
        ((j) this.f5833c.f5836c).d(th);
    }

    @Override // k3.AbstractC0958a
    public final void B(C4.b bVar) {
        e eVar = this.f5833c;
        eVar.f5835b = bVar;
        eVar.f5834a = new C0002c((C4.b) eVar.f5835b, new L4.f(16), ((j) eVar.f5836c).f5847h);
        ((j) eVar.f5836c).e();
    }
}
