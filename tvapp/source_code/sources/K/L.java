package K;

import android.view.ContentInfo;
import android.view.OnReceiveContentListener;
import android.view.View;
import java.util.Objects;
/* loaded from: classes.dex */
public final class L implements OnReceiveContentListener {

    /* renamed from: a  reason: collision with root package name */
    public final r f1443a;

    public L(r rVar) {
        this.f1443a = rVar;
    }

    public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
        C0031g c0031g = new C0031g(new T4.c(contentInfo));
        C0031g a7 = ((P.r) this.f1443a).a(view, c0031g);
        if (a7 == null) {
            return null;
        }
        if (a7 == c0031g) {
            return contentInfo;
        }
        ContentInfo k5 = a7.f1482a.k();
        Objects.requireNonNull(k5);
        return AbstractC0027c.n(k5);
    }
}
