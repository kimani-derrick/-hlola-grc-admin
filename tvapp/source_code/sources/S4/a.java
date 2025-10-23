package S4;

import H.e;
import M5.g;
import W5.T;
import java.util.concurrent.Executor;
import n4.InterfaceC1036a;
import n4.InterfaceC1037b;
import n4.InterfaceC1038c;
import n4.InterfaceC1039d;
import o4.InterfaceC1071c;
import o4.o;
/* loaded from: classes.dex */
public final class a implements InterfaceC1071c {

    /* renamed from: r  reason: collision with root package name */
    public static final a f3160r = new a(0);

    /* renamed from: s  reason: collision with root package name */
    public static final a f3161s = new a(1);

    /* renamed from: t  reason: collision with root package name */
    public static final a f3162t = new a(2);

    /* renamed from: u  reason: collision with root package name */
    public static final a f3163u = new a(3);

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f3164q;

    public /* synthetic */ a(int i7) {
        this.f3164q = i7;
    }

    @Override // o4.InterfaceC1071c
    public final Object h(e eVar) {
        switch (this.f3164q) {
            case 0:
                Object g7 = eVar.g(new o(InterfaceC1036a.class, Executor.class));
                g.e(g7, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new T((Executor) g7);
            case 1:
                Object g8 = eVar.g(new o(InterfaceC1038c.class, Executor.class));
                g.e(g8, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new T((Executor) g8);
            case 2:
                Object g9 = eVar.g(new o(InterfaceC1037b.class, Executor.class));
                g.e(g9, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new T((Executor) g9);
            default:
                Object g10 = eVar.g(new o(InterfaceC1039d.class, Executor.class));
                g.e(g10, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new T((Executor) g10);
        }
    }
}
