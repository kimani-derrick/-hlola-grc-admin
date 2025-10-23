package a6;

import W5.AbstractC0117y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import r0.AbstractC1111a;
import w4.l0;
import z5.C1526h;
import z5.C1530l;
/* loaded from: classes.dex */
public final class q extends F5.c implements Z5.c {

    /* renamed from: t  reason: collision with root package name */
    public final Z5.c f5233t;

    /* renamed from: u  reason: collision with root package name */
    public final D5.i f5234u;

    /* renamed from: v  reason: collision with root package name */
    public final int f5235v;

    /* renamed from: w  reason: collision with root package name */
    public D5.i f5236w;

    /* renamed from: x  reason: collision with root package name */
    public D5.d f5237x;

    public q(Z5.c cVar, D5.i iVar) {
        super(n.f5230q, D5.j.f531q);
        this.f5233t = cVar;
        this.f5234u = iVar;
        this.f5235v = ((Number) iVar.O(0, p.f5232r)).intValue();
    }

    @Override // Z5.c
    public final Object a(Object obj, D5.d dVar) {
        try {
            Object s6 = s(dVar, obj);
            if (s6 == E5.a.f612q) {
                return s6;
            }
            return C1530l.f16479a;
        } catch (Throwable th) {
            this.f5236w = new m(dVar.k(), th);
            throw th;
        }
    }

    @Override // F5.a, F5.d
    public final F5.d g() {
        D5.d dVar = this.f5237x;
        if (dVar instanceof F5.d) {
            return (F5.d) dVar;
        }
        return null;
    }

    @Override // F5.c, D5.d
    public final D5.i k() {
        D5.i iVar = this.f5236w;
        if (iVar == null) {
            return D5.j.f531q;
        }
        return iVar;
    }

    @Override // F5.a
    public final StackTraceElement n() {
        return null;
    }

    @Override // F5.a
    public final Object p(Object obj) {
        Throwable a7 = C1526h.a(obj);
        if (a7 != null) {
            this.f5236w = new m(k(), a7);
        }
        D5.d dVar = this.f5237x;
        if (dVar != null) {
            dVar.m(obj);
        }
        return E5.a.f612q;
    }

    @Override // F5.c, F5.a
    public final void r() {
        super.r();
    }

    public final Object s(D5.d dVar, Object obj) {
        Comparable comparable;
        int i7;
        String str;
        D5.i k5 = dVar.k();
        AbstractC0117y.g(k5);
        D5.i iVar = this.f5236w;
        if (iVar != k5) {
            int i8 = 0;
            if (iVar instanceof m) {
                String str2 = "\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((m) iVar).f5228q + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ";
                M5.g.f(str2, "<this>");
                List n02 = U5.f.n0(str2);
                List list = n02;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (!U5.n.X((String) obj2)) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(A5.m.P(arrayList));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str3 = (String) it.next();
                    int length = str3.length();
                    int i9 = 0;
                    while (true) {
                        if (i9 < length) {
                            if (!l0.y(str3.charAt(i9))) {
                                break;
                            }
                            i9++;
                        } else {
                            i9 = -1;
                            break;
                        }
                    }
                    if (i9 == -1) {
                        i9 = str3.length();
                    }
                    arrayList2.add(Integer.valueOf(i9));
                }
                Iterator it2 = arrayList2.iterator();
                if (!it2.hasNext()) {
                    comparable = null;
                } else {
                    comparable = (Comparable) it2.next();
                    while (it2.hasNext()) {
                        Comparable comparable2 = (Comparable) it2.next();
                        if (comparable.compareTo(comparable2) > 0) {
                            comparable = comparable2;
                        }
                    }
                }
                Integer num = (Integer) comparable;
                if (num != null) {
                    i7 = num.intValue();
                } else {
                    i7 = 0;
                }
                int length2 = str2.length();
                n02.size();
                int K6 = A5.l.K(n02);
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : list) {
                    int i10 = i8 + 1;
                    if (i8 >= 0) {
                        String str4 = (String) obj3;
                        if ((i8 == 0 || i8 == K6) && U5.n.X(str4)) {
                            str = null;
                        } else {
                            M5.g.f(str4, "<this>");
                            if (i7 >= 0) {
                                int length3 = str4.length();
                                if (i7 <= length3) {
                                    length3 = i7;
                                }
                                str = str4.substring(length3);
                                M5.g.e(str, "substring(...)");
                            } else {
                                throw new IllegalArgumentException(AbstractC1111a.n(i7, "Requested character count ", " is less than zero.").toString());
                            }
                        }
                        if (str != null) {
                            arrayList3.add(str);
                        }
                        i8 = i10;
                    } else {
                        A5.l.O();
                        throw null;
                    }
                }
                StringBuilder sb = new StringBuilder(length2);
                A5.k.Y(arrayList3, sb, "\n", "", "", -1, "...", null);
                String sb2 = sb.toString();
                M5.g.e(sb2, "toString(...)");
                throw new IllegalStateException(sb2.toString());
            } else if (((Number) k5.O(0, new t(this))).intValue() == this.f5235v) {
                this.f5236w = k5;
            } else {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f5234u + ",\n\t\tbut emission happened in " + k5 + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
        }
        this.f5237x = dVar;
        L5.q qVar = s.f5239a;
        Z5.c cVar = this.f5233t;
        M5.g.d(cVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        Object f = qVar.f(cVar, obj, this);
        if (!M5.g.a(f, E5.a.f612q)) {
            this.f5237x = null;
        }
        return f;
    }
}
