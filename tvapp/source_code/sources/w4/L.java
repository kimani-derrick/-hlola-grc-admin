package w4;

import z4.C1518b;
/* loaded from: classes.dex */
public final class L extends B0 {

    /* renamed from: a  reason: collision with root package name */
    public final long f15918a;

    /* renamed from: b  reason: collision with root package name */
    public final String f15919b;

    /* renamed from: c  reason: collision with root package name */
    public final v0 f15920c;
    public final w0 d;

    /* renamed from: e  reason: collision with root package name */
    public final x0 f15921e;
    public final A0 f;

    public L(long j7, String str, v0 v0Var, w0 w0Var, x0 x0Var, A0 a02) {
        this.f15918a = j7;
        this.f15919b = str;
        this.f15920c = v0Var;
        this.d = w0Var;
        this.f15921e = x0Var;
        this.f = a02;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [z4.b, java.lang.Object] */
    public final C1518b a() {
        ?? obj = new Object();
        obj.f16461a = Long.valueOf(this.f15918a);
        obj.f16462b = this.f15919b;
        obj.f16463c = this.f15920c;
        obj.d = this.d;
        obj.f16464e = this.f15921e;
        obj.f = this.f;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B0)) {
            return false;
        }
        B0 b02 = (B0) obj;
        if (this.f15918a == ((L) b02).f15918a) {
            L l7 = (L) b02;
            if (this.f15919b.equals(l7.f15919b) && this.f15920c.equals(l7.f15920c) && this.d.equals(l7.d)) {
                x0 x0Var = l7.f15921e;
                x0 x0Var2 = this.f15921e;
                if (x0Var2 != null ? x0Var2.equals(x0Var) : x0Var == null) {
                    A0 a02 = l7.f;
                    A0 a03 = this.f;
                    if (a03 == null) {
                        if (a02 == null) {
                            return true;
                        }
                    } else if (a03.equals(a02)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j7 = this.f15918a;
        int hashCode2 = (((((((((int) ((j7 >>> 32) ^ j7)) ^ 1000003) * 1000003) ^ this.f15919b.hashCode()) * 1000003) ^ this.f15920c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        int i7 = 0;
        x0 x0Var = this.f15921e;
        if (x0Var == null) {
            hashCode = 0;
        } else {
            hashCode = x0Var.hashCode();
        }
        int i8 = (hashCode2 ^ hashCode) * 1000003;
        A0 a02 = this.f;
        if (a02 != null) {
            i7 = a02.hashCode();
        }
        return i8 ^ i7;
    }

    public final String toString() {
        return "Event{timestamp=" + this.f15918a + ", type=" + this.f15919b + ", app=" + this.f15920c + ", device=" + this.d + ", log=" + this.f15921e + ", rollouts=" + this.f + "}";
    }
}
