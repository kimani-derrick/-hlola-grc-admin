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
public final class SubResponseJsonAdapter extends k {

    /* renamed from: a  reason: collision with root package name */
    public final D f7670a;

    /* renamed from: b  reason: collision with root package name */
    public final k f7671b;

    /* renamed from: c  reason: collision with root package name */
    public final k f7672c;
    public final k d;

    /* renamed from: e  reason: collision with root package name */
    public final k f7673e;

    public SubResponseJsonAdapter(y yVar) {
        g.f(yVar, "moshi");
        this.f7670a = D.G("episode_id", "file_name", "id", "is_deleted", "is_sync", "lang", "lang_code", "link");
        v vVar = v.f137q;
        this.f7671b = yVar.c(Long.class, vVar, "episodeId");
        this.f7672c = yVar.c(String.class, vVar, "fileName");
        this.d = yVar.c(Long.TYPE, vVar, "id");
        this.f7673e = yVar.c(Integer.class, vVar, "isDeleted");
    }

    @Override // n5.k
    public final Object b(n nVar) {
        g.f(nVar, "reader");
        nVar.b();
        Long l7 = null;
        Long l8 = null;
        String str = null;
        Integer num = null;
        Integer num2 = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (nVar.n()) {
            int X6 = nVar.X(this.f7670a);
            k kVar = this.f7673e;
            k kVar2 = this.f7672c;
            switch (X6) {
                case -1:
                    nVar.Y();
                    nVar.Z();
                    break;
                case 0:
                    l8 = (Long) this.f7671b.b(nVar);
                    break;
                case 1:
                    str = (String) kVar2.b(nVar);
                    break;
                case 2:
                    l7 = (Long) this.d.b(nVar);
                    if (l7 != null) {
                        break;
                    } else {
                        throw e.j("id", "id", nVar);
                    }
                case 3:
                    num = (Integer) kVar.b(nVar);
                    break;
                case 4:
                    num2 = (Integer) kVar.b(nVar);
                    break;
                case 5:
                    str2 = (String) kVar2.b(nVar);
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
            return new SubResponse(l8, str, l7.longValue(), num, num2, str2, str3, str4);
        }
        throw e.e("id", "id", nVar);
    }

    @Override // n5.k
    public final void f(q qVar, Object obj) {
        SubResponse subResponse = (SubResponse) obj;
        g.f(qVar, "writer");
        if (subResponse != null) {
            qVar.b();
            qVar.j("episode_id");
            this.f7671b.f(qVar, subResponse.f7664a);
            qVar.j("file_name");
            k kVar = this.f7672c;
            kVar.f(qVar, subResponse.f7665b);
            qVar.j("id");
            this.d.f(qVar, Long.valueOf(subResponse.f7666c));
            qVar.j("is_deleted");
            k kVar2 = this.f7673e;
            kVar2.f(qVar, subResponse.d);
            qVar.j("is_sync");
            kVar2.f(qVar, subResponse.f7667e);
            qVar.j("lang");
            kVar.f(qVar, subResponse.f);
            qVar.j("lang_code");
            kVar.f(qVar, subResponse.f7668g);
            qVar.j("link");
            kVar.f(qVar, subResponse.f7669h);
            qVar.f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return AbstractC0515y1.j(33, "GeneratedJsonAdapter(SubResponse)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
