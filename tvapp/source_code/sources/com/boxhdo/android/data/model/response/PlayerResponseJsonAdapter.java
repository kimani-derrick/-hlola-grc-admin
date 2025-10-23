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
public final class PlayerResponseJsonAdapter extends k {

    /* renamed from: a  reason: collision with root package name */
    public final D f7630a;

    /* renamed from: b  reason: collision with root package name */
    public final k f7631b;

    /* renamed from: c  reason: collision with root package name */
    public final k f7632c;
    public final k d;

    public PlayerResponseJsonAdapter(y yVar) {
        g.f(yVar, "moshi");
        this.f7630a = D.G("id", "name", "logo_path", "is_free", "is_recommended", "star", "link_download", "deeplink");
        Class cls = Long.TYPE;
        v vVar = v.f137q;
        this.f7631b = yVar.c(cls, vVar, "id");
        this.f7632c = yVar.c(String.class, vVar, "name");
        this.d = yVar.c(Integer.class, vVar, "isFree");
    }

    @Override // n5.k
    public final Object b(n nVar) {
        g.f(nVar, "reader");
        nVar.b();
        Long l7 = null;
        String str = null;
        String str2 = null;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        String str3 = null;
        String str4 = null;
        while (nVar.n()) {
            int X6 = nVar.X(this.f7630a);
            k kVar = this.d;
            k kVar2 = this.f7632c;
            switch (X6) {
                case -1:
                    nVar.Y();
                    nVar.Z();
                    break;
                case 0:
                    l7 = (Long) this.f7631b.b(nVar);
                    if (l7 != null) {
                        break;
                    } else {
                        throw e.j("id", "id", nVar);
                    }
                case 1:
                    str = (String) kVar2.b(nVar);
                    break;
                case 2:
                    str2 = (String) kVar2.b(nVar);
                    break;
                case 3:
                    num = (Integer) kVar.b(nVar);
                    break;
                case 4:
                    num2 = (Integer) kVar.b(nVar);
                    break;
                case 5:
                    num3 = (Integer) kVar.b(nVar);
                    break;
                case i.STRING_SET_FIELD_NUMBER /* 6 */:
                    str3 = (String) kVar2.b(nVar);
                    break;
                case i.DOUBLE_FIELD_NUMBER /* 7 */:
                    str4 = (String) kVar2.b(nVar);
                    break;
            }
        }
        nVar.h();
        if (l7 != null) {
            return new PlayerResponse(l7.longValue(), str, str2, num, num2, num3, str3, str4);
        }
        throw e.e("id", "id", nVar);
    }

    @Override // n5.k
    public final void f(q qVar, Object obj) {
        PlayerResponse playerResponse = (PlayerResponse) obj;
        g.f(qVar, "writer");
        if (playerResponse != null) {
            qVar.b();
            qVar.j("id");
            this.f7631b.f(qVar, Long.valueOf(playerResponse.f7624a));
            qVar.j("name");
            k kVar = this.f7632c;
            kVar.f(qVar, playerResponse.f7625b);
            qVar.j("logo_path");
            kVar.f(qVar, playerResponse.f7626c);
            qVar.j("is_free");
            k kVar2 = this.d;
            kVar2.f(qVar, playerResponse.d);
            qVar.j("is_recommended");
            kVar2.f(qVar, playerResponse.f7627e);
            qVar.j("star");
            kVar2.f(qVar, playerResponse.f);
            qVar.j("link_download");
            kVar.f(qVar, playerResponse.f7628g);
            qVar.j("deeplink");
            kVar.f(qVar, playerResponse.f7629h);
            qVar.f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return AbstractC0515y1.j(36, "GeneratedJsonAdapter(PlayerResponse)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
