package k;

import android.os.LocaleList;
import android.widget.TextView;
/* renamed from: k.A  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0842A {
    public static LocaleList a(String str) {
        return LocaleList.forLanguageTags(str);
    }

    public static void b(TextView textView, LocaleList localeList) {
        textView.setTextLocales(localeList);
    }
}
