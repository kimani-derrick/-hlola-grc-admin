package e2;
/* loaded from: classes.dex */
public final class L0 implements InterfaceC0604f {

    /* renamed from: r  reason: collision with root package name */
    public static final L0 f9700r;

    /* renamed from: q  reason: collision with root package name */
    public final O3.E f9701q;

    static {
        O3.C c5 = O3.E.f2597r;
        f9700r = new L0(O3.U.f2621u);
        int i7 = Z2.H.f4603a;
        Integer.toString(0, 36);
    }

    public L0(O3.E e3) {
        this.f9701q = O3.E.s(e3);
    }

    public final O3.E a() {
        return this.f9701q;
    }

    public final boolean b(int i7) {
        int i8 = 0;
        while (true) {
            O3.E e3 = this.f9701q;
            if (i8 >= e3.size()) {
                return false;
            }
            K0 k02 = (K0) e3.get(i8);
            if (k02.b() && k02.a() == i7) {
                return true;
            }
            i8++;
        }
    }

    public final boolean c() {
        int i7 = 0;
        while (true) {
            O3.E e3 = this.f9701q;
            if (i7 >= e3.size()) {
                return false;
            }
            if (((K0) e3.get(i7)).a() == 2 && ((K0) e3.get(i7)).c()) {
                return true;
            }
            i7++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && L0.class == obj.getClass()) {
            return this.f9701q.equals(((L0) obj).f9701q);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9701q.hashCode();
    }
}
