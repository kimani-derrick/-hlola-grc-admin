package androidx.fragment.app;

import android.os.Bundle;
/* renamed from: androidx.fragment.app.s  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0264s extends AbstractC0268w {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ComponentCallbacksC0269x f6082a;

    public C0264s(ComponentCallbacksC0269x componentCallbacksC0269x) {
        this.f6082a = componentCallbacksC0269x;
    }

    @Override // androidx.fragment.app.AbstractC0268w
    public final void a() {
        ComponentCallbacksC0269x componentCallbacksC0269x = this.f6082a;
        componentCallbacksC0269x.f6130i0.f();
        androidx.lifecycle.P.f(componentCallbacksC0269x);
        Bundle bundle = componentCallbacksC0269x.f6135r;
        componentCallbacksC0269x.f6130i0.g(bundle != null ? bundle.getBundle("registryState") : null);
    }
}
