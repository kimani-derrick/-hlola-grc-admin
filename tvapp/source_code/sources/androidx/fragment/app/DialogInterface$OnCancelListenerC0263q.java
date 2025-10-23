package androidx.fragment.app;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC0347z;
import com.boxhdo.android.tv.R;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
/* renamed from: androidx.fragment.app.q  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class DialogInterface$OnCancelListenerC0263q extends ComponentCallbacksC0269x implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: A0  reason: collision with root package name */
    public boolean f6066A0;

    /* renamed from: B0  reason: collision with root package name */
    public boolean f6067B0;

    /* renamed from: n0  reason: collision with root package name */
    public Handler f6069n0;

    /* renamed from: w0  reason: collision with root package name */
    public boolean f6078w0;
    public Dialog y0;

    /* renamed from: z0  reason: collision with root package name */
    public boolean f6080z0;

    /* renamed from: o0  reason: collision with root package name */
    public final P.b f6070o0 = new P.b(6, this);

    /* renamed from: p0  reason: collision with root package name */
    public final DialogInterface$OnCancelListenerC0260n f6071p0 = new DialogInterface$OnCancelListenerC0260n(this);

    /* renamed from: q0  reason: collision with root package name */
    public final DialogInterface$OnDismissListenerC0261o f6072q0 = new DialogInterface$OnDismissListenerC0261o(this);

    /* renamed from: r0  reason: collision with root package name */
    public int f6073r0 = 0;

    /* renamed from: s0  reason: collision with root package name */
    public int f6074s0 = 0;

    /* renamed from: t0  reason: collision with root package name */
    public boolean f6075t0 = true;

    /* renamed from: u0  reason: collision with root package name */
    public boolean f6076u0 = true;

    /* renamed from: v0  reason: collision with root package name */
    public int f6077v0 = -1;

    /* renamed from: x0  reason: collision with root package name */
    public final Z5.n f6079x0 = new Z5.n(this);

    /* renamed from: C0  reason: collision with root package name */
    public boolean f6068C0 = false;

    @Override // androidx.fragment.app.ComponentCallbacksC0269x
    public final void C() {
        this.f6117U = true;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0269x
    public void F(Context context) {
        super.F(context);
        this.f6128g0.d(this.f6079x0);
        if (this.f6067B0) {
            return;
        }
        this.f6066A0 = false;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0269x
    public void G(Bundle bundle) {
        super.G(bundle);
        this.f6069n0 = new Handler();
        this.f6076u0 = this.f6111O == 0;
        if (bundle != null) {
            this.f6073r0 = bundle.getInt("android:style", 0);
            this.f6074s0 = bundle.getInt("android:theme", 0);
            this.f6075t0 = bundle.getBoolean("android:cancelable", true);
            this.f6076u0 = bundle.getBoolean("android:showsDialog", this.f6076u0);
            this.f6077v0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0269x
    public final void J() {
        this.f6117U = true;
        Dialog dialog = this.y0;
        if (dialog != null) {
            this.f6080z0 = true;
            dialog.setOnDismissListener(null);
            this.y0.dismiss();
            if (!this.f6066A0) {
                onDismiss(this.y0);
            }
            this.y0 = null;
            this.f6068C0 = false;
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0269x
    public final void K() {
        this.f6117U = true;
        if (!this.f6067B0 && !this.f6066A0) {
            this.f6066A0 = true;
        }
        Z5.n nVar = this.f6079x0;
        androidx.lifecycle.A a7 = this.f6128g0;
        a7.getClass();
        androidx.lifecycle.A.a("removeObserver");
        AbstractC0347z abstractC0347z = (AbstractC0347z) a7.f6724b.c(nVar);
        if (abstractC0347z != null) {
            abstractC0347z.k();
            abstractC0347z.j(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0046 A[Catch: all -> 0x004e, TryCatch #0 {all -> 0x004e, blocks: (B:12:0x001a, B:14:0x0026, B:24:0x003e, B:26:0x0046, B:29:0x0050, B:20:0x0030, B:22:0x0036, B:23:0x003b, B:30:0x0068), top: B:49:0x001a }] */
    @Override // androidx.fragment.app.ComponentCallbacksC0269x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.LayoutInflater L(android.os.Bundle r8) {
        /*
            r7 = this;
            android.view.LayoutInflater r0 = super.L(r8)
            boolean r1 = r7.f6076u0
            r2 = 2
            java.lang.String r3 = "FragmentManager"
            if (r1 == 0) goto L9a
            boolean r4 = r7.f6078w0
            if (r4 == 0) goto L11
            goto L9a
        L11:
            if (r1 != 0) goto L14
            goto L71
        L14:
            boolean r1 = r7.f6068C0
            if (r1 != 0) goto L71
            r1 = 0
            r4 = 1
            r7.f6078w0 = r4     // Catch: java.lang.Throwable -> L4e
            android.app.Dialog r8 = r7.g0(r8)     // Catch: java.lang.Throwable -> L4e
            r7.y0 = r8     // Catch: java.lang.Throwable -> L4e
            boolean r5 = r7.f6076u0     // Catch: java.lang.Throwable -> L4e
            if (r5 == 0) goto L68
            int r5 = r7.f6073r0     // Catch: java.lang.Throwable -> L4e
            if (r5 == r4) goto L3b
            if (r5 == r2) goto L3b
            r6 = 3
            if (r5 == r6) goto L30
            goto L3e
        L30:
            android.view.Window r5 = r8.getWindow()     // Catch: java.lang.Throwable -> L4e
            if (r5 == 0) goto L3b
            r6 = 24
            r5.addFlags(r6)     // Catch: java.lang.Throwable -> L4e
        L3b:
            r8.requestWindowFeature(r4)     // Catch: java.lang.Throwable -> L4e
        L3e:
            android.content.Context r8 = r7.o()     // Catch: java.lang.Throwable -> L4e
            boolean r5 = r8 instanceof android.app.Activity     // Catch: java.lang.Throwable -> L4e
            if (r5 == 0) goto L50
            android.app.Dialog r5 = r7.y0     // Catch: java.lang.Throwable -> L4e
            android.app.Activity r8 = (android.app.Activity) r8     // Catch: java.lang.Throwable -> L4e
            r5.setOwnerActivity(r8)     // Catch: java.lang.Throwable -> L4e
            goto L50
        L4e:
            r8 = move-exception
            goto L6e
        L50:
            android.app.Dialog r8 = r7.y0     // Catch: java.lang.Throwable -> L4e
            boolean r5 = r7.f6075t0     // Catch: java.lang.Throwable -> L4e
            r8.setCancelable(r5)     // Catch: java.lang.Throwable -> L4e
            android.app.Dialog r8 = r7.y0     // Catch: java.lang.Throwable -> L4e
            androidx.fragment.app.n r5 = r7.f6071p0     // Catch: java.lang.Throwable -> L4e
            r8.setOnCancelListener(r5)     // Catch: java.lang.Throwable -> L4e
            android.app.Dialog r8 = r7.y0     // Catch: java.lang.Throwable -> L4e
            androidx.fragment.app.o r5 = r7.f6072q0     // Catch: java.lang.Throwable -> L4e
            r8.setOnDismissListener(r5)     // Catch: java.lang.Throwable -> L4e
            r7.f6068C0 = r4     // Catch: java.lang.Throwable -> L4e
            goto L6b
        L68:
            r8 = 0
            r7.y0 = r8     // Catch: java.lang.Throwable -> L4e
        L6b:
            r7.f6078w0 = r1
            goto L71
        L6e:
            r7.f6078w0 = r1
            throw r8
        L71:
            boolean r8 = android.util.Log.isLoggable(r3, r2)
            if (r8 == 0) goto L8d
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r1 = "get layout inflater for DialogFragment "
            r8.<init>(r1)
            r8.append(r7)
            java.lang.String r1 = " from dialog context"
            r8.append(r1)
            java.lang.String r8 = r8.toString()
            android.util.Log.d(r3, r8)
        L8d:
            android.app.Dialog r8 = r7.y0
            if (r8 == 0) goto L99
            android.content.Context r8 = r8.getContext()
            android.view.LayoutInflater r0 = r0.cloneInContext(r8)
        L99:
            return r0
        L9a:
            boolean r8 = android.util.Log.isLoggable(r3, r2)
            if (r8 == 0) goto Lcc
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r1 = "getting layout inflater for DialogFragment "
            r8.<init>(r1)
            r8.append(r7)
            java.lang.String r8 = r8.toString()
            boolean r1 = r7.f6076u0
            if (r1 != 0) goto Lc4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "mShowsDialog = false: "
            r1.<init>(r2)
        Lb9:
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            android.util.Log.d(r3, r8)
            goto Lcc
        Lc4:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "mCreatingDialog = true: "
            r1.<init>(r2)
            goto Lb9
        Lcc:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.DialogInterface$OnCancelListenerC0263q.L(android.os.Bundle):android.view.LayoutInflater");
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0269x
    public void R(Bundle bundle) {
        Dialog dialog = this.y0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i7 = this.f6073r0;
        if (i7 != 0) {
            bundle.putInt("android:style", i7);
        }
        int i8 = this.f6074s0;
        if (i8 != 0) {
            bundle.putInt("android:theme", i8);
        }
        boolean z7 = this.f6075t0;
        if (!z7) {
            bundle.putBoolean("android:cancelable", z7);
        }
        boolean z8 = this.f6076u0;
        if (!z8) {
            bundle.putBoolean("android:showsDialog", z8);
        }
        int i9 = this.f6077v0;
        if (i9 != -1) {
            bundle.putInt("android:backStackId", i9);
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0269x
    public void S() {
        this.f6117U = true;
        Dialog dialog = this.y0;
        if (dialog != null) {
            this.f6080z0 = false;
            dialog.show();
            View decorView = this.y0.getWindow().getDecorView();
            M5.g.f(decorView, "<this>");
            decorView.setTag(R.id.view_tree_lifecycle_owner, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0269x
    public void T() {
        this.f6117U = true;
        Dialog dialog = this.y0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0269x
    public final void V(Bundle bundle) {
        Bundle bundle2;
        this.f6117U = true;
        if (this.y0 != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.y0.onRestoreInstanceState(bundle2);
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0269x
    public final void X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.X(layoutInflater, viewGroup, bundle);
        if (this.W != null || this.y0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.y0.onRestoreInstanceState(bundle2);
    }

    public final void f0(boolean z7, boolean z8) {
        if (this.f6066A0) {
            return;
        }
        this.f6066A0 = true;
        this.f6067B0 = false;
        Dialog dialog = this.y0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.y0.dismiss();
            if (!z8) {
                if (Looper.myLooper() == this.f6069n0.getLooper()) {
                    onDismiss(this.y0);
                } else {
                    this.f6069n0.post(this.f6070o0);
                }
            }
        }
        this.f6080z0 = true;
        if (this.f6077v0 >= 0) {
            S t5 = t();
            int i7 = this.f6077v0;
            if (i7 >= 0) {
                t5.y(new O(t5, null, i7), z7);
                this.f6077v0 = -1;
                return;
            }
            throw new IllegalArgumentException(AbstractC0515y1.l("Bad id: ", i7));
        }
        C0247a c0247a = new C0247a(t());
        c0247a.f5992p = true;
        S s6 = this.f6106J;
        if (s6 != null && s6 != c0247a.f5993q) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + toString() + " is already attached to a FragmentManager.");
        }
        c0247a.b(new a0(3, this));
        if (z7) {
            c0247a.e(true);
        } else {
            c0247a.e(false);
        }
    }

    public Dialog g0(Bundle bundle) {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new androidx.activity.m(a0(), this.f6074s0);
    }

    public final Dialog h0() {
        Dialog dialog = this.y0;
        if (dialog != null) {
            return dialog;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    public final void i0(S s6, String str) {
        this.f6066A0 = false;
        this.f6067B0 = true;
        s6.getClass();
        C0247a c0247a = new C0247a(s6);
        c0247a.f5992p = true;
        c0247a.f(0, this, str, 1);
        c0247a.e(false);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0269x
    public final p6.l j() {
        return new C0262p(this, new C0265t(this));
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.f6080z0) {
            if (Log.isLoggable("FragmentManager", 3)) {
                Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
            }
            f0(true, true);
        }
    }
}
