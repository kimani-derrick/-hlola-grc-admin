package com.boxhdo.android.data.model.request;

import A5.v;
import M5.g;
import androidx.fragment.app.D;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.lang.reflect.Constructor;
import n5.k;
import n5.n;
import n5.q;
import n5.y;
import o5.e;
/* loaded from: classes.dex */
public final class LoginWithGoogleRequestJsonAdapter extends k {

    /* renamed from: a  reason: collision with root package name */
    public final D f7326a;

    /* renamed from: b  reason: collision with root package name */
    public final k f7327b;

    /* renamed from: c  reason: collision with root package name */
    public volatile Constructor f7328c;

    public LoginWithGoogleRequestJsonAdapter(y yVar) {
        g.f(yVar, "moshi");
        this.f7326a = D.G("token", "provider");
        this.f7327b = yVar.c(String.class, v.f137q, "idToken");
    }

    @Override // n5.k
    public final Object b(n nVar) {
        g.f(nVar, "reader");
        nVar.b();
        String str = null;
        String str2 = null;
        int i7 = -1;
        while (nVar.n()) {
            int X6 = nVar.X(this.f7326a);
            if (X6 != -1) {
                if (X6 != 0) {
                    if (X6 == 1) {
                        str2 = (String) this.f7327b.b(nVar);
                        if (str2 != null) {
                            i7 = -3;
                        } else {
                            throw e.j("provider", "provider", nVar);
                        }
                    } else {
                        continue;
                    }
                } else {
                    str = (String) this.f7327b.b(nVar);
                    if (str == null) {
                        throw e.j("idToken", "token", nVar);
                    }
                }
            } else {
                nVar.Y();
                nVar.Z();
            }
        }
        nVar.h();
        if (i7 == -3) {
            if (str != null) {
                g.d(str2, "null cannot be cast to non-null type kotlin.String");
                return new LoginWithGoogleRequest(str, str2);
            }
            throw e.e("idToken", "token", nVar);
        }
        Constructor constructor = this.f7328c;
        if (constructor == null) {
            constructor = LoginWithGoogleRequest.class.getDeclaredConstructor(String.class, String.class, Integer.TYPE, e.f12959c);
            this.f7328c = constructor;
            g.e(constructor, "LoginWithGoogleRequest::…his.constructorRef = it }");
        }
        if (str != null) {
            Object newInstance = constructor.newInstance(str, str2, Integer.valueOf(i7), null);
            g.e(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
            return (LoginWithGoogleRequest) newInstance;
        }
        throw e.e("idToken", "token", nVar);
    }

    @Override // n5.k
    public final void f(q qVar, Object obj) {
        LoginWithGoogleRequest loginWithGoogleRequest = (LoginWithGoogleRequest) obj;
        g.f(qVar, "writer");
        if (loginWithGoogleRequest != null) {
            qVar.b();
            qVar.j("token");
            k kVar = this.f7327b;
            kVar.f(qVar, loginWithGoogleRequest.f7324a);
            qVar.j("provider");
            kVar.f(qVar, loginWithGoogleRequest.f7325b);
            qVar.f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return AbstractC0515y1.j(44, "GeneratedJsonAdapter(LoginWithGoogleRequest)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
