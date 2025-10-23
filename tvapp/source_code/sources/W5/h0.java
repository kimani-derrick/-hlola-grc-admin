package W5;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* loaded from: classes.dex */
public final class h0 implements W {

    /* renamed from: r  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f3994r = AtomicIntegerFieldUpdater.newUpdater(h0.class, "_isCompleting");

    /* renamed from: s  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f3995s = AtomicReferenceFieldUpdater.newUpdater(h0.class, Object.class, "_rootCause");

    /* renamed from: t  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f3996t = AtomicReferenceFieldUpdater.newUpdater(h0.class, Object.class, "_exceptionsHolder");
    private volatile Object _exceptionsHolder;
    private volatile int _isCompleting = 0;
    private volatile Object _rootCause;

    /* renamed from: q  reason: collision with root package name */
    public final l0 f3997q;

    public h0(l0 l0Var, Throwable th) {
        this.f3997q = l0Var;
        this._rootCause = th;
    }

    @Override // W5.W
    public final boolean a() {
        if (c() == null) {
            return true;
        }
        return false;
    }

    public final void b(Throwable th) {
        Throwable c5 = c();
        if (c5 == null) {
            f3995s.set(this, th);
        } else if (th == c5) {
        } else {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3996t;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                atomicReferenceFieldUpdater.set(this, th);
            } else if (obj instanceof Throwable) {
                if (th == obj) {
                    return;
                }
                ArrayList arrayList = new ArrayList(4);
                arrayList.add(obj);
                arrayList.add(th);
                atomicReferenceFieldUpdater.set(this, arrayList);
            } else if (obj instanceof ArrayList) {
                ((ArrayList) obj).add(th);
            } else {
                throw new IllegalStateException(("State is " + obj).toString());
            }
        }
    }

    public final Throwable c() {
        return (Throwable) f3995s.get(this);
    }

    public final boolean d() {
        if (c() != null) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        if (f3994r.get(this) != 0) {
            return true;
        }
        return false;
    }

    public final ArrayList f(Throwable th) {
        ArrayList arrayList;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3996t;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            arrayList = new ArrayList(4);
        } else if (obj instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(obj);
            arrayList = arrayList2;
        } else if (obj instanceof ArrayList) {
            arrayList = (ArrayList) obj;
        } else {
            throw new IllegalStateException(("State is " + obj).toString());
        }
        Throwable c5 = c();
        if (c5 != null) {
            arrayList.add(0, c5);
        }
        if (th != null && !M5.g.a(th, c5)) {
            arrayList.add(th);
        }
        atomicReferenceFieldUpdater.set(this, AbstractC0117y.f4039h);
        return arrayList;
    }

    @Override // W5.W
    public final l0 h() {
        return this.f3997q;
    }

    public final String toString() {
        return "Finishing[cancelling=" + d() + ", completing=" + e() + ", rootCause=" + c() + ", exceptions=" + f3996t.get(this) + ", list=" + this.f3997q + ']';
    }
}
