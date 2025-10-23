package com.google.android.gms.internal.measurement;
/* renamed from: com.google.android.gms.internal.measurement.n1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0461n1 extends AbstractC0457m2 {
    private static final C0461n1 zzc;
    private static volatile H2 zzd;
    private int zze;
    private int zzf = 1;
    private InterfaceC0481r2 zzg = K2.f8369t;

    static {
        C0461n1 c0461n1 = new C0461n1();
        zzc = c0461n1;
        AbstractC0457m2.j(C0461n1.class, c0461n1);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0457m2
    public final Object g(int i7) {
        switch (V0.f8440a[i7 - 1]) {
            case 1:
                return new C0461n1();
            case 2:
                return new AbstractC0452l2(zzc);
            case 3:
                return new J2(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b", new Object[]{"zze", "zzf", G0.f8336h, "zzg", C0421f1.class});
            case 4:
                return zzc;
            case 5:
                H2 h22 = zzd;
                if (h22 == null) {
                    synchronized (C0461n1.class) {
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
