package S3;

import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;
import r0.AbstractC1111a;
/* loaded from: classes.dex */
public final class e {

    /* renamed from: b  reason: collision with root package name */
    public static final Logger f3140b = Logger.getLogger(e.class.getName());

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap f3141a;

    public e() {
        this.f3141a = new ConcurrentHashMap();
    }

    public final synchronized d a(String str) {
        if (this.f3141a.containsKey(str)) {
        } else {
            throw new GeneralSecurityException("No key manager found for key type " + str);
        }
        return (d) this.f3141a.get(str);
    }

    public final synchronized void b(Z3.e eVar) {
        if (AbstractC1111a.d(eVar.d())) {
            c(new d(eVar));
        } else {
            throw new GeneralSecurityException("failed to register key manager " + eVar.getClass() + " as it is not FIPS compatible.");
        }
    }

    public final synchronized void c(d dVar) {
        try {
            Z3.e eVar = dVar.f3139a;
            String e3 = ((Z3.e) new f(eVar, (Class) eVar.f4705b).f3145b).e();
            d dVar2 = (d) this.f3141a.get(e3);
            if (dVar2 != null && !dVar2.f3139a.getClass().equals(dVar.f3139a.getClass())) {
                f3140b.warning("Attempted overwrite of a registered key manager for key type ".concat(e3));
                String name = dVar2.f3139a.getClass().getName();
                String name2 = dVar.f3139a.getClass().getName();
                throw new GeneralSecurityException("typeUrl (" + e3 + ") is already registered with " + name + ", cannot be re-registered with " + name2);
            }
            this.f3141a.putIfAbsent(e3, dVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public e(e eVar) {
        this.f3141a = new ConcurrentHashMap(eVar.f3141a);
    }
}
