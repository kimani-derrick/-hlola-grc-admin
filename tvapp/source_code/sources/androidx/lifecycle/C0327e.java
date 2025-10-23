package androidx.lifecycle;

import W5.C0114v;
import W5.InterfaceC0093a0;
import W5.InterfaceC0116x;
import java.io.Closeable;
/* renamed from: androidx.lifecycle.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0327e implements Closeable, InterfaceC0116x {

    /* renamed from: q  reason: collision with root package name */
    public final D5.i f6814q;

    public C0327e(D5.i iVar) {
        M5.g.f(iVar, "context");
        this.f6814q = iVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        InterfaceC0093a0 interfaceC0093a0 = (InterfaceC0093a0) this.f6814q.f(C0114v.f4028r);
        if (interfaceC0093a0 != null) {
            interfaceC0093a0.b(null);
        }
    }

    @Override // W5.InterfaceC0116x
    public final D5.i n() {
        return this.f6814q;
    }
}
