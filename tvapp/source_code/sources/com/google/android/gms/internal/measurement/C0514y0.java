package com.google.android.gms.internal.measurement;
/* renamed from: com.google.android.gms.internal.measurement.y0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0514y0 extends AbstractC0457m2 {
    private static final C0514y0 zzc;
    private static volatile H2 zzd;
    private int zze;
    private int zzf;
    private String zzg = "";
    private InterfaceC0481r2 zzh = K2.f8369t;
    private boolean zzi;
    private C0 zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;

    static {
        C0514y0 c0514y0 = new C0514y0();
        zzc = c0514y0;
        AbstractC0457m2.j(C0514y0.class, c0514y0);
    }

    public static void t(C0514y0 c0514y0, int i7, A0 a02) {
        c0514y0.getClass();
        InterfaceC0481r2 interfaceC0481r2 = c0514y0.zzh;
        if (!((W1) interfaceC0481r2).f8443q) {
            c0514y0.zzh = AbstractC0457m2.e(interfaceC0481r2);
        }
        c0514y0.zzh.set(i7, a02);
    }

    public static void u(C0514y0 c0514y0, String str) {
        c0514y0.getClass();
        c0514y0.zze |= 2;
        c0514y0.zzg = str;
    }

    public static C0509x0 w() {
        return (C0509x0) zzc.l();
    }

    public final boolean A() {
        return this.zzk;
    }

    public final boolean B() {
        return this.zzl;
    }

    public final boolean C() {
        return this.zzm;
    }

    public final boolean D() {
        return (this.zze & 8) != 0;
    }

    public final boolean E() {
        return (this.zze & 1) != 0;
    }

    public final boolean F() {
        return (this.zze & 64) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0457m2
    public final Object g(int i7) {
        switch (AbstractC0494u0.f8681a[i7 - 1]) {
            case 1:
                return new C0514y0();
            case 2:
                return new AbstractC0452l2(zzc);
            case 3:
                return new J2(zzc, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", A0.class, "zzi", "zzj", "zzk", "zzl", "zzm"});
            case 4:
                return zzc;
            case 5:
                H2 h22 = zzd;
                if (h22 == null) {
                    synchronized (C0514y0.class) {
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
        return this.zzh.size();
    }

    public final A0 s(int i7) {
        return (A0) this.zzh.get(i7);
    }

    public final int v() {
        return this.zzf;
    }

    public final C0 x() {
        C0 c02 = this.zzj;
        return c02 == null ? C0.s() : c02;
    }

    public final String y() {
        return this.zzg;
    }

    public final InterfaceC0481r2 z() {
        return this.zzh;
    }
}
