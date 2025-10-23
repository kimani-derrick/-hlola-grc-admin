package androidx.leanback.widget;

import android.view.View;
import com.boxhdo.android.tv.R;
/* loaded from: classes.dex */
public final class C0 {

    /* renamed from: a  reason: collision with root package name */
    public int f6347a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f6348b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f6349c;
    public boolean d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f6350e;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public float f6351g;

    /* renamed from: h  reason: collision with root package name */
    public float f6352h;

    public static void b(Object obj, int i7, float f) {
        if (obj != null) {
            if (f < 0.0f) {
                f = 0.0f;
            } else if (f > 1.0f) {
                f = 1.0f;
            }
            if (i7 != 2) {
                if (i7 == 3) {
                    w0 w0Var = y0.f6713a;
                    x0 x0Var = (x0) obj;
                    View view = x0Var.f6666a;
                    float f7 = x0Var.f6667b;
                    view.setZ(((x0Var.f6668c - f7) * f) + f7);
                    return;
                }
                return;
            }
            I0 i02 = (I0) obj;
            i02.f6400a.setAlpha(1.0f - f);
            i02.f6401b.setAlpha(f);
        }
    }

    public final void a(View view) {
        if (!this.f6350e) {
            if (!this.d) {
                if (!this.f6349c) {
                    return;
                }
            } else if (this.f6347a == 3) {
                view.setTag(R.id.lb_shadow_impl, h4.b.d(view, this.f6351g, this.f6352h, this.f));
                return;
            } else if (!this.f6349c) {
                return;
            }
            android.support.v4.media.session.b.A0(view, this.f);
        }
    }
}
