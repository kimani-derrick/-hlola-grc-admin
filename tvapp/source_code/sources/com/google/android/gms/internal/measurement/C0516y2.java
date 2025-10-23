package com.google.android.gms.internal.measurement;

import android.database.Cursor;
import java.util.Collections;
import java.util.HashMap;
/* renamed from: com.google.android.gms.internal.measurement.y2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0516y2 implements C2 {

    /* renamed from: b  reason: collision with root package name */
    public static final C0442j2 f8716b = new C0442j2(10);

    /* renamed from: a  reason: collision with root package name */
    public Object f8717a;

    @Override // com.google.android.gms.internal.measurement.C2
    public boolean a(Class cls) {
        for (C2 c22 : (C2[]) this.f8717a) {
            if (c22.a(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.C2
    public J2 b(Class cls) {
        C2[] c2Arr;
        for (C2 c22 : (C2[]) this.f8717a) {
            if (c22.a(cls)) {
                return c22.b(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [o.j] */
    public Object c() {
        HashMap hashMap;
        String[] strArr = G1.f8340y;
        G1 g12 = (G1) this.f8717a;
        Cursor query = g12.f8341q.query(g12.f8342r, strArr, null, null, null);
        if (query == null) {
            return Collections.emptyMap();
        }
        try {
            int count = query.getCount();
            if (count == 0) {
                return Collections.emptyMap();
            }
            if (count <= 256) {
                hashMap = new o.j(count);
            } else {
                hashMap = new HashMap(count, 1.0f);
            }
            while (query.moveToNext()) {
                hashMap.put(query.getString(0), query.getString(1));
            }
            query.close();
            return hashMap;
        } finally {
            query.close();
        }
    }

    public void d(int i7) {
        ((C0412d2) this.f8717a).M(i7, 4);
    }

    public void e(int i7, double d) {
        C0412d2 c0412d2 = (C0412d2) this.f8717a;
        c0412d2.getClass();
        c0412d2.E(Double.doubleToRawLongBits(d), i7);
    }

    public void f(int i7, float f) {
        C0412d2 c0412d2 = (C0412d2) this.f8717a;
        c0412d2.getClass();
        c0412d2.G(i7, Float.floatToRawIntBits(f));
    }

    public void g(int i7, int i8) {
        ((C0412d2) this.f8717a).I(i7, i8);
    }

    public void h(int i7, C0407c2 c0407c2) {
        C0412d2 c0412d2 = (C0412d2) this.f8717a;
        c0412d2.M(i7, 2);
        c0412d2.r(c0407c2);
    }

    public void i(int i7, Object obj, L2 l22) {
        C0412d2 c0412d2 = (C0412d2) this.f8717a;
        c0412d2.M(i7, 3);
        l22.b((V1) obj, c0412d2.f8536b);
        c0412d2.M(i7, 4);
    }

    public void j(int i7, boolean z7) {
        C0412d2 c0412d2 = (C0412d2) this.f8717a;
        c0412d2.M(i7, 0);
        c0412d2.k(z7 ? (byte) 1 : (byte) 0);
    }

    public void k(long j7, int i7) {
        ((C0412d2) this.f8717a).E(j7, i7);
    }

    public void l(int i7) {
        ((C0412d2) this.f8717a).M(i7, 3);
    }

    public void m(int i7, int i8) {
        ((C0412d2) this.f8717a).G(i7, i8);
    }

    public void n(int i7, Object obj, L2 l22) {
        V1 v12 = (V1) obj;
        C0412d2 c0412d2 = (C0412d2) this.f8717a;
        c0412d2.M(i7, 2);
        c0412d2.N(v12.a(l22));
        l22.b(v12, c0412d2.f8536b);
    }

    public void o(long j7, int i7) {
        ((C0412d2) this.f8717a).K(j7, i7);
    }

    public void p(int i7, int i8) {
        ((C0412d2) this.f8717a).I(i7, i8);
    }

    public void q(long j7, int i7) {
        ((C0412d2) this.f8717a).E(j7, i7);
    }

    public void r(int i7, int i8) {
        ((C0412d2) this.f8717a).G(i7, i8);
    }

    public void s(long j7, int i7) {
        ((C0412d2) this.f8717a).K((j7 >> 63) ^ (j7 << 1), i7);
    }

    public void t(int i7, int i8) {
        ((C0412d2) this.f8717a).O(i7, (i8 >> 31) ^ (i8 << 1));
    }

    public void u(long j7, int i7) {
        ((C0412d2) this.f8717a).K(j7, i7);
    }

    public void v(int i7, int i8) {
        ((C0412d2) this.f8717a).O(i7, i8);
    }
}
