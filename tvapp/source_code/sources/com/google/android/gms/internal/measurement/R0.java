package com.google.android.gms.internal.measurement;
/* loaded from: classes.dex */
public final class R0 extends AbstractC0457m2 {
    private static final R0 zzc;
    private static volatile H2 zzd;
    private int zze;
    private int zzf = 14;
    private int zzg = 11;
    private int zzh = 60;

    static {
        R0 r02 = new R0();
        zzc = r02;
        AbstractC0457m2.j(R0.class, r02);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0457m2
    public final Object g(int i7) {
        switch (H0.f8351a[i7 - 1]) {
            case 1:
                return new R0();
            case 2:
                return new AbstractC0452l2(zzc);
            case 3:
                return new J2(zzc, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                H2 h22 = zzd;
                if (h22 == null) {
                    synchronized (R0.class) {
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
}
