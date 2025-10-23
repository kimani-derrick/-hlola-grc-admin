package Z3;

import g4.C0736a;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class j {

    /* renamed from: b  reason: collision with root package name */
    public static final j f4712b = new j();

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReference f4713a = new AtomicReference(new v(new C4.b(7)));

    /* JADX WARN: Type inference failed for: r0v2, types: [S3.b, java.lang.Object] */
    public final S3.b a(q qVar) {
        AtomicReference atomicReference = this.f4713a;
        v vVar = (v) atomicReference.get();
        vVar.getClass();
        C0736a c0736a = qVar.f4726b;
        if (!vVar.f4735b.containsKey(new t(q.class, c0736a))) {
            try {
                ?? obj = new Object();
                qVar.d.ordinal();
                return obj;
            } catch (GeneralSecurityException e3) {
                throw new RuntimeException("Creating a LegacyProtoKey failed", e3);
            }
        }
        v vVar2 = (v) atomicReference.get();
        vVar2.getClass();
        t tVar = new t(q.class, c0736a);
        HashMap hashMap = vVar2.f4735b;
        if (hashMap.containsKey(tVar)) {
            return ((a) hashMap.get(tVar)).f4699c.f(qVar);
        }
        throw new GeneralSecurityException("No Key Parser for requested key type " + tVar + " available");
    }

    public final synchronized void b(a aVar) {
        C4.b bVar = new C4.b((v) this.f4713a.get());
        bVar.Q(aVar);
        this.f4713a.set(new v(bVar));
    }

    public final synchronized void c(c cVar) {
        C4.b bVar = new C4.b((v) this.f4713a.get());
        bVar.R(cVar);
        this.f4713a.set(new v(bVar));
    }

    public final synchronized void d(k kVar) {
        C4.b bVar = new C4.b((v) this.f4713a.get());
        bVar.S(kVar);
        this.f4713a.set(new v(bVar));
    }

    public final synchronized void e(l lVar) {
        C4.b bVar = new C4.b((v) this.f4713a.get());
        bVar.T(lVar);
        this.f4713a.set(new v(bVar));
    }
}
