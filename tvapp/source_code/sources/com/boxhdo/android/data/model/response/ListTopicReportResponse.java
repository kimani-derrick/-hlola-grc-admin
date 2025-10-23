package com.boxhdo.android.data.model.response;

import M5.g;
import androidx.databinding.d;
import java.util.List;
import n5.i;
import n5.l;
@l(generateAdapter = d.f5658o)
/* loaded from: classes.dex */
public final class ListTopicReportResponse {

    /* renamed from: a  reason: collision with root package name */
    public final List f7567a;

    public ListTopicReportResponse(@i(name = "topics") List<TopicReportResponse> list) {
        g.f(list, "topics");
        this.f7567a = list;
    }

    public final ListTopicReportResponse copy(@i(name = "topics") List<TopicReportResponse> list) {
        g.f(list, "topics");
        return new ListTopicReportResponse(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ListTopicReportResponse) && g.a(this.f7567a, ((ListTopicReportResponse) obj).f7567a);
    }

    public final int hashCode() {
        return this.f7567a.hashCode();
    }

    public final String toString() {
        return "ListTopicReportResponse(topics=" + this.f7567a + ")";
    }
}
