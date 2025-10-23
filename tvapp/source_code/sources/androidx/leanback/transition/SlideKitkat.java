package androidx.leanback.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.BaseInterpolator;
import android.view.animation.DecelerateInterpolator;
import com.boxhdo.android.tv.R;
import f0.AbstractC0659a;
/* loaded from: classes.dex */
class SlideKitkat extends Visibility {

    /* renamed from: r  reason: collision with root package name */
    public static final DecelerateInterpolator f6315r = new DecelerateInterpolator();

    /* renamed from: s  reason: collision with root package name */
    public static final AccelerateInterpolator f6316s = new AccelerateInterpolator();

    /* renamed from: t  reason: collision with root package name */
    public static final c f6317t = new c(0);

    /* renamed from: u  reason: collision with root package name */
    public static final d f6318u = new d(0);

    /* renamed from: v  reason: collision with root package name */
    public static final c f6319v = new c(1);

    /* renamed from: w  reason: collision with root package name */
    public static final d f6320w = new d(1);

    /* renamed from: x  reason: collision with root package name */
    public static final c f6321x = new c(2);

    /* renamed from: y  reason: collision with root package name */
    public static final c f6322y = new c(3);

    /* renamed from: q  reason: collision with root package name */
    public e f6323q;

    public SlideKitkat(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0659a.f10203i);
        c(obtainStyledAttributes.getInt(3, 80));
        long j7 = obtainStyledAttributes.getInt(1, -1);
        if (j7 >= 0) {
            setDuration(j7);
        }
        long j8 = obtainStyledAttributes.getInt(2, -1);
        if (j8 > 0) {
            setStartDelay(j8);
        }
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId > 0) {
            setInterpolator(AnimationUtils.loadInterpolator(context, resourceId));
        }
        obtainStyledAttributes.recycle();
    }

    public static ObjectAnimator b(View view, Property property, float f, float f7, float f8, BaseInterpolator baseInterpolator, int i7) {
        float[] fArr = (float[]) view.getTag(R.id.lb_slide_transition_value);
        if (fArr != null) {
            if (View.TRANSLATION_Y == property) {
                f = fArr[1];
            } else {
                f = fArr[0];
            }
            view.setTag(R.id.lb_slide_transition_value, null);
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, f, f7);
        f fVar = new f(view, property, f8, f7, i7);
        ofFloat.addListener(fVar);
        ofFloat.addPauseListener(fVar);
        ofFloat.setInterpolator(baseInterpolator);
        return ofFloat;
    }

    public final void c(int i7) {
        e eVar;
        if (i7 == 3) {
            eVar = f6317t;
        } else if (i7 == 5) {
            eVar = f6319v;
        } else if (i7 == 48) {
            eVar = f6318u;
        } else if (i7 == 80) {
            eVar = f6320w;
        } else if (i7 == 8388611) {
            eVar = f6321x;
        } else if (i7 != 8388613) {
            throw new IllegalArgumentException("Invalid slide direction");
        } else {
            eVar = f6322y;
        }
        this.f6323q = eVar;
    }

    @Override // android.transition.Visibility
    public final Animator onAppear(ViewGroup viewGroup, TransitionValues transitionValues, int i7, TransitionValues transitionValues2, int i8) {
        View view = transitionValues2 != null ? transitionValues2.view : null;
        if (view == null) {
            return null;
        }
        float b7 = this.f6323q.b(view);
        return b(view, this.f6323q.c(), this.f6323q.a(view), b7, b7, f6315r, 0);
    }

    @Override // android.transition.Visibility
    public final Animator onDisappear(ViewGroup viewGroup, TransitionValues transitionValues, int i7, TransitionValues transitionValues2, int i8) {
        View view = transitionValues != null ? transitionValues.view : null;
        if (view == null) {
            return null;
        }
        float b7 = this.f6323q.b(view);
        return b(view, this.f6323q.c(), b7, this.f6323q.a(view), b7, f6316s, 4);
    }
}
