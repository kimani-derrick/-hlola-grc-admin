package q1;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.databinding.DataBinderMapperImpl;
import androidx.fragment.app.C0271z;
import androidx.fragment.app.ComponentCallbacksC0269x;
import androidx.fragment.app.S;
import androidx.fragment.app.b0;
import androidx.lifecycle.C0344w;
import androidx.lifecycle.EnumC0336n;
import androidx.lifecycle.EnumC0337o;
import n0.C0999A;
import z.InterfaceC1498b;
/* loaded from: classes.dex */
public abstract class g extends androidx.activity.l implements InterfaceC1498b {

    /* renamed from: P  reason: collision with root package name */
    public static final /* synthetic */ int f13228P = 0;

    /* renamed from: K  reason: collision with root package name */
    public boolean f13231K;

    /* renamed from: L  reason: collision with root package name */
    public boolean f13232L;

    /* renamed from: N  reason: collision with root package name */
    public androidx.databinding.d f13234N;

    /* renamed from: O  reason: collision with root package name */
    public C0999A f13235O;

    /* renamed from: I  reason: collision with root package name */
    public final Z5.n f13229I = new Z5.n(new C0271z(this));

    /* renamed from: J  reason: collision with root package name */
    public final C0344w f13230J = new C0344w(this);

    /* renamed from: M  reason: collision with root package name */
    public boolean f13233M = true;

