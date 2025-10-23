package M5;

import java.util.AbstractCollection;
import java.util.Collection;
import z5.InterfaceC1519a;
/* loaded from: classes.dex */
public abstract class r {
    public static Collection a(AbstractCollection abstractCollection) {
        if (!(abstractCollection instanceof N5.a) || (abstractCollection instanceof N5.b)) {
            return abstractCollection;
        }
        c(abstractCollection, "kotlin.collections.MutableCollection");
        throw null;
    }

    public static void b(int i7, Object obj) {
        int i8;
        if (obj != null) {
            if (obj instanceof InterfaceC1519a) {
                if (obj instanceof e) {
                    i8 = ((e) obj).e();
                } else if (obj instanceof L5.a) {
                    i8 = 0;
                } else if (obj instanceof L5.l) {
                    i8 = 1;
                } else if (obj instanceof L5.p) {
                    i8 = 2;
                } else if (obj instanceof L5.q) {
                    i8 = 3;
                } else if (obj instanceof D0.b) {
                    i8 = 4;
                } else {
                    i8 = -1;
                }
                if (i8 == i7) {
                    return;
                }
            }
            c(obj, "kotlin.jvm.functions.Function" + i7);
            throw null;
        }
    }

    public static void c(Object obj, String str) {
        String name;
        if (obj == null) {
            name = "null";
        } else {
            name = obj.getClass().getName();
        }
        ClassCastException classCastException = new ClassCastException(name + " cannot be cast to " + str);
        g.j(classCastException, r.class.getName());
        throw classCastException;
    }
}
