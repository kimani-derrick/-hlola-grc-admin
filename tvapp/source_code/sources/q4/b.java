package q4;

import H2.E;
import b1.CallableC0357d;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import t3.C1244h;
import u4.AbstractC1276D;
import u4.s;
/* loaded from: classes.dex */
public final class b implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f13392a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ s f13393b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ B4.d f13394c;

    public b(boolean z7, s sVar, B4.d dVar) {
        this.f13392a = z7;
        this.f13393b = sVar;
        this.f13394c = dVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        if (this.f13392a) {
            s sVar = this.f13393b;
            sVar.getClass();
            CallableC0357d callableC0357d = new CallableC0357d(sVar, 7, this.f13394c);
            ExecutorService executorService = AbstractC1276D.f14978a;
            C1244h c1244h = new C1244h();
            ExecutorService executorService2 = sVar.f15047l;
            executorService2.execute(new E(callableC0357d, executorService2, c1244h, 10));
            return null;
        }
        return null;
    }
}
