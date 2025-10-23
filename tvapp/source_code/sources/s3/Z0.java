package s3;
/* loaded from: classes.dex */
public final class Z0 implements Runnable {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f13952q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ InterfaceC1149D f13953r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ X0 f13954s;

    public /* synthetic */ Z0(X0 x02, InterfaceC1149D interfaceC1149D, int i7) {
        this.f13952q = i7;
        this.f13953r = interfaceC1149D;
        this.f13954s = x02;
    }

    private final void a() {
        synchronized (this.f13954s) {
            try {
                this.f13954s.f13928a = false;
                if (!this.f13954s.f13930c.R()) {
                    this.f13954s.f13930c.b().f13803D.d("Connected to service");
                    R0 r02 = this.f13954s.f13930c;
                    InterfaceC1149D interfaceC1149D = this.f13953r;
                    r02.D();
                    g3.n.g(interfaceC1149D);
                    r02.f13866t = interfaceC1149D;
                    r02.V();
                    r02.U();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13952q) {
            case 0:
                a();
                return;
            default:
                synchronized (this.f13954s) {
                    try {
                        this.f13954s.f13928a = false;
                        if (!this.f13954s.f13930c.R()) {
                            this.f13954s.f13930c.b().f13802C.d("Connected to remote service");
                            R0 r02 = this.f13954s.f13930c;
                            InterfaceC1149D interfaceC1149D = this.f13953r;
                            r02.D();
                            g3.n.g(interfaceC1149D);
                            r02.f13866t = interfaceC1149D;
                            r02.V();
                            r02.U();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }
}
