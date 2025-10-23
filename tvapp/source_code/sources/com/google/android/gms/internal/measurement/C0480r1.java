package com.google.android.gms.internal.measurement;

import java.util.List;
/* renamed from: com.google.android.gms.internal.measurement.r1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0480r1 extends AbstractC0457m2 {
    private static final C0480r1 zzc;
    private static volatile H2 zzd;
    private int zze;
    private int zzf;
    private InterfaceC0486s2 zzg = C0521z2.f8720t;

    static {
        C0480r1 c0480r1 = new C0480r1();
        zzc = c0480r1;
        AbstractC0457m2.j(C0480r1.class, c0480r1);
    }

    public static void t(C0480r1 c0480r1, int i7) {
        c0480r1.zze |= 1;
        c0480r1.zzf = i7;
    }

    public static void u(C0480r1 c0480r1, List list) {
        InterfaceC0486s2 interfaceC0486s2 = c0480r1.zzg;
        if (!((W1) interfaceC0486s2).f8443q) {
            c0480r1.zzg = AbstractC0457m2.f(interfaceC0486s2);
        }
        V1.b(list, c0480r1.zzg);
    }

    public static C0476q1 w() {
        return (C0476q1) zzc.l();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0457m2
    public final Object g(int i7) {
        switch (V0.f8440a[i7 - 1]) {
            case 1:
                return new C0480r1();
            case 2:
                return new AbstractC0452l2(zzc);
            case 3:
                return new J2(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                H2 h22 = zzd;
                if (h22 == null) {
                    synchronized (C0480r1.class) {
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

    public final long s(int i7) {
        return ((C0521z2) this.zzg).g(i7);
    }

    public final int v() {
        return this.zzf;
    }

    public final List x() {
        return this.zzg;
    }

    public final boolean y() {
        return (this.zze & 1) != 0;
    }
}
