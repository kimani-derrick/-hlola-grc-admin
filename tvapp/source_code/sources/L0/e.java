package L0;

import M5.p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import v6.D;
import v6.F;
import v6.k;
import v6.q;
import v6.r;
import v6.w;
/* loaded from: classes.dex */
public final class e extends k {

    /* renamed from: b  reason: collision with root package name */
    public final k f1875b;

    public e(r rVar) {
        M5.g.f(rVar, "delegate");
        this.f1875b = rVar;
    }

    @Override // v6.k
    public final D a(w wVar) {
        return this.f1875b.a(wVar);
    }

    @Override // v6.k
    public final void b(w wVar, w wVar2) {
        M5.g.f(wVar, "source");
        M5.g.f(wVar2, "target");
        this.f1875b.b(wVar, wVar2);
    }

    @Override // v6.k
    public final void c(w wVar) {
        this.f1875b.c(wVar);
    }

    @Override // v6.k
    public final void d(w wVar) {
        M5.g.f(wVar, "path");
        this.f1875b.d(wVar);
    }

    @Override // v6.k
    public final List g(w wVar) {
        M5.g.f(wVar, "dir");
        ArrayList arrayList = new ArrayList();
        for (w wVar2 : this.f1875b.g(wVar)) {
            M5.g.f(wVar2, "path");
            arrayList.add(wVar2);
        }
        if (arrayList.size() > 1) {
            Collections.sort(arrayList);
        }
        return arrayList;
    }

    @Override // v6.k
    public final u.e i(w wVar) {
        M5.g.f(wVar, "path");
        u.e i7 = this.f1875b.i(wVar);
        if (i7 == null) {
            return null;
        }
        w wVar2 = (w) i7.d;
        if (wVar2 == null) {
            return i7;
        }
        Map map = (Map) i7.f14618i;
        M5.g.f(map, "extras");
        return new u.e(i7.f14613b, i7.f14614c, wVar2, (Long) i7.f14615e, (Long) i7.f, (Long) i7.f14616g, (Long) i7.f14617h, map);
    }

    @Override // v6.k
    public final q j(w wVar) {
        M5.g.f(wVar, "file");
        return this.f1875b.j(wVar);
    }

    @Override // v6.k
    public final D k(w wVar) {
        w b7 = wVar.b();
        k kVar = this.f1875b;
        if (b7 != null) {
            A5.i iVar = new A5.i();
            while (b7 != null && !f(b7)) {
                iVar.f(b7);
                b7 = b7.b();
            }
            Iterator<E> it = iVar.iterator();
            while (it.hasNext()) {
                w wVar2 = (w) it.next();
                M5.g.f(wVar2, "dir");
                kVar.c(wVar2);
            }
        }
        return kVar.k(wVar);
    }

    @Override // v6.k
    public final F l(w wVar) {
        M5.g.f(wVar, "file");
        return this.f1875b.l(wVar);
    }

    public final String toString() {
        return p.a(e.class).b() + '(' + this.f1875b + ')';
    }
}
