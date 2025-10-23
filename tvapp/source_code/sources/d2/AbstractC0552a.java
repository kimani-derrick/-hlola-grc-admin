package d2;

import Q1.c;
import android.util.SparseArray;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.util.HashMap;
/* renamed from: d2.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0552a {

    /* renamed from: a  reason: collision with root package name */
    public static final SparseArray f9214a = new SparseArray();

    /* renamed from: b  reason: collision with root package name */
    public static final HashMap f9215b;

    static {
        HashMap hashMap = new HashMap();
        f9215b = hashMap;
        hashMap.put(c.f2849q, 0);
        hashMap.put(c.f2850r, 1);
        hashMap.put(c.f2851s, 2);
        for (c cVar : hashMap.keySet()) {
            f9214a.append(((Integer) f9215b.get(cVar)).intValue(), cVar);
        }
    }

    public static int a(c cVar) {
        Integer num = (Integer) f9215b.get(cVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + cVar);
    }

    public static c b(int i7) {
        c cVar = (c) f9214a.get(i7);
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalArgumentException(AbstractC0515y1.l("Unknown Priority for value ", i7));
    }
}
