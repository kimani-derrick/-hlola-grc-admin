package H2;

import Z2.AbstractC0156a;
import e2.D0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
/* loaded from: classes.dex */
public final class L implements InterfaceC0022x, InterfaceC0021w {

    /* renamed from: q  reason: collision with root package name */
    public final InterfaceC0022x[] f909q;

    /* renamed from: r  reason: collision with root package name */
    public final IdentityHashMap f910r;

    /* renamed from: s  reason: collision with root package name */
    public final J3.e f911s;

    /* renamed from: t  reason: collision with root package name */
    public final ArrayList f912t = new ArrayList();

    /* renamed from: u  reason: collision with root package name */
    public final HashMap f913u = new HashMap();

    /* renamed from: v  reason: collision with root package name */
    public InterfaceC0021w f914v;

    /* renamed from: w  reason: collision with root package name */
    public n0 f915w;

    /* renamed from: x  reason: collision with root package name */
    public InterfaceC0022x[] f916x;

    /* renamed from: y  reason: collision with root package name */
    public T4.c f917y;

    public L(J3.e eVar, long[] jArr, InterfaceC0022x... interfaceC0022xArr) {
        this.f911s = eVar;
        this.f909q = interfaceC0022xArr;
        eVar.getClass();
        this.f917y = new T4.c(7, new f0[0]);
        this.f910r = new IdentityHashMap();
        this.f916x = new InterfaceC0022x[0];
        for (int i7 = 0; i7 < interfaceC0022xArr.length; i7++) {
            long j7 = jArr[i7];
            if (j7 != 0) {
                this.f909q[i7] = new J(interfaceC0022xArr[i7], j7);
            }
        }
    }

