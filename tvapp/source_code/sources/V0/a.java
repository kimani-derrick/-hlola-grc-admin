package V0;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final float f3605a;

    /* renamed from: b  reason: collision with root package name */
    public final float f3606b;

    /* renamed from: c  reason: collision with root package name */
    public final float f3607c;
    public final float d;

    /* renamed from: e  reason: collision with root package name */
    public final String f3608e;

    public a(float f) {
        this.f3605a = f;
        this.f3606b = f;
        this.f3607c = f;
        this.d = f;
        int i7 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
        if (i7 >= 0 && i7 >= 0 && i7 >= 0 && i7 >= 0) {
            this.f3608e = a.class.getName() + '-' + f + ',' + f + ',' + f + ',' + f;
            return;
        }
        throw new IllegalArgumentException("All radii must be >= 0.".toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f3605a == aVar.f3605a && this.f3606b == aVar.f3606b && this.f3607c == aVar.f3607c && this.d == aVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int floatToIntBits = Float.floatToIntBits(this.f3606b);
        int floatToIntBits2 = Float.floatToIntBits(this.f3607c);
        return Float.floatToIntBits(this.d) + ((floatToIntBits2 + ((floatToIntBits + (Float.floatToIntBits(this.f3605a) * 31)) * 31)) * 31);
    }
}
