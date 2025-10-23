package com.boxhdo.android.data.model.response;

import A5.v;
import M5.g;
import X.i;
import androidx.fragment.app.D;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import n5.k;
import n5.n;
import n5.q;
import n5.y;
import o5.e;
/* loaded from: classes.dex */
public final class LatestVersionResponseJsonAdapter extends k {

    /* renamed from: a  reason: collision with root package name */
    public final D f7545a;

    /* renamed from: b  reason: collision with root package name */
    public final k f7546b;

    /* renamed from: c  reason: collision with root package name */
    public final k f7547c;
    public final k d;

    public LatestVersionResponseJsonAdapter(y yVar) {
        g.f(yVar, "moshi");
        this.f7545a = D.G("id", "version", "version_code", "change_log", "link_download", "force_updated", "status");
        Class cls = Long.TYPE;
        v vVar = v.f137q;
        this.f7546b = yVar.c(cls, vVar, "id");
        this.f7547c = yVar.c(String.class, vVar, "version");
        this.d = yVar.c(Integer.class, vVar, "versionCode");
    }

    @Override // n5.k
    public final Object b(n nVar) {
        g.f(nVar, "reader");
        nVar.b();
        Long l7 = null;
        String str = null;
        Integer num = null;
        String str2 = null;
        String str3 = null;
        Integer num2 = null;
        Integer num3 = null;
        while (nVar.n()) {
            int X6 = nVar.X(this.f7545a);
            k kVar = this.f7547c;
            k kVar2 = this.d;
            switch (X6) {
                case -1:
                    nVar.Y();
                    nVar.Z();
                    break;
                case 0:
                    l7 = (Long) this.f7546b.b(nVar);
                    if (l7 != null) {
                        break;
                    } else {
                        throw e.j("id", "id", nVar);
                    }
                case 1:
                    str = (String) kVar.b(nVar);
                    break;
                case 2:
                    num = (Integer) kVar2.b(nVar);
                    break;
                case 3:
                    str2 = (String) kVar.b(nVar);
                    break;
                case 4:
                    str3 = (String) kVar.b(nVar);
                    break;
                case 5:
                    num2 = (Integer) kVar2.b(nVar);
                    break;
                case i.STRING_SET_FIELD_NUMBER /* 6 */:
                    num3 = (Integer) kVar2.b(nVar);
                    break;
            }
        }
        nVar.h();
        if (l7 != null) {
            return new LatestVersionResponse(l7.longValue(), str, num, str2, str3, num2, num3);
        }
        throw e.e("id", "id", nVar);
    }

    @Override // n5.k
    public final void f(q qVar, Object obj) {
        LatestVersionResponse latestVersionResponse = (LatestVersionResponse) obj;
        g.f(qVar, "writer");
        if (latestVersionResponse != null) {
            qVar.b();
            qVar.j("id");
            this.f7546b.f(qVar, Long.valueOf(latestVersionResponse.f7540a));
            qVar.j("version");
            k kVar = this.f7547c;
            kVar.f(qVar, latestVersionResponse.f7541b);
            qVar.j("version_code");
            k kVar2 = this.d;
            kVar2.f(qVar, latestVersionResponse.f7542c);
            qVar.j("change_log");
            kVar.f(qVar, latestVersionResponse.d);
            qVar.j("link_download");
            kVar.f(qVar, latestVersionResponse.f7543e);
            qVar.j("force_updated");
            kVar2.f(qVar, latestVersionResponse.f);
            qVar.j("status");
            kVar2.f(qVar, latestVersionResponse.f7544g);
            qVar.f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return AbstractC0515y1.j(43, "GeneratedJsonAdapter(LatestVersionResponse)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
