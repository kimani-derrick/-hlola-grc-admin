package E5;

import D5.d;
import F5.h;
import L5.p;
import M5.g;
import M5.r;
import k3.AbstractC0958a;
/* loaded from: classes.dex */
public final class b extends h {

    /* renamed from: r  reason: collision with root package name */
    public int f614r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ p f615s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ Object f616t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, p pVar, Object obj) {
        super(dVar);
        this.f615s = pVar;
        this.f616t = obj;
        g.d(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
    }

    @Override // F5.a
    public final Object p(Object obj) {
        int i7 = this.f614r;
        if (i7 != 0) {
            if (i7 == 1) {
                this.f614r = 2;
                AbstractC0958a.H(obj);
                return obj;
            }
            throw new IllegalStateException("This coroutine had already completed".toString());
        }
        this.f614r = 1;
        AbstractC0958a.H(obj);
        p pVar = this.f615s;
        g.d(pVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
        r.b(2, pVar);
        return pVar.j(this.f616t, this);
    }
}
