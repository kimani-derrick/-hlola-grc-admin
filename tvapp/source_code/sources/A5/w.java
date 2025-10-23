package A5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import z5.C1524f;
/* loaded from: classes.dex */
public abstract class w extends p6.d {
    public static int J(int i7) {
        if (i7 >= 0) {
            if (i7 < 3) {
                return i7 + 1;
            }
            if (i7 < 1073741824) {
                return (int) ((i7 / 0.75f) + 1.0f);
            }
            return Integer.MAX_VALUE;
        }
        return i7;
    }

    public static LinkedHashMap K(C1524f... c1524fArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(J(c1524fArr.length));
        L(linkedHashMap, c1524fArr);
        return linkedHashMap;
    }

    public static final void L(LinkedHashMap linkedHashMap, C1524f[] c1524fArr) {
        M5.g.f(c1524fArr, "pairs");
        for (C1524f c1524f : c1524fArr) {
            linkedHashMap.put(c1524f.f16468q, c1524f.f16469r);
        }
    }

    public static Map M(ArrayList arrayList) {
        u uVar = u.f136q;
        int size = arrayList.size();
        if (size != 0) {
            if (size != 1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(J(arrayList.size()));
                O(arrayList, linkedHashMap);
                return linkedHashMap;
            }
            C1524f c1524f = (C1524f) arrayList.get(0);
            M5.g.f(c1524f, "pair");
            Map singletonMap = Collections.singletonMap(c1524f.f16468q, c1524f.f16469r);
            M5.g.e(singletonMap, "singletonMap(...)");
            return singletonMap;
        }
        return uVar;
    }

    public static Map N(Map map) {
        M5.g.f(map, "<this>");
        int size = map.size();
        if (size != 0) {
            if (size != 1) {
                return P(map);
            }
            return Q(map);
        }
        return u.f136q;
    }

    public static final void O(ArrayList arrayList, LinkedHashMap linkedHashMap) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C1524f c1524f = (C1524f) it.next();
            linkedHashMap.put(c1524f.f16468q, c1524f.f16469r);
        }
    }

    public static LinkedHashMap P(Map map) {
        M5.g.f(map, "<this>");
        return new LinkedHashMap(map);
    }

    public static final Map Q(Map map) {
        M5.g.f(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        M5.g.e(singletonMap, "with(...)");
        return singletonMap;
    }
}
