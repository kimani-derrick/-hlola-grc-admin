package Z5;

import W5.C0100g;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import z5.C1530l;
/* loaded from: classes.dex */
public final class w extends a6.b implements m, b {

    /* renamed from: u  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f4951u = AtomicReferenceFieldUpdater.newUpdater(w.class, Object.class, "_state");
    private volatile Object _state;

    /* renamed from: t  reason: collision with root package name */
    public int f4952t;

    public w(Object obj) {
        this._state = obj;
    }

    @Override // Z5.c
    public final Object a(Object obj, D5.d dVar) {
        f(obj);
        return C1530l.f16479a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [a6.d, java.lang.Object] */
    @Override // a6.b
    public final a6.d c() {
        return new Object();
    }

    @Override // a6.b
    public final a6.d[] d() {
        return new x[2];
    }

    public final void f(Object obj) {
        int i7;
        a6.d[] dVarArr;
        B0.d dVar;
        if (obj == null) {
            obj = a6.c.f5200b;
        }
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4951u;
            if (!M5.g.a(atomicReferenceFieldUpdater.get(this), obj)) {
                atomicReferenceFieldUpdater.set(this, obj);
                int i8 = this.f4952t;
                if ((i8 & 1) == 0) {
                    int i9 = i8 + 1;
                    this.f4952t = i9;
                    a6.d[] dVarArr2 = this.f5196q;
                    while (true) {
                        x[] xVarArr = (x[]) dVarArr2;
                        if (xVarArr != null) {
                            for (x xVar : xVarArr) {
                                if (xVar != null) {
                                    while (true) {
                                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = x.f4953a;
                                        Object obj2 = atomicReferenceFieldUpdater2.get(xVar);
                                        if (obj2 != null && obj2 != (dVar = s.f4940c)) {
                                            B0.d dVar2 = s.f4939b;
                                            if (obj2 == dVar2) {
                                                while (!atomicReferenceFieldUpdater2.compareAndSet(xVar, obj2, dVar)) {
                                                    if (atomicReferenceFieldUpdater2.get(xVar) != obj2) {
                                                        break;
                                                    }
                                                }
                                            } else {
                                                while (!atomicReferenceFieldUpdater2.compareAndSet(xVar, obj2, dVar2)) {
                                                    if (atomicReferenceFieldUpdater2.get(xVar) != obj2) {
                                                        break;
                                                    }
                                                }
                                                ((C0100g) obj2).m(C1530l.f16479a);
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        synchronized (this) {
                            i7 = this.f4952t;
                            if (i7 == i9) {
                                break;
                            }
                            dVarArr = this.f5196q;
                        }
                        dVarArr2 = dVarArr;
                        i9 = i7;
                    }
                    this.f4952t = i9 + 1;
                } else {
                    this.f4952t = i8 + 2;
                }
            }
        }
    }

    @Override // Z5.u
    public final Object getValue() {
        B0.d dVar = a6.c.f5200b;
        Object obj = f4951u.get(this);
        if (obj == dVar) {
            return null;
        }
        return obj;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0086 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:14:0x0039, B:28:0x007e, B:30:0x0086, B:33:0x008d, B:34:0x0093, B:36:0x0096, B:46:0x00b7, B:49:0x00ca, B:50:0x00e2, B:56:0x00f6, B:53:0x00ed, B:55:0x00f3, B:38:0x009c, B:42:0x00a3, B:21:0x0053, B:24:0x005d, B:27:0x006e), top: B:63:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ca A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:14:0x0039, B:28:0x007e, B:30:0x0086, B:33:0x008d, B:34:0x0093, B:36:0x0096, B:46:0x00b7, B:49:0x00ca, B:50:0x00e2, B:56:0x00f6, B:53:0x00ed, B:55:0x00f3, B:38:0x009c, B:42:0x00a3, B:21:0x0053, B:24:0x005d, B:27:0x006e), top: B:63:0x0027 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00c9 -> B:28:0x007e). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x00fd -> B:28:0x007e). Please submit an issue!!! */
    @Override // Z5.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(Z5.c r17, D5.d r18) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Z5.w.t(Z5.c, D5.d):java.lang.Object");
    }
}
