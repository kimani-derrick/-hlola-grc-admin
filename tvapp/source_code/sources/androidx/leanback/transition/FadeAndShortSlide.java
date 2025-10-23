package androidx.leanback.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import f0.AbstractC0659a;
import p6.l;
/* loaded from: classes.dex */
public class FadeAndShortSlide extends Visibility {

    /* renamed from: t  reason: collision with root package name */
    public static final DecelerateInterpolator f6306t = new DecelerateInterpolator();

    /* renamed from: u  reason: collision with root package name */
    public static final a f6307u = new a(0);

    /* renamed from: v  reason: collision with root package name */
    public static final a f6308v = new a(1);

    /* renamed from: w  reason: collision with root package name */
    public static final a f6309w = new a(2);

    /* renamed from: x  reason: collision with root package name */
    public static final a f6310x = new a(3);

    /* renamed from: y  reason: collision with root package name */
    public static final a f6311y = new a(4);

    /* renamed from: q  reason: collision with root package name */
    public final android.support.v4.media.session.b f6312q;

    /* renamed from: r  reason: collision with root package name */
    public Visibility f6313r;

    /* renamed from: s  reason: collision with root package name */
    public final float f6314s;

    public FadeAndShortSlide(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a aVar;
        this.f6313r = new Fade();
        this.f6314s = -1.0f;
        b bVar = new b(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0659a.f10203i);
        int i7 = obtainStyledAttributes.getInt(3, 8388611);
        if (i7 != 48) {
            if (i7 != 80) {
                if (i7 != 112) {
                    if (i7 != 8388611) {
                        if (i7 != 8388613) {
                            if (i7 == 8388615) {
                                aVar = f6309w;
                            } else {
                                throw new IllegalArgumentException("Invalid slide direction");
                            }
                        } else {
                            aVar = f6308v;
                        }
                    } else {
                        aVar = f6307u;
                    }
                } else {
                    this.f6312q = bVar;
                    obtainStyledAttributes.recycle();
                }
            } else {
                aVar = f6310x;
            }
        } else {
            aVar = f6311y;
        }
        this.f6312q = aVar;
        obtainStyledAttributes.recycle();
    }

    @Override // android.transition.Transition
    public final Transition addListener(Transition.TransitionListener transitionListener) {
        this.f6313r.addListener(transitionListener);
        return super.addListener(transitionListener);
    }

    public final float b(ViewGroup viewGroup) {
        float f = this.f6314s;
        return f >= 0.0f ? f : viewGroup.getWidth() / 4;
    }

    public final float c(ViewGroup viewGroup) {
        float f = this.f6314s;
        return f >= 0.0f ? f : viewGroup.getHeight() / 4;
    }

    @Override // android.transition.Visibility, android.transition.Transition
    public final void captureEndValues(TransitionValues transitionValues) {
        this.f6313r.captureEndValues(transitionValues);
        super.captureEndValues(transitionValues);
        int[] iArr = new int[2];
        transitionValues.view.getLocationOnScreen(iArr);
        transitionValues.values.put("android:fadeAndShortSlideTransition:screenPosition", iArr);
    }

    @Override // android.transition.Visibility, android.transition.Transition
    public final void captureStartValues(TransitionValues transitionValues) {
        this.f6313r.captureStartValues(transitionValues);
        super.captureStartValues(transitionValues);
        int[] iArr = new int[2];
        transitionValues.view.getLocationOnScreen(iArr);
        transitionValues.values.put("android:fadeAndShortSlideTransition:screenPosition", iArr);
    }

    @Override // android.transition.Transition
    public final Transition clone() {
        FadeAndShortSlide fadeAndShortSlide = (FadeAndShortSlide) super.clone();
        fadeAndShortSlide.f6313r = (Visibility) this.f6313r.clone();
        return fadeAndShortSlide;
    }

    @Override // android.transition.Visibility
    public final Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues2 == null || viewGroup == view) {
            return null;
        }
        int[] iArr = (int[]) transitionValues2.values.get("android:fadeAndShortSlideTransition:screenPosition");
        int i7 = iArr[0];
        int i8 = iArr[1];
        float translationX = view.getTranslationX();
        ObjectAnimator m7 = l.m(view, transitionValues2, i7, i8, this.f6312q.k0(this, viewGroup, view, iArr), this.f6312q.l0(this, viewGroup, view, iArr), translationX, view.getTranslationY(), f6306t, this);
        Animator onAppear = this.f6313r.onAppear(viewGroup, view, transitionValues, transitionValues2);
        if (m7 == null) {
            return onAppear;
        }
        if (onAppear == null) {
            return m7;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(m7).with(onAppear);
        return animatorSet;
    }

    @Override // android.transition.Visibility
    public final Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues == null || viewGroup == view) {
            return null;
        }
        int[] iArr = (int[]) transitionValues.values.get("android:fadeAndShortSlideTransition:screenPosition");
        ObjectAnimator m7 = l.m(view, transitionValues, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.f6312q.k0(this, viewGroup, view, iArr), this.f6312q.l0(this, viewGroup, view, iArr), f6306t, this);
        Animator onDisappear = this.f6313r.onDisappear(viewGroup, view, transitionValues, transitionValues2);
        if (m7 == null) {
            return onDisappear;
        }
        if (onDisappear == null) {
            return m7;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(m7).with(onDisappear);
        return animatorSet;
    }

    @Override // android.transition.Transition
    public final Transition removeListener(Transition.TransitionListener transitionListener) {
        this.f6313r.removeListener(transitionListener);
        return super.removeListener(transitionListener);
    }

    @Override // android.transition.Transition
    public final void setEpicenterCallback(Transition.EpicenterCallback epicenterCallback) {
        this.f6313r.setEpicenterCallback(epicenterCallback);
        super.setEpicenterCallback(epicenterCallback);
    }
}
