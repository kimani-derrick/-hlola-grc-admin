package com.google.android.material.internal;

import A3.f;
import C.j;
import C.o;
import E.a;
import F3.e;
import K.O;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.boxhdo.android.tv.R;
import j.k;
import j.q;
import java.lang.reflect.Field;
import k.C0881c0;
import p6.d;
/* loaded from: classes.dex */
public class NavigationMenuItemView extends e implements q {

    /* renamed from: V  reason: collision with root package name */
    public static final int[] f8915V = {16842912};

    /* renamed from: L  reason: collision with root package name */
    public int f8916L;

    /* renamed from: M  reason: collision with root package name */
    public boolean f8917M;

    /* renamed from: N  reason: collision with root package name */
    public boolean f8918N;

    /* renamed from: O  reason: collision with root package name */
    public final CheckedTextView f8919O;

    /* renamed from: P  reason: collision with root package name */
    public FrameLayout f8920P;

    /* renamed from: Q  reason: collision with root package name */
    public k f8921Q;

    /* renamed from: R  reason: collision with root package name */
    public ColorStateList f8922R;

    /* renamed from: S  reason: collision with root package name */
    public boolean f8923S;

    /* renamed from: T  reason: collision with root package name */
    public Drawable f8924T;

    /* renamed from: U  reason: collision with root package name */
    public final f f8925U;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        f fVar = new f(2, this);
        this.f8925U = fVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(R.id.design_menu_item_text);
        this.f8919O = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        O.i(checkedTextView, fVar);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f8920P == null) {
                this.f8920P = (FrameLayout) ((ViewStub) findViewById(R.id.design_menu_item_action_area_stub)).inflate();
            }
            this.f8920P.removeAllViews();
            this.f8920P.addView(view);
        }
    }

    @Override // j.q
    public final void c(k kVar) {
        int i7;
        C0881c0 c0881c0;
        int i8;
        StateListDrawable stateListDrawable;
        this.f8921Q = kVar;
        int i9 = kVar.f11467a;
        if (i9 > 0) {
            setId(i9);
        }
        if (kVar.isVisible()) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        setVisibility(i7);
        View view = null;
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f8915V, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            Field field = O.f1447a;
            setBackground(stateListDrawable);
        }
        setCheckable(kVar.isCheckable());
        setChecked(kVar.isChecked());
        setEnabled(kVar.isEnabled());
        setTitle(kVar.f11470e);
        setIcon(kVar.getIcon());
        View view2 = kVar.f11489z;
        if (view2 == null) {
            view2 = null;
        }
        setActionView(view2);
        setContentDescription(kVar.f11480q);
        d.G(this, kVar.f11481r);
        k kVar2 = this.f8921Q;
        CharSequence charSequence = kVar2.f11470e;
        CheckedTextView checkedTextView = this.f8919O;
        if (charSequence == null && kVar2.getIcon() == null) {
            View view3 = this.f8921Q.f11489z;
            if (view3 != null) {
                view = view3;
            }
            if (view != null) {
                checkedTextView.setVisibility(8);
                FrameLayout frameLayout = this.f8920P;
                if (frameLayout != null) {
                    c0881c0 = (C0881c0) frameLayout.getLayoutParams();
                    i8 = -1;
                    ((LinearLayout.LayoutParams) c0881c0).width = i8;
                    this.f8920P.setLayoutParams(c0881c0);
                }
                return;
            }
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.f8920P;
        if (frameLayout2 != null) {
            c0881c0 = (C0881c0) frameLayout2.getLayoutParams();
            i8 = -2;
            ((LinearLayout.LayoutParams) c0881c0).width = i8;
            this.f8920P.setLayoutParams(c0881c0);
        }
    }

    @Override // j.q
    public k getItemData() {
        return this.f8921Q;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i7) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i7 + 1);
        k kVar = this.f8921Q;
        if (kVar != null && kVar.isCheckable() && this.f8921Q.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f8915V);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z7) {
        refreshDrawableState();
        if (this.f8918N != z7) {
            this.f8918N = z7;
            this.f8925U.h(this.f8919O, 2048);
        }
    }

    public void setChecked(boolean z7) {
        refreshDrawableState();
        this.f8919O.setChecked(z7);
    }

    public void setHorizontalPadding(int i7) {
        setPadding(i7, 0, i7, 0);
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f8923S) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                a.h(drawable, this.f8922R);
            }
            int i7 = this.f8916L;
            drawable.setBounds(0, 0, i7, i7);
        } else if (this.f8917M) {
            if (this.f8924T == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = o.f343a;
                Drawable a7 = j.a(resources, R.drawable.navigation_empty_icon, theme);
                this.f8924T = a7;
                if (a7 != null) {
                    int i8 = this.f8916L;
                    a7.setBounds(0, 0, i8, i8);
                }
            }
            drawable = this.f8924T;
        }
        this.f8919O.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i7) {
        this.f8919O.setCompoundDrawablePadding(i7);
    }

    public void setIconSize(int i7) {
        this.f8916L = i7;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f8922R = colorStateList;
        this.f8923S = colorStateList != null;
        k kVar = this.f8921Q;
        if (kVar != null) {
            setIcon(kVar.getIcon());
        }
    }

    public void setMaxLines(int i7) {
        this.f8919O.setMaxLines(i7);
    }

    public void setNeedsEmptyIcon(boolean z7) {
        this.f8917M = z7;
    }

    public void setTextAppearance(int i7) {
        this.f8919O.setTextAppearance(i7);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f8919O.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f8919O.setText(charSequence);
    }
}
