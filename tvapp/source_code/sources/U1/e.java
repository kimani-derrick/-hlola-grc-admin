package U1;

import T1.o;
import a2.l;
import android.content.Context;
import c2.AbstractC0390a;
import c2.C0391b;
import y5.InterfaceC1496a;
/* loaded from: classes.dex */
public final class e implements V1.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3416a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final InterfaceC1496a f3417b;

    /* renamed from: c  reason: collision with root package name */
    public final InterfaceC1496a f3418c;
    public final InterfaceC1496a d;

    public e(Y1.c cVar) {
        o oVar = AbstractC0390a.f7252a;
        o oVar2 = AbstractC0390a.f7253b;
        this.f3417b = cVar;
        this.f3418c = oVar;
        this.d = oVar2;
    }

    @Override // y5.InterfaceC1496a
    public final Object get() {
        switch (this.f3416a) {
            case 0:
                return new d((Context) this.f3417b.get(), (C0391b) this.f3418c.get(), (C0391b) this.d.get());
            default:
                return new l(((Integer) this.d.get()).intValue(), (Context) this.f3417b.get(), (String) this.f3418c.get());
        }
    }

    public e(InterfaceC1496a interfaceC1496a) {
        o oVar = a2.e.f4989a;
        o oVar2 = a2.e.f4990b;
        this.f3417b = interfaceC1496a;
        this.f3418c = oVar;
        this.d = oVar2;
    }
}
