package L3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import k.C0856H;
/* loaded from: classes.dex */
public final class s extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2099a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TextView f2100b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f2101c;
    public final /* synthetic */ TextView d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ t f2102e;

    public s(t tVar, int i7, TextView textView, int i8, TextView textView2) {
        this.f2102e = tVar;
        this.f2099a = i7;
        this.f2100b = textView;
        this.f2101c = i8;
        this.d = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C0856H c0856h;
        int i7 = this.f2099a;
        t tVar = this.f2102e;
        tVar.f2108h = i7;
        tVar.f = null;
        TextView textView = this.f2100b;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.f2101c == 1 && (c0856h = tVar.f2112l) != null) {
                c0856h.setText((CharSequence) null);
            }
        }
        TextView textView2 = this.d;
        if (textView2 != null) {
            textView2.setTranslationY(0.0f);
            textView2.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TextView textView = this.d;
        if (textView != null) {
            textView.setVisibility(0);
        }
    }
}
