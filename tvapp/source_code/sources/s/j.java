package s;

import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class j implements InterfaceC1121b {

    /* renamed from: a  reason: collision with root package name */
    public int f13523a = 16;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f13524b = new int[16];

    /* renamed from: c  reason: collision with root package name */
    public int[] f13525c = new int[16];
    public int[] d = new int[16];

    /* renamed from: e  reason: collision with root package name */
    public float[] f13526e = new float[16];
    public int[] f = new int[16];

    /* renamed from: g  reason: collision with root package name */
    public int[] f13527g = new int[16];

    /* renamed from: h  reason: collision with root package name */
    public int f13528h = 0;

    /* renamed from: i  reason: collision with root package name */
    public int f13529i = -1;

    /* renamed from: j  reason: collision with root package name */
    public final c f13530j;

    /* renamed from: k  reason: collision with root package name */
    public final C4.b f13531k;

    public j(c cVar, C4.b bVar) {
        this.f13530j = cVar;
        this.f13531k = bVar;
        clear();
    }

    @Override // s.InterfaceC1121b
    public final float a(int i7) {
        int i8 = this.f13528h;
        int i9 = this.f13529i;
        for (int i10 = 0; i10 < i8; i10++) {
            if (i10 == i7) {
                return this.f13526e[i9];
            }
            i9 = this.f13527g[i9];
            if (i9 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // s.InterfaceC1121b
    public final float b(c cVar, boolean z7) {
        float e3 = e(cVar.f13490a);
        c(cVar.f13490a, z7);
        j jVar = (j) cVar.d;
        int i7 = jVar.f13528h;
        int i8 = 0;
        int i9 = 0;
        while (i8 < i7) {
            int i10 = jVar.d[i9];
            if (i10 != -1) {
                h(((i[]) this.f13531k.f424u)[i10], jVar.f13526e[i9] * e3, z7);
                i8++;
            }
            i9++;
        }
        return e3;
    }

    @Override // s.InterfaceC1121b
    public final float c(i iVar, boolean z7) {
        int[] iArr;
        int i7;
        int n = n(iVar);
        if (n == -1) {
            return 0.0f;
        }
        int i8 = iVar.f13514b;
        int i9 = i8 % 16;
        int[] iArr2 = this.f13524b;
        int i10 = iArr2[i9];
        if (i10 != -1) {
            if (this.d[i10] == i8) {
                int[] iArr3 = this.f13525c;
                iArr2[i9] = iArr3[i10];
                iArr3[i10] = -1;
            } else {
                while (true) {
                    iArr = this.f13525c;
                    i7 = iArr[i10];
                    if (i7 == -1 || this.d[i7] == i8) {
                        break;
                    }
                    i10 = i7;
                }
                if (i7 != -1 && this.d[i7] == i8) {
                    iArr[i10] = iArr[i7];
                    iArr[i7] = -1;
                }
            }
        }
        float f = this.f13526e[n];
        if (this.f13529i == n) {
            this.f13529i = this.f13527g[n];
        }
        this.d[n] = -1;
        int[] iArr4 = this.f;
        int i11 = iArr4[n];
        if (i11 != -1) {
            int[] iArr5 = this.f13527g;
            iArr5[i11] = iArr5[n];
        }
        int i12 = this.f13527g[n];
        if (i12 != -1) {
            iArr4[i12] = iArr4[n];
        }
        this.f13528h--;
        iVar.f13521k--;
        if (z7) {
            iVar.b(this.f13530j);
        }
        return f;
    }

    @Override // s.InterfaceC1121b
    public final void clear() {
        int i7 = this.f13528h;
        for (int i8 = 0; i8 < i7; i8++) {
            i d = d(i8);
            if (d != null) {
                d.b(this.f13530j);
            }
        }
        for (int i9 = 0; i9 < this.f13523a; i9++) {
            this.d[i9] = -1;
            this.f13525c[i9] = -1;
        }
        for (int i10 = 0; i10 < 16; i10++) {
            this.f13524b[i10] = -1;
        }
        this.f13528h = 0;
        this.f13529i = -1;
    }

    @Override // s.InterfaceC1121b
    public final i d(int i7) {
        int i8 = this.f13528h;
        if (i8 == 0) {
            return null;
        }
        int i9 = this.f13529i;
        for (int i10 = 0; i10 < i8; i10++) {
            if (i10 == i7 && i9 != -1) {
                return ((i[]) this.f13531k.f424u)[this.d[i9]];
            }
            i9 = this.f13527g[i9];
            if (i9 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // s.InterfaceC1121b
    public final float e(i iVar) {
        int n = n(iVar);
        if (n != -1) {
            return this.f13526e[n];
        }
        return 0.0f;
    }

    @Override // s.InterfaceC1121b
    public final boolean f(i iVar) {
        if (n(iVar) != -1) {
            return true;
        }
        return false;
    }

    @Override // s.InterfaceC1121b
    public final void g(float f) {
        int i7 = this.f13528h;
        int i8 = this.f13529i;
        for (int i9 = 0; i9 < i7; i9++) {
            float[] fArr = this.f13526e;
            fArr[i8] = fArr[i8] / f;
            i8 = this.f13527g[i8];
            if (i8 == -1) {
                return;
            }
        }
    }

    @Override // s.InterfaceC1121b
    public final void h(i iVar, float f, boolean z7) {
        if (f > -0.001f && f < 0.001f) {
            return;
        }
        int n = n(iVar);
        if (n == -1) {
            i(iVar, f);
            return;
        }
        float[] fArr = this.f13526e;
        float f7 = fArr[n] + f;
        fArr[n] = f7;
        if (f7 > -0.001f && f7 < 0.001f) {
            fArr[n] = 0.0f;
            c(iVar, z7);
        }
    }

    @Override // s.InterfaceC1121b
    public final void i(i iVar, float f) {
        if (f > -0.001f && f < 0.001f) {
            c(iVar, true);
            return;
        }
        int i7 = 0;
        if (this.f13528h == 0) {
            m(0, iVar, f);
            l(iVar, 0);
            this.f13529i = 0;
            return;
        }
        int n = n(iVar);
        if (n != -1) {
            this.f13526e[n] = f;
            return;
        }
        int i8 = this.f13528h + 1;
        int i9 = this.f13523a;
        if (i8 >= i9) {
            int i10 = i9 * 2;
            this.d = Arrays.copyOf(this.d, i10);
            this.f13526e = Arrays.copyOf(this.f13526e, i10);
            this.f = Arrays.copyOf(this.f, i10);
            this.f13527g = Arrays.copyOf(this.f13527g, i10);
            this.f13525c = Arrays.copyOf(this.f13525c, i10);
            for (int i11 = this.f13523a; i11 < i10; i11++) {
                this.d[i11] = -1;
                this.f13525c[i11] = -1;
            }
            this.f13523a = i10;
        }
        int i12 = this.f13528h;
        int i13 = this.f13529i;
        int i14 = -1;
        for (int i15 = 0; i15 < i12; i15++) {
            int i16 = this.d[i13];
            int i17 = iVar.f13514b;
            if (i16 == i17) {
                this.f13526e[i13] = f;
                return;
            }
            if (i16 < i17) {
                i14 = i13;
            }
            i13 = this.f13527g[i13];
            if (i13 == -1) {
                break;
            }
        }
        while (true) {
            if (i7 < this.f13523a) {
                if (this.d[i7] == -1) {
                    break;
                }
                i7++;
            } else {
                i7 = -1;
                break;
            }
        }
        m(i7, iVar, f);
        int[] iArr = this.f;
        if (i14 != -1) {
            iArr[i7] = i14;
            int[] iArr2 = this.f13527g;
            iArr2[i7] = iArr2[i14];
            iArr2[i14] = i7;
        } else {
            iArr[i7] = -1;
            if (this.f13528h > 0) {
                this.f13527g[i7] = this.f13529i;
                this.f13529i = i7;
            } else {
                this.f13527g[i7] = -1;
            }
        }
        int i18 = this.f13527g[i7];
        if (i18 != -1) {
            this.f[i18] = i7;
        }
        l(iVar, i7);
    }

    @Override // s.InterfaceC1121b
    public final void j() {
        int i7 = this.f13528h;
        int i8 = this.f13529i;
        for (int i9 = 0; i9 < i7; i9++) {
            float[] fArr = this.f13526e;
            fArr[i8] = fArr[i8] * (-1.0f);
            i8 = this.f13527g[i8];
            if (i8 == -1) {
                return;
            }
        }
    }

    @Override // s.InterfaceC1121b
    public final int k() {
        return this.f13528h;
    }

    public final void l(i iVar, int i7) {
        int[] iArr;
        int i8 = iVar.f13514b % 16;
        int[] iArr2 = this.f13524b;
        int i9 = iArr2[i8];
        if (i9 == -1) {
            iArr2[i8] = i7;
        } else {
            while (true) {
                iArr = this.f13525c;
                int i10 = iArr[i9];
                if (i10 == -1) {
                    break;
                }
                i9 = i10;
            }
            iArr[i9] = i7;
        }
        this.f13525c[i7] = -1;
    }

    public final void m(int i7, i iVar, float f) {
        this.d[i7] = iVar.f13514b;
        this.f13526e[i7] = f;
        this.f[i7] = -1;
        this.f13527g[i7] = -1;
        iVar.a(this.f13530j);
        iVar.f13521k++;
        this.f13528h++;
    }

    public final int n(i iVar) {
        if (this.f13528h == 0) {
            return -1;
        }
        int i7 = iVar.f13514b;
        int i8 = this.f13524b[i7 % 16];
        if (i8 == -1) {
            return -1;
        }
        if (this.d[i8] == i7) {
            return i8;
        }
        do {
            i8 = this.f13525c[i8];
            if (i8 == -1) {
                break;
            }
        } while (this.d[i8] != i7);
        if (i8 == -1 || this.d[i8] != i7) {
            return -1;
        }
        return i8;
    }

    public final String toString() {
        String m7;
        String m8;
        String str = hashCode() + " { ";
        int i7 = this.f13528h;
        for (int i8 = 0; i8 < i7; i8++) {
            i d = d(i8);
            if (d != null) {
                String str2 = str + d + " = " + a(i8) + " ";
                int n = n(d);
                String m9 = AbstractC0515y1.m(str2, "[p: ");
                int i9 = this.f[n];
                C4.b bVar = this.f13531k;
                if (i9 != -1) {
                    m7 = m9 + ((i[]) bVar.f424u)[this.d[this.f[n]]];
                } else {
                    m7 = AbstractC0515y1.m(m9, "none");
                }
                String m10 = AbstractC0515y1.m(m7, ", n: ");
                if (this.f13527g[n] != -1) {
                    m8 = m10 + ((i[]) bVar.f424u)[this.d[this.f13527g[n]]];
                } else {
                    m8 = AbstractC0515y1.m(m10, "none");
                }
                str = AbstractC0515y1.m(m8, "]");
            }
        }
        return AbstractC0515y1.m(str, " }");
    }
}
