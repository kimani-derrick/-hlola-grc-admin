package androidx.datastore.preferences.protobuf;

import sun.misc.Unsafe;
/* loaded from: classes.dex */
public final class p0 extends r0 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f5804b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p0(Unsafe unsafe, int i7) {
        super(unsafe);
        this.f5804b = i7;
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final boolean c(long j7, Object obj) {
        switch (this.f5804b) {
            case 0:
                if (s0.f5819h) {
                    if (s0.g(j7, obj) == 0) {
                        return false;
                    }
                } else if (s0.h(j7, obj) == 0) {
                    return false;
                }
                return true;
            default:
                if (s0.f5819h) {
                    if (s0.g(j7, obj) == 0) {
                        return false;
                    }
                } else if (s0.h(j7, obj) == 0) {
                    return false;
                }
                return true;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final byte d(long j7, Object obj) {
        switch (this.f5804b) {
            case 0:
                if (s0.f5819h) {
                    return s0.g(j7, obj);
                }
                return s0.h(j7, obj);
            default:
                if (s0.f5819h) {
                    return s0.g(j7, obj);
                }
                return s0.h(j7, obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final double e(long j7, Object obj) {
        switch (this.f5804b) {
            case 0:
                return Double.longBitsToDouble(h(j7, obj));
            default:
                return Double.longBitsToDouble(h(j7, obj));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final float f(long j7, Object obj) {
        switch (this.f5804b) {
            case 0:
                return Float.intBitsToFloat(g(j7, obj));
            default:
                return Float.intBitsToFloat(g(j7, obj));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final void k(Object obj, long j7, boolean z7) {
        switch (this.f5804b) {
            case 0:
                if (s0.f5819h) {
                    s0.n(obj, j7, z7 ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    s0.o(obj, j7, z7 ? (byte) 1 : (byte) 0);
                    return;
                }
            default:
                if (s0.f5819h) {
                    s0.n(obj, j7, z7 ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    s0.o(obj, j7, z7 ? (byte) 1 : (byte) 0);
                    return;
                }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final void l(Object obj, long j7, byte b7) {
        switch (this.f5804b) {
            case 0:
                if (s0.f5819h) {
                    s0.n(obj, j7, b7);
                    return;
                } else {
                    s0.o(obj, j7, b7);
                    return;
                }
            default:
                if (s0.f5819h) {
                    s0.n(obj, j7, b7);
                    return;
                } else {
                    s0.o(obj, j7, b7);
                    return;
                }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final void m(Object obj, long j7, double d) {
        switch (this.f5804b) {
            case 0:
                p(obj, j7, Double.doubleToLongBits(d));
                return;
            default:
                p(obj, j7, Double.doubleToLongBits(d));
                return;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final void n(Object obj, long j7, float f) {
        switch (this.f5804b) {
            case 0:
                o(Float.floatToIntBits(f), j7, obj);
                return;
            default:
                o(Float.floatToIntBits(f), j7, obj);
                return;
        }
    }
}
