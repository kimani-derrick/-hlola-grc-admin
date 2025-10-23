package v6;
/* loaded from: classes.dex */
public final class A {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f15354a;

    /* renamed from: b  reason: collision with root package name */
    public int f15355b;

    /* renamed from: c  reason: collision with root package name */
    public int f15356c;
    public boolean d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f15357e;
    public A f;

    /* renamed from: g  reason: collision with root package name */
    public A f15358g;

    public A() {
        this.f15354a = new byte[8192];
        this.f15357e = true;
        this.d = false;
    }

    public final A a() {
        A a7 = this.f;
        if (a7 == this) {
            a7 = null;
        }
        A a8 = this.f15358g;
        M5.g.c(a8);
        a8.f = this.f;
        A a9 = this.f;
        M5.g.c(a9);
        a9.f15358g = this.f15358g;
        this.f = null;
        this.f15358g = null;
        return a7;
    }

    public final void b(A a7) {
        a7.f15358g = this;
        a7.f = this.f;
        A a8 = this.f;
        M5.g.c(a8);
        a8.f15358g = a7;
        this.f = a7;
    }

    public final A c() {
        this.d = true;
        return new A(this.f15354a, this.f15355b, this.f15356c, true);
    }

    public final void d(A a7, int i7) {
        if (a7.f15357e) {
            int i8 = a7.f15356c;
            int i9 = i8 + i7;
            byte[] bArr = a7.f15354a;
            if (i9 > 8192) {
                if (!a7.d) {
                    int i10 = a7.f15355b;
                    if (i9 - i10 <= 8192) {
                        A5.j.O(0, i10, i8, bArr, bArr);
                        a7.f15356c -= a7.f15355b;
                        a7.f15355b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            int i11 = a7.f15356c;
            int i12 = this.f15355b;
            A5.j.O(i11, i12, i12 + i7, this.f15354a, bArr);
            a7.f15356c += i7;
            this.f15355b += i7;
            return;
        }
        throw new IllegalStateException("only owner can write".toString());
    }

    public A(byte[] bArr, int i7, int i8, boolean z7) {
        M5.g.f(bArr, "data");
        this.f15354a = bArr;
        this.f15355b = i7;
        this.f15356c = i8;
        this.d = z7;
        this.f15357e = false;
    }
}
