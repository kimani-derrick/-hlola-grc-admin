package z0;

import M5.g;
import U5.n;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final String f16394a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f16395b;

    /* renamed from: c  reason: collision with root package name */
    public final List f16396c;
    public final List d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList] */
    public d(String str, boolean z7, List list, List list2) {
        g.f(list, "columns");
        g.f(list2, "orders");
        this.f16394a = str;
        this.f16395b = z7;
        this.f16396c = list;
        this.d = list2;
        List list3 = list2;
        if (list3.isEmpty()) {
            int size = list.size();
            list3 = new ArrayList(size);
            for (int i7 = 0; i7 < size; i7++) {
                list3.add("ASC");
            }
        }
        this.d = (List) list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f16395b != dVar.f16395b || !g.a(this.f16396c, dVar.f16396c) || !g.a(this.d, dVar.d)) {
            return false;
        }
        String str = this.f16394a;
        boolean b02 = n.b0(str, "index_", false);
        String str2 = dVar.f16394a;
        if (b02) {
            return n.b0(str2, "index_", false);
        }
        return g.a(str, str2);
    }

    public final int hashCode() {
        int hashCode;
        String str = this.f16394a;
        if (n.b0(str, "index_", false)) {
            hashCode = -1184239155;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode2 = this.f16396c.hashCode();
        return this.d.hashCode() + ((hashCode2 + (((hashCode * 31) + (this.f16395b ? 1 : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "Index{name='" + this.f16394a + "', unique=" + this.f16395b + ", columns=" + this.f16396c + ", orders=" + this.d + "'}";
    }
}
