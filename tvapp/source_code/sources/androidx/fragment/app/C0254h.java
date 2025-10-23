package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import r0.AbstractC1111a;
/* renamed from: androidx.fragment.app.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0254h extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f6051a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f6052b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f6053c;
    public final /* synthetic */ e0 d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ C0255i f6054e;

    public C0254h(ViewGroup viewGroup, View view, boolean z7, e0 e0Var, C0255i c0255i) {
        this.f6051a = viewGroup;
        this.f6052b = view;
        this.f6053c = z7;
        this.d = e0Var;
        this.f6054e = c0255i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        M5.g.f(animator, "anim");
        ViewGroup viewGroup = this.f6051a;
        View view = this.f6052b;
        viewGroup.endViewTransition(view);
        boolean z7 = this.f6053c;
        e0 e0Var = this.d;
        if (z7) {
            int i7 = e0Var.f6036a;
            M5.g.e(view, "viewToAnimate");
            AbstractC1111a.c(i7, view, viewGroup);
        }
        C0255i c0255i = this.f6054e;
        ((e0) c0255i.f6055c.f2765q).c(c0255i);
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animator from operation " + e0Var + " has ended.");
        }
    }
}
