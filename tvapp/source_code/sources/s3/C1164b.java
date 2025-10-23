package s3;

import android.os.Bundle;
import java.util.Iterator;
import o.C1049b;
import o.C1052e;
/* renamed from: s3.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1164b extends AbstractC1205w {

    /* renamed from: r  reason: collision with root package name */
    public final C1052e f13962r;

    /* renamed from: s  reason: collision with root package name */
    public final C1052e f13963s;

    /* renamed from: t  reason: collision with root package name */
    public long f13964t;

    /* JADX WARN: Type inference failed for: r2v1, types: [o.e, o.j] */
    /* JADX WARN: Type inference failed for: r2v2, types: [o.e, o.j] */
    public C1164b(C1175g0 c1175g0) {
        super(c1175g0);
        this.f13963s = new o.j(0);
        this.f13962r = new o.j(0);
    }

    public final void H(long j7) {
        O0 L6 = F().L(false);
        C1052e c1052e = this.f13962r;
        Iterator it = ((C1049b) c1052e.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            K(str, j7 - ((Long) c1052e.get(str)).longValue(), L6);
        }
        if (!c1052e.isEmpty()) {
            J(j7 - this.f13964t, L6);
        }
        L(j7);
    }

    public final void I(long j7, String str) {
        if (str != null && str.length() != 0) {
            d().M(new RunnableC1194q(this, str, j7, 1));
        } else {
            b().f13807v.d("Ad unit id must be a non-empty string");
        }
    }

    public final void J(long j7, O0 o02) {
        if (o02 == null) {
            b().f13803D.d("Not logging ad exposure. No active activity");
        } else if (j7 < 1000) {
            C1154I b7 = b();
            b7.f13803D.c(Long.valueOf(j7), "Not logging ad exposure. Less than 1000 ms. exposure");
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j7);
            x1.g0(o02, bundle, true);
            E().i0("am", "_xa", bundle);
        }
    }

    public final void K(String str, long j7, O0 o02) {
        if (o02 == null) {
            b().f13803D.d("Not logging ad unit exposure. No active activity");
        } else if (j7 < 1000) {
            C1154I b7 = b();
            b7.f13803D.c(Long.valueOf(j7), "Not logging ad unit exposure. Less than 1000 ms. exposure");
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j7);
            x1.g0(o02, bundle, true);
            E().i0("am", "_xu", bundle);
        }
    }

    public final void L(long j7) {
        C1052e c1052e = this.f13962r;
        Iterator it = ((C1049b) c1052e.keySet()).iterator();
        while (it.hasNext()) {
            c1052e.put((String) it.next(), Long.valueOf(j7));
        }
        if (!c1052e.isEmpty()) {
            this.f13964t = j7;
        }
    }

    public final void M(long j7, String str) {
        if (str != null && str.length() != 0) {
            d().M(new RunnableC1194q(this, str, j7, 0));
        } else {
            b().f13807v.d("Ad unit id must be a non-empty string");
        }
    }
}
