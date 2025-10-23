package b6;

import W5.AbstractC0117y;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* loaded from: classes.dex */
public class k {

    /* renamed from: q  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f7198q = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_next");

    /* renamed from: r  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f7199r = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_prev");

    /* renamed from: s  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f7200s = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_removedRef");
    private volatile Object _next = this;
    private volatile Object _prev = this;
    private volatile Object _removedRef;

    /* JADX WARN: Code restructure failed: missing block: B:25:0x003e, code lost:
        r6 = ((b6.q) r6).f7209a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0046, code lost:
        if (r5.compareAndSet(r4, r3, r6) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004e, code lost:
        if (r5.get(r4) == r3) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final b6.k i() {
        /*
            r9 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = b6.k.f7199r
            java.lang.Object r1 = r0.get(r9)
            b6.k r1 = (b6.k) r1
            r2 = 0
            r3 = r1
        La:
            r4 = r2
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = b6.k.f7198q
            java.lang.Object r6 = r5.get(r3)
            if (r6 != r9) goto L24
            if (r1 != r3) goto L16
            return r3
        L16:
            boolean r2 = r0.compareAndSet(r9, r1, r3)
            if (r2 == 0) goto L1d
            return r3
        L1d:
            java.lang.Object r2 = r0.get(r9)
            if (r2 == r1) goto L16
            goto L0
        L24:
            boolean r7 = r9.n()
            if (r7 == 0) goto L2b
            return r2
        L2b:
            if (r6 != 0) goto L2e
            return r3
        L2e:
            boolean r7 = r6 instanceof b6.p
            if (r7 == 0) goto L38
            b6.p r6 = (b6.p) r6
            r6.a(r3)
            goto L0
        L38:
            boolean r7 = r6 instanceof b6.q
            if (r7 == 0) goto L58
            if (r4 == 0) goto L51
            b6.q r6 = (b6.q) r6
            b6.k r6 = r6.f7209a
        L42:
            boolean r7 = r5.compareAndSet(r4, r3, r6)
            if (r7 == 0) goto L4a
            r3 = r4
            goto La
        L4a:
            java.lang.Object r7 = r5.get(r4)
            if (r7 == r3) goto L42
            goto L0
        L51:
            java.lang.Object r3 = r0.get(r3)
            b6.k r3 = (b6.k) r3
            goto Lb
        L58:
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            M5.g.d(r6, r4)
            r4 = r6
            b6.k r4 = (b6.k) r4
            r8 = r4
            r4 = r3
            r3 = r8
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.k.i():b6.k");
    }

    public final void k(k kVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7199r;
            k kVar2 = (k) atomicReferenceFieldUpdater.get(kVar);
            if (l() != kVar) {
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(kVar, kVar2, this)) {
                if (atomicReferenceFieldUpdater.get(kVar) != kVar2) {
                    break;
                }
            }
            if (n()) {
                kVar.i();
                return;
            }
            return;
        }
    }

    public final Object l() {
        while (true) {
            Object obj = f7198q.get(this);
            if (!(obj instanceof p)) {
                return obj;
            }
            ((p) obj).a(this);
        }
    }

    public final k m() {
        q qVar;
        k kVar;
        Object l7 = l();
        if (l7 instanceof q) {
            qVar = (q) l7;
        } else {
            qVar = null;
        }
        if (qVar == null || (kVar = qVar.f7209a) == null) {
            M5.g.d(l7, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            return (k) l7;
        }
        return kVar;
    }

    public boolean n() {
        return l() instanceof q;
    }

    public String toString() {
        return new M5.k(this, AbstractC0117y.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1) + '@' + AbstractC0117y.j(this);
    }
}
