package com.google.crypto.tink.shaded.protobuf;

import java.nio.charset.Charset;
/* loaded from: classes.dex */
public final class K {

    /* renamed from: b  reason: collision with root package name */
    public static final C0540s f9069b = new C0540s(1);

    /* renamed from: a  reason: collision with root package name */
    public final Object f9070a;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.google.crypto.tink.shaded.protobuf.J] */
    public K() {
        O o7;
        try {
            o7 = (O) Class.forName("com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            o7 = f9069b;
        }
        O[] oArr = {C0540s.f9161b, o7};
        ?? obj = new Object();
        obj.f9068a = oArr;
        Charset charset = AbstractC0547z.f9165a;
        this.f9070a = obj;
    }

    public void a(int i7, boolean z7) {
        C0533k c0533k = (C0533k) this.f9070a;
        c0533k.p0(i7, 0);
        c0533k.g0(z7 ? (byte) 1 : (byte) 0);
    }

    public void b(int i7, AbstractC0530h abstractC0530h) {
        C0533k c0533k = (C0533k) this.f9070a;
        c0533k.p0(i7, 2);
        c0533k.i0(abstractC0530h);
    }

    public void c(int i7, double d) {
        C0533k c0533k = (C0533k) this.f9070a;
        c0533k.getClass();
        c0533k.l0(Double.doubleToRawLongBits(d), i7);
    }

    public void d(int i7, int i8) {
        C0533k c0533k = (C0533k) this.f9070a;
        c0533k.p0(i7, 0);
        c0533k.n0(i8);
    }

    public void e(int i7, int i8) {
        ((C0533k) this.f9070a).j0(i7, i8);
    }

    public void f(long j7, int i7) {
        ((C0533k) this.f9070a).l0(j7, i7);
    }

    public void g(int i7, float f) {
        C0533k c0533k = (C0533k) this.f9070a;
        c0533k.getClass();
        c0533k.j0(i7, Float.floatToRawIntBits(f));
    }

    public void h(int i7, Object obj, b0 b0Var) {
        C0533k c0533k = (C0533k) this.f9070a;
        c0533k.p0(i7, 3);
        b0Var.h((AbstractC0523a) obj, c0533k.f9139a);
        c0533k.p0(i7, 4);
    }

    public void i(int i7, int i8) {
        C0533k c0533k = (C0533k) this.f9070a;
        c0533k.p0(i7, 0);
        c0533k.n0(i8);
    }

    public void j(long j7, int i7) {
        ((C0533k) this.f9070a).r0(j7, i7);
    }

    public void k(int i7, Object obj, b0 b0Var) {
        AbstractC0523a abstractC0523a = (AbstractC0523a) obj;
        C0533k c0533k = (C0533k) this.f9070a;
        c0533k.p0(i7, 2);
        c0533k.q0(abstractC0523a.a(b0Var));
        b0Var.h(abstractC0523a, c0533k.f9139a);
    }

    public void l(int i7, int i8) {
        ((C0533k) this.f9070a).j0(i7, i8);
    }

    public void m(long j7, int i7) {
        ((C0533k) this.f9070a).l0(j7, i7);
    }

    public void n(int i7, int i8) {
        C0533k c0533k = (C0533k) this.f9070a;
        c0533k.p0(i7, 0);
        c0533k.q0((i8 >> 31) ^ (i8 << 1));
    }

    public void o(long j7, int i7) {
        ((C0533k) this.f9070a).r0((j7 >> 63) ^ (j7 << 1), i7);
    }

    public void p(int i7, int i8) {
        C0533k c0533k = (C0533k) this.f9070a;
        c0533k.p0(i7, 0);
        c0533k.q0(i8);
    }

    public void q(long j7, int i7) {
        ((C0533k) this.f9070a).r0(j7, i7);
    }

    public K(C0533k c0533k) {
        AbstractC0547z.a(c0533k, "output");
        this.f9070a = c0533k;
        c0533k.f9139a = this;
    }
}
