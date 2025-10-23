package androidx.leanback.widget;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.boxhdo.android.tv.R;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import f0.AbstractC0659a;
import java.lang.reflect.Field;
/* loaded from: classes.dex */
public class SearchOrbView extends FrameLayout implements View.OnClickListener {

    /* renamed from: A  reason: collision with root package name */
    public final float f6514A;

    /* renamed from: B  reason: collision with root package name */
    public ValueAnimator f6515B;

    /* renamed from: C  reason: collision with root package name */
    public boolean f6516C;

    /* renamed from: D  reason: collision with root package name */
    public boolean f6517D;

    /* renamed from: E  reason: collision with root package name */
    public final ArgbEvaluator f6518E;
    public final s0 F;

    /* renamed from: G  reason: collision with root package name */
    public ValueAnimator f6519G;

    /* renamed from: H  reason: collision with root package name */
    public final s0 f6520H;

    /* renamed from: q  reason: collision with root package name */
    public View.OnClickListener f6521q;

    /* renamed from: r  reason: collision with root package name */
    public final View f6522r;

    /* renamed from: s  reason: collision with root package name */
    public final View f6523s;

    /* renamed from: t  reason: collision with root package name */
    public final ImageView f6524t;

    /* renamed from: u  reason: collision with root package name */
    public Drawable f6525u;

    /* renamed from: v  reason: collision with root package name */
    public t0 f6526v;

    /* renamed from: w  reason: collision with root package name */
    public final float f6527w;

    /* renamed from: x  reason: collision with root package name */
    public final int f6528x;

    /* renamed from: y  reason: collision with root package name */
    public final int f6529y;

    /* renamed from: z  reason: collision with root package name */
    public final float f6530z;

    public SearchOrbView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchOrbViewStyle);
    }

    public final void a(boolean z7) {
        float f = 1.0f;
        if (z7) {
            f = this.f6527w;
        }
        ViewPropertyAnimator scaleY = this.f6522r.animate().scaleX(f).scaleY(f);
        long j7 = this.f6529y;
        scaleY.setDuration(j7).start();
        if (this.f6519G == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f6519G = ofFloat;
            ofFloat.addUpdateListener(this.f6520H);
        }
        ValueAnimator valueAnimator = this.f6519G;
        if (z7) {
            valueAnimator.start();
        } else {
            valueAnimator.reverse();
        }
        this.f6519G.setDuration(j7);
        this.f6516C = z7;
        b();
    }

    public final void b() {
        ValueAnimator valueAnimator = this.f6515B;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.f6515B = null;
        }
        if (this.f6516C && this.f6517D) {
            ValueAnimator ofObject = ValueAnimator.ofObject(this.f6518E, Integer.valueOf(this.f6526v.f6653a), Integer.valueOf(this.f6526v.f6654b), Integer.valueOf(this.f6526v.f6653a));
            this.f6515B = ofObject;
            ofObject.setRepeatCount(-1);
            this.f6515B.setDuration(this.f6528x * 2);
            this.f6515B.addUpdateListener(this.F);
            this.f6515B.start();
        }
    }

    public float getFocusedZoom() {
        return this.f6527w;
    }

    public int getLayoutResourceId() {
        return R.layout.lb_search_orb;
    }

    public int getOrbColor() {
        return this.f6526v.f6653a;
    }

    public t0 getOrbColors() {
        return this.f6526v;
    }

    public Drawable getOrbIcon() {
        return this.f6525u;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f6517D = true;
        b();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View.OnClickListener onClickListener = this.f6521q;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f6517D = false;
        b();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z7, int i7, Rect rect) {
        super.onFocusChanged(z7, i7, rect);
        a(z7);
    }

    public void setOnOrbClickedListener(View.OnClickListener onClickListener) {
        this.f6521q = onClickListener;
    }

    public void setOrbColor(int i7) {
        setOrbColors(new t0(i7, i7, 0));
    }

    public void setOrbColors(t0 t0Var) {
        this.f6526v = t0Var;
        this.f6524t.setColorFilter(t0Var.f6655c);
        if (this.f6515B == null) {
            setOrbViewColor(this.f6526v.f6653a);
            return;
        }
        this.f6516C = true;
        b();
    }

    public void setOrbIcon(Drawable drawable) {
        this.f6525u = drawable;
        this.f6524t.setImageDrawable(drawable);
    }

    public void setOrbViewColor(int i7) {
        View view = this.f6523s;
        if (view.getBackground() instanceof GradientDrawable) {
            ((GradientDrawable) view.getBackground()).setColor(i7);
        }
    }

    public void setSearchOrbZ(float f) {
        float f7 = this.f6514A;
        float f8 = this.f6530z;
        float g7 = AbstractC0515y1.g(f7, f8, f, f8);
        Field field = K.O.f1447a;
        K.D.x(this.f6523s, g7);
    }

    public SearchOrbView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f6518E = new ArgbEvaluator();
        this.F = new s0(this, 0);
        this.f6520H = new s0(this, 1);
        Resources resources = context.getResources();
        View inflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(getLayoutResourceId(), (ViewGroup) this, true);
        this.f6522r = inflate;
        this.f6523s = inflate.findViewById(R.id.search_orb);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.icon);
        this.f6524t = imageView;
        this.f6527w = context.getResources().getFraction(R.fraction.lb_search_orb_focused_zoom, 1, 1);
        this.f6528x = context.getResources().getInteger(R.integer.lb_search_orb_pulse_duration_ms);
        this.f6529y = context.getResources().getInteger(R.integer.lb_search_orb_scale_duration_ms);
        float dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.lb_search_orb_focused_z);
        this.f6514A = dimensionPixelSize;
        this.f6530z = context.getResources().getDimensionPixelSize(R.dimen.lb_search_orb_unfocused_z);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0659a.f10202h, i7, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(2);
        setOrbIcon(drawable == null ? resources.getDrawable(R.drawable.lb_ic_in_app_search) : drawable);
        int color = obtainStyledAttributes.getColor(1, resources.getColor(R.color.lb_default_search_color));
        setOrbColors(new t0(color, obtainStyledAttributes.getColor(0, color), obtainStyledAttributes.getColor(3, 0)));
        obtainStyledAttributes.recycle();
        setFocusable(true);
        setClipChildren(false);
        setOnClickListener(this);
        setSoundEffectsEnabled(false);
        setSearchOrbZ(0.0f);
        Field field = K.O.f1447a;
        K.D.x(imageView, dimensionPixelSize);
    }
}
