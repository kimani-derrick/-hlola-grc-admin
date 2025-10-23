package com.rubensousa.dpadrecyclerview;

import E1.b;
import K.O;
import M5.g;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.emoji2.text.f;
import androidx.recyclerview.widget.RecyclerView;
import com.boxhdo.android.tv.R;
import com.rubensousa.dpadrecyclerview.DpadRecyclerView;
import com.rubensousa.dpadrecyclerview.layoutmanager.PivotLayoutManager;
import d5.C0556b;
import d5.C0564j;
import d5.EnumC0557c;
import d5.InterfaceC0559e;
import d5.InterfaceC0560f;
import d5.InterfaceC0561g;
import d5.InterfaceC0562h;
import d5.InterfaceC0563i;
import d5.l;
import d5.m;
import d5.n;
import d5.o;
import d5.p;
import d5.r;
import d5.s;
import d5.t;
import d5.u;
import e5.C0657b;
import e5.C0658c;
import f5.C0700a;
import g5.d;
import i5.C0775a;
import j5.C0841a;
import java.lang.reflect.Field;
import java.util.ArrayList;
import l5.C0980d;
import w0.C1359m;
import w0.N;
import w0.P;
import w0.U;
import w0.b0;
import w0.k0;
/* loaded from: classes.dex */
public class DpadRecyclerView extends RecyclerView {
    public static final /* synthetic */ int l1 = 0;
    public final u d1;

    /* renamed from: e1  reason: collision with root package name */
    public final n f9184e1;

    /* renamed from: f1  reason: collision with root package name */
    public PivotLayoutManager f9185f1;

    /* renamed from: g1  reason: collision with root package name */
    public boolean f9186g1;

    /* renamed from: h1  reason: collision with root package name */
    public boolean f9187h1;

    /* renamed from: i1  reason: collision with root package name */
    public boolean f9188i1;

    /* renamed from: j1  reason: collision with root package name */
    public boolean f9189j1;

