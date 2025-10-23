package K;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
/* renamed from: K.t  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserver$OnPreDrawListenerC0043t implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: q  reason: collision with root package name */
    public final View f1503q;

    /* renamed from: r  reason: collision with root package name */
    public ViewTreeObserver f1504r;

    /* renamed from: s  reason: collision with root package name */
    public final Runnable f1505s;

    public ViewTreeObserver$OnPreDrawListenerC0043t(ViewGroup viewGroup, Runnable runnable) {
        this.f1503q = viewGroup;
        this.f1504r = viewGroup.getViewTreeObserver();
        this.f1505s = runnable;
    }

    public static void a(ViewGroup viewGroup, Runnable runnable) {
        if (viewGroup != null) {
            if (runnable != null) {
                ViewTreeObserver$OnPreDrawListenerC0043t viewTreeObserver$OnPreDrawListenerC0043t = new ViewTreeObserver$OnPreDrawListenerC0043t(viewGroup, runnable);
                viewGroup.getViewTreeObserver().addOnPreDrawListener(viewTreeObserver$OnPreDrawListenerC0043t);
                viewGroup.addOnAttachStateChangeListener(viewTreeObserver$OnPreDrawListenerC0043t);
                return;
            }
            throw new NullPointerException("runnable == null");
        }
        throw new NullPointerException("view == null");
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ViewTreeObserver viewTreeObserver;
        boolean isAlive = this.f1504r.isAlive();
        View view = this.f1503q;
        if (isAlive) {
            viewTreeObserver = this.f1504r;
        } else {
            viewTreeObserver = view.getViewTreeObserver();
        }
        viewTreeObserver.removeOnPreDrawListener(this);
        view.removeOnAttachStateChangeListener(this);
        this.f1505s.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f1504r = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewTreeObserver viewTreeObserver;
        boolean isAlive = this.f1504r.isAlive();
        View view2 = this.f1503q;
        if (isAlive) {
            viewTreeObserver = this.f1504r;
        } else {
            viewTreeObserver = view2.getViewTreeObserver();
        }
        viewTreeObserver.removeOnPreDrawListener(this);
        view2.removeOnAttachStateChangeListener(this);
    }
}
