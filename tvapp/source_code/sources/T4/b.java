package T4;

import java.util.Iterator;
import java.util.Set;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f3378a;

    /* renamed from: b  reason: collision with root package name */
    public final c f3379b;

    public b(Set set, c cVar) {
        this.f3378a = a(set);
        this.f3379b = cVar;
    }

    public static String a(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            sb.append(aVar.f3376a);
            sb.append('/');
            sb.append(aVar.f3377b);
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }
}
