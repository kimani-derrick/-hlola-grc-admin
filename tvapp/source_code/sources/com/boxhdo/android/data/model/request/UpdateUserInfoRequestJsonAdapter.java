package com.boxhdo.android.data.model.request;

import A5.v;
import M5.g;
import androidx.fragment.app.D;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import n5.k;
import n5.n;
import n5.q;
import n5.y;
import o5.e;
/* loaded from: classes.dex */
public final class UpdateUserInfoRequestJsonAdapter extends k {

    /* renamed from: a  reason: collision with root package name */
    public final D f7362a;

    /* renamed from: b  reason: collision with root package name */
    public final k f7363b;

    /* renamed from: c  reason: collision with root package name */
    public final k f7364c;

    public UpdateUserInfoRequestJsonAdapter(y yVar) {
        g.f(yVar, "moshi");
        this.f7362a = D.G("avatar_id", "name");
        v vVar = v.f137q;
        this.f7363b = yVar.c(Long.class, vVar, "avatarId");
        this.f7364c = yVar.c(String.class, vVar, "name");
    }

    @Override // n5.k
    public final Object b(n nVar) {
        g.f(nVar, "reader");
        nVar.b();
        Long l7 = null;
        String str = null;
        while (nVar.n()) {
            int X6 = nVar.X(this.f7362a);
            if (X6 != -1) {
                if (X6 != 0) {
                    if (X6 == 1 && (str = (String) this.f7364c.b(nVar)) == null) {
                        throw e.j("name", "name", nVar);
                    }
                } else {
                    l7 = (Long) this.f7363b.b(nVar);
                }
            } else {
                nVar.Y();
                nVar.Z();
            }
        }
        nVar.h();
        if (str != null) {
            return new UpdateUserInfoRequest(l7, str);
        }
        throw e.e("name", "name", nVar);
    }

    @Override // n5.k
    public final void f(q qVar, Object obj) {
        UpdateUserInfoRequest updateUserInfoRequest = (UpdateUserInfoRequest) obj;
        g.f(qVar, "writer");
        if (updateUserInfoRequest != null) {
            qVar.b();
            qVar.j("avatar_id");
            this.f7363b.f(qVar, updateUserInfoRequest.f7360a);
            qVar.j("name");
            this.f7364c.f(qVar, updateUserInfoRequest.f7361b);
            qVar.f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return AbstractC0515y1.j(43, "GeneratedJsonAdapter(UpdateUserInfoRequest)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
