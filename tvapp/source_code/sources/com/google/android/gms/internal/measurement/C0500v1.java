package com.google.android.gms.internal.measurement;

import java.util.List;
/* renamed from: com.google.android.gms.internal.measurement.v1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0500v1 extends AbstractC0457m2 {
    private static final C0500v1 zzc;
    private static volatile H2 zzd;
    private InterfaceC0481r2 zze = K2.f8369t;

    static {
        C0500v1 c0500v1 = new C0500v1();
        zzc = c0500v1;
        AbstractC0457m2.j(C0500v1.class, c0500v1);
    }

    public static C0500v1 s() {
        return zzc;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0457m2
    public final Object g(int i7) {
        switch (AbstractC0495u1.f8682a[i7 - 1]) {
            case 1:
                return new C0500v1();
            case 2:
                return new AbstractC0452l2(zzc);
            case 3:
                return new J2(zzc, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", C0505w1.class});
            case 4:
                return zzc;
            case 5:
                H2 h22 = zzd;
                if (h22 == null) {
                    synchronized (C0500v1.class) {
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
        return this.zze.size();
    }

    public final List t() {
        return this.zze;
    }
}
