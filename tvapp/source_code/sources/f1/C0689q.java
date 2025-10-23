package f1;

import W5.InterfaceC0116x;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import e1.InterfaceC0567a;
import java.util.List;
import k3.AbstractC0958a;
import w4.l0;
import z5.C1530l;
/* renamed from: f1.q  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0689q extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public int f10302u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ C0694v f10303v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ int f10304w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ List f10305x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0689q(C0694v c0694v, int i7, List list, D5.d dVar) {
        super(2, dVar);
        this.f10303v = c0694v;
        this.f10304w = i7;
        this.f10305x = list;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new C0689q(this.f10303v, this.f10304w, this.f10305x, dVar);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((C0689q) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        E5.a aVar = E5.a.f612q;
        int i7 = this.f10302u;
        if (i7 != 0) {
            if (i7 == 1) {
                AbstractC0958a.H(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0958a.H(obj);
            C0694v c0694v = this.f10303v;
            InterfaceC0567a b7 = c0694v.f10322a.b();
            String m7 = AbstractC0515y1.m(l0.s(c0694v.f10323b), g6.o.f10858a.M());
            this.f10302u = 1;
            obj = b7.c(m7, this.f10304w, this.f10305x, 20, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return new Y0.b(obj);
    }
}