    public g() {
        ((A0.e) this.f5333u.f13c).d("android:support:lifecycle", new androidx.activity.e(1, this));
        F(new J.a(this) { // from class: androidx.fragment.app.y

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ q1.g f6145b;

            {
                this.f6145b = this;
            }

            @Override // J.a
            public final void b(Object obj) {
                switch (r2) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        this.f6145b.f13229I.v();
                        return;
                    default:
                        Intent intent = (Intent) obj;
                        this.f6145b.f13229I.v();
                        return;
                }
            }
        });
        this.f5326D.add(new J.a(this) { // from class: androidx.fragment.app.y

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ q1.g f6145b;

            {
                this.f6145b = this;
            }

            @Override // J.a
            public final void b(Object obj) {
                switch (r2) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        this.f6145b.f13229I.v();
                        return;
                    default:
                        Intent intent = (Intent) obj;
                        this.f6145b.f13229I.v();
                        return;
                }
            }
        });
        H(new androidx.activity.f(this, 1));
    }

    public static boolean X(S s6) {
        g gVar;
        EnumC0337o enumC0337o = EnumC0337o.f6819s;
        boolean z7 = false;
        for (ComponentCallbacksC0269x componentCallbacksC0269x : s6.f5925c.A()) {
            if (componentCallbacksC0269x != null) {
                C0271z c0271z = componentCallbacksC0269x.f6107K;
                if (c0271z == null) {
                    gVar = null;
                } else {
                    gVar = c0271z.f6150v;
                }
                if (gVar != null) {
                    z7 |= X(componentCallbacksC0269x.n());
                }
                b0 b0Var = componentCallbacksC0269x.f6127f0;
                EnumC0337o enumC0337o2 = EnumC0337o.f6820t;
                if (b0Var != null) {
                    b0Var.c();
                    if (b0Var.f6022u.f6830t.compareTo(enumC0337o2) >= 0) {
                        componentCallbacksC0269x.f6127f0.f6022u.I(enumC0337o);
                        z7 = true;
                    }
                }
                if (componentCallbacksC0269x.f6126e0.f6830t.compareTo(enumC0337o2) >= 0) {
                    componentCallbacksC0269x.f6126e0.I(enumC0337o);
                    z7 = true;
                }
            }
        }
        return z7;
    }

    public final androidx.databinding.d U() {
        androidx.databinding.d dVar = this.f13234N;
        if (dVar != null) {
            return dVar;
        }
        M5.g.l("binding");
        throw null;
    }

    public abstract int V();

    public final S W() {
        return ((C0271z) this.f13229I.f4918q).f6149u;
    }

    public final void Y(Bundle bundle) {
        super.onCreate(bundle);
        this.f13230J.G(EnumC0336n.ON_CREATE);
        S s6 = ((C0271z) this.f13229I.f4918q).f6149u;
        s6.f5914G = false;
        s6.f5915H = false;
        s6.f5921N.f5959i = false;
        s6.u(1);
    }

    public final void Z(m mVar, boolean z7) {
        String string;
        M5.g.f(mVar, "tvUiText");
        if (mVar instanceof k) {
            string = ((k) mVar).f13252a;
        } else if (mVar instanceof l) {
            string = getString(((l) mVar).f13253a);
            M5.g.e(string, "getString(tvUiText.value)");
        } else {
            throw new RuntimeException();
        }
        Toast.makeText(this, string, 0).show();
    }

    public abstract void a0();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0022, code lost:
        if (android.os.Build.VERSION.SDK_INT < 26) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0024, code lost:
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0033, code lost:
        if (android.os.Build.VERSION.SDK_INT < 29) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003c, code lost:
        if (r2.equals("--list-dumpables") == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0045, code lost:
        if (r2.equals("--dump-dumpable") == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004c, code lost:
        if (android.os.Build.VERSION.SDK_INT < 33) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x005c, code lost:
        if (android.os.Build.VERSION.SDK_INT < 31) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0064  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void dump(java.lang.String r6, java.io.FileDescriptor r7, java.io.PrintWriter r8, java.lang.String[] r9) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.g.dump(java.lang.String, java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]):void");
    }

    @Override // androidx.activity.l, android.app.Activity
    public final void onActivityResult(int i7, int i8, Intent intent) {
        this.f13229I.v();
        super.onActivityResult(i7, i8, intent);
    }

    @Override // androidx.activity.l, z.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Y(bundle);
        int V6 = V();
        DataBinderMapperImpl dataBinderMapperImpl = androidx.databinding.b.f5656a;
        setContentView(V6);
        androidx.databinding.d a7 = androidx.databinding.b.a((ViewGroup) getWindow().getDecorView().findViewById(16908290), 0, V6);
        M5.g.e(a7, "setContentView(this, layoutRes)");
        this.f13234N = a7;
        a0();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((C0271z) this.f13229I.f4918q).f6149u.f.onCreateView(view, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(view, str, context, attributeSet) : onCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((C0271z) this.f13229I.f4918q).f6149u.l();
        this.f13230J.G(EnumC0336n.ON_DESTROY);
    }

    @Override // androidx.activity.l, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i7, MenuItem menuItem) {
        if (super.onMenuItemSelected(i7, menuItem)) {
            return true;
        }
        if (i7 == 6) {
            return ((C0271z) this.f13229I.f4918q).f6149u.j();
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.f13232L = false;
        ((C0271z) this.f13229I.f4918q).f6149u.u(5);
        this.f13230J.G(EnumC0336n.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        this.f13230J.G(EnumC0336n.ON_RESUME);
        S s6 = ((C0271z) this.f13229I.f4918q).f6149u;
        s6.f5914G = false;
        s6.f5915H = false;
        s6.f5921N.f5959i = false;
        s6.u(7);
    }

    @Override // androidx.activity.l, android.app.Activity
    public final void onRequestPermissionsResult(int i7, String[] strArr, int[] iArr) {
        this.f13229I.v();
        super.onRequestPermissionsResult(i7, strArr, iArr);
    }

    @Override // android.app.Activity
    public final void onResume() {
        Z5.n nVar = this.f13229I;
        nVar.v();
        super.onResume();
        this.f13232L = true;
        ((C0271z) nVar.f4918q).f6149u.A(true);
    }

    @Override // android.app.Activity
    public final void onStart() {
        Z5.n nVar = this.f13229I;
        nVar.v();
        super.onStart();
        this.f13233M = false;
        boolean z7 = this.f13231K;
        C0271z c0271z = (C0271z) nVar.f4918q;
        if (!z7) {
            this.f13231K = true;
            S s6 = c0271z.f6149u;
            s6.f5914G = false;
            s6.f5915H = false;
            s6.f5921N.f5959i = false;
            s6.u(4);
        }
        c0271z.f6149u.A(true);
        this.f13230J.G(EnumC0336n.ON_START);
        S s7 = c0271z.f6149u;
        s7.f5914G = false;
        s7.f5915H = false;
        s7.f5921N.f5959i = false;
        s7.u(5);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.f13229I.v();
    }

    @Override // android.app.Activity
    public final void onStop() {
        super.onStop();
        this.f13233M = true;
        do {
        } while (X(W()));
        S s6 = ((C0271z) this.f13229I.f4918q).f6149u;
        s6.f5915H = true;
        s6.f5921N.f5959i = true;
        s6.u(4);
        this.f13230J.G(EnumC0336n.ON_STOP);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((C0271z) this.f13229I.f4918q).f6149u.f.onCreateView(null, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(str, context, attributeSet) : onCreateView;
    }
}
