package n5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
/* loaded from: classes.dex */
public final class h extends k {

    /* renamed from: c  reason: collision with root package name */
    public static final C1044a f12700c = new C1044a(2);

    /* renamed from: a  reason: collision with root package name */
    public final k f12701a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f12702b;

    public h(k kVar, int i7) {
        this.f12702b = i7;
        this.f12701a = kVar;
    }

    @Override // n5.k
    public final Object b(n nVar) {
        switch (this.f12702b) {
            case 0:
                Collection g7 = g();
                nVar.a();
                while (nVar.n()) {
                    ((ArrayList) g7).add(this.f12701a.b(nVar));
                }
                nVar.f();
                return g7;
            default:
                Collection g8 = g();
                nVar.a();
                while (nVar.n()) {
                    g8.add(this.f12701a.b(nVar));
                }
                nVar.f();
                return g8;
        }
    }

    @Override // n5.k
    public final void f(q qVar, Object obj) {
        Collection<Object> collection = (Collection) obj;
        switch (this.f12702b) {
            case 0:
                qVar.a();
                for (Object obj2 : collection) {
                    this.f12701a.f(qVar, obj2);
                }
                ((p) qVar).V(1, 2, ']');
                return;
            default:
                qVar.a();
                for (Object obj3 : collection) {
                    this.f12701a.f(qVar, obj3);
                }
                ((p) qVar).V(1, 2, ']');
                return;
        }
    }

    public final Collection g() {
        switch (this.f12702b) {
            case 0:
                return new ArrayList();
            default:
                return new LinkedHashSet();
        }
    }

    public final String toString() {
        return this.f12701a + ".collection()";
    }
}
