package L3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
/* loaded from: classes.dex */
public final class p extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2084a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f2085b;

    public /* synthetic */ p(int i7, Object obj) {
        this.f2084a = i7;
        this.f2085b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f2084a) {
            case 1:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f2085b;
                actionBarOverlayLayout.f5443J = null;
                actionBarOverlayLayout.f5457z = false;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f2084a) {
            case 0:
                q qVar = (q) this.f2085b;
                qVar.f2098c.setChecked(qVar.f2090j);
                qVar.f2095p.start();
                return;
            case 1:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f2085b;
                actionBarOverlayLayout.f5443J = null;
                actionBarOverlayLayout.f5457z = false;
                return;
            default:
                ((HideBottomViewOnScrollBehavior) this.f2085b).f8740c = null;
                return;
        }
    }
}
