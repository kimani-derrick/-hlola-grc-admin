package com.boxhdo.android.data.model.response;

import M5.g;
import androidx.databinding.d;
import n5.i;
import n5.l;
import r0.AbstractC1111a;
@l(generateAdapter = d.f5658o)
/* loaded from: classes.dex */
public final class ContactInfoResponse {

    /* renamed from: a  reason: collision with root package name */
    public final String f7432a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7433b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7434c;
    public final String d;

    /* renamed from: e  reason: collision with root package name */
    public final String f7435e;

    public ContactInfoResponse(@i(name = "webUrl") String str, @i(name = "email") String str2, @i(name = "telegramUrl") String str3, @i(name = "discordUrl") String str4, @i(name = "feedbackUrl") String str5) {
        this.f7432a = str;
        this.f7433b = str2;
        this.f7434c = str3;
        this.d = str4;
        this.f7435e = str5;
    }

    public final ContactInfoResponse copy(@i(name = "webUrl") String str, @i(name = "email") String str2, @i(name = "telegramUrl") String str3, @i(name = "discordUrl") String str4, @i(name = "feedbackUrl") String str5) {
        return new ContactInfoResponse(str, str2, str3, str4, str5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ContactInfoResponse) {
            ContactInfoResponse contactInfoResponse = (ContactInfoResponse) obj;
            return g.a(this.f7432a, contactInfoResponse.f7432a) && g.a(this.f7433b, contactInfoResponse.f7433b) && g.a(this.f7434c, contactInfoResponse.f7434c) && g.a(this.d, contactInfoResponse.d) && g.a(this.f7435e, contactInfoResponse.f7435e);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f7432a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f7433b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f7434c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f7435e;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContactInfoResponse(webUrl=");
        sb.append(this.f7432a);
        sb.append(", email=");
        sb.append(this.f7433b);
        sb.append(", telegramUrl=");
        sb.append(this.f7434c);
        sb.append(", discordUrl=");
        sb.append(this.d);
        sb.append(", feedbackUrl=");
        return AbstractC1111a.t(sb, this.f7435e, ")");
    }
}
