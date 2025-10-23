package n5;

import java.lang.reflect.InvocationTargetException;
import java.util.TreeMap;
/* loaded from: classes.dex */
public final class g extends k {
    public static final C1044a d = new C1044a(1);

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC1043D f12697a;

    /* renamed from: b  reason: collision with root package name */
    public final f[] f12698b;

    /* renamed from: c  reason: collision with root package name */
    public final androidx.fragment.app.D f12699c;

    public g(AbstractC1043D abstractC1043D, TreeMap treeMap) {
        this.f12697a = abstractC1043D;
        this.f12698b = (f[]) treeMap.values().toArray(new f[treeMap.size()]);
        this.f12699c = androidx.fragment.app.D.G((String[]) treeMap.keySet().toArray(new String[treeMap.size()]));
    }

    @Override // n5.k
    public final Object b(n nVar) {
        try {
            Object e3 = this.f12697a.e();
            try {
                nVar.b();
                while (nVar.n()) {
                    int X6 = nVar.X(this.f12699c);
                    if (X6 == -1) {
                        nVar.Y();
                        nVar.Z();
                    } else {
                        f fVar = this.f12698b[X6];
                        fVar.f12695b.set(e3, fVar.f12696c.b(nVar));
                    }
                }
                nVar.h();
                return e3;
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            }
        } catch (IllegalAccessException unused2) {
            throw new AssertionError();
        } catch (InstantiationException e7) {
            throw new RuntimeException(e7);
        } catch (InvocationTargetException e8) {
            o5.e.g(e8);
            throw null;
        }
    }

    @Override // n5.k
    public final void f(q qVar, Object obj) {
        f[] fVarArr;
        try {
            qVar.b();
            for (f fVar : this.f12698b) {
                qVar.j(fVar.f12694a);
                fVar.f12696c.f(qVar, fVar.f12695b.get(obj));
            }
            qVar.f();
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        }
    }

    public final String toString() {
        return "JsonAdapter(" + this.f12697a + ")";
    }
}
