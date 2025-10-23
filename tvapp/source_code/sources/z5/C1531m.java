package z5;

import java.io.Serializable;
/* renamed from: z5.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1531m implements InterfaceC1522d, Serializable {

    /* renamed from: q  reason: collision with root package name */
    public L5.a f16480q;

    /* renamed from: r  reason: collision with root package name */
    public Object f16481r;

    @Override // z5.InterfaceC1522d
    public final Object getValue() {
        if (this.f16481r == C1529k.f16478a) {
            L5.a aVar = this.f16480q;
            M5.g.c(aVar);
            this.f16481r = aVar.b();
            this.f16480q = null;
        }
        return this.f16481r;
    }

    public final String toString() {
        if (this.f16481r != C1529k.f16478a) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}
