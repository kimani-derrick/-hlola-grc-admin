package h4;

import W5.T;
import java.util.concurrent.Executor;
import n4.InterfaceC1036a;
import n4.InterfaceC1037b;
import n4.InterfaceC1038c;
import n4.InterfaceC1039d;
import o4.InterfaceC1071c;
import o4.o;
/* loaded from: classes.dex */
public final class g implements InterfaceC1071c {

    /* renamed from: r  reason: collision with root package name */
    public static final g f10995r = new g(0);

    /* renamed from: s  reason: collision with root package name */
    public static final g f10996s = new g(1);

    /* renamed from: t  reason: collision with root package name */
    public static final g f10997t = new g(2);

    /* renamed from: u  reason: collision with root package name */
    public static final g f10998u = new g(3);

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f10999q;

    public /* synthetic */ g(int i7) {
        this.f10999q = i7;
    }

    @Override // o4.InterfaceC1071c
    public final Object h(H.e eVar) {
        switch (this.f10999q) {
            case 0:
                Object g7 = eVar.g(new o(InterfaceC1036a.class, Executor.class));
                M5.g.e(g7, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new T((Executor) g7);
            case 1:
                Object g8 = eVar.g(new o(InterfaceC1038c.class, Executor.class));
                M5.g.e(g8, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new T((Executor) g8);
            case 2:
                Object g9 = eVar.g(new o(InterfaceC1037b.class, Executor.class));
                M5.g.e(g9, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new T((Executor) g9);
            default:
                Object g10 = eVar.g(new o(InterfaceC1039d.class, Executor.class));
                M5.g.e(g10, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new T((Executor) g10);
        }
    }
}
