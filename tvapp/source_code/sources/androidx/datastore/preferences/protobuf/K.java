package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;
/* loaded from: classes.dex */
public final class K {

    /* renamed from: b  reason: collision with root package name */
    public static final C0240t f5704b = new C0240t(1);

    /* renamed from: a  reason: collision with root package name */
    public final Object f5705a;

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.datastore.preferences.protobuf.J, java.lang.Object] */
    public K() {
        P p3;
        try {
            p3 = (P) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            p3 = f5704b;
        }
        P[] pArr = {C0240t.f5820b, p3};
        ?? obj = new Object();
        obj.f5703a = pArr;
        Charset charset = AbstractC0246z.f5827a;
        this.f5705a = obj;
    }

    public void a(int i7, boolean z7) {
        ((C0232k) this.f5705a).U(i7, z7);
    }

    public void b(int i7, C0228g c0228g) {
        ((C0232k) this.f5705a).W(i7, c0228g);
    }

    public void c(int i7, double d) {
        C0232k c0232k = (C0232k) this.f5705a;
        c0232k.getClass();
        c0232k.a0(Double.doubleToRawLongBits(d), i7);
    }

    public void d(int i7, int i8) {
        ((C0232k) this.f5705a).c0(i7, i8);
    }

    public void e(int i7, int i8) {
        ((C0232k) this.f5705a).Y(i7, i8);
    }

    public void f(long j7, int i7) {
        ((C0232k) this.f5705a).a0(j7, i7);
    }

    public void g(int i7, float f) {
        C0232k c0232k = (C0232k) this.f5705a;
        c0232k.getClass();
        c0232k.Y(i7, Float.floatToRawIntBits(f));
    }

    public void h(int i7, Object obj, InterfaceC0223b0 interfaceC0223b0) {
        C0232k c0232k = (C0232k) this.f5705a;
        c0232k.i0(i7, 3);
        interfaceC0223b0.i((AbstractC0220a) obj, c0232k.f5793c);
        c0232k.i0(i7, 4);
    }

    public void i(int i7, int i8) {
        ((C0232k) this.f5705a).c0(i7, i8);
    }

    public void j(long j7, int i7) {
        ((C0232k) this.f5705a).l0(j7, i7);
    }

    public void k(int i7, Object obj, InterfaceC0223b0 interfaceC0223b0) {
        ((C0232k) this.f5705a).e0(i7, (AbstractC0220a) obj, interfaceC0223b0);
    }

    public void l(int i7, int i8) {
        ((C0232k) this.f5705a).Y(i7, i8);
    }

    public void m(long j7, int i7) {
        ((C0232k) this.f5705a).a0(j7, i7);
    }

    public void n(int i7, int i8) {
        ((C0232k) this.f5705a).j0(i7, (i8 >> 31) ^ (i8 << 1));
    }

    public void o(long j7, int i7) {
        ((C0232k) this.f5705a).l0((j7 >> 63) ^ (j7 << 1), i7);
    }

    public void p(int i7, int i8) {
        ((C0232k) this.f5705a).j0(i7, i8);
    }

    public void q(long j7, int i7) {
        ((C0232k) this.f5705a).l0(j7, i7);
    }

    public K(C0232k c0232k) {
        AbstractC0246z.a(c0232k, "output");
        this.f5705a = c0232k;
        c0232k.f5793c = this;
    }
}
