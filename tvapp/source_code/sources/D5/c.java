package D5;

import L5.p;
import java.io.Serializable;
/* loaded from: classes.dex */
public final class c implements i, Serializable {

    /* renamed from: q  reason: collision with root package name */
    public final i f527q;

    /* renamed from: r  reason: collision with root package name */
    public final g f528r;

    public c(g gVar, i iVar) {
        M5.g.f(iVar, "left");
        M5.g.f(gVar, "element");
        this.f527q = iVar;
        this.f528r = gVar;
    }

    @Override // D5.i
    public final Object O(Object obj, p pVar) {
        return pVar.j(this.f527q.O(obj, pVar), this.f528r);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                cVar.getClass();
                int i7 = 2;
                c cVar2 = cVar;
                int i8 = 2;
                while (true) {
                    i iVar = cVar2.f527q;
                    if (iVar instanceof c) {
                        cVar2 = (c) iVar;
                    } else {
                        cVar2 = null;
                    }
                    if (cVar2 == null) {
                        break;
                    }
                    i8++;
                }
                c cVar3 = this;
                while (true) {
                    i iVar2 = cVar3.f527q;
                    if (iVar2 instanceof c) {
                        cVar3 = (c) iVar2;
                    } else {
                        cVar3 = null;
                    }
                    if (cVar3 == null) {
                        break;
                    }
                    i7++;
                }
                if (i8 == i7) {
                    c cVar4 = this;
                    while (true) {
                        g gVar = cVar4.f528r;
                        if (!M5.g.a(cVar.f(gVar.getKey()), gVar)) {
                            break;
                        }
                        i iVar3 = cVar4.f527q;
                        if (iVar3 instanceof c) {
                            cVar4 = (c) iVar3;
                        } else {
                            M5.g.d(iVar3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                            g gVar2 = (g) iVar3;
                            if (M5.g.a(cVar.f(gVar2.getKey()), gVar2)) {
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // D5.i
    public final g f(h hVar) {
        M5.g.f(hVar, "key");
        c cVar = this;
        while (true) {
            g f = cVar.f528r.f(hVar);
            if (f != null) {
                return f;
            }
            i iVar = cVar.f527q;
            if (iVar instanceof c) {
                cVar = (c) iVar;
            } else {
                return iVar.f(hVar);
            }
        }
    }

    public final int hashCode() {
        return this.f528r.hashCode() + this.f527q.hashCode();
    }

    @Override // D5.i
    public final i r(i iVar) {
        M5.g.f(iVar, "context");
        if (iVar == j.f531q) {
            return this;
        }
        return (i) iVar.O(this, b.f525t);
    }

    public final String toString() {
        return "[" + ((String) O("", b.f524s)) + ']';
    }

    @Override // D5.i
    public final i x(h hVar) {
        M5.g.f(hVar, "key");
        g gVar = this.f528r;
        g f = gVar.f(hVar);
        i iVar = this.f527q;
        if (f != null) {
            return iVar;
        }
        i x7 = iVar.x(hVar);
        if (x7 == iVar) {
            return this;
        }
        if (x7 != j.f531q) {
            return new c(gVar, x7);
        }
        return gVar;
    }
}
