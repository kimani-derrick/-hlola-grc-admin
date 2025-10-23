package com.google.android.gms.internal.measurement;
/* loaded from: classes.dex */
public final class O0 extends AbstractC0457m2 {
    private static final O0 zzc;
    private static volatile H2 zzd;
    private int zze;
    private String zzf = "";
    private boolean zzg;
    private boolean zzh;
    private int zzi;

    static {
        O0 o02 = new O0();
        zzc = o02;
        AbstractC0457m2.j(O0.class, o02);
    }

    public static void s(O0 o02, String str) {
        o02.getClass();
        str.getClass();
        o02.zze |= 1;
        o02.zzf = str;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0457m2
    public final Object g(int i7) {
        switch (H0.f8351a[i7 - 1]) {
            case 1:
                return new O0();
            case 2:
                return new AbstractC0452l2(zzc);
            case 3:
                return new J2(zzc, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                H2 h22 = zzd;
                if (h22 == null) {
                    synchronized (O0.class) {
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
        return this.zzi;
    }

    public final String t() {
        return this.zzf;
    }

    public final boolean u() {
        return this.zzg;
    }

    public final boolean v() {
        return this.zzh;
    }

    public final boolean w() {
        return (this.zze & 2) != 0;
    }

    public final boolean x() {
        return (this.zze & 4) != 0;
    }

    public final boolean y() {
        return (this.zze & 8) != 0;
    }
}
