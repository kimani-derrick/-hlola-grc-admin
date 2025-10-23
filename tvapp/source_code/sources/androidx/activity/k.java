package androidx.activity;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class k implements Executor, ViewTreeObserver.OnDrawListener, Runnable {

    /* renamed from: r  reason: collision with root package name */
    public Runnable f5320r;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ l f5322t;

    /* renamed from: q  reason: collision with root package name */
    public final long f5319q = SystemClock.uptimeMillis() + 10000;

    /* renamed from: s  reason: collision with root package name */
    public boolean f5321s = false;

    public k(q1.g gVar) {
        this.f5322t = gVar;
    }

    public final void a(View view) {
        if (this.f5321s) {
            return;
        }
        this.f5321s = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f5320r = runnable;
        View decorView = this.f5322t.getWindow().getDecorView();
        if (!this.f5321s) {
            decorView.postOnAnimation(new E1.b(7, this));
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z7;
        Runnable runnable = this.f5320r;
        if (runnable != null) {
            runnable.run();
            this.f5320r = null;
            A0.f fVar = this.f5322t.f5338z;
            synchronized (fVar.f12b) {
                z7 = fVar.f11a;
            }
            if (!z7) {
                return;
            }
        } else if (SystemClock.uptimeMillis() <= this.f5319q) {
            return;
        }
        this.f5321s = false;
        this.f5322t.getWindow().getDecorView().post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5322t.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
