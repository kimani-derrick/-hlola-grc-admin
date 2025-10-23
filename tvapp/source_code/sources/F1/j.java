package F1;

import android.os.Build;
import android.text.Html;
import android.text.Spanned;
import android.widget.TextView;
import com.boxhdo.android.tv.ui.update.TVUpdateFragment;
import com.boxhdo.domain.model.LatestVersion;
import j1.AbstractC0787E;
import k3.AbstractC0958a;
import z5.C1530l;
/* loaded from: classes.dex */
public final class j extends F5.i implements L5.p {

    /* renamed from: u  reason: collision with root package name */
    public /* synthetic */ Object f640u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ TVUpdateFragment f641v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(D5.d dVar, TVUpdateFragment tVUpdateFragment) {
        super(2, dVar);
        this.f641v = tVUpdateFragment;
    }

    @Override // F5.a
    public final D5.d h(D5.d dVar, Object obj) {
        j jVar = new j(dVar, this.f641v);
        jVar.f640u = obj;
        return jVar;
    }

    @Override // L5.p
    public final Object j(Object obj, Object obj2) {
        return ((j) h((D5.d) obj2, (LatestVersion) obj)).p(C1530l.f16479a);
    }

    @Override // F5.a
    public final Object p(Object obj) {
        Spanned fromHtml;
        Spanned fromHtml2;
        AbstractC0958a.H(obj);
        LatestVersion latestVersion = (LatestVersion) this.f640u;
        boolean X6 = U5.n.X(latestVersion.f8007q);
        C1530l c1530l = C1530l.f16479a;
        if (X6) {
            return c1530l;
        }
        TVUpdateFragment tVUpdateFragment = this.f641v;
        AbstractC0787E abstractC0787E = (AbstractC0787E) tVUpdateFragment.f0();
        int i7 = Build.VERSION.SDK_INT;
        String str = latestVersion.f8009s;
        if (i7 >= 24) {
            fromHtml = I.c.a(str, 63);
        } else {
            fromHtml = Html.fromHtml(str);
        }
        String obj2 = fromHtml.toString();
        if (i7 >= 24) {
            fromHtml2 = I.c.a(obj2, 63);
        } else {
            fromHtml2 = Html.fromHtml(obj2);
        }
        abstractC0787E.f11555y.setText(fromHtml2);
        if (latestVersion.f8011u) {
            TextView textView = ((AbstractC0787E) tVUpdateFragment.f0()).f11550t;
            M5.g.e(textView, "binding.buttonUpdateLater");
            textView.setVisibility(8);
            TextView textView2 = ((AbstractC0787E) tVUpdateFragment.f0()).f11549s;
            M5.g.e(textView2, "binding.buttonSkipVer");
            textView2.setVisibility(8);
        }
        return c1530l;
    }
}
