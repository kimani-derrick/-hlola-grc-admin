package U1;

import android.content.Context;
import y5.InterfaceC1496a;
/* loaded from: classes.dex */
public final class g implements V1.b {

    /* renamed from: a  reason: collision with root package name */
    public final InterfaceC1496a f3422a;

    /* renamed from: b  reason: collision with root package name */
    public final InterfaceC1496a f3423b;

    public g(Y1.c cVar, e eVar) {
        this.f3422a = cVar;
        this.f3423b = eVar;
    }

    @Override // y5.InterfaceC1496a
    public final Object get() {
        return new f((Context) this.f3422a.get(), (d) this.f3423b.get());
    }
}
