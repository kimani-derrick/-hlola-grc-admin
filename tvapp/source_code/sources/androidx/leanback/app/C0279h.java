package androidx.leanback.app;

import android.os.Bundle;
import android.transition.Scene;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC0269x;
import androidx.leanback.widget.M0;
import androidx.leanback.widget.N0;
import androidx.leanback.widget.O0;
import androidx.leanback.widget.TitleView;
import com.boxhdo.android.tv.R;
import k.V0;
/* renamed from: androidx.leanback.app.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0279h extends ComponentCallbacksC0269x {

    /* renamed from: n0  reason: collision with root package name */
    public boolean f6224n0 = true;

    /* renamed from: o0  reason: collision with root package name */
    public CharSequence f6225o0;

    /* renamed from: p0  reason: collision with root package name */
    public View f6226p0;

    /* renamed from: q0  reason: collision with root package name */
    public O0 f6227q0;

    /* renamed from: r0  reason: collision with root package name */
    public View.OnClickListener f6228r0;

    /* renamed from: s0  reason: collision with root package name */
    public V0 f6229s0;

    @Override // androidx.fragment.app.ComponentCallbacksC0269x
    public void J() {
        this.f6117U = true;
        this.f6229s0 = null;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0269x
    public final void O() {
        O0 o02 = this.f6227q0;
        if (o02 != null) {
            o02.a(false);
        }
        this.f6117U = true;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0269x
    public void Q() {
        this.f6117U = true;
        O0 o02 = this.f6227q0;
        if (o02 != null) {
            o02.a(true);
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0269x
    public void R(Bundle bundle) {
        bundle.putBoolean("titleShow", this.f6224n0);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0269x
    public void S() {
        this.f6117U = true;
        if (this.f6227q0 != null) {
            i0(this.f6224n0);
            this.f6227q0.a(true);
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0269x
    public void U(View view, Bundle bundle) {
        Scene scene;
        Transition transition;
        if (bundle != null) {
            this.f6224n0 = bundle.getBoolean("titleShow");
        }
        View view2 = this.f6226p0;
        if (view2 != null && (view instanceof ViewGroup)) {
            V0 v02 = new V0((ViewGroup) view, view2);
            this.f6229s0 = v02;
            if (this.f6224n0) {
                scene = (Scene) v02.f11963e;
                transition = (Transition) v02.d;
            } else {
                scene = (Scene) v02.f;
                transition = (Transition) v02.f11962c;
            }
            TransitionManager.go(scene, transition);
        }
    }

    public final void f0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i7;
        View view;
        TypedValue typedValue = new TypedValue();
        if (viewGroup.getContext().getTheme().resolveAttribute(R.attr.browseTitleViewLayout, typedValue, true)) {
            i7 = typedValue.resourceId;
        } else {
            i7 = R.layout.lb_browse_title;
        }
        View inflate = layoutInflater.inflate(i7, viewGroup, false);
        if (inflate != null) {
            viewGroup.addView(inflate);
            view = inflate.findViewById(R.id.browse_title_group);
        } else {
            view = null;
        }
        g0(view);
    }

    public final void g0(View view) {
        this.f6226p0 = view;
        if (view == null) {
            this.f6227q0 = null;
            this.f6229s0 = null;
            return;
        }
        O0 titleViewAdapter = ((N0) view).getTitleViewAdapter();
        this.f6227q0 = titleViewAdapter;
        ((M0) titleViewAdapter).f6423a.setTitle(this.f6225o0);
        ((M0) this.f6227q0).f6423a.setBadgeDrawable(null);
        View.OnClickListener onClickListener = this.f6228r0;
        if (onClickListener != null) {
            this.f6228r0 = onClickListener;
            O0 o02 = this.f6227q0;
            if (o02 != null) {
                ((M0) o02).f6423a.setOnSearchClickedListener(onClickListener);
            }
        }
        View view2 = this.W;
        if (view2 instanceof ViewGroup) {
            this.f6229s0 = new V0((ViewGroup) view2, this.f6226p0);
        }
    }

    public final void h0(int i7) {
        O0 o02 = this.f6227q0;
        if (o02 != null) {
            TitleView titleView = ((M0) o02).f6423a;
            titleView.f6560t = i7;
            if ((i7 & 2) == 2) {
                titleView.a();
            } else {
                titleView.f6557q.setVisibility(8);
                titleView.f6558r.setVisibility(8);
            }
            int i8 = 4;
            if (titleView.f6561u && (titleView.f6560t & 4) == 4) {
                i8 = 0;
            }
            titleView.f6559s.setVisibility(i8);
        }
        i0(true);
    }

    public final void i0(boolean z7) {
        Scene scene;
        Transition transition;
        if (z7 == this.f6224n0) {
            return;
        }
        this.f6224n0 = z7;
        V0 v02 = this.f6229s0;
        if (v02 != null) {
            if (z7) {
                scene = (Scene) v02.f11963e;
                transition = (Transition) v02.d;
            } else {
                scene = (Scene) v02.f;
                transition = (Transition) v02.f11962c;
            }
            TransitionManager.go(scene, transition);
        }
    }
}
