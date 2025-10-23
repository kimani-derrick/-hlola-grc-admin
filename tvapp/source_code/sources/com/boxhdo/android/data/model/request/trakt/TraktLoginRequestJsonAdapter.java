package com.boxhdo.android.data.model.request.trakt;

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
public final class TraktLoginRequestJsonAdapter extends k {

    /* renamed from: a  reason: collision with root package name */
    public final D f7384a;

    /* renamed from: b  reason: collision with root package name */
    public final k f7385b;

    public TraktLoginRequestJsonAdapter(y yVar) {
        g.f(yVar, "moshi");
        this.f7384a = D.G("client_id", "client_secret", "code", "grant_type", "redirect_uri");
        this.f7385b = yVar.c(String.class, v.f137q, "clientId");
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
        while (true) {
            String str6 = str5;
            if (nVar.n()) {
                int X6 = nVar.X(this.f7384a);
                String str7 = str4;
                if (X6 != -1) {
                    k kVar = this.f7385b;
                    if (X6 != 0) {
                        if (X6 != 1) {
                            if (X6 != 2) {
                                if (X6 != 3) {
                                    if (X6 == 4) {
                                        str5 = (String) kVar.b(nVar);
                                        if (str5 == null) {
                                            throw e.j("redirectUri", "redirect_uri", nVar);
                                        }
                                        str4 = str7;
                                    }
                                } else {
                                    str4 = (String) kVar.b(nVar);
                                    if (str4 != null) {
                                        str5 = str6;
                                    } else {
                                        throw e.j("grantType", "grant_type", nVar);
                                    }
                                }
                            } else {
                                str3 = (String) kVar.b(nVar);
                                if (str3 == null) {
                                    throw e.j("code", "code", nVar);
                                }
                            }
                        } else {
                            str2 = (String) kVar.b(nVar);
                            if (str2 == null) {
                                throw e.j("clientSecret", "client_secret", nVar);
                            }
                        }
                    } else {
                        str = (String) kVar.b(nVar);
                        if (str == null) {
                            throw e.j("clientId", "client_id", nVar);
                        }
                    }
                } else {
                    nVar.Y();
                    nVar.Z();
                }
                str5 = str6;
                str4 = str7;
            } else {
                String str8 = str4;
                nVar.h();
                if (str != null) {
                    if (str2 != null) {
                        if (str3 != null) {
                            if (str8 != null) {
                                if (str6 != null) {
                                    return new TraktLoginRequest(str, str2, str3, str8, str6);
                                }
                                throw e.e("redirectUri", "redirect_uri", nVar);
                            }
                            throw e.e("grantType", "grant_type", nVar);
                        }
                        throw e.e("code", "code", nVar);
                    }
                    throw e.e("clientSecret", "client_secret", nVar);
                }
                throw e.e("clientId", "client_id", nVar);
            }
        }
    }

    @Override // n5.k
    public final void f(q qVar, Object obj) {
        TraktLoginRequest traktLoginRequest = (TraktLoginRequest) obj;
        g.f(qVar, "writer");
        if (traktLoginRequest != null) {
            qVar.b();
            qVar.j("client_id");
            k kVar = this.f7385b;
            kVar.f(qVar, traktLoginRequest.f7380a);
            qVar.j("client_secret");
            kVar.f(qVar, traktLoginRequest.f7381b);
            qVar.j("code");
            kVar.f(qVar, traktLoginRequest.f7382c);
            qVar.j("grant_type");
            kVar.f(qVar, traktLoginRequest.d);
            qVar.j("redirect_uri");
            kVar.f(qVar, traktLoginRequest.f7383e);
            qVar.f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return AbstractC0515y1.j(39, "GeneratedJsonAdapter(TraktLoginRequest)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
