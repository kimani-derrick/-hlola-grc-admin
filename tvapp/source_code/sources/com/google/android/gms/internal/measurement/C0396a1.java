package com.google.android.gms.internal.measurement;
/* renamed from: com.google.android.gms.internal.measurement.a1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0396a1 extends AbstractC0457m2 {
    private static final C0396a1 zzc;
    private static volatile H2 zzd;
    private int zze;
    private int zzf;
    private C0471p1 zzg;
    private C0471p1 zzh;
    private boolean zzi;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.measurement.a1, com.google.android.gms.internal.measurement.m2] */
    static {
        ?? abstractC0457m2 = new AbstractC0457m2();
        zzc = abstractC0457m2;
        AbstractC0457m2.j(C0396a1.class, abstractC0457m2);
    }

    public static void s(C0396a1 c0396a1, int i7) {
        c0396a1.zze |= 1;
        c0396a1.zzf = i7;
    }

    public static void t(C0396a1 c0396a1, C0471p1 c0471p1) {
        c0396a1.getClass();
        c0396a1.zzg = c0471p1;
        c0396a1.zze |= 2;
    }

    public static void u(C0396a1 c0396a1, boolean z7) {
        c0396a1.zze |= 8;
        c0396a1.zzi = z7;
    }

    public static Z0 v() {
        return (Z0) zzc.l();
    }

    public static void w(C0396a1 c0396a1, C0471p1 c0471p1) {
        c0396a1.getClass();
        c0471p1.getClass();
        c0396a1.zzh = c0471p1;
        c0396a1.zze |= 4;
    }

    public final boolean A() {
        return (this.zze & 1) != 0;
    }

    public final boolean B() {
        return (this.zze & 8) != 0;
    }

    public final boolean C() {
        return (this.zze & 4) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0457m2
    public final Object g(int i7) {
        switch (V0.f8440a[i7 - 1]) {
            case 1:
                return new AbstractC0457m2();
            case 2:
                return new AbstractC0452l2(zzc);
            case 3:
                return new J2(zzc, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                H2 h22 = zzd;
                if (h22 == null) {
                    synchronized (C0396a1.class) {
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

    public final C0471p1 x() {
        C0471p1 c0471p1 = this.zzg;
        return c0471p1 == null ? C0471p1.E() : c0471p1;
    }

    public final C0471p1 y() {
        C0471p1 c0471p1 = this.zzh;
        return c0471p1 == null ? C0471p1.E() : c0471p1;
    }

    public final boolean z() {
        return this.zzi;
    }
}
