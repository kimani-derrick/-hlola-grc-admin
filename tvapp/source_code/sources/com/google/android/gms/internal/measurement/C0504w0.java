package com.google.android.gms.internal.measurement;

import java.util.List;
/* renamed from: com.google.android.gms.internal.measurement.w0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0504w0 extends AbstractC0457m2 {
    private static final C0504w0 zzc;
    private static volatile H2 zzd;
    private int zze;
    private int zzf;
    private InterfaceC0481r2 zzg;
    private InterfaceC0481r2 zzh;
    private boolean zzi;
    private boolean zzj;

    static {
        C0504w0 c0504w0 = new C0504w0();
        zzc = c0504w0;
        AbstractC0457m2.j(C0504w0.class, c0504w0);
    }

    public C0504w0() {
        K2 k22 = K2.f8369t;
        this.zzg = k22;
        this.zzh = k22;
    }

    public static void t(C0504w0 c0504w0, int i7, C0514y0 c0514y0) {
        c0504w0.getClass();
        InterfaceC0481r2 interfaceC0481r2 = c0504w0.zzh;
        if (!((W1) interfaceC0481r2).f8443q) {
            c0504w0.zzh = AbstractC0457m2.e(interfaceC0481r2);
        }
        c0504w0.zzh.set(i7, c0514y0);
    }

    public static void u(C0504w0 c0504w0, int i7, E0 e02) {
        c0504w0.getClass();
        InterfaceC0481r2 interfaceC0481r2 = c0504w0.zzg;
        if (!((W1) interfaceC0481r2).f8443q) {
            c0504w0.zzg = AbstractC0457m2.e(interfaceC0481r2);
        }
        c0504w0.zzg.set(i7, e02);
    }

    public final boolean A() {
        return (this.zze & 1) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0457m2
    public final Object g(int i7) {
        switch (AbstractC0494u0.f8681a[i7 - 1]) {
            case 1:
                return new C0504w0();
            case 2:
                return new AbstractC0452l2(zzc);
            case 3:
                return new J2(zzc, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zze", "zzf", "zzg", E0.class, "zzh", C0514y0.class, "zzi", "zzj"});
            case 4:
                return zzc;
            case 5:
                H2 h22 = zzd;
                if (h22 == null) {
                    synchronized (C0504w0.class) {
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

    public final C0514y0 s(int i7) {
        return (C0514y0) this.zzh.get(i7);
    }

    public final int v() {
        return this.zzh.size();
    }

    public final E0 w(int i7) {
        return (E0) this.zzg.get(i7);
    }

    public final int x() {
        return this.zzg.size();
    }

    public final List y() {
        return this.zzh;
    }

    public final List z() {
        return this.zzg;
    }
}
