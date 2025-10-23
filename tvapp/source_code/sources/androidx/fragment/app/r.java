package androidx.fragment.app;

import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class r extends androidx.activity.result.c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AtomicReference f6081a;

    public r(AtomicReference atomicReference) {
        this.f6081a = atomicReference;
    }

    @Override // androidx.activity.result.c
    public final void a(Object obj) {
        androidx.activity.result.c cVar = (androidx.activity.result.c) this.f6081a.get();
        if (cVar != null) {
            cVar.a(obj);
            return;
        }
        throw new IllegalStateException("Operation cannot be started before fragment is in created state");
    }
}
