package y6;

import M5.g;
import h6.C;
import h6.v;
import java.util.regex.Pattern;
import n5.k;
import n5.p;
import p6.l;
import v6.C1344i;
import x6.InterfaceC1480m;
/* loaded from: classes.dex */
public final class b implements InterfaceC1480m {

    /* renamed from: r  reason: collision with root package name */
    public static final v f16373r;

    /* renamed from: q  reason: collision with root package name */
    public final k f16374q;

    static {
        Pattern pattern = v.d;
        f16373r = l.r("application/json; charset=UTF-8");
    }

    public b(k kVar) {
        this.f16374q = kVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, v6.f] */
    @Override // x6.InterfaceC1480m
    public final Object o(Object obj) {
        ?? obj2 = new Object();
        this.f16374q.f(new p(obj2), obj);
        C1344i l7 = obj2.l(obj2.f15388r);
        g.f(l7, "content");
        return new C(f16373r, l7);
    }
}
