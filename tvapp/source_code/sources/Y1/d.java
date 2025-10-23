package Y1;

import T1.o;
import Z1.l;
import android.content.Context;
import b2.InterfaceC0364c;
import c2.AbstractC0390a;
import c2.C0391b;
import java.util.concurrent.Executor;
import y5.InterfaceC1496a;
/* loaded from: classes.dex */
public final class d implements V1.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4316a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final InterfaceC1496a f4317b;

    /* renamed from: c  reason: collision with root package name */
    public final InterfaceC1496a f4318c;
    public final InterfaceC1496a d;

    /* renamed from: e  reason: collision with root package name */
    public final InterfaceC1496a f4319e;

    public d(InterfaceC1496a interfaceC1496a, InterfaceC1496a interfaceC1496a2, c cVar) {
        o oVar = AbstractC0390a.f7253b;
        this.f4317b = interfaceC1496a;
        this.f4318c = interfaceC1496a2;
        this.d = cVar;
        this.f4319e = oVar;
    }

    @Override // y5.InterfaceC1496a
    public final Object get() {
        switch (this.f4316a) {
            case 0:
                C0391b c0391b = (C0391b) this.f4319e.get();
                return new Z1.d((Context) this.f4317b.get(), (a2.d) this.f4318c.get(), (Z1.b) this.d.get());
            default:
                return new l((Executor) this.f4317b.get(), (a2.d) this.f4318c.get(), (Z1.d) this.d.get(), (InterfaceC0364c) this.f4319e.get());
        }
    }

    public d(InterfaceC1496a interfaceC1496a, InterfaceC1496a interfaceC1496a2, d dVar, InterfaceC1496a interfaceC1496a3) {
        this.f4317b = interfaceC1496a;
        this.f4318c = interfaceC1496a2;
        this.d = dVar;
        this.f4319e = interfaceC1496a3;
    }
}
