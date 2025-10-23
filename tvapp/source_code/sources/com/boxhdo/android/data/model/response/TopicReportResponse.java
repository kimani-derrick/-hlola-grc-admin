package com.boxhdo.android.data.model.response;

import M5.g;
import androidx.databinding.d;
import n5.i;
import n5.l;
import r0.AbstractC1111a;
@l(generateAdapter = d.f5658o)
/* loaded from: classes.dex */
public final class TopicReportResponse {

    /* renamed from: a  reason: collision with root package name */
    public final long f7688a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7689b;

    public TopicReportResponse(@i(name = "id") long j7, @i(name = "title") String str) {
        this.f7688a = j7;
        this.f7689b = str;
    }

    public final TopicReportResponse copy(@i(name = "id") long j7, @i(name = "title") String str) {
        return new TopicReportResponse(j7, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TopicReportResponse) {
            TopicReportResponse topicReportResponse = (TopicReportResponse) obj;
            return this.f7688a == topicReportResponse.f7688a && g.a(this.f7689b, topicReportResponse.f7689b);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j7 = this.f7688a;
        int i7 = ((int) (j7 ^ (j7 >>> 32))) * 31;
        String str = this.f7689b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return i7 + hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TopicReportResponse(id=");
        sb.append(this.f7688a);
        sb.append(", title=");
        return AbstractC1111a.t(sb, this.f7689b, ")");
    }
}
