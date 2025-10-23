package com.google.android.gms.internal.measurement;
/* loaded from: classes.dex */
public final class K0 extends AbstractC0457m2 {
    private static final K0 zzc;
    private static volatile H2 zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";

    static {
        K0 k02 = new K0();
        zzc = k02;
        AbstractC0457m2.j(K0.class, k02);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0457m2
    public final Object g(int i7) {
        switch (H0.f8351a[i7 - 1]) {
            case 1:
                return new K0();
            case 2:
                return new AbstractC0452l2(zzc);
            case 3:
                return new J2(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                H2 h22 = zzd;
                if (h22 == null) {
                    synchronized (K0.class) {
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

    public final String r() {
        return this.zzf;
    }
}
