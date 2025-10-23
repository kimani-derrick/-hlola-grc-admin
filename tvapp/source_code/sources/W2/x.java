package W2;

import Z2.H;
import e2.C0;
import e2.L0;
/* loaded from: classes.dex */
public final class x {

    /* renamed from: a  reason: collision with root package name */
    public final int f3932a;

    /* renamed from: b  reason: collision with root package name */
    public final C0[] f3933b;

    /* renamed from: c  reason: collision with root package name */
    public final q[] f3934c;
    public final L0 d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f3935e;

    public x(C0[] c0Arr, q[] qVarArr, L0 l02, s sVar) {
        this.f3933b = c0Arr;
        this.f3934c = (q[]) qVarArr.clone();
        this.d = l02;
        this.f3935e = sVar;
        this.f3932a = c0Arr.length;
    }

    public final boolean a(x xVar, int i7) {
        if (xVar == null || !H.a(this.f3933b[i7], xVar.f3933b[i7]) || !H.a(this.f3934c[i7], xVar.f3934c[i7])) {
            return false;
        }
        return true;
    }

    public final boolean b(int i7) {
        if (this.f3933b[i7] != null) {
            return true;
        }
        return false;
    }
}
