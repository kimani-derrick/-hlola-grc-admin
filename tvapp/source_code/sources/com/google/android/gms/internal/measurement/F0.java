package com.google.android.gms.internal.measurement;

import java.util.List;
/* loaded from: classes.dex */
public final class F0 extends AbstractC0457m2 {
    private static final F0 zzc;
    private static volatile H2 zzd;
    private int zze;
    private int zzf;
    private boolean zzh;
    private String zzg = "";
    private InterfaceC0481r2 zzi = K2.f8369t;

    static {
        F0 f02 = new F0();
        zzc = f02;
        AbstractC0457m2.j(F0.class, f02);
    }

    public static F0 t() {
        return zzc;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0457m2
    public final Object g(int i7) {
        switch (AbstractC0494u0.f8681a[i7 - 1]) {
            case 1:
                return new F0();
            case 2:
                return new AbstractC0452l2(zzc);
            case 3:
                return new J2(zzc, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zze", "zzf", G0.f8333c, "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                H2 h22 = zzd;
                if (h22 == null) {
                    synchronized (F0.class) {
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
        return this.zzi.size();
    }

    public final int s() {
        int i7;
        switch (this.zzf) {
            case 0:
                i7 = 1;
                break;
            case 1:
                i7 = 2;
                break;
            case 2:
                i7 = 3;
                break;
            case 3:
                i7 = 4;
                break;
            case 4:
                i7 = 5;
                break;
            case 5:
                i7 = 6;
                break;
            case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                i7 = 7;
                break;
            default:
                i7 = 0;
                break;
        }
        if (i7 == 0) {
            return 1;
        }
        return i7;
    }

    public final String u() {
        return this.zzg;
    }

    public final List v() {
        return this.zzi;
    }

    public final boolean w() {
        return this.zzh;
    }

    public final boolean x() {
        return (this.zze & 4) != 0;
    }

    public final boolean y() {
        return (this.zze & 2) != 0;
    }

    public final boolean z() {
        return (this.zze & 1) != 0;
    }
}
