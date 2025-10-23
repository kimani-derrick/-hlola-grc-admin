package com.google.android.exoplayer2.ui;

import M2.a;
import M2.b;
import X2.C0121c;
import X2.C0122d;
import X2.G;
import X2.M;
import Z2.H;
import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import m3.g;
@Deprecated
/* loaded from: classes.dex */
public final class SubtitleView extends FrameLayout {

    /* renamed from: q  reason: collision with root package name */
    public List f8197q;

    /* renamed from: r  reason: collision with root package name */
    public C0122d f8198r;

    /* renamed from: s  reason: collision with root package name */
    public int f8199s;

    /* renamed from: t  reason: collision with root package name */
    public float f8200t;

    /* renamed from: u  reason: collision with root package name */
    public float f8201u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f8202v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f8203w;

    /* renamed from: x  reason: collision with root package name */
    public int f8204x;

    /* renamed from: y  reason: collision with root package name */
    public G f8205y;

    /* renamed from: z  reason: collision with root package name */
    public View f8206z;

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8197q = Collections.emptyList();
        this.f8198r = C0122d.f4165g;
        this.f8199s = 0;
        this.f8200t = 0.0533f;
        this.f8201u = 0.08f;
        this.f8202v = true;
        this.f8203w = true;
        C0121c c0121c = new C0121c(context);
        this.f8205y = c0121c;
        this.f8206z = c0121c;
        addView(c0121c);
        this.f8204x = 1;
    }

    private List<b> getCuesWithStylingPreferencesApplied() {
        Object[] spans;
        if (this.f8202v && this.f8203w) {
            return this.f8197q;
        }
        ArrayList arrayList = new ArrayList(this.f8197q.size());
        for (int i7 = 0; i7 < this.f8197q.size(); i7++) {
            a a7 = ((b) this.f8197q.get(i7)).a();
            if (!this.f8202v) {
                a7.n = false;
                CharSequence charSequence = a7.f2205a;
                if (charSequence instanceof Spanned) {
                    if (!(charSequence instanceof Spannable)) {
                        a7.f2205a = SpannableString.valueOf(charSequence);
                    }
                    CharSequence charSequence2 = a7.f2205a;
                    charSequence2.getClass();
                    Spannable spannable = (Spannable) charSequence2;
                    for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                        if (!(obj instanceof Q2.b)) {
                            spannable.removeSpan(obj);
                        }
                    }
                }
                g.E(a7);
            } else if (!this.f8203w) {
                g.E(a7);
            }
            arrayList.add(a7.a());
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (H.f4603a < 19 || isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private C0122d getUserCaptionStyle() {
        CaptioningManager captioningManager;
        C0122d c0122d;
        int i7;
        int i8;
        int i9;
        int i10 = H.f4603a;
        C0122d c0122d2 = C0122d.f4165g;
        if (i10 >= 19 && !isInEditMode() && (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) != null && captioningManager.isEnabled()) {
            CaptioningManager.CaptionStyle userStyle = captioningManager.getUserStyle();
            if (i10 >= 21) {
                int i11 = -1;
                if (userStyle.hasForegroundColor()) {
                    i7 = userStyle.foregroundColor;
                } else {
                    i7 = -1;
                }
                if (userStyle.hasBackgroundColor()) {
                    i8 = userStyle.backgroundColor;
                } else {
                    i8 = -16777216;
                }
                int i12 = i8;
                int i13 = 0;
                if (userStyle.hasWindowColor()) {
                    i9 = userStyle.windowColor;
                } else {
                    i9 = 0;
                }
                if (userStyle.hasEdgeType()) {
                    i13 = userStyle.edgeType;
                }
                int i14 = i13;
                if (userStyle.hasEdgeColor()) {
                    i11 = userStyle.edgeColor;
                }
                c0122d = new C0122d(i7, i12, i9, i14, i11, userStyle.getTypeface());
            } else {
                c0122d = new C0122d(userStyle.foregroundColor, userStyle.backgroundColor, 0, userStyle.edgeType, userStyle.edgeColor, userStyle.getTypeface());
            }
            return c0122d;
        }
        return c0122d2;
    }

    private <T extends View & G> void setView(T t5) {
        removeView(this.f8206z);
        View view = this.f8206z;
        if (view instanceof M) {
            ((M) view).f4150r.destroy();
        }
        this.f8206z = t5;
        this.f8205y = t5;
        addView(t5);
    }

    public final void a() {
        setStyle(getUserCaptionStyle());
    }

    public final void b() {
        setFractionalTextSize(getUserCaptionFontScale() * 0.0533f);
    }

    public final void c() {
        this.f8205y.a(getCuesWithStylingPreferencesApplied(), this.f8198r, this.f8200t, this.f8199s, this.f8201u);
    }

    public void setApplyEmbeddedFontSizes(boolean z7) {
        this.f8203w = z7;
        c();
    }

    public void setApplyEmbeddedStyles(boolean z7) {
        this.f8202v = z7;
        c();
    }

    public void setBottomPaddingFraction(float f) {
        this.f8201u = f;
        c();
    }

    public void setCues(List<b> list) {
        if (list == null) {
            list = Collections.emptyList();
        }
        this.f8197q = list;
        c();
    }

    public void setFractionalTextSize(float f) {
        this.f8199s = 0;
        this.f8200t = f;
        c();
    }

    public void setStyle(C0122d c0122d) {
        this.f8198r = c0122d;
        c();
    }

    public void setViewType(int i7) {
        if (this.f8204x == i7) {
            return;
        }
        if (i7 != 1) {
            if (i7 == 2) {
                setView(new M(getContext()));
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            setView(new C0121c(getContext()));
        }
        this.f8204x = i7;
    }
}
