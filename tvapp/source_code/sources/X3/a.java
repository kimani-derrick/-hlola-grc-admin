package X3;

import S3.n;
import T3.f;
import T3.h;
import e4.s0;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f4281a = 0;

    static {
        f[] fVarArr = {new f(9, S3.c.class)};
        HashMap hashMap = new HashMap();
        f fVar = fVarArr[0];
        boolean containsKey = hashMap.containsKey(fVar.f3332a);
        Class cls = fVar.f3332a;
        if (!containsKey) {
            hashMap.put(cls, fVar);
            Class cls2 = fVarArr[0].f3332a;
            Collections.unmodifiableMap(hashMap);
            int i7 = s0.CONFIG_NAME_FIELD_NUMBER;
            try {
                n.h(c.f4286b);
                if (!W3.a.f3937b.get()) {
                    n.f(new h(9), true);
                    return;
                }
                return;
            } catch (GeneralSecurityException e3) {
                throw new ExceptionInInitializerError(e3);
            }
        }
        throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + cls.getCanonicalName());
    }
}
