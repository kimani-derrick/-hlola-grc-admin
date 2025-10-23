package com.google.android.gms.internal.measurement;
/* loaded from: classes.dex */
public final class F2 implements L2 {

    /* renamed from: a  reason: collision with root package name */
    public final V1 f8265a;

    /* renamed from: b  reason: collision with root package name */
    public final C0442j2 f8266b;

    /* renamed from: c  reason: collision with root package name */
    public final C0442j2 f8267c;

    public F2(V1 v12) {
        C0442j2 c0442j2 = C1.f8238c;
        C0442j2 c0442j22 = Q.f8396a;
        this.f8266b = c0442j2;
        this.f8267c = c0442j22;
        this.f8265a = v12;
    }

    @Override // com.google.android.gms.internal.measurement.L2
    public final AbstractC0457m2 a() {
        V1 v12 = this.f8265a;
        if (v12 instanceof AbstractC0457m2) {
            return (AbstractC0457m2) ((AbstractC0457m2) v12).g(4);
        }
        return ((AbstractC0452l2) ((AbstractC0457m2) v12).g(5)).d();
    }

    @Override // com.google.android.gms.internal.measurement.L2
    public final void b(Object obj, C0516y2 c0516y2) {
        this.f8267c.getClass();
        AbstractC0515y1.v(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.L2
    public final void c(Object obj, Object obj2) {
        C1.m(this.f8266b, obj, obj2);
    }

    @Override // com.google.android.gms.internal.measurement.L2
    public final int d(Object obj) {
        this.f8266b.getClass();
        M2 m22 = ((AbstractC0457m2) obj).zzb;
        int i7 = m22.d;
        if (i7 == -1) {
            int i8 = 0;
            for (int i9 = 0; i9 < m22.f8376a; i9++) {
                i8 += C0412d2.h(3, (C0407c2) m22.f8378c[i9]) + C0412d2.C(2, m22.f8377b[i9] >>> 3) + (C0412d2.F(8) << 1);
            }
            m22.d = i8;
            return i8;
        }
        return i7;
    }

    @Override // com.google.android.gms.internal.measurement.L2
    public final void e(Object obj, byte[] bArr, int i7, int i8, Z1 z12) {
        AbstractC0457m2 abstractC0457m2 = (AbstractC0457m2) obj;
        if (abstractC0457m2.zzb == M2.f) {
            abstractC0457m2.zzb = M2.e();
        }
        AbstractC0515y1.v(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.L2
    public final void f(Object obj) {
        this.f8266b.getClass();
        C0442j2.n(obj);
        this.f8267c.getClass();
        AbstractC0515y1.v(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.L2
    public final boolean g(Object obj, Object obj2) {
        C0442j2 c0442j2 = this.f8266b;
        c0442j2.getClass();
        M2 m22 = ((AbstractC0457m2) obj).zzb;
        c0442j2.getClass();
        if (!m22.equals(((AbstractC0457m2) obj2).zzb)) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.L2
    public final int h(Object obj) {
        this.f8266b.getClass();
        return ((AbstractC0457m2) obj).zzb.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.L2
    public final boolean i(Object obj) {
        this.f8267c.getClass();
        AbstractC0515y1.v(obj);
        throw null;
    }
}
