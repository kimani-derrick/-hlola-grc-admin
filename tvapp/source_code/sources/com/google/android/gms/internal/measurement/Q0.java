package com.google.android.gms.internal.measurement;

import java.util.List;
/* loaded from: classes.dex */
public final class Q0 extends AbstractC0457m2 {
    private static final Q0 zzc;
    private static volatile H2 zzd;
    private int zze;
    private long zzf;
    private String zzg = "";
    private int zzh;
    private InterfaceC0481r2 zzi;
    private InterfaceC0481r2 zzj;
    private InterfaceC0481r2 zzk;
    private String zzl;
    private boolean zzm;
    private InterfaceC0481r2 zzn;
    private InterfaceC0481r2 zzo;
    private String zzp;
    private String zzq;
    private L0 zzr;
    private R0 zzs;
    private U0 zzt;
    private S0 zzu;

    static {
        Q0 q02 = new Q0();
        zzc = q02;
        AbstractC0457m2.j(Q0.class, q02);
    }

    public Q0() {
        K2 k22 = K2.f8369t;
        this.zzi = k22;
        this.zzj = k22;
        this.zzk = k22;
        this.zzl = "";
        this.zzn = k22;
        this.zzo = k22;
        this.zzp = "";
        this.zzq = "";
    }

    public static void t(Q0 q02) {
        q02.getClass();
        q02.zzk = K2.f8369t;
    }

    public static void u(Q0 q02, int i7, O0 o02) {
        q02.getClass();
        InterfaceC0481r2 interfaceC0481r2 = q02.zzj;
        if (!((W1) interfaceC0481r2).f8443q) {
            q02.zzj = AbstractC0457m2.e(interfaceC0481r2);
        }
        q02.zzj.set(i7, o02);
    }

    public static P0 y() {
        return (P0) zzc.l();
    }

    public static Q0 z() {
        return zzc;
    }

    public final U0 A() {
        U0 u02 = this.zzt;
        return u02 == null ? U0.s() : u02;
    }

    public final String B() {
        return this.zzg;
    }

    public final String C() {
        return this.zzp;
    }

    public final List D() {
        return this.zzk;
    }

    public final InterfaceC0481r2 E() {
        return this.zzo;
    }

    public final InterfaceC0481r2 F() {
        return this.zzn;
    }

    public final InterfaceC0481r2 G() {
        return this.zzi;
    }

    public final boolean H() {
        return this.zzm;
    }

    public final boolean I() {
        return (this.zze & 128) != 0;
    }

    public final boolean J() {
        return (this.zze & 2) != 0;
    }

    public final boolean K() {
        return (this.zze & 512) != 0;
    }

    public final boolean L() {
        return (this.zze & 1) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0457m2
    public final Object g(int i7) {
        switch (H0.f8351a[i7 - 1]) {
            case 1:
                return new Q0();
            case 2:
                return new AbstractC0452l2(zzc);
            case 3:
                return new J2(zzc, "\u0001\u0010\u0000\u0001\u0001\u0012\u0010\u0000\u0005\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005\u000eဈ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011ဉ\t\u0012ဉ\n", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", T0.class, "zzj", O0.class, "zzk", C0504w0.class, "zzl", "zzm", "zzn", C0510x1.class, "zzo", M0.class, "zzp", "zzq", "zzr", "zzs", "zzt", "zzu"});
            case 4:
                return zzc;
            case 5:
                H2 h22 = zzd;
                if (h22 == null) {
                    synchronized (Q0.class) {
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
        return this.zzn.size();
    }

    public final O0 s(int i7) {
        return (O0) this.zzj.get(i7);
    }

    public final int v() {
        return this.zzj.size();
    }

    public final long w() {
        return this.zzf;
    }

    public final L0 x() {
        L0 l02 = this.zzr;
        return l02 == null ? L0.r() : l02;
    }
}
