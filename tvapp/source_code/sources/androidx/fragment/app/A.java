package androidx.fragment.app;

import K.ViewTreeObserver$OnPreDrawListenerC0043t;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
/* loaded from: classes.dex */
public final class A extends AnimationSet implements Runnable {

    /* renamed from: q  reason: collision with root package name */
    public final ViewGroup f5874q;

    /* renamed from: r  reason: collision with root package name */
    public final View f5875r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f5876s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f5877t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f5878u;

    public A(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f5878u = true;
        this.f5874q = viewGroup;
        this.f5875r = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j7, Transformation transformation) {
        this.f5878u = true;
        if (this.f5876s) {
            return !this.f5877t;
        }
        if (!super.getTransformation(j7, transformation)) {
            this.f5876s = true;
            ViewTreeObserver$OnPreDrawListenerC0043t.a(this.f5874q, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z7 = this.f5876s;
        ViewGroup viewGroup = this.f5874q;
        if (z7 || !this.f5878u) {
            viewGroup.endViewTransition(this.f5875r);
            this.f5877t = true;
            return;
        }
        this.f5878u = false;
        viewGroup.post(this);
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j7, Transformation transformation, float f) {
        this.f5878u = true;
        if (this.f5876s) {
            return !this.f5877t;
        }
        if (!super.getTransformation(j7, transformation, f)) {
            this.f5876s = true;
            ViewTreeObserver$OnPreDrawListenerC0043t.a(this.f5874q, this);
        }
        return true;
    }
}
