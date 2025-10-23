package androidx.activity;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.C0344w;
import androidx.lifecycle.EnumC0336n;
import androidx.lifecycle.InterfaceC0342u;
import com.boxhdo.android.tv.R;
/* loaded from: classes.dex */
public final class m extends Dialog implements InterfaceC0342u, x, A0.g {

    /* renamed from: q  reason: collision with root package name */
    public C0344w f5339q;

    /* renamed from: r  reason: collision with root package name */
    public final A0.f f5340r;

    /* renamed from: s  reason: collision with root package name */
    public final w f5341s;

    public m(Context context, int i7) {
        super(context, i7);
        this.f5340r = new A0.f(this);
        this.f5341s = new w(new E1.b(8, this));
    }

    public static void a(m mVar) {
        M5.g.f(mVar, "this$0");
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        M5.g.f(view, "view");
        c();
        super.addContentView(view, layoutParams);
    }

    public final C0344w b() {
        C0344w c0344w = this.f5339q;
        if (c0344w == null) {
            C0344w c0344w2 = new C0344w(this);
            this.f5339q = c0344w2;
            return c0344w2;
        }
        return c0344w;
    }

    public final void c() {
        Window window = getWindow();
        M5.g.c(window);
        View decorView = window.getDecorView();
        M5.g.e(decorView, "window!!.decorView");
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        Window window2 = getWindow();
        M5.g.c(window2);
        View decorView2 = window2.getDecorView();
        M5.g.e(decorView2, "window!!.decorView");
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        M5.g.c(window3);
        View decorView3 = window3.getDecorView();
        M5.g.e(decorView3, "window!!.decorView");
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // androidx.activity.x
    public final w e() {
        return this.f5341s;
    }

    @Override // A0.g
    public final A0.e f() {
        return (A0.e) this.f5340r.f13c;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f5341s.c();
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            M5.g.e(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            w wVar = this.f5341s;
            wVar.getClass();
            wVar.f5384e = onBackInvokedDispatcher;
            wVar.d(wVar.f5385g);
        }
        this.f5340r.g(bundle);
        b().G(EnumC0336n.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        M5.g.e(onSaveInstanceState, "super.onSaveInstanceState()");
        this.f5340r.h(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        b().G(EnumC0336n.ON_RESUME);
    }

    @Override // android.app.Dialog
    public final void onStop() {
        b().G(EnumC0336n.ON_DESTROY);
        this.f5339q = null;
        super.onStop();
    }

    @Override // androidx.lifecycle.InterfaceC0342u
    public final P1.c q() {
        return b();
    }

    @Override // android.app.Dialog
    public final void setContentView(int i7) {
        c();
        super.setContentView(i7);
    }

    @Override // android.app.Dialog
    public final void setContentView(View view) {
        M5.g.f(view, "view");
        c();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        M5.g.f(view, "view");
        c();
        super.setContentView(view, layoutParams);
    }
}
