package androidx.datastore.preferences.protobuf;
/* loaded from: classes.dex */
public final class q0 extends r0 {
    @Override // androidx.datastore.preferences.protobuf.r0
    public final boolean c(long j7, Object obj) {
        return this.f5813a.getBoolean(obj, j7);
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final byte d(long j7, Object obj) {
        return this.f5813a.getByte(obj, j7);
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final double e(long j7, Object obj) {
        return this.f5813a.getDouble(obj, j7);
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final float f(long j7, Object obj) {
        return this.f5813a.getFloat(obj, j7);
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final void k(Object obj, long j7, boolean z7) {
        this.f5813a.putBoolean(obj, j7, z7);
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final void l(Object obj, long j7, byte b7) {
        this.f5813a.putByte(obj, j7, b7);
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final void m(Object obj, long j7, double d) {
        this.f5813a.putDouble(obj, j7, d);
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final void n(Object obj, long j7, float f) {
        this.f5813a.putFloat(obj, j7, f);
    }
}
