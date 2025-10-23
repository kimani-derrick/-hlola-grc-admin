package A5;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
/* loaded from: classes.dex */
public abstract class q extends p {
    public static void R(Iterable iterable, AbstractCollection abstractCollection) {
        M5.g.f(abstractCollection, "<this>");
        M5.g.f(iterable, "elements");
        if (iterable instanceof Collection) {
            abstractCollection.addAll((Collection) iterable);
            return;
        }
        for (Object obj : iterable) {
            abstractCollection.add(obj);
        }
    }

    public static final boolean S(AbstractCollection abstractCollection, L5.l lVar, boolean z7) {
        Iterator it = abstractCollection.iterator();
        boolean z8 = false;
        while (it.hasNext()) {
            if (((Boolean) lVar.c(it.next())).booleanValue() == z7) {
                it.remove();
                z8 = true;
            }
        }
        return z8;
    }
}
