package com.google.crypto.tink.shaded.protobuf;

import sun.misc.Unsafe;
/* loaded from: classes.dex */
public final class k0 extends m0 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f9142b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(Unsafe unsafe, int i7) {
        super(unsafe);
        this.f9142b = i7;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m0
    public final boolean c(long j7, Object obj) {
        switch (this.f9142b) {
            case 0:
                if (n0.f9151g) {
                    if (n0.h(j7, obj) == 0) {
                        return false;
                    }
                } else if (n0.i(j7, obj) == 0) {
                    return false;
                }
                return true;
            default:
                if (n0.f9151g) {
                    if (n0.h(j7, obj) == 0) {
                        return false;
                    }
                } else if (n0.i(j7, obj) == 0) {
                    return false;
                }
                return true;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m0
    public final byte d(long j7, Object obj) {
        switch (this.f9142b) {
            case 0:
                if (n0.f9151g) {
                    return n0.h(j7, obj);
                }
                return n0.i(j7, obj);
            default:
                if (n0.f9151g) {
                    return n0.h(j7, obj);
                }
                return n0.i(j7, obj);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m0
    public final double e(long j7, Object obj) {
        switch (this.f9142b) {
            case 0:
                return Double.longBitsToDouble(h(j7, obj));
            default:
                return Double.longBitsToDouble(h(j7, obj));
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m0
    public final float f(long j7, Object obj) {
        switch (this.f9142b) {
            case 0:
                return Float.intBitsToFloat(g(j7, obj));
            default:
                return Float.intBitsToFloat(g(j7, obj));
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m0
    public final void k(Object obj, long j7, boolean z7) {
        switch (this.f9142b) {
            case 0:
                if (n0.f9151g) {
                    n0.p(obj, j7, z7 ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    n0.q(obj, j7, z7 ? (byte) 1 : (byte) 0);
                    return;
                }
            default:
                if (n0.f9151g) {
                    n0.p(obj, j7, z7 ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    n0.q(obj, j7, z7 ? (byte) 1 : (byte) 0);
                    return;
                }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m0
    public final void l(Object obj, long j7, byte b7) {
        switch (this.f9142b) {
            case 0:
                if (n0.f9151g) {
                    n0.p(obj, j7, b7);
                    return;
                } else {
                    n0.q(obj, j7, b7);
                    return;
                }
            default:
                if (n0.f9151g) {
                    n0.p(obj, j7, b7);
                    return;
                } else {
                    n0.q(obj, j7, b7);
                    return;
                }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m0
    public final void m(Object obj, long j7, double d) {
        switch (this.f9142b) {
            case 0:
                p(obj, j7, Double.doubleToLongBits(d));
                return;
            default:
                p(obj, j7, Double.doubleToLongBits(d));
                return;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m0
    public final void n(Object obj, long j7, float f) {
        switch (this.f9142b) {
            case 0:
                o(Float.floatToIntBits(f), j7, obj);
                return;
            default:
                o(Float.floatToIntBits(f), j7, obj);
                return;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.m0
    public final boolean s() {
        switch (this.f9142b) {
            case 0:
                return false;
            default:
                return false;
        }
    }
}
