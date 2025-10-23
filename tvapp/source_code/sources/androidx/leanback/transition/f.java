package androidx.leanback.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Property;
import android.view.View;
import com.boxhdo.android.tv.R;
/* loaded from: classes.dex */
public final class f extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public boolean f6326a = false;

    /* renamed from: b  reason: collision with root package name */
    public float f6327b;

    /* renamed from: c  reason: collision with root package name */
    public final View f6328c;
    public final float d;

    /* renamed from: e  reason: collision with root package name */
    public final float f6329e;
    public final int f;

    /* renamed from: g  reason: collision with root package name */
    public final Property f6330g;

    public f(View view, Property property, float f, float f7, int i7) {
        this.f6330g = property;
        this.f6328c = view;
        this.f6329e = f;
        this.d = f7;
        this.f = i7;
        view.setVisibility(0);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        View view = this.f6328c;
        view.setTag(R.id.lb_slide_transition_value, new float[]{view.getTranslationX(), view.getTranslationY()});
        this.f6330g.set(view, Float.valueOf(this.f6329e));
        this.f6326a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        boolean z7 = this.f6326a;
        View view = this.f6328c;
        if (!z7) {
            this.f6330g.set(view, Float.valueOf(this.f6329e));
        }
        view.setVisibility(this.f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        Property property = this.f6330g;
        View view = this.f6328c;
        this.f6327b = ((Float) property.get(view)).floatValue();
        property.set(view, Float.valueOf(this.d));
        view.setVisibility(this.f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        Float valueOf = Float.valueOf(this.f6327b);
        Property property = this.f6330g;
        View view = this.f6328c;
        property.set(view, valueOf);
        view.setVisibility(0);
    }
}
