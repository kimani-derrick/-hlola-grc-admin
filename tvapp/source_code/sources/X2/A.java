package X2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
/* loaded from: classes.dex */
public final class A extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4082a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ w f4083b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ B f4084c;

    public /* synthetic */ A(B b7, w wVar, int i7) {
        this.f4082a = i7;
        this.f4084c = b7;
        this.f4083b = wVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f4082a) {
            case 0:
                B b7 = this.f4084c;
                b7.j(1);
                if (b7.f4086B) {
                    this.f4083b.post(b7.f4103s);
                    b7.f4086B = false;
                    return;
                }
                return;
            case 1:
                B b8 = this.f4084c;
                b8.j(2);
                if (b8.f4086B) {
                    this.f4083b.post(b8.f4103s);
                    b8.f4086B = false;
                    return;
                }
                return;
            default:
                B b9 = this.f4084c;
                b9.j(2);
                if (b9.f4086B) {
                    this.f4083b.post(b9.f4103s);
                    b9.f4086B = false;
                    return;
                }
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f4082a) {
            case 0:
                this.f4084c.j(3);
                return;
            case 1:
                this.f4084c.j(3);
                return;
            default:
                this.f4084c.j(3);
                return;
        }
    }
}
