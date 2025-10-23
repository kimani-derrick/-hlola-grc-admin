package h6;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import w4.l0;
/* renamed from: h6.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0757g extends M5.h implements L5.a {

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ int f11143r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ C0758h f11144s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ Object f11145t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ Object f11146u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0757g(C0758h c0758h, Object obj, Object obj2, int i7) {
        super(0);
        this.f11143r = i7;
        this.f11144s = c0758h;
        this.f11145t = obj;
        this.f11146u = obj2;
    }

    @Override // L5.a
    public final Object b() {
        List d;
        switch (this.f11143r) {
            case 0:
                l0 l0Var = this.f11144s.f11149b;
                List list = (List) this.f11145t;
                if (l0Var == null) {
                    d = null;
                } else {
                    d = l0Var.d((String) this.f11146u, list);
                }
                if (d != null) {
                    list = d;
                }
                List<Certificate> list2 = list;
                ArrayList arrayList = new ArrayList(A5.m.P(list2));
                for (Certificate certificate : list2) {
                    arrayList.add((X509Certificate) certificate);
                }
                return arrayList;
            default:
                l0 l0Var2 = this.f11144s.f11149b;
                M5.g.c(l0Var2);
                return l0Var2.d(((C0751a) this.f11146u).f11124h.d, ((p) this.f11145t).a());
        }
    }
}
