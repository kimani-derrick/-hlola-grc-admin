package n0;

import android.os.Bundle;
import java.util.List;
import java.util.ListIterator;
/* loaded from: classes.dex */
public abstract class N {

    /* renamed from: a  reason: collision with root package name */
    public C1021l f12511a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f12512b;

    public abstract v a();

    public final C1021l b() {
        C1021l c1021l = this.f12511a;
        if (c1021l != null) {
            return c1021l;
        }
        throw new IllegalStateException("You cannot access the Navigator's state until the Navigator is attached".toString());
    }

    public void d(List list, C1002D c1002d) {
        T5.e eVar = new T5.e(new T5.f(new T5.f(2, new X5.d(this, 3, c1002d), new A5.r(0, list))));
        while (eVar.hasNext()) {
            b().e((C1019j) eVar.next());
        }
    }

    public void e(C1021l c1021l) {
        this.f12511a = c1021l;
        this.f12512b = true;
    }

    public void f(C1019j c1019j) {
        v vVar = c1019j.f12543r;
        if (!(vVar instanceof v)) {
            vVar = null;
        }
        if (vVar == null) {
            return;
        }
        C1003E c1003e = new C1003E();
        c1003e.f12494b = true;
        boolean z7 = c1003e.f12494b;
        C1001C c1001c = c1003e.f12493a;
        c1001c.getClass();
        c1001c.getClass();
        int i7 = c1003e.f12495c;
        boolean z8 = c1003e.d;
        c1001c.getClass();
        c1001c.getClass();
        c1001c.getClass();
        c1001c.getClass();
        c(vVar, null, new C1002D(z7, false, i7, false, z8, c1001c.f12483a, c1001c.f12484b, c1001c.f12485c, c1001c.d));
        b().b(c1019j);
    }

    public Bundle h() {
        return null;
    }

    public void i(C1019j c1019j, boolean z7) {
        M5.g.f(c1019j, "popUpTo");
        List list = (List) ((Z5.u) b().f12559e.f3382r).getValue();
        if (list.contains(c1019j)) {
            ListIterator listIterator = list.listIterator(list.size());
            C1019j c1019j2 = null;
            while (j()) {
                c1019j2 = (C1019j) listIterator.previous();
                if (M5.g.a(c1019j2, c1019j)) {
                    break;
                }
            }
            if (c1019j2 != null) {
                b().c(c1019j2, z7);
                return;
            }
            return;
        }
        throw new IllegalStateException(("popBackStack was called with " + c1019j + " which does not exist in back stack " + list).toString());
    }

    public boolean j() {
        return true;
    }

    public void g(Bundle bundle) {
    }

    public v c(v vVar, Bundle bundle, C1002D c1002d) {
        return vVar;
    }
}
