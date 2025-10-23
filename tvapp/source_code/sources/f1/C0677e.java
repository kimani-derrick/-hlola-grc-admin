package f1;

import W5.InterfaceC0116x;
import android.os.CancellationSignal;
import b1.C0361h;
import b1.CallableC0360g;
import k3.AbstractC0958a;
import x0.AbstractC1448d;
import x0.C1458n;
import z5.C1530l;
/* renamed from: f1.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0677e extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public int f10250u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ C0694v f10251v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ long f10252w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0677e(C0694v c0694v, long j7, D5.d dVar) {
        super(2, dVar);
        this.f10251v = c0694v;
        this.f10252w = j7;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new C0677e(this.f10251v, this.f10252w, dVar);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((C0677e) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        E5.a aVar = E5.a.f612q;
        int i7 = this.f10250u;
        boolean z7 = true;
        if (i7 != 0) {
            if (i7 == 1) {
                AbstractC0958a.H(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0958a.H(obj);
            C0361h c0361h = this.f10251v.f10324c;
            this.f10250u = 1;
            c0361h.getClass();
            C1458n a7 = C1458n.a("SELECT COUNT(id) FROM tbl_watch_list WHERE movie_id = ?", 1);
            a7.P(this.f10252w, 1);
            obj = AbstractC1448d.a(c0361h.f7059a, new CancellationSignal(), new CallableC0360g(c0361h, a7, 2), this);
            if (obj == aVar) {
                return aVar;
            }
        }
        if (((Number) obj).intValue() <= 0) {
            z7 = false;
        }
        return new Y0.b(Boolean.valueOf(z7));
    }
}
