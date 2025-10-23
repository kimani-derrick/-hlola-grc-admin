package F3;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public CharSequence f709a;

    /* renamed from: b  reason: collision with root package name */
    public final TextPaint f710b;

    /* renamed from: c  reason: collision with root package name */
    public final int f711c;
    public int d;

    /* renamed from: k  reason: collision with root package name */
    public boolean f717k;

    /* renamed from: e  reason: collision with root package name */
    public Layout.Alignment f712e = Layout.Alignment.ALIGN_NORMAL;
    public int f = Integer.MAX_VALUE;

    /* renamed from: g  reason: collision with root package name */
    public float f713g = 0.0f;

    /* renamed from: h  reason: collision with root package name */
    public float f714h = 1.0f;

    /* renamed from: i  reason: collision with root package name */
    public int f715i = 1;

    /* renamed from: j  reason: collision with root package name */
    public boolean f716j = true;

    /* renamed from: l  reason: collision with root package name */
    public TextUtils.TruncateAt f718l = null;

    public g(CharSequence charSequence, TextPaint textPaint, int i7) {
        this.f709a = charSequence;
        this.f710b = textPaint;
        this.f711c = i7;
        this.d = charSequence.length();
    }

    public final StaticLayout a() {
        TextDirectionHeuristic textDirectionHeuristic;
        if (this.f709a == null) {
            this.f709a = "";
        }
        int max = Math.max(0, this.f711c);
        CharSequence charSequence = this.f709a;
        int i7 = this.f;
        TextPaint textPaint = this.f710b;
        if (i7 == 1) {
            charSequence = TextUtils.ellipsize(charSequence, textPaint, max, this.f718l);
        }
        int min = Math.min(charSequence.length(), this.d);
        this.d = min;
        if (this.f717k && this.f == 1) {
            this.f712e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, min, textPaint, max);
        obtain.setAlignment(this.f712e);
        obtain.setIncludePad(this.f716j);
        if (this.f717k) {
            textDirectionHeuristic = TextDirectionHeuristics.RTL;
        } else {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        }
        obtain.setTextDirection(textDirectionHeuristic);
        TextUtils.TruncateAt truncateAt = this.f718l;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.f);
        float f = this.f713g;
        if (f != 0.0f || this.f714h != 1.0f) {
            obtain.setLineSpacing(f, this.f714h);
        }
        if (this.f > 1) {
            obtain.setHyphenationFrequency(this.f715i);
        }
        return obtain.build();
    }
}
