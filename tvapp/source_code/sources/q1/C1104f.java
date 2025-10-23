package q1;

import java.util.concurrent.atomic.AtomicBoolean;
/* renamed from: q1.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1104f {

    /* renamed from: a  reason: collision with root package name */
    public final Object f13226a;

    /* renamed from: b  reason: collision with root package name */
    public final AtomicBoolean f13227b = new AtomicBoolean(false);

    public C1104f(Object obj) {
        this.f13226a = obj;
    }

    public final Object a() {
        if (this.f13227b.compareAndSet(false, true)) {
            return this.f13226a;
        }
        return null;
    }
}
