package T1;

import a2.C0198a;
import b2.InterfaceC0364c;
import c2.AbstractC0390a;
import c2.C0391b;
import java.util.concurrent.Executor;
import y5.InterfaceC1496a;
/* loaded from: classes.dex */
public final class v implements V1.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3270a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final InterfaceC1496a f3271b;

    /* renamed from: c  reason: collision with root package name */
    public final InterfaceC1496a f3272c;
    public final InterfaceC1496a d;

    /* renamed from: e  reason: collision with root package name */
    public final InterfaceC1496a f3273e;
    public final InterfaceC1496a f;

    public v(v vVar, Z1.k kVar, Y1.d dVar) {
        o oVar = AbstractC0390a.f7252a;
        o oVar2 = AbstractC0390a.f7253b;
        this.f3271b = oVar;
        this.f3272c = oVar2;
        this.d = vVar;
        this.f3273e = kVar;
        this.f = dVar;
    }

    @Override // y5.InterfaceC1496a
    public final Object get() {
        switch (this.f3270a) {
            case 0:
                return new u((C0391b) this.f3271b.get(), (C0391b) this.f3272c.get(), (Y1.b) this.d.get(), (Z1.j) this.f3273e.get(), (Z1.l) this.f.get());
            case 1:
                return new Y1.a((Executor) this.f3271b.get(), (U1.f) this.f3272c.get(), (Z1.d) this.d.get(), (a2.d) this.f3273e.get(), (InterfaceC0364c) this.f.get());
            default:
                return new a2.j((C0391b) this.f3271b.get(), (C0391b) this.f3272c.get(), (C0198a) this.d.get(), (a2.l) this.f3273e.get(), this.f);
        }
    }

    public v(InterfaceC1496a interfaceC1496a, InterfaceC1496a interfaceC1496a2) {
        o oVar = AbstractC0390a.f7252a;
        o oVar2 = AbstractC0390a.f7253b;
        o oVar3 = a2.e.f4991c;
        this.f3271b = oVar;
        this.f3272c = oVar2;
        this.d = oVar3;
        this.f3273e = interfaceC1496a;
        this.f = interfaceC1496a2;
    }

    public v(InterfaceC1496a interfaceC1496a, InterfaceC1496a interfaceC1496a2, Y1.d dVar, InterfaceC1496a interfaceC1496a3, InterfaceC1496a interfaceC1496a4) {
        this.f3271b = interfaceC1496a;
        this.f3272c = interfaceC1496a2;
        this.d = dVar;
        this.f3273e = interfaceC1496a3;
        this.f = interfaceC1496a4;
    }
}
