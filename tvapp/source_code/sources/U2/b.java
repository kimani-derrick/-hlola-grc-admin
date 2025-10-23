package U2;

import M2.h;
import Z2.AbstractC0156a;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class b implements h {

    /* renamed from: r  reason: collision with root package name */
    public static final b f3430r = new b();

    /* renamed from: q  reason: collision with root package name */
    public final List f3431q;

    public b() {
        this.f3431q = Collections.emptyList();
    }

    @Override // M2.h
    public final int a(long j7) {
        if (j7 < 0) {
            return 0;
        }
        return -1;
    }

    @Override // M2.h
    public final List h(long j7) {
        if (j7 >= 0) {
            return this.f3431q;
        }
        return Collections.emptyList();
    }

    @Override // M2.h
    public final long k(int i7) {
        boolean z7;
        if (i7 == 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        AbstractC0156a.f(z7);
        return 0L;
    }

    @Override // M2.h
    public final int u() {
        return 1;
    }

    public b(M2.b bVar) {
        this.f3431q = Collections.singletonList(bVar);
    }
}
