package K;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;
/* loaded from: classes.dex */
public abstract class K {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static C0031g b(View view, C0031g c0031g) {
        ContentInfo k5 = c0031g.f1482a.k();
        Objects.requireNonNull(k5);
        ContentInfo n = AbstractC0027c.n(k5);
        ContentInfo performReceiveContent = view.performReceiveContent(n);
        if (performReceiveContent == null) {
            return null;
        }
        if (performReceiveContent == n) {
            return c0031g;
        }
        return new C0031g(new T4.c(performReceiveContent));
    }

    public static void c(View view, String[] strArr, r rVar) {
        if (rVar == null) {
            view.setOnReceiveContentListener(strArr, null);
        } else {
            view.setOnReceiveContentListener(strArr, new L(rVar));
        }
    }
}
