package androidx.leanback.app;

import X2.RunnableC0120b;
import android.view.View;
import android.view.ViewTreeObserver;
/* loaded from: classes.dex */
public final class o implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: q  reason: collision with root package name */
    public final View f6243q;

    /* renamed from: r  reason: collision with root package name */
    public final Runnable f6244r;

    /* renamed from: s  reason: collision with root package name */
    public int f6245s;

    /* renamed from: t  reason: collision with root package name */
    public final A0.f f6246t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ s f6247u;

    public o(s sVar, RunnableC0120b runnableC0120b, A0.f fVar, View view) {
        this.f6247u = sVar;
        this.f6243q = view;
        this.f6244r = runnableC0120b;
        this.f6246t = fVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        s sVar = this.f6247u;
        View view = sVar.W;
        View view2 = this.f6243q;
        if (view != null && sVar.o() != null) {
            int i7 = this.f6245s;
            if (i7 == 0) {
                this.f6246t.l(true);
                view2.invalidate();
                this.f6245s = 1;
                return false;
            } else if (i7 == 1) {
                this.f6244r.run();
                view2.getViewTreeObserver().removeOnPreDrawListener(this);
                this.f6245s = 2;
                return false;
            } else {
                return false;
            }
        }
        view2.getViewTreeObserver().removeOnPreDrawListener(this);
        return true;
    }
}
