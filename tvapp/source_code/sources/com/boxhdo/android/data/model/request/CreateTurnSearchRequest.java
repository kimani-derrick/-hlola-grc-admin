package com.boxhdo.android.data.model.request;

import M5.g;
import androidx.databinding.d;
import n5.i;
import n5.l;
import r0.AbstractC1111a;
@l(generateAdapter = d.f5658o)
/* loaded from: classes.dex */
public final class CreateTurnSearchRequest {

    /* renamed from: a  reason: collision with root package name */
    public final long f7312a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7313b;

    public CreateTurnSearchRequest(@i(name = "movieId") long j7, @i(name = "keyword") String str) {
        g.f(str, "keyword");
        this.f7312a = j7;
        this.f7313b = str;
    }

    public final CreateTurnSearchRequest copy(@i(name = "movieId") long j7, @i(name = "keyword") String str) {
        g.f(str, "keyword");
        return new CreateTurnSearchRequest(j7, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CreateTurnSearchRequest) {
            CreateTurnSearchRequest createTurnSearchRequest = (CreateTurnSearchRequest) obj;
            return this.f7312a == createTurnSearchRequest.f7312a && g.a(this.f7313b, createTurnSearchRequest.f7313b);
        }
        return false;
    }

    public final int hashCode() {
        long j7 = this.f7312a;
        return this.f7313b.hashCode() + (((int) (j7 ^ (j7 >>> 32))) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreateTurnSearchRequest(movieId=");
        sb.append(this.f7312a);
        sb.append(", keyword=");
        return AbstractC1111a.t(sb, this.f7313b, ")");
    }
}
