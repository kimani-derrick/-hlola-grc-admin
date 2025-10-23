package j2;

import Z2.H;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final int f11833a;

    /* renamed from: b  reason: collision with root package name */
    public final H2.A f11834b;

    /* renamed from: c  reason: collision with root package name */
    public final CopyOnWriteArrayList f11835c;

    public n(CopyOnWriteArrayList copyOnWriteArrayList, int i7, H2.A a7) {
        this.f11835c = copyOnWriteArrayList;
        this.f11833a = i7;
        this.f11834b = a7;
    }

    public final void a() {
        Iterator it = this.f11835c.iterator();
        while (it.hasNext()) {
            m mVar = (m) it.next();
            H.M(mVar.f11831a, new l(this, mVar.f11832b, 3));
        }
    }

    public final void b() {
        Iterator it = this.f11835c.iterator();
        while (it.hasNext()) {
            m mVar = (m) it.next();
            H.M(mVar.f11831a, new l(this, mVar.f11832b, 1));
        }
    }

    public final void c() {
        Iterator it = this.f11835c.iterator();
        while (it.hasNext()) {
            m mVar = (m) it.next();
            H.M(mVar.f11831a, new l(this, mVar.f11832b, 2));
        }
    }

    public final void d(int i7) {
        Iterator it = this.f11835c.iterator();
        while (it.hasNext()) {
            m mVar = (m) it.next();
            H.M(mVar.f11831a, new Z2.l(this, mVar.f11832b, i7, 2));
        }
    }

    public final void e(Exception exc) {
        Iterator it = this.f11835c.iterator();
        while (it.hasNext()) {
            m mVar = (m) it.next();
            H.M(mVar.f11831a, new H2.E(this, mVar.f11832b, exc, 8));
        }
    }

    public final void f() {
        Iterator it = this.f11835c.iterator();
        while (it.hasNext()) {
            m mVar = (m) it.next();
            H.M(mVar.f11831a, new l(this, mVar.f11832b, 0));
        }
    }
}
