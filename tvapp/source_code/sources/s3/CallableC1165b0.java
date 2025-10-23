package s3;

import com.google.android.gms.internal.measurement.C0506w2;
import java.util.concurrent.Callable;
import u4.RunnableC1291o;
/* renamed from: s3.b0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class CallableC1165b0 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f13965a = 0;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ Object f13966b;

    public /* synthetic */ CallableC1165b0() {
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f13965a) {
            case 0:
                return new C0506w2(((Z) this.f13966b).f13941A);
            case 1:
                BinderC1181j0 binderC1181j0 = (BinderC1181j0) this.f13966b;
                binderC1181j0.d.a0();
                C1160O c1160o = binderC1181j0.d.f14212x;
                q1.z(c1160o);
                c1160o.D();
                ((C1175g0) c1160o.f2765q).getClass();
                throw new IllegalStateException("Unexpected call on client side");
            default:
                ((Runnable) this.f13966b).run();
                return null;
        }
    }

    public CallableC1165b0(BinderC1181j0 binderC1181j0, C1201u c1201u, String str) {
        this.f13966b = binderC1181j0;
    }

    public CallableC1165b0(RunnableC1291o runnableC1291o) {
        this.f13966b = runnableC1291o;
    }
}
