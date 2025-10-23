package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;
/* loaded from: classes.dex */
public final class O2 extends P2 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f8388b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ O2(Unsafe unsafe, int i7) {
        super(unsafe);
        this.f8388b = i7;
    }

    @Override // com.google.android.gms.internal.measurement.P2
    public final double a(long j7, Object obj) {
        switch (this.f8388b) {
            case 0:
                return Double.longBitsToDouble(m(j7, obj));
            default:
                return Double.longBitsToDouble(m(j7, obj));
        }
    }

    @Override // com.google.android.gms.internal.measurement.P2
    public final void c(Object obj, long j7, byte b7) {
        switch (this.f8388b) {
            case 0:
                if (Q2.f8402g) {
                    Q2.k(obj, j7, b7);
                    return;
                } else {
                    Q2.m(obj, j7, b7);
                    return;
                }
            default:
                if (Q2.f8402g) {
                    Q2.k(obj, j7, b7);
                    return;
                } else {
                    Q2.m(obj, j7, b7);
                    return;
                }
        }
    }

    @Override // com.google.android.gms.internal.measurement.P2
    public final void d(Object obj, long j7, double d) {
        switch (this.f8388b) {
            case 0:
                f(obj, j7, Double.doubleToLongBits(d));
                return;
            default:
                f(obj, j7, Double.doubleToLongBits(d));
                return;
        }
    }

    @Override // com.google.android.gms.internal.measurement.P2
    public final void e(Object obj, long j7, float f) {
        switch (this.f8388b) {
            case 0:
                b(Float.floatToIntBits(f), j7, obj);
                return;
            default:
                b(Float.floatToIntBits(f), j7, obj);
                return;
        }
    }

    @Override // com.google.android.gms.internal.measurement.P2
    public final void g(Object obj, long j7, boolean z7) {
        switch (this.f8388b) {
            case 0:
                if (Q2.f8402g) {
                    Q2.k(obj, j7, z7 ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    Q2.m(obj, j7, z7 ? (byte) 1 : (byte) 0);
                    return;
                }
            default:
                if (Q2.f8402g) {
                    Q2.k(obj, j7, z7 ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    Q2.m(obj, j7, z7 ? (byte) 1 : (byte) 0);
                    return;
                }
        }
    }

    @Override // com.google.android.gms.internal.measurement.P2
    public final float i(long j7, Object obj) {
        switch (this.f8388b) {
            case 0:
                return Float.intBitsToFloat(l(j7, obj));
            default:
                return Float.intBitsToFloat(l(j7, obj));
        }
    }

    @Override // com.google.android.gms.internal.measurement.P2
    public final boolean k(long j7, Object obj) {
        switch (this.f8388b) {
            case 0:
                if (Q2.f8402g) {
                    if (((byte) (Q2.f8400c.l((-4) & j7, obj) >>> ((int) (((~j7) & 3) << 3)))) == 0) {
                        return false;
                    }
                } else {
                    if (((byte) (Q2.f8400c.l((-4) & j7, obj) >>> ((int) ((j7 & 3) << 3)))) == 0) {
                        return false;
                    }
                }
                return true;
            default:
                if (Q2.f8402g) {
                    if (((byte) (Q2.f8400c.l((-4) & j7, obj) >>> ((int) (((~j7) & 3) << 3)))) == 0) {
                        return false;
                    }
                } else {
                    if (((byte) (Q2.f8400c.l((-4) & j7, obj) >>> ((int) ((j7 & 3) << 3)))) == 0) {
                        return false;
                    }
                }
                return true;
        }
    }
}
