package com.google.android.gms.internal.measurement;
/* renamed from: com.google.android.gms.internal.measurement.i1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0436i1 extends AbstractC0457m2 {
    private static final C0436i1 zzc;
    private static volatile H2 zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private W0 zzh;

    static {
        C0436i1 c0436i1 = new C0436i1();
        zzc = c0436i1;
        AbstractC0457m2.j(C0436i1.class, c0436i1);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0457m2
    public final Object g(int i7) {
        switch (V0.f8440a[i7 - 1]) {
            case 1:
                return new C0436i1();
            case 2:
                return new AbstractC0452l2(zzc);
            case 3:
                return new J2(zzc, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                H2 h22 = zzd;
                if (h22 == null) {
                    synchronized (C0436i1.class) {
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
