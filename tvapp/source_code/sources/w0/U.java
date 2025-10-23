package w0;

import Z2.C0163h;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.datastore.preferences.protobuf.C0230i;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.lang.reflect.Field;
import java.util.ArrayList;
import v0.AbstractC1314a;
/* loaded from: classes.dex */
public abstract class U {

    /* renamed from: a  reason: collision with root package name */
    public C0163h f15478a;

    /* renamed from: b  reason: collision with root package name */
    public RecyclerView f15479b;

    /* renamed from: c  reason: collision with root package name */
    public final t2.i f15480c;
    public final t2.i d;

    /* renamed from: e  reason: collision with root package name */
    public C f15481e;
    public boolean f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f15482g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f15483h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f15484i;

    /* renamed from: j  reason: collision with root package name */
    public int f15485j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f15486k;

    /* renamed from: l  reason: collision with root package name */
    public int f15487l;

    /* renamed from: m  reason: collision with root package name */
    public int f15488m;
    public int n;

    /* renamed from: o  reason: collision with root package name */
    public int f15489o;

    public U() {
        S s6 = new S(this, 0);
        S s7 = new S(this, 1);
        this.f15480c = new t2.i(s6);
        this.d = new t2.i(s7);
        this.f = false;
        this.f15482g = false;
        this.f15483h = true;
        this.f15484i = true;
    }

    public static int E(View view) {
        Rect rect = ((V) view.getLayoutParams()).f15491b;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public static int F(View view) {
        Rect rect = ((V) view.getLayoutParams()).f15491b;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public static int O(View view) {
        return ((V) view.getLayoutParams()).f15490a.f();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [w0.T, java.lang.Object] */
    public static T P(Context context, AttributeSet attributeSet, int i7, int i8) {
        ?? obj = new Object();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1314a.f15245a, i7, i8);
        obj.f15475a = obtainStyledAttributes.getInt(0, 1);
        obj.f15476b = obtainStyledAttributes.getInt(10, 1);
        obj.f15477c = obtainStyledAttributes.getBoolean(9, false);
        obj.d = obtainStyledAttributes.getBoolean(11, false);
        obtainStyledAttributes.recycle();
        return obj;
    }

    public static boolean V(int i7, int i8, int i9) {
        int mode = View.MeasureSpec.getMode(i8);
        int size = View.MeasureSpec.getSize(i8);
        if (i9 > 0 && i7 != i9) {
            return false;
        }
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                return true;
            }
            if (mode != 1073741824 || size != i7) {
                return false;
            }
            return true;
        } else if (size < i7) {
            return false;
        } else {
            return true;
        }
    }

    public static void X(View view, int i7, int i8, int i9, int i10) {
        V v5 = (V) view.getLayoutParams();
        Rect rect = v5.f15491b;
        view.layout(i7 + rect.left + ((ViewGroup.MarginLayoutParams) v5).leftMargin, i8 + rect.top + ((ViewGroup.MarginLayoutParams) v5).topMargin, (i9 - rect.right) - ((ViewGroup.MarginLayoutParams) v5).rightMargin, (i10 - rect.bottom) - ((ViewGroup.MarginLayoutParams) v5).bottomMargin);
    }

