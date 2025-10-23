package V4;

import H2.m0;
import O3.AbstractC0072p;
import O3.AbstractC0080y;
import O3.C;
import O3.E;
import O3.U;
import java.util.Arrays;
import t3.C1251o;
import t3.InterfaceC1243g;
/* loaded from: classes.dex */
public final /* synthetic */ class c implements InterfaceC1243g, W2.l {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ boolean f3664q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ Object f3665r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ Object f3666s;

    public /* synthetic */ c(e eVar, g gVar) {
        this.f3665r = eVar;
        this.f3664q = true;
        this.f3666s = gVar;
    }

    @Override // t3.InterfaceC1243g
    public C1251o A(Object obj) {
        e eVar = (e) this.f3665r;
        boolean z7 = this.f3664q;
        g gVar = (g) this.f3666s;
        Void r42 = (Void) obj;
        if (z7) {
            synchronized (eVar) {
                eVar.f3672c = m3.g.m(gVar);
            }
        } else {
            eVar.getClass();
        }
        return m3.g.m(gVar);
    }

    @Override // W2.l
    public U a(int i7, m0 m0Var, int[] iArr) {
        W2.o oVar = (W2.o) this.f3665r;
        oVar.getClass();
        W2.d dVar = new W2.d(oVar);
        C c5 = E.f2597r;
        AbstractC0072p.c("initialCapacity", 4);
        Object[] objArr = new Object[4];
        int i8 = 0;
        int i9 = 0;
        boolean z7 = false;
        while (i8 < m0Var.f1133q) {
            W2.e eVar = new W2.e(i7, m0Var, i8, (W2.h) this.f3666s, iArr[i8], this.f3664q, dVar);
            int i10 = i9 + 1;
            if (objArr.length < i10) {
                objArr = Arrays.copyOf(objArr, AbstractC0080y.f(objArr.length, i10));
            } else if (z7) {
                objArr = (Object[]) objArr.clone();
            } else {
                objArr[i9] = eVar;
                i8++;
                i9++;
            }
            z7 = false;
            objArr[i9] = eVar;
            i8++;
            i9++;
        }
        return E.o(i9, objArr);
    }

    public /* synthetic */ c(W2.o oVar, W2.h hVar, boolean z7) {
        this.f3665r = oVar;
        this.f3666s = hVar;
        this.f3664q = z7;
    }
}
