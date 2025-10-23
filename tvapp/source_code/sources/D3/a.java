package D3;

import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
/* loaded from: classes.dex */
public final class a implements View.OnTouchListener {

    /* renamed from: q  reason: collision with root package name */
    public final Dialog f519q;

    /* renamed from: r  reason: collision with root package name */
    public final int f520r;

    /* renamed from: s  reason: collision with root package name */
    public final int f521s;

    /* renamed from: t  reason: collision with root package name */
    public final int f522t;

    public a(Dialog dialog, Rect rect) {
        this.f519q = dialog;
        this.f520r = rect.left;
        this.f521s = rect.top;
        this.f522t = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(16908290);
        int left = findViewById.getLeft() + this.f520r;
        int width = findViewById.getWidth() + left;
        int top = findViewById.getTop() + this.f521s;
        if (new RectF(left, top, width, findViewById.getHeight() + top).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i7 = this.f522t;
            obtain.setLocation((-i7) - 1, (-i7) - 1);
        }
        view.performClick();
        return this.f519q.onTouchEvent(obtain);
    }
}
