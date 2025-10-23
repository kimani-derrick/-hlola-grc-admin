package Z3;

import com.google.android.gms.internal.measurement.K1;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class i {

    /* renamed from: b  reason: collision with root package name */
    public static final i f4710b = new i();

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReference f4711a = new AtomicReference(new p(new K1(25)));

    public final Class a(Class cls) {
        HashMap hashMap = ((p) this.f4711a.get()).f4724b;
        if (hashMap.containsKey(cls)) {
            return ((S3.m) hashMap.get(cls)).a();
        }
        throw new GeneralSecurityException("No input primitive class for " + cls + " available");
    }

    public final synchronized void b(m mVar) {
        K1 k12 = new K1((p) this.f4711a.get());
        k12.J(mVar);
        this.f4711a.set(new p(k12));
    }

    public final synchronized void c(S3.m mVar) {
        K1 k12 = new K1((p) this.f4711a.get());
        k12.K(mVar);
        this.f4711a.set(new p(k12));
    }
}
