package F5;

import D5.j;
/* loaded from: classes.dex */
public abstract class h extends a {
    public h(D5.d dVar) {
        super(dVar);
        if (dVar != null && dVar.k() != j.f531q) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
        }
    }

    @Override // D5.d
    public final D5.i k() {
        return j.f531q;
    }
}
