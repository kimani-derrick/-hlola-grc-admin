package com.boxhdo.android.data.model.response.trakt;

import A5.v;
import M5.g;
import androidx.fragment.app.D;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import n5.k;
import n5.n;
import n5.q;
import n5.y;
/* loaded from: classes.dex */
public final class TraktDeviceCodeResponseJsonAdapter extends k {

    /* renamed from: a  reason: collision with root package name */
    public final D f7719a;

    /* renamed from: b  reason: collision with root package name */
    public final k f7720b;

    /* renamed from: c  reason: collision with root package name */
    public final k f7721c;
    public final k d;

    public TraktDeviceCodeResponseJsonAdapter(y yVar) {
        g.f(yVar, "moshi");
        this.f7719a = D.G("device_code", "user_code", "verification_url", "expire_in", "scope");
        v vVar = v.f137q;
        this.f7720b = yVar.c(String.class, vVar, "deviceCode");
        this.f7721c = yVar.c(Long.class, vVar, "expireIn");
        this.d = yVar.c(Integer.class, vVar, "interval");
    }

    @Override // n5.k
    public final Object b(n nVar) {
        g.f(nVar, "reader");
        nVar.b();
        String str = null;
        String str2 = null;
        String str3 = null;
        Long l7 = null;
        Integer num = null;
        while (nVar.n()) {
            int X6 = nVar.X(this.f7719a);
            if (X6 != -1) {
                k kVar = this.f7720b;
                if (X6 != 0) {
                    if (X6 != 1) {
                        if (X6 != 2) {
                            if (X6 != 3) {
                                if (X6 == 4) {
                                    num = (Integer) this.d.b(nVar);
                                }
                            } else {
                                l7 = (Long) this.f7721c.b(nVar);
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
        return new TraktDeviceCodeResponse(str, str2, str3, l7, num);
    }

    @Override // n5.k
    public final void f(q qVar, Object obj) {
        TraktDeviceCodeResponse traktDeviceCodeResponse = (TraktDeviceCodeResponse) obj;
        g.f(qVar, "writer");
        if (traktDeviceCodeResponse != null) {
            qVar.b();
            qVar.j("device_code");
            k kVar = this.f7720b;
            kVar.f(qVar, traktDeviceCodeResponse.f7715a);
            qVar.j("user_code");
            kVar.f(qVar, traktDeviceCodeResponse.f7716b);
            qVar.j("verification_url");
            kVar.f(qVar, traktDeviceCodeResponse.f7717c);
            qVar.j("expire_in");
            this.f7721c.f(qVar, traktDeviceCodeResponse.d);
            qVar.j("scope");
            this.d.f(qVar, traktDeviceCodeResponse.f7718e);
            qVar.f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return AbstractC0515y1.j(45, "GeneratedJsonAdapter(TraktDeviceCodeResponse)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
