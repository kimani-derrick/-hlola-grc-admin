package B3;

import android.content.res.Configuration;
import android.media.MediaCodec;
import android.os.LocaleList;
import java.util.Comparator;
import java.util.PriorityQueue;
/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ MediaCodec.CryptoInfo.Pattern e() {
        return new MediaCodec.CryptoInfo.Pattern(0, 0);
    }

    public static /* synthetic */ MediaCodec.CryptoInfo.Pattern f(int i7, int i8) {
        return new MediaCodec.CryptoInfo.Pattern(i7, i8);
    }

    public static /* bridge */ /* synthetic */ LocaleList g(Configuration configuration) {
        return configuration.getLocales();
    }

    public static /* bridge */ /* synthetic */ String m(LocaleList localeList) {
        return localeList.toLanguageTags();
    }

    public static /* synthetic */ PriorityQueue q(Comparator comparator) {
        return new PriorityQueue(comparator);
    }

    public static /* synthetic */ void s() {
    }
}
