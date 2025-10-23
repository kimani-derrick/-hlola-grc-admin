package S3;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f3138a = new byte[0];

    public static g a(String str) {
        Map unmodifiableMap;
        AtomicReference atomicReference = n.f3156a;
        synchronized (n.class) {
            unmodifiableMap = Collections.unmodifiableMap(n.d);
        }
        g gVar = (g) unmodifiableMap.get(str);
        if (gVar != null) {
            return gVar;
        }
        throw new GeneralSecurityException("cannot find key template: ".concat(str));
    }
}
