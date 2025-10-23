package androidx.leanback.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import f0.AbstractC0659a;
import java.util.ArrayList;
import w0.C1359m;
/* renamed from: androidx.leanback.widget.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0292g extends RecyclerView {
    public final C0321y d1;

    /* renamed from: e1  reason: collision with root package name */
    public boolean f6582e1;

    /* renamed from: f1  reason: collision with root package name */
    public boolean f6583f1;

    /* renamed from: g1  reason: collision with root package name */
    public w0.P f6584g1;

    /* renamed from: h1  reason: collision with root package name */
    public w0.b0 f6585h1;

    /* renamed from: i1  reason: collision with root package name */
    public InterfaceC0290f f6586i1;

    /* renamed from: j1  reason: collision with root package name */
    public int f6587j1;

    public AbstractC0292g(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f6582e1 = true;
        this.f6583f1 = true;
        this.f6587j1 = 4;
        C0321y c0321y = new C0321y(this);
        this.d1 = c0321y;
        setLayoutManager(c0321y);
        setPreserveFocusAfterLayout(false);
        setDescendantFocusability(262144);
        setHasFixedSize(true);
        setChildrenDrawingOrderEnabled(true);
        setWillNotDraw(true);
        setOverScrollMode(2);
        ((C1359m) getItemAnimator()).f15598g = false;
        super.setRecyclerListener(new C0282b(this));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchGenericFocusedEvent(MotionEvent motionEvent) {
        return super.dispatchGenericFocusedEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        InterfaceC0290f interfaceC0290f = this.f6586i1;
        if (interfaceC0290f != null) {
            ((L) ((Z5.n) interfaceC0290f).f4918q).getClass();
            return false;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final View focusSearch(int i7) {
        if (isFocused()) {
            C0321y c0321y = this.d1;
            View t5 = c0321y.t(c0321y.f6674D);
            if (t5 != null) {
                return focusSearch(t5, i7);
            }
        }
        return super.focusSearch(i7);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final int getChildDrawingOrder(int i7, int i8) {
        int indexOfChild;
        C0321y c0321y = this.d1;
        View t5 = c0321y.t(c0321y.f6674D);
        if (t5 != null && i8 >= (indexOfChild = indexOfChild(t5))) {
            if (i8 < i7 - 1) {
                return ((indexOfChild + i7) - 1) - i8;
            }
            return indexOfChild;
        }
        return i8;
    }

    public int getExtraLayoutSpace() {
        return this.d1.f6696b0;
    }

    public int getFocusScrollStrategy() {
        return this.d1.f6692X;
    }

    @Deprecated
    public int getHorizontalMargin() {
        return this.d1.f6685P;
    }

    public int getHorizontalSpacing() {
        return this.d1.f6685P;
    }

    public int getInitialPrefetchItemCount() {
        return this.f6587j1;
    }

    public int getItemAlignmentOffset() {
        return ((D) this.d1.f6694Z.f1019t).f6358b;
    }

    public float getItemAlignmentOffsetPercent() {
        return ((D) this.d1.f6694Z.f1019t).f6359c;
    }

    public int getItemAlignmentViewId() {
        return ((D) this.d1.f6694Z.f1019t).f6357a;
    }

    public InterfaceC0290f getOnUnhandledKeyListener() {
        return this.f6586i1;
    }

    public final int getSaveChildrenLimitNumber() {
        return this.d1.f6698d0.f2560b;
    }

    public final int getSaveChildrenPolicy() {
        return this.d1.f6698d0.f2559a;
    }

    public int getSelectedPosition() {
        return this.d1.f6674D;
    }

    public int getSelectedSubPosition() {
        return this.d1.f6675E;
    }

    @Deprecated
    public int getVerticalMargin() {
        return this.d1.f6686Q;
    }

    public int getVerticalSpacing() {
        return this.d1.f6686Q;
    }

    public int getWindowAlignment() {
        return ((R0) this.d1.f6693Y.f423t).f;
    }

    public int getWindowAlignmentOffset() {
        return ((R0) this.d1.f6693Y.f423t).f6471g;
    }

    public float getWindowAlignmentOffsetPercent() {
        return ((R0) this.d1.f6693Y.f423t).f6472h;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.f6583f1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void j0(int i7) {
        C0321y c0321y = this.d1;
        if ((c0321y.f6712z & 64) != 0) {
            c0321y.B1(i7, false);
        } else {
            super.j0(i7);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void o0(int i7) {
        C0321y c0321y = this.d1;
        if ((c0321y.f6712z & 64) != 0) {
            c0321y.B1(i7, false);
        } else {
            super.o0(i7);
        }
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z7, int i7, Rect rect) {
        super.onFocusChanged(z7, i7, rect);
        C0321y c0321y = this.d1;
        if (z7) {
            int i8 = c0321y.f6674D;
            while (true) {
                View t5 = c0321y.t(i8);
                if (t5 != null) {
                    if (t5.getVisibility() == 0 && t5.hasFocusable()) {
                        t5.requestFocus();
                        return;
                    }
                    i8++;
                } else {
                    return;
                }
            }
        } else {
            c0321y.getClass();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i7, Rect rect) {
        int i8;
        int i9;
        int i10;
        C0321y c0321y = this.d1;
        int i11 = c0321y.f6692X;
        boolean z7 = true;
        if (i11 != 1 && i11 != 2) {
            View t5 = c0321y.t(c0321y.f6674D);
            if (t5 == null) {
                return false;
            }
            return t5.requestFocus(i7, rect);
        }
        int y3 = c0321y.y();
        if ((i7 & 2) != 0) {
            i9 = y3;
            i10 = 1;
            i8 = 0;
        } else {
            i8 = y3 - 1;
            i9 = -1;
            i10 = -1;
        }
        R0 r02 = (R0) c0321y.f6693Y.f423t;
        int i12 = r02.f6474j;
        int i13 = ((r02.f6473i - i12) - r02.f6475k) + i12;
        while (true) {
            if (i8 != i9) {
                View x7 = c0321y.x(i8);
                if (x7.getVisibility() == 0 && c0321y.f6705s.e(x7) >= i12 && c0321y.f6705s.b(x7) <= i13 && x7.requestFocus(i7, rect)) {
                    break;
                }
                i8 += i10;
            } else {
                z7 = false;
                break;
            }
        }
        return z7;
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i7) {
        int i8;
        C0321y c0321y = this.d1;
        boolean z7 = false;
        if (c0321y.f6704r == 0) {
            if (i7 == 1) {
                i8 = 262144;
            }
            i8 = 0;
        } else {
            if (i7 == 1) {
                i8 = 524288;
            }
            i8 = 0;
        }
        int i9 = c0321y.f6712z;
        if ((786432 & i9) != i8) {
            c0321y.f6712z = i8 | (i9 & (-786433)) | 256;
            R0 r02 = (R0) c0321y.f6693Y.f422s;
            if (i7 == 1) {
                z7 = true;
            }
            r02.f6476l = z7;
        }
    }

    public void setAnimateChildLayout(boolean z7) {
        w0.P p3;
        if (this.f6582e1 != z7) {
            this.f6582e1 = z7;
            if (z7) {
                p3 = this.f6584g1;
            } else {
                this.f6584g1 = getItemAnimator();
                p3 = null;
            }
            super.setItemAnimator(p3);
        }
    }

    public void setChildrenVisibility(int i7) {
        C0321y c0321y = this.d1;
        c0321y.f6679J = i7;
        if (i7 != -1) {
            int y3 = c0321y.y();
            for (int i8 = 0; i8 < y3; i8++) {
                c0321y.x(i8).setVisibility(c0321y.f6679J);
            }
        }
    }

    public void setExtraLayoutSpace(int i7) {
        C0321y c0321y = this.d1;
        int i8 = c0321y.f6696b0;
        if (i8 != i7) {
            if (i8 >= 0) {
                c0321y.f6696b0 = i7;
                c0321y.H0();
                return;
            }
            throw new IllegalArgumentException("ExtraLayoutSpace must >= 0");
        }
    }

    public void setFocusDrawingOrderEnabled(boolean z7) {
        super.setChildrenDrawingOrderEnabled(z7);
    }

    public void setFocusScrollStrategy(int i7) {
        if (i7 != 0 && i7 != 1 && i7 != 2) {
            throw new IllegalArgumentException("Invalid scrollStrategy");
        }
        this.d1.f6692X = i7;
        requestLayout();
    }

    public final void setFocusSearchDisabled(boolean z7) {
        int i7;
        int i8;
        if (z7) {
            i7 = 393216;
        } else {
            i7 = 262144;
        }
        setDescendantFocusability(i7);
        C0321y c0321y = this.d1;
        int i9 = c0321y.f6712z & (-32769);
        if (z7) {
            i8 = 32768;
        } else {
            i8 = 0;
        }
        c0321y.f6712z = i8 | i9;
    }

    public void setGravity(int i7) {
        this.d1.f6689T = i7;
        requestLayout();
    }

    public void setHasOverlappingRendering(boolean z7) {
        this.f6583f1 = z7;
    }

    @Deprecated
    public void setHorizontalMargin(int i7) {
        setHorizontalSpacing(i7);
    }

    public void setHorizontalSpacing(int i7) {
        C0321y c0321y = this.d1;
        int i8 = c0321y.f6704r;
        c0321y.f6685P = i7;
        if (i8 == 0) {
            c0321y.f6687R = i7;
        } else {
            c0321y.f6688S = i7;
        }
        requestLayout();
    }

    public void setInitialPrefetchItemCount(int i7) {
        this.f6587j1 = i7;
    }

    public void setItemAlignmentOffset(int i7) {
        C0321y c0321y = this.d1;
        ((D) c0321y.f6694Z.f1019t).f6358b = i7;
        c0321y.C1();
        requestLayout();
    }

    public void setItemAlignmentOffsetPercent(float f) {
        C0321y c0321y = this.d1;
        D d = (D) c0321y.f6694Z.f1019t;
        d.getClass();
        if ((f >= 0.0f && f <= 100.0f) || f == -1.0f) {
            d.f6359c = f;
            c0321y.C1();
            requestLayout();
            return;
        }
        throw new IllegalArgumentException();
    }

    public void setItemAlignmentOffsetWithPadding(boolean z7) {
        C0321y c0321y = this.d1;
        ((D) c0321y.f6694Z.f1019t).d = z7;
        c0321y.C1();
        requestLayout();
    }

    public void setItemAlignmentViewId(int i7) {
        C0321y c0321y = this.d1;
        ((D) c0321y.f6694Z.f1019t).f6357a = i7;
        c0321y.C1();
    }

    @Deprecated
    public void setItemMargin(int i7) {
        setItemSpacing(i7);
    }

    public void setItemSpacing(int i7) {
        C0321y c0321y = this.d1;
        c0321y.f6685P = i7;
        c0321y.f6686Q = i7;
        c0321y.f6688S = i7;
        c0321y.f6687R = i7;
        requestLayout();
    }

    public void setLayoutEnabled(boolean z7) {
        boolean z8;
        C0321y c0321y = this.d1;
        int i7 = c0321y.f6712z;
        int i8 = 0;
        if ((i7 & 512) != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8 != z7) {
            int i9 = i7 & (-513);
            if (z7) {
                i8 = 512;
            }
            c0321y.f6712z = i9 | i8;
            c0321y.H0();
        }
    }

    public void setOnChildLaidOutListener(Q q5) {
        this.d1.f6673C = q5;
    }

    public void setOnChildSelectedListener(S s6) {
        this.d1.f6671A = s6;
    }

    public void setOnChildViewHolderSelectedListener(T t5) {
        C0321y c0321y = this.d1;
        if (t5 == null) {
            c0321y.f6672B = null;
            return;
        }
        ArrayList arrayList = c0321y.f6672B;
        if (arrayList == null) {
            c0321y.f6672B = new ArrayList();
        } else {
            arrayList.clear();
        }
        c0321y.f6672B.add(t5);
    }

    public void setOnKeyInterceptListener(InterfaceC0284c interfaceC0284c) {
    }

    public void setOnMotionInterceptListener(InterfaceC0286d interfaceC0286d) {
    }

    public void setOnTouchInterceptListener(InterfaceC0288e interfaceC0288e) {
    }

    public void setOnUnhandledKeyListener(InterfaceC0290f interfaceC0290f) {
        this.f6586i1 = interfaceC0290f;
    }

    public void setPruneChild(boolean z7) {
        boolean z8;
        C0321y c0321y = this.d1;
        int i7 = c0321y.f6712z;
        int i8 = 65536;
        if ((i7 & 65536) != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8 != z7) {
            int i9 = i7 & (-65537);
            if (!z7) {
                i8 = 0;
            }
            c0321y.f6712z = i9 | i8;
            if (z7) {
                c0321y.H0();
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setRecyclerListener(w0.b0 b0Var) {
        this.f6585h1 = b0Var;
    }

    public final void setSaveChildrenLimitNumber(int i7) {
        O2.e eVar = this.d1.f6698d0;
        eVar.f2560b = i7;
        eVar.e();
    }

    public final void setSaveChildrenPolicy(int i7) {
        O2.e eVar = this.d1.f6698d0;
        eVar.f2559a = i7;
        eVar.e();
    }

    public void setScrollEnabled(boolean z7) {
        boolean z8;
        int i7;
        C0321y c0321y = this.d1;
        int i8 = c0321y.f6712z;
        int i9 = 0;
        if ((i8 & 131072) != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8 != z7) {
            int i10 = i8 & (-131073);
            if (z7) {
                i9 = 131072;
            }
            int i11 = i10 | i9;
            c0321y.f6712z = i11;
            if ((i11 & 131072) != 0 && c0321y.f6692X == 0 && (i7 = c0321y.f6674D) != -1) {
                c0321y.x1(i7, c0321y.f6675E, c0321y.f6678I, true);
            }
        }
    }

    public void setSelectedPosition(int i7) {
        this.d1.B1(i7, false);
    }

    public void setSelectedPositionSmooth(int i7) {
        this.d1.B1(i7, true);
    }

    @Deprecated
    public void setVerticalMargin(int i7) {
        setVerticalSpacing(i7);
    }

    public void setVerticalSpacing(int i7) {
        C0321y c0321y = this.d1;
        int i8 = c0321y.f6704r;
        c0321y.f6686Q = i7;
        if (i8 == 1) {
            c0321y.f6687R = i7;
        } else {
            c0321y.f6688S = i7;
        }
        requestLayout();
    }

    public void setWindowAlignment(int i7) {
        ((R0) this.d1.f6693Y.f423t).f = i7;
        requestLayout();
    }

    public void setWindowAlignmentOffset(int i7) {
        ((R0) this.d1.f6693Y.f423t).f6471g = i7;
        requestLayout();
    }

    public void setWindowAlignmentOffsetPercent(float f) {
        R0 r02 = (R0) this.d1.f6693Y.f423t;
        r02.getClass();
        if ((f >= 0.0f && f <= 100.0f) || f == -1.0f) {
            r02.f6472h = f;
            requestLayout();
            return;
        }
        throw new IllegalArgumentException();
    }

    public void setWindowAlignmentPreferKeyLineOverHighEdge(boolean z7) {
        int i7;
        R0 r02 = (R0) this.d1.f6693Y.f423t;
        if (z7) {
            i7 = r02.f6470e | 2;
        } else {
            i7 = r02.f6470e & (-3);
        }
        r02.f6470e = i7;
        requestLayout();
    }

    public void setWindowAlignmentPreferKeyLineOverLowEdge(boolean z7) {
        int i7;
        R0 r02 = (R0) this.d1.f6693Y.f423t;
        if (z7) {
            i7 = r02.f6470e | 1;
        } else {
            i7 = r02.f6470e & (-2);
        }
        r02.f6470e = i7;
        requestLayout();
    }

    public final void v0(Context context, AttributeSet attributeSet) {
        int i7;
        int i8;
        int i9;
        int i10;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0659a.d);
        boolean z7 = obtainStyledAttributes.getBoolean(4, false);
        boolean z8 = obtainStyledAttributes.getBoolean(3, false);
        C0321y c0321y = this.d1;
        int i11 = c0321y.f6712z & (-6145);
        if (z7) {
            i7 = 2048;
        } else {
            i7 = 0;
        }
        int i12 = i7 | i11;
        if (z8) {
            i8 = 4096;
        } else {
            i8 = 0;
        }
        c0321y.f6712z = i12 | i8;
        boolean z9 = obtainStyledAttributes.getBoolean(6, true);
        boolean z10 = obtainStyledAttributes.getBoolean(5, true);
        int i13 = c0321y.f6712z & (-24577);
        if (z9) {
            i9 = 8192;
        } else {
            i9 = 0;
        }
        int i14 = i9 | i13;
        if (z10) {
            i10 = 16384;
        } else {
            i10 = 0;
        }
        c0321y.f6712z = i14 | i10;
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, obtainStyledAttributes.getDimensionPixelSize(8, 0));
        int i15 = c0321y.f6704r;
        c0321y.f6686Q = dimensionPixelSize;
        if (i15 == 1) {
            c0321y.f6687R = dimensionPixelSize;
        } else {
            c0321y.f6688S = dimensionPixelSize;
        }
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(1, obtainStyledAttributes.getDimensionPixelSize(7, 0));
        int i16 = c0321y.f6704r;
        c0321y.f6685P = dimensionPixelSize2;
        if (i16 == 0) {
            c0321y.f6687R = dimensionPixelSize2;
        } else {
            c0321y.f6688S = dimensionPixelSize2;
        }
        if (obtainStyledAttributes.hasValue(0)) {
            setGravity(obtainStyledAttributes.getInt(0, 0));
        }
        obtainStyledAttributes.recycle();
    }
}
