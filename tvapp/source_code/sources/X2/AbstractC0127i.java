package X2;

import android.text.Html;
import java.util.regex.Pattern;
/* renamed from: X2.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0127i {

    /* renamed from: a  reason: collision with root package name */
    public static final Pattern f4181a = Pattern.compile("(&#13;)?&#10;");

    public static String a(CharSequence charSequence) {
        return f4181a.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }
}
