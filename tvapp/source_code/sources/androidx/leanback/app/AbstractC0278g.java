package androidx.leanback.app;

import android.os.Bundle;
import android.os.Handler;
import android.transition.Transition;
import android.view.View;
import i0.C0767a;
import i0.C0768b;
import java.util.ArrayList;
/* renamed from: androidx.leanback.app.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0278g extends C0279h {

    /* renamed from: H0  reason: collision with root package name */
    public Object f6216H0;

    /* renamed from: I0  reason: collision with root package name */
    public final C f6217I0;

    /* renamed from: t0  reason: collision with root package name */
    public final C0767a f6218t0 = new C0767a("START", true, false);

    /* renamed from: u0  reason: collision with root package name */
    public final C0767a f6219u0 = new C0767a("ENTRANCE_INIT");

    /* renamed from: v0  reason: collision with root package name */
    public final C0275d f6220v0 = new C0275d(this, 0);

    /* renamed from: w0  reason: collision with root package name */
    public final C0275d f6221w0 = new C0275d(this, 1);

    /* renamed from: x0  reason: collision with root package name */
    public final C0275d f6222x0 = new C0275d(this, 2);
    public final C0275d y0 = new C0275d(this, 3);

    /* renamed from: z0  reason: collision with root package name */
    public final C0767a f6223z0 = new C0767a("ENTRANCE_COMPLETE", true, false);

    /* renamed from: A0  reason: collision with root package name */
    public final B0.d f6210A0 = new B0.d(7, "onCreate", false);

    /* renamed from: B0  reason: collision with root package name */
    public final B0.d f6211B0 = new B0.d(7, "onCreateView", false);

    /* renamed from: C0  reason: collision with root package name */
    public final B0.d f6212C0 = new B0.d(7, "prepareEntranceTransition", false);

    /* renamed from: D0  reason: collision with root package name */
    public final B0.d f6213D0 = new B0.d(7, "startEntranceTransition", false);

    /* renamed from: E0  reason: collision with root package name */
    public final B0.d f6214E0 = new B0.d(7, "onEntranceTransitionEnd", false);

    /* renamed from: F0  reason: collision with root package name */
    public final L4.f f6215F0 = new L4.f(18);
    public final g5.b G0 = new g5.b(2);

    /* JADX WARN: Type inference failed for: r0v14, types: [androidx.leanback.app.C, java.lang.Object] */
    public AbstractC0278g() {
        ?? obj = new Object();
        obj.f6159u = new Handler();
        obj.f6155q = true;
        obj.f6160v = new B(0, obj);
        this.f6217I0 = obj;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0269x
    public void G(Bundle bundle) {
        k0();
        l0();
        g5.b bVar = this.G0;
        ((ArrayList) bVar.f10843t).addAll((ArrayList) bVar.f10841r);
        bVar.E();
        super.G(bundle);
        bVar.w(this.f6210A0);
    }

    @Override // androidx.leanback.app.C0279h, androidx.fragment.app.ComponentCallbacksC0269x
    public void U(View view, Bundle bundle) {
        super.U(view, bundle);
        this.G0.w(this.f6211B0);
    }

    public abstract Transition j0();

    public void k0() {
        C0767a c0767a = this.f6218t0;
        g5.b bVar = this.G0;
        bVar.r(c0767a);
        bVar.r(this.f6219u0);
        bVar.r(this.f6220v0);
        bVar.r(this.f6221w0);
        bVar.r(this.f6222x0);
        bVar.r(this.y0);
        bVar.r(this.f6223z0);
    }

    public void l0() {
        C0767a c0767a = this.f6218t0;
        C0767a c0767a2 = this.f6219u0;
        this.G0.getClass();
        g5.b.s(c0767a, c0767a2, this.f6210A0);
        C0767a c0767a3 = this.f6223z0;
        C0768b c0768b = new C0768b(c0767a2, c0767a3, this.f6215F0);
        c0767a3.a(c0768b);
        c0767a2.b(c0768b);
        B0.d dVar = this.f6211B0;
        g5.b.s(c0767a2, c0767a3, dVar);
        B0.d dVar2 = this.f6212C0;
        C0275d c0275d = this.f6220v0;
        g5.b.s(c0767a2, c0275d, dVar2);
        C0275d c0275d2 = this.f6221w0;
        g5.b.s(c0275d, c0275d2, dVar);
        B0.d dVar3 = this.f6213D0;
        C0275d c0275d3 = this.f6222x0;
        g5.b.s(c0275d, c0275d3, dVar3);
        C0768b c0768b2 = new C0768b(c0275d2, c0275d3);
        c0275d3.a(c0768b2);
        c0275d2.b(c0768b2);
        B0.d dVar4 = this.f6214E0;
        C0275d c0275d4 = this.y0;
        g5.b.s(c0275d3, c0275d4, dVar4);
        C0768b c0768b3 = new C0768b(c0275d4, c0767a3);
        c0767a3.a(c0768b3);
        c0275d4.b(c0768b3);
    }

    public void m0() {
    }

    public void n0() {
    }

    public void o0() {
    }

    public abstract void p0(Object obj);
}
