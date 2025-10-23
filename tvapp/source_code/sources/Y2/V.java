package Y2;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
/* loaded from: classes.dex */
public final class V implements InterfaceC0144m {

    /* renamed from: q  reason: collision with root package name */
    public final InterfaceC0144m f4365q;

    /* renamed from: r  reason: collision with root package name */
    public long f4366r;

    /* renamed from: s  reason: collision with root package name */
    public Uri f4367s;

    public V(InterfaceC0144m interfaceC0144m) {
        interfaceC0144m.getClass();
        this.f4365q = interfaceC0144m;
        this.f4367s = Uri.EMPTY;
        Collections.emptyMap();
    }

    @Override // Y2.InterfaceC0144m
    public final long c(C0148q c0148q) {
        this.f4367s = c0148q.f4422a;
        Collections.emptyMap();
        InterfaceC0144m interfaceC0144m = this.f4365q;
        long c5 = interfaceC0144m.c(c0148q);
        Uri g7 = interfaceC0144m.g();
        g7.getClass();
        this.f4367s = g7;
        interfaceC0144m.n();
        return c5;
    }

    @Override // Y2.InterfaceC0144m
    public final void close() {
        this.f4365q.close();
    }

    @Override // Y2.InterfaceC0144m
    public final Uri g() {
        return this.f4365q.g();
    }

    @Override // Y2.InterfaceC0144m
    public final void m(W w7) {
        w7.getClass();
        this.f4365q.m(w7);
    }

    @Override // Y2.InterfaceC0144m
    public final Map n() {
        return this.f4365q.n();
    }

    @Override // Y2.InterfaceC0141j
    public final int r(byte[] bArr, int i7, int i8) {
        int r3 = this.f4365q.r(bArr, i7, i8);
        if (r3 != -1) {
            this.f4366r += r3;
        }
        return r3;
    }
}
