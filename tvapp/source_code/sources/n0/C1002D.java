package n0;
/* renamed from: n0.D  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1002D {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f12486a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f12487b;

    /* renamed from: c  reason: collision with root package name */
    public final int f12488c;
    public final boolean d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f12489e;
    public final int f;

    /* renamed from: g  reason: collision with root package name */
    public final int f12490g;

    /* renamed from: h  reason: collision with root package name */
    public final int f12491h;

    /* renamed from: i  reason: collision with root package name */
    public final int f12492i;

    public C1002D(boolean z7, boolean z8, int i7, boolean z9, boolean z10, int i8, int i9, int i10, int i11) {
        this.f12486a = z7;
        this.f12487b = z8;
        this.f12488c = i7;
        this.d = z9;
        this.f12489e = z10;
        this.f = i8;
        this.f12490g = i9;
        this.f12491h = i10;
        this.f12492i = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !M5.g.a(C1002D.class, obj.getClass())) {
            return false;
        }
        C1002D c1002d = (C1002D) obj;
        if (this.f12486a == c1002d.f12486a && this.f12487b == c1002d.f12487b && this.f12488c == c1002d.f12488c) {
            c1002d.getClass();
            if (M5.g.a(null, null) && this.d == c1002d.d && this.f12489e == c1002d.f12489e && this.f == c1002d.f && this.f12490g == c1002d.f12490g && this.f12491h == c1002d.f12491h && this.f12492i == c1002d.f12492i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.f12486a ? 1 : 0) * 31) + (this.f12487b ? 1 : 0)) * 31) + this.f12488c) * 31) + 0) * 31) + (this.d ? 1 : 0)) * 31) + (this.f12489e ? 1 : 0)) * 31) + this.f) * 31) + this.f12490g) * 31) + this.f12491h) * 31) + this.f12492i;
    }
}
