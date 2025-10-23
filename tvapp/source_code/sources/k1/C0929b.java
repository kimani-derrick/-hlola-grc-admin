package k1;

import F1.t;
import h6.I;
import h6.v;
import p6.l;
import v6.InterfaceC1343h;
import v6.z;
/* renamed from: k1.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0929b extends I {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f12121q = 1;

    /* renamed from: r  reason: collision with root package name */
    public final I f12122r;

    /* renamed from: s  reason: collision with root package name */
    public z f12123s;

    /* renamed from: t  reason: collision with root package name */
    public Object f12124t;

    public C0929b(I i7) {
        this.f12122r = i7;
        this.f12123s = l.c(new K0.b(this, i7.f()));
    }

    @Override // h6.I
    public final long a() {
        switch (this.f12121q) {
            case 0:
                return this.f12122r.a();
            default:
                return this.f12122r.a();
        }
    }

    @Override // h6.I
    public final v b() {
        switch (this.f12121q) {
            case 0:
                return this.f12122r.b();
            default:
                return this.f12122r.b();
        }
    }

    @Override // h6.I, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        switch (this.f12121q) {
            case 1:
                this.f12122r.close();
                return;
            default:
                super.close();
                return;
        }
    }

    @Override // h6.I
    public final InterfaceC1343h f() {
        switch (this.f12121q) {
            case 0:
                z zVar = this.f12123s;
                if (zVar == null) {
                    z c5 = l.c(new C0928a(this, this.f12122r.f()));
                    this.f12123s = c5;
                    return c5;
                }
                return zVar;
            default:
                return this.f12123s;
        }
    }

    public C0929b(I i7, t tVar) {
        this.f12122r = i7;
        this.f12124t = tVar;
    }
}
