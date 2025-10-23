package com.boxhdo.domain.model;

import M5.g;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import r0.AbstractC1111a;
/* loaded from: classes.dex */
public final class ContactInfo {

    /* renamed from: a  reason: collision with root package name */
    public final String f7943a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7944b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7945c;
    public final String d;

    /* renamed from: e  reason: collision with root package name */
    public final String f7946e;

    public ContactInfo(String str, String str2, String str3, String str4, String str5) {
        this.f7943a = str;
        this.f7944b = str2;
        this.f7945c = str3;
        this.d = str4;
        this.f7946e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ContactInfo) {
            ContactInfo contactInfo = (ContactInfo) obj;
            return g.a(this.f7943a, contactInfo.f7943a) && g.a(this.f7944b, contactInfo.f7944b) && g.a(this.f7945c, contactInfo.f7945c) && g.a(this.d, contactInfo.d) && g.a(this.f7946e, contactInfo.f7946e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7946e.hashCode() + AbstractC0515y1.i(AbstractC0515y1.i(AbstractC0515y1.i(this.f7943a.hashCode() * 31, 31, this.f7944b), 31, this.f7945c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContactInfo(webUrl=");
        sb.append(this.f7943a);
        sb.append(", email=");
        sb.append(this.f7944b);
        sb.append(", telegramUrl=");
        sb.append(this.f7945c);
        sb.append(", discordUrl=");
        sb.append(this.d);
        sb.append(", feedback=");
        return AbstractC1111a.t(sb, this.f7946e, ")");
    }
}
