package androidx.leanback.widget;

import android.animation.TimeAnimator;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.boxhdo.android.tv.R;
/* renamed from: androidx.leanback.widget.o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0308o implements TimeAnimator.TimeListener {

    /* renamed from: a  reason: collision with root package name */
    public final View f6615a;

    /* renamed from: b  reason: collision with root package name */
    public final int f6616b;

    /* renamed from: c  reason: collision with root package name */
    public final z0 f6617c;
    public final float d;

    /* renamed from: e  reason: collision with root package name */
    public float f6618e = 0.0f;
    public float f;

    /* renamed from: g  reason: collision with root package name */
    public float f6619g;

    /* renamed from: h  reason: collision with root package name */
    public final TimeAnimator f6620h;

    /* renamed from: i  reason: collision with root package name */
    public final AccelerateDecelerateInterpolator f6621i;

    /* renamed from: j  reason: collision with root package name */
    public final g0.a f6622j;

    public C0308o(View view, float f, boolean z7, int i7) {
        TimeAnimator timeAnimator = new TimeAnimator();
        this.f6620h = timeAnimator;
        this.f6621i = new AccelerateDecelerateInterpolator();
        this.f6615a = view;
        this.f6616b = i7;
        this.d = f - 1.0f;
        if (view instanceof z0) {
            this.f6617c = (z0) view;
        } else {
            this.f6617c = null;
        }
        timeAnimator.setTimeListener(this);
        if (z7) {
            this.f6622j = g0.a.a(view.getContext());
        } else {
            this.f6622j = null;
        }
    }

    public final void a(boolean z7, boolean z8) {
        float f;
        TimeAnimator timeAnimator = this.f6620h;
        timeAnimator.end();
        if (z7) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        if (z8) {
            b(f);
            return;
        }
        float f7 = this.f6618e;
        if (f7 != f) {
            this.f = f7;
            this.f6619g = f - f7;
            timeAnimator.start();
        }
    }

    public void b(float f) {
        this.f6618e = f;
        float f7 = (this.d * f) + 1.0f;
        View view = this.f6615a;
        view.setScaleX(f7);
        view.setScaleY(f7);
        z0 z0Var = this.f6617c;
        if (z0Var != null) {
            z0Var.setShadowFocusLevel(f);
        } else {
            C0.b(view.getTag(R.id.lb_shadow_impl), 3, f);
        }
        g0.a aVar = this.f6622j;
        if (aVar != null) {
            aVar.b(f);
            int color = aVar.f10504c.getColor();
            if (z0Var != null) {
                z0Var.setOverlayColor(color);
                return;
            }
            Drawable foreground = view.getForeground();
            if (foreground instanceof ColorDrawable) {
                ((ColorDrawable) foreground).setColor(color);
            } else {
                view.setForeground(new ColorDrawable(color));
            }
        }
    }

    @Override // android.animation.TimeAnimator.TimeListener
    public final void onTimeUpdate(TimeAnimator timeAnimator, long j7, long j8) {
        float f;
        int i7 = this.f6616b;
        if (j7 >= i7) {
            this.f6620h.end();
            f = 1.0f;
        } else {
            f = (float) (j7 / i7);
        }
        AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = this.f6621i;
        if (accelerateDecelerateInterpolator != null) {
            f = accelerateDecelerateInterpolator.getInterpolation(f);
        }
        b((f * this.f6619g) + this.f);
    }
}
