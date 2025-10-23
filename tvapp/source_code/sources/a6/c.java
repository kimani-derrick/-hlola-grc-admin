package a6;
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public static final D5.d[] f5199a = new D5.d[0];

    /* renamed from: b  reason: collision with root package name */
    public static final B0.d f5200b = new B0.d(6, "NULL", false);

    public static final Object a(D5.i iVar, Object obj, Object obj2, L5.p pVar, D5.d dVar) {
        Object m7 = b6.a.m(iVar, obj2);
        try {
            v vVar = new v(dVar, iVar);
            M5.r.b(2, pVar);
            Object j7 = pVar.j(obj, vVar);
            b6.a.h(iVar, m7);
            if (j7 == E5.a.f612q) {
                M5.g.f(dVar, "frame");
            }
            return j7;
        } catch (Throwable th) {
            b6.a.h(iVar, m7);
            throw th;
        }
    }
}
