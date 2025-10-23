package Z5;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* loaded from: classes.dex */
public final class x extends a6.d {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f4953a = AtomicReferenceFieldUpdater.newUpdater(x.class, Object.class, "_state");
    private volatile Object _state;

    @Override // a6.d
    public final boolean a(a6.b bVar) {
        w wVar = (w) bVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4953a;
        if (atomicReferenceFieldUpdater.get(this) != null) {
            return false;
        }
        atomicReferenceFieldUpdater.set(this, s.f4939b);
        return true;
    }

    @Override // a6.d
    public final D5.d[] b(a6.b bVar) {
        w wVar = (w) bVar;
        f4953a.set(this, null);
        return a6.c.f5199a;
    }
}
