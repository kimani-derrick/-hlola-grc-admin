package b5;

import L5.p;
import android.util.Log;
import k3.AbstractC0958a;
import z5.C1530l;
/* renamed from: b5.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0378c extends F5.i implements p {

    /* renamed from: u  reason: collision with root package name */
    public /* synthetic */ Object f7137u;

    /* JADX WARN: Type inference failed for: r0v0, types: [b5.c, D5.d, F5.i] */
    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        ?? iVar = new F5.i(2, dVar);
        iVar.f7137u = obj;
        return iVar;
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        D5.d dVar = (D5.d) obj2;
        C1530l c1530l = C1530l.f16479a;
        ((C0378c) h(dVar, (String) obj)).p(c1530l);
        return c1530l;
    }

    @Override // F5.a
    public final Object p(Object obj) {
        AbstractC0958a.H(obj);
        Log.e("SessionConfigFetcher", "Error failing to fetch the remote configs: " + ((String) this.f7137u));
        return C1530l.f16479a;
    }
}
