package X2;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import com.boxhdo.android.tv.R;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class B {

    /* renamed from: A  reason: collision with root package name */
    public boolean f4085A;

    /* renamed from: B  reason: collision with root package name */
    public boolean f4086B;

    /* renamed from: a  reason: collision with root package name */
    public final w f4088a;

    /* renamed from: b  reason: collision with root package name */
    public final View f4089b;

    /* renamed from: c  reason: collision with root package name */
    public final ViewGroup f4090c;
    public final ViewGroup d;

    /* renamed from: e  reason: collision with root package name */
    public final ViewGroup f4091e;
    public final ViewGroup f;

    /* renamed from: g  reason: collision with root package name */
    public final ViewGroup f4092g;

    /* renamed from: h  reason: collision with root package name */
    public final ViewGroup f4093h;

    /* renamed from: i  reason: collision with root package name */
    public final ViewGroup f4094i;

    /* renamed from: j  reason: collision with root package name */
    public final View f4095j;

    /* renamed from: k  reason: collision with root package name */
    public final View f4096k;

    /* renamed from: l  reason: collision with root package name */
    public final AnimatorSet f4097l;

    /* renamed from: m  reason: collision with root package name */
    public final AnimatorSet f4098m;
    public final AnimatorSet n;

    /* renamed from: o  reason: collision with root package name */
    public final AnimatorSet f4099o;

    /* renamed from: p  reason: collision with root package name */
    public final AnimatorSet f4100p;

    /* renamed from: q  reason: collision with root package name */
    public final ValueAnimator f4101q;

    /* renamed from: r  reason: collision with root package name */
    public final ValueAnimator f4102r;

    /* renamed from: s  reason: collision with root package name */
    public final x f4103s = new x(this, 0);

    /* renamed from: t  reason: collision with root package name */
    public final x f4104t = new x(this, 3);

    /* renamed from: u  reason: collision with root package name */
    public final x f4105u = new x(this, 4);

    /* renamed from: v  reason: collision with root package name */
    public final x f4106v = new x(this, 5);

    /* renamed from: w  reason: collision with root package name */
    public final x f4107w = new x(this, 6);

    /* renamed from: x  reason: collision with root package name */
    public final View$OnLayoutChangeListenerC0128j f4108x = new View$OnLayoutChangeListenerC0128j(1, this);

    /* renamed from: C  reason: collision with root package name */
    public boolean f4087C = true;

    /* renamed from: z  reason: collision with root package name */
    public int f4110z = 0;

    /* renamed from: y  reason: collision with root package name */
    public final ArrayList f4109y = new ArrayList();

    public B(w wVar) {
        this.f4088a = wVar;
        this.f4089b = wVar.findViewById(R.id.exo_controls_background);
        this.f4090c = (ViewGroup) wVar.findViewById(R.id.exo_center_controls);
        this.f4091e = (ViewGroup) wVar.findViewById(R.id.exo_minimal_controls);
        ViewGroup viewGroup = (ViewGroup) wVar.findViewById(R.id.exo_bottom_bar);
        this.d = viewGroup;
        this.f4094i = (ViewGroup) wVar.findViewById(R.id.exo_time);
        View findViewById = wVar.findViewById(R.id.exo_progress);
        this.f4095j = findViewById;
        this.f = (ViewGroup) wVar.findViewById(R.id.exo_basic_controls);
        this.f4092g = (ViewGroup) wVar.findViewById(R.id.exo_extra_controls);
        this.f4093h = (ViewGroup) wVar.findViewById(R.id.exo_extra_controls_scroll_view);
        View findViewById2 = wVar.findViewById(R.id.exo_overflow_show);
        this.f4096k = findViewById2;
        View findViewById3 = wVar.findViewById(R.id.exo_overflow_hide);
        if (findViewById2 != null && findViewById3 != null) {
            findViewById2.setOnClickListener(new C1.b(5, this));
            findViewById3.setOnClickListener(new C1.b(5, this));
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: X2.y

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ B f4278b;

            {
                this.f4278b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r2) {
                    case 0:
                        B b7 = this.f4278b;
                        b7.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view = b7.f4089b;
                        if (view != null) {
                            view.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup2 = b7.f4090c;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup3 = b7.f4091e;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(floatValue);
                            return;
                        }
                        return;
                    case 1:
                        B b8 = this.f4278b;
                        b8.getClass();
                        b8.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    case 2:
                        B b9 = this.f4278b;
                        b9.getClass();
                        b9.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    default:
                        B b10 = this.f4278b;
                        b10.getClass();
                        float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view2 = b10.f4089b;
                        if (view2 != null) {
                            view2.setAlpha(floatValue2);
                        }
                        ViewGroup viewGroup4 = b10.f4090c;
                        if (viewGroup4 != null) {
                            viewGroup4.setAlpha(floatValue2);
                        }
                        ViewGroup viewGroup5 = b10.f4091e;
                        if (viewGroup5 != null) {
                            viewGroup5.setAlpha(floatValue2);
                            return;
                        }
                        return;
                }
            }
        });
        ofFloat.addListener(new z(this, 0));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.setInterpolator(new LinearInterpolator());
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: X2.y

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ B f4278b;

            {
                this.f4278b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r2) {
                    case 0:
                        B b7 = this.f4278b;
                        b7.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view = b7.f4089b;
                        if (view != null) {
                            view.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup2 = b7.f4090c;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup3 = b7.f4091e;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(floatValue);
                            return;
                        }
                        return;
                    case 1:
                        B b8 = this.f4278b;
                        b8.getClass();
                        b8.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    case 2:
                        B b9 = this.f4278b;
                        b9.getClass();
                        b9.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    default:
                        B b10 = this.f4278b;
                        b10.getClass();
                        float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view2 = b10.f4089b;
                        if (view2 != null) {
                            view2.setAlpha(floatValue2);
                        }
                        ViewGroup viewGroup4 = b10.f4090c;
                        if (viewGroup4 != null) {
                            viewGroup4.setAlpha(floatValue2);
                        }
                        ViewGroup viewGroup5 = b10.f4091e;
                        if (viewGroup5 != null) {
                            viewGroup5.setAlpha(floatValue2);
                            return;
                        }
                        return;
                }
            }
        });
        ofFloat2.addListener(new z(this, 1));
        Resources resources = wVar.getResources();
        float dimension = resources.getDimension(R.dimen.exo_styled_bottom_bar_height) - resources.getDimension(R.dimen.exo_styled_progress_bar_height);
        float dimension2 = resources.getDimension(R.dimen.exo_styled_bottom_bar_height);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f4097l = animatorSet;
        animatorSet.setDuration(250L);
        animatorSet.addListener(new A(this, wVar, 0));
        animatorSet.play(ofFloat).with(e(findViewById, 0.0f, dimension)).with(e(viewGroup, 0.0f, dimension));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f4098m = animatorSet2;
        animatorSet2.setDuration(250L);
        animatorSet2.addListener(new A(this, wVar, 1));
        animatorSet2.play(e(findViewById, dimension, dimension2)).with(e(viewGroup, dimension, dimension2));
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.n = animatorSet3;
        animatorSet3.setDuration(250L);
        animatorSet3.addListener(new A(this, wVar, 2));
        animatorSet3.play(ofFloat).with(e(findViewById, 0.0f, dimension2)).with(e(viewGroup, 0.0f, dimension2));
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.f4099o = animatorSet4;
        animatorSet4.setDuration(250L);
        animatorSet4.addListener(new z(this, 2));
        animatorSet4.play(ofFloat2).with(e(findViewById, dimension, 0.0f)).with(e(viewGroup, dimension, 0.0f));
        AnimatorSet animatorSet5 = new AnimatorSet();
        this.f4100p = animatorSet5;
        animatorSet5.setDuration(250L);
        animatorSet5.addListener(new z(this, 3));
        animatorSet5.play(ofFloat2).with(e(findViewById, dimension2, 0.0f)).with(e(viewGroup, dimension2, 0.0f));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f4101q = ofFloat3;
        ofFloat3.setDuration(250L);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: X2.y

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ B f4278b;

            {
                this.f4278b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r2) {
                    case 0:
                        B b7 = this.f4278b;
                        b7.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view = b7.f4089b;
                        if (view != null) {
                            view.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup2 = b7.f4090c;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup3 = b7.f4091e;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(floatValue);
                            return;
                        }
                        return;
                    case 1:
                        B b8 = this.f4278b;
                        b8.getClass();
                        b8.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    case 2:
                        B b9 = this.f4278b;
                        b9.getClass();
                        b9.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    default:
                        B b10 = this.f4278b;
                        b10.getClass();
                        float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view2 = b10.f4089b;
                        if (view2 != null) {
                            view2.setAlpha(floatValue2);
                        }
                        ViewGroup viewGroup4 = b10.f4090c;
                        if (viewGroup4 != null) {
                            viewGroup4.setAlpha(floatValue2);
                        }
                        ViewGroup viewGroup5 = b10.f4091e;
                        if (viewGroup5 != null) {
                            viewGroup5.setAlpha(floatValue2);
                            return;
                        }
                        return;
                }
            }
        });
        ofFloat3.addListener(new z(this, 4));
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.f4102r = ofFloat4;
        ofFloat4.setDuration(250L);
        ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: X2.y

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ B f4278b;

            {
                this.f4278b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (r2) {
                    case 0:
                        B b7 = this.f4278b;
                        b7.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view = b7.f4089b;
                        if (view != null) {
                            view.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup2 = b7.f4090c;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup3 = b7.f4091e;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(floatValue);
                            return;
                        }
                        return;
                    case 1:
                        B b8 = this.f4278b;
                        b8.getClass();
                        b8.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    case 2:
                        B b9 = this.f4278b;
                        b9.getClass();
                        b9.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    default:
                        B b10 = this.f4278b;
                        b10.getClass();
                        float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view2 = b10.f4089b;
                        if (view2 != null) {
                            view2.setAlpha(floatValue2);
                        }
                        ViewGroup viewGroup4 = b10.f4090c;
                        if (viewGroup4 != null) {
                            viewGroup4.setAlpha(floatValue2);
                        }
                        ViewGroup viewGroup5 = b10.f4091e;
                        if (viewGroup5 != null) {
                            viewGroup5.setAlpha(floatValue2);
                            return;
                        }
                        return;
                }
            }
        });
        ofFloat4.addListener(new z(this, 5));
    }

    public static void a(B b7, View view) {
        ValueAnimator valueAnimator;
        b7.h();
        if (view.getId() == R.id.exo_overflow_show) {
            valueAnimator = b7.f4101q;
        } else if (view.getId() == R.id.exo_overflow_hide) {
            valueAnimator = b7.f4102r;
        } else {
            return;
        }
        valueAnimator.start();
    }

    public static int d(View view) {
        if (view == null) {
            return 0;
        }
        int width = view.getWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            return width + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
        }
        return width;
    }

    public static ObjectAnimator e(View view, float f, float f7) {
        return ObjectAnimator.ofFloat(view, "translationY", f, f7);
    }

    public static boolean k(View view) {
        int id = view.getId();
        if (id != R.id.exo_bottom_bar && id != R.id.exo_prev && id != R.id.exo_next && id != R.id.exo_rew && id != R.id.exo_rew_with_amount && id != R.id.exo_ffwd && id != R.id.exo_ffwd_with_amount) {
            return false;
        }
        return true;
    }

    public final void b(float f) {
        ViewGroup viewGroup = this.f4093h;
        if (viewGroup != null) {
            viewGroup.setTranslationX((int) ((1.0f - f) * viewGroup.getWidth()));
        }
        ViewGroup viewGroup2 = this.f4094i;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(1.0f - f);
        }
        ViewGroup viewGroup3 = this.f;
        if (viewGroup3 != null) {
            viewGroup3.setAlpha(1.0f - f);
        }
    }

    public final boolean c(View view) {
        if (view != null && this.f4109y.contains(view)) {
            return true;
        }
        return false;
    }

    public final void f(Runnable runnable, long j7) {
        if (j7 >= 0) {
            this.f4088a.postDelayed(runnable, j7);
        }
    }

    public final void g() {
        w wVar = this.f4088a;
        wVar.removeCallbacks(this.f4107w);
        wVar.removeCallbacks(this.f4104t);
        wVar.removeCallbacks(this.f4106v);
        wVar.removeCallbacks(this.f4105u);
    }

    public final void h() {
        x xVar;
        if (this.f4110z == 3) {
            return;
        }
        g();
        int showTimeoutMs = this.f4088a.getShowTimeoutMs();
        if (showTimeoutMs > 0) {
            if (!this.f4087C) {
                xVar = this.f4107w;
            } else if (this.f4110z == 1) {
                f(this.f4105u, 2000L);
                return;
            } else {
                xVar = this.f4106v;
            }
            f(xVar, showTimeoutMs);
        }
    }

    public final void i(View view, boolean z7) {
        int i7;
        if (view == null) {
            return;
        }
        ArrayList arrayList = this.f4109y;
        if (!z7) {
            view.setVisibility(8);
            arrayList.remove(view);
            return;
        }
        if (this.f4085A && k(view)) {
            i7 = 4;
        } else {
            i7 = 0;
        }
        view.setVisibility(i7);
        arrayList.add(view);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0035 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(int r4) {
        /*
            r3 = this;
            int r0 = r3.f4110z
            r3.f4110z = r4
            X2.w r1 = r3.f4088a
            r2 = 2
            if (r4 != r2) goto Lf
            r2 = 8
        Lb:
            r1.setVisibility(r2)
            goto L13
        Lf:
            if (r0 != r2) goto L13
            r2 = 0
            goto Lb
        L13:
            if (r0 == r4) goto L35
            java.util.concurrent.CopyOnWriteArrayList r4 = r1.f4262t
            java.util.Iterator r4 = r4.iterator()
        L1b:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L35
            java.lang.Object r0 = r4.next()
            X2.v r0 = (X2.v) r0
            r1.getVisibility()
            X2.C r0 = (X2.C) r0
            r0.getClass()
            com.google.android.exoplayer2.ui.StyledPlayerView r0 = r0.f4113s
            r0.k()
            goto L1b
        L35:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X2.B.j(int):void");
    }

    public final void l() {
        AnimatorSet animatorSet;
        if (!this.f4087C) {
            j(0);
            h();
            return;
        }
        int i7 = this.f4110z;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 == 4) {
                        return;
                    }
                } else {
                    this.f4086B = true;
                }
                h();
            }
            animatorSet = this.f4100p;
        } else {
            animatorSet = this.f4099o;
        }
        animatorSet.start();
        h();
    }
}
