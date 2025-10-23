package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import r0.AbstractC1111a;
/* renamed from: com.google.android.gms.internal.measurement.t  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0488t {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f8674a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f8675b;

    public C0488t(int i7) {
        this.f8675b = i7;
    }

    public static InterfaceC0464o a(B b7, Iterator it, InterfaceC0464o interfaceC0464o) {
        if (it != null) {
            while (it.hasNext()) {
                InterfaceC0464o c02 = b7.a((InterfaceC0464o) it.next()).c0((C0419f) interfaceC0464o);
                if (c02 instanceof C0434i) {
                    C0434i c0434i = (C0434i) c02;
                    if ("break".equals(c0434i.f8580r)) {
                        return InterfaceC0464o.f8621e;
                    }
                    if ("return".equals(c0434i.f8580r)) {
                        return c0434i;
                    }
                }
            }
        }
        return InterfaceC0464o.f8621e;
    }

    public static C0469p c(C4.b bVar, ArrayList arrayList) {
        Q.l(G.f8286O, 2, arrayList);
        InterfaceC0464o S6 = ((androidx.fragment.app.D) bVar.f422s).S(bVar, (InterfaceC0464o) arrayList.get(0));
        InterfaceC0464o S7 = ((androidx.fragment.app.D) bVar.f422s).S(bVar, (InterfaceC0464o) arrayList.get(1));
        if (S7 instanceof C0419f) {
            ArrayList A6 = ((C0419f) S7).A();
            List arrayList2 = new ArrayList();
            if (arrayList.size() > 2) {
                arrayList2 = arrayList.subList(2, arrayList.size());
            }
            return new C0469p(S6.g(), A6, arrayList2, bVar);
        }
        throw new IllegalArgumentException(AbstractC0515y1.x("FN requires an ArrayValue of parameter names found ", S7.getClass().getCanonicalName()));
    }

    public static boolean e(InterfaceC0464o interfaceC0464o, InterfaceC0464o interfaceC0464o2) {
        InterfaceC0464o c0429h;
        InterfaceC0464o c0429h2;
        while (!interfaceC0464o.getClass().equals(interfaceC0464o2.getClass())) {
            if (((interfaceC0464o instanceof C0493u) || (interfaceC0464o instanceof C0454m)) && ((interfaceC0464o2 instanceof C0493u) || (interfaceC0464o2 instanceof C0454m))) {
                return true;
            }
            boolean z7 = interfaceC0464o instanceof C0429h;
            if (z7 && (interfaceC0464o2 instanceof C0474q)) {
                c0429h2 = new C0429h(interfaceC0464o2.r());
            } else {
                boolean z8 = interfaceC0464o instanceof C0474q;
                if (z8 && (interfaceC0464o2 instanceof C0429h)) {
                    c0429h = new C0429h(interfaceC0464o.r());
                } else if (interfaceC0464o instanceof C0424g) {
                    c0429h = new C0429h(interfaceC0464o.r());
                } else if (interfaceC0464o2 instanceof C0424g) {
                    c0429h2 = new C0429h(interfaceC0464o2.r());
                } else if ((z8 || z7) && (interfaceC0464o2 instanceof InterfaceC0439j)) {
                    c0429h2 = new C0474q(interfaceC0464o2.g());
                } else if (!(interfaceC0464o instanceof InterfaceC0439j) || (!(interfaceC0464o2 instanceof C0474q) && !(interfaceC0464o2 instanceof C0429h))) {
                    return false;
                } else {
                    c0429h = new C0474q(interfaceC0464o.g());
                }
                interfaceC0464o = c0429h;
            }
            interfaceC0464o2 = c0429h2;
        }
        if ((interfaceC0464o instanceof C0493u) || (interfaceC0464o instanceof C0454m)) {
            return true;
        }
        if (interfaceC0464o instanceof C0429h) {
            if (Double.isNaN(interfaceC0464o.r().doubleValue()) || Double.isNaN(interfaceC0464o2.r().doubleValue()) || interfaceC0464o.r().doubleValue() != interfaceC0464o2.r().doubleValue()) {
                return false;
            }
            return true;
        } else if (interfaceC0464o instanceof C0474q) {
            return interfaceC0464o.g().equals(interfaceC0464o2.g());
        } else {
            if (interfaceC0464o instanceof C0424g) {
                return interfaceC0464o.c().equals(interfaceC0464o2.c());
            }
            if (interfaceC0464o != interfaceC0464o2) {
                return false;
            }
            return true;
        }
    }

    public static InterfaceC0464o f(B b7, InterfaceC0464o interfaceC0464o, InterfaceC0464o interfaceC0464o2) {
        if (interfaceC0464o instanceof Iterable) {
            return a(b7, ((Iterable) interfaceC0464o).iterator(), interfaceC0464o2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    public static boolean g(InterfaceC0464o interfaceC0464o, InterfaceC0464o interfaceC0464o2) {
        if (interfaceC0464o instanceof InterfaceC0439j) {
            interfaceC0464o = new C0474q(interfaceC0464o.g());
        }
        if (interfaceC0464o2 instanceof InterfaceC0439j) {
            interfaceC0464o2 = new C0474q(interfaceC0464o2.g());
        }
        if ((interfaceC0464o instanceof C0474q) && (interfaceC0464o2 instanceof C0474q)) {
            if (((C0474q) interfaceC0464o).f8646q.compareTo(((C0474q) interfaceC0464o2).f8646q) < 0) {
                return true;
            }
            return false;
        }
        double doubleValue = interfaceC0464o.r().doubleValue();
        double doubleValue2 = interfaceC0464o2.r().doubleValue();
        if (!Double.isNaN(doubleValue) && !Double.isNaN(doubleValue2) && ((doubleValue != 0.0d || doubleValue2 != -0.0d) && ((doubleValue != -0.0d || doubleValue2 != 0.0d) && Double.compare(doubleValue, doubleValue2) < 0))) {
            return true;
        }
        return false;
    }

    public static boolean h(InterfaceC0464o interfaceC0464o, InterfaceC0464o interfaceC0464o2) {
        if (interfaceC0464o instanceof InterfaceC0439j) {
            interfaceC0464o = new C0474q(interfaceC0464o.g());
        }
        if (interfaceC0464o2 instanceof InterfaceC0439j) {
            interfaceC0464o2 = new C0474q(interfaceC0464o2.g());
        }
        if (((!(interfaceC0464o instanceof C0474q) || !(interfaceC0464o2 instanceof C0474q)) && (Double.isNaN(interfaceC0464o.r().doubleValue()) || Double.isNaN(interfaceC0464o2.r().doubleValue()))) || g(interfaceC0464o2, interfaceC0464o)) {
            return false;
        }
        return true;
    }

    public final InterfaceC0464o b(String str, C4.b bVar, ArrayList arrayList) {
        boolean e3;
        boolean j7;
        C0434i c0434i;
        InterfaceC0464o S6;
        InterfaceC0464o S7;
        B b7;
        C0429h c0429h;
        InterfaceC0464o S8;
        InterfaceC0464o c0429h2;
        String str2;
        int i7 = 0;
        switch (this.f8675b) {
            case 0:
                switch (AbstractC0498v.f8689a[Q.d(str).ordinal()]) {
                    case 1:
                        Q.h(G.f8322v, 2, arrayList);
                        return new C0429h(Double.valueOf(Q.k(((androidx.fragment.app.D) bVar.f422s).S(bVar, (InterfaceC0464o) arrayList.get(0)).r().doubleValue()) & Q.k(((androidx.fragment.app.D) bVar.f422s).S(bVar, (InterfaceC0464o) arrayList.get(1)).r().doubleValue())));
                    case 2:
                        Q.h(G.f8324w, 2, arrayList);
                        return new C0429h(Double.valueOf(Q.k(((androidx.fragment.app.D) bVar.f422s).S(bVar, (InterfaceC0464o) arrayList.get(0)).r().doubleValue()) << ((int) (Q.k(((androidx.fragment.app.D) bVar.f422s).S(bVar, (InterfaceC0464o) arrayList.get(1)).r().doubleValue()) & 31))));
                    case 3:
                        Q.h(G.f8326x, 1, arrayList);
                        return new C0429h(Double.valueOf(~Q.k(((androidx.fragment.app.D) bVar.f422s).S(bVar, (InterfaceC0464o) arrayList.get(0)).r().doubleValue())));
                    case 4:
                        Q.h(G.f8328y, 2, arrayList);
                        return new C0429h(Double.valueOf(Q.k(((androidx.fragment.app.D) bVar.f422s).S(bVar, (InterfaceC0464o) arrayList.get(0)).r().doubleValue()) | Q.k(((androidx.fragment.app.D) bVar.f422s).S(bVar, (InterfaceC0464o) arrayList.get(1)).r().doubleValue())));
                    case 5:
                        Q.h(G.f8329z, 2, arrayList);
                        return new C0429h(Double.valueOf(Q.k(((androidx.fragment.app.D) bVar.f422s).S(bVar, (InterfaceC0464o) arrayList.get(0)).r().doubleValue()) >> ((int) (Q.k(((androidx.fragment.app.D) bVar.f422s).S(bVar, (InterfaceC0464o) arrayList.get(1)).r().doubleValue()) & 31))));
                    case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                        Q.h(G.f8270A, 2, arrayList);
                        return new C0429h(Double.valueOf((Q.k(((androidx.fragment.app.D) bVar.f422s).S(bVar, (InterfaceC0464o) arrayList.get(0)).r().doubleValue()) & 4294967295L) >>> ((int) (Q.k(((androidx.fragment.app.D) bVar.f422s).S(bVar, (InterfaceC0464o) arrayList.get(1)).r().doubleValue()) & 31))));
                    case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                        Q.h(G.f8272B, 2, arrayList);
                        return new C0429h(Double.valueOf(Q.k(((androidx.fragment.app.D) bVar.f422s).S(bVar, (InterfaceC0464o) arrayList.get(0)).r().doubleValue()) ^ Q.k(((androidx.fragment.app.D) bVar.f422s).S(bVar, (InterfaceC0464o) arrayList.get(1)).r().doubleValue())));
                    default:
                        d(str);
                        throw null;
                }
            case 1:
                Q.i(Q.d(str).name(), 2, arrayList);
                InterfaceC0464o S9 = ((androidx.fragment.app.D) bVar.f422s).S(bVar, (InterfaceC0464o) arrayList.get(0));
                InterfaceC0464o S10 = ((androidx.fragment.app.D) bVar.f422s).S(bVar, (InterfaceC0464o) arrayList.get(1));
                switch (AbstractC0508x.f8714a[Q.d(str).ordinal()]) {
                    case 1:
                        e3 = e(S9, S10);
                        break;
                    case 2:
                        e3 = g(S10, S9);
                        break;
                    case 3:
                        e3 = h(S10, S9);
                        break;
                    case 4:
                        e3 = Q.j(S9, S10);
                        break;
                    case 5:
                        j7 = Q.j(S9, S10);
                        e3 = !j7;
                        break;
                    case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                        e3 = g(S9, S10);
                        break;
                    case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                        e3 = h(S9, S10);
                        break;
                    case 8:
                        j7 = e(S9, S10);
                        e3 = !j7;
                        break;
                    default:
                        d(str);
                        throw null;
                }
                return e3 ? InterfaceC0464o.f8625j : InterfaceC0464o.f8626k;
            case 2:
                switch (AbstractC0513y.f8715a[Q.d(str).ordinal()]) {
                    case 1:
                        Q.h(G.f8318t, 3, arrayList);
                        InterfaceC0464o S11 = ((androidx.fragment.app.D) bVar.f422s).S(bVar, (InterfaceC0464o) arrayList.get(0));
                        String g7 = ((androidx.fragment.app.D) bVar.f422s).S(bVar, (InterfaceC0464o) arrayList.get(1)).g();
                        InterfaceC0464o S12 = ((androidx.fragment.app.D) bVar.f422s).S(bVar, (InterfaceC0464o) arrayList.get(2));
                        if (S12 instanceof C0419f) {
                            if (g7.isEmpty()) {
                                throw new IllegalArgumentException("Function name for apply is undefined");
                            }
                            return S11.o(g7, bVar, ((C0419f) S12).A());
                        }
                        throw new IllegalArgumentException(AbstractC0515y1.x("Function arguments for Apply are not a list found ", S12.getClass().getCanonicalName()));
                    case 2:
                        return bVar.Z().c0(new C0419f(arrayList));
                    case 3:
                        Q.h(G.f8276D, 0, arrayList);
                        return InterfaceC0464o.f8623h;
                    case 4:
                    case 5:
                        if (!arrayList.isEmpty()) {
                            InterfaceC0464o S13 = ((androidx.fragment.app.D) bVar.f422s).S(bVar, (InterfaceC0464o) arrayList.get(0));
                            if (S13 instanceof C0419f) {
                                return bVar.c0((C0419f) S13);
                            }
                        }
                        break;
                    case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                        Q.h(G.f8276D, 0, arrayList);
                        return InterfaceC0464o.f8622g;
                    case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                        Q.l(G.f8282K, 2, arrayList);
                        C0469p c5 = c(bVar, arrayList);
                        String str3 = c5.f8593q;
                        if (str3 == null) {
                            str3 = "";
                        }
                        bVar.i0(str3, c5);
                        return c5;
                    case 8:
                        return c(bVar, arrayList);
                    case 9:
                        Q.l(G.f8300d0, 2, arrayList);
                        InterfaceC0464o S14 = ((androidx.fragment.app.D) bVar.f422s).S(bVar, (InterfaceC0464o) arrayList.get(0));
                        InterfaceC0464o S15 = ((androidx.fragment.app.D) bVar.f422s).S(bVar, (InterfaceC0464o) arrayList.get(1));
                        InterfaceC0464o S16 = arrayList.size() > 2 ? ((androidx.fragment.app.D) bVar.f422s).S(bVar, (InterfaceC0464o) arrayList.get(2)) : null;
                        InterfaceC0464o interfaceC0464o = InterfaceC0464o.f8621e;
                        InterfaceC0464o c02 = S14.c().booleanValue() ? bVar.c0((C0419f) S15) : S16 != null ? bVar.c0((C0419f) S16) : interfaceC0464o;
                        return c02 instanceof C0434i ? c02 : interfaceC0464o;
                    case 10:
                        return new C0419f(arrayList);
                    case 11:
                        if (arrayList.isEmpty()) {
                            return InterfaceC0464o.f8624i;
                        }
                        Q.h(G.f8317s0, 1, arrayList);
                        return new C0434i("return", ((androidx.fragment.app.D) bVar.f422s).S(bVar, (InterfaceC0464o) arrayList.get(0)));
                    case 12:
                        Q.h(G.f8323v0, 3, arrayList);
                        InterfaceC0464o S17 = ((androidx.fragment.app.D) bVar.f422s).S(bVar, (InterfaceC0464o) arrayList.get(0));
                        InterfaceC0464o S18 = ((androidx.fragment.app.D) bVar.f422s).S(bVar, (InterfaceC0464o) arrayList.get(1));
                        InterfaceC0464o S19 = ((androidx.fragment.app.D) bVar.f422s).S(bVar, (InterfaceC0464o) arrayList.get(2));
                        if (!(S18 instanceof C0419f)) {
                            throw new IllegalArgumentException("Malformed SWITCH statement, cases are not a list");
                        }
                        if (!(S19 instanceof C0419f)) {
                            throw new IllegalArgumentException("Malformed SWITCH statement, case statements are not a list");
                        }
                        C0419f c0419f = (C0419f) S18;
                        C0419f c0419f2 = (C0419f) S19;
                        boolean z7 = false;
                        while (true) {
                            if (i7 < c0419f.u()) {
                                if (z7 || S17.equals(((androidx.fragment.app.D) bVar.f422s).S(bVar, c0419f.s(i7)))) {
                                    InterfaceC0464o S20 = ((androidx.fragment.app.D) bVar.f422s).S(bVar, c0419f2.s(i7));
                                    if (!(S20 instanceof C0434i)) {
                                        z7 = true;
                                    } else if (!((C0434i) S20).f8580r.equals("break")) {
                                        return S20;
                                    }
                                }
                                i7++;
                            } else if (c0419f.u() + 1 == c0419f2.u()) {
                                InterfaceC0464o S21 = ((androidx.fragment.app.D) bVar.f422s).S(bVar, c0419f2.s(c0419f.u()));
                                if (S21 instanceof C0434i) {
                                    String str4 = ((C0434i) S21).f8580r;
                                    if (str4.equals("return") || str4.equals("continue")) {
                                        return S21;
                                    }
                                }
                            }
                        }
                        break;
                    case 13:
                        Q.h(G.f8325w0, 3, arrayList);
                        return ((androidx.fragment.app.D) bVar.f422s).S(bVar, (InterfaceC0464o) (((androidx.fragment.app.D) bVar.f422s).S(bVar, (InterfaceC0464o) arrayList.get(0)).c().booleanValue() ? arrayList.get(1) : arrayList.get(2)));
                    default:
                        d(str);
                        throw null;
                }
                return InterfaceC0464o.f8621e;
            case 3:
                int i8 = A.f8221a[Q.d(str).ordinal()];
                if (i8 == 1) {
                    Q.h(G.f8316s, 2, arrayList);
                    InterfaceC0464o S22 = ((androidx.fragment.app.D) bVar.f422s).S(bVar, (InterfaceC0464o) arrayList.get(0));
                    if (!S22.c().booleanValue()) {
                        return S22;
                    }
                } else if (i8 == 2) {
                    Q.h(G.f8306j0, 1, arrayList);
                    return new C0424g(Boolean.valueOf(!((androidx.fragment.app.D) bVar.f422s).S(bVar, (InterfaceC0464o) arrayList.get(0)).c().booleanValue()));
                } else if (i8 == 3) {
                    Q.h(G.f8309m0, 2, arrayList);
                    InterfaceC0464o S23 = ((androidx.fragment.app.D) bVar.f422s).S(bVar, (InterfaceC0464o) arrayList.get(0));
                    if (S23.c().booleanValue()) {
                        return S23;
                    }
                } else {
                    d(str);
                    throw null;
                }
                return ((androidx.fragment.app.D) bVar.f422s).S(bVar, (InterfaceC0464o) arrayList.get(1));
            case 4:
                switch (C.f8235a[Q.d(str).ordinal()]) {
                    case 1:
                        Q.h(G.f8287P, 3, arrayList);
                        if (arrayList.get(0) instanceof C0474q) {
                            String g8 = ((InterfaceC0464o) arrayList.get(0)).g();
                            InterfaceC0464o S24 = ((androidx.fragment.app.D) bVar.f422s).S(bVar, (InterfaceC0464o) arrayList.get(1));
                            InterfaceC0464o S25 = ((androidx.fragment.app.D) bVar.f422s).S(bVar, (InterfaceC0464o) arrayList.get(2));
                            Iterator h7 = S24.h();
                            if (h7 != null) {
                                while (h7.hasNext()) {
                                    bVar.g0(g8, (InterfaceC0464o) h7.next());
                                    InterfaceC0464o c03 = bVar.c0((C0419f) S25);
                                    if (c03 instanceof C0434i) {
                                        c0434i = (C0434i) c03;
                                        if (!"break".equals(c0434i.f8580r)) {
                                            if ("return".equals(c0434i.f8580r)) {
                                                return c0434i;
                                            }
                                        }
                                    }
                                }
                            }
                            return InterfaceC0464o.f8621e;
                        }
                        throw new IllegalArgumentException("Variable name in FOR_IN must be a string");
                    case 2:
                        Q.h(G.f8288Q, 3, arrayList);
                        if (arrayList.get(0) instanceof C0474q) {
                            return a(new B(bVar, ((InterfaceC0464o) arrayList.get(0)).g(), 0), ((androidx.fragment.app.D) bVar.f422s).S(bVar, (InterfaceC0464o) arrayList.get(1)).h(), ((androidx.fragment.app.D) bVar.f422s).S(bVar, (InterfaceC0464o) arrayList.get(2)));
                        }
                        throw new IllegalArgumentException("Variable name in FOR_IN_CONST must be a string");
                    case 3:
                        Q.h(G.f8289R, 3, arrayList);
                        if (arrayList.get(0) instanceof C0474q) {
                            String g9 = ((InterfaceC0464o) arrayList.get(0)).g();
                            InterfaceC0464o S26 = ((androidx.fragment.app.D) bVar.f422s).S(bVar, (InterfaceC0464o) arrayList.get(1));
                            InterfaceC0464o S27 = ((androidx.fragment.app.D) bVar.f422s).S(bVar, (InterfaceC0464o) arrayList.get(2));
                            Iterator h8 = S26.h();
                            if (h8 != null) {
                                while (h8.hasNext()) {
                                    C4.b Z6 = bVar.Z();
                                    Z6.g0(g9, (InterfaceC0464o) h8.next());
                                    InterfaceC0464o c04 = Z6.c0((C0419f) S27);
                                    if (c04 instanceof C0434i) {
                                        c0434i = (C0434i) c04;
                                        if (!"break".equals(c0434i.f8580r)) {
                                            if ("return".equals(c0434i.f8580r)) {
                                                return c0434i;
                                            }
                                        }
                                    }
                                }
                            }
                            return InterfaceC0464o.f8621e;
                        }
                        throw new IllegalArgumentException("Variable name in FOR_IN_LET must be a string");
                    case 4:
                        Q.h(G.f8290S, 4, arrayList);
                        InterfaceC0464o S28 = ((androidx.fragment.app.D) bVar.f422s).S(bVar, (InterfaceC0464o) arrayList.get(0));
                        if (S28 instanceof C0419f) {
                            C0419f c0419f3 = (C0419f) S28;
                            InterfaceC0464o interfaceC0464o2 = (InterfaceC0464o) arrayList.get(1);
                            InterfaceC0464o interfaceC0464o3 = (InterfaceC0464o) arrayList.get(2);
                            InterfaceC0464o S29 = ((androidx.fragment.app.D) bVar.f422s).S(bVar, (InterfaceC0464o) arrayList.get(3));
                            C4.b Z7 = bVar.Z();
                            for (int i9 = 0; i9 < c0419f3.u(); i9++) {
                                String g10 = c0419f3.s(i9).g();
                                Z7.i0(g10, bVar.e0(g10));
                            }
                            while (((androidx.fragment.app.D) bVar.f422s).S(bVar, interfaceC0464o2).c().booleanValue()) {
                                InterfaceC0464o c05 = bVar.c0((C0419f) S29);
                                if (c05 instanceof C0434i) {
                                    C0434i c0434i2 = (C0434i) c05;
                                    if ("break".equals(c0434i2.f8580r)) {
                                        return InterfaceC0464o.f8621e;
                                    }
                                    if ("return".equals(c0434i2.f8580r)) {
                                        return c0434i2;
                                    }
                                }
                                C4.b Z8 = bVar.Z();
                                for (int i10 = 0; i10 < c0419f3.u(); i10++) {
                                    String g11 = c0419f3.s(i10).g();
                                    Z8.i0(g11, Z7.e0(g11));
                                }
                                Z8.d0(interfaceC0464o3);
                                Z7 = Z8;
                            }
                            return InterfaceC0464o.f8621e;
                        }
                        throw new IllegalArgumentException("Initializer variables in FOR_LET must be an ArrayList");
                    case 5:
                        Q.h(G.f8291T, 3, arrayList);
                        if (arrayList.get(0) instanceof C0474q) {
                            String g12 = ((InterfaceC0464o) arrayList.get(0)).g();
                            S6 = ((androidx.fragment.app.D) bVar.f422s).S(bVar, (InterfaceC0464o) arrayList.get(1));
                            S7 = ((androidx.fragment.app.D) bVar.f422s).S(bVar, (InterfaceC0464o) arrayList.get(2));
                            b7 = new B(bVar, g12, 2);
                            return f(b7, S6, S7);
                        }
                        throw new IllegalArgumentException("Variable name in FOR_OF must be a string");
                    case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                        Q.h(G.f8292U, 3, arrayList);
                        if (arrayList.get(0) instanceof C0474q) {
                            String g13 = ((InterfaceC0464o) arrayList.get(0)).g();
                            S6 = ((androidx.fragment.app.D) bVar.f422s).S(bVar, (InterfaceC0464o) arrayList.get(1));
                            S7 = ((androidx.fragment.app.D) bVar.f422s).S(bVar, (InterfaceC0464o) arrayList.get(2));
                            b7 = new B(bVar, g13, 0);
                            return f(b7, S6, S7);
                        }
                        throw new IllegalArgumentException("Variable name in FOR_OF_CONST must be a string");
                    case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                        Q.h(G.f8293V, 3, arrayList);
                        if (arrayList.get(0) instanceof C0474q) {
                            String g14 = ((InterfaceC0464o) arrayList.get(0)).g();
                            S6 = ((androidx.fragment.app.D) bVar.f422s).S(bVar, (InterfaceC0464o) arrayList.get(1));
                            S7 = ((androidx.fragment.app.D) bVar.f422s).S(bVar, (InterfaceC0464o) arrayList.get(2));
                            b7 = new B(bVar, g14, 1);
                            return f(b7, S6, S7);
                        }
                        throw new IllegalArgumentException("Variable name in FOR_OF_LET must be a string");
                    case 8:
                        Q.h(G.f8271A0, 4, arrayList);
                        InterfaceC0464o interfaceC0464o4 = (InterfaceC0464o) arrayList.get(0);
                        InterfaceC0464o interfaceC0464o5 = (InterfaceC0464o) arrayList.get(1);
                        InterfaceC0464o S30 = ((androidx.fragment.app.D) bVar.f422s).S(bVar, (InterfaceC0464o) arrayList.get(3));
                        if (((androidx.fragment.app.D) bVar.f422s).S(bVar, (InterfaceC0464o) arrayList.get(2)).c().booleanValue()) {
                            InterfaceC0464o c06 = bVar.c0((C0419f) S30);
                            if (c06 instanceof C0434i) {
                                C0434i c0434i3 = (C0434i) c06;
                                if (!"break".equals(c0434i3.f8580r)) {
                                    if ("return".equals(c0434i3.f8580r)) {
                                        return c0434i3;
                                    }
                                }
                                return InterfaceC0464o.f8621e;
                            }
                        }
                        while (((androidx.fragment.app.D) bVar.f422s).S(bVar, interfaceC0464o4).c().booleanValue()) {
                            InterfaceC0464o c07 = bVar.c0((C0419f) S30);
                            if (c07 instanceof C0434i) {
                                C0434i c0434i4 = (C0434i) c07;
                                if ("break".equals(c0434i4.f8580r)) {
                                    return InterfaceC0464o.f8621e;
                                }
                                if ("return".equals(c0434i4.f8580r)) {
                                    return c0434i4;
                                }
                            }
                            bVar.d0(interfaceC0464o5);
                        }
                        return InterfaceC0464o.f8621e;
                    default:
                        d(str);
                        throw null;
                }
            case 5:
                switch (D.f8240a[Q.d(str).ordinal()]) {
                    case 1:
                        Q.h(G.f8314r, 2, arrayList);
                        InterfaceC0464o S31 = ((androidx.fragment.app.D) bVar.f422s).S(bVar, (InterfaceC0464o) arrayList.get(0));
                        InterfaceC0464o S32 = ((androidx.fragment.app.D) bVar.f422s).S(bVar, (InterfaceC0464o) arrayList.get(1));
                        return ((S31 instanceof InterfaceC0439j) || (S31 instanceof C0474q) || (S32 instanceof InterfaceC0439j) || (S32 instanceof C0474q)) ? new C0474q(AbstractC0515y1.m(S31.g(), S32.g())) : new C0429h(Double.valueOf(S32.r().doubleValue() + S31.r().doubleValue()));
                    case 2:
                        Q.h(G.f8283L, 2, arrayList);
                        c0429h = new C0429h(Double.valueOf(((androidx.fragment.app.D) bVar.f422s).S(bVar, (InterfaceC0464o) arrayList.get(0)).r().doubleValue() / ((androidx.fragment.app.D) bVar.f422s).S(bVar, (InterfaceC0464o) arrayList.get(1)).r().doubleValue()));
                        break;
                    case 3:
                        Q.h(G.f8303g0, 2, arrayList);
                        c0429h = new C0429h(Double.valueOf(((androidx.fragment.app.D) bVar.f422s).S(bVar, (InterfaceC0464o) arrayList.get(0)).r().doubleValue() % ((androidx.fragment.app.D) bVar.f422s).S(bVar, (InterfaceC0464o) arrayList.get(1)).r().doubleValue()));
                        break;
                    case 4:
                        Q.h(G.f8304h0, 2, arrayList);
                        c0429h = new C0429h(Double.valueOf(((androidx.fragment.app.D) bVar.f422s).S(bVar, (InterfaceC0464o) arrayList.get(0)).r().doubleValue() * ((androidx.fragment.app.D) bVar.f422s).S(bVar, (InterfaceC0464o) arrayList.get(1)).r().doubleValue()));
                        break;
                    case 5:
                        Q.h(G.f8305i0, 1, arrayList);
                        return new C0429h(Double.valueOf(((androidx.fragment.app.D) bVar.f422s).S(bVar, (InterfaceC0464o) arrayList.get(0)).r().doubleValue() * (-1.0d)));
                    case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                    case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                        Q.i(str, 2, arrayList);
                        InterfaceC0464o S33 = ((androidx.fragment.app.D) bVar.f422s).S(bVar, (InterfaceC0464o) arrayList.get(0));
                        bVar.d0((InterfaceC0464o) arrayList.get(1));
                        return S33;
                    case 8:
                    case 9:
                        Q.i(str, 1, arrayList);
                        return ((androidx.fragment.app.D) bVar.f422s).S(bVar, (InterfaceC0464o) arrayList.get(0));
                    case 10:
                        Q.h(G.f8321u0, 2, arrayList);
                        return new C0429h(Double.valueOf(((androidx.fragment.app.D) bVar.f422s).S(bVar, (InterfaceC0464o) arrayList.get(0)).r().doubleValue() + (((androidx.fragment.app.D) bVar.f422s).S(bVar, (InterfaceC0464o) arrayList.get(1)).r().doubleValue() * (-1.0d))));
                    default:
                        d(str);
                        throw null;
                }
                return c0429h;
            case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                if (str == null || str.isEmpty() || !bVar.h0(str)) {
                    throw new IllegalArgumentException(AbstractC0515y1.x("Command not found: ", str));
                }
                InterfaceC0464o e02 = bVar.e0(str);
                if (e02 instanceof AbstractC0444k) {
                    return ((AbstractC0444k) e02).a(bVar, arrayList);
                }
                throw new IllegalArgumentException(AbstractC1111a.r("Function ", str, " is not defined"));
            default:
                switch (E.f8260a[Q.d(str).ordinal()]) {
                    case 1:
                        Q.h(G.f8320u, 2, arrayList);
                        InterfaceC0464o S34 = ((androidx.fragment.app.D) bVar.f422s).S(bVar, (InterfaceC0464o) arrayList.get(0));
                        if (S34 instanceof C0474q) {
                            C0474q c0474q = (C0474q) S34;
                            boolean h02 = bVar.h0(c0474q.f8646q);
                            String str5 = c0474q.f8646q;
                            if (h02) {
                                S8 = ((androidx.fragment.app.D) bVar.f422s).S(bVar, (InterfaceC0464o) arrayList.get(1));
                                bVar.i0(str5, S8);
                                return S8;
                            }
                            throw new IllegalArgumentException(AbstractC0515y1.x("Attempting to assign undefined value ", str5));
                        }
                        throw new IllegalArgumentException(AbstractC0515y1.x("Expected string for assign var. got ", S34.getClass().getCanonicalName()));
                    case 2:
                        Q.l(G.F, 2, arrayList);
                        if (arrayList.size() % 2 == 0) {
                            while (i7 < arrayList.size() - 1) {
                                InterfaceC0464o S35 = ((androidx.fragment.app.D) bVar.f422s).S(bVar, (InterfaceC0464o) arrayList.get(i7));
                                if (S35 instanceof C0474q) {
                                    String str6 = ((C0474q) S35).f8646q;
                                    bVar.g0(str6, ((androidx.fragment.app.D) bVar.f422s).S(bVar, (InterfaceC0464o) arrayList.get(i7 + 1)));
                                    ((HashMap) bVar.f424u).put(str6, Boolean.TRUE);
                                    i7 += 2;
                                } else {
                                    throw new IllegalArgumentException(AbstractC0515y1.x("Expected string for const name. got ", S35.getClass().getCanonicalName()));
                                }
                            }
                            return InterfaceC0464o.f8621e;
                        }
                        throw new IllegalArgumentException(AbstractC0515y1.l("CONST requires an even number of arguments, found ", arrayList.size()));
                    case 3:
                        if (arrayList.isEmpty()) {
                            return new C0419f();
                        }
                        C0419f c0419f4 = new C0419f();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            InterfaceC0464o S36 = ((androidx.fragment.app.D) bVar.f422s).S(bVar, (InterfaceC0464o) it.next());
                            if (S36 instanceof C0434i) {
                                throw new IllegalStateException("Failed to evaluate array element");
                            }
                            c0419f4.x(i7, S36);
                            i7++;
                        }
                        return c0419f4;
                    case 4:
                        if (arrayList.isEmpty()) {
                            return new C0459n();
                        }
                        if (arrayList.size() % 2 == 0) {
                            C0459n c0459n = new C0459n();
                            while (i7 < arrayList.size() - 1) {
                                InterfaceC0464o S37 = ((androidx.fragment.app.D) bVar.f422s).S(bVar, (InterfaceC0464o) arrayList.get(i7));
                                InterfaceC0464o S38 = ((androidx.fragment.app.D) bVar.f422s).S(bVar, (InterfaceC0464o) arrayList.get(i7 + 1));
                                if ((S37 instanceof C0434i) || (S38 instanceof C0434i)) {
                                    throw new IllegalStateException("Failed to evaluate map entry");
                                }
                                c0459n.n(S37.g(), S38);
                                i7 += 2;
                            }
                            return c0459n;
                        }
                        throw new IllegalArgumentException(AbstractC0515y1.l("CREATE_OBJECT requires an even number of arguments, found ", arrayList.size()));
                    case 5:
                        Q.l(G.f8285N, 1, arrayList);
                        InterfaceC0464o interfaceC0464o6 = InterfaceC0464o.f8621e;
                        while (i7 < arrayList.size()) {
                            interfaceC0464o6 = ((androidx.fragment.app.D) bVar.f422s).S(bVar, (InterfaceC0464o) arrayList.get(i7));
                            if (interfaceC0464o6 instanceof C0434i) {
                                throw new IllegalStateException("ControlValue cannot be in an expression list");
                            }
                            i7++;
                        }
                        return interfaceC0464o6;
                    case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                        Q.h(G.W, 1, arrayList);
                        InterfaceC0464o S39 = ((androidx.fragment.app.D) bVar.f422s).S(bVar, (InterfaceC0464o) arrayList.get(0));
                        if (S39 instanceof C0474q) {
                            return bVar.e0(((C0474q) S39).f8646q);
                        }
                        throw new IllegalArgumentException(AbstractC0515y1.x("Expected string for get var. got ", S39.getClass().getCanonicalName()));
                    case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                    case 8:
                        Q.h(G.f8295Y, 2, arrayList);
                        InterfaceC0464o S40 = ((androidx.fragment.app.D) bVar.f422s).S(bVar, (InterfaceC0464o) arrayList.get(0));
                        InterfaceC0464o S41 = ((androidx.fragment.app.D) bVar.f422s).S(bVar, (InterfaceC0464o) arrayList.get(1));
                        if ((S40 instanceof C0419f) && Q.n(S41)) {
                            return ((C0419f) S40).s(S41.r().intValue());
                        }
                        if (S40 instanceof InterfaceC0439j) {
                            return ((InterfaceC0439j) S40).b(S41.g());
                        }
                        if (S40 instanceof C0474q) {
                            if ("length".equals(S41.g())) {
                                c0429h2 = new C0429h(Double.valueOf(((C0474q) S40).f8646q.length()));
                                return c0429h2;
                            } else if (Q.n(S41)) {
                                C0474q c0474q2 = (C0474q) S40;
                                if (S41.r().doubleValue() < c0474q2.f8646q.length()) {
                                    S8 = new C0474q(String.valueOf(c0474q2.f8646q.charAt(S41.r().intValue())));
                                    return S8;
                                }
                            }
                        }
                        return InterfaceC0464o.f8621e;
                    case 9:
                        Q.h(G.f8308l0, 0, arrayList);
                        return InterfaceC0464o.f;
                    case 10:
                        Q.h(G.f8319t0, 3, arrayList);
                        InterfaceC0464o S42 = ((androidx.fragment.app.D) bVar.f422s).S(bVar, (InterfaceC0464o) arrayList.get(0));
                        InterfaceC0464o S43 = ((androidx.fragment.app.D) bVar.f422s).S(bVar, (InterfaceC0464o) arrayList.get(1));
                        c0429h2 = ((androidx.fragment.app.D) bVar.f422s).S(bVar, (InterfaceC0464o) arrayList.get(2));
                        if (S42 != InterfaceC0464o.f8621e && S42 != InterfaceC0464o.f) {
                            if ((S42 instanceof C0419f) && (S43 instanceof C0429h)) {
                                ((C0419f) S42).x(((C0429h) S43).f8564q.intValue(), c0429h2);
                            } else if (S42 instanceof InterfaceC0439j) {
                                ((InterfaceC0439j) S42).n(S43.g(), c0429h2);
                            }
                            return c0429h2;
                        }
                        throw new IllegalStateException("Can't set property " + S43.g() + " of " + S42.g());
                    case 11:
                        Q.h(G.f8327x0, 1, arrayList);
                        InterfaceC0464o S44 = ((androidx.fragment.app.D) bVar.f422s).S(bVar, (InterfaceC0464o) arrayList.get(0));
                        if (S44 instanceof C0493u) {
                            str2 = "undefined";
                        } else if (S44 instanceof C0424g) {
                            str2 = "boolean";
                        } else if (S44 instanceof C0429h) {
                            str2 = "number";
                        } else if (S44 instanceof C0474q) {
                            str2 = "string";
                        } else if (S44 instanceof C0469p) {
                            str2 = "function";
                        } else if ((S44 instanceof r) || (S44 instanceof C0434i)) {
                            throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", S44));
                        } else {
                            str2 = "object";
                        }
                        c0429h2 = new C0474q(str2);
                        return c0429h2;
                    case 12:
                        Q.h(G.y0, 0, arrayList);
                        return InterfaceC0464o.f8621e;
                    case 13:
                        Q.l(G.f8330z0, 1, arrayList);
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            InterfaceC0464o S45 = ((androidx.fragment.app.D) bVar.f422s).S(bVar, (InterfaceC0464o) it2.next());
                            if (S45 instanceof C0474q) {
                                bVar.g0(((C0474q) S45).f8646q, InterfaceC0464o.f8621e);
                            } else {
                                throw new IllegalArgumentException(AbstractC0515y1.x("Expected string for var name. got ", S45.getClass().getCanonicalName()));
                            }
                        }
                        return InterfaceC0464o.f8621e;
                    default:
                        d(str);
                        throw null;
                }
        }
    }

    public final void d(String str) {
        if (this.f8674a.contains(Q.d(str))) {
            throw new UnsupportedOperationException(AbstractC0515y1.x("Command not implemented: ", str));
        }
        throw new IllegalArgumentException("Command not supported");
    }
}
