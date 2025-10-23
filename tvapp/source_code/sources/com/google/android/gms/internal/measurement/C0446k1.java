package com.google.android.gms.internal.measurement;

import java.util.List;
/* renamed from: com.google.android.gms.internal.measurement.k1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0446k1 extends AbstractC0457m2 {
    private static final C0446k1 zzc;
    private static volatile H2 zzd;
    private int zze;
    private InterfaceC0481r2 zzf = K2.f8369t;
    private String zzg = "";
    private String zzh = "";
    private int zzi;

    static {
        C0446k1 c0446k1 = new C0446k1();
        zzc = c0446k1;
        AbstractC0457m2.j(C0446k1.class, c0446k1);
    }

    public static void t(C0446k1 c0446k1, C0456m1 c0456m1) {
        c0446k1.getClass();
        InterfaceC0481r2 interfaceC0481r2 = c0446k1.zzf;
        if (!((W1) interfaceC0481r2).f8443q) {
            c0446k1.zzf = AbstractC0457m2.e(interfaceC0481r2);
        }
        c0446k1.zzf.add(c0456m1);
    }

    public static void u(C0446k1 c0446k1, String str) {
        c0446k1.getClass();
        str.getClass();
        c0446k1.zze |= 2;
        c0446k1.zzh = str;
    }

    public static C0441j1 v() {
        return (C0441j1) zzc.l();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0457m2
    public final Object g(int i7) {
        switch (V0.f8440a[i7 - 1]) {
            case 1:
                return new C0446k1();
            case 2:
                return new AbstractC0452l2(zzc);
            case 3:
                return new J2(zzc, "\u0001\u0004\u0000\u0001\u0001\t\u0004\u0000\u0001\u0000\u0001\u001b\u0007ဈ\u0000\bဈ\u0001\t᠌\u0002", new Object[]{"zze", "zzf", C0456m1.class, "zzg", "zzh", "zzi", G0.f8335g});
            case 4:
                return zzc;
            case 5:
                H2 h22 = zzd;
                if (h22 == null) {
                    synchronized (C0446k1.class) {
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
        return this.zzf.size();
    }

    public final C0456m1 s() {
        return (C0456m1) this.zzf.get(0);
    }

    public final String w() {
        return this.zzh;
    }

    public final List x() {
        return this.zzf;
    }

    public final boolean y() {
        return (this.zze & 2) != 0;
    }
}
