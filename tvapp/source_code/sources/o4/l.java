package o4;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes.dex */
public final class l implements M4.b {

    /* renamed from: a  reason: collision with root package name */
    public volatile Set f12943a;

    /* renamed from: b  reason: collision with root package name */
    public volatile Set f12944b;

    public final synchronized void a() {
        try {
            for (M4.b bVar : this.f12943a) {
                this.f12944b.add(bVar.get());
            }
            this.f12943a = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // M4.b
    public final Object get() {
        if (this.f12944b == null) {
            synchronized (this) {
                try {
                    if (this.f12944b == null) {
                        this.f12944b = Collections.newSetFromMap(new ConcurrentHashMap());
                        a();
                    }
                } finally {
                }
            }
        }
        return Collections.unmodifiableSet(this.f12944b);
    }
}
