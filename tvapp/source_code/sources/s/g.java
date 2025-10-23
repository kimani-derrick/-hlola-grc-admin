package s;

import java.util.Arrays;
import n5.r;
/* loaded from: classes.dex */
public final class g extends c {
    public i[] f;

    /* renamed from: g  reason: collision with root package name */
    public i[] f13509g;

    /* renamed from: h  reason: collision with root package name */
    public int f13510h;

    /* renamed from: i  reason: collision with root package name */
    public f f13511i;

    @Override // s.c
    public final i d(boolean[] zArr) {
        int i7 = -1;
        for (int i8 = 0; i8 < this.f13510h; i8++) {
            i[] iVarArr = this.f;
            i iVar = iVarArr[i8];
            if (!zArr[iVar.f13514b]) {
                f fVar = this.f13511i;
                fVar.f13507q = iVar;
                int i9 = 8;
                if (i7 == -1) {
                    while (i9 >= 0) {
                        float f = fVar.f13507q.f13518h[i9];
                        if (f <= 0.0f) {
                            if (f < 0.0f) {
                                i7 = i8;
                                break;
                            }
                            i9--;
                        }
                    }
                } else {
                    i iVar2 = iVarArr[i7];
                    while (true) {
                        if (i9 >= 0) {
                            float f7 = iVar2.f13518h[i9];
                            float f8 = fVar.f13507q.f13518h[i9];
                            if (f8 == f7) {
                                i9--;
                            } else if (f8 >= f7) {
                            }
                        }
                    }
                }
            }
        }
        if (i7 == -1) {
            return null;
        }
        return this.f[i7];
    }

    @Override // s.c
    public final void h(c cVar, boolean z7) {
        i iVar = cVar.f13490a;
        if (iVar == null) {
            return;
        }
        InterfaceC1121b interfaceC1121b = cVar.d;
        int k5 = interfaceC1121b.k();
        for (int i7 = 0; i7 < k5; i7++) {
            i d = interfaceC1121b.d(i7);
            float a7 = interfaceC1121b.a(i7);
            f fVar = this.f13511i;
            fVar.f13507q = d;
            boolean z8 = d.f13513a;
            float[] fArr = iVar.f13518h;
            if (z8) {
                boolean z9 = true;
                for (int i8 = 0; i8 < 9; i8++) {
                    float[] fArr2 = fVar.f13507q.f13518h;
                    float f = (fArr[i8] * a7) + fArr2[i8];
                    fArr2[i8] = f;
                    if (Math.abs(f) < 1.0E-4f) {
                        fVar.f13507q.f13518h[i8] = 0.0f;
                    } else {
                        z9 = false;
                    }
                }
                if (z9) {
                    fVar.f13508r.j(fVar.f13507q);
                }
            } else {
                for (int i9 = 0; i9 < 9; i9++) {
                    float f7 = fArr[i9];
                    if (f7 != 0.0f) {
                        float f8 = f7 * a7;
                        if (Math.abs(f8) < 1.0E-4f) {
                            f8 = 0.0f;
                        }
                        fVar.f13507q.f13518h[i9] = f8;
                    } else {
                        fVar.f13507q.f13518h[i9] = 0.0f;
                    }
                }
                i(d);
            }
            this.f13491b = (cVar.f13491b * a7) + this.f13491b;
        }
        j(iVar);
    }

    public final void i(i iVar) {
        int i7;
        int i8 = this.f13510h + 1;
        i[] iVarArr = this.f;
        if (i8 > iVarArr.length) {
            i[] iVarArr2 = (i[]) Arrays.copyOf(iVarArr, iVarArr.length * 2);
            this.f = iVarArr2;
            this.f13509g = (i[]) Arrays.copyOf(iVarArr2, iVarArr2.length * 2);
        }
        i[] iVarArr3 = this.f;
        int i9 = this.f13510h;
        iVarArr3[i9] = iVar;
        int i10 = i9 + 1;
        this.f13510h = i10;
        if (i10 > 1 && iVarArr3[i9].f13514b > iVar.f13514b) {
            int i11 = 0;
            while (true) {
                i7 = this.f13510h;
                if (i11 >= i7) {
                    break;
                }
                this.f13509g[i11] = this.f[i11];
                i11++;
            }
            Arrays.sort(this.f13509g, 0, i7, new r(1));
            for (int i12 = 0; i12 < this.f13510h; i12++) {
                this.f[i12] = this.f13509g[i12];
            }
        }
        iVar.f13513a = true;
        iVar.a(this);
    }

    public final void j(i iVar) {
        int i7 = 0;
        while (i7 < this.f13510h) {
            if (this.f[i7] == iVar) {
                while (true) {
                    int i8 = this.f13510h;
                    if (i7 < i8 - 1) {
                        i[] iVarArr = this.f;
                        int i9 = i7 + 1;
                        iVarArr[i7] = iVarArr[i9];
                        i7 = i9;
                    } else {
                        this.f13510h = i8 - 1;
                        iVar.f13513a = false;
                        return;
                    }
                }
            } else {
                i7++;
            }
        }
    }

    @Override // s.c
    public final String toString() {
        String str = " goal -> (" + this.f13491b + ") : ";
        for (int i7 = 0; i7 < this.f13510h; i7++) {
            i iVar = this.f[i7];
            f fVar = this.f13511i;
            fVar.f13507q = iVar;
            str = str + fVar + " ";
        }
        return str;
    }
}
