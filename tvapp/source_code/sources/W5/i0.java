package W5;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* loaded from: classes.dex */
public final class i0 extends b6.b {

    /* renamed from: b  reason: collision with root package name */
    public final b6.k f3999b;

    /* renamed from: c  reason: collision with root package name */
    public b6.k f4000c;
    public final /* synthetic */ j0 d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f4001e;

    public i0(b6.k kVar, j0 j0Var, W w7) {
        this.d = j0Var;
        this.f4001e = w7;
        this.f3999b = kVar;
    }

    @Override // b6.b
    public final void b(Object obj, Object obj2) {
        boolean z7;
        b6.k kVar;
        b6.k kVar2 = (b6.k) obj;
        if (obj2 == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        b6.k kVar3 = this.f3999b;
        if (z7) {
            kVar = kVar3;
        } else {
            kVar = this.f4000c;
        }
        if (kVar != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b6.k.f7198q;
            while (!atomicReferenceFieldUpdater.compareAndSet(kVar2, this, kVar)) {
                if (atomicReferenceFieldUpdater.get(kVar2) != this) {
                    return;
                }
            }
            if (z7) {
                b6.k kVar4 = this.f4000c;
                M5.g.c(kVar4);
                kVar3.k(kVar4);
            }
        }
    }

    @Override // b6.b
    public final B0.d c(Object obj) {
        b6.k kVar = (b6.k) obj;
        if (this.d.K() == this.f4001e) {
            return null;
        }
        return b6.a.f7179e;
    }
}
