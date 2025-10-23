package androidx.fragment.app;

import l0.C0967c;
import m0.C0985a;
/* loaded from: classes.dex */
public final class U implements androidx.lifecycle.Y {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5954a;

    @Override // androidx.lifecycle.Y
    public final androidx.lifecycle.V a(Class cls) {
        switch (this.f5954a) {
            case 0:
                return new V(true);
            case 1:
                return new C0985a();
            default:
                return new n0.q();
        }
    }

    @Override // androidx.lifecycle.Y
    public final androidx.lifecycle.V b(Class cls, C0967c c0967c) {
        switch (this.f5954a) {
            case 0:
                return a(cls);
            case 1:
                return a(cls);
            default:
                return a(cls);
        }
    }
}
