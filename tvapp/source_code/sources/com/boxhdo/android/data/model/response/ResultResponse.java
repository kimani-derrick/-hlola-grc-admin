package com.boxhdo.android.data.model.response;

import M5.g;
import androidx.databinding.d;
import n5.i;
import n5.l;
@l(generateAdapter = d.f5658o)
/* loaded from: classes.dex */
public final class ResultResponse<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Object f7636a;

    public ResultResponse(@i(name = "result") T t5) {
        this.f7636a = t5;
    }

    public final ResultResponse<T> copy(@i(name = "result") T t5) {
        return new ResultResponse<>(t5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ResultResponse) && g.a(this.f7636a, ((ResultResponse) obj).f7636a);
    }

    public final int hashCode() {
        Object obj = this.f7636a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "ResultResponse(result=" + this.f7636a + ")";
    }
}
