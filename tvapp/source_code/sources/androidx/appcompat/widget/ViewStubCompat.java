package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import e.AbstractC0565a;
import java.lang.ref.WeakReference;
import k.X0;
/* loaded from: classes.dex */
public final class ViewStubCompat extends View {

    /* renamed from: q  reason: collision with root package name */
    public int f5562q;

    /* renamed from: r  reason: collision with root package name */
    public int f5563r;

    /* renamed from: s  reason: collision with root package name */
    public WeakReference f5564s;

    /* renamed from: t  reason: collision with root package name */
    public LayoutInflater f5565t;

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f5562q = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0565a.f9359v, 0, 0);
        this.f5563r = obtainStyledAttributes.getResourceId(2, -1);
        this.f5562q = obtainStyledAttributes.getResourceId(1, 0);
        setId(obtainStyledAttributes.getResourceId(0, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f5563r;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f5565t;
    }

    public int getLayoutResource() {
        return this.f5562q;
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i8) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i7) {
        this.f5563r = i7;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f5565t = layoutInflater;
    }

    public void setLayoutResource(int i7) {
        this.f5562q = i7;
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        WeakReference weakReference = this.f5564s;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view != null) {
                view.setVisibility(i7);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i7);
        if (i7 == 0 || i7 == 4) {
            ViewParent parent = getParent();
            if (parent instanceof ViewGroup) {
                if (this.f5562q != 0) {
                    ViewGroup viewGroup = (ViewGroup) parent;
                    LayoutInflater layoutInflater = this.f5565t;
                    if (layoutInflater == null) {
                        layoutInflater = LayoutInflater.from(getContext());
                    }
                    View inflate = layoutInflater.inflate(this.f5562q, viewGroup, false);
                    int i8 = this.f5563r;
                    if (i8 != -1) {
                        inflate.setId(i8);
                    }
                    int indexOfChild = viewGroup.indexOfChild(this);
                    viewGroup.removeViewInLayout(this);
                    ViewGroup.LayoutParams layoutParams = getLayoutParams();
                    if (layoutParams != null) {
                        viewGroup.addView(inflate, indexOfChild, layoutParams);
                    } else {
                        viewGroup.addView(inflate, indexOfChild);
                    }
                    this.f5564s = new WeakReference(inflate);
                    return;
                }
                throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
            }
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        }
    }

    public void setOnInflateListener(X0 x02) {
    }
}
