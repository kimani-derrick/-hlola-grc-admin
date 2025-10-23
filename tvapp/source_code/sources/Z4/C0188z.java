package Z4;

import android.util.Log;
import k3.AbstractC0958a;
import z5.C1530l;
/* renamed from: Z4.z  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0188z extends F5.i implements L5.q {

    /* renamed from: u  reason: collision with root package name */
    public int f4875u;

    /* renamed from: v  reason: collision with root package name */
    public /* synthetic */ Z5.c f4876v;

    /* renamed from: w  reason: collision with root package name */
    public /* synthetic */ Throwable f4877w;

    /* JADX WARN: Type inference failed for: r0v0, types: [F5.i, Z4.z] */
    @Override // L5.q
    public final Object f(Z5.c cVar, Object obj, Object obj2) {
        ?? iVar = new F5.i(3, (D5.d) obj2);
        iVar.f4876v = cVar;
        iVar.f4877w = (Throwable) obj;
        return iVar.p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        E5.a aVar = E5.a.f612q;
        int i7 = this.f4875u;
        if (i7 != 0) {
            if (i7 == 1) {
                AbstractC0958a.H(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0958a.H(obj);
            Z5.c cVar = this.f4876v;
            Log.e("FirebaseSessionsRepo", "Error reading stored session data.", this.f4877w);
            Y.b bVar = new Y.b(true);
            this.f4876v = null;
            this.f4875u = 1;
            if (cVar.a(bVar, this) == aVar) {
                return aVar;
            }
        }
        return C1530l.f16479a;
    }
}
