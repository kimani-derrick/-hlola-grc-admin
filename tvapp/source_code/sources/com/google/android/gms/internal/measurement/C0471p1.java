package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;
/* renamed from: com.google.android.gms.internal.measurement.p1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0471p1 extends AbstractC0457m2 {
    private static final C0471p1 zzc;
    private static volatile H2 zzd;
    private InterfaceC0486s2 zze;
    private InterfaceC0486s2 zzf;
    private InterfaceC0481r2 zzg;
    private InterfaceC0481r2 zzh;

    static {
        C0471p1 c0471p1 = new C0471p1();
        zzc = c0471p1;
        AbstractC0457m2.j(C0471p1.class, c0471p1);
    }

    public C0471p1() {
        C0521z2 c0521z2 = C0521z2.f8720t;
        this.zze = c0521z2;
        this.zzf = c0521z2;
        K2 k22 = K2.f8369t;
        this.zzg = k22;
        this.zzh = k22;
    }

    public static void B(C0471p1 c0471p1) {
        c0471p1.getClass();
        c0471p1.zzh = K2.f8369t;
    }

    public static void C(C0471p1 c0471p1, List list) {
        InterfaceC0481r2 interfaceC0481r2 = c0471p1.zzh;
        if (!((W1) interfaceC0481r2).f8443q) {
            c0471p1.zzh = AbstractC0457m2.e(interfaceC0481r2);
        }
        V1.b(list, c0471p1.zzh);
    }

    public static C0466o1 D() {
        return (C0466o1) zzc.l();
    }

    public static C0471p1 E() {
        return zzc;
    }

    public static void s(C0471p1 c0471p1, List list) {
        InterfaceC0486s2 interfaceC0486s2 = c0471p1.zze;
        if (!((W1) interfaceC0486s2).f8443q) {
            c0471p1.zze = AbstractC0457m2.f(interfaceC0486s2);
        }
        V1.b(list, c0471p1.zze);
    }

    public static void t(C0471p1 c0471p1) {
        c0471p1.getClass();
        c0471p1.zze = C0521z2.f8720t;
    }

    public static void v(C0471p1 c0471p1, List list) {
        InterfaceC0486s2 interfaceC0486s2 = c0471p1.zzf;
        if (!((W1) interfaceC0486s2).f8443q) {
            c0471p1.zzf = AbstractC0457m2.f(interfaceC0486s2);
        }
        V1.b(list, c0471p1.zzf);
    }

    public static void w(C0471p1 c0471p1) {
        c0471p1.getClass();
        c0471p1.zzf = C0521z2.f8720t;
    }

    public static void y(C0471p1 c0471p1) {
        c0471p1.getClass();
        c0471p1.zzg = K2.f8369t;
    }

    public static void z(C0471p1 c0471p1, ArrayList arrayList) {
        InterfaceC0481r2 interfaceC0481r2 = c0471p1.zzg;
        if (!((W1) interfaceC0481r2).f8443q) {
            c0471p1.zzg = AbstractC0457m2.e(interfaceC0481r2);
        }
        V1.b(arrayList, c0471p1.zzg);
    }

    public final int A() {
        return this.zze.size();
    }

    public final InterfaceC0481r2 F() {
        return this.zzg;
    }

    public final List G() {
        return this.zzf;
    }

    public final InterfaceC0481r2 H() {
        return this.zzh;
    }

    public final List I() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0457m2
    public final Object g(int i7) {
        switch (V0.f8440a[i7 - 1]) {
            case 1:
                return new C0471p1();
            case 2:
                return new AbstractC0452l2(zzc);
            case 3:
                return new J2(zzc, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zze", "zzf", "zzg", C0406c1.class, "zzh", C0480r1.class});
            case 4:
                return zzc;
            case 5:
                H2 h22 = zzd;
                if (h22 == null) {
                    synchronized (C0471p1.class) {
                        try {
                            h22 = zzd;
                            if (h22 == null) {
                                h22 = new C0442j2(8);
                                zzd = h22;
                            }
                        } finally {
                        }
                    }
                }
                return h22;
            case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                return (byte) 1;
            case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final int r() {
        return this.zzg.size();
    }

    public final int u() {
        return this.zzf.size();
    }

    public final int x() {
        return this.zzh.size();
    }
}
