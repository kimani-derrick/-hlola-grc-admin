package S0;

import A5.u;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import z5.C1524f;
/* loaded from: classes.dex */
public final class m implements Iterable, N5.a {

    /* renamed from: r  reason: collision with root package name */
    public static final m f3055r = new m(u.f136q);

    /* renamed from: q  reason: collision with root package name */
    public final Map f3056q;

    public m(Map map) {
        this.f3056q = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            if (M5.g.a(this.f3056q, ((m) obj).f3056q)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f3056q.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Map map = this.f3056q;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            AbstractC0515y1.v(entry.getValue());
            arrayList.add(new C1524f((String) entry.getKey(), null));
        }
        return arrayList.iterator();
    }

    public final String toString() {
        return "Parameters(entries=" + this.f3056q + ')';
    }
}
