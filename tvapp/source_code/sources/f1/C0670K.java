package f1;

import W5.InterfaceC0116x;
import android.os.CancellationSignal;
import b1.C0361h;
import b1.CallableC0360g;
import k3.AbstractC0958a;
import x0.AbstractC1448d;
import x0.C1458n;
import z5.C1530l;
/* renamed from: f1.K  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0670K extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public int f10231u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ String f10232v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ C0672M f10233w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0670K(String str, C0672M c0672m, D5.d dVar) {
        super(2, dVar);
        this.f10232v = str;
        this.f10233w = c0672m;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new C0670K(this.f10232v, this.f10233w, dVar);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((C0670K) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        E5.a aVar = E5.a.f612q;
        int i7 = this.f10231u;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 == 2) {
                    AbstractC0958a.H(obj);
                    return new Y0.b(obj);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0958a.H(obj);
            return new Y0.b(obj);
        }
        AbstractC0958a.H(obj);
        C0672M c0672m = this.f10233w;
        String str = this.f10232v;
        if (str != null) {
            C0361h c0361h = c0672m.f10239c;
            this.f10231u = 1;
            c0361h.getClass();
            C1458n a7 = C1458n.a("SELECT * FROM tbl_watch_list WHERE type = ?", 1);
            a7.C(str, 1);
            obj = AbstractC1448d.a(c0361h.f7059a, new CancellationSignal(), new CallableC0360g(c0361h, a7, 0), this);
            if (obj == aVar) {
                return aVar;
            }
            return new Y0.b(obj);
        }
        C0361h c0361h2 = c0672m.f10239c;
        this.f10231u = 2;
        c0361h2.getClass();
        C1458n a8 = C1458n.a("SELECT * FROM tbl_watch_list", 0);
        obj = AbstractC1448d.a(c0361h2.f7059a, new CancellationSignal(), new CallableC0360g(c0361h2, a8, 1), this);
        if (obj == aVar) {
            return aVar;
        }
        return new Y0.b(obj);
    }
}
