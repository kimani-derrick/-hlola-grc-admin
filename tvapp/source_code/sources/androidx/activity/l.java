package androidx.activity;

import H2.C0002c;
import K.InterfaceC0035k;
import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.fragment.app.E;
import androidx.fragment.app.H;
import androidx.lifecycle.C0344w;
import androidx.lifecycle.EnumC0336n;
import androidx.lifecycle.EnumC0337o;
import androidx.lifecycle.InterfaceC0332j;
import androidx.lifecycle.InterfaceC0340s;
import androidx.lifecycle.InterfaceC0342u;
import androidx.lifecycle.M;
import androidx.lifecycle.P;
import androidx.lifecycle.T;
import androidx.lifecycle.W;
import androidx.lifecycle.Y;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import c.InterfaceC0385a;
import com.boxhdo.android.tv.R;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
import l0.C0967c;
/* loaded from: classes.dex */
public abstract class l extends z.e implements c0, InterfaceC0332j, A0.g, x, androidx.activity.result.h, A.i, A.j, z.i, z.j, InterfaceC0035k {

    /* renamed from: A */
    public final h f5323A;

    /* renamed from: B */
    public final CopyOnWriteArrayList f5324B;

    /* renamed from: C */
    public final CopyOnWriteArrayList f5325C;

    /* renamed from: D */
    public final CopyOnWriteArrayList f5326D;

    /* renamed from: E */
    public final CopyOnWriteArrayList f5327E;
    public final CopyOnWriteArrayList F;

    /* renamed from: G */
    public boolean f5328G;

    /* renamed from: H */
    public boolean f5329H;

    /* renamed from: r */
    public final d3.g f5330r = new d3.g();

    /* renamed from: s */
    public final C0002c f5331s;

    /* renamed from: t */
    public final C0344w f5332t;

    /* renamed from: u */
    public final A0.f f5333u;

    /* renamed from: v */
    public b0 f5334v;

    /* renamed from: w */
    public T f5335w;

    /* renamed from: x */
    public w f5336x;

    /* renamed from: y */
    public final k f5337y;

