package com.google.android.gms.internal.measurement;
/* loaded from: classes.dex */
public final class E0 extends AbstractC0457m2 {
    private static final E0 zzc;
    private static volatile H2 zzd;
    private int zze;
    private int zzf;
    private String zzg = "";
    private A0 zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    static {
        E0 e02 = new E0();
        zzc = e02;
        AbstractC0457m2.j(E0.class, e02);
    }

    public static void s(E0 e02, String str) {
        e02.getClass();
        e02.zze |= 2;
        e02.zzg = str;
    }

    public static D0 u() {
        return (D0) zzc.l();
    }

    public final boolean A() {
        return (this.zze & 32) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0457m2
    public final Object g(int i7) {
        switch (AbstractC0494u0.f8681a[i7 - 1]) {
            case 1:
                return new E0();
            case 2:
                return new AbstractC0452l2(zzc);
            case 3:
                return new J2(zzc, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
            case 4:
                return zzc;
            case 5:
                H2 h22 = zzd;
                if (h22 == null) {
                    synchronized (E0.class) {
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
        return this.zzf;
    }

    public final A0 t() {
        A0 a02 = this.zzh;
        return a02 == null ? A0.s() : a02;
    }

    public final String v() {
        return this.zzg;
    }

    public final boolean w() {
        return this.zzi;
    }

    public final boolean x() {
        return this.zzj;
    }

    public final boolean y() {
        return this.zzk;
    }

    public final boolean z() {
        return (this.zze & 1) != 0;
    }
}
