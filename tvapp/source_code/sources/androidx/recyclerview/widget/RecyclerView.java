package androidx.recyclerview.widget;

import K.C0032h;
import K.C0037m;
import K.C0040p;
import K.D;
import M2.e;
import R.a;
import S.b;
import T.d;
import Z2.C0163h;
import Z5.n;
import android.animation.LayoutTransition;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.datastore.preferences.protobuf.C0230i;
import com.boxhdo.android.tv.R;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import com.google.android.material.datepicker.c;
import com.rubensousa.dpadrecyclerview.DpadRecyclerView;
import com.rubensousa.dpadrecyclerview.layoutmanager.PivotLayoutManager;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import k3.AbstractC0958a;
import o.C1054g;
import o.j;
import p6.l;
import s.h;
import t2.i;
import w0.C;
import w0.C1347a;
import w0.C1365t;
import w0.J;
import w0.K;
import w0.L;
import w0.N;
import w0.O;
import w0.P;
import w0.Q;
import w0.RunnableC1367v;
import w0.U;
import w0.V;
import w0.W;
import w0.X;
import w0.Y;
import w0.Z;
import w0.a0;
import w0.b0;
import w0.c0;
import w0.d0;
import w0.g0;
import w0.h0;
import w0.i0;
import w0.j0;
import w0.k0;
import w0.m0;
import w0.s0;
/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup {

    /* renamed from: T0 */
    public static boolean f6880T0 = false;
    public static boolean U0 = false;

    /* renamed from: V0 */
    public static final int[] f6881V0 = {16843830};

    /* renamed from: W0 */
    public static final float f6882W0 = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* renamed from: X0 */
    public static final boolean f6883X0 = true;

    /* renamed from: Y0 */
    public static final boolean f6884Y0 = true;

    /* renamed from: Z0 */
    public static final boolean f6885Z0 = true;

    /* renamed from: a1 */
    public static final Class[] f6886a1;

    /* renamed from: b1 */
    public static final d f6887b1;

    /* renamed from: c1 */
    public static final h0 f6888c1;

    /* renamed from: A */
    public final Rect f6889A;

    /* renamed from: A0 */
    public boolean f6890A0;

    /* renamed from: B */
    public final RectF f6891B;

    /* renamed from: B0 */
    public boolean f6892B0;

    /* renamed from: C */
    public L f6893C;

    /* renamed from: C0 */
    public final K f6894C0;

    /* renamed from: D */
    public U f6895D;

    /* renamed from: D0 */
    public boolean f6896D0;

    /* renamed from: E */
    public b0 f6897E;

    /* renamed from: E0 */
    public m0 f6898E0;
    public final ArrayList F;

    /* renamed from: F0 */
    public N f6899F0;

    /* renamed from: G */
    public final ArrayList f6900G;
    public final int[] G0;

    /* renamed from: H */
    public final ArrayList f6901H;

    /* renamed from: H0 */
    public C0037m f6902H0;

    /* renamed from: I */
    public C1365t f6903I;

    /* renamed from: I0 */
    public final int[] f6904I0;

    /* renamed from: J */
    public boolean f6905J;

    /* renamed from: J0 */
    public final int[] f6906J0;

    /* renamed from: K */
    public boolean f6907K;

    /* renamed from: K0 */
    public final int[] f6908K0;

    /* renamed from: L */
    public boolean f6909L;

    /* renamed from: L0 */
    public final ArrayList f6910L0;

    /* renamed from: M */
    public int f6911M;

    /* renamed from: M0 */
    public final J f6912M0;

    /* renamed from: N */
    public boolean f6913N;

    /* renamed from: N0 */
    public boolean f6914N0;

    /* renamed from: O */
    public boolean f6915O;

    /* renamed from: O0 */
    public int f6916O0;

    /* renamed from: P */
    public boolean f6917P;

    /* renamed from: P0 */
    public int f6918P0;

    /* renamed from: Q */
    public int f6919Q;

    /* renamed from: Q0 */
    public final boolean f6920Q0;

    /* renamed from: R */
    public boolean f6921R;

    /* renamed from: R0 */
    public final K f6922R0;

    /* renamed from: S */
    public final AccessibilityManager f6923S;

    /* renamed from: S0 */
    public final C0032h f6924S0;

    /* renamed from: T */
    public boolean f6925T;

    /* renamed from: U */
    public boolean f6926U;

    /* renamed from: V */
    public int f6927V;
    public int W;

    /* renamed from: a0 */
    public O f6928a0;

    /* renamed from: b0 */
    public EdgeEffect f6929b0;

    /* renamed from: c0 */
    public EdgeEffect f6930c0;

    /* renamed from: d0 */
    public EdgeEffect f6931d0;

    /* renamed from: e0 */
    public EdgeEffect f6932e0;

    /* renamed from: f0 */
    public P f6933f0;

    /* renamed from: g0 */
    public int f6934g0;

    /* renamed from: h0 */
    public int f6935h0;

    /* renamed from: i0 */
    public VelocityTracker f6936i0;

    /* renamed from: j0 */
    public int f6937j0;

    /* renamed from: k0 */
    public int f6938k0;

    /* renamed from: l0 */
    public int f6939l0;

    /* renamed from: m0 */
    public int f6940m0;

    /* renamed from: n0 */
    public int f6941n0;

    /* renamed from: o0 */
    public W f6942o0;

    /* renamed from: p0 */
    public final int f6943p0;

    /* renamed from: q */
    public final float f6944q;

    /* renamed from: q0 */
    public final int f6945q0;

    /* renamed from: r */
    public final c0 f6946r;

    /* renamed from: r0 */
    public final float f6947r0;

    /* renamed from: s */
    public final a0 f6948s;

    /* renamed from: s0 */
    public final float f6949s0;

    /* renamed from: t */
    public d0 f6950t;

    /* renamed from: t0 */
    public boolean f6951t0;

    /* renamed from: u */
    public final c f6952u;

    /* renamed from: u0 */
    public final j0 f6953u0;

    /* renamed from: v */
    public final C0163h f6954v;

    /* renamed from: v0 */
    public RunnableC1367v f6955v0;

    /* renamed from: w */
    public final i f6956w;

    /* renamed from: w0 */
    public final C0230i f6957w0;

    /* renamed from: x */
    public boolean f6958x;

    /* renamed from: x0 */
    public final g0 f6959x0;

    /* renamed from: y */
    public final J f6960y;
    public X y0;

    /* renamed from: z */
    public final Rect f6961z;

    /* renamed from: z0 */
    public ArrayList f6962z0;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, w0.h0] */
    static {
        Class cls = Integer.TYPE;
        f6886a1 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f6887b1 = new d(1);
        f6888c1 = new Object();
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.recyclerViewStyle);
    }

    public static RecyclerView F(View view) {
        if (view instanceof ViewGroup) {
            if (view instanceof RecyclerView) {
                return (RecyclerView) view;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                RecyclerView F = F(viewGroup.getChildAt(i7));
                if (F != null) {
                    return F;
                }
            }
            return null;
        }
        return null;
    }

    public static int L(View view) {
        k0 N6 = N(view);
        if (N6 != null) {
            return N6.f();
        }
        return -1;
    }

    public static k0 N(View view) {
        if (view == null) {
            return null;
        }
        return ((V) view.getLayoutParams()).f15490a;
    }

    private C0037m getScrollingChildHelper() {
        if (this.f6902H0 == null) {
            this.f6902H0 = new C0037m(this);
        }
        return this.f6902H0;
    }

    public static void k(k0 k0Var) {
        WeakReference weakReference = k0Var.f15577b;
        if (weakReference != null) {
            Object obj = weakReference.get();
            while (true) {
                for (View view = (View) obj; view != null; view = null) {
                    if (view == k0Var.f15576a) {
                        return;
                    }
                    obj = view.getParent();
                    if (obj instanceof View) {
                        break;
                    }
                }
                k0Var.f15577b = null;
                return;
            }
        }
    }

    public static int n(int i7, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i8) {
        if (i7 > 0 && edgeEffect != null && l.t(edgeEffect) != 0.0f) {
            int round = Math.round(l.C(edgeEffect, ((-i7) * 4.0f) / i8, 0.5f) * ((-i8) / 4.0f));
            if (round != i7) {
                edgeEffect.finish();
            }
            return i7 - round;
        } else if (i7 < 0 && edgeEffect2 != null && l.t(edgeEffect2) != 0.0f) {
            float f = i8;
            int round2 = Math.round(l.C(edgeEffect2, (i7 * 4.0f) / f, 0.5f) * (f / 4.0f));
            if (round2 != i7) {
                edgeEffect2.finish();
            }
            return i7 - round2;
        } else {
            return i7;
        }
    }

    public static void setDebugAssertionsEnabled(boolean z7) {
        f6880T0 = z7;
    }

    public static void setVerboseLoggingEnabled(boolean z7) {
        U0 = z7;
    }

    public final String A() {
        return " " + super.toString() + ", adapter:" + this.f6893C + ", layout:" + this.f6895D + ", context:" + getContext();
    }

    public final void B(g0 g0Var) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.f6953u0.f15566s;
            g0Var.f15550o = overScroller.getFinalX() - overScroller.getCurrX();
            g0Var.f15551p = overScroller.getFinalY() - overScroller.getCurrY();
            return;
        }
        g0Var.f15550o = 0;
        g0Var.f15551p = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View C(android.view.View r3) {
        /*
            r2 = this;
        L0:
            android.view.ViewParent r0 = r3.getParent()
            if (r0 == 0) goto L10
            if (r0 == r2) goto L10
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L10
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            goto L0
        L10:
            if (r0 != r2) goto L13
            goto L14
        L13:
            r3 = 0
        L14:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C(android.view.View):android.view.View");
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0059, code lost:
        if (r6 == 2) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean D(android.view.MotionEvent r12) {
        /*
            r11 = this;
            int r0 = r12.getAction()
            java.util.ArrayList r1 = r11.f6901H
            int r2 = r1.size()
            r3 = 0
            r4 = r3
        Lc:
            if (r4 >= r2) goto L69
            java.lang.Object r5 = r1.get(r4)
            w0.t r5 = (w0.C1365t) r5
            int r6 = r5.f15677v
            r7 = 1
            r8 = 2
            if (r6 != r7) goto L59
            float r6 = r12.getX()
            float r9 = r12.getY()
            boolean r6 = r5.e(r6, r9)
            float r9 = r12.getX()
            float r10 = r12.getY()
            boolean r9 = r5.d(r9, r10)
            int r10 = r12.getAction()
            if (r10 != 0) goto L5d
            if (r6 != 0) goto L3c
            if (r9 == 0) goto L5d
        L3c:
            if (r9 == 0) goto L49
            r5.f15678w = r7
            float r6 = r12.getX()
            int r6 = (int) r6
            float r6 = (float) r6
            r5.f15671p = r6
            goto L55
        L49:
            if (r6 == 0) goto L55
            r5.f15678w = r8
            float r6 = r12.getY()
            int r6 = (int) r6
            float r6 = (float) r6
            r5.f15669m = r6
        L55:
            r5.g(r8)
            goto L5b
        L59:
            if (r6 != r8) goto L5d
        L5b:
            r6 = r7
            goto L5e
        L5d:
            r6 = r3
        L5e:
            if (r6 == 0) goto L66
            r6 = 3
            if (r0 == r6) goto L66
            r11.f6903I = r5
            return r7
        L66:
            int r4 = r4 + 1
            goto Lc
        L69:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.D(android.view.MotionEvent):boolean");
    }

    public final void E(int[] iArr) {
        int i7 = this.f6954v.i();
        if (i7 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i8 = Integer.MAX_VALUE;
        int i9 = Integer.MIN_VALUE;
        for (int i10 = 0; i10 < i7; i10++) {
            k0 N6 = N(this.f6954v.h(i10));
            if (!N6.t()) {
                int f = N6.f();
                if (f < i8) {
                    i8 = f;
                }
                if (f > i9) {
                    i9 = f;
                }
            }
        }
        iArr[0] = i8;
        iArr[1] = i9;
    }

    public final k0 G(int i7) {
        k0 k0Var = null;
        if (this.f6925T) {
            return null;
        }
        int l7 = this.f6954v.l();
        for (int i8 = 0; i8 < l7; i8++) {
            k0 N6 = N(this.f6954v.k(i8));
            if (N6 != null && !N6.m() && J(N6) == i7) {
                if (this.f6954v.o(N6.f15576a)) {
                    k0Var = N6;
                } else {
                    return N6;
                }
            }
        }
        return k0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x003a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final w0.k0 H(int r6, boolean r7) {
        /*
            r5 = this;
            Z2.h r0 = r5.f6954v
            int r0 = r0.l()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L3e
            Z2.h r3 = r5.f6954v
            android.view.View r3 = r3.k(r2)
            w0.k0 r3 = N(r3)
            if (r3 == 0) goto L3b
            boolean r4 = r3.m()
            if (r4 != 0) goto L3b
            if (r7 == 0) goto L23
            int r4 = r3.f15578c
            if (r4 == r6) goto L2a
            goto L3b
        L23:
            int r4 = r3.f()
            if (r4 == r6) goto L2a
            goto L3b
        L2a:
            Z2.h r1 = r5.f6954v
            java.lang.Cloneable r1 = r1.f4638u
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            android.view.View r4 = r3.f15576a
            boolean r1 = r1.contains(r4)
            if (r1 == 0) goto L3a
            r1 = r3
            goto L3b
        L3a:
            return r3
        L3b:
            int r2 = r2 + 1
            goto L8
        L3e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.H(int, boolean):w0.k0");
    }

    /* JADX WARN: Code restructure failed: missing block: B:334:0x01f7, code lost:
        if (r1 < r14) goto L75;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x00cd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:244:0x00e8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0223  */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean I(int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 549
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.I(int, int, int, int):boolean");
    }

    public final int J(k0 k0Var) {
        if (k0Var.h(524) || !k0Var.j()) {
            return -1;
        }
        c cVar = this.f6952u;
        int i7 = k0Var.f15578c;
        ArrayList arrayList = (ArrayList) cVar.f8852c;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            C1347a c1347a = (C1347a) arrayList.get(i8);
            int i9 = c1347a.f15499a;
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 == 8) {
                        int i10 = c1347a.f15500b;
                        if (i10 == i7) {
                            i7 = c1347a.d;
                        } else {
                            if (i10 < i7) {
                                i7--;
                            }
                            if (c1347a.d <= i7) {
                                i7++;
                            }
                        }
                    }
                } else {
                    int i11 = c1347a.f15500b;
                    if (i11 <= i7) {
                        int i12 = c1347a.d;
                        if (i11 + i12 > i7) {
                            return -1;
                        }
                        i7 -= i12;
                    } else {
                        continue;
                    }
                }
            } else if (c1347a.f15500b <= i7) {
                i7 += c1347a.d;
            }
        }
        return i7;
    }

    public final long K(k0 k0Var) {
        if (this.f6893C.f15467b) {
            return k0Var.f15579e;
        }
        return k0Var.f15578c;
    }

    public final k0 M(View view) {
        ViewParent parent = view.getParent();
        if (parent != null && parent != this) {
            throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
        }
        return N(view);
    }

    public final Rect O(View view) {
        V v5 = (V) view.getLayoutParams();
        boolean z7 = v5.f15492c;
        Rect rect = v5.f15491b;
        if (!z7) {
            return rect;
        }
        g0 g0Var = this.f6959x0;
        if (g0Var.f15543g && (v5.f15490a.p() || v5.f15490a.k())) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.f6900G;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            Rect rect2 = this.f6961z;
            rect2.set(0, 0, 0, 0);
            ((Q) arrayList.get(i7)).a(rect2, view, this, g0Var);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        v5.f15492c = false;
        return rect;
    }

    public final boolean P() {
        return !this.f6909L || this.f6925T || this.f6952u.k();
    }

    public boolean Q() {
        return isChildrenDrawingOrderEnabled();
    }

    public final boolean R() {
        return this.f6927V > 0;
    }

    public final void S(int i7) {
        if (this.f6895D == null) {
            return;
        }
        setScrollState(2);
        this.f6895D.K0(i7);
        awakenScrollBars();
    }

    public final void T() {
        int l7 = this.f6954v.l();
        for (int i7 = 0; i7 < l7; i7++) {
            ((V) this.f6954v.k(i7).getLayoutParams()).f15492c = true;
        }
        ArrayList arrayList = this.f6948s.f15504c;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            V v5 = (V) ((k0) arrayList.get(i8)).f15576a.getLayoutParams();
            if (v5 != null) {
                v5.f15492c = true;
            }
        }
    }

    public final void U(int i7, int i8, boolean z7) {
        int i9 = i7 + i8;
        int l7 = this.f6954v.l();
        for (int i10 = 0; i10 < l7; i10++) {
            k0 N6 = N(this.f6954v.k(i10));
            if (N6 != null && !N6.t()) {
                int i11 = N6.f15578c;
                g0 g0Var = this.f6959x0;
                if (i11 >= i9) {
                    if (U0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i10 + " holder " + N6 + " now at position " + (N6.f15578c - i8));
                    }
                    N6.q(-i8, z7);
                    g0Var.f = true;
                } else if (i11 >= i7) {
                    if (U0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i10 + " holder " + N6 + " now REMOVED");
                    }
                    N6.c(8);
                    N6.q(-i8, z7);
                    N6.f15578c = i7 - 1;
                    g0Var.f = true;
                }
            }
        }
        a0 a0Var = this.f6948s;
        ArrayList arrayList = a0Var.f15504c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            k0 k0Var = (k0) arrayList.get(size);
            if (k0Var != null) {
                int i12 = k0Var.f15578c;
                if (i12 >= i9) {
                    if (U0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove cached " + size + " holder " + k0Var + " now at position " + (k0Var.f15578c - i8));
                    }
                    k0Var.q(-i8, z7);
                } else if (i12 >= i7) {
                    k0Var.c(8);
                    a0Var.h(size);
                }
            }
        }
        requestLayout();
    }

    public final void V() {
        this.f6927V++;
    }

    public final void W(boolean z7) {
        int i7;
        AccessibilityManager accessibilityManager;
        int i8 = this.f6927V - 1;
        this.f6927V = i8;
        if (i8 < 1) {
            if (f6880T0 && i8 < 0) {
                throw new IllegalStateException(AbstractC0515y1.k(this, new StringBuilder("layout or scroll counter cannot go below zero.Some calls are not matching")));
            }
            this.f6927V = 0;
            if (z7) {
                int i9 = this.f6919Q;
                this.f6919Q = 0;
                if (i9 != 0 && (accessibilityManager = this.f6923S) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    obtain.setEventType(2048);
                    obtain.setContentChangeTypes(i9);
                    sendAccessibilityEventUnchecked(obtain);
                }
                ArrayList arrayList = this.f6910L0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    k0 k0Var = (k0) arrayList.get(size);
                    if (k0Var.f15576a.getParent() == this && !k0Var.t() && (i7 = k0Var.f15589q) != -1) {
                        Field field = K.O.f1447a;
                        k0Var.f15576a.setImportantForAccessibility(i7);
                        k0Var.f15589q = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    public final void X(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f6935h0) {
            int i7 = actionIndex == 0 ? 1 : 0;
            this.f6935h0 = motionEvent.getPointerId(i7);
            int x7 = (int) (motionEvent.getX(i7) + 0.5f);
            this.f6939l0 = x7;
            this.f6937j0 = x7;
            int y3 = (int) (motionEvent.getY(i7) + 0.5f);
            this.f6940m0 = y3;
            this.f6938k0 = y3;
        }
    }

    public void Y(int i7) {
    }

    public final void Z() {
        if (!this.f6896D0 && this.f6905J) {
            Field field = K.O.f1447a;
            postOnAnimation(this.f6912M0);
            this.f6896D0 = true;
        }
    }

    public final void a0() {
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10 = false;
        if (this.f6925T) {
            c cVar = this.f6952u;
            cVar.r((ArrayList) cVar.f8852c);
            cVar.r((ArrayList) cVar.d);
            cVar.f8850a = 0;
            if (this.f6926U) {
                this.f6895D.m0(this);
            }
        }
        if (this.f6933f0 != null && this.f6895D.W0()) {
            this.f6952u.q();
        } else {
            this.f6952u.d();
        }
        if (!this.f6890A0 && !this.f6892B0) {
            z7 = false;
        } else {
            z7 = true;
        }
        if (this.f6909L && this.f6933f0 != null && (((z9 = this.f6925T) || z7 || this.f6895D.f) && (!z9 || this.f6893C.f15467b))) {
            z8 = true;
        } else {
            z8 = false;
        }
        g0 g0Var = this.f6959x0;
        g0Var.f15546j = z8;
        if (z8 && z7 && !this.f6925T && this.f6933f0 != null && this.f6895D.W0()) {
            z10 = true;
        }
        g0Var.f15547k = z10;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i7, int i8) {
        U u7 = this.f6895D;
        if (u7 == null || !u7.c0(this, arrayList, i7, i8)) {
            super.addFocusables(arrayList, i7, i8);
        }
    }

    public final void b0(boolean z7) {
        this.f6926U = z7 | this.f6926U;
        this.f6925T = true;
        int l7 = this.f6954v.l();
        for (int i7 = 0; i7 < l7; i7++) {
            k0 N6 = N(this.f6954v.k(i7));
            if (N6 != null && !N6.t()) {
                N6.c(6);
            }
        }
        T();
        a0 a0Var = this.f6948s;
        ArrayList arrayList = a0Var.f15504c;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            k0 k0Var = (k0) arrayList.get(i8);
            if (k0Var != null) {
                k0Var.c(6);
                k0Var.b(null);
            }
        }
        L l8 = a0Var.f15507h.f6893C;
        if (l8 == null || !l8.f15467b) {
            a0Var.g();
        }
    }

    public final void c0(k0 k0Var, C0040p c0040p) {
        k0Var.f15583j &= -8193;
        boolean z7 = this.f6959x0.f15544h;
        i iVar = this.f6956w;
        if (z7 && k0Var.p() && !k0Var.m() && !k0Var.t()) {
            ((C1054g) iVar.f14557s).k(K(k0Var), k0Var);
        }
        j jVar = (j) iVar.f14556r;
        s0 s0Var = (s0) jVar.get(k0Var);
        if (s0Var == null) {
            s0Var = s0.a();
            jVar.put(k0Var, s0Var);
        }
        s0Var.f15653b = c0040p;
        s0Var.f15652a |= 4;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof V) && this.f6895D.h((V) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        U u7 = this.f6895D;
        if (u7 != null && u7.f()) {
            return this.f6895D.l(this.f6959x0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        U u7 = this.f6895D;
        if (u7 != null && u7.f()) {
            return this.f6895D.m(this.f6959x0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        U u7 = this.f6895D;
        if (u7 != null && u7.f()) {
            return this.f6895D.n(this.f6959x0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        U u7 = this.f6895D;
        if (u7 != null && u7.g()) {
            return this.f6895D.o(this.f6959x0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        U u7 = this.f6895D;
        if (u7 != null && u7.g()) {
            return this.f6895D.p(this.f6959x0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        U u7 = this.f6895D;
        if (u7 != null && u7.g()) {
            return this.f6895D.q(this.f6959x0);
        }
        return 0;
    }

    public final void d0() {
        boolean z7;
        EdgeEffect edgeEffect = this.f6929b0;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z7 = this.f6929b0.isFinished();
        } else {
            z7 = false;
        }
        EdgeEffect edgeEffect2 = this.f6930c0;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z7 |= this.f6930c0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f6931d0;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z7 |= this.f6931d0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f6932e0;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z7 |= this.f6932e0.isFinished();
        }
        if (z7) {
            Field field = K.O.f1447a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        U layoutManager = getLayoutManager();
        int i7 = 0;
        if (layoutManager == null) {
            return false;
        }
        if (layoutManager.g()) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 92 && keyCode != 93) {
                if (keyCode == 122 || keyCode == 123) {
                    boolean U6 = layoutManager.U();
                    if (keyCode != 122 ? !U6 : U6) {
                        i7 = getAdapter().a();
                    }
                    o0(i7);
                    return true;
                }
            } else {
                int measuredHeight = getMeasuredHeight();
                if (keyCode == 93) {
                    n0(0, measuredHeight, false);
                } else {
                    n0(0, -measuredHeight, false);
                }
                return true;
            }
        } else if (layoutManager.f()) {
            int keyCode2 = keyEvent.getKeyCode();
            if (keyCode2 != 92 && keyCode2 != 93) {
                if (keyCode2 == 122 || keyCode2 == 123) {
                    boolean U7 = layoutManager.U();
                    if (keyCode2 != 122 ? !U7 : U7) {
                        i7 = getAdapter().a();
                    }
                    o0(i7);
                    return true;
                }
            } else {
                int measuredWidth = getMeasuredWidth();
                if (keyCode2 == 93) {
                    n0(measuredWidth, 0, false);
                } else {
                    n0(-measuredWidth, 0, false);
                }
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f7, boolean z7) {
        return getScrollingChildHelper().a(f, f7, z7);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f7) {
        return getScrollingChildHelper().b(f, f7);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i7, int i8, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i7, i8, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i7, int i8, int i9, int i10, int[] iArr) {
        return getScrollingChildHelper().e(i7, i8, i9, i10, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z7;
        float f;
        float f7;
        int i7;
        boolean z8;
        boolean z9;
        int i8;
        boolean z10 = true;
        super.draw(canvas);
        ArrayList arrayList = this.f6900G;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            ((Q) arrayList.get(i9)).c(canvas);
        }
        EdgeEffect edgeEffect = this.f6929b0;
        if (edgeEffect != null && !edgeEffect.isFinished()) {
            int save = canvas.save();
            if (this.f6958x) {
                i8 = getPaddingBottom();
            } else {
                i8 = 0;
            }
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + i8, 0.0f);
            EdgeEffect edgeEffect2 = this.f6929b0;
            if (edgeEffect2 != null && edgeEffect2.draw(canvas)) {
                z7 = true;
            } else {
                z7 = false;
            }
            canvas.restoreToCount(save);
        } else {
            z7 = false;
        }
        EdgeEffect edgeEffect3 = this.f6930c0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f6958x) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f6930c0;
            if (edgeEffect4 != null && edgeEffect4.draw(canvas)) {
                z9 = true;
            } else {
                z9 = false;
            }
            z7 |= z9;
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.f6931d0;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            if (this.f6958x) {
                i7 = getPaddingTop();
            } else {
                i7 = 0;
            }
            canvas.rotate(90.0f);
            canvas.translate(i7, -width);
            EdgeEffect edgeEffect6 = this.f6931d0;
            if (edgeEffect6 != null && edgeEffect6.draw(canvas)) {
                z8 = true;
            } else {
                z8 = false;
            }
            z7 |= z8;
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.f6932e0;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f6958x) {
                f = getPaddingRight() + (-getWidth());
                f7 = getPaddingBottom() + (-getHeight());
            } else {
                f = -getWidth();
                f7 = -getHeight();
            }
            canvas.translate(f, f7);
            EdgeEffect edgeEffect8 = this.f6932e0;
            z7 |= (edgeEffect8 == null || !edgeEffect8.draw(canvas)) ? false : false;
            canvas.restoreToCount(save4);
        }
        if ((!z7 && this.f6933f0 != null && arrayList.size() > 0 && this.f6933f0.f()) || z7) {
            Field field = K.O.f1447a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j7) {
        return super.drawChild(canvas, view, j7);
    }

    public final int e0(int i7, float f) {
        float C3;
        EdgeEffect edgeEffect;
        float height = f / getHeight();
        float width = i7 / getWidth();
        EdgeEffect edgeEffect2 = this.f6929b0;
        float f7 = 0.0f;
        if (edgeEffect2 == null || l.t(edgeEffect2) == 0.0f) {
            EdgeEffect edgeEffect3 = this.f6931d0;
            if (edgeEffect3 != null && l.t(edgeEffect3) != 0.0f) {
                if (canScrollHorizontally(1)) {
                    edgeEffect = this.f6931d0;
                    edgeEffect.onRelease();
                } else {
                    C3 = l.C(this.f6931d0, width, height);
                    if (l.t(this.f6931d0) == 0.0f) {
                        this.f6931d0.onRelease();
                    }
                    f7 = C3;
                }
            }
            return Math.round(f7 * getWidth());
        } else if (canScrollHorizontally(-1)) {
            edgeEffect = this.f6929b0;
            edgeEffect.onRelease();
        } else {
            C3 = -l.C(this.f6929b0, -width, 1.0f - height);
            if (l.t(this.f6929b0) == 0.0f) {
                this.f6929b0.onRelease();
            }
            f7 = C3;
        }
        invalidate();
        return Math.round(f7 * getWidth());
    }

    public final int f0(int i7, float f) {
        float C3;
        EdgeEffect edgeEffect;
        float width = f / getWidth();
        float height = i7 / getHeight();
        EdgeEffect edgeEffect2 = this.f6930c0;
        float f7 = 0.0f;
        if (edgeEffect2 != null && l.t(edgeEffect2) != 0.0f) {
            if (canScrollVertically(-1)) {
                edgeEffect = this.f6930c0;
                edgeEffect.onRelease();
            } else {
                C3 = -l.C(this.f6930c0, -height, width);
                if (l.t(this.f6930c0) == 0.0f) {
                    this.f6930c0.onRelease();
                }
                f7 = C3;
            }
        } else {
            EdgeEffect edgeEffect3 = this.f6932e0;
            if (edgeEffect3 != null && l.t(edgeEffect3) != 0.0f) {
                if (canScrollVertically(1)) {
                    edgeEffect = this.f6932e0;
                    edgeEffect.onRelease();
                } else {
                    C3 = l.C(this.f6932e0, height, 1.0f - width);
                    if (l.t(this.f6932e0) == 0.0f) {
                        this.f6932e0.onRelease();
                    }
                    f7 = C3;
                }
            }
            return Math.round(f7 * getHeight());
        }
        invalidate();
        return Math.round(f7 * getHeight());
    }

    /* JADX WARN: Removed duplicated region for block: B:184:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x007d  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View focusSearch(android.view.View r18, int r19) {
        /*
            Method dump skipped, instructions count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    public final void g(k0 k0Var) {
        boolean z7;
        View view = k0Var.f15576a;
        if (view.getParent() == this) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.f6948s.m(M(view));
        if (k0Var.o()) {
            this.f6954v.e(view, -1, view.getLayoutParams(), true);
        } else if (!z7) {
            this.f6954v.d(view, -1, true);
        } else {
            C0163h c0163h = this.f6954v;
            int indexOfChild = ((K) c0163h.f4636s).f15465q.indexOfChild(view);
            if (indexOfChild >= 0) {
                ((e) c0163h.f4637t).D(indexOfChild);
                c0163h.m(view);
                return;
            }
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    public final void g0(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.f6961z;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof V) {
            V v5 = (V) layoutParams;
            if (!v5.f15492c) {
                int i7 = rect.left;
                Rect rect2 = v5.f15491b;
                rect.left = i7 - rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.f6895D.G0(this, view, this.f6961z, !this.f6909L, view2 == null);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        U u7 = this.f6895D;
        if (u7 != null) {
            return u7.u();
        }
        throw new IllegalStateException(AbstractC0515y1.k(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        U u7 = this.f6895D;
        if (u7 != null) {
            return u7.v(getContext(), attributeSet);
        }
        throw new IllegalStateException(AbstractC0515y1.k(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public L getAdapter() {
        return this.f6893C;
    }

    @Override // android.view.View
    public int getBaseline() {
        U u7 = this.f6895D;
        if (u7 != null) {
            u7.getClass();
            return -1;
        }
        return super.getBaseline();
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i7, int i8) {
        View t5;
        int indexOfChild;
        N n = this.f6899F0;
        if (n == null) {
            return super.getChildDrawingOrder(i7, i8);
        }
        DpadRecyclerView dpadRecyclerView = (DpadRecyclerView) ((n) n).f4918q;
        PivotLayoutManager pivotLayoutManager = dpadRecyclerView.f9185f1;
        if (pivotLayoutManager != null && (t5 = pivotLayoutManager.t(pivotLayoutManager.f9198s.f10168b)) != null && i8 >= (indexOfChild = dpadRecyclerView.indexOfChild(t5))) {
            if (i8 < i7 - 1) {
                return ((indexOfChild + i7) - 1) - i8;
            }
            return indexOfChild;
        }
        return i8;
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f6958x;
    }

    public m0 getCompatAccessibilityDelegate() {
        return this.f6898E0;
    }

    public O getEdgeEffectFactory() {
        return this.f6928a0;
    }

    public P getItemAnimator() {
        return this.f6933f0;
    }

    public int getItemDecorationCount() {
        return this.f6900G.size();
    }

    public U getLayoutManager() {
        return this.f6895D;
    }

    public int getMaxFlingVelocity() {
        return this.f6945q0;
    }

    public int getMinFlingVelocity() {
        return this.f6943p0;
    }

    public long getNanoTime() {
        if (f6885Z0) {
            return System.nanoTime();
        }
        return 0L;
    }

    public W getOnFlingListener() {
        return this.f6942o0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f6951t0;
    }

    public Z getRecycledViewPool() {
        return this.f6948s.c();
    }

    public int getScrollState() {
        return this.f6934g0;
    }

    public final void h(Q q5) {
        U u7 = this.f6895D;
        if (u7 != null) {
            u7.d("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.f6900G;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(q5);
        T();
        requestLayout();
    }

    /* JADX WARN: Code restructure failed: missing block: B:97:0x0109, code lost:
        if (r6 == 0) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h0(int r20, int r21, android.view.MotionEvent r22, int r23) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.h0(int, int, android.view.MotionEvent, int):boolean");
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().g(0);
    }

    public final void i(X x7) {
        if (this.f6962z0 == null) {
            this.f6962z0 = new ArrayList();
        }
        this.f6962z0.add(x7);
    }

    public final void i0(int i7, int i8, int[] iArr) {
        int i9;
        int i10;
        k0 k0Var;
        C0163h c0163h = this.f6954v;
        p0();
        V();
        int i11 = G.e.f741a;
        Trace.beginSection("RV Scroll");
        g0 g0Var = this.f6959x0;
        B(g0Var);
        a0 a0Var = this.f6948s;
        if (i7 != 0) {
            i9 = this.f6895D.J0(i7, a0Var, g0Var);
        } else {
            i9 = 0;
        }
        if (i8 != 0) {
            i10 = this.f6895D.L0(i8, a0Var, g0Var);
        } else {
            i10 = 0;
        }
        Trace.endSection();
        int i12 = c0163h.i();
        for (int i13 = 0; i13 < i12; i13++) {
            View h7 = c0163h.h(i13);
            k0 M6 = M(h7);
            if (M6 != null && (k0Var = M6.f15582i) != null) {
                int left = h7.getLeft();
                int top = h7.getTop();
                View view = k0Var.f15576a;
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        W(true);
        s0(false);
        if (iArr != null) {
            iArr[0] = i9;
            iArr[1] = i10;
        }
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.f6905J;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f6915O;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().d;
    }

    public final void j(String str) {
        if (R()) {
            if (str == null) {
                throw new IllegalStateException(AbstractC0515y1.k(this, new StringBuilder("Cannot call this method while RecyclerView is computing a layout or scrolling")));
            }
            throw new IllegalStateException(str);
        } else if (this.W > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(AbstractC0515y1.k(this, new StringBuilder(""))));
        }
    }

    public void j0(int i7) {
        if (this.f6915O) {
            return;
        }
        u0();
        U u7 = this.f6895D;
        if (u7 == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        u7.K0(i7);
        awakenScrollBars();
    }

    public final boolean k0(EdgeEffect edgeEffect, int i7, int i8) {
        if (i7 > 0) {
            return true;
        }
        float t5 = l.t(edgeEffect) * i8;
        float f = this.f6944q * 0.015f;
        double log = Math.log((Math.abs(-i7) * 0.35f) / f);
        double d = f6882W0;
        if (((float) (Math.exp((d / (d - 1.0d)) * log) * f)) < t5) {
            return true;
        }
        return false;
    }

    public final void l() {
        int l7 = this.f6954v.l();
        for (int i7 = 0; i7 < l7; i7++) {
            k0 N6 = N(this.f6954v.k(i7));
            if (!N6.t()) {
                N6.d = -1;
                N6.f15580g = -1;
            }
        }
        a0 a0Var = this.f6948s;
        ArrayList arrayList = a0Var.f15504c;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            k0 k0Var = (k0) arrayList.get(i8);
            k0Var.d = -1;
            k0Var.f15580g = -1;
        }
        ArrayList arrayList2 = a0Var.f15502a;
        int size2 = arrayList2.size();
        for (int i9 = 0; i9 < size2; i9++) {
            k0 k0Var2 = (k0) arrayList2.get(i9);
            k0Var2.d = -1;
            k0Var2.f15580g = -1;
        }
        ArrayList arrayList3 = a0Var.f15503b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i10 = 0; i10 < size3; i10++) {
                k0 k0Var3 = (k0) a0Var.f15503b.get(i10);
                k0Var3.d = -1;
                k0Var3.f15580g = -1;
            }
        }
    }

    public void l0(int i7, int i8) {
        m0(i7, i8);
    }

    public final void m(int i7, int i8) {
        boolean z7;
        EdgeEffect edgeEffect = this.f6929b0;
        if (edgeEffect != null && !edgeEffect.isFinished() && i7 > 0) {
            this.f6929b0.onRelease();
            z7 = this.f6929b0.isFinished();
        } else {
            z7 = false;
        }
        EdgeEffect edgeEffect2 = this.f6931d0;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i7 < 0) {
            this.f6931d0.onRelease();
            z7 |= this.f6931d0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f6930c0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i8 > 0) {
            this.f6930c0.onRelease();
            z7 |= this.f6930c0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f6932e0;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i8 < 0) {
            this.f6932e0.onRelease();
            z7 |= this.f6932e0.isFinished();
        }
        if (z7) {
            Field field = K.O.f1447a;
            postInvalidateOnAnimation();
        }
    }

    public void m0(int i7, int i8) {
        n0(i7, i8, false);
    }

    public final void n0(int i7, int i8, boolean z7) {
        U u7 = this.f6895D;
        if (u7 == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (this.f6915O) {
        } else {
            int i9 = 0;
            if (!u7.f()) {
                i7 = 0;
            }
            if (!this.f6895D.g()) {
                i8 = 0;
            }
            if (i7 != 0 || i8 != 0) {
                if (z7) {
                    if (i7 != 0) {
                        i9 = 1;
                    }
                    if (i8 != 0) {
                        i9 |= 2;
                    }
                    q0(i9, 1);
                }
                this.f6953u0.c(i7, i8, Integer.MIN_VALUE, null);
            }
        }
    }

    public final void o() {
        C0163h c0163h = this.f6954v;
        c cVar = this.f6952u;
        if (this.f6909L && !this.f6925T) {
            if (!cVar.k()) {
                return;
            }
            int i7 = cVar.f8850a;
            if ((i7 & 4) != 0 && (i7 & 11) == 0) {
                int i8 = G.e.f741a;
                Trace.beginSection("RV PartialInvalidate");
                p0();
                V();
                cVar.q();
                if (!this.f6913N) {
                    int i9 = c0163h.i();
                    int i10 = 0;
                    while (true) {
                        if (i10 < i9) {
                            k0 N6 = N(c0163h.h(i10));
                            if (N6 != null && !N6.t() && N6.p()) {
                                q();
                                break;
                            }
                            i10++;
                        } else {
                            cVar.c();
                            break;
                        }
                    }
                }
                s0(true);
                W(true);
            } else if (cVar.k()) {
                int i11 = G.e.f741a;
                Trace.beginSection("RV FullInvalidate");
                q();
            } else {
                return;
            }
            Trace.endSection();
            return;
        }
        int i12 = G.e.f741a;
        Trace.beginSection("RV FullInvalidate");
        q();
        Trace.endSection();
    }

    public void o0(int i7) {
        if (this.f6915O) {
            return;
        }
        U u7 = this.f6895D;
        if (u7 == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            u7.U0(this, this.f6959x0, i7);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0063, code lost:
        if (r1 >= 30.0f) goto L18;
     */
    /* JADX WARN: Type inference failed for: r1v6, types: [w0.v, java.lang.Object] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.f6927V = r0
            r1 = 1
            r5.f6905J = r1
            boolean r2 = r5.f6909L
            if (r2 == 0) goto L15
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L15
            r2 = r1
            goto L16
        L15:
            r2 = r0
        L16:
            r5.f6909L = r2
            w0.a0 r2 = r5.f6948s
            r2.e()
            w0.U r2 = r5.f6895D
            if (r2 == 0) goto L26
            r2.f15482g = r1
            r2.d0(r5)
        L26:
            r5.f6896D0 = r0
            boolean r0 = androidx.recyclerview.widget.RecyclerView.f6885Z0
            if (r0 == 0) goto L91
            java.lang.ThreadLocal r0 = w0.RunnableC1367v.f15686u
            java.lang.Object r1 = r0.get()
            w0.v r1 = (w0.RunnableC1367v) r1
            r5.f6955v0 = r1
            if (r1 != 0) goto L74
            w0.v r1 = new w0.v
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f15688q = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f15691t = r2
            r5.f6955v0 = r1
            java.lang.reflect.Field r1 = K.O.f1447a
            android.view.Display r1 = r5.getDisplay()
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L66
            if (r1 == 0) goto L66
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L66
            goto L68
        L66:
            r1 = 1114636288(0x42700000, float:60.0)
        L68:
            w0.v r2 = r5.f6955v0
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f15690s = r3
            r0.set(r2)
        L74:
            w0.v r0 = r5.f6955v0
            r0.getClass()
            boolean r1 = androidx.recyclerview.widget.RecyclerView.f6880T0
            java.util.ArrayList r0 = r0.f15688q
            if (r1 == 0) goto L8e
            boolean r1 = r0.contains(r5)
            if (r1 != 0) goto L86
            goto L8e
        L86:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "RecyclerView already present in worker list!"
            r0.<init>(r1)
            throw r0
        L8e:
            r0.add(r5)
        L91:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        RunnableC1367v runnableC1367v;
        super.onDetachedFromWindow();
        P p3 = this.f6933f0;
        if (p3 != null) {
            p3.e();
        }
        u0();
        int i7 = 0;
        this.f6905J = false;
        U u7 = this.f6895D;
        a0 a0Var = this.f6948s;
        if (u7 != null) {
            u7.f15482g = false;
            u7.e0(this, a0Var);
        }
        this.f6910L0.clear();
        removeCallbacks(this.f6912M0);
        this.f6956w.getClass();
        do {
        } while (s0.d.a() != null);
        int i8 = 0;
        while (true) {
            ArrayList arrayList = a0Var.f15504c;
            if (i8 >= arrayList.size()) {
                break;
            }
            AbstractC0958a.e(((k0) arrayList.get(i8)).f15576a);
            i8++;
        }
        a0Var.f(a0Var.f15507h.f6893C, false);
        while (i7 < getChildCount()) {
            int i9 = i7 + 1;
            View childAt = getChildAt(i7);
            if (childAt != null) {
                a aVar = (a) childAt.getTag(R.id.pooling_container_listener_holder_tag);
                if (aVar == null) {
                    aVar = new a();
                    childAt.setTag(R.id.pooling_container_listener_holder_tag, aVar);
                }
                ArrayList arrayList2 = aVar.f2861a;
                int K6 = A5.l.K(arrayList2);
                if (-1 >= K6) {
                    i7 = i9;
                } else {
                    AbstractC0515y1.v(arrayList2.get(K6));
                    throw null;
                }
            } else {
                throw new IndexOutOfBoundsException();
            }
        }
        if (f6885Z0 && (runnableC1367v = this.f6955v0) != null) {
            boolean remove = runnableC1367v.f15688q.remove(this);
            if (f6880T0 && !remove) {
                throw new IllegalStateException("RecyclerView removal failed!");
            }
            this.f6955v0 = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.f6900G;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((Q) arrayList.get(i7)).b(this);
        }
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f;
        int i7;
        boolean z7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        float f7;
        if (this.f6895D != null && !this.f6915O && motionEvent.getAction() == 8) {
            float f8 = 0.0f;
            if ((motionEvent.getSource() & 2) != 0) {
                if (this.f6895D.g()) {
                    f7 = -motionEvent.getAxisValue(9);
                } else {
                    f7 = 0.0f;
                }
                if (this.f6895D.f()) {
                    f8 = motionEvent.getAxisValue(10);
                }
                f = f8;
                i7 = 0;
                z7 = false;
                f8 = f7;
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                f = motionEvent.getAxisValue(26);
                if (this.f6895D.g()) {
                    float f9 = -f;
                    f = 0.0f;
                    f8 = f9;
                } else if (!this.f6895D.f()) {
                    f = 0.0f;
                }
                i7 = 26;
                z7 = this.f6920Q0;
            } else {
                f = 0.0f;
                i7 = 0;
                z7 = false;
            }
            int i13 = (int) (f8 * this.f6949s0);
            int i14 = (int) (f * this.f6947r0);
            if (z7) {
                OverScroller overScroller = this.f6953u0.f15566s;
                n0((overScroller.getFinalX() - overScroller.getCurrX()) + i14, (overScroller.getFinalY() - overScroller.getCurrY()) + i13, true);
            } else {
                U u7 = this.f6895D;
                if (u7 == null) {
                    Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                } else if (!this.f6915O) {
                    int[] iArr = this.f6908K0;
                    iArr[0] = 0;
                    iArr[1] = 0;
                    boolean f10 = u7.f();
                    boolean g7 = this.f6895D.g();
                    if (g7) {
                        i8 = f10 | 2;
                    } else {
                        i8 = f10;
                    }
                    float y3 = motionEvent.getY();
                    float x7 = motionEvent.getX();
                    int e02 = i14 - e0(i14, y3);
                    int f02 = i13 - f0(i13, x7);
                    q0(i8, 1);
                    if (f10 != 0) {
                        i9 = e02;
                    } else {
                        i9 = 0;
                    }
                    if (g7) {
                        i10 = f02;
                    } else {
                        i10 = 0;
                    }
                    if (t(i9, i10, 1, this.f6908K0, this.f6904I0)) {
                        e02 -= iArr[0];
                        f02 -= iArr[1];
                    }
                    int i15 = f02;
                    if (f10 != 0) {
                        i11 = e02;
                    } else {
                        i11 = 0;
                    }
                    if (g7) {
                        i12 = i15;
                    } else {
                        i12 = 0;
                    }
                    h0(i11, i12, motionEvent, 1);
                    RunnableC1367v runnableC1367v = this.f6955v0;
                    if (runnableC1367v != null && (e02 != 0 || i15 != 0)) {
                        runnableC1367v.a(this, e02, i15);
                    }
                    t0(1);
                }
            }
            if (i7 != 0 && !z7) {
                this.f6924S0.a(motionEvent, i7);
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:147:0x00e5, code lost:
        if (r0 != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x01ab, code lost:
        if (r9.f6934g0 != 2) goto L90;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instructions count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        int i11 = G.e.f741a;
        Trace.beginSection("RV OnLayout");
        q();
        Trace.endSection();
        this.f6909L = true;
    }

    @Override // android.view.View
    public void onMeasure(int i7, int i8) {
        U u7 = this.f6895D;
        if (u7 == null) {
            p(i7, i8);
            return;
        }
        boolean T6 = u7.T();
        a0 a0Var = this.f6948s;
        boolean z7 = false;
        g0 g0Var = this.f6959x0;
        if (T6) {
            int mode = View.MeasureSpec.getMode(i7);
            int mode2 = View.MeasureSpec.getMode(i8);
            this.f6895D.t0(a0Var, g0Var, i7, i8);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z7 = true;
            }
            this.f6914N0 = z7;
            if (!z7 && this.f6893C != null) {
                if (g0Var.d == 1) {
                    r();
                }
                this.f6895D.N0(i7, i8);
                g0Var.f15545i = true;
                s();
                this.f6895D.P0(i7, i8);
                if (this.f6895D.S0()) {
                    this.f6895D.N0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    g0Var.f15545i = true;
                    s();
                    this.f6895D.P0(i7, i8);
                }
                this.f6916O0 = getMeasuredWidth();
                this.f6918P0 = getMeasuredHeight();
            }
        } else if (this.f6907K) {
            this.f6895D.t0(a0Var, g0Var, i7, i8);
        } else {
            if (this.f6921R) {
                p0();
                V();
                a0();
                W(true);
                if (g0Var.f15547k) {
                    g0Var.f15543g = true;
                } else {
                    this.f6952u.d();
                    g0Var.f15543g = false;
                }
                this.f6921R = false;
                s0(false);
            } else if (g0Var.f15547k) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            L l7 = this.f6893C;
            if (l7 != null) {
                g0Var.f15542e = l7.a();
            } else {
                g0Var.f15542e = 0;
            }
            p0();
            this.f6895D.t0(a0Var, g0Var, i7, i8);
            s0(false);
            g0Var.f15543g = false;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i7, Rect rect) {
        if (R()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i7, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof d0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d0 d0Var = (d0) parcelable;
        this.f6950t = d0Var;
        super.onRestoreInstanceState(d0Var.f2938q);
        requestLayout();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [w0.d0, android.os.Parcelable, S.b] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelable;
        ?? bVar = new b(super.onSaveInstanceState());
        d0 d0Var = this.f6950t;
        if (d0Var != null) {
            bVar.f15519s = d0Var.f15519s;
        } else {
            U u7 = this.f6895D;
            if (u7 != null) {
                parcelable = u7.x0();
            } else {
                parcelable = null;
            }
            bVar.f15519s = parcelable;
        }
        return bVar;
    }

    @Override // android.view.View
    public void onSizeChanged(int i7, int i8, int i9, int i10) {
        super.onSizeChanged(i7, i8, i9, i10);
        if (i7 != i9 || i8 != i10) {
            this.f6932e0 = null;
            this.f6930c0 = null;
            this.f6931d0 = null;
            this.f6929b0 = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:217:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0106  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r21) {
        /*
            Method dump skipped, instructions count: 797
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p(int i7, int i8) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        Field field = K.O.f1447a;
        setMeasuredDimension(U.i(i7, paddingRight, getMinimumWidth()), U.i(i8, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public final void p0() {
        int i7 = this.f6911M + 1;
        this.f6911M = i7;
        if (i7 != 1 || this.f6915O) {
            return;
        }
        this.f6913N = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:404:0x031a, code lost:
        if (((java.util.ArrayList) r19.f6954v.f4638u).contains(getFocusedChild()) == false) goto L218;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:457:0x03c4  */
    /* JADX WARN: Type inference failed for: r13v7, types: [java.lang.Object, K.p] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19, types: [int] */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r9v0, types: [t2.i] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q() {
        /*
            Method dump skipped, instructions count: 994
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.q():void");
    }

    public boolean q0(int i7, int i8) {
        return getScrollingChildHelper().h(i7, i8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object, K.p] */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.Object, K.p] */
    public final void r() {
        View view;
        int d;
        int id;
        boolean z7;
        s0 s0Var;
        View C3;
        g0 g0Var = this.f6959x0;
        g0Var.a(1);
        B(g0Var);
        g0Var.f15545i = false;
        p0();
        i iVar = this.f6956w;
        ((j) iVar.f14556r).clear();
        C1054g c1054g = (C1054g) iVar.f14557s;
        c1054g.c();
        V();
        a0();
        k0 k0Var = null;
        if (this.f6951t0 && hasFocus() && this.f6893C != null) {
            view = getFocusedChild();
        } else {
            view = null;
        }
        if (view != null && (C3 = C(view)) != null) {
            k0Var = M(C3);
        }
        long j7 = -1;
        if (k0Var == null) {
            g0Var.f15549m = -1L;
            g0Var.f15548l = -1;
            g0Var.n = -1;
        } else {
            if (this.f6893C.f15467b) {
                j7 = k0Var.f15579e;
            }
            g0Var.f15549m = j7;
            if (this.f6925T) {
                d = -1;
            } else if (k0Var.m()) {
                d = k0Var.d;
            } else {
                d = k0Var.d();
            }
            g0Var.f15548l = d;
            View view2 = k0Var.f15576a;
            loop3: while (true) {
                id = view2.getId();
                while (!view2.isFocused() && (view2 instanceof ViewGroup) && view2.hasFocus()) {
                    view2 = ((ViewGroup) view2).getFocusedChild();
                    if (view2.getId() != -1) {
                        break;
                    }
                }
            }
            g0Var.n = id;
        }
        if (g0Var.f15546j && this.f6892B0) {
            z7 = true;
        } else {
            z7 = false;
        }
        g0Var.f15544h = z7;
        this.f6892B0 = false;
        this.f6890A0 = false;
        g0Var.f15543g = g0Var.f15547k;
        g0Var.f15542e = this.f6893C.a();
        E(this.G0);
        boolean z8 = g0Var.f15546j;
        j jVar = (j) iVar.f14556r;
        if (z8) {
            int i7 = this.f6954v.i();
            for (int i8 = 0; i8 < i7; i8++) {
                k0 N6 = N(this.f6954v.h(i8));
                if (!N6.t() && (!N6.k() || this.f6893C.f15467b)) {
                    P p3 = this.f6933f0;
                    P.b(N6);
                    N6.g();
                    p3.getClass();
                    ?? obj = new Object();
                    obj.b(N6);
                    s0 s0Var2 = (s0) jVar.get(N6);
                    if (s0Var2 == null) {
                        s0Var2 = s0.a();
                        jVar.put(N6, s0Var2);
                    }
                    s0Var2.f15653b = obj;
                    s0Var2.f15652a |= 4;
                    if (g0Var.f15544h && N6.p() && !N6.m() && !N6.t() && !N6.k()) {
                        c1054g.k(K(N6), N6);
                    }
                }
            }
        }
        if (g0Var.f15547k) {
            int l7 = this.f6954v.l();
            for (int i9 = 0; i9 < l7; i9++) {
                k0 N7 = N(this.f6954v.k(i9));
                if (f6880T0 && N7.f15578c == -1 && !N7.m()) {
                    throw new IllegalStateException(AbstractC0515y1.k(this, new StringBuilder("view holder cannot have position -1 unless it is removed")));
                }
                if (!N7.t() && N7.d == -1) {
                    N7.d = N7.f15578c;
                }
            }
            boolean z9 = g0Var.f;
            g0Var.f = false;
            this.f6895D.r0(this.f6948s, g0Var);
            g0Var.f = z9;
            for (int i10 = 0; i10 < this.f6954v.i(); i10++) {
                k0 N8 = N(this.f6954v.h(i10));
                if (!N8.t() && ((s0Var = (s0) jVar.get(N8)) == null || (s0Var.f15652a & 4) == 0)) {
                    P.b(N8);
                    boolean h7 = N8.h(8192);
                    P p5 = this.f6933f0;
                    N8.g();
                    p5.getClass();
                    ?? obj2 = new Object();
                    obj2.b(N8);
                    if (h7) {
                        c0(N8, obj2);
                    } else {
                        s0 s0Var3 = (s0) jVar.get(N8);
                        if (s0Var3 == null) {
                            s0Var3 = s0.a();
                            jVar.put(N8, s0Var3);
                        }
                        s0Var3.f15652a |= 2;
                        s0Var3.f15653b = obj2;
                    }
                }
            }
        }
        l();
        W(true);
        s0(false);
        g0Var.d = 2;
    }

    public final void r0(int i7) {
        boolean f = this.f6895D.f();
        int i8 = f;
        if (this.f6895D.g()) {
            i8 = (f ? 1 : 0) | 2;
        }
        q0(i8, i7);
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z7) {
        k0 N6 = N(view);
        if (N6 != null) {
            if (N6.o()) {
                N6.f15583j &= -257;
            } else if (!N6.t()) {
                StringBuilder sb = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(N6);
                throw new IllegalArgumentException(AbstractC0515y1.k(this, sb));
            }
        } else if (f6880T0) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            throw new IllegalArgumentException(AbstractC0515y1.k(this, sb2));
        }
        view.clearAnimation();
        k0 N7 = N(view);
        L l7 = this.f6893C;
        if (l7 != null && N7 != null) {
            l7.i(N7);
        }
        super.removeDetachedView(view, z7);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (!this.f6895D.v0(this, this.f6959x0, view, view2) && view2 != null) {
            g0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z7) {
        return this.f6895D.F0(this, view, rect, z7);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z7) {
        ArrayList arrayList = this.f6901H;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((C1365t) arrayList.get(i7)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z7);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f6911M != 0 || this.f6915O) {
            this.f6913N = true;
        } else {
            super.requestLayout();
        }
    }

    public final void s() {
        boolean z7;
        p0();
        V();
        g0 g0Var = this.f6959x0;
        g0Var.a(6);
        this.f6952u.d();
        g0Var.f15542e = this.f6893C.a();
        g0Var.f15541c = 0;
        if (this.f6950t != null) {
            L l7 = this.f6893C;
            int b7 = h.b(l7.f15468c);
            if (b7 == 1 ? l7.a() > 0 : b7 != 2) {
                Parcelable parcelable = this.f6950t.f15519s;
                if (parcelable != null) {
                    this.f6895D.w0(parcelable);
                }
                this.f6950t = null;
            }
        }
        g0Var.f15543g = false;
        this.f6895D.r0(this.f6948s, g0Var);
        g0Var.f = false;
        if (g0Var.f15546j && this.f6933f0 != null) {
            z7 = true;
        } else {
            z7 = false;
        }
        g0Var.f15546j = z7;
        g0Var.d = 4;
        W(true);
        s0(false);
    }

    public final void s0(boolean z7) {
        if (this.f6911M < 1) {
            if (!f6880T0) {
                this.f6911M = 1;
            } else {
                throw new IllegalStateException(AbstractC0515y1.k(this, new StringBuilder("stopInterceptRequestLayout was called more times than startInterceptRequestLayout.")));
            }
        }
        if (!z7 && !this.f6915O) {
            this.f6913N = false;
        }
        if (this.f6911M == 1) {
            if (z7 && this.f6913N && !this.f6915O && this.f6895D != null && this.f6893C != null) {
                q();
            }
            if (!this.f6915O) {
                this.f6913N = false;
            }
        }
        this.f6911M--;
    }

    @Override // android.view.View
    public final void scrollBy(int i7, int i8) {
        U u7 = this.f6895D;
        if (u7 == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (this.f6915O) {
        } else {
            boolean f = u7.f();
            boolean g7 = this.f6895D.g();
            if (f || g7) {
                if (!f) {
                    i7 = 0;
                }
                if (!g7) {
                    i8 = 0;
                }
                h0(i7, i8, null, 0);
            }
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i7, int i8) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        int i7;
        if (R()) {
            int i8 = 0;
            if (accessibilityEvent != null) {
                i7 = accessibilityEvent.getContentChangeTypes();
            } else {
                i7 = 0;
            }
            if (i7 != 0) {
                i8 = i7;
            }
            this.f6919Q |= i8;
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(m0 m0Var) {
        this.f6898E0 = m0Var;
        K.O.i(this, m0Var);
    }

    public void setAdapter(L l7) {
        setLayoutFrozen(false);
        L l8 = this.f6893C;
        c0 c0Var = this.f6946r;
        if (l8 != null) {
            l8.f15466a.unregisterObserver(c0Var);
            this.f6893C.getClass();
        }
        P p3 = this.f6933f0;
        if (p3 != null) {
            p3.e();
        }
        U u7 = this.f6895D;
        a0 a0Var = this.f6948s;
        if (u7 != null) {
            u7.B0(a0Var);
            this.f6895D.C0(a0Var);
        }
        a0Var.f15502a.clear();
        a0Var.g();
        c cVar = this.f6952u;
        cVar.r((ArrayList) cVar.f8852c);
        cVar.r((ArrayList) cVar.d);
        cVar.f8850a = 0;
        L l9 = this.f6893C;
        this.f6893C = l7;
        if (l7 != null) {
            l7.f15466a.registerObserver(c0Var);
        }
        U u8 = this.f6895D;
        if (u8 != null) {
            u8.b0(l9, this.f6893C);
        }
        L l10 = this.f6893C;
        a0Var.f15502a.clear();
        a0Var.g();
        a0Var.f(l9, true);
        Z c5 = a0Var.c();
        if (l9 != null) {
            c5.f15497b--;
        }
        if (c5.f15497b == 0) {
            int i7 = 0;
            while (true) {
                SparseArray sparseArray = c5.f15496a;
                if (i7 >= sparseArray.size()) {
                    break;
                }
                Y y3 = (Y) sparseArray.valueAt(i7);
                Iterator it = y3.f15493a.iterator();
                while (it.hasNext()) {
                    AbstractC0958a.e(((k0) it.next()).f15576a);
                }
                y3.f15493a.clear();
                i7++;
            }
        }
        if (l10 != null) {
            c5.f15497b++;
        }
        a0Var.e();
        this.f6959x0.f = true;
        b0(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(N n) {
        boolean z7;
        if (n == this.f6899F0) {
            return;
        }
        this.f6899F0 = n;
        if (n != null) {
            z7 = true;
        } else {
            z7 = false;
        }
        setChildrenDrawingOrderEnabled(z7);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z7) {
        if (z7 != this.f6958x) {
            this.f6932e0 = null;
            this.f6930c0 = null;
            this.f6931d0 = null;
            this.f6929b0 = null;
        }
        this.f6958x = z7;
        super.setClipToPadding(z7);
        if (this.f6909L) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(O o7) {
        o7.getClass();
        this.f6928a0 = o7;
        this.f6932e0 = null;
        this.f6930c0 = null;
        this.f6931d0 = null;
        this.f6929b0 = null;
    }

    public void setHasFixedSize(boolean z7) {
        this.f6907K = z7;
    }

    public void setItemAnimator(P p3) {
        P p5 = this.f6933f0;
        if (p5 != null) {
            p5.e();
            this.f6933f0.f15469a = null;
        }
        this.f6933f0 = p3;
        if (p3 != null) {
            p3.f15469a = this.f6894C0;
        }
    }

    public void setItemViewCacheSize(int i7) {
        a0 a0Var = this.f6948s;
        a0Var.f15505e = i7;
        a0Var.n();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z7) {
        suppressLayout(z7);
    }

    public void setLayoutManager(U u7) {
        K k5;
        if (u7 == this.f6895D) {
            return;
        }
        u0();
        U u8 = this.f6895D;
        a0 a0Var = this.f6948s;
        if (u8 != null) {
            P p3 = this.f6933f0;
            if (p3 != null) {
                p3.e();
            }
            this.f6895D.B0(a0Var);
            this.f6895D.C0(a0Var);
            a0Var.f15502a.clear();
            a0Var.g();
            if (this.f6905J) {
                U u9 = this.f6895D;
                u9.f15482g = false;
                u9.e0(this, a0Var);
            }
            this.f6895D.Q0(null);
            this.f6895D = null;
        } else {
            a0Var.f15502a.clear();
            a0Var.g();
        }
        C0163h c0163h = this.f6954v;
        ((e) c0163h.f4637t).C();
        ArrayList arrayList = (ArrayList) c0163h.f4638u;
        int size = arrayList.size() - 1;
        while (true) {
            k5 = (K) c0163h.f4636s;
            if (size < 0) {
                break;
            }
            k5.getClass();
            k0 N6 = N((View) arrayList.get(size));
            if (N6 != null) {
                int i7 = N6.f15588p;
                RecyclerView recyclerView = k5.f15465q;
                if (recyclerView.R()) {
                    N6.f15589q = i7;
                    recyclerView.f6910L0.add(N6);
                } else {
                    Field field = K.O.f1447a;
                    N6.f15576a.setImportantForAccessibility(i7);
                }
                N6.f15588p = 0;
            }
            arrayList.remove(size);
            size--;
        }
        RecyclerView recyclerView2 = k5.f15465q;
        int childCount = recyclerView2.getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = recyclerView2.getChildAt(i8);
            k0 N7 = N(childAt);
            L l7 = recyclerView2.f6893C;
            if (l7 != null && N7 != null) {
                l7.i(N7);
            }
            childAt.clearAnimation();
        }
        recyclerView2.removeAllViews();
        this.f6895D = u7;
        if (u7 != null) {
            if (u7.f15479b == null) {
                u7.Q0(this);
                if (this.f6905J) {
                    U u10 = this.f6895D;
                    u10.f15482g = true;
                    u10.d0(this);
                }
            } else {
                StringBuilder sb = new StringBuilder("LayoutManager ");
                sb.append(u7);
                sb.append(" is already attached to a RecyclerView:");
                throw new IllegalArgumentException(AbstractC0515y1.k(u7.f15479b, sb));
            }
        }
        a0Var.n();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z7) {
        C0037m scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.d) {
            Field field = K.O.f1447a;
            D.z(scrollingChildHelper.f1499c);
        }
        scrollingChildHelper.d = z7;
    }

    public void setOnFlingListener(W w7) {
        this.f6942o0 = w7;
    }

    @Deprecated
    public void setOnScrollListener(X x7) {
        this.y0 = x7;
    }

    public void setPreserveFocusAfterLayout(boolean z7) {
        this.f6951t0 = z7;
    }

    public void setRecycledViewPool(Z z7) {
        Z z8;
        a0 a0Var = this.f6948s;
        RecyclerView recyclerView = a0Var.f15507h;
        a0Var.f(recyclerView.f6893C, false);
        if (a0Var.f15506g != null) {
            z8.f15497b--;
        }
        a0Var.f15506g = z7;
        if (z7 != null && recyclerView.getAdapter() != null) {
            a0Var.f15506g.f15497b++;
        }
        a0Var.e();
    }

    @Deprecated
    public void setRecyclerListener(b0 b0Var) {
        this.f6897E = b0Var;
    }

    public void setScrollState(int i7) {
        C c5;
        if (i7 == this.f6934g0) {
            return;
        }
        if (U0) {
            StringBuilder o7 = AbstractC0515y1.o(i7, "setting scroll state to ", " from ");
            o7.append(this.f6934g0);
            Log.d("RecyclerView", o7.toString(), new Exception());
        }
        this.f6934g0 = i7;
        if (i7 != 2) {
            j0 j0Var = this.f6953u0;
            j0Var.f15570w.removeCallbacks(j0Var);
            j0Var.f15566s.abortAnimation();
            U u7 = this.f6895D;
            if (u7 != null && (c5 = u7.f15481e) != null) {
                c5.j();
            }
        }
        U u8 = this.f6895D;
        if (u8 != null) {
            u8.y0(i7);
        }
        Y(i7);
        X x7 = this.y0;
        if (x7 != null) {
            x7.a(this, i7);
        }
        ArrayList arrayList = this.f6962z0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((X) this.f6962z0.get(size)).a(this, i7);
            }
        }
    }

    public void setScrollingTouchSlop(int i7) {
        int scaledTouchSlop;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i7 != 0) {
            if (i7 == 1) {
                scaledTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
                this.f6941n0 = scaledTouchSlop;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i7 + "; using default value");
        }
        scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.f6941n0 = scaledTouchSlop;
    }

    public void setViewCacheExtension(i0 i0Var) {
        this.f6948s.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i7) {
        return getScrollingChildHelper().h(i7, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().i(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z7) {
        if (z7 != this.f6915O) {
            j("Do not suppressLayout in layout or scroll");
            if (z7) {
                long uptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
                this.f6915O = true;
                this.f6917P = true;
                u0();
                return;
            }
            this.f6915O = false;
            if (this.f6913N && this.f6895D != null && this.f6893C != null) {
                requestLayout();
            }
            this.f6913N = false;
        }
    }

    public final boolean t(int i7, int i8, int i9, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i7, i8, i9, iArr, iArr2);
    }

    public final void t0(int i7) {
        getScrollingChildHelper().i(i7);
    }

    public final void u(int i7, int i8, int i9, int i10, int[] iArr, int i11, int[] iArr2) {
        getScrollingChildHelper().e(i7, i8, i9, i10, iArr, i11, iArr2);
    }

    public final void u0() {
        C c5;
        setScrollState(0);
        j0 j0Var = this.f6953u0;
        j0Var.f15570w.removeCallbacks(j0Var);
        j0Var.f15566s.abortAnimation();
        U u7 = this.f6895D;
        if (u7 != null && (c5 = u7.f15481e) != null) {
            c5.j();
        }
    }

    public final void v(int i7, int i8) {
        this.W++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i7, scrollY - i8);
        X x7 = this.y0;
        if (x7 != null) {
            x7.b(this, i7, i8);
        }
        ArrayList arrayList = this.f6962z0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((X) this.f6962z0.get(size)).b(this, i7, i8);
            }
        }
        this.W--;
    }

    public final void w() {
        int measuredWidth;
        int measuredHeight;
        if (this.f6932e0 != null) {
            return;
        }
        ((h0) this.f6928a0).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f6932e0 = edgeEffect;
        if (this.f6958x) {
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        } else {
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight();
        }
        edgeEffect.setSize(measuredWidth, measuredHeight);
    }

    public final void x() {
        int measuredHeight;
        int measuredWidth;
        if (this.f6929b0 != null) {
            return;
        }
        ((h0) this.f6928a0).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f6929b0 = edgeEffect;
        if (this.f6958x) {
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        } else {
            measuredHeight = getMeasuredHeight();
            measuredWidth = getMeasuredWidth();
        }
        edgeEffect.setSize(measuredHeight, measuredWidth);
    }

    public final void y() {
        int measuredHeight;
        int measuredWidth;
        if (this.f6931d0 != null) {
            return;
        }
        ((h0) this.f6928a0).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f6931d0 = edgeEffect;
        if (this.f6958x) {
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        } else {
            measuredHeight = getMeasuredHeight();
            measuredWidth = getMeasuredWidth();
        }
        edgeEffect.setSize(measuredHeight, measuredWidth);
    }

    public final void z() {
        int measuredWidth;
        int measuredHeight;
        if (this.f6930c0 != null) {
            return;
        }
        ((h0) this.f6928a0).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f6930c0 = edgeEffect;
        if (this.f6958x) {
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        } else {
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight();
        }
        edgeEffect.setSize(measuredWidth, measuredHeight);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:(1:37)(10:80|(1:82)|39|40|(1:42)(1:59)|43|44|45|46|47)|39|40|(0)(0)|43|44|45|46|47) */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0338, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x033b, code lost:
        r0 = r3.getConstructor(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x033f, code lost:
        r9 = null;
        r3 = true;
        r4 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0350, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0351, code lost:
        r0.initCause(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0372, code lost:
        throw new java.lang.IllegalStateException(r22.getPositionDescription() + ": Error creating LayoutManager " + r2, r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02f7 A[Catch: ClassCastException -> 0x0300, IllegalAccessException -> 0x0303, InstantiationException -> 0x0306, InvocationTargetException -> 0x0309, ClassNotFoundException -> 0x030c, TryCatch #4 {ClassCastException -> 0x0300, ClassNotFoundException -> 0x030c, IllegalAccessException -> 0x0303, InstantiationException -> 0x0306, InvocationTargetException -> 0x0309, blocks: (B:148:0x02f1, B:150:0x02f7, B:162:0x0313, B:163:0x031d, B:169:0x0342, B:167:0x033b, B:171:0x0351, B:172:0x0372, B:161:0x030f), top: B:189:0x02f1 }] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x030f A[Catch: ClassCastException -> 0x0300, IllegalAccessException -> 0x0303, InstantiationException -> 0x0306, InvocationTargetException -> 0x0309, ClassNotFoundException -> 0x030c, TryCatch #4 {ClassCastException -> 0x0300, ClassNotFoundException -> 0x030c, IllegalAccessException -> 0x0303, InstantiationException -> 0x0306, InvocationTargetException -> 0x0309, blocks: (B:148:0x02f1, B:150:0x02f7, B:162:0x0313, B:163:0x031d, B:169:0x0342, B:167:0x033b, B:171:0x0351, B:172:0x0372, B:161:0x030f), top: B:189:0x02f1 }] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, w0.P, w0.m] */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object, w0.g0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public RecyclerView(android.content.Context r21, android.util.AttributeSet r22, int r23) {
        /*
            Method dump skipped, instructions count: 1067
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        U u7 = this.f6895D;
        if (u7 != null) {
            return u7.w(layoutParams);
        }
        throw new IllegalStateException(AbstractC0515y1.k(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }
}
