package com.boxhdo.android.data.model.request;

import M5.g;
import androidx.databinding.d;
import java.util.List;
import n5.i;
import n5.l;
@l(generateAdapter = d.f5658o)
/* loaded from: classes.dex */
public final class ReportRequest {

    /* renamed from: a  reason: collision with root package name */
    public final long f7345a;

    /* renamed from: b  reason: collision with root package name */
    public final List f7346b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7347c;

    public ReportRequest(@i(name = "movie_id") long j7, @i(name = "topics") List<Long> list, @i(name = "message") String str) {
        g.f(list, "topicIds");
        this.f7345a = j7;
        this.f7346b = list;
        this.f7347c = str;
    }

    public final ReportRequest copy(@i(name = "movie_id") long j7, @i(name = "topics") List<Long> list, @i(name = "message") String str) {
        g.f(list, "topicIds");
        return new ReportRequest(j7, list, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ReportRequest) {
            ReportRequest reportRequest = (ReportRequest) obj;
            return this.f7345a == reportRequest.f7345a && g.a(this.f7346b, reportRequest.f7346b) && g.a(this.f7347c, reportRequest.f7347c);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j7 = this.f7345a;
        int hashCode2 = (this.f7346b.hashCode() + (((int) (j7 ^ (j7 >>> 32))) * 31)) * 31;
        String str = this.f7347c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "ReportRequest(movieId=" + this.f7345a + ", topicIds=" + this.f7346b + ", message=" + this.f7347c + ")";
    }
}
