package w4;
/* renamed from: w4.c0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1410c0 {

    /* renamed from: a  reason: collision with root package name */
    public final C1412d0 f15980a;

    /* renamed from: b  reason: collision with root package name */
    public final C1416f0 f15981b;

    /* renamed from: c  reason: collision with root package name */
    public final C1414e0 f15982c;

    public C1410c0(C1412d0 c1412d0, C1416f0 c1416f0, C1414e0 c1414e0) {
        this.f15980a = c1412d0;
        this.f15981b = c1416f0;
        this.f15982c = c1414e0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1410c0)) {
            return false;
        }
        C1410c0 c1410c0 = (C1410c0) obj;
        if (this.f15980a.equals(c1410c0.f15980a) && this.f15981b.equals(c1410c0.f15981b) && this.f15982c.equals(c1410c0.f15982c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f15980a.hashCode() ^ 1000003) * 1000003) ^ this.f15981b.hashCode()) * 1000003) ^ this.f15982c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f15980a + ", osData=" + this.f15981b + ", deviceData=" + this.f15982c + "}";
    }
}
