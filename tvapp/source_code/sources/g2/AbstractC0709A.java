package g2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* renamed from: g2.A  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0709A implements InterfaceC0724o {

    /* renamed from: b  reason: collision with root package name */
    public C0722m f10509b;

    /* renamed from: c  reason: collision with root package name */
    public C0722m f10510c;
    public C0722m d;

    /* renamed from: e  reason: collision with root package name */
    public C0722m f10511e;
    public ByteBuffer f;

    /* renamed from: g  reason: collision with root package name */
    public ByteBuffer f10512g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f10513h;

    public AbstractC0709A() {
        ByteBuffer byteBuffer = InterfaceC0724o.f10706a;
        this.f = byteBuffer;
        this.f10512g = byteBuffer;
        C0722m c0722m = C0722m.f10702e;
        this.d = c0722m;
        this.f10511e = c0722m;
        this.f10509b = c0722m;
        this.f10510c = c0722m;
    }

    @Override // g2.InterfaceC0724o
    public boolean a() {
        if (this.f10511e != C0722m.f10702e) {
            return true;
        }
        return false;
    }

    @Override // g2.InterfaceC0724o
    public ByteBuffer b() {
        ByteBuffer byteBuffer = this.f10512g;
        this.f10512g = InterfaceC0724o.f10706a;
        return byteBuffer;
    }

    @Override // g2.InterfaceC0724o
    public final C0722m c(C0722m c0722m) {
        this.d = c0722m;
        this.f10511e = h(c0722m);
        if (a()) {
            return this.f10511e;
        }
        return C0722m.f10702e;
    }

    @Override // g2.InterfaceC0724o
    public final void d() {
        this.f10513h = true;
        j();
    }

    @Override // g2.InterfaceC0724o
    public boolean e() {
        if (this.f10513h && this.f10512g == InterfaceC0724o.f10706a) {
            return true;
        }
        return false;
    }

    @Override // g2.InterfaceC0724o
    public final void flush() {
        this.f10512g = InterfaceC0724o.f10706a;
        this.f10513h = false;
        this.f10509b = this.d;
        this.f10510c = this.f10511e;
        i();
    }

    @Override // g2.InterfaceC0724o
    public final void g() {
        flush();
        this.f = InterfaceC0724o.f10706a;
        C0722m c0722m = C0722m.f10702e;
        this.d = c0722m;
        this.f10511e = c0722m;
        this.f10509b = c0722m;
        this.f10510c = c0722m;
        k();
    }

    public abstract C0722m h(C0722m c0722m);

    public final ByteBuffer l(int i7) {
        if (this.f.capacity() < i7) {
            this.f = ByteBuffer.allocateDirect(i7).order(ByteOrder.nativeOrder());
        } else {
            this.f.clear();
        }
        ByteBuffer byteBuffer = this.f;
        this.f10512g = byteBuffer;
        return byteBuffer;
    }

    public void i() {
    }

    public void j() {
    }

    public void k() {
    }
}
