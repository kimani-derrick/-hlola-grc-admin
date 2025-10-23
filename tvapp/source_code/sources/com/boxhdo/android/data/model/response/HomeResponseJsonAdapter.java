package com.boxhdo.android.data.model.response;

import A5.v;
import M5.g;
import X.i;
import androidx.fragment.app.D;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.util.List;
import n5.AbstractC1043D;
import n5.k;
import n5.n;
import n5.q;
import n5.y;
/* loaded from: classes.dex */
public final class HomeResponseJsonAdapter extends k {

    /* renamed from: a  reason: collision with root package name */
    public final D f7533a;

    /* renamed from: b  reason: collision with root package name */
    public final k f7534b;

    /* renamed from: c  reason: collision with root package name */
    public final k f7535c;
    public final k d;

    /* renamed from: e  reason: collision with root package name */
    public final k f7536e;
    public final k f;

    /* renamed from: g  reason: collision with root package name */
    public final k f7537g;

    /* renamed from: h  reason: collision with root package name */
    public final k f7538h;

    /* renamed from: i  reason: collision with root package name */
    public final k f7539i;

    public HomeResponseJsonAdapter(y yVar) {
        g.f(yVar, "moshi");
        this.f7533a = D.G("id", "type", "title", "shortcut", "slide", "filter", "data", "tabs", "continue-watch", "list");
        v vVar = v.f137q;
        this.f7534b = yVar.c(String.class, vVar, "id");
        this.f7535c = yVar.c(Integer.class, vVar, "type");
        this.d = yVar.c(AbstractC1043D.f(ShortcutResponse.class), vVar, "shortcut");
        this.f7536e = yVar.c(AbstractC1043D.f(MovieResponse.class), vVar, "slide");
        this.f = yVar.c(AbstractC1043D.f(FilterResponse.class), vVar, "filter");
        this.f7537g = yVar.c(AbstractC1043D.f(TabResponse.class), vVar, "tabs");
        this.f7538h = yVar.c(AbstractC1043D.f(ContinueWatchResponse.class), vVar, "continueWatch");
        this.f7539i = yVar.c(AbstractC1043D.f(NetworkResponse.class), vVar, "networks");
    }

    @Override // n5.k
    public final Object b(n nVar) {
        g.f(nVar, "reader");
        nVar.b();
        String str = null;
        Integer num = null;
        String str2 = null;
        List list = null;
        List list2 = null;
        List list3 = null;
        List list4 = null;
        List list5 = null;
        List list6 = null;
        List list7 = null;
        while (nVar.n()) {
            int X6 = nVar.X(this.f7533a);
            k kVar = this.f7534b;
            k kVar2 = this.f7536e;
            switch (X6) {
                case -1:
                    nVar.Y();
                    nVar.Z();
                    break;
                case 0:
                    str = (String) kVar.b(nVar);
                    break;
                case 1:
                    num = (Integer) this.f7535c.b(nVar);
                    break;
                case 2:
                    str2 = (String) kVar.b(nVar);
                    break;
                case 3:
                    list = (List) this.d.b(nVar);
                    break;
                case 4:
                    list2 = (List) kVar2.b(nVar);
                    break;
                case 5:
                    list3 = (List) this.f.b(nVar);
                    break;
                case i.STRING_SET_FIELD_NUMBER /* 6 */:
                    list4 = (List) kVar2.b(nVar);
                    break;
                case i.DOUBLE_FIELD_NUMBER /* 7 */:
                    list5 = (List) this.f7537g.b(nVar);
                    break;
                case 8:
                    list6 = (List) this.f7538h.b(nVar);
                    break;
                case 9:
                    list7 = (List) this.f7539i.b(nVar);
                    break;
            }
        }
        nVar.h();
        return new HomeResponse(str, num, str2, list, list2, list3, list4, list5, list6, list7);
    }

    @Override // n5.k
    public final void f(q qVar, Object obj) {
        HomeResponse homeResponse = (HomeResponse) obj;
        g.f(qVar, "writer");
        if (homeResponse != null) {
            qVar.b();
            qVar.j("id");
            k kVar = this.f7534b;
            kVar.f(qVar, homeResponse.f7525a);
            qVar.j("type");
            this.f7535c.f(qVar, homeResponse.f7526b);
            qVar.j("title");
            kVar.f(qVar, homeResponse.f7527c);
            qVar.j("shortcut");
            this.d.f(qVar, homeResponse.d);
            qVar.j("slide");
            k kVar2 = this.f7536e;
            kVar2.f(qVar, homeResponse.f7528e);
            qVar.j("filter");
            this.f.f(qVar, homeResponse.f);
            qVar.j("data");
            kVar2.f(qVar, homeResponse.f7529g);
            qVar.j("tabs");
            this.f7537g.f(qVar, homeResponse.f7530h);
            qVar.j("continue-watch");
            this.f7538h.f(qVar, homeResponse.f7531i);
            qVar.j("list");
            this.f7539i.f(qVar, homeResponse.f7532j);
            qVar.f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return AbstractC0515y1.j(34, "GeneratedJsonAdapter(HomeResponse)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
