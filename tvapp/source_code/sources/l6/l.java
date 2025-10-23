package l6;

import h6.C0751a;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final int f12357a;

    /* renamed from: b  reason: collision with root package name */
    public final long f12358b;

    /* renamed from: c  reason: collision with root package name */
    public final k6.c f12359c;
    public final k6.b d;

    /* renamed from: e  reason: collision with root package name */
    public final ConcurrentLinkedQueue f12360e;

    public l(k6.d dVar, TimeUnit timeUnit) {
        M5.g.f(dVar, "taskRunner");
        this.f12357a = 5;
        this.f12358b = timeUnit.toNanos(5L);
        this.f12359c = dVar.f();
        this.d = new k6.b(this, M5.g.k(" ConnectionPool", i6.b.f11394g));
        this.f12360e = new ConcurrentLinkedQueue();
    }

    public final boolean a(C0751a c0751a, i iVar, List list, boolean z7) {
        M5.g.f(c0751a, "address");
        M5.g.f(iVar, "call");
        Iterator it = this.f12360e.iterator();
        while (it.hasNext()) {
            k kVar = (k) it.next();
            M5.g.e(kVar, "connection");
            synchronized (kVar) {
                if (z7) {
                    if (kVar.f12347g == null) {
                        continue;
                    }
                }
                if (kVar.i(c0751a, list)) {
                    iVar.c(kVar);
                    return true;
                }
            }
        }
        return false;
    }

    public final int b(k kVar, long j7) {
        byte[] bArr = i6.b.f11390a;
        ArrayList arrayList = kVar.f12355p;
        int i7 = 0;
        while (i7 < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i7);
            if (reference.get() != null) {
                i7++;
            } else {
                p6.n nVar = p6.n.f13188a;
                p6.n.f13188a.k(((g) reference).f12324a, "A connection to " + kVar.f12344b.f11109a.f11124h + " was leaked. Did you forget to close a response body?");
                arrayList.remove(i7);
                kVar.f12350j = true;
                if (arrayList.isEmpty()) {
                    kVar.f12356q = j7 - this.f12358b;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
