package s;

import java.util.ArrayList;
/* loaded from: classes.dex */
public class c {
    public InterfaceC1121b d;

    /* renamed from: a  reason: collision with root package name */
    public i f13490a = null;

    /* renamed from: b  reason: collision with root package name */
    public float f13491b = 0.0f;

    /* renamed from: c  reason: collision with root package name */
    public ArrayList f13492c = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public boolean f13493e = false;

    public c(C4.b bVar) {
        this.d = new C1120a(this, bVar);
    }

    public final void a(e eVar, int i7) {
        this.d.i(eVar.i(i7), 1.0f);
        this.d.i(eVar.i(i7), -1.0f);
    }

    public final void b(i iVar, i iVar2, i iVar3, int i7) {
        boolean z7;
        if (i7 != 0) {
            if (i7 < 0) {
                i7 *= -1;
                z7 = true;
            } else {
                z7 = false;
            }
            this.f13491b = i7;
            if (z7) {
                this.d.i(iVar, 1.0f);
                this.d.i(iVar2, -1.0f);
                this.d.i(iVar3, -1.0f);
                return;
            }
        }
        this.d.i(iVar, -1.0f);
        this.d.i(iVar2, 1.0f);
        this.d.i(iVar3, 1.0f);
    }

    public final void c(i iVar, i iVar2, i iVar3, int i7) {
        boolean z7;
        if (i7 != 0) {
            if (i7 < 0) {
                i7 *= -1;
                z7 = true;
            } else {
                z7 = false;
            }
            this.f13491b = i7;
            if (z7) {
                this.d.i(iVar, 1.0f);
                this.d.i(iVar2, -1.0f);
                this.d.i(iVar3, 1.0f);
                return;
            }
        }
        this.d.i(iVar, -1.0f);
        this.d.i(iVar2, 1.0f);
        this.d.i(iVar3, -1.0f);
    }

    public i d(boolean[] zArr) {
        return e(zArr, null);
    }

    public final i e(boolean[] zArr, i iVar) {
        int i7;
        int k5 = this.d.k();
        i iVar2 = null;
        float f = 0.0f;
        for (int i8 = 0; i8 < k5; i8++) {
            float a7 = this.d.a(i8);
            if (a7 < 0.0f) {
                i d = this.d.d(i8);
                if ((zArr == null || !zArr[d.f13514b]) && d != iVar && (((i7 = d.f13522l) == 3 || i7 == 4) && a7 < f)) {
                    f = a7;
                    iVar2 = d;
                }
            }
        }
        return iVar2;
    }

    public final void f(i iVar) {
        i iVar2 = this.f13490a;
        if (iVar2 != null) {
            this.d.i(iVar2, -1.0f);
            this.f13490a = null;
        }
        float c5 = this.d.c(iVar, true) * (-1.0f);
        this.f13490a = iVar;
        if (c5 == 1.0f) {
            return;
        }
        this.f13491b /= c5;
        this.d.g(c5);
    }

    public final void g(i iVar, boolean z7) {
        if (!iVar.f) {
            return;
        }
        float e3 = this.d.e(iVar);
        this.f13491b = (iVar.f13516e * e3) + this.f13491b;
        this.d.c(iVar, z7);
        if (z7) {
            iVar.b(this);
        }
    }

    public void h(c cVar, boolean z7) {
        float b7 = this.d.b(cVar, z7);
        this.f13491b = (cVar.f13491b * b7) + this.f13491b;
        if (z7) {
            cVar.f13490a.b(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            r10 = this;
            s.i r0 = r10.f13490a
            if (r0 != 0) goto L7
            java.lang.String r0 = "0"
            goto L17
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            s.i r1 = r10.f13490a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L17:
            java.lang.String r1 = " = "
            java.lang.String r0 = com.google.android.gms.internal.measurement.AbstractC0515y1.m(r0, r1)
            float r1 = r10.f13491b
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L39
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            float r0 = r10.f13491b
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = r3
            goto L3a
        L39:
            r1 = r4
        L3a:
            s.b r5 = r10.d
            int r5 = r5.k()
        L40:
            if (r4 >= r5) goto L9c
            s.b r6 = r10.d
            s.i r6 = r6.d(r4)
            if (r6 != 0) goto L4b
            goto L99
        L4b:
            s.b r7 = r10.d
            float r7 = r7.a(r4)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 != 0) goto L56
            goto L99
        L56:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L6a
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto L76
            java.lang.String r1 = "- "
        L64:
            java.lang.String r0 = com.google.android.gms.internal.measurement.AbstractC0515y1.m(r0, r1)
            float r7 = r7 * r9
            goto L76
        L6a:
            if (r8 <= 0) goto L73
            java.lang.String r1 = " + "
            java.lang.String r0 = com.google.android.gms.internal.measurement.AbstractC0515y1.m(r0, r1)
            goto L76
        L73:
            java.lang.String r1 = " - "
            goto L64
        L76:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L81
            java.lang.String r0 = com.google.android.gms.internal.measurement.AbstractC0515y1.m(r0, r6)
            goto L98
        L81:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
        L98:
            r1 = r3
        L99:
            int r4 = r4 + 1
            goto L40
        L9c:
            if (r1 != 0) goto La4
            java.lang.String r1 = "0.0"
            java.lang.String r0 = com.google.android.gms.internal.measurement.AbstractC0515y1.m(r0, r1)
        La4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s.c.toString():java.lang.String");
    }
}
