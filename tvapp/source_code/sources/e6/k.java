package e6;

import b6.t;
import java.util.concurrent.atomic.AtomicReferenceArray;
/* loaded from: classes.dex */
public final class k extends t {

    /* renamed from: u  reason: collision with root package name */
    public final AtomicReferenceArray f10196u;

    public k(long j7, k kVar, int i7) {
        super(j7, kVar, i7);
        this.f10196u = new AtomicReferenceArray(j.f);
    }

    @Override // b6.t
    public final int f() {
        return j.f;
    }

    @Override // b6.t
    public final void g(int i7, D5.i iVar) {
        this.f10196u.set(i7, j.f10195e);
        h();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f7212s + ", hashCode=" + hashCode() + ']';
    }
}
