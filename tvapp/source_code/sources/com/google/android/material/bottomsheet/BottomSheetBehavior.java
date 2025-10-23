package com.google.android.material.bottomsheet;

import F3.l;
import H.j;
import I.h;
import J3.f;
import J3.g;
import J3.k;
import K.B;
import K.C0025a;
import K.C0026b;
import K.D;
import K.O;
import L.d;
import T.e;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.boxhdo.android.tv.R;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import com.google.android.gms.internal.measurement.K1;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import t3.RunnableC1249m;
import u3.AbstractC1272a;
import x.AbstractC1438a;
import x.C1441d;
import z3.C1514a;
import z3.C1515b;
import z3.RunnableC1516c;
/* loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends AbstractC1438a {

    /* renamed from: A  reason: collision with root package name */
    public int f8746A;

    /* renamed from: B  reason: collision with root package name */
    public final float f8747B;

    /* renamed from: C  reason: collision with root package name */
    public boolean f8748C;

    /* renamed from: D  reason: collision with root package name */
    public boolean f8749D;

    /* renamed from: E  reason: collision with root package name */
    public final boolean f8750E;
    public int F;

    /* renamed from: G  reason: collision with root package name */
    public e f8751G;

    /* renamed from: H  reason: collision with root package name */
    public boolean f8752H;

    /* renamed from: I  reason: collision with root package name */
    public int f8753I;

    /* renamed from: J  reason: collision with root package name */
    public boolean f8754J;

    /* renamed from: K  reason: collision with root package name */
    public int f8755K;

    /* renamed from: L  reason: collision with root package name */
    public int f8756L;

    /* renamed from: M  reason: collision with root package name */
    public int f8757M;

    /* renamed from: N  reason: collision with root package name */
    public WeakReference f8758N;

    /* renamed from: O  reason: collision with root package name */
    public WeakReference f8759O;

    /* renamed from: P  reason: collision with root package name */
    public final ArrayList f8760P;

    /* renamed from: Q  reason: collision with root package name */
    public VelocityTracker f8761Q;

    /* renamed from: R  reason: collision with root package name */
    public int f8762R;

    /* renamed from: S  reason: collision with root package name */
    public int f8763S;

    /* renamed from: T  reason: collision with root package name */
    public boolean f8764T;

    /* renamed from: U  reason: collision with root package name */
    public HashMap f8765U;

    /* renamed from: V  reason: collision with root package name */
    public int f8766V;
    public final C1514a W;

    /* renamed from: a  reason: collision with root package name */
    public final int f8767a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f8768b;

    /* renamed from: c  reason: collision with root package name */
    public final float f8769c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f8770e;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public final int f8771g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f8772h;

    /* renamed from: i  reason: collision with root package name */
    public g f8773i;

    /* renamed from: j  reason: collision with root package name */
    public final int f8774j;

    /* renamed from: k  reason: collision with root package name */
    public int f8775k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f8776l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f8777m;
    public final boolean n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f8778o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f8779p;

    /* renamed from: q  reason: collision with root package name */
    public int f8780q;

    /* renamed from: r  reason: collision with root package name */
    public int f8781r;

    /* renamed from: s  reason: collision with root package name */
    public k f8782s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f8783t;

    /* renamed from: u  reason: collision with root package name */
    public RunnableC1516c f8784u;

    /* renamed from: v  reason: collision with root package name */
    public final ValueAnimator f8785v;

    /* renamed from: w  reason: collision with root package name */
    public final int f8786w;

    /* renamed from: x  reason: collision with root package name */
    public int f8787x;

    /* renamed from: y  reason: collision with root package name */
    public int f8788y;

    /* renamed from: z  reason: collision with root package name */
    public final float f8789z;

    public BottomSheetBehavior() {
        this.f8767a = 0;
        this.f8768b = true;
        this.f8774j = -1;
        this.f8784u = null;
        this.f8789z = 0.5f;
        this.f8747B = -1.0f;
        this.f8750E = true;
        this.F = 4;
        this.f8760P = new ArrayList();
        this.f8766V = -1;
        this.W = new C1514a(this);
    }

    public static View v(View view) {
        Field field = O.f1447a;
        if (D.p(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View v5 = v(viewGroup.getChildAt(i7));
                if (v5 != null) {
                    return v5;
                }
            }
            return null;
        }
        return null;
    }

    public final void A(View view, int i7) {
        int i8;
        int i9;
        if (i7 == 4) {
            i8 = this.f8746A;
        } else if (i7 == 6) {
            i8 = this.f8788y;
            if (this.f8768b && i8 <= (i9 = this.f8787x)) {
                i7 = 3;
                i8 = i9;
            }
        } else if (i7 == 3) {
            i8 = w();
        } else if (this.f8748C && i7 == 5) {
            i8 = this.f8757M;
        } else {
            throw new IllegalArgumentException(AbstractC0515y1.l("Illegal state argument: ", i7));
        }
        D(i7, i8, view, false);
    }

    public final void B(int i7) {
        View view = (View) this.f8758N.get();
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            Field field = O.f1447a;
            if (view.isAttachedToWindow()) {
                view.post(new androidx.activity.g(this, view, i7));
                return;
            }
        }
        A(view, i7);
    }

    public final boolean C(View view, float f) {
        if (this.f8749D) {
            return true;
        }
        if (view.getTop() < this.f8746A) {
            return false;
        }
        return Math.abs(((f * 0.1f) + ((float) view.getTop())) - ((float) this.f8746A)) / ((float) s()) > 0.5f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
        if (r4 != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
        z(2);
        F(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0037, code lost:
        if (r2.f8784u != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
        r2.f8784u = new z3.RunnableC1516c(r2, r5, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0040, code lost:
        r4 = r2.f8784u;
        r6 = r4.f16451r;
        r4.f16452s = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
        if (r6 != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
        r3 = K.O.f1447a;
        r5.postOnAnimation(r4);
        r2.f8784u.f16451r = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000e, code lost:
        if (r0.o(r5.getLeft(), r4) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D(int r3, int r4, android.view.View r5, boolean r6) {
        /*
            r2 = this;
            T.e r0 = r2.f8751G
            if (r0 == 0) goto L53
            if (r6 == 0) goto L11
            int r6 = r5.getLeft()
            boolean r4 = r0.o(r6, r4)
            if (r4 == 0) goto L53
            goto L2e
        L11:
            int r6 = r5.getLeft()
            r0.f3196r = r5
            r1 = -1
            r0.f3184c = r1
            r1 = 0
            boolean r4 = r0.h(r6, r4, r1, r1)
            if (r4 != 0) goto L2c
            int r6 = r0.f3182a
            if (r6 != 0) goto L2c
            android.view.View r6 = r0.f3196r
            if (r6 == 0) goto L2c
            r6 = 0
            r0.f3196r = r6
        L2c:
            if (r4 == 0) goto L53
        L2e:
            r4 = 2
            r2.z(r4)
            r2.F(r3)
            z3.c r4 = r2.f8784u
            if (r4 != 0) goto L40
            z3.c r4 = new z3.c
            r4.<init>(r2, r5, r3)
            r2.f8784u = r4
        L40:
            z3.c r4 = r2.f8784u
            boolean r6 = r4.f16451r
            r4.f16452s = r3
            if (r6 != 0) goto L56
            java.lang.reflect.Field r3 = K.O.f1447a
            r5.postOnAnimation(r4)
            z3.c r3 = r2.f8784u
            r4 = 1
            r3.f16451r = r4
            goto L56
        L53:
            r2.z(r3)
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.D(int, int, android.view.View, boolean):void");
    }

    public final void E() {
        View view;
        d dVar;
        j jVar;
        int i7;
        boolean z7;
        C0026b c0026b;
        WeakReference weakReference = this.f8758N;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        O.f(view, 524288);
        O.d(view, 0);
        O.f(view, 262144);
        O.d(view, 0);
        O.f(view, 1048576);
        O.d(view, 0);
        int i8 = this.f8766V;
        if (i8 != -1) {
            O.f(view, i8);
            O.d(view, 0);
        }
        int i9 = 6;
        if (!this.f8768b && this.F != 6) {
            String string = view.getResources().getString(R.string.bottomsheet_action_expand_halfway);
            j jVar2 = new j(6, this);
            ArrayList b7 = O.b(view);
            int i10 = 0;
            while (true) {
                if (i10 < b7.size()) {
                    if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((d) b7.get(i10)).f1850a).getLabel())) {
                        i7 = ((d) b7.get(i10)).a();
                        break;
                    }
                    i10++;
                } else {
                    int i11 = -1;
                    for (int i12 = 0; i12 < 32 && i11 == -1; i12++) {
                        int i13 = O.f1449c[i12];
                        boolean z8 = true;
                        for (int i14 = 0; i14 < b7.size(); i14++) {
                            if (((d) b7.get(i14)).a() != i13) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            z8 &= z7;
                        }
                        if (z8) {
                            i11 = i13;
                        }
                    }
                    i7 = i11;
                }
            }
            if (i7 != -1) {
                d dVar2 = new d(null, i7, string, jVar2, null);
                View.AccessibilityDelegate a7 = O.a(view);
                if (a7 == null) {
                    c0026b = null;
                } else if (a7 instanceof C0025a) {
                    c0026b = ((C0025a) a7).f1464a;
                } else {
                    c0026b = new C0026b(a7);
                }
                if (c0026b == null) {
                    c0026b = new C0026b();
                }
                O.i(view, c0026b);
                O.f(view, dVar2.a());
                O.b(view).add(dVar2);
                O.d(view, 0);
            }
            this.f8766V = i7;
        }
        if (this.f8748C && this.F != 5) {
            O.g(view, d.f1844j, new j(5, this));
        }
        int i15 = this.F;
        if (i15 != 3) {
            if (i15 != 4) {
                if (i15 == 6) {
                    O.g(view, d.f1843i, new j(4, this));
                    dVar = d.f1842h;
                    jVar = new j(3, this);
                } else {
                    return;
                }
            } else {
                if (this.f8768b) {
                    i9 = 3;
                }
                dVar = d.f1842h;
                jVar = new j(i9, this);
            }
        } else {
            if (this.f8768b) {
                i9 = 4;
            }
            dVar = d.f1843i;
            jVar = new j(i9, this);
        }
        O.g(view, dVar, jVar);
    }

    public final void F(int i7) {
        ValueAnimator valueAnimator = this.f8785v;
        if (i7 == 2) {
            return;
        }
        boolean z7 = i7 == 3;
        if (this.f8783t != z7) {
            this.f8783t = z7;
            if (this.f8773i == null || valueAnimator == null) {
                return;
            }
            if (valueAnimator.isRunning()) {
                valueAnimator.reverse();
                return;
            }
            float f = z7 ? 0.0f : 1.0f;
            valueAnimator.setFloatValues(1.0f - f, f);
            valueAnimator.start();
        }
    }

    public final void G(boolean z7) {
        WeakReference weakReference = this.f8758N;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z7) {
                if (this.f8765U != null) {
                    return;
                }
                this.f8765U = new HashMap(childCount);
            }
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = coordinatorLayout.getChildAt(i7);
                if (childAt != this.f8758N.get() && z7) {
                    this.f8765U.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z7) {
                return;
            }
            this.f8765U = null;
        }
    }

    public final void H() {
        View view;
        if (this.f8758N != null) {
            r();
            if (this.F == 4 && (view = (View) this.f8758N.get()) != null) {
                view.requestLayout();
            }
        }
    }

    @Override // x.AbstractC1438a
    public final void c(C1441d c1441d) {
        this.f8758N = null;
        this.f8751G = null;
    }

    @Override // x.AbstractC1438a
    public final void e() {
        this.f8758N = null;
        this.f8751G = null;
    }

    @Override // x.AbstractC1438a
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z7;
        View view2;
        e eVar;
        if (view.isShown() && this.f8750E) {
            int actionMasked = motionEvent.getActionMasked();
            View view3 = null;
            if (actionMasked == 0) {
                this.f8762R = -1;
                VelocityTracker velocityTracker = this.f8761Q;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.f8761Q = null;
                }
            }
            if (this.f8761Q == null) {
                this.f8761Q = VelocityTracker.obtain();
            }
            this.f8761Q.addMovement(motionEvent);
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    this.f8764T = false;
                    this.f8762R = -1;
                    if (this.f8752H) {
                        this.f8752H = false;
                        return false;
                    }
                }
            } else {
                int x7 = (int) motionEvent.getX();
                this.f8763S = (int) motionEvent.getY();
                if (this.F != 2) {
                    WeakReference weakReference = this.f8759O;
                    if (weakReference != null) {
                        view2 = (View) weakReference.get();
                    } else {
                        view2 = null;
                    }
                    if (view2 != null && coordinatorLayout.o(view2, x7, this.f8763S)) {
                        this.f8762R = motionEvent.getPointerId(motionEvent.getActionIndex());
                        this.f8764T = true;
                    }
                }
                if (this.f8762R == -1 && !coordinatorLayout.o(view, x7, this.f8763S)) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                this.f8752H = z7;
            }
            if (!this.f8752H && (eVar = this.f8751G) != null && eVar.p(motionEvent)) {
                return true;
            }
            WeakReference weakReference2 = this.f8759O;
            if (weakReference2 != null) {
                view3 = (View) weakReference2.get();
            }
            if (actionMasked != 2 || view3 == null || this.f8752H || this.F == 1 || coordinatorLayout.o(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f8751G == null || Math.abs(this.f8763S - motionEvent.getY()) <= this.f8751G.f3183b) {
                return false;
            }
            return true;
        }
        this.f8752H = true;
        return false;
    }

    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object, F3.m] */
    @Override // x.AbstractC1438a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i7) {
        int i8;
        boolean z7;
        boolean z8;
        float f;
        g gVar;
        int i9 = this.f8774j;
        Field field = O.f1447a;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.f8758N == null) {
            this.f = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            if (Build.VERSION.SDK_INT >= 29 && !this.f8776l && !this.f8770e) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (this.f8777m || this.n || this.f8778o || z7) {
                h hVar = new h(this, z7);
                int paddingStart = view.getPaddingStart();
                view.getPaddingTop();
                int paddingEnd = view.getPaddingEnd();
                int paddingBottom = view.getPaddingBottom();
                ?? obj = new Object();
                obj.f726a = paddingStart;
                obj.f727b = paddingEnd;
                obj.f728c = paddingBottom;
                D.u(view, new K1(hVar, 5, (Object) obj));
                if (view.isAttachedToWindow()) {
                    B.c(view);
                } else {
                    view.addOnAttachStateChangeListener(new l(0));
                }
            }
            this.f8758N = new WeakReference(view);
            if (this.f8772h && (gVar = this.f8773i) != null) {
                view.setBackground(gVar);
            }
            g gVar2 = this.f8773i;
            if (gVar2 != null) {
                float f7 = this.f8747B;
                if (f7 == -1.0f) {
                    f7 = D.i(view);
                }
                gVar2.i(f7);
                if (this.F == 3) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                this.f8783t = z8;
                g gVar3 = this.f8773i;
                if (z8) {
                    f = 0.0f;
                } else {
                    f = 1.0f;
                }
                f fVar = gVar3.f1362q;
                if (fVar.f1339j != f) {
                    fVar.f1339j = f;
                    gVar3.f1366u = true;
                    gVar3.invalidateSelf();
                }
            }
            E();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            if (view.getMeasuredWidth() > i9 && i9 != -1) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.width = i9;
                view.post(new RunnableC1249m(view, layoutParams, 6, false));
            }
        }
        if (this.f8751G == null) {
            this.f8751G = new e(coordinatorLayout.getContext(), coordinatorLayout, this.W);
        }
        int top = view.getTop();
        coordinatorLayout.q(view, i7);
        this.f8756L = coordinatorLayout.getWidth();
        this.f8757M = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.f8755K = height;
        int i10 = this.f8757M;
        int i11 = i10 - height;
        int i12 = this.f8781r;
        if (i11 < i12) {
            if (this.f8779p) {
                this.f8755K = i10;
            } else {
                this.f8755K = i10 - i12;
            }
        }
        this.f8787x = Math.max(0, i10 - this.f8755K);
        this.f8788y = (int) ((1.0f - this.f8789z) * this.f8757M);
        r();
        int i13 = this.F;
        if (i13 == 3) {
            i8 = w();
        } else if (i13 == 6) {
            i8 = this.f8788y;
        } else if (this.f8748C && i13 == 5) {
            i8 = this.f8757M;
        } else if (i13 == 4) {
            i8 = this.f8746A;
        } else {
            if (i13 == 1 || i13 == 2) {
                view.offsetTopAndBottom(top - view.getTop());
            }
            this.f8759O = new WeakReference(v(view));
            return true;
        }
        view.offsetTopAndBottom(i8);
        this.f8759O = new WeakReference(v(view));
        return true;
    }

    @Override // x.AbstractC1438a
    public final boolean i(View view) {
        WeakReference weakReference = this.f8759O;
        if (weakReference == null || view != weakReference.get() || this.F == 3) {
            return false;
        }
        return true;
    }

    @Override // x.AbstractC1438a
    public final void j(CoordinatorLayout coordinatorLayout, View view, View view2, int i7, int i8, int[] iArr, int i9) {
        View view3;
        int i10;
        int i11;
        boolean z7 = this.f8750E;
        if (i9 == 1) {
            return;
        }
        WeakReference weakReference = this.f8759O;
        if (weakReference != null) {
            view3 = (View) weakReference.get();
        } else {
            view3 = null;
        }
        if (view2 != view3) {
            return;
        }
        int top = view.getTop();
        int i12 = top - i8;
        if (i8 > 0) {
            if (i12 < w()) {
                int w7 = top - w();
                iArr[1] = w7;
                Field field = O.f1447a;
                view.offsetTopAndBottom(-w7);
                i11 = 3;
                z(i11);
            } else if (!z7) {
                return;
            } else {
                iArr[1] = i8;
                i10 = -i8;
                Field field2 = O.f1447a;
                view.offsetTopAndBottom(i10);
                z(1);
            }
        } else if (i8 < 0 && !view2.canScrollVertically(-1)) {
            int i13 = this.f8746A;
            if (i12 > i13 && !this.f8748C) {
                int i14 = top - i13;
                iArr[1] = i14;
                Field field3 = O.f1447a;
                view.offsetTopAndBottom(-i14);
                i11 = 4;
                z(i11);
            } else if (!z7) {
                return;
            } else {
                iArr[1] = i8;
                i10 = -i8;
                Field field4 = O.f1447a;
                view.offsetTopAndBottom(i10);
                z(1);
            }
        }
        u(view.getTop());
        this.f8753I = i8;
        this.f8754J = true;
    }

    @Override // x.AbstractC1438a
    public final void m(View view, Parcelable parcelable) {
        C1515b c1515b = (C1515b) parcelable;
        int i7 = this.f8767a;
        if (i7 != 0) {
            if (i7 == -1 || (i7 & 1) == 1) {
                this.d = c1515b.f16446t;
            }
            if (i7 == -1 || (i7 & 2) == 2) {
                this.f8768b = c1515b.f16447u;
            }
            if (i7 == -1 || (i7 & 4) == 4) {
                this.f8748C = c1515b.f16448v;
            }
            if (i7 == -1 || (i7 & 8) == 8) {
                this.f8749D = c1515b.f16449w;
            }
        }
        int i8 = c1515b.f16445s;
        if (i8 != 1 && i8 != 2) {
            this.F = i8;
        } else {
            this.F = 4;
        }
    }

    @Override // x.AbstractC1438a
    public final Parcelable n(View view) {
        return new C1515b(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // x.AbstractC1438a
    public final boolean o(View view, int i7, int i8) {
        this.f8753I = 0;
        this.f8754J = false;
        if ((i7 & 2) == 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a2, code lost:
        if (java.lang.Math.abs(r5 - r2) < java.lang.Math.abs(r5 - r3.f8746A)) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c0, code lost:
        if (java.lang.Math.abs(r5 - r3.f8788y) < java.lang.Math.abs(r5 - r3.f8746A)) goto L45;
     */
    @Override // x.AbstractC1438a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(android.view.View r4, android.view.View r5, int r6) {
        /*
            r3 = this;
            int r6 = r4.getTop()
            int r0 = r3.w()
            r1 = 3
            if (r6 != r0) goto Lf
            r3.z(r1)
            return
        Lf:
            java.lang.ref.WeakReference r6 = r3.f8759O
            if (r6 == 0) goto Lcb
            java.lang.Object r6 = r6.get()
            if (r5 != r6) goto Lcb
            boolean r5 = r3.f8754J
            if (r5 != 0) goto L1f
            goto Lcb
        L1f:
            int r5 = r3.f8753I
            r6 = 6
            if (r5 <= 0) goto L3e
            boolean r5 = r3.f8768b
            if (r5 == 0) goto L2c
            int r5 = r3.f8787x
            goto Lc5
        L2c:
            int r5 = r4.getTop()
            int r0 = r3.f8788y
            if (r5 <= r0) goto L38
            r1 = r6
            r5 = r0
            goto Lc5
        L38:
            int r5 = r3.w()
            goto Lc5
        L3e:
            boolean r5 = r3.f8748C
            if (r5 == 0) goto L61
            android.view.VelocityTracker r5 = r3.f8761Q
            if (r5 != 0) goto L48
            r5 = 0
            goto L57
        L48:
            r0 = 1000(0x3e8, float:1.401E-42)
            float r2 = r3.f8769c
            r5.computeCurrentVelocity(r0, r2)
            android.view.VelocityTracker r5 = r3.f8761Q
            int r0 = r3.f8762R
            float r5 = r5.getYVelocity(r0)
        L57:
            boolean r5 = r3.C(r4, r5)
            if (r5 == 0) goto L61
            int r5 = r3.f8757M
            r1 = 5
            goto Lc5
        L61:
            int r5 = r3.f8753I
            r0 = 4
            if (r5 != 0) goto La5
            int r5 = r4.getTop()
            boolean r2 = r3.f8768b
            if (r2 == 0) goto L82
            int r6 = r3.f8787x
            int r6 = r5 - r6
            int r6 = java.lang.Math.abs(r6)
            int r2 = r3.f8746A
            int r5 = r5 - r2
            int r5 = java.lang.Math.abs(r5)
            if (r6 >= r5) goto La9
            int r5 = r3.f8787x
            goto Lc5
        L82:
            int r2 = r3.f8788y
            if (r5 >= r2) goto L95
            int r0 = r3.f8746A
            int r0 = r5 - r0
            int r0 = java.lang.Math.abs(r0)
            if (r5 >= r0) goto Lc2
            int r5 = r3.w()
            goto Lc5
        L95:
            int r1 = r5 - r2
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.f8746A
            int r5 = r5 - r2
            int r5 = java.lang.Math.abs(r5)
            if (r1 >= r5) goto La9
            goto Lc2
        La5:
            boolean r5 = r3.f8768b
            if (r5 == 0) goto Lad
        La9:
            int r5 = r3.f8746A
            r1 = r0
            goto Lc5
        Lad:
            int r5 = r4.getTop()
            int r1 = r3.f8788y
            int r1 = r5 - r1
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.f8746A
            int r5 = r5 - r2
            int r5 = java.lang.Math.abs(r5)
            if (r1 >= r5) goto La9
        Lc2:
            int r5 = r3.f8788y
            r1 = r6
        Lc5:
            r6 = 0
            r3.D(r1, r5, r4, r6)
            r3.f8754J = r6
        Lcb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.p(android.view.View, android.view.View, int):void");
    }

    @Override // x.AbstractC1438a
    public final boolean q(View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.F == 1 && actionMasked == 0) {
            return true;
        }
        e eVar = this.f8751G;
        if (eVar != null) {
            eVar.j(motionEvent);
        }
        if (actionMasked == 0) {
            this.f8762R = -1;
            VelocityTracker velocityTracker = this.f8761Q;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f8761Q = null;
            }
        }
        if (this.f8761Q == null) {
            this.f8761Q = VelocityTracker.obtain();
        }
        this.f8761Q.addMovement(motionEvent);
        if (this.f8751G != null && actionMasked == 2 && !this.f8752H) {
            float abs = Math.abs(this.f8763S - motionEvent.getY());
            e eVar2 = this.f8751G;
            if (abs > eVar2.f3183b) {
                eVar2.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f8752H;
    }

    public final void r() {
        int s6 = s();
        if (this.f8768b) {
            this.f8746A = Math.max(this.f8757M - s6, this.f8787x);
        } else {
            this.f8746A = this.f8757M - s6;
        }
    }

    public final int s() {
        int i7;
        return this.f8770e ? Math.min(Math.max(this.f, this.f8757M - ((this.f8756L * 9) / 16)), this.f8755K) + this.f8780q : (this.f8776l || this.f8777m || (i7 = this.f8775k) <= 0) ? this.d + this.f8780q : Math.max(this.d, i7 + this.f8771g);
    }

    public final void t(Context context, AttributeSet attributeSet, boolean z7, ColorStateList colorStateList) {
        if (this.f8772h) {
            this.f8782s = k.b(context, attributeSet, R.attr.bottomSheetStyle, 2132017827).a();
            g gVar = new g(this.f8782s);
            this.f8773i = gVar;
            gVar.h(context);
            if (z7 && colorStateList != null) {
                this.f8773i.j(colorStateList);
                return;
            }
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(16842801, typedValue, true);
            this.f8773i.setTint(typedValue.data);
        }
    }

    public final void u(int i7) {
        if (((View) this.f8758N.get()) != null) {
            ArrayList arrayList = this.f8760P;
            if (arrayList.isEmpty()) {
                return;
            }
            int i8 = this.f8746A;
            if (i7 <= i8 && i8 != w()) {
                w();
            }
            if (arrayList.size() <= 0) {
                return;
            }
            AbstractC0515y1.v(arrayList.get(0));
            throw null;
        }
    }

    public final int w() {
        if (this.f8768b) {
            return this.f8787x;
        }
        return Math.max(this.f8786w, this.f8779p ? 0 : this.f8781r);
    }

    public final void x(int i7) {
        if (i7 == -1) {
            if (!this.f8770e) {
                this.f8770e = true;
            } else {
                return;
            }
        } else if (this.f8770e || this.d != i7) {
            this.f8770e = false;
            this.d = Math.max(0, i7);
        } else {
            return;
        }
        H();
    }

    public final void y(int i7) {
        if (i7 == this.F) {
            return;
        }
        if (this.f8758N != null) {
            B(i7);
        } else if (i7 == 4 || i7 == 3 || i7 == 6 || (this.f8748C && i7 == 5)) {
            this.F = i7;
        }
    }

    public final void z(int i7) {
        if (this.F == i7) {
            return;
        }
        this.F = i7;
        WeakReference weakReference = this.f8758N;
        if (weakReference == null || ((View) weakReference.get()) == null) {
            return;
        }
        if (i7 == 3) {
            G(true);
        } else if (i7 == 6 || i7 == 5 || i7 == 4) {
            G(false);
        }
        F(i7);
        ArrayList arrayList = this.f8760P;
        if (arrayList.size() <= 0) {
            E();
        } else {
            AbstractC0515y1.v(arrayList.get(0));
            throw null;
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int dimensionPixelOffset;
        int i7;
        this.f8767a = 0;
        this.f8768b = true;
        this.f8774j = -1;
        this.f8784u = null;
        this.f8789z = 0.5f;
        this.f8747B = -1.0f;
        this.f8750E = true;
        this.F = 4;
        this.f8760P = new ArrayList();
        this.f8766V = -1;
        this.W = new C1514a(this);
        this.f8771g = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1272a.f14948a);
        this.f8772h = obtainStyledAttributes.hasValue(16);
        boolean hasValue = obtainStyledAttributes.hasValue(2);
        if (hasValue) {
            t(context, attributeSet, hasValue, m3.g.p(context, obtainStyledAttributes, 2));
        } else {
            t(context, attributeSet, hasValue, null);
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f8785v = ofFloat;
        ofFloat.setDuration(500L);
        this.f8785v.addUpdateListener(new L3.k(4, this));
        this.f8747B = obtainStyledAttributes.getDimension(1, -1.0f);
        if (obtainStyledAttributes.hasValue(0)) {
            this.f8774j = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(8);
        if (peekValue == null || (i7 = peekValue.data) != -1) {
            x(obtainStyledAttributes.getDimensionPixelSize(8, -1));
        } else {
            x(i7);
        }
        boolean z7 = obtainStyledAttributes.getBoolean(7, false);
        if (this.f8748C != z7) {
            this.f8748C = z7;
            if (!z7 && this.F == 5) {
                y(4);
            }
            E();
        }
        this.f8776l = obtainStyledAttributes.getBoolean(11, false);
        boolean z8 = obtainStyledAttributes.getBoolean(5, true);
        if (this.f8768b != z8) {
            this.f8768b = z8;
            if (this.f8758N != null) {
                r();
            }
            z((this.f8768b && this.F == 6) ? 3 : this.F);
            E();
        }
        this.f8749D = obtainStyledAttributes.getBoolean(10, false);
        this.f8750E = obtainStyledAttributes.getBoolean(3, true);
        this.f8767a = obtainStyledAttributes.getInt(9, 0);
        float f = obtainStyledAttributes.getFloat(6, 0.5f);
        if (f > 0.0f && f < 1.0f) {
            this.f8789z = f;
            if (this.f8758N != null) {
                this.f8788y = (int) ((1.0f - f) * this.f8757M);
            }
            TypedValue peekValue2 = obtainStyledAttributes.peekValue(4);
            if (peekValue2 == null || peekValue2.type != 16) {
                dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(4, 0);
                if (dimensionPixelOffset < 0) {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            } else {
                dimensionPixelOffset = peekValue2.data;
                if (dimensionPixelOffset < 0) {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            }
            this.f8786w = dimensionPixelOffset;
            this.f8777m = obtainStyledAttributes.getBoolean(12, false);
            this.n = obtainStyledAttributes.getBoolean(13, false);
            this.f8778o = obtainStyledAttributes.getBoolean(14, false);
            this.f8779p = obtainStyledAttributes.getBoolean(15, true);
            obtainStyledAttributes.recycle();
            this.f8769c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }

    @Override // x.AbstractC1438a
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i7, int i8, int i9, int[] iArr) {
    }
}
