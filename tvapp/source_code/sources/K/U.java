package K;

import android.view.View;
import android.view.ViewGroup;
import k3.AbstractC0958a;
import z5.C1530l;
/* loaded from: classes.dex */
public final class U extends F5.h implements L5.p, M5.e {

    /* renamed from: r  reason: collision with root package name */
    public final int f1452r;

    /* renamed from: s  reason: collision with root package name */
    public int f1453s;

    /* renamed from: t  reason: collision with root package name */
    public /* synthetic */ Object f1454t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ View f1455u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(View view, D5.d dVar) {
        super(dVar);
        this.f1455u = view;
        this.f1452r = 2;
    }

    @Override // M5.e
    public final int e() {
        return this.f1452r;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        U u7 = new U(this.f1455u, dVar);
        u7.f1454t = obj;
        return u7;
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((U) h((D5.d) obj2, (T5.i) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        Object obj2;
        Object obj3 = E5.a.f612q;
        int i7 = this.f1453s;
        View view = this.f1455u;
        if (i7 != 0) {
            Object obj4 = C1530l.f16479a;
            if (i7 != 1) {
                if (i7 == 2) {
                    AbstractC0958a.H(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                T5.i iVar = (T5.i) this.f1454t;
                AbstractC0958a.H(obj);
                if (view instanceof ViewGroup) {
                    this.f1454t = null;
                    this.f1453s = 2;
                    iVar.getClass();
                    C0044u c0044u = new C0044u(new A5.b(1, (ViewGroup) view));
                    if (!c0044u.f1507r.hasNext()) {
                        obj2 = obj4;
                    } else {
                        iVar.f3403s = c0044u;
                        iVar.f3401q = 2;
                        iVar.f3404t = this;
                        obj2 = obj3;
                    }
                    if (obj2 != obj3) {
                        obj2 = obj4;
                    }
                    if (obj2 == obj3) {
                        return obj3;
                    }
                }
            }
            return obj4;
        }
        AbstractC0958a.H(obj);
        T5.i iVar2 = (T5.i) this.f1454t;
        this.f1454t = iVar2;
        this.f1453s = 1;
        iVar2.f3402r = view;
        iVar2.f3401q = 3;
        iVar2.f3404t = this;
        return obj3;
    }

    @Override // F5.a
    public final String toString() {
        if (this.f729q == null) {
            M5.p.f2316a.getClass();
            String a7 = M5.q.a(this);
            M5.g.e(a7, "renderLambdaToString(...)");
            return a7;
        }
        return super.toString();
    }
}
