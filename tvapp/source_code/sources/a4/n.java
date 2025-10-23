package a4;

import e4.C0632b;
import e4.s0;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
/* loaded from: classes.dex */
public abstract class n {
    static {
        T3.f[] fVarArr = {new T3.f(11, S3.j.class)};
        HashMap hashMap = new HashMap();
        T3.f fVar = fVarArr[0];
        boolean containsKey = hashMap.containsKey(fVar.f3332a);
        Class cls = fVar.f3332a;
        if (!containsKey) {
            hashMap.put(cls, fVar);
            Class cls2 = fVarArr[0].f3332a;
            Collections.unmodifiableMap(hashMap);
            int i7 = s0.CONFIG_NAME_FIELD_NUMBER;
            try {
                a();
                return;
            } catch (GeneralSecurityException e3) {
                throw new ExceptionInInitializerError(e3);
            }
        }
        throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + cls.getCanonicalName());
    }

    public static void a() {
        S3.n.h(q.f5177c);
        S3.n.h(j.f5163a);
        S3.n.f(new C0211c(), true);
        Z3.l lVar = m.f5169a;
        Z3.j jVar = Z3.j.f4712b;
        jVar.e(m.f5169a);
        jVar.d(m.f5170b);
        jVar.c(m.f5171c);
        jVar.b(m.d);
        Z3.i iVar = Z3.i.f4710b;
        iVar.b(C0211c.f);
        if (W3.a.f3937b.get()) {
            return;
        }
        S3.n.f(new C0211c(C0632b.class, new T3.f[]{new T3.f(10, S3.j.class)}), true);
        jVar.e(g.f5160a);
        jVar.d(g.f5161b);
        jVar.c(g.f5162c);
        jVar.b(g.d);
        iVar.b(C0211c.f5144e);
    }
}
