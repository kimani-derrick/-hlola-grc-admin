package F5;

import M5.p;
import M5.q;
/* loaded from: classes.dex */
public abstract class i extends c implements M5.e {

    /* renamed from: t  reason: collision with root package name */
    public final int f738t;

    public i(int i7, D5.d dVar) {
        super(dVar);
        this.f738t = i7;
    }

    @Override // M5.e
    public final int e() {
        return this.f738t;
    }

    @Override // F5.a
    public final String toString() {
        if (this.f729q == null) {
            p.f2316a.getClass();
            String a7 = q.a(this);
            M5.g.e(a7, "renderLambdaToString(...)");
            return a7;
        }
        return super.toString();
    }
}
