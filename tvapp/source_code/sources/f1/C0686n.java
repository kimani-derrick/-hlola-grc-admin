package f1;

import W5.InterfaceC0116x;
import e1.InterfaceC0567a;
import k3.AbstractC0958a;
import w4.l0;
import z5.C1530l;
/* renamed from: f1.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0686n extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public int f10286u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ C0694v f10287v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ String f10288w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ long f10289x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ int f10290y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ int f10291z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0686n(C0694v c0694v, String str, long j7, int i7, int i8, D5.d dVar) {
        super(2, dVar);
        this.f10287v = c0694v;
        this.f10288w = str;
        this.f10289x = j7;
        this.f10290y = i7;
        this.f10291z = i8;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        return new C0686n(this.f10287v, this.f10288w, this.f10289x, this.f10290y, this.f10291z, dVar);
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((C0686n) h((D5.d) obj2, (InterfaceC0116x) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        String F;
        E5.a aVar = E5.a.f612q;
        int i7 = this.f10286u;
        if (i7 != 0) {
            if (i7 == 1) {
                AbstractC0958a.H(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0958a.H(obj);
            C0694v c0694v = this.f10287v;
            InterfaceC0567a b7 = c0694v.f10322a.b();
            String s6 = l0.s(c0694v.f10323b);
            if (M5.g.a(this.f10288w, "companies")) {
                F = g6.o.f10858a.h();
            } else {
                F = g6.o.f10858a.F();
            }
            this.f10286u = 1;
            obj = b7.i(s6 + F + "/" + this.f10289x, this.f10290y, this.f10291z, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return new Y0.b(obj);
    }
}
