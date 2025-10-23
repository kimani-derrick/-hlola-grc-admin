package o6;
/* loaded from: classes.dex */
public final class E {

    /* renamed from: a  reason: collision with root package name */
    public int f12982a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f12983b = new int[10];

    public final int a() {
        if ((this.f12982a & 128) != 0) {
            return this.f12983b[7];
        }
        return 65535;
    }

    public final void b(E e3) {
        M5.g.f(e3, "other");
        int i7 = 0;
        while (i7 < 10) {
            int i8 = i7 + 1;
            boolean z7 = true;
            if (((1 << i7) & e3.f12982a) == 0) {
                z7 = false;
            }
            if (z7) {
                c(i7, e3.f12983b[i7]);
            }
            i7 = i8;
        }
    }

    public final void c(int i7, int i8) {
        if (i7 >= 0) {
            int[] iArr = this.f12983b;
            if (i7 < iArr.length) {
                this.f12982a = (1 << i7) | this.f12982a;
                iArr[i7] = i8;
            }
        }
    }
}
