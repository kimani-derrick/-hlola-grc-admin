package A5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
/* loaded from: classes.dex */
public abstract class m extends l {
    public static int P(Iterable iterable) {
        M5.g.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return 10;
    }

    public static ArrayList Q(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            q.R((Iterable) it.next(), arrayList);
        }
        return arrayList;
    }
}
