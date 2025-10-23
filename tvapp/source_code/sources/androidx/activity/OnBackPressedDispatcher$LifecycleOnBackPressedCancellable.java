package androidx.activity;

import androidx.lifecycle.EnumC0336n;
import androidx.lifecycle.InterfaceC0340s;
import androidx.lifecycle.InterfaceC0342u;
/* loaded from: classes.dex */
final class OnBackPressedDispatcher$LifecycleOnBackPressedCancellable implements InterfaceC0340s, c {

    /* renamed from: q  reason: collision with root package name */
    public final P1.c f5300q;

    /* renamed from: r  reason: collision with root package name */
    public final n f5301r;

    /* renamed from: s  reason: collision with root package name */
    public u f5302s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ w f5303t;

    public OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(w wVar, P1.c cVar, n nVar) {
        M5.g.f(nVar, "onBackPressedCallback");
        this.f5303t = wVar;
        this.f5300q = cVar;
        this.f5301r = nVar;
        cVar.g(this);
    }

    @Override // androidx.activity.c
    public final void cancel() {
        this.f5300q.v(this);
        n nVar = this.f5301r;
        nVar.getClass();
        nVar.f5343b.remove(this);
        u uVar = this.f5302s;
        if (uVar != null) {
            uVar.cancel();
        }
        this.f5302s = null;
    }

    @Override // androidx.lifecycle.InterfaceC0340s
    public final void d(InterfaceC0342u interfaceC0342u, EnumC0336n enumC0336n) {
        if (enumC0336n == EnumC0336n.ON_START) {
            this.f5302s = this.f5303t.b(this.f5301r);
        } else if (enumC0336n != EnumC0336n.ON_STOP) {
            if (enumC0336n == EnumC0336n.ON_DESTROY) {
                cancel();
            }
        } else {
            u uVar = this.f5302s;
            if (uVar != null) {
                uVar.cancel();
            }
        }
    }
}