    public static int i(int i7, int i8, int i9) {
        int mode = View.MeasureSpec.getMode(i7);
        int size = View.MeasureSpec.getSize(i7);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 1073741824) {
                return Math.max(i8, i9);
            }
            return size;
        }
        return Math.min(size, Math.max(i8, i9));
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0018, code lost:
        if (r6 == 1073741824) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int z(boolean r4, int r5, int r6, int r7, int r8) {
        /*
            int r5 = r5 - r7
            r7 = 0
            int r5 = java.lang.Math.max(r7, r5)
            r0 = -2
            r1 = -1
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            if (r4 == 0) goto L1d
            if (r8 < 0) goto L12
        L10:
            r6 = r3
            goto L30
        L12:
            if (r8 != r1) goto L1a
            if (r6 == r2) goto L22
            if (r6 == 0) goto L1a
            if (r6 == r3) goto L22
        L1a:
            r6 = r7
            r8 = r6
            goto L30
        L1d:
            if (r8 < 0) goto L20
            goto L10
        L20:
            if (r8 != r1) goto L24
        L22:
            r8 = r5
            goto L30
        L24:
            if (r8 != r0) goto L1a
            if (r6 == r2) goto L2e
            if (r6 != r3) goto L2b
            goto L2e
        L2b:
            r8 = r5
            r6 = r7
            goto L30
        L2e:
            r8 = r5
            r6 = r2
        L30:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: w0.U.z(boolean, int, int, int, int):int");
    }

    public int A(a0 a0Var, g0 g0Var) {
        RecyclerView recyclerView = this.f15479b;
        if (recyclerView == null || recyclerView.f6893C == null || !f()) {
            return 1;
        }
        return this.f15479b.f6893C.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00cd, code lost:
        if (r10 != 8192) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean A0(w0.a0 r8, w0.g0 r9, int r10, android.os.Bundle r11) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w0.U.A0(w0.a0, w0.g0, int, android.os.Bundle):boolean");
    }

    public int B(View view) {
        return view.getBottom() + ((V) view.getLayoutParams()).f15491b.bottom;
    }

    public void B0(a0 a0Var) {
        for (int y3 = y() - 1; y3 >= 0; y3--) {
            if (!RecyclerView.N(x(y3)).t()) {
                E0(y3, a0Var);
            }
        }
    }

    public void C(View view, Rect rect) {
        boolean z7 = RecyclerView.f6880T0;
        V v5 = (V) view.getLayoutParams();
        Rect rect2 = v5.f15491b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) v5).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) v5).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) v5).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) v5).bottomMargin);
    }

    public final void C0(a0 a0Var) {
        ArrayList arrayList;
        int size = a0Var.f15502a.size();
        int i7 = size - 1;
        while (true) {
            arrayList = a0Var.f15502a;
            if (i7 < 0) {
                break;
            }
            View view = ((k0) arrayList.get(i7)).f15576a;
            k0 N6 = RecyclerView.N(view);
            if (!N6.t()) {
                N6.s(false);
                if (N6.o()) {
                    this.f15479b.removeDetachedView(view, false);
                }
                P p3 = this.f15479b.f6933f0;
                if (p3 != null) {
                    p3.d(N6);
                }
                N6.s(true);
                k0 N7 = RecyclerView.N(view);
                N7.n = null;
                N7.f15587o = false;
                N7.f15583j &= -33;
                a0Var.j(N7);
            }
            i7--;
        }
        arrayList.clear();
        ArrayList arrayList2 = a0Var.f15503b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.f15479b.invalidate();
        }
    }

    public int D(View view) {
        return view.getLeft() - ((V) view.getLayoutParams()).f15491b.left;
    }

    public final void D0(View view, a0 a0Var) {
        C0163h c0163h = this.f15478a;
        K k5 = (K) c0163h.f4636s;
        int i7 = c0163h.f4635r;
        if (i7 != 1) {
            if (i7 != 2) {
                try {
                    c0163h.f4635r = 1;
                    c0163h.f4639v = view;
                    int indexOfChild = k5.f15465q.indexOfChild(view);
                    if (indexOfChild >= 0) {
                        if (((M2.e) c0163h.f4637t).B(indexOfChild)) {
                            c0163h.q(view);
                        }
                        k5.i(indexOfChild);
                    }
                    c0163h.f4635r = 0;
                    c0163h.f4639v = null;
                    a0Var.i(view);
                    return;
                } catch (Throwable th) {
                    c0163h.f4635r = 0;
                    c0163h.f4639v = null;
                    throw th;
                }
            }
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
    }

    public final void E0(int i7, a0 a0Var) {
        View x7 = x(i7);
        if (x(i7) != null) {
            this.f15478a.p(i7);
        }
        a0Var.i(x7);
    }

    public boolean F0(RecyclerView recyclerView, View view, Rect rect, boolean z7) {
        return G0(recyclerView, view, rect, z7, false);
    }

    public int G(View view) {
        return view.getRight() + ((V) view.getLayoutParams()).f15491b.right;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ab, code lost:
        if ((r5.bottom - r10) > r2) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean G0(androidx.recyclerview.widget.RecyclerView r9, android.view.View r10, android.graphics.Rect r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            int r0 = r8.L()
            int r1 = r8.N()
            int r2 = r8.n
            int r3 = r8.M()
            int r2 = r2 - r3
            int r3 = r8.f15489o
            int r4 = r8.K()
            int r3 = r3 - r4
            int r4 = r10.getLeft()
            int r5 = r11.left
            int r4 = r4 + r5
            int r5 = r10.getScrollX()
            int r4 = r4 - r5
            int r5 = r10.getTop()
            int r6 = r11.top
            int r5 = r5 + r6
            int r10 = r10.getScrollY()
            int r5 = r5 - r10
            int r10 = r11.width()
            int r10 = r10 + r4
            int r11 = r11.height()
            int r11 = r11 + r5
            int r4 = r4 - r0
            r0 = 0
            int r6 = java.lang.Math.min(r0, r4)
            int r5 = r5 - r1
            int r1 = java.lang.Math.min(r0, r5)
            int r10 = r10 - r2
            int r2 = java.lang.Math.max(r0, r10)
            int r11 = r11 - r3
            int r11 = java.lang.Math.max(r0, r11)
            int r3 = r8.J()
            r7 = 1
            if (r3 != r7) goto L5c
            if (r2 == 0) goto L57
            goto L64
        L57:
            int r2 = java.lang.Math.max(r6, r10)
            goto L64
        L5c:
            if (r6 == 0) goto L5f
            goto L63
        L5f:
            int r6 = java.lang.Math.min(r4, r2)
        L63:
            r2 = r6
        L64:
            if (r1 == 0) goto L67
            goto L6b
        L67:
            int r1 = java.lang.Math.min(r5, r11)
        L6b:
            int[] r10 = new int[]{r2, r1}
            r11 = r10[r0]
            r10 = r10[r7]
            if (r13 == 0) goto Lae
            android.view.View r13 = r9.getFocusedChild()
            if (r13 != 0) goto L7c
            goto Lb3
        L7c:
            int r1 = r8.L()
            int r2 = r8.N()
            int r3 = r8.n
            int r4 = r8.M()
            int r3 = r3 - r4
            int r4 = r8.f15489o
            int r5 = r8.K()
            int r4 = r4 - r5
            androidx.recyclerview.widget.RecyclerView r5 = r8.f15479b
            android.graphics.Rect r5 = r5.f6961z
            r8.C(r13, r5)
            int r13 = r5.left
            int r13 = r13 - r11
            if (r13 >= r3) goto Lb3
            int r13 = r5.right
            int r13 = r13 - r11
            if (r13 <= r1) goto Lb3
            int r13 = r5.top
            int r13 = r13 - r10
            if (r13 >= r4) goto Lb3
            int r13 = r5.bottom
            int r13 = r13 - r10
            if (r13 > r2) goto Lae
            goto Lb3
        Lae:
            if (r11 != 0) goto Lb4
            if (r10 == 0) goto Lb3
            goto Lb4
        Lb3:
            return r0
        Lb4:
            if (r12 == 0) goto Lba
            r9.scrollBy(r11, r10)
            goto Lbd
        Lba:
            r9.l0(r11, r10)
        Lbd:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: w0.U.G0(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }

    public int H(View view) {
        return view.getTop() - ((V) view.getLayoutParams()).f15491b.top;
    }

    public final void H0() {
        RecyclerView recyclerView = this.f15479b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public final int I() {
        L l7;
        RecyclerView recyclerView = this.f15479b;
        if (recyclerView != null) {
            l7 = recyclerView.getAdapter();
        } else {
            l7 = null;
        }
        if (l7 != null) {
            return l7.a();
        }
        return 0;
    }

    public final void I0(a0 a0Var, int i7, View view) {
        k0 N6 = RecyclerView.N(view);
        if (N6.t()) {
            if (RecyclerView.U0) {
                Log.d("RecyclerView", "ignoring view " + N6);
            }
        } else if (N6.k() && !N6.m() && !this.f15479b.f6893C.f15467b) {
            if (x(i7) != null) {
                this.f15478a.p(i7);
            }
            a0Var.j(N6);
        } else {
            x(i7);
            this.f15478a.f(i7);
            a0Var.k(view);
            this.f15479b.f6956w.z(N6);
        }
    }

    public final int J() {
        RecyclerView recyclerView = this.f15479b;
        Field field = K.O.f1447a;
        return recyclerView.getLayoutDirection();
    }

    public abstract int J0(int i7, a0 a0Var, g0 g0Var);

    public final int K() {
        RecyclerView recyclerView = this.f15479b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public abstract void K0(int i7);

    public final int L() {
        RecyclerView recyclerView = this.f15479b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public abstract int L0(int i7, a0 a0Var, g0 g0Var);

    public final int M() {
        RecyclerView recyclerView = this.f15479b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final void M0(RecyclerView recyclerView) {
        N0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public final int N() {
        RecyclerView recyclerView = this.f15479b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public final void N0(int i7, int i8) {
        this.n = View.MeasureSpec.getSize(i7);
        int mode = View.MeasureSpec.getMode(i7);
        this.f15487l = mode;
        if (mode == 0 && !RecyclerView.f6883X0) {
            this.n = 0;
        }
        this.f15489o = View.MeasureSpec.getSize(i8);
        int mode2 = View.MeasureSpec.getMode(i8);
        this.f15488m = mode2;
        if (mode2 == 0 && !RecyclerView.f6883X0) {
            this.f15489o = 0;
        }
    }

    public void O0(Rect rect, int i7, int i8) {
        int M6 = M() + L() + rect.width();
        int K6 = K() + N() + rect.height();
        RecyclerView recyclerView = this.f15479b;
        Field field = K.O.f1447a;
        this.f15479b.setMeasuredDimension(i(i7, M6, recyclerView.getMinimumWidth()), i(i8, K6, this.f15479b.getMinimumHeight()));
    }

    public final void P0(int i7, int i8) {
        int y3 = y();
        if (y3 == 0) {
            this.f15479b.p(i7, i8);
            return;
        }
        int i9 = Integer.MIN_VALUE;
        int i10 = Integer.MAX_VALUE;
        int i11 = Integer.MIN_VALUE;
        int i12 = Integer.MAX_VALUE;
        for (int i13 = 0; i13 < y3; i13++) {
            View x7 = x(i13);
            Rect rect = this.f15479b.f6961z;
            C(x7, rect);
            int i14 = rect.left;
            if (i14 < i12) {
                i12 = i14;
            }
            int i15 = rect.right;
            if (i15 > i9) {
                i9 = i15;
            }
            int i16 = rect.top;
            if (i16 < i10) {
                i10 = i16;
            }
            int i17 = rect.bottom;
            if (i17 > i11) {
                i11 = i17;
            }
        }
        this.f15479b.f6961z.set(i12, i10, i9, i11);
        O0(this.f15479b.f6961z, i7, i8);
    }

    public int Q(a0 a0Var, g0 g0Var) {
        RecyclerView recyclerView = this.f15479b;
        if (recyclerView == null || recyclerView.f6893C == null || !g()) {
            return 1;
        }
        return this.f15479b.f6893C.a();
    }

    public final void Q0(RecyclerView recyclerView) {
        int height;
        if (recyclerView == null) {
            this.f15479b = null;
            this.f15478a = null;
            height = 0;
            this.n = 0;
        } else {
            this.f15479b = recyclerView;
            this.f15478a = recyclerView.f6954v;
            this.n = recyclerView.getWidth();
            height = recyclerView.getHeight();
        }
        this.f15489o = height;
        this.f15487l = 1073741824;
        this.f15488m = 1073741824;
    }

    public final void R(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((V) view.getLayoutParams()).f15491b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.f15479b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.f15479b.f6891B;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public final boolean R0(View view, int i7, int i8, V v5) {
        if (!view.isLayoutRequested() && this.f15483h && V(view.getWidth(), i7, ((ViewGroup.MarginLayoutParams) v5).width) && V(view.getHeight(), i8, ((ViewGroup.MarginLayoutParams) v5).height)) {
            return false;
        }
        return true;
    }

    public final boolean S() {
        RecyclerView recyclerView = this.f15479b;
        if (recyclerView != null && recyclerView.hasFocus()) {
            return true;
        }
        return false;
    }

    public boolean S0() {
        return false;
    }

    public boolean T() {
        return false;
    }

    public final boolean T0(View view, int i7, int i8, V v5) {
        if (this.f15483h && V(view.getMeasuredWidth(), i7, ((ViewGroup.MarginLayoutParams) v5).width) && V(view.getMeasuredHeight(), i8, ((ViewGroup.MarginLayoutParams) v5).height)) {
            return false;
        }
        return true;
    }

    public boolean U() {
        return false;
    }

    public abstract void U0(RecyclerView recyclerView, g0 g0Var, int i7);

    public void V0(C c5) {
        C c6 = this.f15481e;
        if (c6 != null && c5 != c6 && c6.f15448e) {
            c6.j();
        }
        this.f15481e = c5;
        RecyclerView recyclerView = this.f15479b;
        j0 j0Var = recyclerView.f6953u0;
        j0Var.f15570w.removeCallbacks(j0Var);
        j0Var.f15566s.abortAnimation();
        if (c5.f15450h) {
            Log.w("RecyclerView", "An instance of " + c5.getClass().getSimpleName() + " was started more than once. Each instance of" + c5.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        c5.f15446b = recyclerView;
        c5.f15447c = this;
        int i7 = c5.f15445a;
        if (i7 != -1) {
            recyclerView.f6959x0.f15539a = i7;
            c5.f15448e = true;
            c5.d = true;
            c5.f = c5.f(i7);
            c5.f15446b.f6953u0.b();
            c5.f15450h = true;
            return;
        }
        throw new IllegalArgumentException("Invalid target position");
    }

    public final boolean W() {
        C c5 = this.f15481e;
        if (c5 != null && c5.f15448e) {
            return true;
        }
        return false;
    }

    public abstract boolean W0();

    public final void Y(View view) {
        V v5 = (V) view.getLayoutParams();
        Rect O5 = this.f15479b.O(view);
        int i7 = O5.left + O5.right;
        int i8 = O5.top + O5.bottom;
        int z7 = z(f(), this.n, this.f15487l, M() + L() + ((ViewGroup.MarginLayoutParams) v5).leftMargin + ((ViewGroup.MarginLayoutParams) v5).rightMargin + i7, ((ViewGroup.MarginLayoutParams) v5).width);
        int z8 = z(g(), this.f15489o, this.f15488m, K() + N() + ((ViewGroup.MarginLayoutParams) v5).topMargin + ((ViewGroup.MarginLayoutParams) v5).bottomMargin + i8, ((ViewGroup.MarginLayoutParams) v5).height);
        if (R0(view, z7, z8, v5)) {
            view.measure(z7, z8);
        }
    }

    public void Z(int i7) {
        RecyclerView recyclerView = this.f15479b;
        if (recyclerView != null) {
            int i8 = recyclerView.f6954v.i();
            for (int i9 = 0; i9 < i8; i9++) {
                recyclerView.f6954v.h(i9).offsetLeftAndRight(i7);
            }
        }
    }

    public void a0(int i7) {
        RecyclerView recyclerView = this.f15479b;
        if (recyclerView != null) {
            int i8 = recyclerView.f6954v.i();
            for (int i9 = 0; i9 < i8; i9++) {
                recyclerView.f6954v.h(i9).offsetTopAndBottom(i7);
            }
        }
    }

    public final void b(View view) {
        c(view, -1, false);
    }

    public final void c(View view, int i7, boolean z7) {
        k0 N6 = RecyclerView.N(view);
        if (!z7 && !N6.m()) {
            this.f15479b.f6956w.z(N6);
        } else {
            o.j jVar = (o.j) this.f15479b.f6956w.f14556r;
            s0 s0Var = (s0) jVar.get(N6);
            if (s0Var == null) {
                s0Var = s0.a();
                jVar.put(N6, s0Var);
            }
            s0Var.f15652a |= 1;
        }
        V v5 = (V) view.getLayoutParams();
        if (!N6.u() && !N6.n()) {
            if (view.getParent() == this.f15479b) {
                int n = this.f15478a.n(view);
                if (i7 == -1) {
                    i7 = this.f15478a.i();
                }
                if (n != -1) {
                    if (n != i7) {
                        U u7 = this.f15479b.f6895D;
                        View x7 = u7.x(n);
                        if (x7 != null) {
                            u7.x(n);
                            u7.f15478a.f(n);
                            V v7 = (V) x7.getLayoutParams();
                            k0 N7 = RecyclerView.N(x7);
                            if (N7.m()) {
                                o.j jVar2 = (o.j) u7.f15479b.f6956w.f14556r;
                                s0 s0Var2 = (s0) jVar2.get(N7);
                                if (s0Var2 == null) {
                                    s0Var2 = s0.a();
                                    jVar2.put(N7, s0Var2);
                                }
                                s0Var2.f15652a = 1 | s0Var2.f15652a;
                            } else {
                                u7.f15479b.f6956w.z(N7);
                            }
                            u7.f15478a.e(x7, i7, v7, N7.m());
                        } else {
                            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + n + u7.f15479b.toString());
                        }
                    }
                } else {
                    StringBuilder sb = new StringBuilder("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                    sb.append(this.f15479b.indexOfChild(view));
                    throw new IllegalStateException(AbstractC0515y1.k(this.f15479b, sb));
                }
            } else {
                this.f15478a.d(view, i7, false);
                v5.f15492c = true;
                C c5 = this.f15481e;
                if (c5 != null && c5.f15448e) {
                    c5.f15446b.getClass();
                    if (RecyclerView.L(view) == c5.f15445a) {
                        c5.f = view;
                        if (RecyclerView.U0) {
                            Log.d("RecyclerView", "smooth scroll target view has been attached");
                        }
                    }
                }
            }
        } else {
            if (N6.n()) {
                N6.n.m(N6);
            } else {
                N6.f15583j &= -33;
            }
            this.f15478a.e(view, i7, view.getLayoutParams(), false);
        }
        if (v5.d) {
            if (RecyclerView.U0) {
                Log.d("RecyclerView", "consuming pending invalidate on child " + v5.f15490a);
            }
            N6.f15576a.invalidate();
            v5.d = false;
        }
    }

    public boolean c0(RecyclerView recyclerView, ArrayList arrayList, int i7, int i8) {
        return false;
    }

    public void d(String str) {
        RecyclerView recyclerView = this.f15479b;
        if (recyclerView != null) {
            recyclerView.j(str);
        }
    }

    public final void e(View view, Rect rect) {
        RecyclerView recyclerView = this.f15479b;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.O(view));
        }
    }

    public abstract boolean f();

    public View f0(View view, int i7, a0 a0Var, g0 g0Var) {
        return null;
    }

    public abstract boolean g();

    public void g0(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f15479b;
        a0 a0Var = recyclerView.f6948s;
        g0 g0Var = recyclerView.f6959x0;
        if (recyclerView != null && accessibilityEvent != null) {
            boolean z7 = true;
            if (!recyclerView.canScrollVertically(1) && !this.f15479b.canScrollVertically(-1) && !this.f15479b.canScrollHorizontally(-1) && !this.f15479b.canScrollHorizontally(1)) {
                z7 = false;
            }
            accessibilityEvent.setScrollable(z7);
            L l7 = this.f15479b.f6893C;
            if (l7 != null) {
                accessibilityEvent.setItemCount(l7.a());
            }
        }
    }

    public boolean h(V v5) {
        if (v5 != null) {
            return true;
        }
        return false;
    }

    public void h0(a0 a0Var, g0 g0Var, L.i iVar) {
        if (this.f15479b.canScrollVertically(-1) || this.f15479b.canScrollHorizontally(-1)) {
            iVar.a(8192);
            iVar.m();
            iVar.h(67108864, true);
        }
        if (this.f15479b.canScrollVertically(1) || this.f15479b.canScrollHorizontally(1)) {
            iVar.a(4096);
            iVar.m();
            iVar.h(67108864, true);
        }
        iVar.j(K3.f.c(Q(a0Var, g0Var), A(a0Var, g0Var), 0));
    }

    public final void i0(View view, L.i iVar) {
        k0 N6 = RecyclerView.N(view);
        if (N6 != null && !N6.m() && !((ArrayList) this.f15478a.f4638u).contains(N6.f15576a)) {
            RecyclerView recyclerView = this.f15479b;
            j0(recyclerView.f6948s, recyclerView.f6959x0, view, iVar);
        }
    }

    public abstract void j(int i7, int i8, g0 g0Var, C0230i c0230i);

    public void j0(a0 a0Var, g0 g0Var, View view, L.i iVar) {
        int i7;
        int i8;
        if (g()) {
            i7 = O(view);
        } else {
            i7 = 0;
        }
        if (f()) {
            i8 = O(view);
        } else {
            i8 = 0;
        }
        iVar.k(L.h.a(false, i7, 1, i8, 1));
    }

    public View k0(View view, int i7) {
        return null;
    }

    public int l(g0 g0Var) {
        return 0;
    }

    public int m(g0 g0Var) {
        return 0;
    }

    public int n(g0 g0Var) {
        return 0;
    }

    public int o(g0 g0Var) {
        return 0;
    }

    public int p(g0 g0Var) {
        return 0;
    }

    public int q(g0 g0Var) {
        return 0;
    }

    public void q0(RecyclerView recyclerView, int i7, int i8) {
        p0(i7, i8);
    }

    public final void r(a0 a0Var) {
        for (int y3 = y() - 1; y3 >= 0; y3--) {
            I0(a0Var, y3, x(y3));
        }
    }

    public abstract void r0(a0 a0Var, g0 g0Var);

    public final View s(View view) {
        View C3;
        RecyclerView recyclerView = this.f15479b;
        if (recyclerView == null || (C3 = recyclerView.C(view)) == null || this.f15478a.o(C3)) {
            return null;
        }
        return C3;
    }

    public abstract void s0(g0 g0Var);

    public View t(int i7) {
        int y3 = y();
        for (int i8 = 0; i8 < y3; i8++) {
            View x7 = x(i8);
            k0 N6 = RecyclerView.N(x7);
            if (N6 != null && N6.f() == i7 && !N6.t() && (this.f15479b.f6959x0.f15543g || !N6.m())) {
                return x7;
            }
        }
        return null;
    }

    public void t0(a0 a0Var, g0 g0Var, int i7, int i8) {
        this.f15479b.p(i7, i8);
    }

    public abstract V u();

    public boolean u0(RecyclerView recyclerView, View view, View view2) {
        if (!W() && !recyclerView.R()) {
            return false;
        }
        return true;
    }

    public V v(Context context, AttributeSet attributeSet) {
        return new V(context, attributeSet);
    }

    public boolean v0(RecyclerView recyclerView, g0 g0Var, View view, View view2) {
        return u0(recyclerView, view, view2);
    }

    public V w(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof V) {
            return new V((V) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new V((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new V(layoutParams);
    }

    public abstract void w0(Parcelable parcelable);

    public final View x(int i7) {
        C0163h c0163h = this.f15478a;
        if (c0163h != null) {
            return c0163h.h(i7);
        }
        return null;
    }

    public abstract Parcelable x0();

    public final int y() {
        C0163h c0163h = this.f15478a;
        if (c0163h != null) {
            return c0163h.i();
        }
        return 0;
    }

    public boolean z0(int i7, Bundle bundle) {
        RecyclerView recyclerView = this.f15479b;
        return A0(recyclerView.f6948s, recyclerView.f6959x0, i7, bundle);
    }

    public void d0(RecyclerView recyclerView) {
    }

    public void m0(RecyclerView recyclerView) {
    }

    public void y0(int i7) {
    }

    public void b0(L l7, L l8) {
    }

    public void e0(RecyclerView recyclerView, a0 a0Var) {
    }

    public void k(int i7, C0230i c0230i) {
    }

    public void p0(int i7, int i8) {
    }

    public void l0(RecyclerView recyclerView, int i7, int i8) {
    }

    public void n0(RecyclerView recyclerView, int i7, int i8) {
    }

    public void o0(RecyclerView recyclerView, int i7, int i8) {
    }
}
