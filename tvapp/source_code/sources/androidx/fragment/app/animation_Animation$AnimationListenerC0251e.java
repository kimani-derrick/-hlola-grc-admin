package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
/* renamed from: androidx.fragment.app.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class animation.Animation$AnimationListenerC0251e implements Animation.AnimationListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e0 f6033a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f6034b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f6035c;
    public final /* synthetic */ C0252f d;

    public animation.Animation$AnimationListenerC0251e(e0 e0Var, ViewGroup viewGroup, View view, C0252f c0252f) {
        this.f6033a = e0Var;
        this.f6034b = viewGroup;
        this.f6035c = view;
        this.d = c0252f;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        M5.g.f(animation, "animation");
        ViewGroup viewGroup = this.f6034b;
        viewGroup.post(new H2.E(viewGroup, this.f6035c, this.d, 4));
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f6033a + " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        M5.g.f(animation, "animation");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        M5.g.f(animation, "animation");
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f6033a + " has reached onAnimationStart.");
        }
    }
}
