package b6;

import java.util.Iterator;
import java.util.List;
import r0.AbstractC1111a;
/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: a  reason: collision with root package name */
    public static final X5.e f7208a;

    static {
        String str;
        Object next;
        int i7 = v.f7214a;
        X5.e eVar = null;
        try {
            str = System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null) {
            Boolean.parseBoolean(str);
        }
        List L6 = T5.j.L(T5.j.J(AbstractC1111a.y()));
        Iterator it = L6.iterator();
        if (!it.hasNext()) {
            next = null;
        } else {
            next = it.next();
            if (it.hasNext()) {
                int b7 = ((X5.a) next).b();
                do {
                    Object next2 = it.next();
                    int b8 = ((X5.a) next2).b();
                    if (b7 < b8) {
                        next = next2;
                        b7 = b8;
                    }
                } while (it.hasNext());
            }
        }
        X5.a aVar = (X5.a) next;
        if (aVar != null) {
            try {
                eVar = aVar.a(L6);
            } catch (Throwable unused2) {
                aVar.c();
            }
            if (eVar != null) {
                f7208a = eVar;
                return;
            }
        }
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }
}
