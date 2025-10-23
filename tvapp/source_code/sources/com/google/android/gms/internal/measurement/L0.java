package com.google.android.gms.internal.measurement;

import java.util.List;
/* loaded from: classes.dex */
public final class L0 extends AbstractC0457m2 {
    private static final L0 zzc;
    private static volatile H2 zzd;
    private int zze;
    private InterfaceC0481r2 zzf;
    private InterfaceC0481r2 zzg;
    private InterfaceC0481r2 zzh;
    private boolean zzi;
    private InterfaceC0481r2 zzj;

    static {
        L0 l02 = new L0();
        zzc = l02;
        AbstractC0457m2.j(L0.class, l02);
    }

    public L0() {
        K2 k22 = K2.f8369t;
        this.zzf = k22;
        this.zzg = k22;
        this.zzh = k22;
        this.zzj = k22;
    }

    public static L0 r() {
        return zzc;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0457m2
    public final Object g(int i7) {
        switch (H0.f8351a[i7 - 1]) {
            case 1:
                return new L0();
            case 2:
                return new AbstractC0452l2(zzc);
            case 3:
                return new J2(zzc, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004ဇ\u0000\u0005\u001b", new Object[]{"zze", "zzf", I0.class, "zzg", J0.class, "zzh", K0.class, "zzi", "zzj", I0.class});
            case 4:
                return zzc;
            case 5:
                H2 h22 = zzd;
                if (h22 == null) {
                    synchronized (L0.class) {
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

    public final InterfaceC0481r2 s() {
        return this.zzh;
    }

    public final List t() {
        return this.zzf;
    }

    public final List u() {
        return this.zzg;
    }

    public final List v() {
        return this.zzj;
    }

    public final boolean w() {
        return this.zzi;
    }

    public final boolean x() {
        return (this.zze & 1) != 0;
    }
}
