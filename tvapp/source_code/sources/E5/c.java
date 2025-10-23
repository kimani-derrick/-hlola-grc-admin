package E5;

import D5.d;
import D5.i;
import L5.p;
import M5.g;
import M5.r;
import k3.AbstractC0958a;
/* loaded from: classes.dex */
public final class c extends F5.c {

    /* renamed from: t  reason: collision with root package name */
    public int f617t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ p f618u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Object f619v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, i iVar, p pVar, Object obj) {
        super(dVar, iVar);
        this.f618u = pVar;
        this.f619v = obj;
        g.d(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
    }

    @Override // F5.a
    public final Object p(Object obj) {
        int i7 = this.f617t;
        if (i7 != 0) {
            if (i7 == 1) {
                this.f617t = 2;
                AbstractC0958a.H(obj);
                return obj;
            }
            throw new IllegalStateException("This coroutine had already completed".toString());
        }
        this.f617t = 1;
        AbstractC0958a.H(obj);
        p pVar = this.f618u;
        g.d(pVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
        r.b(2, pVar);
        return pVar.j(this.f619v, this);
    }
}
