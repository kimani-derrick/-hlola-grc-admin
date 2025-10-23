package androidx.fragment.app;

import K.InterfaceC0035k;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.Window;
/* renamed from: androidx.fragment.app.z  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0271z extends p6.l implements A.i, A.j, z.i, z.j, androidx.lifecycle.c0, androidx.activity.x, androidx.activity.result.h, A0.g, W, InterfaceC0035k {

    /* renamed from: r  reason: collision with root package name */
    public final Activity f6146r;

    /* renamed from: s  reason: collision with root package name */
    public final Context f6147s;

    /* renamed from: t  reason: collision with root package name */
    public final Handler f6148t;

    /* renamed from: u  reason: collision with root package name */
    public final S f6149u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ q1.g f6150v;

    public C0271z(q1.g gVar) {
        this.f6150v = gVar;
        Handler handler = new Handler();
        this.f6146r = gVar;
        this.f6147s = gVar;
        this.f6148t = handler;
        this.f6149u = new S();
    }

    @Override // p6.l
    public final View A(int i7) {
        return this.f6150v.findViewById(i7);
    }

    @Override // p6.l
    public final boolean B() {
        Window window = this.f6150v.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    public final void V(H h7) {
        this.f6150v.C(h7);
    }

    public final void W(J.a aVar) {
        this.f6150v.F(aVar);
    }

    public final void X(E e3) {
        this.f6150v.J(e3);
    }

    public final void Y(E e3) {
        this.f6150v.M(e3);
    }

    public final void Z(E e3) {
        this.f6150v.N(e3);
    }

    @Override // androidx.fragment.app.W
    public final void a(S s6, ComponentCallbacksC0269x componentCallbacksC0269x) {
        this.f6150v.getClass();
    }

    public final void a0(H h7) {
        this.f6150v.P(h7);
    }

    public final void b0(E e3) {
        this.f6150v.Q(e3);
    }

    public final void c0(E e3) {
        this.f6150v.R(e3);
    }

    public final void d0(E e3) {
        this.f6150v.S(e3);
    }

    @Override // androidx.activity.x
    public final androidx.activity.w e() {
        return this.f6150v.e();
    }

    public final void e0(E e3) {
        this.f6150v.T(e3);
    }

    @Override // A0.g
    public final A0.e f() {
        return (A0.e) this.f6150v.f5333u.f13c;
    }

    @Override // androidx.lifecycle.c0
    public final androidx.lifecycle.b0 p() {
        return this.f6150v.p();
    }

    @Override // androidx.lifecycle.InterfaceC0342u
    public final P1.c q() {
        return this.f6150v.f13230J;
    }
}
