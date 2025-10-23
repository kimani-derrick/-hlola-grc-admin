package t0;

import M5.g;
import W5.C0100g;
import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import l.ExecutorC0961a;
import w4.l0;
import z5.C1530l;
/* renamed from: t0.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1222c {

    /* renamed from: a  reason: collision with root package name */
    public final MeasurementManager f14517a;

    public C1222c(Context context) {
        Object systemService = context.getSystemService(AbstractC1221b.b());
        g.e(systemService, "context.getSystemService…:class.java\n            )");
        this.f14517a = AbstractC1221b.a(systemService);
    }

    public Object a(AbstractC1220a abstractC1220a, D5.d<? super C1530l> dVar) {
        new C0100g(1, l0.x(dVar)).w();
        AbstractC1221b.c();
        throw null;
    }

    public Object b(D5.d<? super Integer> dVar) {
        C0100g c0100g = new C0100g(1, l0.x(dVar));
        c0100g.w();
        this.f14517a.getMeasurementApiStatus(new ExecutorC0961a(1), new G.d(c0100g));
        return c0100g.v();
    }

    public Object c(Uri uri, InputEvent inputEvent, D5.d<? super C1530l> dVar) {
        C0100g c0100g = new C0100g(1, l0.x(dVar));
        c0100g.w();
        this.f14517a.registerSource(uri, inputEvent, new ExecutorC0961a(1), new G.d(c0100g));
        Object v5 = c0100g.v();
        if (v5 == E5.a.f612q) {
            return v5;
        }
        return C1530l.f16479a;
    }

    public Object d(Uri uri, D5.d<? super C1530l> dVar) {
        C0100g c0100g = new C0100g(1, l0.x(dVar));
        c0100g.w();
        this.f14517a.registerTrigger(uri, new ExecutorC0961a(1), new G.d(c0100g));
        Object v5 = c0100g.v();
        if (v5 == E5.a.f612q) {
            return v5;
        }
        return C1530l.f16479a;
    }

    public Object e(AbstractC1223d abstractC1223d, D5.d<? super C1530l> dVar) {
        new C0100g(1, l0.x(dVar)).w();
        AbstractC1221b.g();
        throw null;
    }

    public Object f(AbstractC1224e abstractC1224e, D5.d<? super C1530l> dVar) {
        new C0100g(1, l0.x(dVar)).w();
        AbstractC1221b.h();
        throw null;
    }
}
