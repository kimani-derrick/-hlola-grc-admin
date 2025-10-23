package x6;

import W5.C0100g;
import h6.InterfaceC0754d;
import w4.l0;
/* renamed from: x6.q  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1484q {

    /* renamed from: a  reason: collision with root package name */
    public final M f16318a;

    /* renamed from: b  reason: collision with root package name */
    public final InterfaceC0754d f16319b;

    /* renamed from: c  reason: collision with root package name */
    public final InterfaceC1480m f16320c;
    public final /* synthetic */ int d;

    /* renamed from: e  reason: collision with root package name */
    public final InterfaceC1472e f16321e;

    public C1484q(M m7, InterfaceC0754d interfaceC0754d, InterfaceC1480m interfaceC1480m, InterfaceC1472e interfaceC1472e, int i7) {
        this.d = i7;
        this.f16318a = m7;
        this.f16319b = interfaceC0754d;
        this.f16320c = interfaceC1480m;
        this.f16321e = interfaceC1472e;
    }

    /* JADX WARN: Removed duplicated region for block: B:388:0x08bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static x6.C1484q b(u4.v r26, java.lang.reflect.Method r27) {
        /*
            Method dump skipped, instructions count: 2775
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x6.C1484q.b(u4.v, java.lang.reflect.Method):x6.q");
    }

    public final Object a(C1488v c1488v, Object[] objArr) {
        switch (this.d) {
            case 0:
                return this.f16321e.d(c1488v);
            case 1:
                InterfaceC1470c interfaceC1470c = (InterfaceC1470c) this.f16321e.d(c1488v);
                D5.d dVar = (D5.d) objArr[objArr.length - 1];
                try {
                    C0100g c0100g = new C0100g(1, l0.x(dVar));
                    c0100g.y(new C1485s(interfaceC1470c, 0));
                    interfaceC1470c.f(new f6.b(c0100g, 1));
                    return c0100g.v();
                } catch (Exception e3) {
                    return V.n(e3, dVar);
                }
            default:
                InterfaceC1470c interfaceC1470c2 = (InterfaceC1470c) this.f16321e.d(c1488v);
                D5.d dVar2 = (D5.d) objArr[objArr.length - 1];
                try {
                    C0100g c0100g2 = new C0100g(1, l0.x(dVar2));
                    c0100g2.y(new C1485s(interfaceC1470c2, 1));
                    interfaceC1470c2.f(new f6.b(c0100g2, 2));
                    return c0100g2.v();
                } catch (Exception e7) {
                    return V.n(e7, dVar2);
                }
        }
    }
}
