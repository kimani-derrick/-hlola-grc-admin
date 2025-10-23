package D5;

import L5.p;
/* loaded from: classes.dex */
public final class b extends M5.h implements p {

    /* renamed from: s  reason: collision with root package name */
    public static final b f524s = new b(2, 0);

    /* renamed from: t  reason: collision with root package name */
    public static final b f525t = new b(2, 1);

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ int f526r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i7, int i8) {
        super(i7);
        this.f526r = i8;
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        c cVar;
        switch (this.f526r) {
            case 0:
                String str = (String) obj;
                g gVar = (g) obj2;
                M5.g.f(str, "acc");
                M5.g.f(gVar, "element");
                if (str.length() == 0) {
                    return gVar.toString();
                }
                return str + ", " + gVar;
            default:
                i iVar = (i) obj;
                g gVar2 = (g) obj2;
                M5.g.f(iVar, "acc");
                M5.g.f(gVar2, "element");
                i x7 = iVar.x(gVar2.getKey());
                j jVar = j.f531q;
                if (x7 != jVar) {
                    e eVar = e.f529q;
                    f fVar = (f) x7.f(eVar);
                    if (fVar == null) {
                        cVar = new c(gVar2, x7);
                    } else {
                        i x8 = x7.x(eVar);
                        if (x8 == jVar) {
                            return new c(fVar, gVar2);
                        }
                        cVar = new c(fVar, new c(gVar2, x8));
                    }
                    return cVar;
                }
                return gVar2;
        }
    }
}
