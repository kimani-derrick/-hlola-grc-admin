package com.google.android.gms.internal.measurement;

import r0.AbstractC1111a;
/* loaded from: classes.dex */
public final class J0 extends AbstractC0457m2 {
    private static final J0 zzc;
    private static volatile H2 zzd;
    private int zze;
    private int zzf;
    private int zzg;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.measurement.J0, com.google.android.gms.internal.measurement.m2] */
    static {
        ?? abstractC0457m2 = new AbstractC0457m2();
        zzc = abstractC0457m2;
        AbstractC0457m2.j(J0.class, abstractC0457m2);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0457m2
    public final Object g(int i7) {
        switch (H0.f8351a[i7 - 1]) {
            case 1:
                return new AbstractC0457m2();
            case 2:
                return new AbstractC0452l2(zzc);
            case 3:
                G0 g02 = G0.f8334e;
                return new J2(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zze", "zzf", g02, "zzg", g02});
            case 4:
                return zzc;
            case 5:
                H2 h22 = zzd;
                if (h22 == null) {
                    synchronized (J0.class) {
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
        int h7 = AbstractC1111a.h(this.zzg);
        if (h7 == 0) {
            return 1;
        }
        return h7;
    }

    public final int s() {
        int h7 = AbstractC1111a.h(this.zzf);
        if (h7 == 0) {
            return 1;
        }
        return h7;
    }
}
