package L3;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import com.boxhdo.android.tv.R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.LinkedHashSet;
import v3.AbstractC1322a;
/* loaded from: classes.dex */
public final class h extends r {
    public final a d;

    /* renamed from: e  reason: collision with root package name */
    public final b f2069e;
    public final c f;

    /* renamed from: g  reason: collision with root package name */
    public final d f2070g;

    /* renamed from: h  reason: collision with root package name */
    public AnimatorSet f2071h;

    /* renamed from: i  reason: collision with root package name */
    public ValueAnimator f2072i;

    public h(TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.d = new a(0, this);
        this.f2069e = new b(0, this);
        this.f = new c(this, 0);
        this.f2070g = new d(this, 0);
    }

    @Override // L3.r
    public final void a() {
        Drawable i02 = android.support.v4.media.session.b.i0(this.f2097b, R.drawable.mtrl_ic_cancel);
        TextInputLayout textInputLayout = this.f2096a;
        textInputLayout.setEndIconDrawable(i02);
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(R.string.clear_text_end_icon_content_description));
        textInputLayout.setEndIconOnClickListener(new e(0, this));
        LinkedHashSet linkedHashSet = textInputLayout.f9005u0;
        c cVar = this.f;
        linkedHashSet.add(cVar);
        if (textInputLayout.f9004u != null) {
            cVar.a(textInputLayout);
        }
        textInputLayout.y0.add(this.f2070g);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(AbstractC1322a.d);
        ofFloat.setDuration(150L);
        ofFloat.addUpdateListener(new g(this, 1));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        LinearInterpolator linearInterpolator = AbstractC1322a.f15312a;
        ofFloat2.setInterpolator(linearInterpolator);
        ofFloat2.setDuration(100L);
        ofFloat2.addUpdateListener(new g(this, 0));
        AnimatorSet animatorSet = new AnimatorSet();
        this.f2071h = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        this.f2071h.addListener(new f(this, 0));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat3.setInterpolator(linearInterpolator);
        ofFloat3.setDuration(100L);
        ofFloat3.addUpdateListener(new g(this, 0));
        this.f2072i = ofFloat3;
        ofFloat3.addListener(new f(this, 1));
    }

    @Override // L3.r
    public final void c(boolean z7) {
        if (this.f2096a.getSuffixText() == null) {
            return;
        }
        d(z7);
    }

    public final void d(boolean z7) {
        boolean z8;
        if (this.f2096a.g() == z7) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z7 && !this.f2071h.isRunning()) {
            this.f2072i.cancel();
            this.f2071h.start();
            if (z8) {
                this.f2071h.end();
            }
        } else if (!z7) {
            this.f2071h.cancel();
            this.f2072i.start();
            if (z8) {
                this.f2072i.end();
            }
        }
    }
}
