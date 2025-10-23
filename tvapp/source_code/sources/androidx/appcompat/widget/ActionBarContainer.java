package androidx.appcompat.widget;

import K.O;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.boxhdo.android.tv.R;
import e.AbstractC0565a;
import java.lang.reflect.Field;
import k.AbstractC0921w0;
import k.C0876a;
/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: q  reason: collision with root package name */
    public boolean f5413q;

    /* renamed from: r  reason: collision with root package name */
    public View f5414r;

    /* renamed from: s  reason: collision with root package name */
    public View f5415s;

    /* renamed from: t  reason: collision with root package name */
    public Drawable f5416t;

    /* renamed from: u  reason: collision with root package name */
    public Drawable f5417u;

    /* renamed from: v  reason: collision with root package name */
    public Drawable f5418v;

    /* renamed from: w  reason: collision with root package name */
    public final boolean f5419w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f5420x;

    /* renamed from: y  reason: collision with root package name */
    public final int f5421y;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0876a c0876a = new C0876a(this);
        Field field = O.f1447a;
        setBackground(c0876a);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0565a.f9341a);
        boolean z7 = false;
        this.f5416t = obtainStyledAttributes.getDrawable(0);
        this.f5417u = obtainStyledAttributes.getDrawable(2);
        this.f5421y = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f5419w = true;
            this.f5418v = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.f5419w ? !(this.f5416t != null || this.f5417u != null) : this.f5418v == null) {
            z7 = true;
        }
        setWillNotDraw(z7);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f5416t;
        if (drawable != null && drawable.isStateful()) {
            this.f5416t.setState(getDrawableState());
        }
        Drawable drawable2 = this.f5417u;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f5417u.setState(getDrawableState());
        }
        Drawable drawable3 = this.f5418v;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f5418v.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f5416t;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f5417u;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f5418v;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f5414r = findViewById(R.id.action_bar);
        this.f5415s = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f5413q || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        boolean z8;
        Drawable drawable;
        int left;
        int top;
        int right;
        View view;
        super.onLayout(z7, i7, i8, i9, i10);
        if (this.f5419w) {
            Drawable drawable2 = this.f5418v;
            if (drawable2 == null) {
                return;
            }
            drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
        } else {
            if (this.f5416t != null) {
                if (this.f5414r.getVisibility() == 0) {
                    drawable = this.f5416t;
                    left = this.f5414r.getLeft();
                    top = this.f5414r.getTop();
                    right = this.f5414r.getRight();
                    view = this.f5414r;
                } else {
                    View view2 = this.f5415s;
                    if (view2 == null || view2.getVisibility() != 0) {
                        this.f5416t.setBounds(0, 0, 0, 0);
                        z8 = true;
                    } else {
                        drawable = this.f5416t;
                        left = this.f5415s.getLeft();
                        top = this.f5415s.getTop();
                        right = this.f5415s.getRight();
                        view = this.f5415s;
                    }
                }
                drawable.setBounds(left, top, right, view.getBottom());
                z8 = true;
            } else {
                z8 = false;
            }
            this.f5420x = false;
            if (!z8) {
                return;
            }
        }
        invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i8) {
        int i9;
        if (this.f5414r == null && View.MeasureSpec.getMode(i8) == Integer.MIN_VALUE && (i9 = this.f5421y) >= 0) {
            i8 = View.MeasureSpec.makeMeasureSpec(Math.min(i9, View.MeasureSpec.getSize(i8)), Integer.MIN_VALUE);
        }
        super.onMeasure(i7, i8);
        if (this.f5414r == null) {
            return;
        }
        View.MeasureSpec.getMode(i8);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f5416t;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f5416t);
        }
        this.f5416t = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f5414r;
            if (view != null) {
                this.f5416t.setBounds(view.getLeft(), this.f5414r.getTop(), this.f5414r.getRight(), this.f5414r.getBottom());
            }
        }
        boolean z7 = false;
        if (!this.f5419w ? !(this.f5416t != null || this.f5417u != null) : this.f5418v == null) {
            z7 = true;
        }
        setWillNotDraw(z7);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f5418v;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f5418v);
        }
        this.f5418v = drawable;
        boolean z7 = this.f5419w;
        boolean z8 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z7 && (drawable2 = this.f5418v) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z7 ? !(this.f5416t != null || this.f5417u != null) : this.f5418v == null) {
            z8 = true;
        }
        setWillNotDraw(z8);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f5417u;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f5417u);
        }
        this.f5417u = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f5420x && this.f5417u != null) {
                throw null;
            }
        }
        boolean z7 = false;
        if (!this.f5419w ? !(this.f5416t != null || this.f5417u != null) : this.f5418v == null) {
            z7 = true;
        }
        setWillNotDraw(z7);
        invalidate();
        invalidateOutline();
    }

    public void setTransitioning(boolean z7) {
        this.f5413q = z7;
        setDescendantFocusability(z7 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        boolean z7 = i7 == 0;
        Drawable drawable = this.f5416t;
        if (drawable != null) {
            drawable.setVisible(z7, false);
        }
        Drawable drawable2 = this.f5417u;
        if (drawable2 != null) {
            drawable2.setVisible(z7, false);
        }
        Drawable drawable3 = this.f5418v;
        if (drawable3 != null) {
            drawable3.setVisible(z7, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f5416t;
        boolean z7 = this.f5419w;
        return (drawable == drawable2 && !z7) || (drawable == this.f5417u && this.f5420x) || ((drawable == this.f5418v && z7) || super.verifyDrawable(drawable));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i7) {
        if (i7 != 0) {
            return super.startActionModeForChild(view, callback, i7);
        }
        return null;
    }

    public void setTabContainer(AbstractC0921w0 abstractC0921w0) {
    }
}
