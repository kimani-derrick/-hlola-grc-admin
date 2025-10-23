package Z2;
/* loaded from: classes.dex */
public final class z {

    /* renamed from: c  reason: collision with root package name */
    public static final z f4694c = new z(-1, -1);

    /* renamed from: a  reason: collision with root package name */
    public final int f4695a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4696b;

    static {
        new z(0, 0);
    }

    public z(int i7, int i8) {
        boolean z7;
        if ((i7 != -1 && i7 < 0) || (i8 != -1 && i8 < 0)) {
            z7 = false;
        } else {
            z7 = true;
        }
        AbstractC0156a.f(z7);
        this.f4695a = i7;
        this.f4696b = i8;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        if (this.f4695a != zVar.f4695a || this.f4696b != zVar.f4696b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i7 = this.f4695a;
        return ((i7 >>> 16) | (i7 << 16)) ^ this.f4696b;
    }

    public final String toString() {
        return this.f4695a + "x" + this.f4696b;
    }
}
