package s;

import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.util.Arrays;
/* renamed from: s.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1120a implements InterfaceC1121b {

    /* renamed from: b  reason: collision with root package name */
    public final c f13483b;

    /* renamed from: c  reason: collision with root package name */
    public final C4.b f13484c;

    /* renamed from: a  reason: collision with root package name */
    public int f13482a = 0;
    public int d = 8;

    /* renamed from: e  reason: collision with root package name */
    public int[] f13485e = new int[8];
    public int[] f = new int[8];

    /* renamed from: g  reason: collision with root package name */
    public float[] f13486g = new float[8];

    /* renamed from: h  reason: collision with root package name */
    public int f13487h = -1;

    /* renamed from: i  reason: collision with root package name */
    public int f13488i = -1;

    /* renamed from: j  reason: collision with root package name */
    public boolean f13489j = false;

    public C1120a(c cVar, C4.b bVar) {
        this.f13483b = cVar;
        this.f13484c = bVar;
    }

    @Override // s.InterfaceC1121b
    public final float a(int i7) {
        int i8 = this.f13487h;
        for (int i9 = 0; i8 != -1 && i9 < this.f13482a; i9++) {
            if (i9 == i7) {
                return this.f13486g[i8];
            }
            i8 = this.f[i8];
        }
        return 0.0f;
    }

    @Override // s.InterfaceC1121b
    public final float b(c cVar, boolean z7) {
        float e3 = e(cVar.f13490a);
        c(cVar.f13490a, z7);
        InterfaceC1121b interfaceC1121b = cVar.d;
        int k5 = interfaceC1121b.k();
        for (int i7 = 0; i7 < k5; i7++) {
            i d = interfaceC1121b.d(i7);
            h(d, interfaceC1121b.e(d) * e3, z7);
        }
        return e3;
    }

    @Override // s.InterfaceC1121b
    public final float c(i iVar, boolean z7) {
        int i7 = this.f13487h;
        if (i7 == -1) {
            return 0.0f;
        }
        int i8 = 0;
        int i9 = -1;
        while (i7 != -1 && i8 < this.f13482a) {
            if (this.f13485e[i7] == iVar.f13514b) {
                if (i7 == this.f13487h) {
                    this.f13487h = this.f[i7];
                } else {
                    int[] iArr = this.f;
                    iArr[i9] = iArr[i7];
                }
                if (z7) {
                    iVar.b(this.f13483b);
                }
                iVar.f13521k--;
                this.f13482a--;
                this.f13485e[i7] = -1;
                if (this.f13489j) {
                    this.f13488i = i7;
                }
                return this.f13486g[i7];
            }
            i8++;
            i9 = i7;
            i7 = this.f[i7];
        }
        return 0.0f;
    }

    @Override // s.InterfaceC1121b
    public final void clear() {
        int i7 = this.f13487h;
        for (int i8 = 0; i7 != -1 && i8 < this.f13482a; i8++) {
            i iVar = ((i[]) this.f13484c.f424u)[this.f13485e[i7]];
            if (iVar != null) {
                iVar.b(this.f13483b);
            }
            i7 = this.f[i7];
        }
        this.f13487h = -1;
        this.f13488i = -1;
        this.f13489j = false;
        this.f13482a = 0;
    }

    @Override // s.InterfaceC1121b
    public final i d(int i7) {
        int i8 = this.f13487h;
        for (int i9 = 0; i8 != -1 && i9 < this.f13482a; i9++) {
            if (i9 == i7) {
                return ((i[]) this.f13484c.f424u)[this.f13485e[i8]];
            }
            i8 = this.f[i8];
        }
        return null;
    }

    @Override // s.InterfaceC1121b
    public final float e(i iVar) {
        int i7 = this.f13487h;
        for (int i8 = 0; i7 != -1 && i8 < this.f13482a; i8++) {
            if (this.f13485e[i7] == iVar.f13514b) {
                return this.f13486g[i7];
            }
            i7 = this.f[i7];
        }
        return 0.0f;
    }

    @Override // s.InterfaceC1121b
    public final boolean f(i iVar) {
        int i7 = this.f13487h;
        if (i7 == -1) {
            return false;
        }
        for (int i8 = 0; i7 != -1 && i8 < this.f13482a; i8++) {
            if (this.f13485e[i7] == iVar.f13514b) {
                return true;
            }
            i7 = this.f[i7];
        }
        return false;
    }

    @Override // s.InterfaceC1121b
    public final void g(float f) {
        int i7 = this.f13487h;
        for (int i8 = 0; i7 != -1 && i8 < this.f13482a; i8++) {
            float[] fArr = this.f13486g;
            fArr[i7] = fArr[i7] / f;
            i7 = this.f[i7];
        }
    }

    @Override // s.InterfaceC1121b
    public final void h(i iVar, float f, boolean z7) {
        if (f > -0.001f && f < 0.001f) {
            return;
        }
        int i7 = this.f13487h;
        c cVar = this.f13483b;
        if (i7 == -1) {
            this.f13487h = 0;
            this.f13486g[0] = f;
            this.f13485e[0] = iVar.f13514b;
            this.f[0] = -1;
            iVar.f13521k++;
            iVar.a(cVar);
            this.f13482a++;
            if (!this.f13489j) {
                int i8 = this.f13488i + 1;
                this.f13488i = i8;
                int[] iArr = this.f13485e;
                if (i8 >= iArr.length) {
                    this.f13489j = true;
                    this.f13488i = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i9 = -1;
        for (int i10 = 0; i7 != -1 && i10 < this.f13482a; i10++) {
            int i11 = this.f13485e[i7];
            int i12 = iVar.f13514b;
            if (i11 == i12) {
                float[] fArr = this.f13486g;
                float f7 = fArr[i7] + f;
                if (f7 > -0.001f && f7 < 0.001f) {
                    f7 = 0.0f;
                }
                fArr[i7] = f7;
                if (f7 == 0.0f) {
                    if (i7 == this.f13487h) {
                        this.f13487h = this.f[i7];
                    } else {
                        int[] iArr2 = this.f;
                        iArr2[i9] = iArr2[i7];
                    }
                    if (z7) {
                        iVar.b(cVar);
                    }
                    if (this.f13489j) {
                        this.f13488i = i7;
                    }
                    iVar.f13521k--;
                    this.f13482a--;
                    return;
                }
                return;
            }
            if (i11 < i12) {
                i9 = i7;
            }
            i7 = this.f[i7];
        }
        int i13 = this.f13488i;
        int i14 = i13 + 1;
        if (this.f13489j) {
            int[] iArr3 = this.f13485e;
            if (iArr3[i13] != -1) {
                i13 = iArr3.length;
            }
        } else {
            i13 = i14;
        }
        int[] iArr4 = this.f13485e;
        if (i13 >= iArr4.length && this.f13482a < iArr4.length) {
            int i15 = 0;
            while (true) {
                int[] iArr5 = this.f13485e;
                if (i15 >= iArr5.length) {
                    break;
                } else if (iArr5[i15] == -1) {
                    i13 = i15;
                    break;
                } else {
                    i15++;
                }
            }
        }
        int[] iArr6 = this.f13485e;
        if (i13 >= iArr6.length) {
            i13 = iArr6.length;
            int i16 = this.d * 2;
            this.d = i16;
            this.f13489j = false;
            this.f13488i = i13 - 1;
            this.f13486g = Arrays.copyOf(this.f13486g, i16);
            this.f13485e = Arrays.copyOf(this.f13485e, this.d);
            this.f = Arrays.copyOf(this.f, this.d);
        }
        this.f13485e[i13] = iVar.f13514b;
        this.f13486g[i13] = f;
        int[] iArr7 = this.f;
        if (i9 != -1) {
            iArr7[i13] = iArr7[i9];
            iArr7[i9] = i13;
        } else {
            iArr7[i13] = this.f13487h;
            this.f13487h = i13;
        }
        iVar.f13521k++;
        iVar.a(cVar);
        this.f13482a++;
        if (!this.f13489j) {
            this.f13488i++;
        }
        int i17 = this.f13488i;
        int[] iArr8 = this.f13485e;
        if (i17 >= iArr8.length) {
            this.f13489j = true;
            this.f13488i = iArr8.length - 1;
        }
    }

    @Override // s.InterfaceC1121b
    public final void i(i iVar, float f) {
        if (f == 0.0f) {
            c(iVar, true);
            return;
        }
        int i7 = this.f13487h;
        c cVar = this.f13483b;
        if (i7 == -1) {
            this.f13487h = 0;
            this.f13486g[0] = f;
            this.f13485e[0] = iVar.f13514b;
            this.f[0] = -1;
            iVar.f13521k++;
            iVar.a(cVar);
            this.f13482a++;
            if (!this.f13489j) {
                int i8 = this.f13488i + 1;
                this.f13488i = i8;
                int[] iArr = this.f13485e;
                if (i8 >= iArr.length) {
                    this.f13489j = true;
                    this.f13488i = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i9 = -1;
        for (int i10 = 0; i7 != -1 && i10 < this.f13482a; i10++) {
            int i11 = this.f13485e[i7];
            int i12 = iVar.f13514b;
            if (i11 == i12) {
                this.f13486g[i7] = f;
                return;
            }
            if (i11 < i12) {
                i9 = i7;
            }
            i7 = this.f[i7];
        }
        int i13 = this.f13488i;
        int i14 = i13 + 1;
        if (this.f13489j) {
            int[] iArr2 = this.f13485e;
            if (iArr2[i13] != -1) {
                i13 = iArr2.length;
            }
        } else {
            i13 = i14;
        }
        int[] iArr3 = this.f13485e;
        if (i13 >= iArr3.length && this.f13482a < iArr3.length) {
            int i15 = 0;
            while (true) {
                int[] iArr4 = this.f13485e;
                if (i15 >= iArr4.length) {
                    break;
                } else if (iArr4[i15] == -1) {
                    i13 = i15;
                    break;
                } else {
                    i15++;
                }
            }
        }
        int[] iArr5 = this.f13485e;
        if (i13 >= iArr5.length) {
            i13 = iArr5.length;
            int i16 = this.d * 2;
            this.d = i16;
            this.f13489j = false;
            this.f13488i = i13 - 1;
            this.f13486g = Arrays.copyOf(this.f13486g, i16);
            this.f13485e = Arrays.copyOf(this.f13485e, this.d);
            this.f = Arrays.copyOf(this.f, this.d);
        }
        this.f13485e[i13] = iVar.f13514b;
        this.f13486g[i13] = f;
        int[] iArr6 = this.f;
        if (i9 != -1) {
            iArr6[i13] = iArr6[i9];
            iArr6[i9] = i13;
        } else {
            iArr6[i13] = this.f13487h;
            this.f13487h = i13;
        }
        iVar.f13521k++;
        iVar.a(cVar);
        int i17 = this.f13482a + 1;
        this.f13482a = i17;
        if (!this.f13489j) {
            this.f13488i++;
        }
        int[] iArr7 = this.f13485e;
        if (i17 >= iArr7.length) {
            this.f13489j = true;
        }
        if (this.f13488i >= iArr7.length) {
            this.f13489j = true;
            this.f13488i = iArr7.length - 1;
        }
    }

    @Override // s.InterfaceC1121b
    public final void j() {
        int i7 = this.f13487h;
        for (int i8 = 0; i7 != -1 && i8 < this.f13482a; i8++) {
            float[] fArr = this.f13486g;
            fArr[i7] = fArr[i7] * (-1.0f);
            i7 = this.f[i7];
        }
    }

    @Override // s.InterfaceC1121b
    public final int k() {
        return this.f13482a;
    }

    public final String toString() {
        int i7 = this.f13487h;
        String str = "";
        for (int i8 = 0; i7 != -1 && i8 < this.f13482a; i8++) {
            str = (AbstractC0515y1.m(str, " -> ") + this.f13486g[i7] + " : ") + ((i[]) this.f13484c.f424u)[this.f13485e[i7]];
            i7 = this.f[i7];
        }
        return str;
    }
}
