package androidx.emoji2.text;

import java.util.concurrent.ThreadPoolExecutor;
import k3.AbstractC0958a;
/* loaded from: classes.dex */
public final class k extends AbstractC0958a {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ AbstractC0958a f5848c;
    public final /* synthetic */ ThreadPoolExecutor d;

    public k(AbstractC0958a abstractC0958a, ThreadPoolExecutor threadPoolExecutor) {
        this.f5848c = abstractC0958a;
        this.d = threadPoolExecutor;
    }

    @Override // k3.AbstractC0958a
    public final void A(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.d;
        try {
            this.f5848c.A(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // k3.AbstractC0958a
    public final void B(C4.b bVar) {
        ThreadPoolExecutor threadPoolExecutor = this.d;
        try {
            this.f5848c.B(bVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
