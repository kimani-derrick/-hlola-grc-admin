package androidx.datastore.preferences.protobuf;

import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.io.Serializable;
import java.util.Iterator;
import r0.AbstractC1111a;
/* renamed from: androidx.datastore.preferences.protobuf.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0228g implements Iterable, Serializable {

    /* renamed from: s  reason: collision with root package name */
    public static final C0228g f5760s = new C0228g(AbstractC0246z.f5828b);

    /* renamed from: t  reason: collision with root package name */
    public static final C0227f f5761t;

    /* renamed from: q  reason: collision with root package name */
    public int f5762q = 0;

    /* renamed from: r  reason: collision with root package name */
    public final byte[] f5763r;

    static {
        C0227f c0227f;
        if (AbstractC0224c.a()) {
            c0227f = new C0227f(1);
        } else {
            c0227f = new C0227f(0);
        }
        f5761t = c0227f;
    }

    public C0228g(byte[] bArr) {
        bArr.getClass();
        this.f5763r = bArr;
    }

    public static int c(int i7, int i8, int i9) {
        int i10 = i8 - i7;
        if ((i7 | i8 | i10 | (i9 - i8)) < 0) {
            if (i7 >= 0) {
                if (i8 < i7) {
                    throw new IndexOutOfBoundsException(AbstractC1111a.m(i7, i8, "Beginning index larger than ending index: ", ", "));
                }
                throw new IndexOutOfBoundsException(AbstractC1111a.m(i8, i9, "End index: ", " >= "));
            }
            throw new IndexOutOfBoundsException(AbstractC1111a.n(i7, "Beginning index: ", " < 0"));
        }
        return i10;
    }

    public static C0228g f(byte[] bArr, int i7, int i8) {
        c(i7, i7 + i8, bArr.length);
        return new C0228g(f5761t.a(bArr, i7, i8));
    }

    public byte b(int i7) {
        return this.f5763r[i7];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0228g) || size() != ((C0228g) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof C0228g) {
            C0228g c0228g = (C0228g) obj;
            int i7 = this.f5762q;
            int i8 = c0228g.f5762q;
            if (i7 != 0 && i8 != 0 && i7 != i8) {
                return false;
            }
            int size = size();
            if (size <= c0228g.size()) {
                if (size <= c0228g.size()) {
                    int g7 = g() + size;
                    int g8 = g();
                    int g9 = c0228g.g();
                    while (g8 < g7) {
                        if (this.f5763r[g8] != c0228g.f5763r[g9]) {
                            return false;
                        }
                        g8++;
                        g9++;
                    }
                    return true;
                }
                StringBuilder o7 = AbstractC0515y1.o(size, "Ran off end of other: 0, ", ", ");
                o7.append(c0228g.size());
                throw new IllegalArgumentException(o7.toString());
            }
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        return obj.equals(this);
    }

    public int g() {
        return 0;
    }

    public byte h(int i7) {
        return this.f5763r[i7];
    }

    public final int hashCode() {
        int i7 = this.f5762q;
        if (i7 == 0) {
            int size = size();
            int g7 = g();
            int i8 = size;
            for (int i9 = g7; i9 < g7 + size; i9++) {
                i8 = (i8 * 31) + this.f5763r[i9];
            }
            if (i8 == 0) {
                i7 = 1;
            } else {
                i7 = i8;
            }
            this.f5762q = i7;
        }
        return i7;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0226e(this);
    }

    public int size() {
        return this.f5763r.length;
    }

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }
}
