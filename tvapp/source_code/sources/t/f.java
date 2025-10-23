package t;

import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.util.ArrayList;
import s.h;
import s.i;
/* loaded from: classes.dex */
public final class f extends C1218d {

    /* renamed from: d0  reason: collision with root package name */
    public float f14511d0 = -1.0f;

    /* renamed from: e0  reason: collision with root package name */
    public int f14512e0 = -1;

    /* renamed from: f0  reason: collision with root package name */
    public int f14513f0 = -1;

    /* renamed from: g0  reason: collision with root package name */
    public C1217c f14514g0 = this.f14494y;

    /* renamed from: h0  reason: collision with root package name */
    public int f14515h0 = 0;

    public f() {
        this.f14451G.clear();
        this.f14451G.add(this.f14514g0);
        int length = this.F.length;
        for (int i7 = 0; i7 < length; i7++) {
            this.F[i7] = this.f14514g0;
        }
    }

    @Override // t.C1218d
    public final void a(s.e eVar) {
        boolean z7;
        C1219e c1219e = (C1219e) this.f14453I;
        if (c1219e == null) {
            return;
        }
        C1217c e3 = c1219e.e(2);
        C1217c e7 = c1219e.e(4);
        C1218d c1218d = this.f14453I;
        boolean z8 = true;
        if (c1218d != null && c1218d.f14475c0[0] == 2) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (this.f14515h0 == 0) {
            e3 = c1219e.e(3);
            e7 = c1219e.e(5);
            C1218d c1218d2 = this.f14453I;
            if (c1218d2 == null || c1218d2.f14475c0[1] != 2) {
                z8 = false;
            }
            z7 = z8;
        }
        if (this.f14512e0 != -1) {
            i j7 = eVar.j(this.f14514g0);
            eVar.e(j7, eVar.j(e3), this.f14512e0, 8);
            if (z7) {
                eVar.f(eVar.j(e7), j7, 0, 5);
            }
        } else if (this.f14513f0 != -1) {
            i j8 = eVar.j(this.f14514g0);
            i j9 = eVar.j(e7);
            eVar.e(j8, j9, -this.f14513f0, 8);
            if (z7) {
                eVar.f(j8, eVar.j(e3), 0, 5);
                eVar.f(j9, j8, 0, 5);
            }
        } else if (this.f14511d0 != -1.0f) {
            i j10 = eVar.j(this.f14514g0);
            i j11 = eVar.j(e7);
            float f = this.f14511d0;
            s.c k5 = eVar.k();
            k5.d.i(j10, -1.0f);
            k5.d.i(j11, f);
            eVar.c(k5);
        }
    }

    @Override // t.C1218d
    public final boolean b() {
        return true;
    }

    @Override // t.C1218d
    public final C1217c e(int i7) {
        switch (h.b(i7)) {
            case 0:
            case 5:
            case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
            case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
                return null;
            case 1:
            case 3:
                if (this.f14515h0 == 1) {
                    return this.f14514g0;
                }
                break;
            case 2:
            case 4:
                if (this.f14515h0 == 0) {
                    return this.f14514g0;
                }
                break;
        }
        throw new AssertionError(AbstractC0515y1.y(i7));
    }

    @Override // t.C1218d
    public final void x(s.e eVar) {
        if (this.f14453I == null) {
            return;
        }
        C1217c c1217c = this.f14514g0;
        eVar.getClass();
        int m7 = s.e.m(c1217c);
        if (this.f14515h0 == 1) {
            this.f14458N = m7;
            this.f14459O = 0;
            s(this.f14453I.g());
            v(0);
            return;
        }
        this.f14458N = 0;
        this.f14459O = m7;
        v(this.f14453I.j());
        s(0);
    }

    public final void y(int i7) {
        C1217c c1217c;
        if (this.f14515h0 == i7) {
            return;
        }
        this.f14515h0 = i7;
        ArrayList arrayList = this.f14451G;
        arrayList.clear();
        if (this.f14515h0 == 1) {
            c1217c = this.f14493x;
        } else {
            c1217c = this.f14494y;
        }
        this.f14514g0 = c1217c;
        arrayList.add(this.f14514g0);
        C1217c[] c1217cArr = this.F;
        int length = c1217cArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            c1217cArr[i8] = this.f14514g0;
        }
    }
}
