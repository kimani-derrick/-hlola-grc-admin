package s3;

import h3.AbstractC0748a;
/* loaded from: classes.dex */
public final class U0 implements Runnable {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f13911q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ m1 f13912r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ boolean f13913s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ R0 f13914t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ AbstractC0748a f13915u;

    public /* synthetic */ U0(R0 r02, m1 m1Var, boolean z7, AbstractC0748a abstractC0748a, Object obj, int i7) {
        this.f13911q = i7;
        this.f13912r = m1Var;
        this.f13913s = z7;
        this.f13915u = abstractC0748a;
        this.f13914t = r02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        u1 u1Var;
        C1168d c1168d;
        C1201u c1201u;
        switch (this.f13911q) {
            case 0:
                R0 r02 = this.f13914t;
                InterfaceC1149D interfaceC1149D = r02.f13866t;
                if (interfaceC1149D == null) {
                    r02.b().f13807v.d("Discarding data. Failed to set user property");
                    return;
                }
                m1 m1Var = this.f13912r;
                g3.n.g(m1Var);
                if (this.f13913s) {
                    u1Var = null;
                } else {
                    u1Var = (u1) this.f13915u;
                }
                r02.N(interfaceC1149D, u1Var, m1Var);
                r02.V();
                return;
            case 1:
                R0 r03 = this.f13914t;
                InterfaceC1149D interfaceC1149D2 = r03.f13866t;
                if (interfaceC1149D2 == null) {
                    r03.b().f13807v.d("Discarding data. Failed to send conditional user property to service");
                    return;
                }
                m1 m1Var2 = this.f13912r;
                g3.n.g(m1Var2);
                if (this.f13913s) {
                    c1168d = null;
                } else {
                    c1168d = (C1168d) this.f13915u;
                }
                r03.N(interfaceC1149D2, c1168d, m1Var2);
                r03.V();
                return;
            default:
                R0 r04 = this.f13914t;
                InterfaceC1149D interfaceC1149D3 = r04.f13866t;
                if (interfaceC1149D3 == null) {
                    r04.b().f13807v.d("Discarding data. Failed to send event to service");
                    return;
                }
                m1 m1Var3 = this.f13912r;
                g3.n.g(m1Var3);
                if (this.f13913s) {
                    c1201u = null;
                } else {
                    c1201u = (C1201u) this.f13915u;
                }
                r04.N(interfaceC1149D3, c1201u, m1Var3);
                r04.V();
                return;
        }
    }

    public U0(R0 r02, m1 m1Var, boolean z7, u1 u1Var) {
        this.f13911q = 0;
        this.f13912r = m1Var;
        this.f13913s = z7;
        this.f13915u = u1Var;
        this.f13914t = r02;
    }
}
