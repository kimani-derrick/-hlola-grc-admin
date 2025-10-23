package com.google.android.gms.internal.measurement;
/* renamed from: com.google.android.gms.internal.measurement.t1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0490t1 extends AbstractC0457m2 {
    private static final C0490t1 zzc;
    private static volatile H2 zzd;
    private int zze;
    private long zzf;
    private String zzg = "";
    private String zzh = "";
    private long zzi;
    private float zzj;
    private double zzk;

    static {
        C0490t1 c0490t1 = new C0490t1();
        zzc = c0490t1;
        AbstractC0457m2.j(C0490t1.class, c0490t1);
    }

    public static void B(C0490t1 c0490t1) {
        c0490t1.zze &= -33;
        c0490t1.zzk = 0.0d;
    }

    public static C0485s1 D() {
        return (C0485s1) zzc.l();
    }

    public static void s(C0490t1 c0490t1, double d) {
        c0490t1.zze |= 32;
        c0490t1.zzk = d;
    }

    public static void t(C0490t1 c0490t1, long j7) {
        c0490t1.zze |= 1;
        c0490t1.zzf = j7;
    }

    public static void u(C0490t1 c0490t1, String str) {
        c0490t1.getClass();
        str.getClass();
        c0490t1.zze |= 2;
        c0490t1.zzg = str;
    }

    public static void v(C0490t1 c0490t1) {
        c0490t1.zze &= -5;
        c0490t1.zzh = zzc.zzh;
    }

    public static void x(C0490t1 c0490t1) {
        c0490t1.zze &= -9;
        c0490t1.zzi = 0L;
    }

    public static void y(C0490t1 c0490t1, long j7) {
        c0490t1.zze |= 8;
        c0490t1.zzi = j7;
    }

    public static void z(C0490t1 c0490t1, String str) {
        c0490t1.getClass();
        str.getClass();
        c0490t1.zze |= 4;
        c0490t1.zzh = str;
    }

    public final long A() {
        return this.zzi;
    }

    public final long C() {
        return this.zzf;
    }

    public final String E() {
        return this.zzg;
    }

    public final String F() {
        return this.zzh;
    }

    public final boolean G() {
        return (this.zze & 32) != 0;
    }

    public final boolean H() {
        return (this.zze & 16) != 0;
    }

    public final boolean I() {
        return (this.zze & 8) != 0;
    }

    public final boolean J() {
        return (this.zze & 1) != 0;
    }

    public final boolean K() {
        return (this.zze & 4) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0457m2
    public final Object g(int i7) {
        switch (V0.f8440a[i7 - 1]) {
            case 1:
                return new C0490t1();
            case 2:
                return new AbstractC0452l2(zzc);
            case 3:
                return new J2(zzc, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
            case 4:
                return zzc;
            case 5:
                H2 h22 = zzd;
                if (h22 == null) {
                    synchronized (C0490t1.class) {
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
        return this.zzk;
    }

    public final float w() {
        return this.zzj;
    }
}
