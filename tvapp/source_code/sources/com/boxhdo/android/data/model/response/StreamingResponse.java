package com.boxhdo.android.data.model.response;

import M5.g;
import androidx.databinding.d;
import java.util.List;
import n5.i;
import n5.l;
@l(generateAdapter = d.f5658o)
/* loaded from: classes.dex */
public final class StreamingResponse {

    /* renamed from: a  reason: collision with root package name */
    public final List f7658a;

    /* renamed from: b  reason: collision with root package name */
    public final List f7659b;

    /* renamed from: c  reason: collision with root package name */
    public final List f7660c;
    public final List d;

    /* renamed from: e  reason: collision with root package name */
    public final List f7661e;

    public StreamingResponse(@i(name = "auto") List<StreamDataResponse> list, @i(name = "1080") List<StreamDataResponse> list2, @i(name = "360") List<StreamDataResponse> list3, @i(name = "480") List<StreamDataResponse> list4, @i(name = "720") List<StreamDataResponse> list5) {
        this.f7658a = list;
        this.f7659b = list2;
        this.f7660c = list3;
        this.d = list4;
        this.f7661e = list5;
    }

    public final StreamingResponse copy(@i(name = "auto") List<StreamDataResponse> list, @i(name = "1080") List<StreamDataResponse> list2, @i(name = "360") List<StreamDataResponse> list3, @i(name = "480") List<StreamDataResponse> list4, @i(name = "720") List<StreamDataResponse> list5) {
        return new StreamingResponse(list, list2, list3, list4, list5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StreamingResponse) {
            StreamingResponse streamingResponse = (StreamingResponse) obj;
            return g.a(this.f7658a, streamingResponse.f7658a) && g.a(this.f7659b, streamingResponse.f7659b) && g.a(this.f7660c, streamingResponse.f7660c) && g.a(this.d, streamingResponse.d) && g.a(this.f7661e, streamingResponse.f7661e);
        }
        return false;
    }

    public final int hashCode() {
        List list = this.f7658a;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.f7659b;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.f7660c;
        int hashCode3 = (hashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List list4 = this.d;
        int hashCode4 = (hashCode3 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List list5 = this.f7661e;
        return hashCode4 + (list5 != null ? list5.hashCode() : 0);
    }

    public final String toString() {
        return "StreamingResponse(auto=" + this.f7658a + ", x1080=" + this.f7659b + ", x360=" + this.f7660c + ", x480=" + this.d + ", x720=" + this.f7661e + ")";
    }
}
