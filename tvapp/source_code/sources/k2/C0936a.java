package k2;
/* renamed from: k2.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0936a implements InterfaceC0955t {

    /* renamed from: a  reason: collision with root package name */
    public final InterfaceC0938c f12140a;

    /* renamed from: b  reason: collision with root package name */
    public final long f12141b;

    /* renamed from: c  reason: collision with root package name */
    public final long f12142c = 0;
    public final long d;

    /* renamed from: e  reason: collision with root package name */
    public final long f12143e;
    public final long f;

    /* renamed from: g  reason: collision with root package name */
    public final long f12144g;

    public C0936a(InterfaceC0938c interfaceC0938c, long j7, long j8, long j9, long j10, long j11) {
        this.f12140a = interfaceC0938c;
        this.f12141b = j7;
        this.d = j8;
        this.f12143e = j9;
        this.f = j10;
        this.f12144g = j11;
    }

    @Override // k2.InterfaceC0955t
    public final boolean b() {
        return true;
    }

    @Override // k2.InterfaceC0955t
    public final C0954s g(long j7) {
        C0956u c0956u = new C0956u(j7, C0937b.a(this.f12140a.b(j7), this.f12142c, this.d, this.f12143e, this.f, this.f12144g));
        return new C0954s(c0956u, c0956u);
    }

    @Override // k2.InterfaceC0955t
    public final long i() {
        return this.f12141b;
    }
}
