package P;

import android.icu.text.DecimalFormatSymbols;
import android.text.PrecomputedText;
import android.widget.TextView;
/* loaded from: classes.dex */
public abstract class p {
    public static String[] b(DecimalFormatSymbols decimalFormatSymbols) {
        return decimalFormatSymbols.getDigitStrings();
    }

    public static PrecomputedText.Params c(TextView textView) {
        return textView.getTextMetricsParams();
    }

    public static void d(TextView textView, int i7) {
        textView.setFirstBaselineToTopHeight(i7);
    }

    public static CharSequence a(PrecomputedText precomputedText) {
        return precomputedText;
    }
}
