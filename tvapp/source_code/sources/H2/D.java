package H2;

import java.util.logging.Logger;
/* loaded from: classes.dex */
public final /* synthetic */ class D implements Runnable {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f884q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ Object f885r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ Object f886s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ Object f887t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ Object f888u;

    public /* synthetic */ D(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f884q = i7;
        this.f885r = obj;
        this.f886s = obj2;
        this.f887t = obj3;
        this.f888u = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f884q) {
            case 0:
                ((H) this.f886s).q(((C.d) this.f885r).f324r, (A) this.f887t, (C0020v) this.f888u);
                return;
            default:
                T1.i iVar = (T1.i) this.f886s;
                Q1.f fVar = (Q1.f) this.f887t;
                T1.h hVar = (T1.h) this.f888u;
                Y1.a aVar = (Y1.a) this.f885r;
                aVar.getClass();
                Logger logger = Y1.a.f;
                try {
                    U1.h a7 = aVar.f4312c.a(iVar.f3240a);
                    if (a7 == null) {
                        String str = "Transport backend '" + iVar.f3240a + "' is not registered";
                        logger.warning(str);
                        fVar.a(new IllegalArgumentException(str));
                    } else {
                        ((a2.j) aVar.f4313e).n(new U4.e(aVar, iVar, ((R1.b) a7).a(hVar), 3));
                        fVar.a(null);
                    }
                    return;
                } catch (Exception e3) {
                    logger.warning("Error scheduling event " + e3.getMessage());
                    fVar.a(e3);
                    return;
                }
        }
    }
}
