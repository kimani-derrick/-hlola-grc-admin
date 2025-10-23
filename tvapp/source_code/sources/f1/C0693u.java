package f1;

import W5.InterfaceC0116x;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import e1.InterfaceC0567a;
import java.util.LinkedHashMap;
import k3.AbstractC0958a;
import w4.l0;
import z5.C1524f;
import z5.C1530l;
/* renamed from: f1.u  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0693u extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public int f10317u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ int f10318v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ int f10319w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ String f10320x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ C0694v f10321y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0693u(int i7, int i8, D5.d dVar, C0694v c0694v, String str) {
        super(2, dVar);
        this.f10318v = i7;
        this.f10319w = i8;
        this.f10320x = str;
        this.f10321y = c0694v;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        String str = this.f10320x;
        return new C0693u(this.f10318v, this.f10319w, dVar, this.f10321y, str);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((C0693u) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        E5.a aVar = E5.a.f612q;
        int i7 = this.f10317u;
        if (i7 != 0) {
            if (i7 == 1) {
                AbstractC0958a.H(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0958a.H(obj);
            LinkedHashMap K6 = A5.w.K(new C1524f("page", String.valueOf(this.f10318v)), new C1524f("limit", String.valueOf(this.f10319w)), new C1524f("keyword", this.f10320x));
            C0694v c0694v = this.f10321y;
            InterfaceC0567a b7 = c0694v.f10322a.b();
            String m7 = AbstractC0515y1.m(l0.s(c0694v.f10323b), g6.o.f10858a.N());
            this.f10317u = 1;
            obj = b7.g(m7, K6, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return new Y0.b(obj);
    }
}
