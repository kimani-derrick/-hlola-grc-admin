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
public final class ChangePasswordRequestJsonAdapter extends k {

    /* renamed from: a  reason: collision with root package name */
    public final D f7310a;

    /* renamed from: b  reason: collision with root package name */
    public final k f7311b;

    public ChangePasswordRequestJsonAdapter(y yVar) {
        g.f(yVar, "moshi");
        this.f7310a = D.G("old_password", "new_password");
        this.f7311b = yVar.c(String.class, v.f137q, "oldPassword");
    }

    @Override // n5.k
    public final Object b(n nVar) {
        g.f(nVar, "reader");
        nVar.b();
        String str = null;
        String str2 = null;
        while (nVar.n()) {
            int X6 = nVar.X(this.f7310a);
            if (X6 != -1) {
                k kVar = this.f7311b;
                if (X6 != 0) {
                    if (X6 == 1 && (str2 = (String) kVar.b(nVar)) == null) {
                        throw e.j("newPassword", "new_password", nVar);
                    }
                } else {
                    str = (String) kVar.b(nVar);
                    if (str == null) {
                        throw e.j("oldPassword", "old_password", nVar);
                    }
                }
            } else {
                nVar.Y();
                nVar.Z();
            }
        }
        nVar.h();
        if (str != null) {
            if (str2 != null) {
                return new ChangePasswordRequest(str, str2);
            }
            throw e.e("newPassword", "new_password", nVar);
        }
        throw e.e("oldPassword", "old_password", nVar);
    }

    @Override // n5.k
    public final void f(q qVar, Object obj) {
        ChangePasswordRequest changePasswordRequest = (ChangePasswordRequest) obj;
        g.f(qVar, "writer");
        if (changePasswordRequest != null) {
            qVar.b();
            qVar.j("old_password");
            k kVar = this.f7311b;
            kVar.f(qVar, changePasswordRequest.f7308a);
            qVar.j("new_password");
            kVar.f(qVar, changePasswordRequest.f7309b);
            qVar.f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return AbstractC0515y1.j(43, "GeneratedJsonAdapter(ChangePasswordRequest)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
