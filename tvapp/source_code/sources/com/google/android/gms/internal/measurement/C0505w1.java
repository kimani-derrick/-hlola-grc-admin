package com.google.android.gms.internal.measurement;
/* renamed from: com.google.android.gms.internal.measurement.w1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0505w1 extends AbstractC0457m2 {
    private static final C0505w1 zzc;
    private static volatile H2 zzd;
    private int zze;
    private String zzf = "";
    private InterfaceC0481r2 zzg = K2.f8369t;

    static {
        C0505w1 c0505w1 = new C0505w1();
        zzc = c0505w1;
        AbstractC0457m2.j(C0505w1.class, c0505w1);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0457m2
    public final Object g(int i7) {
        switch (AbstractC0495u1.f8682a[i7 - 1]) {
            case 1:
                return new C0505w1();
            case 2:
                return new AbstractC0452l2(zzc);
            case 3:
                return new J2(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zze", "zzf", "zzg", C0520z1.class});
            case 4:
                return zzc;
            case 5:
                H2 h22 = zzd;
                if (h22 == null) {
                    synchronized (C0505w1.class) {
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

    public final InterfaceC0481r2 s() {
        return this.zzg;
    }
}
