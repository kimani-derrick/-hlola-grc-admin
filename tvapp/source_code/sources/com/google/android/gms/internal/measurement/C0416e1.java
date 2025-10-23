package com.google.android.gms.internal.measurement;
/* renamed from: com.google.android.gms.internal.measurement.e1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0416e1 extends AbstractC0457m2 {
    private static final C0416e1 zzc;
    private static volatile H2 zzd;
    private int zze;
    private InterfaceC0481r2 zzf = K2.f8369t;
    private String zzg = "";
    private long zzh;
    private long zzi;
    private int zzj;

    static {
        C0416e1 c0416e1 = new C0416e1();
        zzc = c0416e1;
        AbstractC0457m2.j(C0416e1.class, c0416e1);
    }

    public static void B(long j7, C0416e1 c0416e1) {
        c0416e1.zze |= 4;
        c0416e1.zzi = j7;
    }

    public static C0411d1 E() {
        return (C0411d1) zzc.l();
    }

    public static void t(int i7, C0416e1 c0416e1) {
        c0416e1.K();
        c0416e1.zzf.remove(i7);
    }

    public static void u(long j7, C0416e1 c0416e1) {
        c0416e1.zze |= 2;
        c0416e1.zzh = j7;
    }

    public static void v(C0416e1 c0416e1) {
        c0416e1.getClass();
        c0416e1.zzf = K2.f8369t;
    }

    public static void w(C0416e1 c0416e1, int i7, C0431h1 c0431h1) {
        c0416e1.getClass();
        c0416e1.K();
        c0416e1.zzf.set(i7, c0431h1);
    }

    public static void x(C0416e1 c0416e1, C0431h1 c0431h1) {
        c0416e1.getClass();
        c0431h1.getClass();
        c0416e1.K();
        c0416e1.zzf.add(c0431h1);
    }

    public static void y(C0416e1 c0416e1, Iterable iterable) {
        c0416e1.K();
        V1.b(iterable, c0416e1.zzf);
    }

    public static void z(C0416e1 c0416e1, String str) {
        c0416e1.getClass();
        str.getClass();
        c0416e1.zze |= 1;
        c0416e1.zzg = str;
    }

    public final int A() {
        return this.zzf.size();
    }

    public final long C() {
        return this.zzi;
    }

    public final long D() {
        return this.zzh;
    }

    public final String F() {
        return this.zzg;
    }

    public final InterfaceC0481r2 G() {
        return this.zzf;
    }

    public final boolean H() {
        return (this.zze & 8) != 0;
    }

    public final boolean I() {
        return (this.zze & 4) != 0;
    }

    public final boolean J() {
        return (this.zze & 2) != 0;
    }

    public final void K() {
        InterfaceC0481r2 interfaceC0481r2 = this.zzf;
        if (!((W1) interfaceC0481r2).f8443q) {
            this.zzf = AbstractC0457m2.e(interfaceC0481r2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0457m2
    public final Object g(int i7) {
        switch (V0.f8440a[i7 - 1]) {
            case 1:
                return new C0416e1();
            case 2:
                return new AbstractC0452l2(zzc);
            case 3:
                return new J2(zzc, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zze", "zzf", C0431h1.class, "zzg", "zzh", "zzi", "zzj"});
            case 4:
                return zzc;
            case 5:
                H2 h22 = zzd;
                if (h22 == null) {
                    synchronized (C0416e1.class) {
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
        return this.zzj;
    }

    public final C0431h1 s(int i7) {
        return (C0431h1) this.zzf.get(i7);
    }
}
