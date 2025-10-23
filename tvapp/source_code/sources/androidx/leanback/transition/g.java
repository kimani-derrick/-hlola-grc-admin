package androidx.leanback.transition;

import android.transition.Transition;
/* loaded from: classes.dex */
public final class g implements Transition.TransitionListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ p6.d f6331a;

    public g(p6.d dVar) {
        this.f6331a = dVar;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
        this.f6331a.getClass();
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        this.f6331a.x();
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
        this.f6331a.getClass();
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
        this.f6331a.getClass();
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        this.f6331a.getClass();
    }
}
