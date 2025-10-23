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
public final class SyncRequestJsonAdapter extends k {

    /* renamed from: a  reason: collision with root package name */
    public final D f7357a;

    /* renamed from: b  reason: collision with root package name */
    public final k f7358b;

    /* renamed from: c  reason: collision with root package name */
    public final k f7359c;

    public SyncRequestJsonAdapter(y yVar) {
        g.f(yVar, "moshi");
        this.f7357a = D.G("is_logged", "device_unique_id", "fcm_token", "platform");
        Class cls = Integer.TYPE;
        v vVar = v.f137q;
        this.f7358b = yVar.c(cls, vVar, "isLogged");
        this.f7359c = yVar.c(String.class, vVar, "deviceUniqueId");
    }

    @Override // n5.k
    public final Object b(n nVar) {
        g.f(nVar, "reader");
        nVar.b();
        Integer num = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (nVar.n()) {
            int X6 = nVar.X(this.f7357a);
            if (X6 != -1) {
                if (X6 != 0) {
                    k kVar = this.f7359c;
                    if (X6 != 1) {
                        if (X6 != 2) {
                            if (X6 == 3 && (str3 = (String) kVar.b(nVar)) == null) {
                                throw e.j("platform", "platform", nVar);
                            }
                        } else {
                            str2 = (String) kVar.b(nVar);
                            if (str2 == null) {
                                throw e.j("fcmToken", "fcm_token", nVar);
                            }
                        }
                    } else {
                        str = (String) kVar.b(nVar);
                        if (str == null) {
                            throw e.j("deviceUniqueId", "device_unique_id", nVar);
                        }
                    }
                } else {
                    num = (Integer) this.f7358b.b(nVar);
                    if (num == null) {
                        throw e.j("isLogged", "is_logged", nVar);
                    }
                }
            } else {
                nVar.Y();
                nVar.Z();
            }
        }
        nVar.h();
        if (num != null) {
            int intValue = num.intValue();
            if (str != null) {
                if (str2 != null) {
                    if (str3 != null) {
                        return new SyncRequest(intValue, str, str2, str3);
                    }
                    throw e.e("platform", "platform", nVar);
                }
                throw e.e("fcmToken", "fcm_token", nVar);
            }
            throw e.e("deviceUniqueId", "device_unique_id", nVar);
        }
        throw e.e("isLogged", "is_logged", nVar);
    }

    @Override // n5.k
    public final void f(q qVar, Object obj) {
        SyncRequest syncRequest = (SyncRequest) obj;
        g.f(qVar, "writer");
        if (syncRequest != null) {
            qVar.b();
            qVar.j("is_logged");
            this.f7358b.f(qVar, Integer.valueOf(syncRequest.f7354a));
            qVar.j("device_unique_id");
            k kVar = this.f7359c;
            kVar.f(qVar, syncRequest.f7355b);
            qVar.j("fcm_token");
            kVar.f(qVar, syncRequest.f7356c);
            qVar.j("platform");
            kVar.f(qVar, syncRequest.d);
            qVar.f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return AbstractC0515y1.j(33, "GeneratedJsonAdapter(SyncRequest)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
