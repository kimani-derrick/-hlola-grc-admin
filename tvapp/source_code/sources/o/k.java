package o;

import java.util.Arrays;
import n0.C1015f;
import p.AbstractC1078a;
/* loaded from: classes.dex */
public final class k implements Cloneable {

    /* renamed from: q  reason: collision with root package name */
    public /* synthetic */ boolean f12810q;

    /* renamed from: r  reason: collision with root package name */
    public /* synthetic */ int[] f12811r;

    /* renamed from: s  reason: collision with root package name */
    public /* synthetic */ Object[] f12812s;

    /* renamed from: t  reason: collision with root package name */
    public /* synthetic */ int f12813t;

    public k() {
        this(0);
    }

    public final void b(int i7, Object obj) {
        int i8 = this.f12813t;
        if (i8 != 0 && i7 <= this.f12811r[i8 - 1]) {
            i(i7, obj);
            return;
        }
        if (this.f12810q && i8 >= this.f12811r.length) {
            h.a(this);
        }
        int i9 = this.f12813t;
        if (i9 >= this.f12811r.length) {
            int i10 = (i9 + 1) * 4;
            int i11 = 4;
            while (true) {
                if (i11 >= 32) {
                    break;
                }
                int i12 = (1 << i11) - 12;
                if (i10 <= i12) {
                    i10 = i12;
                    break;
                }
                i11++;
            }
            int i13 = i10 / 4;
            int[] copyOf = Arrays.copyOf(this.f12811r, i13);
            M5.g.e(copyOf, "copyOf(this, newSize)");
            this.f12811r = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f12812s, i13);
            M5.g.e(copyOf2, "copyOf(this, newSize)");
            this.f12812s = copyOf2;
        }
        this.f12811r[i9] = i7;
        this.f12812s[i9] = obj;
        this.f12813t = i9 + 1;
    }

    /* renamed from: c */
    public final k clone() {
        Object clone = super.clone();
        M5.g.d(clone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        k kVar = (k) clone;
        kVar.f12811r = (int[]) this.f12811r.clone();
        kVar.f12812s = (Object[]) this.f12812s.clone();
        return kVar;
    }

    public final boolean d(C1015f c1015f) {
        if (this.f12810q) {
            h.a(this);
        }
        int i7 = this.f12813t;
        for (int i8 = 0; i8 < i7; i8++) {
            if (this.f12812s[i8] == c1015f) {
                if (i8 < 0) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final Object e(int i7) {
        Object obj;
        int a7 = AbstractC1078a.a(this.f12813t, i7, this.f12811r);
        if (a7 < 0 || (obj = this.f12812s[a7]) == h.f12801b) {
            return null;
        }
        return obj;
    }

    public final int g(int i7) {
        if (this.f12810q) {
            h.a(this);
        }
        return this.f12811r[i7];
    }

    public final void i(int i7, Object obj) {
        int a7 = AbstractC1078a.a(this.f12813t, i7, this.f12811r);
        if (a7 >= 0) {
            this.f12812s[a7] = obj;
            return;
        }
        int i8 = ~a7;
        int i9 = this.f12813t;
        if (i8 < i9) {
            Object[] objArr = this.f12812s;
            if (objArr[i8] == h.f12801b) {
                this.f12811r[i8] = i7;
                objArr[i8] = obj;
                return;
            }
        }
        if (this.f12810q && i9 >= this.f12811r.length) {
            h.a(this);
            i8 = ~AbstractC1078a.a(this.f12813t, i7, this.f12811r);
        }
        int i10 = this.f12813t;
        if (i10 >= this.f12811r.length) {
            int i11 = (i10 + 1) * 4;
            int i12 = 4;
            while (true) {
                if (i12 >= 32) {
                    break;
                }
                int i13 = (1 << i12) - 12;
                if (i11 <= i13) {
                    i11 = i13;
                    break;
                }
                i12++;
            }
            int i14 = i11 / 4;
            int[] copyOf = Arrays.copyOf(this.f12811r, i14);
            M5.g.e(copyOf, "copyOf(this, newSize)");
            this.f12811r = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f12812s, i14);
            M5.g.e(copyOf2, "copyOf(this, newSize)");
            this.f12812s = copyOf2;
        }
        int i15 = this.f12813t;
        if (i15 - i8 != 0) {
            int[] iArr = this.f12811r;
            int i16 = i8 + 1;
            A5.j.P(i16, i8, i15, iArr, iArr);
            Object[] objArr2 = this.f12812s;
            A5.j.Q(i16, i8, this.f12813t, objArr2, objArr2);
        }
        this.f12811r[i8] = i7;
        this.f12812s[i8] = obj;
        this.f12813t++;
    }

    public final int k() {
        if (this.f12810q) {
            h.a(this);
        }
        return this.f12813t;
    }

    public final Object l(int i7) {
        if (this.f12810q) {
            h.a(this);
        }
        return this.f12812s[i7];
    }

    public final String toString() {
        if (k() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f12813t * 28);
        sb.append('{');
        int i7 = this.f12813t;
        for (int i8 = 0; i8 < i7; i8++) {
            if (i8 > 0) {
                sb.append(", ");
            }
            sb.append(g(i8));
            sb.append('=');
            Object l7 = l(i8);
            if (l7 != this) {
                sb.append(l7);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        M5.g.e(sb2, "buffer.toString()");
        return sb2;
    }

    public k(int i7) {
        int i8;
        int i9 = 4;
        while (true) {
            i8 = 40;
            if (i9 >= 32) {
                break;
            }
            int i10 = (1 << i9) - 12;
            if (40 <= i10) {
                i8 = i10;
                break;
            }
            i9++;
        }
        int i11 = i8 / 4;
        this.f12811r = new int[i11];
        this.f12812s = new Object[i11];
    }
}
