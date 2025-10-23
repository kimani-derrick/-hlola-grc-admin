package I;

import android.os.Build;
import android.os.LocaleList;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import java.util.Objects;
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final TextPaint f1196a;

    /* renamed from: b  reason: collision with root package name */
    public final TextDirectionHeuristic f1197b;

    /* renamed from: c  reason: collision with root package name */
    public final int f1198c;
    public final int d;

    public e(PrecomputedText.Params params) {
        TextPaint textPaint;
        TextDirectionHeuristic textDirection;
        int breakStrategy;
        int hyphenationFrequency;
        textPaint = params.getTextPaint();
        this.f1196a = textPaint;
        textDirection = params.getTextDirection();
        this.f1197b = textDirection;
        breakStrategy = params.getBreakStrategy();
        this.f1198c = breakStrategy;
        hyphenationFrequency = params.getHyphenationFrequency();
        this.d = hyphenationFrequency;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0082, code lost:
        if (r1 == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0091, code lost:
        if (r3.getTextLocale().equals(r5.getTextLocale()) == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0098, code lost:
        if (r3.getTypeface() != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x009e, code lost:
        if (r5.getTypeface() == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ad, code lost:
        if (r3.getTypeface().equals(r5.getTypeface()) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b4, code lost:
        if (r7.f1197b != r8.f1197b) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b8, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:?, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof I.e
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            I.e r8 = (I.e) r8
            int r1 = android.os.Build.VERSION.SDK_INT
            int r3 = r8.f1198c
            int r4 = r7.f1198c
            if (r4 == r3) goto L16
            goto Laf
        L16:
            int r3 = r7.d
            int r4 = r8.d
            if (r3 == r4) goto L1e
            goto Laf
        L1e:
            android.text.TextPaint r3 = r7.f1196a
            float r4 = r3.getTextSize()
            android.text.TextPaint r5 = r8.f1196a
            float r6 = r5.getTextSize()
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L30
            goto Laf
        L30:
            float r4 = r3.getTextScaleX()
            float r6 = r5.getTextScaleX()
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L3e
            goto Laf
        L3e:
            float r4 = r3.getTextSkewX()
            float r6 = r5.getTextSkewX()
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L4b
            goto Laf
        L4b:
            float r4 = r3.getLetterSpacing()
            float r6 = r5.getLetterSpacing()
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L58
            goto Laf
        L58:
            java.lang.String r4 = r3.getFontFeatureSettings()
            java.lang.String r6 = r5.getFontFeatureSettings()
            boolean r4 = android.text.TextUtils.equals(r4, r6)
            if (r4 != 0) goto L67
            goto Laf
        L67:
            int r4 = r3.getFlags()
            int r6 = r5.getFlags()
            if (r4 == r6) goto L72
            goto Laf
        L72:
            r4 = 24
            if (r1 < r4) goto L85
            android.os.LocaleList r1 = B3.a.h(r3)
            android.os.LocaleList r4 = B3.a.h(r5)
            boolean r1 = B3.a.y(r1, r4)
            if (r1 != 0) goto L94
            goto Laf
        L85:
            java.util.Locale r1 = r3.getTextLocale()
            java.util.Locale r4 = r5.getTextLocale()
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L94
            goto Laf
        L94:
            android.graphics.Typeface r1 = r3.getTypeface()
            if (r1 != 0) goto La1
            android.graphics.Typeface r1 = r5.getTypeface()
            if (r1 == 0) goto Lb0
            goto Laf
        La1:
            android.graphics.Typeface r1 = r3.getTypeface()
            android.graphics.Typeface r3 = r5.getTypeface()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto Lb0
        Laf:
            return r2
        Lb0:
            android.text.TextDirectionHeuristic r1 = r7.f1197b
            android.text.TextDirectionHeuristic r8 = r8.f1197b
            if (r1 != r8) goto Lb7
            goto Lb8
        Lb7:
            r0 = r2
        Lb8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: I.e.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        LocaleList textLocales;
        TextDirectionHeuristic textDirectionHeuristic = this.f1197b;
        int i7 = Build.VERSION.SDK_INT;
        int i8 = this.d;
        int i9 = this.f1198c;
        TextPaint textPaint = this.f1196a;
        if (i7 >= 24) {
            Float valueOf = Float.valueOf(textPaint.getTextSize());
            Float valueOf2 = Float.valueOf(textPaint.getTextScaleX());
            Float valueOf3 = Float.valueOf(textPaint.getTextSkewX());
            Float valueOf4 = Float.valueOf(textPaint.getLetterSpacing());
            Integer valueOf5 = Integer.valueOf(textPaint.getFlags());
            textLocales = textPaint.getTextLocales();
            return Objects.hash(valueOf, valueOf2, valueOf3, valueOf4, valueOf5, textLocales, textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), textDirectionHeuristic, Integer.valueOf(i9), Integer.valueOf(i8));
        }
        return Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocale(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), textDirectionHeuristic, Integer.valueOf(i9), Integer.valueOf(i8));
    }

    public final String toString() {
        StringBuilder sb;
        Object textLocale;
        String fontVariationSettings;
        StringBuilder sb2 = new StringBuilder("{");
        StringBuilder sb3 = new StringBuilder("textSize=");
        TextPaint textPaint = this.f1196a;
        sb3.append(textPaint.getTextSize());
        sb2.append(sb3.toString());
        sb2.append(", textScaleX=" + textPaint.getTextScaleX());
        sb2.append(", textSkewX=" + textPaint.getTextSkewX());
        int i7 = Build.VERSION.SDK_INT;
        sb2.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb2.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        if (i7 >= 24) {
            sb = new StringBuilder(", textLocale=");
            textLocale = textPaint.getTextLocales();
        } else {
            sb = new StringBuilder(", textLocale=");
            textLocale = textPaint.getTextLocale();
        }
        sb.append(textLocale);
        sb2.append(sb.toString());
        sb2.append(", typeface=" + textPaint.getTypeface());
        if (i7 >= 26) {
            StringBuilder sb4 = new StringBuilder(", variationSettings=");
            fontVariationSettings = textPaint.getFontVariationSettings();
            sb4.append(fontVariationSettings);
            sb2.append(sb4.toString());
        }
        sb2.append(", textDir=" + this.f1197b);
        sb2.append(", breakStrategy=" + this.f1198c);
        sb2.append(", hyphenationFrequency=" + this.d);
        sb2.append("}");
        return sb2.toString();
    }

    public e(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i7, int i8) {
        PrecomputedText.Params.Builder breakStrategy;
        PrecomputedText.Params.Builder hyphenationFrequency;
        PrecomputedText.Params.Builder textDirection;
        if (Build.VERSION.SDK_INT >= 29) {
            breakStrategy = d.g(textPaint).setBreakStrategy(i7);
            hyphenationFrequency = breakStrategy.setHyphenationFrequency(i8);
            textDirection = hyphenationFrequency.setTextDirection(textDirectionHeuristic);
            textDirection.build();
        }
        this.f1196a = textPaint;
        this.f1197b = textDirectionHeuristic;
        this.f1198c = i7;
        this.d = i8;
    }
}
