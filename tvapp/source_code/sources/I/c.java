package I;

import android.text.Html;
import android.text.Spanned;
/* loaded from: classes.dex */
public abstract class c {
    public static Spanned a(String str, int i7) {
        return Html.fromHtml(str, i7);
    }

    public static Spanned b(String str, int i7, Html.ImageGetter imageGetter, Html.TagHandler tagHandler) {
        return Html.fromHtml(str, i7, imageGetter, tagHandler);
    }

    public static String c(Spanned spanned, int i7) {
        return Html.toHtml(spanned, i7);
    }
}