    /* renamed from: z */
    public final A0.f f5338z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v15, types: [androidx.activity.ImmLeaksCleaner, androidx.lifecycle.t, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [A0.f, java.lang.Object] */
    public l() {
        final q1.g gVar = (q1.g) this;
        this.f5331s = new C0002c(new E1.b(6, gVar));
        C0344w c0344w = new C0344w(this);
        this.f5332t = c0344w;
        A0.f fVar = new A0.f(this);
        this.f5333u = fVar;
        this.f5336x = null;
        this.f5337y = new k(gVar);
        new L5.a() { // from class: androidx.activity.d
            @Override // L5.a
            public final Object b() {
                gVar.reportFullyDrawn();
                return null;
            }
        };
        ?? obj = new Object();
        obj.f12b = new Object();
        obj.f13c = new ArrayList();
        this.f5338z = obj;
        new AtomicInteger();
        this.f5323A = new h(gVar);
        this.f5324B = new CopyOnWriteArrayList();
        this.f5325C = new CopyOnWriteArrayList();
        this.f5326D = new CopyOnWriteArrayList();
        this.f5327E = new CopyOnWriteArrayList();
        this.F = new CopyOnWriteArrayList();
        this.f5328G = false;
        this.f5329H = false;
        int i7 = Build.VERSION.SDK_INT;
        c0344w.g(new InterfaceC0340s() { // from class: androidx.activity.ComponentActivity$2
            @Override // androidx.lifecycle.InterfaceC0340s
            public final void d(InterfaceC0342u interfaceC0342u, EnumC0336n enumC0336n) {
                View view;
                if (enumC0336n == EnumC0336n.ON_STOP) {
                    Window window = gVar.getWindow();
                    if (window != null) {
                        view = window.peekDecorView();
                    } else {
                        view = null;
                    }
                    if (view != null) {
                        view.cancelPendingInputEvents();
                    }
                }
            }
        });
        c0344w.g(new InterfaceC0340s() { // from class: androidx.activity.ComponentActivity$3
            @Override // androidx.lifecycle.InterfaceC0340s
            public final void d(InterfaceC0342u interfaceC0342u, EnumC0336n enumC0336n) {
                if (enumC0336n == EnumC0336n.ON_DESTROY) {
                    gVar.f5330r.f9233b = null;
                    if (!gVar.isChangingConfigurations()) {
                        gVar.p().a();
                    }
                    k kVar = gVar.f5337y;
                    l lVar = kVar.f5322t;
                    lVar.getWindow().getDecorView().removeCallbacks(kVar);
                    lVar.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(kVar);
                }
            }
        });
        c0344w.g(new InterfaceC0340s() { // from class: androidx.activity.ComponentActivity$4
            @Override // androidx.lifecycle.InterfaceC0340s
            public final void d(InterfaceC0342u interfaceC0342u, EnumC0336n enumC0336n) {
                l lVar = gVar;
                if (lVar.f5334v == null) {
                    j jVar = (j) lVar.getLastNonConfigurationInstance();
                    if (jVar != null) {
                        lVar.f5334v = jVar.f5318a;
                    }
                    if (lVar.f5334v == null) {
                        lVar.f5334v = new b0();
                    }
                }
                lVar.f5332t.v(this);
            }
        });
        fVar.f();
        P.f(this);
        if (i7 <= 23) {
            ?? obj2 = new Object();
            obj2.f5299q = this;
            c0344w.g(obj2);
        }
        ((A0.e) fVar.f13c).d("android:support:activity-result", new e(0, gVar));
        H(new f(gVar, 0));
    }

    public static /* synthetic */ void t(l lVar) {
        super.onBackPressed();
    }

    public final void C(H h7) {
        C0002c c0002c = this.f5331s;
        ((CopyOnWriteArrayList) c0002c.f1018s).add(h7);
        ((Runnable) c0002c.f1017r).run();
    }

    public final void F(J.a aVar) {
        this.f5324B.add(aVar);
    }

    public final void H(InterfaceC0385a interfaceC0385a) {
        d3.g gVar = this.f5330r;
        gVar.getClass();
        if (((Context) gVar.f9233b) != null) {
            interfaceC0385a.a();
        }
        ((CopyOnWriteArraySet) gVar.f9232a).add(interfaceC0385a);
    }

    public final void J(E e3) {
        this.f5327E.add(e3);
    }

    public final void M(E e3) {
        this.F.add(e3);
    }

    public final void N(E e3) {
        this.f5325C.add(e3);
    }

    public final void O() {
        View decorView = getWindow().getDecorView();
        M5.g.f(decorView, "<this>");
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        M5.g.f(decorView2, "<this>");
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        M5.g.f(decorView3, "<this>");
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        M5.g.f(decorView4, "<this>");
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        M5.g.f(decorView5, "<this>");
        decorView5.setTag(R.id.report_drawn, this);
    }

    public final void P(H h7) {
        C0002c c0002c = this.f5331s;
        ((CopyOnWriteArrayList) c0002c.f1018s).remove(h7);
        AbstractC0515y1.v(((HashMap) c0002c.f1019t).remove(h7));
        ((Runnable) c0002c.f1017r).run();
    }

    public final void Q(E e3) {
        this.f5324B.remove(e3);
    }

    public final void R(E e3) {
        this.f5327E.remove(e3);
    }

    public final void S(E e3) {
        this.F.remove(e3);
    }

    public final void T(E e3) {
        this.f5325C.remove(e3);
    }

    @Override // androidx.lifecycle.InterfaceC0332j
    public final C0967c a() {
        C0967c c0967c = new C0967c(0);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = c0967c.f12233a;
        if (application != null) {
            linkedHashMap.put(W.f6801a, getApplication());
        }
        linkedHashMap.put(P.f6773a, this);
        linkedHashMap.put(P.f6774b, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            linkedHashMap.put(P.f6775c, getIntent().getExtras());
        }
        return c0967c;
    }

    @Override // android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        O();
        this.f5337y.a(getWindow().getDecorView());
        super.addContentView(view, layoutParams);
    }

    @Override // androidx.activity.x
    public final w e() {
        if (this.f5336x == null) {
            this.f5336x = new w(new P.b(4, this));
            this.f5332t.g(new InterfaceC0340s() { // from class: androidx.activity.ComponentActivity$6
                @Override // androidx.lifecycle.InterfaceC0340s
                public final void d(InterfaceC0342u interfaceC0342u, EnumC0336n enumC0336n) {
                    if (enumC0336n == EnumC0336n.ON_CREATE && Build.VERSION.SDK_INT >= 33) {
                        w wVar = l.this.f5336x;
                        OnBackInvokedDispatcher a7 = i.a((l) interfaceC0342u);
                        wVar.getClass();
                        M5.g.f(a7, "invoker");
                        wVar.f5384e = a7;
                        wVar.d(wVar.f5385g);
                    }
                }
            });
        }
        return this.f5336x;
    }

    @Override // A0.g
    public final A0.e f() {
        return (A0.e) this.f5333u.f13c;
    }

