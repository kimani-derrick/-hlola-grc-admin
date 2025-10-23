package androidx.fragment.app;

import android.view.View;
import r0.AbstractC1111a;
/* renamed from: androidx.fragment.app.t  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0265t extends p6.l {

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ ComponentCallbacksC0269x f6083r;

    public C0265t(ComponentCallbacksC0269x componentCallbacksC0269x) {
        this.f6083r = componentCallbacksC0269x;
    }

    @Override // p6.l
    public final View A(int i7) {
        ComponentCallbacksC0269x componentCallbacksC0269x = this.f6083r;
        View view = componentCallbacksC0269x.W;
        if (view != null) {
            return view.findViewById(i7);
        }
        throw new IllegalStateException(AbstractC1111a.q("Fragment ", componentCallbacksC0269x, " does not have a view"));
    }

    @Override // p6.l
    public final boolean B() {
        return this.f6083r.W != null;
    }
}
