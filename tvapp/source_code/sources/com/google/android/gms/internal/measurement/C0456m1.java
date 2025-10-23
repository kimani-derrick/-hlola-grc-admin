package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
/* renamed from: com.google.android.gms.internal.measurement.m1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0456m1 extends AbstractC0457m2 {
    private static final C0456m1 zzc;
    private static volatile H2 zzd;
    private String zzaa;
    private long zzab;
    private int zzac;
    private String zzad;
    private String zzae;
    private boolean zzaf;
    private InterfaceC0481r2 zzag;
    private String zzah;
    private int zzai;
    private int zzaj;
    private int zzak;
    private String zzal;
    private long zzam;
    private long zzan;
    private String zzao;
    private String zzap;
    private int zzaq;
    private String zzar;
    private C0461n1 zzas;
    private InterfaceC0472p2 zzat;
    private long zzau;
    private long zzav;
    private String zzaw;
    private String zzax;
    private int zzay;
    private boolean zzaz;
    private String zzba;
    private boolean zzbb;
    private C0436i1 zzbc;
    private String zzbd;
    private InterfaceC0481r2 zzbe;
    private String zzbf;
    private long zzbg;
    private boolean zzbh;
    private String zzbi;
    private boolean zzbj;
    private String zzbk;
    private int zzbl;
    private String zzbm;
    private Y0 zzbn;
    private int zzbo;
    private int zze;
    private int zzf;
    private int zzg;
    private InterfaceC0481r2 zzh;
    private InterfaceC0481r2 zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private String zzo;
    private String zzp;
    private String zzq;
    private String zzr;
    private int zzs;
    private String zzt;
    private String zzu;
    private String zzv;
    private long zzw;
    private long zzx;
    private String zzy;
    private boolean zzz;

    static {
        C0456m1 c0456m1 = new C0456m1();
        zzc = c0456m1;
        AbstractC0457m2.j(C0456m1.class, c0456m1);
    }

    public C0456m1() {
        K2 k22 = K2.f8369t;
        this.zzh = k22;
        this.zzi = k22;
        this.zzo = "";
        this.zzp = "";
        this.zzq = "";
        this.zzr = "";
        this.zzt = "";
        this.zzu = "";
        this.zzv = "";
        this.zzy = "";
        this.zzaa = "";
        this.zzad = "";
        this.zzae = "";
        this.zzag = k22;
        this.zzah = "";
        this.zzal = "";
        this.zzao = "";
        this.zzap = "";
        this.zzar = "";
        this.zzat = C0462n2.f8616t;
        this.zzaw = "";
        this.zzax = "";
        this.zzba = "";
        this.zzbd = "";
        this.zzbe = k22;
        this.zzbf = "";
        this.zzbi = "";
        this.zzbk = "";
        this.zzbm = "";
    }

    public static void A(C0456m1 c0456m1, C0490t1 c0490t1) {
        c0456m1.getClass();
        c0456m1.O0();
        c0456m1.zzi.add(c0490t1);
    }

    public static void A1(C0456m1 c0456m1) {
        c0456m1.zze |= 32768;
        c0456m1.zzx = 95001L;
    }

    public static void B(C0456m1 c0456m1, ArrayList arrayList) {
        int i7;
        InterfaceC0472p2 interfaceC0472p2 = c0456m1.zzat;
        if (!((W1) interfaceC0472p2).f8443q) {
            int size = interfaceC0472p2.size();
            if (size == 0) {
                i7 = 10;
            } else {
                i7 = size << 1;
            }
            C0462n2 c0462n2 = (C0462n2) interfaceC0472p2;
            if (i7 >= c0462n2.f8618s) {
                c0456m1.zzat = new C0462n2(c0462n2.f8618s, true, Arrays.copyOf(c0462n2.f8617r, i7));
            } else {
                throw new IllegalArgumentException();
            }
        }
        V1.b(arrayList, c0456m1.zzat);
    }

    public static void B1(C0456m1 c0456m1, String str) {
        c0456m1.getClass();
        str.getClass();
        c0456m1.zze |= 512;
        c0456m1.zzr = str;
    }

    public static void C(C0456m1 c0456m1, boolean z7) {
        c0456m1.zzf |= 65536;
        c0456m1.zzbh = z7;
    }

    public static void C1(C0456m1 c0456m1) {
        c0456m1.zze &= -2097153;
        c0456m1.zzad = zzc.zzad;
    }

    public static void D(C0456m1 c0456m1) {
        c0456m1.zze &= -268435457;
        c0456m1.zzal = zzc.zzal;
    }

    public static void E1(C0456m1 c0456m1) {
        c0456m1.getClass();
        c0456m1.zzag = K2.f8369t;
    }

    public static void F1(C0456m1 c0456m1, long j7) {
        c0456m1.zze |= 524288;
        c0456m1.zzab = j7;
    }

    public static void G1(C0456m1 c0456m1, String str) {
        c0456m1.getClass();
        str.getClass();
        c0456m1.zze |= 2048;
        c0456m1.zzt = str;
    }

    public static void H0(C0456m1 c0456m1) {
        c0456m1.zzf &= -8193;
        c0456m1.zzbd = zzc.zzbd;
    }

    public static void I0(C0456m1 c0456m1, int i7) {
        c0456m1.zzf |= 1048576;
        c0456m1.zzbl = i7;
    }

    public static void I1(C0456m1 c0456m1, String str) {
        c0456m1.getClass();
        str.getClass();
        c0456m1.zze |= 4096;
        c0456m1.zzu = str;
    }

    public static void J0(C0456m1 c0456m1, long j7) {
        c0456m1.zzf |= 32;
        c0456m1.zzav = j7;
    }

    public static void K0(C0456m1 c0456m1, String str) {
        c0456m1.getClass();
        str.getClass();
        c0456m1.zzf |= 128;
        c0456m1.zzax = str;
    }

    public static void K1(C0456m1 c0456m1, String str) {
        c0456m1.getClass();
        str.getClass();
        c0456m1.zze |= 8192;
        c0456m1.zzv = str;
    }

    public static void L0(C0456m1 c0456m1, ArrayList arrayList) {
        c0456m1.N0();
        V1.b(arrayList, c0456m1.zzh);
    }

    public static void M0(C0456m1 c0456m1, boolean z7) {
        c0456m1.zze |= 131072;
        c0456m1.zzz = z7;
    }

    public static void M1(C0456m1 c0456m1, String str) {
        c0456m1.getClass();
        str.getClass();
        c0456m1.zze |= 65536;
        c0456m1.zzy = str;
    }

    public static void O1(C0456m1 c0456m1, String str) {
        c0456m1.getClass();
        c0456m1.zze |= 262144;
        c0456m1.zzaa = str;
    }

    public static void Q0(C0456m1 c0456m1) {
        c0456m1.getClass();
        c0456m1.zzh = K2.f8369t;
    }

    public static void Q1(C0456m1 c0456m1, String str) {
        c0456m1.getClass();
        c0456m1.zze |= 2097152;
        c0456m1.zzad = str;
    }

    public static void R0(C0456m1 c0456m1, int i7) {
        c0456m1.zzf |= 8388608;
        c0456m1.zzbo = i7;
    }

    public static void S0(C0456m1 c0456m1, long j7) {
        c0456m1.zzf |= 32768;
        c0456m1.zzbg = j7;
    }

    public static void S1(C0456m1 c0456m1, String str) {
        c0456m1.getClass();
        str.getClass();
        c0456m1.zze |= 4194304;
        c0456m1.zzae = str;
    }

    public static void T0(C0456m1 c0456m1, String str) {
        c0456m1.getClass();
        str.getClass();
        c0456m1.zzf |= 8192;
        c0456m1.zzbd = str;
    }

    public static void U0(C0456m1 c0456m1) {
        c0456m1.zze |= 8388608;
        c0456m1.zzaf = false;
    }

    public static void U1(C0456m1 c0456m1, String str) {
        c0456m1.getClass();
        c0456m1.zze |= 16777216;
        c0456m1.zzah = str;
    }

    public static void W0(C0456m1 c0456m1) {
        c0456m1.zze &= -17;
        c0456m1.zzm = 0L;
    }

    public static void X0(C0456m1 c0456m1, int i7) {
        c0456m1.N0();
        c0456m1.zzh.remove(i7);
    }

    public static C0451l1 X1() {
        return (C0451l1) zzc.l();
    }

    public static void Y0(C0456m1 c0456m1, long j7) {
        c0456m1.zze |= 2;
        c0456m1.zzj = j7;
    }

    public static void Z0(C0456m1 c0456m1, String str) {
        c0456m1.getClass();
        str.getClass();
        c0456m1.zzf |= 16384;
        c0456m1.zzbf = str;
    }

    public static void a1(C0456m1 c0456m1, ArrayList arrayList) {
        InterfaceC0481r2 interfaceC0481r2 = c0456m1.zzag;
        if (!((W1) interfaceC0481r2).f8443q) {
            c0456m1.zzag = AbstractC0457m2.e(interfaceC0481r2);
        }
        V1.b(arrayList, c0456m1.zzag);
    }

    public static void c1(C0456m1 c0456m1) {
        c0456m1.zze &= -33;
        c0456m1.zzn = 0L;
    }

    public static void d1(C0456m1 c0456m1, int i7) {
        c0456m1.O0();
        c0456m1.zzi.remove(i7);
    }

    public static void e1(C0456m1 c0456m1, long j7) {
        c0456m1.zze |= 4;
        c0456m1.zzk = j7;
    }

    public static void f0(C0456m1 c0456m1) {
        c0456m1.zze &= Integer.MAX_VALUE;
        c0456m1.zzao = zzc.zzao;
    }

    public static void f1(C0456m1 c0456m1, String str) {
        c0456m1.getClass();
        str.getClass();
        c0456m1.zzf |= 131072;
        c0456m1.zzbi = str;
    }

    public static void g0(C0456m1 c0456m1, long j7) {
        c0456m1.zzf |= 16;
        c0456m1.zzau = j7;
    }

    public static void h0(C0456m1 c0456m1, String str) {
        c0456m1.getClass();
        str.getClass();
        c0456m1.zzf |= 4;
        c0456m1.zzar = str;
    }

    public static void h1(C0456m1 c0456m1) {
        c0456m1.zze &= -257;
        c0456m1.zzq = zzc.zzq;
    }

    public static void i0(C0456m1 c0456m1, Set set) {
        InterfaceC0481r2 interfaceC0481r2 = c0456m1.zzbe;
        if (!((W1) interfaceC0481r2).f8443q) {
            c0456m1.zzbe = AbstractC0457m2.e(interfaceC0481r2);
        }
        V1.b(set, c0456m1.zzbe);
    }

    public static void i1(C0456m1 c0456m1, int i7) {
        c0456m1.zze |= 1024;
        c0456m1.zzs = i7;
    }

    public static void j0(C0456m1 c0456m1, boolean z7) {
        c0456m1.zzf |= 262144;
        c0456m1.zzbj = z7;
    }

    public static void j1(C0456m1 c0456m1, long j7) {
        c0456m1.zze |= 8;
        c0456m1.zzl = j7;
    }

    public static void k0(C0456m1 c0456m1) {
        c0456m1.zze |= 1;
        c0456m1.zzg = 1;
    }

    public static void k1(C0456m1 c0456m1, String str) {
        c0456m1.getClass();
        str.getClass();
        c0456m1.zzf |= 524288;
        c0456m1.zzbk = str;
    }

    public static void m1(C0456m1 c0456m1) {
        c0456m1.getClass();
        c0456m1.zze |= 64;
        c0456m1.zzo = "android";
    }

    public static void n1(C0456m1 c0456m1, int i7) {
        c0456m1.zze |= 1048576;
        c0456m1.zzac = i7;
    }

    public static void o1(C0456m1 c0456m1, long j7) {
        c0456m1.zze |= 16;
        c0456m1.zzm = j7;
    }

    public static void p1(C0456m1 c0456m1) {
        c0456m1.zze &= -65537;
        c0456m1.zzy = zzc.zzy;
    }

    public static void r1(C0456m1 c0456m1) {
        c0456m1.zze &= -131073;
        c0456m1.zzz = false;
    }

    public static void s1(C0456m1 c0456m1, int i7) {
        c0456m1.zze |= 33554432;
        c0456m1.zzai = i7;
    }

    public static void t1(C0456m1 c0456m1, long j7) {
        c0456m1.zze |= 32;
        c0456m1.zzn = j7;
    }

    public static void u(C0456m1 c0456m1, int i7) {
        c0456m1.zzf |= 2;
        c0456m1.zzaq = i7;
    }

    public static void u1(C0456m1 c0456m1, String str) {
        c0456m1.getClass();
        str.getClass();
        c0456m1.zze |= 128;
        c0456m1.zzp = str;
    }

    public static void v(C0456m1 c0456m1, int i7, C0416e1 c0416e1) {
        c0456m1.getClass();
        c0456m1.N0();
        c0456m1.zzh.set(i7, c0416e1);
    }

    public static void w(C0456m1 c0456m1, int i7, C0490t1 c0490t1) {
        c0456m1.getClass();
        c0456m1.O0();
        c0456m1.zzi.set(i7, c0490t1);
    }

    public static void w1(C0456m1 c0456m1) {
        c0456m1.zze &= -262145;
        c0456m1.zzaa = zzc.zzaa;
    }

    public static void x(C0456m1 c0456m1, long j7) {
        c0456m1.zze |= 536870912;
        c0456m1.zzam = j7;
    }

    public static void x1(C0456m1 c0456m1, long j7) {
        c0456m1.zze |= 16384;
        c0456m1.zzw = j7;
    }

    public static void y(C0456m1 c0456m1, Y0 y0) {
        c0456m1.getClass();
        c0456m1.zzbn = y0;
        c0456m1.zzf |= 4194304;
    }

    public static void y1(C0456m1 c0456m1, String str) {
        c0456m1.getClass();
        str.getClass();
        c0456m1.zze |= 256;
        c0456m1.zzq = str;
    }

    public static void z(C0456m1 c0456m1, C0416e1 c0416e1) {
        c0456m1.getClass();
        c0456m1.N0();
        c0456m1.zzh.add(c0416e1);
    }

    public final boolean A0() {
        return (this.zzf & 8192) != 0;
    }

    public final boolean B0() {
        return (this.zze & 4) != 0;
    }

    public final boolean C0() {
        return (this.zzf & 32768) != 0;
    }

    public final boolean D0() {
        return (this.zze & 1024) != 0;
    }

    public final long D1() {
        return this.zzau;
    }

    public final String E() {
        return this.zzt;
    }

    public final boolean E0() {
        return (this.zze & 2) != 0;
    }

    public final String F() {
        return this.zzv;
    }

    public final boolean F0() {
        return (this.zze & 32768) != 0;
    }

    public final String G() {
        return this.zzbi;
    }

    public final int G0() {
        return this.zzac;
    }

    public final String H() {
        return this.zzax;
    }

    public final long H1() {
        return this.zzl;
    }

    public final String I() {
        return this.zzbk;
    }

    public final String J() {
        return this.zzq;
    }

    public final long J1() {
        return this.zzw;
    }

    public final String K() {
        return this.zzao;
    }

    public final String L() {
        return this.zzah;
    }

    public final long L1() {
        return this.zzn;
    }

    public final String M() {
        return this.zzad;
    }

    public final String N() {
        return this.zzp;
    }

    public final void N0() {
        InterfaceC0481r2 interfaceC0481r2 = this.zzh;
        if (!((W1) interfaceC0481r2).f8443q) {
            this.zzh = AbstractC0457m2.e(interfaceC0481r2);
        }
    }

    public final long N1() {
        return this.zzm;
    }

    public final String O() {
        return this.zzo;
    }

    public final void O0() {
        InterfaceC0481r2 interfaceC0481r2 = this.zzi;
        if (!((W1) interfaceC0481r2).f8443q) {
            this.zzi = AbstractC0457m2.e(interfaceC0481r2);
        }
    }

    public final String P() {
        return this.zzy;
    }

    public final int P0() {
        return this.zzbo;
    }

    public final long P1() {
        return this.zzk;
    }

    public final String Q() {
        return this.zzbd;
    }

    public final String R() {
        return this.zzr;
    }

    public final long R1() {
        return this.zzbg;
    }

    public final InterfaceC0481r2 S() {
        return this.zzag;
    }

    public final InterfaceC0481r2 T() {
        return this.zzh;
    }

    public final long T1() {
        return this.zzj;
    }

    public final InterfaceC0481r2 U() {
        return this.zzi;
    }

    public final boolean V() {
        return this.zzbh;
    }

    public final int V0() {
        return this.zzh.size();
    }

    public final long V1() {
        return this.zzx;
    }

    public final boolean W() {
        return this.zzbj;
    }

    public final Y0 W1() {
        Y0 y0 = this.zzbn;
        return y0 == null ? Y0.u() : y0;
    }

    public final boolean X() {
        return this.zzz;
    }

    public final boolean Y() {
        return this.zzaf;
    }

    public final String Y1() {
        return this.zzar;
    }

    public final boolean Z() {
        return (this.zze & 33554432) != 0;
    }

    public final String Z1() {
        return this.zzu;
    }

    public final boolean a0() {
        return (this.zzf & 4194304) != 0;
    }

    public final String a2() {
        return this.zzaa;
    }

    public final boolean b0() {
        return (this.zze & 1048576) != 0;
    }

    public final int b1() {
        return this.zzg;
    }

    public final boolean c0() {
        return (this.zze & 536870912) != 0;
    }

    public final int d0() {
        return this.zzai;
    }

    public final C0490t1 e0(int i7) {
        return (C0490t1) this.zzi.get(i7);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0457m2
    public final Object g(int i7) {
        switch (V0.f8440a[i7 - 1]) {
            case 1:
                return new C0456m1();
            case 2:
                return new AbstractC0452l2(zzc);
            case 3:
                return new J2(zzc, "\u0001=\u0000\u0002\u0001M=\u0000\u0005\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fင\n\rဈ\u000b\u000eဈ\f\u0010ဈ\r\u0011ဂ\u000e\u0012ဂ\u000f\u0013ဈ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ဂ\u0013\u0017င\u0014\u0018ဈ\u0015\u0019ဈ\u0016\u001aဂ\u0004\u001cဇ\u0017\u001d\u001b\u001eဈ\u0018\u001fင\u0019 င\u001a!င\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဈ\u001f&ဈ 'င!)ဈ\",ဉ#-\u001d.ဂ$/ဂ%2ဈ&4ဈ'5᠌(7ဇ)9ဈ*:ဇ+;ဉ,?ဈ-@\u001aAဈ.Cဂ/Dဇ0Gဈ1Hဇ2Iဈ3Jင4Kဈ5Lဉ6Mင7", new Object[]{"zze", "zzf", "zzg", "zzh", C0416e1.class, "zzi", C0490t1.class, "zzj", "zzk", "zzl", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzaa", "zzab", "zzac", "zzad", "zzae", "zzm", "zzaf", "zzag", C0396a1.class, "zzah", "zzai", "zzaj", "zzak", "zzal", "zzam", "zzan", "zzao", "zzap", "zzaq", "zzar", "zzas", "zzat", "zzau", "zzav", "zzaw", "zzax", "zzay", G0.f, "zzaz", "zzba", "zzbb", "zzbc", "zzbd", "zzbe", "zzbf", "zzbg", "zzbh", "zzbi", "zzbj", "zzbk", "zzbl", "zzbm", "zzbn", "zzbo"});
            case 4:
                return zzc;
            case 5:
                H2 h22 = zzd;
                if (h22 == null) {
                    synchronized (C0456m1.class) {
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

    public final int g1() {
        return this.zzaq;
    }

    public final boolean l0() {
        return (this.zzf & 131072) != 0;
    }

    public final int l1() {
        return this.zzs;
    }

    public final boolean m0() {
        return (this.zzf & 128) != 0;
    }

    public final boolean n0() {
        return (this.zzf & 524288) != 0;
    }

    public final boolean o0() {
        return (this.zzf & 8388608) != 0;
    }

    public final boolean p0() {
        return (this.zze & 524288) != 0;
    }

    public final boolean q0() {
        return (this.zzf & 16) != 0;
    }

    public final int q1() {
        return this.zzi.size();
    }

    public final String r() {
        return this.zzae;
    }

    public final boolean r0() {
        return (this.zze & 8) != 0;
    }

    public final int s() {
        return this.zzbl;
    }

    public final boolean s0() {
        return (this.zze & 16384) != 0;
    }

    public final C0416e1 t(int i7) {
        return (C0416e1) this.zzh.get(i7);
    }

    public final boolean t0() {
        return (this.zzf & 262144) != 0;
    }

    public final boolean u0() {
        return (this.zze & 131072) != 0;
    }

    public final boolean v0() {
        return (this.zze & 32) != 0;
    }

    public final long v1() {
        return this.zzam;
    }

    public final boolean w0() {
        return (this.zze & 16) != 0;
    }

    public final boolean x0() {
        return (this.zze & 1) != 0;
    }

    public final boolean y0() {
        return (this.zzf & 2) != 0;
    }

    public final boolean z0() {
        return (this.zze & 8388608) != 0;
    }

    public final long z1() {
        return this.zzab;
    }
}
