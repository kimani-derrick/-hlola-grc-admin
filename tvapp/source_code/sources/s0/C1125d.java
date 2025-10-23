package s0;

import M5.g;
import W5.AbstractC0117y;
import W5.G;
import android.net.Uri;
import android.view.InputEvent;
import t0.AbstractC1220a;
import t0.AbstractC1223d;
import t0.AbstractC1224e;
import t0.C1222c;
/* renamed from: s0.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1125d {

    /* renamed from: a  reason: collision with root package name */
    public final C1222c f13541a;

    public C1125d(C1222c c1222c) {
        this.f13541a = c1222c;
    }

    public R3.b a(AbstractC1220a abstractC1220a) {
        g.f(abstractC1220a, "deletionRequest");
        throw null;
    }

    public R3.b b() {
        return h4.b.e(AbstractC0117y.c(AbstractC0117y.a(G.f3945a), new C1122a(this, null)));
    }

    public R3.b c(Uri uri, InputEvent inputEvent) {
        g.f(uri, "attributionSource");
        return h4.b.e(AbstractC0117y.c(AbstractC0117y.a(G.f3945a), new C1123b(this, uri, inputEvent, null)));
    }

    public R3.b d(Uri uri) {
        g.f(uri, "trigger");
        return h4.b.e(AbstractC0117y.c(AbstractC0117y.a(G.f3945a), new C1124c(this, uri, null)));
    }

    public R3.b e(AbstractC1223d abstractC1223d) {
        g.f(abstractC1223d, "request");
        throw null;
    }

    public R3.b f(AbstractC1224e abstractC1224e) {
        g.f(abstractC1224e, "request");
        throw null;
    }
}
