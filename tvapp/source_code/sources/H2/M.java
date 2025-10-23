package H2;

import O3.AbstractC0072p;
import e2.C0597b0;
import e2.J0;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
/* loaded from: classes.dex */
public final class M extends AbstractC0010k {

    /* renamed from: r  reason: collision with root package name */
    public static final e2.Z f918r;

    /* renamed from: k  reason: collision with root package name */
    public final AbstractC0000a[] f919k;

    /* renamed from: l  reason: collision with root package name */
    public final J0[] f920l;

    /* renamed from: m  reason: collision with root package name */
    public final ArrayList f921m;
    public final J3.e n;

    /* renamed from: o  reason: collision with root package name */
    public int f922o;

    /* renamed from: p  reason: collision with root package name */
    public long[][] f923p;

    /* renamed from: q  reason: collision with root package name */
    public H1.d f924q;

    /* JADX WARN: Type inference failed for: r4v0, types: [e2.O, e2.P] */
    static {
        e2.N n = new e2.N();
        O3.C c5 = O3.E.f2597r;
        O3.U u7 = O3.U.f2621u;
        Collections.emptyList();
        O3.U u8 = O3.U.f2621u;
        f918r = new e2.Z("MergingMediaSource", new e2.O(n), null, new e2.T(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), C0597b0.f9850Y, e2.V.f9769s);
    }

    public M(AbstractC0000a... abstractC0000aArr) {
        J3.e eVar = new J3.e(4);
        this.f919k = abstractC0000aArr;
        this.n = eVar;
        this.f921m = new ArrayList(Arrays.asList(abstractC0000aArr));
        this.f922o = -1;
        this.f920l = new J0[abstractC0000aArr.length];
        this.f923p = new long[0];
        new HashMap();
        AbstractC0072p.c("expectedKeys", 8);
        new O3.M().a().j();
    }

    @Override // H2.AbstractC0000a
    public final InterfaceC0022x a(A a7, Y2.r rVar, long j7) {
        AbstractC0000a[] abstractC0000aArr = this.f919k;
        int length = abstractC0000aArr.length;
        InterfaceC0022x[] interfaceC0022xArr = new InterfaceC0022x[length];
        J0[] j0Arr = this.f920l;
        int b7 = j0Arr[0].b(a7.f1180a);
        for (int i7 = 0; i7 < length; i7++) {
            interfaceC0022xArr[i7] = abstractC0000aArr[i7].a(a7.b(j0Arr[i7].m(b7)), rVar, j7 - this.f923p[b7][i7]);
        }
        return new L(this.n, this.f923p[b7], interfaceC0022xArr);
    }

    @Override // H2.AbstractC0000a
    public final e2.Z g() {
        AbstractC0000a[] abstractC0000aArr = this.f919k;
        if (abstractC0000aArr.length > 0) {
            return abstractC0000aArr[0].g();
        }
        return f918r;
    }

    @Override // H2.AbstractC0010k, H2.AbstractC0000a
    public final void i() {
        H1.d dVar = this.f924q;
        if (dVar == null) {
            super.i();
            return;
        }
        throw dVar;
    }

    @Override // H2.AbstractC0000a
    public final void k(Y2.W w7) {
        this.f1102j = w7;
        this.f1101i = Z2.H.n(null);
        int i7 = 0;
        while (true) {
            AbstractC0000a[] abstractC0000aArr = this.f919k;
            if (i7 < abstractC0000aArr.length) {
                v(Integer.valueOf(i7), abstractC0000aArr[i7]);
                i7++;
            } else {
                return;
            }
        }
    }

    @Override // H2.AbstractC0000a
    public final void m(InterfaceC0022x interfaceC0022x) {
        L l7 = (L) interfaceC0022x;
        int i7 = 0;
        while (true) {
            AbstractC0000a[] abstractC0000aArr = this.f919k;
            if (i7 < abstractC0000aArr.length) {
                AbstractC0000a abstractC0000a = abstractC0000aArr[i7];
                InterfaceC0022x interfaceC0022x2 = l7.f909q[i7];
                if (interfaceC0022x2 instanceof J) {
                    interfaceC0022x2 = ((J) interfaceC0022x2).f904q;
                }
                abstractC0000a.m(interfaceC0022x2);
                i7++;
            } else {
                return;
            }
        }
    }

    @Override // H2.AbstractC0010k, H2.AbstractC0000a
    public final void o() {
        super.o();
        Arrays.fill(this.f920l, (Object) null);
        this.f922o = -1;
        this.f924q = null;
        ArrayList arrayList = this.f921m;
        arrayList.clear();
        Collections.addAll(arrayList, this.f919k);
    }

    @Override // H2.AbstractC0010k
    public final A r(Object obj, A a7) {
        if (((Integer) obj).intValue() != 0) {
            return null;
        }
        return a7;
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [java.io.IOException, H1.d] */
    @Override // H2.AbstractC0010k
    public final void u(Object obj, AbstractC0000a abstractC0000a, J0 j02) {
        Integer num = (Integer) obj;
        if (this.f924q == null) {
            if (this.f922o == -1) {
                this.f922o = j02.i();
            } else if (j02.i() != this.f922o) {
                this.f924q = new IOException();
                return;
            }
            int length = this.f923p.length;
            J0[] j0Arr = this.f920l;
            if (length == 0) {
                this.f923p = (long[][]) Array.newInstance(Long.TYPE, this.f922o, j0Arr.length);
            }
            ArrayList arrayList = this.f921m;
            arrayList.remove(abstractC0000a);
            j0Arr[num.intValue()] = j02;
            if (arrayList.isEmpty()) {
                l(j0Arr[0]);
            }
        }
    }
}
