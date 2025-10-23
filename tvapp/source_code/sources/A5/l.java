package A5;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public abstract class l extends m3.g {
    public static int K(List list) {
        M5.g.f(list, "<this>");
        return list.size() - 1;
    }

    public static List L(Object... objArr) {
        M5.g.f(objArr, "elements");
        if (objArr.length > 0) {
            return j.M(objArr);
        }
        return t.f135q;
    }

    public static ArrayList M(Object... objArr) {
        M5.g.f(objArr, "elements");
        if (objArr.length == 0) {
            return new ArrayList();
        }
        return new ArrayList(new h(objArr, true));
    }

    public static final List N(List list) {
        int size = list.size();
        if (size != 0) {
            if (size == 1) {
                return m3.g.z(list.get(0));
            }
            return list;
        }
        return t.f135q;
    }

    public static void O() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
