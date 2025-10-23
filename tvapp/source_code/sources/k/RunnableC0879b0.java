package k;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import j.View$OnTouchListenerC0776a;
/* renamed from: k.b0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0879b0 implements Runnable {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f11985q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ View$OnTouchListenerC0776a f11986r;

    public /* synthetic */ RunnableC0879b0(View$OnTouchListenerC0776a view$OnTouchListenerC0776a, int i7) {
        this.f11985q = i7;
        this.f11986r = view$OnTouchListenerC0776a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11985q) {
            case 0:
                ViewParent parent = this.f11986r.f11399t.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    return;
                }
                return;
            default:
                View$OnTouchListenerC0776a view$OnTouchListenerC0776a = this.f11986r;
                view$OnTouchListenerC0776a.a();
                View view = view$OnTouchListenerC0776a.f11399t;
                if (view.isEnabled() && !view.isLongClickable() && view$OnTouchListenerC0776a.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    view$OnTouchListenerC0776a.f11402w = true;
                    return;
                }
                return;
        }
    }
}
