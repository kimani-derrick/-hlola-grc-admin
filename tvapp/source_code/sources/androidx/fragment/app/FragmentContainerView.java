package androidx.fragment.app;

import K.i0;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import c0.AbstractC0386a;
import com.boxhdo.android.tv.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import r0.AbstractC1111a;
/* loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {

    /* renamed from: q  reason: collision with root package name */
    public final ArrayList f5890q;

    /* renamed from: r  reason: collision with root package name */
    public final ArrayList f5891r;

    /* renamed from: s  reason: collision with root package name */
    public View.OnApplyWindowInsetsListener f5892s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f5893t;

    public FragmentContainerView(Context context) {
        super(context);
        this.f5890q = new ArrayList();
        this.f5891r = new ArrayList();
        this.f5893t = true;
    }

    public final void a(View view) {
        if (this.f5891r.contains(view)) {
            this.f5890q.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        ComponentCallbacksC0269x componentCallbacksC0269x;
        M5.g.f(view, "child");
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if (tag instanceof ComponentCallbacksC0269x) {
            componentCallbacksC0269x = (ComponentCallbacksC0269x) tag;
        } else {
            componentCallbacksC0269x = null;
        }
        if (componentCallbacksC0269x != null) {
            super.addView(view, i7, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        i0 i0Var;
        M5.g.f(windowInsets, "insets");
        i0 d = i0.d(windowInsets, null);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f5892s;
        if (onApplyWindowInsetsListener != null) {
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            M5.g.e(onApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            i0Var = i0.d(onApplyWindowInsets, null);
        } else {
            Field field = K.O.f1447a;
            WindowInsets c5 = d.c();
            if (c5 != null) {
                WindowInsets b7 = K.B.b(this, c5);
                if (!b7.equals(c5)) {
                    d = i0.d(b7, this);
                }
            }
            i0Var = d;
        }
        if (!i0Var.f1495a.j()) {
            int childCount = getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = getChildAt(i7);
                Field field2 = K.O.f1447a;
                WindowInsets c6 = i0Var.c();
                if (c6 != null) {
                    WindowInsets a7 = K.B.a(childAt, c6);
                    if (!a7.equals(c6)) {
                        i0.d(a7, childAt);
                    }
                }
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        M5.g.f(canvas, "canvas");
        if (this.f5893t) {
            for (View view : this.f5890q) {
                super.drawChild(canvas, view, getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j7) {
        M5.g.f(canvas, "canvas");
        M5.g.f(view, "child");
        if (this.f5893t) {
            ArrayList arrayList = this.f5890q;
            if ((!arrayList.isEmpty()) && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j7);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        M5.g.f(view, "view");
        this.f5891r.remove(view);
        if (this.f5890q.remove(view)) {
            this.f5893t = true;
        }
        super.endViewTransition(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v14, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    public final <F extends ComponentCallbacksC0269x> F getFragment() {
        q1.g gVar;
        ComponentCallbacksC0269x componentCallbacksC0269x;
        S W;
        FragmentContainerView fragmentContainerView = this;
        while (true) {
            gVar = null;
            if (fragmentContainerView != 0) {
                Object tag = fragmentContainerView.getTag(R.id.fragment_container_view_tag);
                if (tag instanceof ComponentCallbacksC0269x) {
                    componentCallbacksC0269x = (ComponentCallbacksC0269x) tag;
                } else {
                    componentCallbacksC0269x = null;
                }
                if (componentCallbacksC0269x != null) {
                    break;
                }
                ViewParent parent = fragmentContainerView.getParent();
                if (parent instanceof View) {
                    fragmentContainerView = (View) parent;
                } else {
                    fragmentContainerView = 0;
                }
            } else {
                componentCallbacksC0269x = null;
                break;
            }
        }
        if (componentCallbacksC0269x != null) {
            if (componentCallbacksC0269x.z()) {
                W = componentCallbacksC0269x.n();
            } else {
                throw new IllegalStateException("The Fragment " + componentCallbacksC0269x + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
        } else {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                } else if (context instanceof q1.g) {
                    gVar = (q1.g) context;
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (gVar != null) {
                W = gVar.W();
            } else {
                throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
            }
        }
        return (F) W.E(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        M5.g.f(windowInsets, "insets");
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            }
            View childAt = getChildAt(childCount);
            M5.g.e(childAt, "view");
            a(childAt);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        M5.g.f(view, "view");
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i7) {
        View childAt = getChildAt(i7);
        M5.g.e(childAt, "view");
        a(childAt);
        super.removeViewAt(i7);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        M5.g.f(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i7, int i8) {
        int i9 = i7 + i8;
        for (int i10 = i7; i10 < i9; i10++) {
            View childAt = getChildAt(i10);
            M5.g.e(childAt, "view");
            a(childAt);
        }
        super.removeViews(i7, i8);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i7, int i8) {
        int i9 = i7 + i8;
        for (int i10 = i7; i10 < i9; i10++) {
            View childAt = getChildAt(i10);
            M5.g.e(childAt, "view");
            a(childAt);
        }
        super.removeViewsInLayout(i7, i8);
    }

    public final void setDrawDisappearingViewsLast(boolean z7) {
        this.f5893t = z7;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        M5.g.f(onApplyWindowInsetsListener, "listener");
        this.f5892s = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        M5.g.f(view, "view");
        if (view.getParent() == this) {
            this.f5891r.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        String str;
        M5.g.f(context, "context");
        this.f5890q = new ArrayList();
        this.f5891r = new ArrayList();
        this.f5893t = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0386a.f7224b, 0, 0);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            obtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, S s6) {
        super(context, attributeSet);
        View view;
        M5.g.f(context, "context");
        M5.g.f(attributeSet, "attrs");
        M5.g.f(s6, "fm");
        this.f5890q = new ArrayList();
        this.f5891r = new ArrayList();
        this.f5893t = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0386a.f7224b, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        String string = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id = getId();
        ComponentCallbacksC0269x E4 = s6.E(id);
        if (classAttribute != null && E4 == null) {
            if (id == -1) {
                throw new IllegalStateException(AbstractC1111a.r("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
            }
            I K6 = s6.K();
            context.getClassLoader();
            ComponentCallbacksC0269x a7 = K6.a(classAttribute);
            M5.g.e(a7, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            a7.f6110N = id;
            a7.f6111O = id;
            a7.f6112P = string;
            a7.f6106J = s6;
            a7.f6107K = s6.f5941v;
            a7.N(context, attributeSet, null);
            C0247a c0247a = new C0247a(s6);
            c0247a.f5992p = true;
            a7.f6118V = this;
            c0247a.f(getId(), a7, string, 1);
            if (!c0247a.f5984g) {
                c0247a.f5985h = false;
                c0247a.f5993q.B(c0247a, true);
            } else {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
        }
        Iterator it = s6.f5925c.y().iterator();
        while (it.hasNext()) {
            Z z7 = (Z) it.next();
            ComponentCallbacksC0269x componentCallbacksC0269x = z7.f5978c;
            if (componentCallbacksC0269x.f6111O == getId() && (view = componentCallbacksC0269x.W) != null && view.getParent() == null) {
                componentCallbacksC0269x.f6118V = this;
                z7.b();
            }
        }
    }
}
