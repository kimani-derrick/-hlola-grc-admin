package androidx.leanback.widget;

import a.AbstractC0189a;
import android.content.Context;
import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.boxhdo.android.tv.R;
/* loaded from: classes.dex */
public final class I extends AbstractC0189a {

    /* renamed from: h  reason: collision with root package name */
    public final C0 f6399h;

    public I(C0 c02) {
        this.f6399h = c02;
    }

    @Override // a.AbstractC0189a
    public final void I(View view, View view2) {
        int i7;
        z0 z0Var = (z0) view;
        if (z0Var.f6715q && z0Var.f6717s == null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (layoutParams != null) {
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams.width, layoutParams.height);
                int i8 = -2;
                if (layoutParams.width == -1) {
                    i7 = -1;
                } else {
                    i7 = -2;
                }
                layoutParams.width = i7;
                if (layoutParams.height == -1) {
                    i8 = -1;
                }
                layoutParams.height = i8;
                z0Var.setLayoutParams(layoutParams);
                z0Var.addView(view2, layoutParams2);
            } else {
                z0Var.addView(view2);
            }
            if (z0Var.f6718t && z0Var.f6719u != 3) {
                android.support.v4.media.session.b.A0(z0Var, z0Var.getResources().getDimensionPixelSize(R.dimen.lb_rounded_rect_corner_radius));
            }
            z0Var.f6717s = view2;
            return;
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.leanback.widget.I0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.leanback.widget.z0, android.widget.FrameLayout, android.view.View, android.view.ViewGroup] */
    @Override // a.AbstractC0189a
    public final View o(RecyclerView recyclerView) {
        boolean z7;
        Context context = recyclerView.getContext();
        C0 c02 = this.f6399h;
        if (c02.f6350e) {
            int i7 = c02.f6347a;
            boolean z8 = c02.f6348b;
            float f = c02.f6351g;
            float f7 = c02.f6352h;
            int i8 = c02.f;
            ?? frameLayout = new FrameLayout(context);
            frameLayout.f6719u = 1;
            if (!frameLayout.f6715q) {
                frameLayout.f6715q = true;
                if (i8 > 0) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                frameLayout.f6718t = z7;
                frameLayout.f6719u = i7;
                if (i7 != 2) {
                    if (i7 == 3) {
                        frameLayout.f6716r = h4.b.d(frameLayout, f, f7, i8);
                    }
                } else {
                    frameLayout.setLayoutMode(1);
                    LayoutInflater.from(frameLayout.getContext()).inflate((int) R.layout.lb_shadow, (ViewGroup) frameLayout, true);
                    ?? obj = new Object();
                    obj.f6400a = frameLayout.findViewById(R.id.lb_shadow_normal);
                    obj.f6401b = frameLayout.findViewById(R.id.lb_shadow_focused);
                    frameLayout.f6716r = obj;
                }
                if (z8) {
                    frameLayout.setWillNotDraw(false);
                    frameLayout.f6721w = 0;
                    Paint paint = new Paint();
                    frameLayout.f6720v = paint;
                    paint.setColor(frameLayout.f6721w);
                    frameLayout.f6720v.setStyle(Paint.Style.FILL);
                } else {
                    frameLayout.setWillNotDraw(true);
                    frameLayout.f6720v = null;
                }
                return frameLayout;
            }
            throw new IllegalStateException();
        }
        throw new IllegalArgumentException();
    }
}
