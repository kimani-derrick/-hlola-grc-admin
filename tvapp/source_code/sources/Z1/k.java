package Z1;

import T1.o;
import a2.InterfaceC0200c;
import android.content.Context;
import b2.InterfaceC0364c;
import c2.AbstractC0390a;
import c2.C0391b;
import java.util.concurrent.Executor;
import y5.InterfaceC1496a;
/* loaded from: classes.dex */
public final class k implements V1.b {

    /* renamed from: a  reason: collision with root package name */
    public final InterfaceC1496a f4579a;

    /* renamed from: b  reason: collision with root package name */
    public final InterfaceC1496a f4580b;

    /* renamed from: c  reason: collision with root package name */
    public final InterfaceC1496a f4581c;
    public final InterfaceC1496a d;

    /* renamed from: e  reason: collision with root package name */
    public final InterfaceC1496a f4582e;
    public final InterfaceC1496a f;

    /* renamed from: g  reason: collision with root package name */
    public final InterfaceC1496a f4583g;

    /* renamed from: h  reason: collision with root package name */
    public final InterfaceC1496a f4584h;

    /* renamed from: i  reason: collision with root package name */
    public final InterfaceC1496a f4585i;

    public k(InterfaceC1496a interfaceC1496a, InterfaceC1496a interfaceC1496a2, InterfaceC1496a interfaceC1496a3, Y1.d dVar, InterfaceC1496a interfaceC1496a4, InterfaceC1496a interfaceC1496a5, InterfaceC1496a interfaceC1496a6) {
        o oVar = AbstractC0390a.f7252a;
        o oVar2 = AbstractC0390a.f7253b;
        this.f4579a = interfaceC1496a;
        this.f4580b = interfaceC1496a2;
        this.f4581c = interfaceC1496a3;
        this.d = dVar;
        this.f4582e = interfaceC1496a4;
        this.f = interfaceC1496a5;
        this.f4583g = oVar;
        this.f4584h = oVar2;
        this.f4585i = interfaceC1496a6;
    }

    @Override // y5.InterfaceC1496a
    public final Object get() {
        return new j((Context) this.f4579a.get(), (U1.f) this.f4580b.get(), (a2.d) this.f4581c.get(), (d) this.d.get(), (Executor) this.f4582e.get(), (InterfaceC0364c) this.f.get(), (C0391b) this.f4583g.get(), (C0391b) this.f4584h.get(), (InterfaceC0200c) this.f4585i.get());
    }
}
