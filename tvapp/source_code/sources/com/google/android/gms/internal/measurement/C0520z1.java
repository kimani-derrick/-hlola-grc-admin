package com.google.android.gms.internal.measurement;

import java.util.List;
/* renamed from: com.google.android.gms.internal.measurement.z1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0520z1 extends AbstractC0457m2 {
    private static final C0520z1 zzc;
    private static volatile H2 zzd;
    private int zze;
    private int zzf;
    private InterfaceC0481r2 zzg = K2.f8369t;
    private String zzh = "";
    private String zzi = "";
    private boolean zzj;
    private double zzk;

    static {
        C0520z1 c0520z1 = new C0520z1();
        zzc = c0520z1;
        AbstractC0457m2.j(C0520z1.class, c0520z1);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0457m2
    public final Object g(int i7) {
        switch (AbstractC0495u1.f8682a[i7 - 1]) {
            case 1:
                return new C0520z1();
            case 2:
                return new AbstractC0452l2(zzc);
            case 3:
                return new J2(zzc, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zze", "zzf", G0.f8337i, "zzg", C0520z1.class, "zzh", "zzi", "zzj", "zzk"});
            case 4:
                return zzc;
            case 5:
                H2 h22 = zzd;
                if (h22 == null) {
                    synchronized (C0520z1.class) {
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

    public final double r() {
        return this.zzk;
    }

    public final int s() {
        int a7 = AbstractC0515y1.a(this.zzf);
        if (a7 == 0) {
            return 1;
        }
        return a7;
    }

    public final String t() {
        return this.zzh;
    }

    public final String u() {
        return this.zzi;
    }

    public final List v() {
        return this.zzg;
    }

    public final boolean w() {
        return this.zzj;
    }

    public final boolean x() {
        return (this.zze & 8) != 0;
    }

    public final boolean y() {
        return (this.zze & 16) != 0;
    }

    public final boolean z() {
        return (this.zze & 4) != 0;
    }
}
