package com.boxhdo.android.data.model.response;

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
public final class AvatarResponseJsonAdapter extends k {

    /* renamed from: a  reason: collision with root package name */
    public final D f7412a;

    /* renamed from: b  reason: collision with root package name */
    public final k f7413b;

    /* renamed from: c  reason: collision with root package name */
    public final k f7414c;

    public AvatarResponseJsonAdapter(y yVar) {
        g.f(yVar, "moshi");
        this.f7412a = D.G("id", "url", "path");
        Class cls = Long.TYPE;
        v vVar = v.f137q;
        this.f7413b = yVar.c(cls, vVar, "id");
        this.f7414c = yVar.c(String.class, vVar, "url");
    }

    @Override // n5.k
    public final Object b(n nVar) {
        g.f(nVar, "reader");
        nVar.b();
        Long l7 = null;
        String str = null;
        String str2 = null;
        while (nVar.n()) {
            int X6 = nVar.X(this.f7412a);
            if (X6 != -1) {
                if (X6 != 0) {
                    k kVar = this.f7414c;
                    if (X6 != 1) {
                        if (X6 == 2) {
                            str2 = (String) kVar.b(nVar);
                        }
                    } else {
                        str = (String) kVar.b(nVar);
                    }
                } else {
                    l7 = (Long) this.f7413b.b(nVar);
                    if (l7 == null) {
                        throw e.j("id", "id", nVar);
                    }
                }
            } else {
                nVar.Y();
                nVar.Z();
            }
        }
        nVar.h();
        if (l7 != null) {
            return new AvatarResponse(l7.longValue(), str, str2);
        }
        throw e.e("id", "id", nVar);
    }

    @Override // n5.k
    public final void f(q qVar, Object obj) {
        AvatarResponse avatarResponse = (AvatarResponse) obj;
        g.f(qVar, "writer");
        if (avatarResponse != null) {
            qVar.b();
            qVar.j("id");
            this.f7413b.f(qVar, Long.valueOf(avatarResponse.f7409a));
            qVar.j("url");
            k kVar = this.f7414c;
            kVar.f(qVar, avatarResponse.f7410b);
            qVar.j("path");
            kVar.f(qVar, avatarResponse.f7411c);
            qVar.f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return AbstractC0515y1.j(36, "GeneratedJsonAdapter(AvatarResponse)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
