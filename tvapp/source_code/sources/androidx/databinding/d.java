package androidx.databinding;

import F3.l;
import H2.C0002c;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.Choreographer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC0269x;
import androidx.fragment.app.b0;
import androidx.lifecycle.B;
import androidx.lifecycle.EnumC0336n;
import androidx.lifecycle.EnumC0337o;
import androidx.lifecycle.InterfaceC0341t;
import androidx.lifecycle.InterfaceC0342u;
import com.boxhdo.android.tv.R;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public abstract class d extends android.support.v4.media.session.b {

    /* renamed from: o  reason: collision with root package name */
    public static final boolean f5658o = true;

    /* renamed from: p  reason: collision with root package name */
    public static final ReferenceQueue f5659p = new ReferenceQueue();

    /* renamed from: q  reason: collision with root package name */
    public static final l f5660q = new l(1);
    public final P.b d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f5661e;
    public final e[] f;

    /* renamed from: g  reason: collision with root package name */
    public final View f5662g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f5663h;

    /* renamed from: i  reason: collision with root package name */
    public final Choreographer f5664i;

    /* renamed from: j  reason: collision with root package name */
    public final c f5665j;

    /* renamed from: k  reason: collision with root package name */
    public final Handler f5666k;

    /* renamed from: l  reason: collision with root package name */
    public d f5667l;

    /* renamed from: m  reason: collision with root package name */
    public InterfaceC0342u f5668m;
    public ViewDataBinding$OnStartListener n;

    public d(Object obj, View view, int i7) {
        if (obj == null) {
            this.d = new P.b(5, this);
            this.f5661e = false;
            this.f = new e[i7];
            this.f5662g = view;
            if (Looper.myLooper() != null) {
                if (f5658o) {
                    this.f5664i = Choreographer.getInstance();
                    this.f5665j = new c(this);
                    return;
                }
                this.f5665j = null;
                this.f5666k = new Handler(Looper.myLooper());
                return;
            }
            throw new IllegalStateException("DataBinding must be created in view's UI Thread");
        }
        throw new IllegalArgumentException("The provided bindingComponent parameter must be an instance of DataBindingComponent. See  https://issuetracker.google.com/issues/116541301 for details of why this parameter is not defined as DataBindingComponent");
    }

    public static d K0(LayoutInflater layoutInflater, int i7, ViewGroup viewGroup, boolean z7, Object obj) {
        if (obj == null) {
            return b.b(layoutInflater, i7, viewGroup, z7);
        }
        throw new IllegalArgumentException("The provided bindingComponent parameter must be an instance of DataBindingComponent. See  https://issuetracker.google.com/issues/116541301 for details of why this parameter is not defined as DataBindingComponent");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x006d, code lost:
        if (r23 == null) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0094, code lost:
        if (r23 == null) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0096, code lost:
        r13 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0097, code lost:
        r5 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01fb A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01f0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void M0(android.view.View r21, java.lang.Object[] r22, H2.C0002c r23, android.util.SparseIntArray r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.databinding.d.M0(android.view.View, java.lang.Object[], H2.c, android.util.SparseIntArray, boolean):void");
    }

    public static Object[] N0(View view, int i7, C0002c c0002c, SparseIntArray sparseIntArray) {
        Object[] objArr = new Object[i7];
        M0(view, objArr, c0002c, sparseIntArray, true);
        return objArr;
    }

    public abstract void G0();

    public final void H0() {
        if (this.f5663h) {
            O0();
        } else if (J0()) {
            this.f5663h = true;
            G0();
            this.f5663h = false;
        }
    }

    public final void I0() {
        d dVar = this.f5667l;
        if (dVar == null) {
            H0();
        } else {
            dVar.I0();
        }
    }

    public abstract boolean J0();

    public abstract void L0();

    public final void O0() {
        d dVar = this.f5667l;
        if (dVar != null) {
            dVar.O0();
            return;
        }
        InterfaceC0342u interfaceC0342u = this.f5668m;
        if (interfaceC0342u != null && interfaceC0342u.q().l().compareTo(EnumC0337o.f6820t) < 0) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f5661e) {
                    return;
                }
                this.f5661e = true;
                if (f5658o) {
                    this.f5664i.postFrameCallback(this.f5665j);
                } else {
                    this.f5666k.post(this.d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [androidx.databinding.ViewDataBinding$OnStartListener] */
    public void P0(b0 b0Var) {
        e[] eVarArr;
        if (b0Var instanceof ComponentCallbacksC0269x) {
            Log.w("DataBinding", "Setting the fragment as the LifecycleOwner might cause memory leaks because views lives shorter than the Fragment. Consider using Fragment's view lifecycle");
        }
        InterfaceC0342u interfaceC0342u = this.f5668m;
        if (interfaceC0342u == b0Var) {
            return;
        }
        if (interfaceC0342u != null) {
            interfaceC0342u.q().v(this.n);
        }
        this.f5668m = b0Var;
        if (b0Var != null) {
            if (this.n == null) {
                this.n = new InterfaceC0341t(this) { // from class: androidx.databinding.ViewDataBinding$OnStartListener

                    /* renamed from: q  reason: collision with root package name */
                    public final WeakReference f5655q;

                    {
                        this.f5655q = new WeakReference(this);
                    }

                    @B(EnumC0336n.ON_START)
                    public void onStart() {
                        d dVar = (d) this.f5655q.get();
                        if (dVar != null) {
                            dVar.I0();
                        }
                    }
                };
            }
            b0Var.c();
            b0Var.f6022u.g(this.n);
        }
        for (e eVar : this.f) {
        }
    }

    public final void Q0(View view) {
        view.setTag(R.id.dataBinding, this);
    }
}
