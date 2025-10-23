package s3;

import com.google.android.gms.internal.measurement.C0471p1;
import com.google.android.gms.internal.measurement.C0497u3;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.C1049b;
import o.C1052e;
/* loaded from: classes.dex */
public final class z1 {

    /* renamed from: a  reason: collision with root package name */
    public final String f14416a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f14417b;

    /* renamed from: c  reason: collision with root package name */
    public final C0471p1 f14418c;
    public final BitSet d;

    /* renamed from: e  reason: collision with root package name */
    public final BitSet f14419e;
    public final Map f;

    /* renamed from: g  reason: collision with root package name */
    public final C1052e f14420g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ y1 f14421h;

    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.Map, o.j] */
    /* JADX WARN: Type inference failed for: r1v5, types: [o.e, o.j] */
    public z1(y1 y1Var, String str) {
        this.f14421h = y1Var;
        this.f14416a = str;
        this.f14417b = true;
        this.d = new BitSet();
        this.f14419e = new BitSet();
        this.f = new o.j(0);
        this.f14420g = new o.j(0);
    }

    public final void a(C1166c c1166c) {
        int a7 = c1166c.a();
        Boolean bool = c1166c.f13973a;
        if (bool != null) {
            this.f14419e.set(a7, bool.booleanValue());
        }
        Boolean bool2 = c1166c.f13974b;
        if (bool2 != null) {
            this.d.set(a7, bool2.booleanValue());
        }
        if (c1166c.f13975c != null) {
            Integer valueOf = Integer.valueOf(a7);
            Map map = this.f;
            Long l7 = (Long) map.get(valueOf);
            long longValue = c1166c.f13975c.longValue() / 1000;
            if (l7 == null || longValue > l7.longValue()) {
                map.put(Integer.valueOf(a7), Long.valueOf(longValue));
            }
        }
        if (c1166c.d != null) {
            C1052e c1052e = this.f14420g;
            List list = (List) c1052e.get(Integer.valueOf(a7));
            if (list == null) {
                list = new ArrayList();
                c1052e.put(Integer.valueOf(a7), list);
            }
            if (c1166c.g()) {
                list.clear();
            }
            C0497u3.a();
            y1 y1Var = this.f14421h;
            C1170e c1170e = ((C1175g0) y1Var.f2765q).f14062w;
            C1148C c1148c = AbstractC1203v.f14328j0;
            String str = this.f14416a;
            if (c1170e.O(str, c1148c) && c1166c.f()) {
                list.clear();
            }
            C0497u3.a();
            boolean O5 = ((C1175g0) y1Var.f2765q).f14062w.O(str, c1148c);
            Long l8 = c1166c.d;
            if (O5) {
                long longValue2 = l8.longValue() / 1000;
                if (!list.contains(Long.valueOf(longValue2))) {
                    list.add(Long.valueOf(longValue2));
                    return;
                }
                return;
            }
            list.add(Long.valueOf(l8.longValue() / 1000));
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [o.e, o.j] */
    public z1(y1 y1Var, String str, C0471p1 c0471p1, BitSet bitSet, BitSet bitSet2, C1052e c1052e, C1052e c1052e2) {
        this.f14421h = y1Var;
        this.f14416a = str;
        this.d = bitSet;
        this.f14419e = bitSet2;
        this.f = c1052e;
        this.f14420g = new o.j(0);
        Iterator it = ((C1049b) c1052e2.keySet()).iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) c1052e2.get(num));
            this.f14420g.put(num, arrayList);
        }
        this.f14417b = false;
        this.f14418c = c0471p1;
    }
}
