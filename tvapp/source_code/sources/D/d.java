package D;

import android.graphics.Insets;
/* loaded from: classes.dex */
public final class d {

    /* renamed from: e  reason: collision with root package name */
    public static final d f428e = new d(0, 0, 0, 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f429a;

    /* renamed from: b  reason: collision with root package name */
    public final int f430b;

    /* renamed from: c  reason: collision with root package name */
    public final int f431c;
    public final int d;

    public d(int i7, int i8, int i9, int i10) {
        this.f429a = i7;
        this.f430b = i8;
        this.f431c = i9;
        this.d = i10;
    }

    public static d a(int i7, int i8, int i9, int i10) {
        if (i7 == 0 && i8 == 0 && i9 == 0 && i10 == 0) {
            return f428e;
        }
        return new d(i7, i8, i9, i10);
    }

    public static d b(Insets insets) {
        int i7;
        int i8;
        int i9;
        int i10;
        i7 = insets.left;
        i8 = insets.top;
        i9 = insets.right;
        i10 = insets.bottom;
        return a(i7, i8, i9, i10);
    }

    public final Insets c() {
        return c.a(this.f429a, this.f430b, this.f431c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.d == dVar.d && this.f429a == dVar.f429a && this.f431c == dVar.f431c && this.f430b == dVar.f430b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f429a * 31) + this.f430b) * 31) + this.f431c) * 31) + this.d;
    }

    public final String toString() {
        return "Insets{left=" + this.f429a + ", top=" + this.f430b + ", right=" + this.f431c + ", bottom=" + this.d + '}';
    }
}
