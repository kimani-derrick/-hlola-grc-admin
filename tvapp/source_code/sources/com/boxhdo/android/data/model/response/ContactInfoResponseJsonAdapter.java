package com.boxhdo.android.data.model.response;

import A5.v;
import M5.g;
import androidx.fragment.app.D;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import n5.k;
import n5.n;
import n5.q;
import n5.y;
/* loaded from: classes.dex */
public final class ContactInfoResponseJsonAdapter extends k {

    /* renamed from: a  reason: collision with root package name */
    public final D f7436a;

    /* renamed from: b  reason: collision with root package name */
    public final k f7437b;

    public ContactInfoResponseJsonAdapter(y yVar) {
        g.f(yVar, "moshi");
        this.f7436a = D.G("webUrl", "email", "telegramUrl", "discordUrl", "feedbackUrl");
        this.f7437b = yVar.c(String.class, v.f137q, "webUrl");
    }

    @Override // n5.k
    public final Object b(n nVar) {
        g.f(nVar, "reader");
        nVar.b();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        while (nVar.n()) {
            int X6 = nVar.X(this.f7436a);
            if (X6 != -1) {
                k kVar = this.f7437b;
                if (X6 != 0) {
                    if (X6 != 1) {
                        if (X6 != 2) {
                            if (X6 != 3) {
                                if (X6 == 4) {
                                    str5 = (String) kVar.b(nVar);
                                }
                            } else {
                                str4 = (String) kVar.b(nVar);
                            }
                        } else {
                            str3 = (String) kVar.b(nVar);
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
        return new ContactInfoResponse(str, str2, str3, str4, str5);
    }

    @Override // n5.k
    public final void f(q qVar, Object obj) {
        ContactInfoResponse contactInfoResponse = (ContactInfoResponse) obj;
        g.f(qVar, "writer");
        if (contactInfoResponse != null) {
            qVar.b();
            qVar.j("webUrl");
            k kVar = this.f7437b;
            kVar.f(qVar, contactInfoResponse.f7432a);
            qVar.j("email");
            kVar.f(qVar, contactInfoResponse.f7433b);
            qVar.j("telegramUrl");
            kVar.f(qVar, contactInfoResponse.f7434c);
            qVar.j("discordUrl");
            kVar.f(qVar, contactInfoResponse.d);
            qVar.j("feedbackUrl");
            kVar.f(qVar, contactInfoResponse.f7435e);
            qVar.f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return AbstractC0515y1.j(41, "GeneratedJsonAdapter(ContactInfoResponse)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
