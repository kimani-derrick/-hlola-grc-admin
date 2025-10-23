package androidx.appcompat.widget;

import K.O;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.boxhdo.android.tv.R;
import e.AbstractC0565a;
import java.lang.reflect.Field;
import k.Y0;
/* loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {

    /* renamed from: A  reason: collision with root package name */
    public final int f5422A;

    /* renamed from: B  reason: collision with root package name */
    public boolean f5423B;

    /* renamed from: q  reason: collision with root package name */
    public int f5424q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f5425r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f5426s;

    /* renamed from: t  reason: collision with root package name */
    public CharSequence f5427t;

    /* renamed from: u  reason: collision with root package name */
    public CharSequence f5428u;

    /* renamed from: v  reason: collision with root package name */
    public View f5429v;

    /* renamed from: w  reason: collision with root package name */
    public LinearLayout f5430w;

    /* renamed from: x  reason: collision with root package name */
    public TextView f5431x;

    /* renamed from: y  reason: collision with root package name */
    public TextView f5432y;

    /* renamed from: z  reason: collision with root package name */
    public final int f5433z;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.actionModeStyle);
        Drawable drawable;
        int resourceId;
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) && typedValue.resourceId != 0) {
            new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0565a.d, R.attr.actionModeStyle, 0);
        if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
            drawable = android.support.v4.media.session.b.i0(context, resourceId);
        } else {
            drawable = obtainStyledAttributes.getDrawable(0);
        }
        Field field = O.f1447a;
        setBackground(drawable);
        this.f5433z = obtainStyledAttributes.getResourceId(5, 0);
        this.f5422A = obtainStyledAttributes.getResourceId(4, 0);
        this.f5424q = obtainStyledAttributes.getLayoutDimension(3, 0);
        obtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        obtainStyledAttributes.recycle();
    }

    public static int b(View view, int i7, int i8, int i9, boolean z7) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i10 = ((i9 - measuredHeight) / 2) + i8;
        if (z7) {
            view.layout(i7 - measuredWidth, i10, i7, measuredHeight + i10);
        } else {
            view.layout(i7, i10, i7 + measuredWidth, measuredHeight + i10);
        }
        if (z7) {
            return -measuredWidth;
        }
        return measuredWidth;
    }

    public final void a() {
        if (this.f5430w == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f5430w = linearLayout;
            this.f5431x = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f5432y = (TextView) this.f5430w.findViewById(R.id.action_bar_subtitle);
            int i7 = this.f5433z;
            if (i7 != 0) {
                this.f5431x.setTextAppearance(getContext(), i7);
            }
            int i8 = this.f5422A;
            if (i8 != 0) {
                this.f5432y.setTextAppearance(getContext(), i8);
            }
        }
        this.f5431x.setText(this.f5427t);
        this.f5432y.setText(this.f5428u);
        boolean z7 = !TextUtils.isEmpty(this.f5427t);
        boolean z8 = !TextUtils.isEmpty(this.f5428u);
        int i9 = 8;
        this.f5432y.setVisibility(z8 ? 0 : 8);
        LinearLayout linearLayout2 = this.f5430w;
        if (z7 || z8) {
            i9 = 0;
        }
        linearLayout2.setVisibility(i9);
        if (this.f5430w.getParent() == null) {
            addView(this.f5430w);
        }
    }

    @Override // android.view.View
    /* renamed from: c */
    public final void setVisibility(int i7) {
        if (i7 != getVisibility()) {
            super.setVisibility(i7);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return getVisibility();
    }

    public int getContentHeight() {
        return this.f5424q;
    }

    public CharSequence getSubtitle() {
        return this.f5428u;
    }

    public CharSequence getTitle() {
        return this.f5427t;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, AbstractC0565a.f9341a, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f5426s = false;
        }
        if (!this.f5426s) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f5426s = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f5426s = false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        boolean a7 = Y0.a(this);
        int paddingRight = a7 ? (i9 - i7) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i10 - i8) - getPaddingTop()) - getPaddingBottom();
        LinearLayout linearLayout = this.f5430w;
        if (linearLayout != null && this.f5429v == null && linearLayout.getVisibility() != 8) {
            paddingRight += b(this.f5430w, paddingRight, paddingTop, paddingTop2, a7);
        }
        View view = this.f5429v;
        if (view != null) {
            b(view, paddingRight, paddingTop, paddingTop2, a7);
        }
        if (a7) {
            getPaddingLeft();
        } else {
            getPaddingRight();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i8) {
        int i9;
        boolean z7;
        int i10;
        int i11 = 1073741824;
        if (View.MeasureSpec.getMode(i7) == 1073741824) {
            if (View.MeasureSpec.getMode(i8) != 0) {
                int size = View.MeasureSpec.getSize(i7);
                int i12 = this.f5424q;
                if (i12 <= 0) {
                    i12 = View.MeasureSpec.getSize(i8);
                }
                int paddingBottom = getPaddingBottom() + getPaddingTop();
                int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
                int i13 = i12 - paddingBottom;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i13, Integer.MIN_VALUE);
                LinearLayout linearLayout = this.f5430w;
                if (linearLayout != null && this.f5429v == null) {
                    if (this.f5423B) {
                        this.f5430w.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                        int measuredWidth = this.f5430w.getMeasuredWidth();
                        if (measuredWidth <= paddingLeft) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        if (z7) {
                            paddingLeft -= measuredWidth;
                        }
                        LinearLayout linearLayout2 = this.f5430w;
                        if (z7) {
                            i10 = 0;
                        } else {
                            i10 = 8;
                        }
                        linearLayout2.setVisibility(i10);
                    } else {
                        linearLayout.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, Integer.MIN_VALUE), makeMeasureSpec);
                        paddingLeft = Math.max(0, paddingLeft - linearLayout.getMeasuredWidth());
                    }
                }
                View view = this.f5429v;
                if (view != null) {
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    int i14 = layoutParams.width;
                    if (i14 != -2) {
                        i9 = 1073741824;
                    } else {
                        i9 = Integer.MIN_VALUE;
                    }
                    if (i14 >= 0) {
                        paddingLeft = Math.min(i14, paddingLeft);
                    }
                    int i15 = layoutParams.height;
                    if (i15 == -2) {
                        i11 = Integer.MIN_VALUE;
                    }
                    if (i15 >= 0) {
                        i13 = Math.min(i15, i13);
                    }
                    this.f5429v.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i9), View.MeasureSpec.makeMeasureSpec(i13, i11));
                }
                if (this.f5424q <= 0) {
                    int childCount = getChildCount();
                    i12 = 0;
                    for (int i16 = 0; i16 < childCount; i16++) {
                        int measuredHeight = getChildAt(i16).getMeasuredHeight() + paddingBottom;
                        if (measuredHeight > i12) {
                            i12 = measuredHeight;
                        }
                    }
                }
                setMeasuredDimension(size, i12);
                return;
            }
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f5425r = false;
        }
        if (!this.f5425r) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f5425r = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f5425r = false;
        }
        return true;
    }

    public void setContentHeight(int i7) {
        this.f5424q = i7;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f5429v;
        if (view2 != null) {
            removeView(view2);
        }
        this.f5429v = view;
        if (view != null && (linearLayout = this.f5430w) != null) {
            removeView(linearLayout);
            this.f5430w = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f5428u = charSequence;
        a();
    }

    public void setTitle(CharSequence charSequence) {
        this.f5427t = charSequence;
        a();
        O.j(this, charSequence);
    }

    public void setTitleOptional(boolean z7) {
        if (z7 != this.f5423B) {
            requestLayout();
        }
        this.f5423B = z7;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
