package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;
/* renamed from: com.google.android.gms.internal.measurement.h1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0431h1 extends AbstractC0457m2 {
    private static final C0431h1 zzc;
    private static volatile H2 zzd;
    private int zze;
    private long zzh;
    private float zzi;
    private double zzj;
    private String zzf = "";
    private String zzg = "";
    private InterfaceC0481r2 zzk = K2.f8369t;

    static {
        C0431h1 c0431h1 = new C0431h1();
        zzc = c0431h1;
        AbstractC0457m2.j(C0431h1.class, c0431h1);
    }

    public static void A(C0431h1 c0431h1, String str) {
        c0431h1.getClass();
        str.getClass();
        c0431h1.zze |= 2;
        c0431h1.zzg = str;
    }

    public static void C(C0431h1 c0431h1) {
        c0431h1.zze &= -17;
        c0431h1.zzj = 0.0d;
    }

    public static void E(C0431h1 c0431h1) {
        c0431h1.getClass();
        c0431h1.zzk = K2.f8369t;
    }

    public static C0426g1 F() {
        return (C0426g1) zzc.l();
    }

    public static void s(C0431h1 c0431h1, double d) {
        c0431h1.zze |= 16;
        c0431h1.zzj = d;
    }

    public static void t(C0431h1 c0431h1, long j7) {
        c0431h1.zze |= 4;
        c0431h1.zzh = j7;
    }

    public static void u(C0431h1 c0431h1, C0431h1 c0431h12) {
        c0431h1.getClass();
        InterfaceC0481r2 interfaceC0481r2 = c0431h1.zzk;
        if (!((W1) interfaceC0481r2).f8443q) {
            c0431h1.zzk = AbstractC0457m2.e(interfaceC0481r2);
        }
        c0431h1.zzk.add(c0431h12);
    }

    public static void v(C0431h1 c0431h1, String str) {
        c0431h1.getClass();
        str.getClass();
        c0431h1.zze |= 1;
        c0431h1.zzf = str;
    }

    public static void w(C0431h1 c0431h1, ArrayList arrayList) {
        InterfaceC0481r2 interfaceC0481r2 = c0431h1.zzk;
        if (!((W1) interfaceC0481r2).f8443q) {
            c0431h1.zzk = AbstractC0457m2.e(interfaceC0481r2);
        }
        V1.b(arrayList, c0431h1.zzk);
    }

    public static void x(C0431h1 c0431h1) {
        c0431h1.zze &= -3;
        c0431h1.zzg = zzc.zzg;
    }

    public static void z(C0431h1 c0431h1) {
        c0431h1.zze &= -5;
        c0431h1.zzh = 0L;
    }

    public final int B() {
        return this.zzk.size();
    }

    public final long D() {
        return this.zzh;
    }

    public final String G() {
        return this.zzf;
    }

    public final String H() {
        return this.zzg;
    }

    public final List I() {
        return this.zzk;
    }

    public final boolean J() {
        return (this.zze & 16) != 0;
    }

    public final boolean K() {
        return (this.zze & 8) != 0;
    }

    public final boolean L() {
        return (this.zze & 4) != 0;
    }

    public final boolean M() {
        return (this.zze & 1) != 0;
    }

    public final boolean N() {
        return (this.zze & 2) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0457m2
    public final Object g(int i7) {
        switch (V0.f8440a[i7 - 1]) {
            case 1:
                return new C0431h1();
            case 2:
                return new AbstractC0452l2(zzc);
            case 3:
                return new J2(zzc, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", C0431h1.class});
            case 4:
                return zzc;
            case 5:
                H2 h22 = zzd;
                if (h22 == null) {
                    synchronized (C0431h1.class) {
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

    public final double r() {
        return this.zzj;
    }

    public final float y() {
        return this.zzi;
    }
}
