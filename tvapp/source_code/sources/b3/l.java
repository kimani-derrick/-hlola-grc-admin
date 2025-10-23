package b3;

import android.content.Context;
import android.graphics.PointF;
import android.opengl.Matrix;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
/* loaded from: classes.dex */
public final class l extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, InterfaceC0367c {

    /* renamed from: s  reason: collision with root package name */
    public final C0374j f7123s;

    /* renamed from: u  reason: collision with root package name */
    public final GestureDetector f7125u;

    /* renamed from: q  reason: collision with root package name */
    public final PointF f7121q = new PointF();

    /* renamed from: r  reason: collision with root package name */
    public final PointF f7122r = new PointF();

    /* renamed from: t  reason: collision with root package name */
    public final float f7124t = 25.0f;

    /* renamed from: v  reason: collision with root package name */
    public volatile float f7126v = 3.1415927f;

    public l(Context context, C0374j c0374j) {
        this.f7123s = c0374j;
        this.f7125u = new GestureDetector(context, this);
    }

    @Override // b3.InterfaceC0367c
    public final void a(float[] fArr, float f) {
        this.f7126v = -f;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.f7121q.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f7) {
        float x7 = (motionEvent2.getX() - this.f7121q.x) / this.f7124t;
        float y3 = motionEvent2.getY();
        PointF pointF = this.f7121q;
        float f8 = (y3 - pointF.y) / this.f7124t;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d = this.f7126v;
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        PointF pointF2 = this.f7122r;
        pointF2.x -= (cos * x7) - (sin * f8);
        float f9 = (cos * f8) + (sin * x7) + pointF2.y;
        pointF2.y = f9;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f9));
        C0374j c0374j = this.f7123s;
        PointF pointF3 = this.f7122r;
        synchronized (c0374j) {
            float f10 = pointF3.y;
            c0374j.f7105w = f10;
            Matrix.setRotateM(c0374j.f7103u, 0, -f10, (float) Math.cos(c0374j.f7106x), (float) Math.sin(c0374j.f7106x), 0.0f);
            Matrix.setRotateM(c0374j.f7104v, 0, -pointF3.x, 0.0f, 1.0f, 0.0f);
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return this.f7123s.f7098A.performClick();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f7125u.onTouchEvent(motionEvent);
    }
}
