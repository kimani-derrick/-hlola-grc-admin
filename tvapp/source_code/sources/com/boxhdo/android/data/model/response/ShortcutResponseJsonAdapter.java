package com.boxhdo.android.data.model.response;

import A5.v;
import M5.g;
import androidx.fragment.app.D;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.util.List;
import n5.AbstractC1043D;
import n5.k;
import n5.n;
import n5.q;
import n5.y;
/* loaded from: classes.dex */
public final class ShortcutResponseJsonAdapter extends k {

    /* renamed from: a  reason: collision with root package name */
    public final D f7650a;

    /* renamed from: b  reason: collision with root package name */
    public final k f7651b;

    /* renamed from: c  reason: collision with root package name */
    public final k f7652c;

    public ShortcutResponseJsonAdapter(y yVar) {
        g.f(yVar, "moshi");
        this.f7650a = D.G("id", "title", "filter");
        v vVar = v.f137q;
        this.f7651b = yVar.c(String.class, vVar, "id");
        this.f7652c = yVar.c(AbstractC1043D.f(FilterResponse.class), vVar, "filter");
    }

    @Override // n5.k
    public final Object b(n nVar) {
        g.f(nVar, "reader");
        nVar.b();
        String str = null;
        String str2 = null;
        List list = null;
        while (nVar.n()) {
            int X6 = nVar.X(this.f7650a);
            if (X6 != -1) {
                k kVar = this.f7651b;
                if (X6 != 0) {
                    if (X6 != 1) {
                        if (X6 == 2) {
                            list = (List) this.f7652c.b(nVar);
                        }
                    } else {
                        str2 = (String) kVar.b(nVar);
                    }
                } else {
                    str = (String) kVar.b(nVar);
                }
            } else {
                nVar.Y();
                nVar.Z();
            }
        }
        nVar.h();
        return new ShortcutResponse(str, str2, list);
    }

    @Override // n5.k
    public final void f(q qVar, Object obj) {
        ShortcutResponse shortcutResponse = (ShortcutResponse) obj;
        g.f(qVar, "writer");
        if (shortcutResponse != null) {
            qVar.b();
            qVar.j("id");
            k kVar = this.f7651b;
            kVar.f(qVar, shortcutResponse.f7647a);
            qVar.j("title");
            kVar.f(qVar, shortcutResponse.f7648b);
            qVar.j("filter");
            this.f7652c.f(qVar, shortcutResponse.f7649c);
            qVar.f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return AbstractC0515y1.j(38, "GeneratedJsonAdapter(ShortcutResponse)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
