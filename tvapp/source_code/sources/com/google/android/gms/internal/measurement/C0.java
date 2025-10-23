package com.google.android.gms.internal.measurement;

import r0.AbstractC1111a;
/* loaded from: classes.dex */
public final class C0 extends AbstractC0457m2 {
    private static final C0 zzc;
    private static volatile H2 zzd;
    private int zze;
    private int zzf;
    private boolean zzg;
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";

    static {
        C0 c02 = new C0();
        zzc = c02;
        AbstractC0457m2.j(C0.class, c02);
    }

    public static C0 s() {
        return zzc;
    }

    public final boolean A() {
        return (this.zze & 16) != 0;
    }

    public final boolean B() {
        return (this.zze & 8) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0457m2
    public final Object g(int i7) {
        switch (AbstractC0494u0.f8681a[i7 - 1]) {
            case 1:
                return new C0();
            case 2:
                return new AbstractC0452l2(zzc);
            case 3:
                return new J2(zzc, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zze", "zzf", G0.f8332b, "zzg", "zzh", "zzi", "zzj"});
            case 4:
                return zzc;
            case 5:
                H2 h22 = zzd;
                if (h22 == null) {
                    synchronized (C0.class) {
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
        int g7 = AbstractC1111a.g(this.zzf);
        if (g7 == 0) {
            return 1;
        }
        return g7;
    }

    public final String t() {
        return this.zzh;
    }

    public final String u() {
        return this.zzj;
    }

    public final String v() {
        return this.zzi;
    }

    public final boolean w() {
        return this.zzg;
    }

    public final boolean x() {
        return (this.zze & 1) != 0;
    }

    public final boolean y() {
        return (this.zze & 4) != 0;
    }

    public final boolean z() {
        return (this.zze & 2) != 0;
    }
}
