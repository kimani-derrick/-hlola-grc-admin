package T5;

import A5.r;
import A5.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public abstract class j extends k {
    public static h J(Iterator it) {
        M5.g.f(it, "<this>");
        r rVar = new r(1, it);
        if (!(rVar instanceof a)) {
            return new a(rVar);
        }
        return rVar;
    }

    public static h K(Object obj, L5.l lVar) {
        if (obj == null) {
            return d.f3389a;
        }
        return new f(3, lVar, new D0.h(3, obj));
    }

    public static List L(h hVar) {
        Iterator it = hVar.iterator();
        if (!it.hasNext()) {
            return t.f135q;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return m3.g.z(next);
        }
        ArrayList arrayList = new ArrayList();
        while (true) {
            arrayList.add(next);
            if (it.hasNext()) {
                next = it.next();
            } else {
                return arrayList;
            }
        }
    }
}
