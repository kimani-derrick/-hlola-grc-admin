package androidx.leanback.widget;

import android.content.res.Resources;
import android.view.View;
import com.boxhdo.android.tv.R;
/* renamed from: androidx.leanback.widget.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0306n implements InterfaceC0304m {

    /* renamed from: a  reason: collision with root package name */
    public int f6611a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f6612b;

    public C0306n(int i7, boolean z7) {
        if (i7 != 0 && i7 != 1 && i7 != 2 && i7 != 3 && i7 != 4) {
            throw new IllegalArgumentException("Unhandled zoom index");
        }
        this.f6611a = i7;
        this.f6612b = z7;
    }

    @Override // androidx.leanback.widget.InterfaceC0304m
    public void a(View view) {
        c(view).a(false, true);
    }

    @Override // androidx.leanback.widget.InterfaceC0304m
    public void b(View view, boolean z7) {
        view.setSelected(z7);
        c(view).a(z7, false);
    }

    public C0308o c(View view) {
        int i7;
        float fraction;
        C0308o c0308o = (C0308o) view.getTag(R.id.lb_focus_animator);
        if (c0308o == null) {
            Resources resources = view.getResources();
            int i8 = this.f6611a;
            if (i8 == 0) {
                fraction = 1.0f;
            } else {
                if (i8 != 1) {
                    if (i8 != 2) {
                        if (i8 != 3) {
                            if (i8 != 4) {
                                i7 = 0;
                            } else {
                                i7 = R.fraction.lb_focus_zoom_factor_xsmall;
                            }
                        } else {
                            i7 = R.fraction.lb_focus_zoom_factor_large;
                        }
                    } else {
                        i7 = R.fraction.lb_focus_zoom_factor_medium;
                    }
                } else {
                    i7 = R.fraction.lb_focus_zoom_factor_small;
                }
                fraction = resources.getFraction(i7, 1, 1);
            }
            c0308o = new C0308o(view, fraction, this.f6612b, 150);
            view.setTag(R.id.lb_focus_animator, c0308o);
        }
        return c0308o;
    }
}
