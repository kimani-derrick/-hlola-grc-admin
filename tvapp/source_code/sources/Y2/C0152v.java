package Y2;

import Z2.AbstractC0156a;
import a.AbstractC0189a;
import com.google.android.gms.internal.measurement.K1;
import java.util.Arrays;
import k2.C0939d;
import k2.C0943h;
import k2.InterfaceC0940e;
/* renamed from: Y2.v  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0152v implements InterfaceC0143l, InterfaceC0940e {

    /* renamed from: q  reason: collision with root package name */
    public int f4463q;

    /* renamed from: r  reason: collision with root package name */
    public int f4464r;

    /* renamed from: s  reason: collision with root package name */
    public Object f4465s;

    /* renamed from: t  reason: collision with root package name */
    public Object f4466t;

    public C0152v(int i7) {
        switch (i7) {
            case 1:
                this.f4465s = new long[10];
                this.f4466t = new Object[10];
                return;
            default:
                this.f4465s = new K1(24);
                this.f4463q = 8000;
                this.f4464r = 8000;
                return;
        }
    }

    public synchronized void a(long j7, Object obj) {
        int i7 = this.f4464r;
        if (i7 > 0) {
            if (j7 <= ((long[]) this.f4465s)[((this.f4463q + i7) - 1) % ((Object[]) this.f4466t).length]) {
                b();
            }
        }
        c();
        int i8 = this.f4463q;
        int i9 = this.f4464r;
        Object[] objArr = (Object[]) this.f4466t;
        int length = (i8 + i9) % objArr.length;
        ((long[]) this.f4465s)[length] = j7;
        objArr[length] = obj;
        this.f4464r = i9 + 1;
    }

    public synchronized void b() {
        this.f4463q = 0;
        this.f4464r = 0;
        Arrays.fill((Object[]) this.f4466t, (Object) null);
    }

    public void c() {
        int length = ((Object[]) this.f4466t).length;
        if (this.f4464r < length) {
            return;
        }
        int i7 = length * 2;
        long[] jArr = new long[i7];
        Object[] objArr = new Object[i7];
        int i8 = this.f4463q;
        int i9 = length - i8;
        System.arraycopy((long[]) this.f4465s, i8, jArr, 0, i9);
        System.arraycopy((Object[]) this.f4466t, this.f4463q, objArr, 0, i9);
        int i10 = this.f4463q;
        if (i10 > 0) {
            System.arraycopy((long[]) this.f4465s, 0, jArr, i9, i10);
            System.arraycopy((Object[]) this.f4466t, 0, objArr, i9, this.f4463q);
        }
        this.f4465s = jArr;
        this.f4466t = objArr;
        this.f4463q = 0;
    }

    public Object d(boolean z7, long j7) {
        Object obj = null;
        long j8 = Long.MAX_VALUE;
        while (this.f4464r > 0) {
            long j9 = j7 - ((long[]) this.f4465s)[this.f4463q];
            if (j9 < 0 && (z7 || (-j9) >= j8)) {
                break;
            }
            obj = g();
            j8 = j9;
        }
        return obj;
    }

    public synchronized Object e(long j7) {
        return d(true, j7);
    }

    @Override // Y2.InterfaceC0143l
    public InterfaceC0144m f() {
        return new C0155y((String) this.f4466t, this.f4463q, this.f4464r, (K1) this.f4465s);
    }

    public Object g() {
        boolean z7;
        if (this.f4464r > 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        AbstractC0156a.k(z7);
        Object[] objArr = (Object[]) this.f4466t;
        int i7 = this.f4463q;
        Object obj = objArr[i7];
        objArr[i7] = null;
        this.f4463q = (i7 + 1) % objArr.length;
        this.f4464r--;
        return obj;
    }

    @Override // k2.InterfaceC0940e
    public void h() {
        byte[] bArr = Z2.H.f;
        Z2.y yVar = (Z2.y) this.f4466t;
        yVar.getClass();
        yVar.D(bArr.length, bArr);
    }

    @Override // k2.InterfaceC0940e
    public C0939d j(C0943h c0943h, long j7) {
        long j8 = c0943h.f12166t;
        int min = (int) Math.min(this.f4464r, c0943h.f12165s - j8);
        Z2.y yVar = (Z2.y) this.f4466t;
        yVar.C(min);
        c0943h.i(yVar.f4691a, 0, min, false);
        int i7 = yVar.f4693c;
        long j9 = -1;
        long j10 = -1;
        long j11 = -9223372036854775807L;
        while (yVar.a() >= 188) {
            byte[] bArr = yVar.f4691a;
            int i8 = yVar.f4692b;
            while (i8 < i7 && bArr[i8] != 71) {
                i8++;
            }
            int i9 = i8 + 188;
            if (i9 > i7) {
                break;
            }
            long F = AbstractC0189a.F(yVar, i8, this.f4463q);
            if (F != -9223372036854775807L) {
                long b7 = ((Z2.E) this.f4465s).b(F);
                if (b7 > j7) {
                    if (j11 == -9223372036854775807L) {
                        return new C0939d(-1, b7, j8);
                    }
                    return new C0939d(0, -9223372036854775807L, j8 + j10);
                } else if (100000 + b7 > j7) {
                    return new C0939d(0, -9223372036854775807L, j8 + i8);
                } else {
                    j10 = i8;
                    j11 = b7;
                }
            }
            yVar.F(i9);
            j9 = i9;
        }
        if (j11 != -9223372036854775807L) {
            return new C0939d(-2, j11, j8 + j9);
        }
        return C0939d.d;
    }

    public C0152v(int i7, float[] fArr, float[] fArr2, int i8) {
        this.f4463q = i7;
        AbstractC0156a.f(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
        this.f4465s = fArr;
        this.f4466t = fArr2;
        this.f4464r = i8;
    }

    public C0152v(C0152v c0152v) {
        float[] fArr = (float[]) c0152v.f4465s;
        this.f4463q = fArr.length / 3;
        this.f4465s = AbstractC0156a.o(fArr);
        this.f4466t = AbstractC0156a.o((float[]) c0152v.f4466t);
        int i7 = c0152v.f4464r;
        this.f4464r = i7 != 1 ? i7 != 2 ? 4 : 6 : 5;
    }
}
