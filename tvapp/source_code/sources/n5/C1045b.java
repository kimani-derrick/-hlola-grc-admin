package n5;

import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
/* renamed from: n5.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1045b extends k {
    public static final C1044a d = new C1044a(0);

    /* renamed from: e  reason: collision with root package name */
    public static final C1044a f12681e = new C1044a(3);

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12682a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final k f12683b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f12684c;

    public C1045b(Class cls, k kVar) {
        this.f12684c = cls;
        this.f12683b = kVar;
    }

    @Override // n5.k
    public final Object b(n nVar) {
        switch (this.f12682a) {
            case 0:
                ArrayList arrayList = new ArrayList();
                nVar.a();
                while (nVar.n()) {
                    arrayList.add(this.f12683b.b(nVar));
                }
                nVar.f();
                Object newInstance = Array.newInstance((Class) this.f12684c, arrayList.size());
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    Array.set(newInstance, i7, arrayList.get(i7));
                }
                return newInstance;
            default:
                v vVar = new v();
                nVar.b();
                while (nVar.n()) {
                    o oVar = (o) nVar;
                    if (oVar.n()) {
                        oVar.f12717z = oVar.g0();
                        oVar.f12714w = 11;
                    }
                    Object b7 = this.f12683b.b(nVar);
                    Object b8 = ((k) this.f12684c).b(nVar);
                    Object put = vVar.put(b7, b8);
                    if (put != null) {
                        throw new RuntimeException("Map key '" + b7 + "' has multiple values at path " + nVar.j() + ": " + put + " and " + b8);
                    }
                }
                nVar.h();
                return vVar;
        }
    }

    @Override // n5.k
    public final void f(q qVar, Object obj) {
        switch (this.f12682a) {
            case 0:
                qVar.a();
                int length = Array.getLength(obj);
                for (int i7 = 0; i7 < length; i7++) {
                    this.f12683b.f(qVar, Array.get(obj, i7));
                }
                ((p) qVar).V(1, 2, ']');
                return;
            default:
                qVar.b();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    if (entry.getKey() != null) {
                        int r3 = qVar.r();
                        if (r3 != 5 && r3 != 3) {
                            throw new IllegalStateException("Nesting problem.");
                        }
                        qVar.f12725u = true;
                        this.f12683b.f(qVar, entry.getKey());
                        ((k) this.f12684c).f(qVar, entry.getValue());
                    } else {
                        throw new RuntimeException("Map key is null at " + qVar.h());
                    }
                }
                qVar.f();
                return;
        }
    }

    public final String toString() {
        switch (this.f12682a) {
            case 0:
                return this.f12683b + ".array()";
            default:
                return "JsonAdapter(" + this.f12683b + "=" + ((k) this.f12684c) + ")";
        }
    }

    public C1045b(y yVar, Type type, Type type2) {
        yVar.getClass();
        Set set = o5.e.f12957a;
        this.f12683b = yVar.b(type, set);
        this.f12684c = yVar.b(type2, set);
    }
}
