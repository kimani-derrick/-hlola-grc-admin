package R5;

import p6.l;
/* loaded from: classes.dex */
public class a implements Iterable, N5.a {

    /* renamed from: q  reason: collision with root package name */
    public final int f2922q;

    /* renamed from: r  reason: collision with root package name */
    public final int f2923r;

    /* renamed from: s  reason: collision with root package name */
    public final int f2924s;

    public a(int i7, int i8, int i9) {
        if (i9 != 0) {
            if (i9 != Integer.MIN_VALUE) {
                this.f2922q = i7;
                this.f2923r = l.w(i7, i8, i9);
                this.f2924s = i9;
                return;
            }
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    @Override // java.lang.Iterable
    /* renamed from: b */
    public final b iterator() {
        return new b(this.f2922q, this.f2923r, this.f2924s);
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            if (!isEmpty() || !((a) obj).isEmpty()) {
                a aVar = (a) obj;
                if (this.f2922q != aVar.f2922q || this.f2923r != aVar.f2923r || this.f2924s != aVar.f2924s) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f2922q * 31) + this.f2923r) * 31) + this.f2924s;
    }

    public boolean isEmpty() {
        int i7 = this.f2924s;
        int i8 = this.f2923r;
        int i9 = this.f2922q;
        if (i7 > 0) {
            if (i9 <= i8) {
                return false;
            }
        } else if (i9 >= i8) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb;
        int i7 = this.f2923r;
        int i8 = this.f2922q;
        int i9 = this.f2924s;
        if (i9 > 0) {
            sb = new StringBuilder();
            sb.append(i8);
            sb.append("..");
            sb.append(i7);
            sb.append(" step ");
            sb.append(i9);
        } else {
            sb = new StringBuilder();
            sb.append(i8);
            sb.append(" downTo ");
            sb.append(i7);
            sb.append(" step ");
            sb.append(-i9);
        }
        return sb.toString();
    }
}
