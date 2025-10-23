package e2;

import a.AbstractC0189a;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class u0 implements InterfaceC0604f {

    /* renamed from: q  reason: collision with root package name */
    public final Object f10075q;

    /* renamed from: r  reason: collision with root package name */
    public final int f10076r;

    /* renamed from: s  reason: collision with root package name */
    public final Z f10077s;

    /* renamed from: t  reason: collision with root package name */
    public final Object f10078t;

    /* renamed from: u  reason: collision with root package name */
    public final int f10079u;

    /* renamed from: v  reason: collision with root package name */
    public final long f10080v;

    /* renamed from: w  reason: collision with root package name */
    public final long f10081w;

    /* renamed from: x  reason: collision with root package name */
    public final int f10082x;

    /* renamed from: y  reason: collision with root package name */
    public final int f10083y;

    static {
        int i7 = Z2.H.f4603a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
    }

    public u0(Object obj, int i7, Z z7, Object obj2, int i8, long j7, long j8, int i9, int i10) {
        this.f10075q = obj;
        this.f10076r = i7;
        this.f10077s = z7;
        this.f10078t = obj2;
        this.f10079u = i8;
        this.f10080v = j7;
        this.f10081w = j8;
        this.f10082x = i9;
        this.f10083y = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u0.class != obj.getClass()) {
            return false;
        }
        u0 u0Var = (u0) obj;
        if (this.f10076r == u0Var.f10076r && this.f10079u == u0Var.f10079u && this.f10080v == u0Var.f10080v && this.f10081w == u0Var.f10081w && this.f10082x == u0Var.f10082x && this.f10083y == u0Var.f10083y && AbstractC0189a.r(this.f10075q, u0Var.f10075q) && AbstractC0189a.r(this.f10078t, u0Var.f10078t) && AbstractC0189a.r(this.f10077s, u0Var.f10077s)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f10075q, Integer.valueOf(this.f10076r), this.f10077s, this.f10078t, Integer.valueOf(this.f10079u), Long.valueOf(this.f10080v), Long.valueOf(this.f10081w), Integer.valueOf(this.f10082x), Integer.valueOf(this.f10083y)});
    }
}
