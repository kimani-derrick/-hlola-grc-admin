package com.boxhdo.android.data.model.response;

import M5.g;
import androidx.databinding.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n5.i;
import n5.l;
import r0.AbstractC1111a;
@l(generateAdapter = d.f5658o)
/* loaded from: classes.dex */
public final class ErrorResponse {

    /* renamed from: a  reason: collision with root package name */
    public final String f7501a;

    public ErrorResponse(@i(name = "message") String str) {
        this.f7501a = str;
    }

    public final ErrorResponse copy(@i(name = "message") String str) {
        return new ErrorResponse(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ErrorResponse) && g.a(this.f7501a, ((ErrorResponse) obj).f7501a);
    }

    public final int hashCode() {
        String str = this.f7501a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return AbstractC1111a.t(new StringBuilder("ErrorResponse(message="), this.f7501a, ")");
    }

    public /* synthetic */ ErrorResponse(String str, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str);
    }
}
