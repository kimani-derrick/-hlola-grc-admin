package com.boxhdo.android.data.model.response;

import M5.g;
import androidx.databinding.d;
import n5.i;
import n5.l;
@l(generateAdapter = d.f5658o)
/* loaded from: classes.dex */
public final class VersionSettingsResponse {

    /* renamed from: a  reason: collision with root package name */
    public final LatestVersionResponse f7705a;

    /* renamed from: b  reason: collision with root package name */
    public final ContactInfoResponse f7706b;

    public VersionSettingsResponse(@i(name = "latest_version") LatestVersionResponse latestVersionResponse, @i(name = "contact_info") ContactInfoResponse contactInfoResponse) {
        this.f7705a = latestVersionResponse;
        this.f7706b = contactInfoResponse;
    }

    public final VersionSettingsResponse copy(@i(name = "latest_version") LatestVersionResponse latestVersionResponse, @i(name = "contact_info") ContactInfoResponse contactInfoResponse) {
        return new VersionSettingsResponse(latestVersionResponse, contactInfoResponse);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof VersionSettingsResponse) {
            VersionSettingsResponse versionSettingsResponse = (VersionSettingsResponse) obj;
            return g.a(this.f7705a, versionSettingsResponse.f7705a) && g.a(this.f7706b, versionSettingsResponse.f7706b);
        }
        return false;
    }

    public final int hashCode() {
        LatestVersionResponse latestVersionResponse = this.f7705a;
        int hashCode = (latestVersionResponse == null ? 0 : latestVersionResponse.hashCode()) * 31;
        ContactInfoResponse contactInfoResponse = this.f7706b;
        return hashCode + (contactInfoResponse != null ? contactInfoResponse.hashCode() : 0);
    }

    public final String toString() {
        return "VersionSettingsResponse(version=" + this.f7705a + ", contactInfo=" + this.f7706b + ")";
    }
}
