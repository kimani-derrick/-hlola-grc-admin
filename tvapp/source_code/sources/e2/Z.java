package e2;

import a4.C0214f;
import java.util.Collections;
/* loaded from: classes.dex */
public final class Z implements InterfaceC0604f {

    /* renamed from: A  reason: collision with root package name */
    public static final String f9796A;

    /* renamed from: B  reason: collision with root package name */
    public static final String f9797B;

    /* renamed from: C  reason: collision with root package name */
    public static final String f9798C;

    /* renamed from: D  reason: collision with root package name */
    public static final C0214f f9799D;

    /* renamed from: w  reason: collision with root package name */
    public static final Z f9800w;

    /* renamed from: x  reason: collision with root package name */
    public static final String f9801x;

    /* renamed from: y  reason: collision with root package name */
    public static final String f9802y;

    /* renamed from: z  reason: collision with root package name */
    public static final String f9803z;

    /* renamed from: q  reason: collision with root package name */
    public final String f9804q;

    /* renamed from: r  reason: collision with root package name */
    public final U f9805r;

    /* renamed from: s  reason: collision with root package name */
    public final T f9806s;

    /* renamed from: t  reason: collision with root package name */
    public final C0597b0 f9807t;

    /* renamed from: u  reason: collision with root package name */
    public final P f9808u;

    /* renamed from: v  reason: collision with root package name */
    public final V f9809v;

    /* JADX WARN: Type inference failed for: r4v0, types: [e2.O, e2.P] */
    static {
        N n = new N();
        O3.C c5 = O3.E.f2597r;
        O3.U u7 = O3.U.f2621u;
        Collections.emptyList();
        O3.U u8 = O3.U.f2621u;
        f9800w = new Z("", new O(n), null, new T(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), C0597b0.f9850Y, V.f9769s);
        int i7 = Z2.H.f4603a;
        f9801x = Integer.toString(0, 36);
        f9802y = Integer.toString(1, 36);
        f9803z = Integer.toString(2, 36);
        f9796A = Integer.toString(3, 36);
        f9797B = Integer.toString(4, 36);
        f9798C = Integer.toString(5, 36);
        f9799D = new C0214f(8);
    }

    public Z(String str, P p3, U u7, T t5, C0597b0 c0597b0, V v5) {
        this.f9804q = str;
        this.f9805r = u7;
        this.f9806s = t5;
        this.f9807t = c0597b0;
        this.f9808u = p3;
        this.f9809v = v5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Z)) {
            return false;
        }
        Z z7 = (Z) obj;
        if (Z2.H.a(this.f9804q, z7.f9804q) && this.f9808u.equals(z7.f9808u) && Z2.H.a(this.f9805r, z7.f9805r) && Z2.H.a(this.f9806s, z7.f9806s) && Z2.H.a(this.f9807t, z7.f9807t) && Z2.H.a(this.f9809v, z7.f9809v)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int hashCode = this.f9804q.hashCode() * 31;
        U u7 = this.f9805r;
        if (u7 != null) {
            i7 = u7.hashCode();
        } else {
            i7 = 0;
        }
        int hashCode2 = this.f9806s.hashCode();
        int hashCode3 = this.f9808u.hashCode();
        int hashCode4 = this.f9807t.hashCode();
        return this.f9809v.hashCode() + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + i7) * 31)) * 31)) * 31)) * 31);
    }
}
