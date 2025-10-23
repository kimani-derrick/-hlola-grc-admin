package h5;
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public int f11059a;

    /* renamed from: b  reason: collision with root package name */
    public int f11060b;

    /* renamed from: c  reason: collision with root package name */
    public int f11061c;
    public int d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f11059a == jVar.f11059a && this.f11060b == jVar.f11060b && this.f11061c == jVar.f11061c && this.d == jVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f11059a * 31) + this.f11060b) * 31) + this.f11061c) * 31) + this.d;
    }

    public final String toString() {
        return "ViewBounds(left=" + this.f11059a + ", top=" + this.f11060b + ", right=" + this.f11061c + ", bottom=" + this.d + ", height=" + (this.d - this.f11060b) + ", width=" + (this.f11061c - this.f11059a) + ')';
    }
}
