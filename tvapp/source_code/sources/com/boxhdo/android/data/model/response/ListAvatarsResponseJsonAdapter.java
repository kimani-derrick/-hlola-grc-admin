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
public final class ListAvatarsResponseJsonAdapter extends k {

    /* renamed from: a  reason: collision with root package name */
    public final D f7549a;

    /* renamed from: b  reason: collision with root package name */
    public final k f7550b;

    public ListAvatarsResponseJsonAdapter(y yVar) {
        g.f(yVar, "moshi");
        this.f7549a = D.G("avatars");
        this.f7550b = yVar.c(AbstractC1043D.f(AvatarResponse.class), v.f137q, "avatars");
    }

    @Override // n5.k
    public final Object b(n nVar) {
        g.f(nVar, "reader");
        nVar.b();
        List list = null;
        while (nVar.n()) {
            int X6 = nVar.X(this.f7549a);
            if (X6 != -1) {
                if (X6 == 0) {
                    list = (List) this.f7550b.b(nVar);
                }
            } else {
                nVar.Y();
                nVar.Z();
            }
        }
        nVar.h();
        return new ListAvatarsResponse(list);
    }

    @Override // n5.k
    public final void f(q qVar, Object obj) {
        ListAvatarsResponse listAvatarsResponse = (ListAvatarsResponse) obj;
        g.f(qVar, "writer");
        if (listAvatarsResponse != null) {
            qVar.b();
            qVar.j("avatars");
            this.f7550b.f(qVar, listAvatarsResponse.f7548a);
            qVar.f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return AbstractC0515y1.j(41, "GeneratedJsonAdapter(ListAvatarsResponse)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
