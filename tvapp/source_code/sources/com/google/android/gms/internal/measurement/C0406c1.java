package com.google.android.gms.internal.measurement;
/* renamed from: com.google.android.gms.internal.measurement.c1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0406c1 extends AbstractC0457m2 {
    private static final C0406c1 zzc;
    private static volatile H2 zzd;
    private int zze;
    private int zzf;
    private long zzg;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.measurement.c1, com.google.android.gms.internal.measurement.m2] */
    static {
        ?? abstractC0457m2 = new AbstractC0457m2();
        zzc = abstractC0457m2;
        AbstractC0457m2.j(C0406c1.class, abstractC0457m2);
    }

    public static void s(C0406c1 c0406c1, int i7) {
        c0406c1.zze |= 1;
        c0406c1.zzf = i7;
    }

    public static void t(C0406c1 c0406c1, long j7) {
        c0406c1.zze |= 2;
        c0406c1.zzg = j7;
    }

    public static C0401b1 v() {
        return (C0401b1) zzc.l();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0457m2
    public final Object g(int i7) {
        switch (V0.f8440a[i7 - 1]) {
            case 1:
                return new AbstractC0457m2();
            case 2:
                return new AbstractC0452l2(zzc);
            case 3:
                return new J2(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                H2 h22 = zzd;
                if (h22 == null) {
                    synchronized (C0406c1.class) {
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

    public final long u() {
        return this.zzg;
    }

    public final boolean w() {
        return (this.zze & 2) != 0;
    }

    public final boolean x() {
        return (this.zze & 1) != 0;
    }
}
