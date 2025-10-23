package com.google.crypto.tink.shaded.protobuf;

import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.util.Iterator;
import java.util.Map;
/* loaded from: classes.dex */
public final class M {
    public static void a(Object obj) {
        AbstractC0515y1.v(obj);
        throw null;
    }

    public static void b(Object obj, Object obj2) {
        L l7 = (L) obj;
        AbstractC0515y1.v(obj2);
        if (!l7.isEmpty()) {
            Iterator it = l7.entrySet().iterator();
            if (!it.hasNext()) {
                return;
            }
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            throw null;
        }
    }

    public static boolean c(Object obj) {
        return !((L) obj).f9072q;
    }

    public static L d(Object obj, Object obj2) {
        L l7 = (L) obj;
        L l8 = (L) obj2;
        if (!l8.isEmpty()) {
            if (!l7.f9072q) {
                l7 = l7.d();
            }
            l7.c();
            if (!l8.isEmpty()) {
                l7.putAll(l8);
            }
        }
        return l7;
    }

    public static L e() {
        return L.f9071r.d();
    }

    public static void f(Object obj) {
        ((L) obj).f9072q = false;
    }
}
