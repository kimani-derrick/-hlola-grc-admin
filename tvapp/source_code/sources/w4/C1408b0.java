package w4;

import r0.AbstractC1111a;
/* renamed from: w4.b0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1408b0 extends D0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f15976a;

    public C1408b0(String str) {
        this.f15976a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof D0) {
            return this.f15976a.equals(((C1408b0) ((D0) obj)).f15976a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15976a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return AbstractC1111a.t(new StringBuilder("User{identifier="), this.f15976a, "}");
    }
}
