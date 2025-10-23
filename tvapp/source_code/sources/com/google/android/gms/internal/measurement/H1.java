package com.google.android.gms.internal.measurement;

import android.content.Context;
/* loaded from: classes.dex */
public final class H1 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f8352a;

    /* renamed from: b  reason: collision with root package name */
    public final N3.l f8353b;

    public H1(Context context, N3.l lVar) {
        this.f8352a = context;
        this.f8353b = lVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof H1) {
            H1 h12 = (H1) obj;
            if (this.f8352a.equals(h12.f8352a)) {
                N3.l lVar = h12.f8353b;
                N3.l lVar2 = this.f8353b;
                if (lVar2 != null ? lVar2.equals(lVar) : lVar == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f8352a.hashCode() ^ 1000003) * 1000003;
        N3.l lVar = this.f8353b;
        return hashCode ^ (lVar == null ? 0 : lVar.hashCode());
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f8352a);
        String valueOf2 = String.valueOf(this.f8353b);
        return "FlagsContext{context=" + valueOf + ", hermeticFileOverrides=" + valueOf2 + "}";
    }
}