    /* renamed from: k1  reason: collision with root package name */
    public boolean f9190k1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r4v0, types: [d5.u, java.lang.Object] */
    public DpadRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.dpadRecyclerViewStyle);
        boolean z7;
        int i7;
        g.f(context, "context");
        this.d1 = new Object();
        N nVar = new Z5.n(this);
        this.f9184e1 = new n();
        this.f9186g1 = true;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t.f9287a, R.attr.dpadRecyclerViewStyle, 0);
        g.e(obtainStyledAttributes, "obtainStyledAttributes(...)");
        if (!obtainStyledAttributes.hasValue(1)) {
            setFocusable(true);
        }
        if (!obtainStyledAttributes.hasValue(2)) {
            setFocusableInTouchMode(true);
        }
        PivotLayoutManager pivotLayoutManager = new PivotLayoutManager(U.P(context, attributeSet, 0, 0));
        boolean z8 = obtainStyledAttributes.getBoolean(8, false);
        boolean z9 = obtainStyledAttributes.getBoolean(7, false);
        C0657b c0657b = pivotLayoutManager.f9196q;
        c0657b.f10150e = z8;
        c0657b.f = z9;
        boolean z10 = obtainStyledAttributes.getBoolean(10, true);
        boolean z11 = obtainStyledAttributes.getBoolean(9, true);
        c0657b.f10151g = z10;
        c0657b.f10152h = z11;
        pivotLayoutManager.a1(o.values()[obtainStyledAttributes.getInt(11, 0)]);
        EnumC0557c enumC0557c = EnumC0557c.values()[obtainStyledAttributes.getInt(12, 0)];
        g.f(enumC0557c, "loopDirection");
        if (c0657b.d != enumC0557c) {
            c0657b.d = enumC0557c;
            pivotLayoutManager.H0();
        }
        c0657b.f10158o = obtainStyledAttributes.getBoolean(18, true);
        if (obtainStyledAttributes.hasValue(0) && c0657b.f10149c != (i7 = obtainStyledAttributes.getInt(0, 0))) {
            c0657b.f10149c = i7;
            pivotLayoutManager.H0();
        }
        r rVar = r.values()[obtainStyledAttributes.getInt(13, 3)];
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(16, 0);
        float f = obtainStyledAttributes.getFloat(14, 0.5f);
        boolean z12 = obtainStyledAttributes.getBoolean(15, true);
        if (rVar == r.f9279s) {
            z7 = true;
        } else {
            z7 = false;
        }
        s sVar = new s(rVar, dimensionPixelSize, f, z12, obtainStyledAttributes.getBoolean(17, z7));
        C0556b c0556b = new C0556b(obtainStyledAttributes.getDimensionPixelSize(6, 0), obtainStyledAttributes.getFloat(4, 0.5f), obtainStyledAttributes.getBoolean(5, true), 24);
        C0700a c0700a = pivotLayoutManager.f9199t;
        c0700a.getClass();
        c0700a.f10432e = sVar;
        Z5.n nVar2 = (Z5.n) c0700a.f10433g;
        nVar2.getClass();
        nVar2.f4918q = c0556b;
        pivotLayoutManager.H0();
        setLayoutManager(pivotLayoutManager);
        setPreserveFocusAfterLayout(false);
        setDescendantFocusability(262144);
        setItemAnimator(getItemAnimator());
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(3, 0);
        if (dimensionPixelOffset > 0) {
            setFadingEdgeLength(dimensionPixelOffset);
        }
        setWillNotDraw(true);
        setChildDrawingOrderCallback(nVar);
        setOverScrollMode(2);
        obtainStyledAttributes.recycle();
        this.F.add(new b0() { // from class: d5.d
            @Override // w0.b0
            public final void a(k0 k0Var) {
                PivotLayoutManager pivotLayoutManager2;
                int i8 = DpadRecyclerView.l1;
                DpadRecyclerView dpadRecyclerView = DpadRecyclerView.this;
                M5.g.f(dpadRecyclerView, "this$0");
                M5.g.f(k0Var, "holder");
                int d = k0Var.d();
                if (d != -1 && d == dpadRecyclerView.getSelectedPosition() && (pivotLayoutManager2 = dpadRecyclerView.f9185f1) != null) {
                    boolean z13 = pivotLayoutManager2.f9193C;
                    C0658c c0658c = pivotLayoutManager2.f9198s;
                    if (z13) {
                        c0658c.f10168b = 0;
                        c0658c.f10169c = 0;
                        c0658c.f10170e = 0;
                        return;
                    }
                    c0658c.getClass();
                }
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void Y(int i7) {
        PivotLayoutManager pivotLayoutManager;
        if (i7 == 0) {
            if (this.f9190k1 && !this.f9188i1) {
                b bVar = new b(13, this);
                Field field = O.f1447a;
                postOnAnimation(bVar);
            }
            this.f9188i1 = false;
            PivotLayoutManager pivotLayoutManager2 = this.f9185f1;
            if (pivotLayoutManager2 != null) {
                pivotLayoutManager2.f9196q.f10166w = false;
                pivotLayoutManager2.f9193C = false;
            }
        } else if (this.f9188i1 && (pivotLayoutManager = this.f9185f1) != null) {
            pivotLayoutManager.f9196q.f10166w = true;
            pivotLayoutManager.f9193C = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a8, code lost:
        if (r6 == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ac, code lost:
        if (r6 != false) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0132  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void dispatchDraw(android.graphics.Canvas r11) {
        /*
            Method dump skipped, instructions count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.rubensousa.dpadrecyclerview.DpadRecyclerView.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchGenericFocusedEvent(MotionEvent motionEvent) {
        g.f(motionEvent, "event");
        return super.dispatchGenericFocusedEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return keyEvent != null && super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        g.f(motionEvent, "event");
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final View focusSearch(int i7) {
        PivotLayoutManager pivotLayoutManager = this.f9185f1;
        if (isFocused() && pivotLayoutManager != null) {
            View t5 = pivotLayoutManager.t(pivotLayoutManager.f9198s.f10168b);
            if (t5 != null) {
                return focusSearch(t5, i7);
            }
            return focusSearch(this, i7);
        }
        return super.focusSearch(i7);
    }

    public final C0556b getChildAlignment() {
        return (C0556b) ((Z5.n) x0().f9199t.f10433g).f4918q;
    }

    public final int getCurrentSubPositions() {
        PivotLayoutManager pivotLayoutManager = this.f9185f1;
        if (pivotLayoutManager != null) {
            pivotLayoutManager.f9198s.getClass();
            return 0;
        }
        return 0;
    }

    public final o getFocusableDirection() {
        return x0().f9196q.f10153i;
    }

    public final int getInitialPrefetchItemCount() {
        return x0().f9196q.n;
    }

    public final EnumC0557c getLoopDirection() {
        return x0().f9196q.d;
    }

    public final int getMaxEdgeFadingLength() {
        return this.f9184e1.f9270e;
    }

    public final int getMaxEdgeFadingOffset() {
        return this.f9184e1.f;
    }

    public final int getMinEdgeFadingLength() {
        return this.f9184e1.f9268b;
    }

    public final int getMinEdgeFadingOffset() {
        return this.f9184e1.f9269c;
    }

    public final InterfaceC0559e getOnKeyInterceptListener() {
        return null;
    }

    public final InterfaceC0560f getOnMotionInterceptListener() {
        return null;
    }

    public final InterfaceC0562h getOnUnhandledKeyListener() {
        return null;
    }

    public final int getOrientation() {
        return x0().f9196q.f10147a;
    }

    public final s getParentAlignment() {
        return (s) x0().f9199t.f10432e;
    }

    public final int getSelectedPosition() {
        PivotLayoutManager pivotLayoutManager = this.f9185f1;
        if (pivotLayoutManager != null) {
            return pivotLayoutManager.f9198s.f10168b;
        }
        return -1;
    }

    public final int getSelectedSubPosition() {
        PivotLayoutManager pivotLayoutManager = this.f9185f1;
        if (pivotLayoutManager != null) {
            return pivotLayoutManager.f9198s.f10169c;
        }
        return -1;
    }

    public final int getSmoothScrollMaxPendingAlignments() {
        return x0().f9196q.f10160q;
    }

    public final int getSmoothScrollMaxPendingMoves() {
        return x0().f9196q.f10159p;
    }

    public final float getSmoothScrollSpeedFactor() {
        return x0().f9196q.f10164u;
    }

    public final int getSpanCount() {
        return x0().f9196q.f10148b;
    }

    public final l getSpanSizeLookup() {
        return x0().f9196q.f10163t;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.f9186g1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void l0(int i7, int i8) {
        n0(i7, i8, false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void m0(int i7, int i8) {
        n0(i7, i8, false);
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z7, int i7, Rect rect) {
        View t5;
        super.onFocusChanged(z7, i7, rect);
        PivotLayoutManager pivotLayoutManager = this.f9185f1;
        if (pivotLayoutManager != null && !pivotLayoutManager.f9193C) {
            d dVar = pivotLayoutManager.f9204y;
            if (!z7 || dVar.f10852c.f12283k == null) {
                if (!z7 || dVar.f10851b.f10162s) {
                    if (z7) {
                        C0658c c0658c = dVar.f10853e;
                        int i8 = c0658c.f10168b;
                        if (i8 == -1) {
                            return;
                        }
                        while (true) {
                            U u7 = dVar.f10850a;
                            if (i8 < u7.I() && (t5 = u7.t(i8)) != null) {
                                dVar.d.getClass();
                                if (h5.d.q(t5)) {
                                    if (!t5.hasFocus()) {
                                        c0658c.d(t5);
                                        return;
                                    }
                                    return;
                                }
                                i8++;
                            } else {
                                return;
                            }
                        }
                    } else {
                        dVar.getClass();
                    }
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i7, int i8) {
        if (getLayoutManager() == null) {
            super.onMeasure(i7, i8);
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (getOrientation() == 1 && layoutParams.height == -2) {
            i8 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i8), 1073741824);
        } else if (getOrientation() != 0 || layoutParams.width != -2) {
            super.onMeasure(i7, i8);
            return;
        } else {
            i7 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824);
        }
        super.onMeasure(i7, i8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i7, Rect rect) {
        PivotLayoutManager pivotLayoutManager;
        if (this.f9187h1 || (pivotLayoutManager = this.f9185f1) == null) {
            return false;
        }
        d dVar = pivotLayoutManager.f9204y;
        if (dVar.f10851b.f10156l) {
            return false;
        }
        View t5 = dVar.f10850a.t(dVar.f10853e.f10168b);
        if (t5 == null) {
            return false;
        }
        return t5.requestFocus(i7, rect);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i7) {
        super.onRtlPropertiesChanged(i7);
        PivotLayoutManager pivotLayoutManager = this.f9185f1;
        if (pivotLayoutManager != null && pivotLayoutManager.f9195p != i7) {
            pivotLayoutManager.f9195p = i7;
            pivotLayoutManager.H0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onSizeChanged(int i7, int i8, int i9, int i10) {
        LinearGradient b7;
        super.onSizeChanged(i7, i8, i9, i10);
        n nVar = this.f9184e1;
        nVar.getClass();
        if (nVar.f9270e != 0) {
            if (getOrientation() == 0) {
                if (i7 != i9) {
                    b7 = nVar.a(i7, getPaddingRight());
                } else {
                    return;
                }
            } else if (i8 != i10) {
                b7 = nVar.b(i8, getPaddingBottom());
            } else {
                return;
            }
            nVar.f9272h = b7;
            invalidate();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final boolean q0(int i7, int i8) {
        boolean q02 = super.q0(i7, i8);
        if (i8 == 0) {
            this.f9188i1 = true;
        }
        return q02;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        g.f(view, "view");
        w0(view.hasFocus());
        super.removeView(view);
        v0();
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i7) {
        View childAt = getChildAt(i7);
        w0(childAt != null ? childAt.hasFocus() : false);
        super.removeViewAt(i7);
        v0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (getScrollState() != 0 && !this.f9189j1) {
            this.f9190k1 = true;
        } else {
            super.requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void setChildDrawingOrderCallback(N n) {
        super.setChildDrawingOrderCallback(n);
    }

    public final void setExtraLayoutSpaceStrategy(m mVar) {
        PivotLayoutManager x02 = x0();
        x02.f9196q.getClass();
        x02.H0();
    }

    @Override // android.view.View
    public final void setFadingEdgeLength(int i7) {
        super.setFadingEdgeLength(i7);
        if (getLayoutManager() != null) {
            n nVar = this.f9184e1;
            nVar.getClass();
            if (!nVar.f9267a) {
                nVar.f9267a = true;
                invalidate();
                if (!nVar.f9267a && !nVar.d) {
                    setLayerType(0, null);
                    setWillNotDraw(true);
                } else {
                    setLayerType(2, null);
                    setWillNotDraw(false);
                }
            }
            if (!nVar.d) {
                nVar.d = true;
                invalidate();
                if (!nVar.f9267a && !nVar.d) {
                    setLayerType(0, null);
                    setWillNotDraw(true);
                } else {
                    setLayerType(2, null);
                    setWillNotDraw(false);
                }
            }
            setMaxEdgeFadingLength(i7);
            setMinEdgeFadingLength(i7);
        }
    }

    public final void setFocusDrawingOrderEnabled(boolean z7) {
        super.setChildrenDrawingOrderEnabled(z7);
        x0().f9196q.f10161r = z7;
    }

    public final void setFocusSearchDisabled(boolean z7) {
        int i7;
        if (z7) {
            i7 = 393216;
        } else {
            i7 = 262144;
        }
        setDescendantFocusability(i7);
        x0().f9196q.f10156l = z7;
    }

    public final void setFocusSearchEnabledDuringAnimations(boolean z7) {
        x0().f9196q.f10157m = z7;
    }

    public final void setFocusableDirection(o oVar) {
        g.f(oVar, "direction");
        x0().a1(oVar);
    }

    public final void setGravity(int i7) {
        PivotLayoutManager x02 = x0();
        C0657b c0657b = x02.f9196q;
        if (c0657b.f10149c != i7) {
            c0657b.f10149c = i7;
            x02.H0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void setHasFixedSize(boolean z7) {
        super.setHasFixedSize(z7);
    }

    public final void setHasOverlappingRendering(boolean z7) {
        this.f9186g1 = z7;
    }

    public final void setInitialPrefetchItemCount(int i7) {
        C0657b c0657b = x0().f9196q;
        if (i7 >= 0) {
            c0657b.n = i7;
        } else {
            c0657b.getClass();
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void setItemAnimator(P p3) {
        super.setItemAnimator(p3);
        if (p3 instanceof C1359m) {
            ((C1359m) p3).f15598g = false;
        }
    }

    public final void setItemPrefetchEnabled(boolean z7) {
        PivotLayoutManager x02 = x0();
        if (z7 != x02.f15484i) {
            x02.f15484i = z7;
            x02.f15485j = 0;
            RecyclerView recyclerView = x02.f15479b;
            if (recyclerView != null) {
                recyclerView.f6948s.n();
            }
        }
    }

    public final void setLayoutEnabled(boolean z7) {
        PivotLayoutManager x02 = x0();
        C0657b c0657b = x02.f9196q;
        if (c0657b.f10162s != z7) {
            c0657b.f10162s = z7;
            x02.H0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void setLayoutManager(U u7) {
        super.setLayoutManager(u7);
        PivotLayoutManager pivotLayoutManager = this.f9185f1;
        u uVar = this.d1;
        if (pivotLayoutManager != null) {
            g.f(uVar, "listener");
            C0658c c0658c = pivotLayoutManager.f9198s;
            c0658c.getClass();
            ((ArrayList) c0658c.f10174j).remove(uVar);
        }
        PivotLayoutManager pivotLayoutManager2 = this.f9185f1;
        if (pivotLayoutManager2 != null) {
            pivotLayoutManager2.b1(null);
        }
        PivotLayoutManager pivotLayoutManager3 = this.f9185f1;
        if (pivotLayoutManager3 != u7) {
            if (pivotLayoutManager3 != null) {
                pivotLayoutManager3.f9194D = null;
            }
            if (pivotLayoutManager3 != null) {
                ((ArrayList) pivotLayoutManager3.f9202w.f1401j).clear();
            }
            PivotLayoutManager pivotLayoutManager4 = this.f9185f1;
            if (pivotLayoutManager4 != null) {
                ((ArrayList) pivotLayoutManager4.f9198s.f10174j).clear();
            }
        }
        this.f9185f1 = null;
        if (u7 != null && !(u7 instanceof PivotLayoutManager)) {
            throw new IllegalArgumentException("Only PivotLayoutManager is supported, but got " + u7);
        } else if (u7 instanceof PivotLayoutManager) {
            PivotLayoutManager pivotLayoutManager5 = (PivotLayoutManager) u7;
            pivotLayoutManager5.b1(this);
            pivotLayoutManager5.f9194D = new C0564j(this);
            pivotLayoutManager5.getClass();
            g.f(uVar, "listener");
            C0658c c0658c2 = pivotLayoutManager5.f9198s;
            c0658c2.getClass();
            ((ArrayList) c0658c2.f10174j).add(uVar);
            this.f9185f1 = pivotLayoutManager5;
        }
    }

    public final void setLayoutWhileScrollingEnabled(boolean z7) {
        this.f9189j1 = z7;
    }

    public final void setLoopDirection(EnumC0557c enumC0557c) {
        g.f(enumC0557c, "loopDirection");
        PivotLayoutManager x02 = x0();
        C0657b c0657b = x02.f9196q;
        if (c0657b.d != enumC0557c) {
            c0657b.d = enumC0557c;
            x02.H0();
        }
    }

    public final void setMaxEdgeFadingLength(int i7) {
        LinearGradient linearGradient;
        n nVar = this.f9184e1;
        nVar.getClass();
        if (nVar.f9270e != i7) {
            nVar.f9270e = i7;
            if (i7 != 0) {
                if (getOrientation() == 0) {
                    linearGradient = nVar.a(getWidth(), getPaddingRight());
                } else {
                    linearGradient = nVar.b(getHeight(), getPaddingBottom());
                }
            } else {
                linearGradient = null;
            }
            nVar.f9272h = linearGradient;
            invalidate();
        }
    }

    public final void setMaxEdgeFadingOffset(int i7) {
        n nVar = this.f9184e1;
        nVar.getClass();
        if (nVar.f != i7) {
            nVar.f = i7;
            invalidate();
        }
    }

    public final void setMinEdgeFadingLength(int i7) {
        LinearGradient linearGradient;
        n nVar = this.f9184e1;
        nVar.getClass();
        if (nVar.f9268b != i7) {
            nVar.f9268b = i7;
            if (i7 != 0) {
                if (getOrientation() == 0) {
                    linearGradient = new LinearGradient(0.0f, 0.0f, nVar.f9268b, 0.0f, 0, -16777216, Shader.TileMode.CLAMP);
                } else {
                    linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, nVar.f9268b, 0, -16777216, Shader.TileMode.CLAMP);
                }
            } else {
                linearGradient = null;
            }
            nVar.f9271g = linearGradient;
            invalidate();
        }
    }

    public final void setMinEdgeFadingOffset(int i7) {
        n nVar = this.f9184e1;
        nVar.getClass();
        if (nVar.f9269c != i7) {
            nVar.f9269c = i7;
            invalidate();
        }
    }

    public final void setOnChildLaidOutListener(p pVar) {
        x0().f9202w.getClass();
    }

    public final void setOrientation(int i7) {
        PivotLayoutManager x02 = x0();
        C0657b c0657b = x02.f9196q;
        if (c0657b.f10147a != i7) {
            if (i7 != 0 && i7 != 1) {
                throw new IllegalArgumentException("Invalid orientation value. Must be RecyclerView.HORIZONTAL or RecyclerView.VERTICAL".toString());
            }
            c0657b.f10147a = i7;
            h5.d dVar = x02.f9197r;
            int i8 = dVar.f11019b.f10147a;
            U u7 = dVar.f11018a;
            dVar.f11020c = f.a(u7, i8);
            dVar.d = f.a(u7, !dVar.f11019b.c());
            x02.H0();
        }
    }

    public final void setRecycleChildrenOnDetach(boolean z7) {
        x0().f9196q.f10165v = z7;
    }

    public final void setReverseLayout(boolean z7) {
        PivotLayoutManager x02 = x0();
        C0657b c0657b = x02.f9196q;
        if (c0657b.f10154j != z7) {
            c0657b.f10154j = z7;
            x02.H0();
        }
    }

    public final void setScrollEnabled(boolean z7) {
        PivotLayoutManager x02 = x0();
        C0657b c0657b = x02.f9196q;
        if (c0657b.f10155k != z7) {
            c0657b.f10155k = z7;
            if (z7) {
                C0980d.e(x02.f9201v, c0657b.f10158o);
            }
        }
    }

    public final void setSelectedPosition(int i7) {
        x0().f9201v.d(i7, 0, false);
    }

    public final void setSelectedPositionSmooth(int i7) {
        x0().f9201v.d(i7, 0, true);
    }

    public final void setSelectedSubPosition(int i7) {
        PivotLayoutManager x02 = x0();
        x02.f9201v.d(x02.f9198s.f10168b, i7, false);
    }

    public final void setSelectedSubPositionSmooth(int i7) {
        PivotLayoutManager x02 = x0();
        x02.f9201v.d(x02.f9198s.f10168b, i7, true);
    }

    public final void setSmoothFocusChangesEnabled(boolean z7) {
        x0().f9196q.f10158o = z7;
    }

    public final void setSmoothScrollMaxPendingAlignments(int i7) {
        C0657b c0657b = x0().f9196q;
        if (i7 > 0) {
            c0657b.f10160q = i7;
        } else {
            c0657b.getClass();
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    public final void setSmoothScrollMaxPendingMoves(int i7) {
        C0657b c0657b = x0().f9196q;
        if (i7 >= 0) {
            c0657b.f10159p = i7;
        } else {
            c0657b.getClass();
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    public final void setSmoothScrollSpeedFactor(float f) {
        int i7 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
        C0657b c0657b = x0().f9196q;
        if (i7 > 0) {
            c0657b.f10164u = f;
        } else {
            c0657b.getClass();
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    public final void setSpanCount(int i7) {
        Object c0841a;
        PivotLayoutManager x02 = x0();
        C0657b c0657b = x02.f9196q;
        if (c0657b.f10148b != i7) {
            c0657b.f10148b = Math.max(1, i7);
            l lVar = c0657b.f10163t;
            lVar.f9264a.clear();
            lVar.f9265b.clear();
            x02.f9200u.f793q = -1;
            J3.m mVar = x02.f9202w;
            int i8 = ((C0657b) mVar.d).f10148b;
            Z5.n nVar = (Z5.n) mVar.f1399h;
            C0700a c0700a = (C0700a) mVar.f1396c;
            h5.d dVar = (h5.d) mVar.f1398g;
            U u7 = (U) mVar.f1395b;
            if (i8 > 1) {
                c0841a = new C0775a(u7, dVar, c0700a, nVar);
            } else {
                c0841a = new C0841a(u7, dVar, c0700a, nVar);
            }
            mVar.f1400i = c0841a;
            mVar.j();
            x02.H0();
        }
    }

    public final void setSpanSizeLookup(l lVar) {
        g.f(lVar, "spanSizeLookup");
        PivotLayoutManager x02 = x0();
        C0657b c0657b = x02.f9196q;
        if (lVar != c0657b.f10163t) {
            c0657b.f10163t = lVar;
            if (lVar != l.f9263e) {
                lVar.f9266c = true;
                lVar.d = true;
            }
            x02.f9200u.f793q = -1;
            x02.H0();
        }
    }

    @Override // android.view.View
    public final void setWillNotDraw(boolean z7) {
        super.setWillNotDraw(z7);
    }

    public final void v0() {
        if (this.f9187h1 && getChildCount() > 0 && !hasFocus()) {
            requestFocus();
        }
        this.f9187h1 = false;
        PivotLayoutManager pivotLayoutManager = this.f9185f1;
        if (pivotLayoutManager != null) {
            pivotLayoutManager.f9198s.f10167a = false;
        }
    }

    public final void w0(boolean z7) {
        boolean z8;
        if (z7 && isFocusable()) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f9187h1 = z8;
        PivotLayoutManager pivotLayoutManager = this.f9185f1;
        if (pivotLayoutManager != null) {
            pivotLayoutManager.f9198s.f10167a = z8;
        }
        if (z8) {
            requestFocus();
        }
    }

    public final PivotLayoutManager x0() {
        PivotLayoutManager pivotLayoutManager = this.f9185f1;
        if (pivotLayoutManager != null) {
            return pivotLayoutManager;
        }
        throw new IllegalArgumentException("PivotLayoutManager is null. Check for unnecessary usages of RecyclerView.setLayoutManager(null) or just set a new PivotLayoutManager.".toString());
    }

    public final void setOnKeyInterceptListener(InterfaceC0559e interfaceC0559e) {
    }

    public final void setOnMotionInterceptListener(InterfaceC0560f interfaceC0560f) {
    }

    public final void setOnTouchInterceptListener(InterfaceC0561g interfaceC0561g) {
    }

    public final void setOnUnhandledKeyListener(InterfaceC0562h interfaceC0562h) {
    }

    public final void setSmoothScrollBehavior(InterfaceC0563i interfaceC0563i) {
    }
}
