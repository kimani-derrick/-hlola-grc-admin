package f1;

import W5.InterfaceC0116x;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import e1.InterfaceC0567a;
import java.util.List;
import k3.AbstractC0958a;
import w4.l0;
import z5.C1530l;
/* renamed from: f1.L  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0671L extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public int f10234u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ C0672M f10235v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ List f10236w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0671L(C0672M c0672m, List list, D5.d dVar) {
        super(2, dVar);
        this.f10235v = c0672m;
        this.f10236w = list;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new C0671L(this.f10235v, this.f10236w, dVar);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((C0671L) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        E5.a aVar = E5.a.f612q;
        int i7 = this.f10234u;
        if (i7 != 0) {
            if (i7 == 1) {
                AbstractC0958a.H(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0958a.H(obj);
            C0672M c0672m = this.f10235v;
            InterfaceC0567a b7 = c0672m.f10237a.b();
            String m7 = AbstractC0515y1.m(l0.s(c0672m.f10238b), g6.o.f10858a.U());
            this.f10234u = 1;
            obj = b7.h(m7, this.f10236w, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return new Y0.b(obj);
    }
}
