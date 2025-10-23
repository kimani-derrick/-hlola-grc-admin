package Y2;

import H2.C0016q;
import Z2.AbstractC0156a;
import android.net.Uri;
import java.util.Collections;
import java.util.Map;
/* loaded from: classes.dex */
public final class P implements K {

    /* renamed from: a  reason: collision with root package name */
    public final long f4344a;

    /* renamed from: b  reason: collision with root package name */
    public final C0148q f4345b;

    /* renamed from: c  reason: collision with root package name */
    public final int f4346c;
    public final V d;

    /* renamed from: e  reason: collision with root package name */
    public final O f4347e;
    public volatile Object f;

    public P(InterfaceC0144m interfaceC0144m, Uri uri, O o7) {
        Map emptyMap = Collections.emptyMap();
        AbstractC0156a.m(uri, "The uri must be set.");
        C0148q c0148q = new C0148q(uri, 0L, 1, null, emptyMap, 0L, -1L, null, 1, null);
        this.d = new V(interfaceC0144m);
        this.f4345b = c0148q;
        this.f4346c = 4;
        this.f4347e = o7;
        this.f4344a = C0016q.f1156a.getAndIncrement();
    }

    @Override // Y2.K
    public final void a() {
        this.d.f4366r = 0L;
        C0146o c0146o = new C0146o(this.d, this.f4345b);
        try {
            c0146o.a();
            Uri g7 = this.d.f4365q.g();
            g7.getClass();
            this.f = this.f4347e.j(g7, c0146o);
        } finally {
            Z2.H.h(c0146o);
        }
    }

    @Override // Y2.K
    public final void b() {
    }
}