    @Override // android.app.Activity
    public void onActivityResult(int i7, int i8, Intent intent) {
        if (this.f5323A.a(i7, i8, intent)) {
            return;
        }
        super.onActivityResult(i7, i8, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        e().c();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator it = this.f5324B.iterator();
        while (it.hasNext()) {
            ((J.a) it.next()).b(configuration);
        }
    }

    @Override // z.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f5333u.g(bundle);
        d3.g gVar = this.f5330r;
        gVar.getClass();
        gVar.f9233b = this;
        Iterator it = ((CopyOnWriteArraySet) gVar.f9232a).iterator();
        while (it.hasNext()) {
            ((InterfaceC0385a) it.next()).a();
        }
        super.onCreate(bundle);
        int i7 = M.f6766r;
        P.j(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i7, Menu menu) {
        if (i7 == 0) {
            super.onCreatePanelMenu(i7, menu);
            getMenuInflater();
            Iterator it = ((CopyOnWriteArrayList) this.f5331s.f1018s).iterator();
            while (it.hasNext()) {
                ((H) it.next()).f5895a.k();
            }
            return true;
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i7, MenuItem menuItem) {
        if (super.onMenuItemSelected(i7, menuItem)) {
            return true;
        }
        if (i7 != 0) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) this.f5331s.f1018s).iterator();
        while (it.hasNext()) {
            if (((H) it.next()).f5895a.p()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z7) {
        if (this.f5328G) {
            return;
        }
        Iterator it = this.f5327E.iterator();
        while (it.hasNext()) {
            ((J.a) it.next()).b(new z.f(z7));
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Iterator it = this.f5326D.iterator();
        while (it.hasNext()) {
            ((J.a) it.next()).b(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onPanelClosed(int i7, Menu menu) {
        Iterator it = ((CopyOnWriteArrayList) this.f5331s.f1018s).iterator();
        while (it.hasNext()) {
            ((H) it.next()).f5895a.q();
        }
        super.onPanelClosed(i7, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z7) {
        if (this.f5329H) {
            return;
        }
        Iterator it = this.F.iterator();
        while (it.hasNext()) {
            ((J.a) it.next()).b(new z.k(z7));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i7, View view, Menu menu) {
        if (i7 == 0) {
            super.onPreparePanel(i7, view, menu);
            Iterator it = ((CopyOnWriteArrayList) this.f5331s.f1018s).iterator();
            while (it.hasNext()) {
                ((H) it.next()).f5895a.t();
            }
            return true;
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i7, String[] strArr, int[] iArr) {
        if (this.f5323A.a(i7, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i7, strArr, iArr);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.activity.j, java.lang.Object] */
    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        j jVar;
        b0 b0Var = this.f5334v;
        if (b0Var == null && (jVar = (j) getLastNonConfigurationInstance()) != null) {
            b0Var = jVar.f5318a;
        }
        if (b0Var == null) {
            return null;
        }
        ?? obj = new Object();
        obj.f5318a = b0Var;
        return obj;
    }

    @Override // z.e, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        C0344w c0344w = this.f5332t;
        if (c0344w instanceof C0344w) {
            c0344w.I(EnumC0337o.f6819s);
        }
        super.onSaveInstanceState(bundle);
        this.f5333u.h(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i7) {
        super.onTrimMemory(i7);
        Iterator it = this.f5325C.iterator();
        while (it.hasNext()) {
            ((J.a) it.next()).b(Integer.valueOf(i7));
        }
    }

    @Override // androidx.lifecycle.c0
    public final b0 p() {
        if (getApplication() != null) {
            if (this.f5334v == null) {
                j jVar = (j) getLastNonConfigurationInstance();
                if (jVar != null) {
                    this.f5334v = jVar.f5318a;
                }
                if (this.f5334v == null) {
                    this.f5334v = new b0();
                }
            }
            return this.f5334v;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    @Override // androidx.lifecycle.InterfaceC0342u
    public final P1.c q() {
        return this.f5332t;
    }

    @Override // androidx.lifecycle.InterfaceC0332j
    public Y r() {
        if (this.f5335w == null) {
            this.f5335w = new T(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
        }
        return this.f5335w;
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (android.support.v4.media.session.b.p0()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            this.f5338z.a();
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i7) {
        O();
        this.f5337y.a(getWindow().getDecorView());
        super.setContentView(i7);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i7) {
        super.startActivityForResult(intent, i7);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i7, Intent intent, int i8, int i9, int i10) {
        super.startIntentSenderForResult(intentSender, i7, intent, i8, i9, i10);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z7, Configuration configuration) {
        this.f5328G = true;
        try {
            super.onMultiWindowModeChanged(z7, configuration);
            this.f5328G = false;
            Iterator it = this.f5327E.iterator();
            while (it.hasNext()) {
                M5.g.f(configuration, "newConfig");
                ((J.a) it.next()).b(new z.f(z7));
            }
        } catch (Throwable th) {
            this.f5328G = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z7, Configuration configuration) {
        this.f5329H = true;
        try {
            super.onPictureInPictureModeChanged(z7, configuration);
            this.f5329H = false;
            Iterator it = this.F.iterator();
            while (it.hasNext()) {
                M5.g.f(configuration, "newConfig");
                ((J.a) it.next()).b(new z.k(z7));
            }
        } catch (Throwable th) {
            this.f5329H = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        O();
        this.f5337y.a(getWindow().getDecorView());
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i7, Bundle bundle) {
        super.startActivityForResult(intent, i7, bundle);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i7, Intent intent, int i8, int i9, int i10, Bundle bundle) {
        super.startIntentSenderForResult(intentSender, i7, intent, i8, i9, i10, bundle);
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        O();
        this.f5337y.a(getWindow().getDecorView());
        super.setContentView(view, layoutParams);
    }
}