    @Override // H2.InterfaceC0022x
    public final long B() {
        InterfaceC0022x[] interfaceC0022xArr;
        InterfaceC0022x[] interfaceC0022xArr2;
        long j7 = -9223372036854775807L;
        for (InterfaceC0022x interfaceC0022x : this.f916x) {
            long B6 = interfaceC0022x.B();
            if (B6 != -9223372036854775807L) {
                if (j7 == -9223372036854775807L) {
                    for (InterfaceC0022x interfaceC0022x2 : this.f916x) {
                        if (interfaceC0022x2 == interfaceC0022x) {
                            break;
                        } else if (interfaceC0022x2.v(B6) != B6) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j7 = B6;
                } else if (B6 != j7) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (j7 != -9223372036854775807L && interfaceC0022x.v(j7) != j7) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j7;
    }

    @Override // H2.f0
    public final boolean C(long j7) {
        ArrayList arrayList = this.f912t;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                ((InterfaceC0022x) arrayList.get(i7)).C(j7);
            }
            return false;
        }
        return this.f917y.C(j7);
    }

    @Override // H2.f0
    public final void G(long j7) {
        this.f917y.G(j7);
    }

    @Override // H2.f0
    public final boolean a() {
        return this.f917y.a();
    }

    @Override // H2.InterfaceC0022x
    public final void e(InterfaceC0021w interfaceC0021w, long j7) {
        this.f914v = interfaceC0021w;
        ArrayList arrayList = this.f912t;
        InterfaceC0022x[] interfaceC0022xArr = this.f909q;
        Collections.addAll(arrayList, interfaceC0022xArr);
        for (InterfaceC0022x interfaceC0022x : interfaceC0022xArr) {
            interfaceC0022x.e(this, j7);
        }
    }

    @Override // H2.InterfaceC0022x
    public final n0 g() {
        n0 n0Var = this.f915w;
        n0Var.getClass();
        return n0Var;
    }

    @Override // H2.e0
    public final void h(f0 f0Var) {
        InterfaceC0022x interfaceC0022x = (InterfaceC0022x) f0Var;
        InterfaceC0021w interfaceC0021w = this.f914v;
        interfaceC0021w.getClass();
        interfaceC0021w.h(this);
    }

    @Override // H2.f0
    public final long m() {
        return this.f917y.m();
    }

    @Override // H2.InterfaceC0022x
    public final void n() {
        for (InterfaceC0022x interfaceC0022x : this.f909q) {
            interfaceC0022x.n();
        }
    }

    @Override // H2.InterfaceC0021w
    public final void s(InterfaceC0022x interfaceC0022x) {
        ArrayList arrayList = this.f912t;
        arrayList.remove(interfaceC0022x);
        if (!arrayList.isEmpty()) {
            return;
        }
        InterfaceC0022x[] interfaceC0022xArr = this.f909q;
        int i7 = 0;
        for (InterfaceC0022x interfaceC0022x2 : interfaceC0022xArr) {
            i7 += interfaceC0022x2.g().f1146q;
        }
        m0[] m0VarArr = new m0[i7];
        int i8 = 0;
        for (int i9 = 0; i9 < interfaceC0022xArr.length; i9++) {
            n0 g7 = interfaceC0022xArr[i9].g();
            int i10 = g7.f1146q;
            int i11 = 0;
            while (i11 < i10) {
                m0 a7 = g7.a(i11);
                m0 m0Var = new m0(i9 + ":" + a7.f1134r, a7.f1136t);
                this.f913u.put(m0Var, a7);
                m0VarArr[i8] = m0Var;
                i11++;
                i8++;
            }
        }
        this.f915w = new n0(m0VarArr);
        InterfaceC0021w interfaceC0021w = this.f914v;
        interfaceC0021w.getClass();
        interfaceC0021w.s(this);
    }

    @Override // H2.InterfaceC0022x
    public final long u(long j7, D0 d02) {
        InterfaceC0022x interfaceC0022x;
        InterfaceC0022x[] interfaceC0022xArr = this.f916x;
        if (interfaceC0022xArr.length > 0) {
            interfaceC0022x = interfaceC0022xArr[0];
        } else {
            interfaceC0022x = this.f909q[0];
        }
        return interfaceC0022x.u(j7, d02);
    }

    @Override // H2.InterfaceC0022x
    public final long v(long j7) {
        long v5 = this.f916x[0].v(j7);
        int i7 = 1;
        while (true) {
            InterfaceC0022x[] interfaceC0022xArr = this.f916x;
            if (i7 < interfaceC0022xArr.length) {
                if (interfaceC0022xArr[i7].v(v5) == v5) {
                    i7++;
                } else {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else {
                return v5;
            }
        }
    }

    @Override // H2.InterfaceC0022x
    public final void w(long j7) {
        for (InterfaceC0022x interfaceC0022x : this.f916x) {
            interfaceC0022x.w(j7);
        }
    }

    @Override // H2.InterfaceC0022x
    public final long y(W2.q[] qVarArr, boolean[] zArr, d0[] d0VarArr, boolean[] zArr2, long j7) {
        IdentityHashMap identityHashMap;
        d0 d0Var;
        ArrayList arrayList;
        Integer num;
        int intValue;
        int[] iArr = new int[qVarArr.length];
        int[] iArr2 = new int[qVarArr.length];
        int i7 = 0;
        int i8 = 0;
        while (true) {
            int length = qVarArr.length;
            identityHashMap = this.f910r;
            if (i8 >= length) {
                break;
            }
            d0 d0Var2 = d0VarArr[i8];
            if (d0Var2 == null) {
                num = null;
            } else {
                num = (Integer) identityHashMap.get(d0Var2);
            }
            if (num == null) {
                intValue = -1;
            } else {
                intValue = num.intValue();
            }
            iArr[i8] = intValue;
            W2.q qVar = qVarArr[i8];
            if (qVar != null) {
                String str = qVar.b().f1134r;
                iArr2[i8] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i8] = -1;
            }
            i8++;
        }
        identityHashMap.clear();
        int length2 = qVarArr.length;
        d0[] d0VarArr2 = new d0[length2];
        d0[] d0VarArr3 = new d0[qVarArr.length];
        W2.q[] qVarArr2 = new W2.q[qVarArr.length];
        InterfaceC0022x[] interfaceC0022xArr = this.f909q;
        ArrayList arrayList2 = new ArrayList(interfaceC0022xArr.length);
        long j8 = j7;
        int i9 = 0;
        while (i9 < interfaceC0022xArr.length) {
            int i10 = i7;
            while (i10 < qVarArr.length) {
                if (iArr[i10] == i9) {
                    d0Var = d0VarArr[i10];
                } else {
                    d0Var = null;
                }
                d0VarArr3[i10] = d0Var;
                if (iArr2[i10] == i9) {
                    W2.q qVar2 = qVarArr[i10];
                    qVar2.getClass();
                    arrayList = arrayList2;
                    m0 m0Var = (m0) this.f913u.get(qVar2.b());
                    m0Var.getClass();
                    qVarArr2[i10] = new I(qVar2, m0Var);
                } else {
                    arrayList = arrayList2;
                    qVarArr2[i10] = null;
                }
                i10++;
                arrayList2 = arrayList;
            }
            ArrayList arrayList3 = arrayList2;
            int i11 = i9;
            InterfaceC0022x[] interfaceC0022xArr2 = interfaceC0022xArr;
            W2.q[] qVarArr3 = qVarArr2;
            long y3 = interfaceC0022xArr[i9].y(qVarArr2, zArr, d0VarArr3, zArr2, j8);
            if (i11 == 0) {
                j8 = y3;
            } else if (y3 != j8) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z7 = false;
            for (int i12 = 0; i12 < qVarArr.length; i12++) {
                boolean z8 = true;
                if (iArr2[i12] == i11) {
                    d0 d0Var3 = d0VarArr3[i12];
                    d0Var3.getClass();
                    d0VarArr2[i12] = d0VarArr3[i12];
                    identityHashMap.put(d0Var3, Integer.valueOf(i11));
                    z7 = true;
                } else if (iArr[i12] == i11) {
                    if (d0VarArr3[i12] != null) {
                        z8 = false;
                    }
                    AbstractC0156a.k(z8);
                }
            }
            if (z7) {
                arrayList3.add(interfaceC0022xArr2[i11]);
            }
            i9 = i11 + 1;
            arrayList2 = arrayList3;
            interfaceC0022xArr = interfaceC0022xArr2;
            qVarArr2 = qVarArr3;
            i7 = 0;
        }
        int i13 = i7;
        System.arraycopy(d0VarArr2, i13, d0VarArr, i13, length2);
        InterfaceC0022x[] interfaceC0022xArr3 = (InterfaceC0022x[]) arrayList2.toArray(new InterfaceC0022x[i13]);
        this.f916x = interfaceC0022xArr3;
        this.f911s.getClass();
        this.f917y = new T4.c(7, interfaceC0022xArr3);
        return j8;
    }

    @Override // H2.f0
    public final long z() {
        return this.f917y.z();
    }
}
