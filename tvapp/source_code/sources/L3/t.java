package L3;

import K.O;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.boxhdo.android.tv.R;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.reflect.Field;
import java.util.ArrayList;
import k.C0856H;
import v3.AbstractC1322a;
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    public final Context f2103a;

    /* renamed from: b  reason: collision with root package name */
    public final TextInputLayout f2104b;

    /* renamed from: c  reason: collision with root package name */
    public LinearLayout f2105c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public FrameLayout f2106e;
    public Animator f;

    /* renamed from: g  reason: collision with root package name */
    public final float f2107g;

    /* renamed from: h  reason: collision with root package name */
    public int f2108h;

    /* renamed from: i  reason: collision with root package name */
    public int f2109i;

    /* renamed from: j  reason: collision with root package name */
    public CharSequence f2110j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f2111k;

    /* renamed from: l  reason: collision with root package name */
    public C0856H f2112l;

    /* renamed from: m  reason: collision with root package name */
    public CharSequence f2113m;
    public int n;

    /* renamed from: o  reason: collision with root package name */
    public ColorStateList f2114o;

    /* renamed from: p  reason: collision with root package name */
    public CharSequence f2115p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f2116q;

    /* renamed from: r  reason: collision with root package name */
    public C0856H f2117r;

    /* renamed from: s  reason: collision with root package name */
    public int f2118s;

    /* renamed from: t  reason: collision with root package name */
    public ColorStateList f2119t;

    /* renamed from: u  reason: collision with root package name */
    public Typeface f2120u;

    public t(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f2103a = context;
        this.f2104b = textInputLayout;
        this.f2107g = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
    }

    public final void a(TextView textView, int i7) {
        if (this.f2105c == null && this.f2106e == null) {
            Context context = this.f2103a;
            LinearLayout linearLayout = new LinearLayout(context);
            this.f2105c = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.f2105c;
            TextInputLayout textInputLayout = this.f2104b;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f2106e = new FrameLayout(context);
            this.f2105c.addView(this.f2106e, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                b();
            }
        }
        if (i7 != 0 && i7 != 1) {
            this.f2105c.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        } else {
            this.f2106e.setVisibility(0);
            this.f2106e.addView(textView);
        }
        this.f2105c.setVisibility(0);
        this.d++;
    }

    public final void b() {
        if (this.f2105c != null) {
            TextInputLayout textInputLayout = this.f2104b;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.f2103a;
                boolean x7 = m3.g.x(context);
                LinearLayout linearLayout = this.f2105c;
                Field field = O.f1447a;
                int paddingStart = editText.getPaddingStart();
                if (x7) {
                    paddingStart = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
                if (x7) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
                }
                int paddingEnd = editText.getPaddingEnd();
                if (x7) {
                    paddingEnd = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
            }
        }
    }

    public final void c() {
        Animator animator = this.f;
        if (animator != null) {
            animator.cancel();
        }
    }

    public final void d(ArrayList arrayList, boolean z7, TextView textView, int i7, int i8, int i9) {
        float f;
        if (textView != null && z7) {
            if (i7 == i9 || i7 == i8) {
                if (i9 == i7) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, f);
                ofFloat.setDuration(167L);
                ofFloat.setInterpolator(AbstractC1322a.f15312a);
                arrayList.add(ofFloat);
                if (i9 == i7) {
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, -this.f2107g, 0.0f);
                    ofFloat2.setDuration(217L);
                    ofFloat2.setInterpolator(AbstractC1322a.d);
                    arrayList.add(ofFloat2);
                }
            }
        }
    }

    public final boolean e() {
        if (this.f2109i == 1 && this.f2112l != null && !TextUtils.isEmpty(this.f2110j)) {
            return true;
        }
        return false;
    }

    public final TextView f(int i7) {
        if (i7 != 1) {
            if (i7 != 2) {
                return null;
            }
            return this.f2117r;
        }
        return this.f2112l;
    }

    public final void g() {
        int i7;
        this.f2110j = null;
        c();
        if (this.f2108h == 1) {
            if (this.f2116q && !TextUtils.isEmpty(this.f2115p)) {
                i7 = 2;
            } else {
                i7 = 0;
            }
            this.f2109i = i7;
        }
        j(this.f2108h, this.f2109i, i(this.f2112l, null));
    }

    public final void h(TextView textView, int i7) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.f2105c;
        if (linearLayout == null) {
            return;
        }
        if ((i7 == 0 || i7 == 1) && (frameLayout = this.f2106e) != null) {
            frameLayout.removeView(textView);
        } else {
            linearLayout.removeView(textView);
        }
        int i8 = this.d - 1;
        this.d = i8;
        LinearLayout linearLayout2 = this.f2105c;
        if (i8 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    public final boolean i(TextView textView, CharSequence charSequence) {
        Field field = O.f1447a;
        TextInputLayout textInputLayout = this.f2104b;
        if (textInputLayout.isLaidOut() && textInputLayout.isEnabled() && (this.f2109i != this.f2108h || textView == null || !TextUtils.equals(textView.getText(), charSequence))) {
            return true;
        }
        return false;
    }

    public final void j(int i7, int i8, boolean z7) {
        TextView f;
        TextView f7;
        if (i7 == i8) {
            return;
        }
        if (z7) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f = animatorSet;
            ArrayList arrayList = new ArrayList();
            d(arrayList, this.f2116q, this.f2117r, 2, i7, i8);
            d(arrayList, this.f2111k, this.f2112l, 1, i7, i8);
            m3.g.B(animatorSet, arrayList);
            animatorSet.addListener(new s(this, i8, f(i7), i7, f(i8)));
            animatorSet.start();
        } else if (i7 != i8) {
            if (i8 != 0 && (f7 = f(i8)) != null) {
                f7.setVisibility(0);
                f7.setAlpha(1.0f);
            }
            if (i7 != 0 && (f = f(i7)) != null) {
                f.setVisibility(4);
                if (i7 == 1) {
                    f.setText((CharSequence) null);
                }
            }
            this.f2108h = i8;
        }
        TextInputLayout textInputLayout = this.f2104b;
        textInputLayout.q();
        textInputLayout.s(z7, false);
        textInputLayout.z();
    }
}
