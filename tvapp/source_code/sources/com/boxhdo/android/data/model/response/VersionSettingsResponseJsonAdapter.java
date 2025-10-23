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
public final class VersionSettingsResponseJsonAdapter extends k {

    /* renamed from: a  reason: collision with root package name */
    public final D f7707a;

    /* renamed from: b  reason: collision with root package name */
    public final k f7708b;

    /* renamed from: c  reason: collision with root package name */
    public final k f7709c;

    public VersionSettingsResponseJsonAdapter(y yVar) {
        g.f(yVar, "moshi");
        this.f7707a = D.G("latest_version", "contact_info");
        v vVar = v.f137q;
        this.f7708b = yVar.c(LatestVersionResponse.class, vVar, "version");
        this.f7709c = yVar.c(ContactInfoResponse.class, vVar, "contactInfo");
    }

    @Override // n5.k
    public final Object b(n nVar) {
        g.f(nVar, "reader");
        nVar.b();
        LatestVersionResponse latestVersionResponse = null;
        ContactInfoResponse contactInfoResponse = null;
        while (nVar.n()) {
            int X6 = nVar.X(this.f7707a);
            if (X6 != -1) {
                if (X6 != 0) {
                    if (X6 == 1) {
                        contactInfoResponse = (ContactInfoResponse) this.f7709c.b(nVar);
                    }
                } else {
                    latestVersionResponse = (LatestVersionResponse) this.f7708b.b(nVar);
                }
            } else {
                nVar.Y();
                nVar.Z();
            }
        }
        nVar.h();
        return new VersionSettingsResponse(latestVersionResponse, contactInfoResponse);
    }

    @Override // n5.k
    public final void f(q qVar, Object obj) {
        VersionSettingsResponse versionSettingsResponse = (VersionSettingsResponse) obj;
        g.f(qVar, "writer");
        if (versionSettingsResponse != null) {
            qVar.b();
            qVar.j("latest_version");
            this.f7708b.f(qVar, versionSettingsResponse.f7705a);
            qVar.j("contact_info");
            this.f7709c.f(qVar, versionSettingsResponse.f7706b);
            qVar.f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return AbstractC0515y1.j(45, "GeneratedJsonAdapter(VersionSettingsResponse)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
