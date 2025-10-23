package H2;

import Z2.AbstractC0156a;
import android.os.Looper;
import e2.J0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* renamed from: H2.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0000a {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f1009a = new ArrayList(1);

    /* renamed from: b  reason: collision with root package name */
    public final HashSet f1010b = new HashSet(1);

    /* renamed from: c  reason: collision with root package name */
    public final C.d f1011c = new C.d(new CopyOnWriteArrayList(), 0, (A) null);
    public final j2.n d = new j2.n(new CopyOnWriteArrayList(), 0, null);

    /* renamed from: e  reason: collision with root package name */
    public Looper f1012e;
    public J0 f;

    /* renamed from: g  reason: collision with root package name */
    public f2.m f1013g;

    public abstract InterfaceC0022x a(A a7, Y2.r rVar, long j7);

    public final void b(B b7) {
        HashSet hashSet = this.f1010b;
        boolean z7 = !hashSet.isEmpty();
        hashSet.remove(b7);
        if (z7 && hashSet.isEmpty()) {
            c();
        }
    }

    public final void d(B b7) {
        this.f1012e.getClass();
        HashSet hashSet = this.f1010b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(b7);
        if (isEmpty) {
            e();
        }
    }

    public J0 f() {
        return null;
    }

    public abstract e2.Z g();

    public boolean h() {
        return true;
    }

    public abstract void i();

    public final void j(B b7, Y2.W w7, f2.m mVar) {
        boolean z7;
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f1012e;
        if (looper != null && looper != myLooper) {
            z7 = false;
        } else {
            z7 = true;
        }
        AbstractC0156a.f(z7);
        this.f1013g = mVar;
        J0 j02 = this.f;
        this.f1009a.add(b7);
        if (this.f1012e == null) {
            this.f1012e = myLooper;
            this.f1010b.add(b7);
            k(w7);
        } else if (j02 != null) {
            d(b7);
            b7.a(this, j02);
        }
    }

    public abstract void k(Y2.W w7);

    public final void l(J0 j02) {
        this.f = j02;
        Iterator it = this.f1009a.iterator();
        while (it.hasNext()) {
            ((B) it.next()).a(this, j02);
        }
    }

    public abstract void m(InterfaceC0022x interfaceC0022x);

    public final void n(B b7) {
        ArrayList arrayList = this.f1009a;
        arrayList.remove(b7);
        if (arrayList.isEmpty()) {
            this.f1012e = null;
            this.f = null;
            this.f1013g = null;
            this.f1010b.clear();
            o();
            return;
        }
        b(b7);
    }

    public abstract void o();

    public final void p(j2.o oVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.d.f11835c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            j2.m mVar = (j2.m) it.next();
            if (mVar.f11832b == oVar) {
                copyOnWriteArrayList.remove(mVar);
            }
        }
    }

    public final void q(H h7) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.f1011c.f326t;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            G g7 = (G) it.next();
            if (g7.f901b == h7) {
                copyOnWriteArrayList.remove(g7);
            }
        }
    }

    public void c() {
    }

    public void e() {
    }
}
