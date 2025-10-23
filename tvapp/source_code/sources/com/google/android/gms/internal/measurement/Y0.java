package com.google.android.gms.internal.measurement;
/* loaded from: classes.dex */
public final class Y0 extends AbstractC0457m2 {
    private static final Y0 zzc;
    private static volatile H2 zzd;
    private int zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.measurement.Y0, com.google.android.gms.internal.measurement.m2] */
    static {
        ?? abstractC0457m2 = new AbstractC0457m2();
        zzc = abstractC0457m2;
        AbstractC0457m2.j(Y0.class, abstractC0457m2);
    }

    public static void A(Y0 y0, boolean z7) {
        y0.zze |= 32;
        y0.zzk = z7;
    }

    public static void C(Y0 y0, boolean z7) {
        y0.zze |= 64;
        y0.zzl = z7;
    }

    public static X0 r() {
        return (X0) zzc.l();
    }

    public static void s(Y0 y0, boolean z7) {
        y0.zze |= 1;
        y0.zzf = z7;
    }

    public static void t(Y0 y0, boolean z7) {
        y0.zze |= 2;
        y0.zzg = z7;
    }

    public static Y0 u() {
        return zzc;
    }

    public static void v(Y0 y0, boolean z7) {
        y0.zze |= 4;
        y0.zzh = z7;
    }

    public static void w(Y0 y0, boolean z7) {
        y0.zze |= 8;
        y0.zzi = z7;
    }

    public static void y(Y0 y0, boolean z7) {
        y0.zze |= 16;
        y0.zzj = z7;
    }

    public final boolean B() {
        return this.zzf;
    }

    public final boolean D() {
        return this.zzl;
    }

    public final boolean E() {
        return this.zzg;
    }

    public final boolean F() {
        return this.zzh;
    }

    public final boolean G() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0457m2
    public final Object g(int i7) {
        switch (V0.f8440a[i7 - 1]) {
            case 1:
                return new AbstractC0457m2();
            case 2:
                return new AbstractC0452l2(zzc);
            case 3:
                return new J2(zzc, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
            case 4:
                return zzc;
            case 5:
                H2 h22 = zzd;
                if (h22 == null) {
                    synchronized (Y0.class) {
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

    public final boolean x() {
        return this.zzk;
    }

    public final boolean z() {
        return this.zzj;
    }
}
