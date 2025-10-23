package com.google.android.gms.internal.measurement;
/* loaded from: classes.dex */
public final class A0 extends AbstractC0457m2 {
    private static final A0 zzc;
    private static volatile H2 zzd;
    private int zze;
    private F0 zzf;
    private C0 zzg;
    private boolean zzh;
    private String zzi = "";

    static {
        A0 a02 = new A0();
        zzc = a02;
        AbstractC0457m2.j(A0.class, a02);
    }

    public static void r(A0 a02, String str) {
        a02.getClass();
        a02.zze |= 8;
        a02.zzi = str;
    }

    public static A0 s() {
        return zzc;
    }

    public final boolean A() {
        return (this.zze & 1) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0457m2
    public final Object g(int i7) {
        switch (AbstractC0494u0.f8681a[i7 - 1]) {
            case 1:
                return new A0();
            case 2:
                return new AbstractC0452l2(zzc);
            case 3:
                return new J2(zzc, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                H2 h22 = zzd;
                if (h22 == null) {
                    synchronized (A0.class) {
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

    public final C0 t() {
        C0 c02 = this.zzg;
        return c02 == null ? C0.s() : c02;
    }

    public final F0 u() {
        F0 f02 = this.zzf;
        return f02 == null ? F0.t() : f02;
    }

    public final String v() {
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
        return (this.zze & 8) != 0;
    }
}
