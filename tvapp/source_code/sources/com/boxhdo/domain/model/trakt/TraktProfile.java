package com.boxhdo.domain.model.trakt;

import M5.g;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
/* loaded from: classes.dex */
public final class TraktProfile {

    /* renamed from: a  reason: collision with root package name */
    public final String f8092a;

    /* renamed from: b  reason: collision with root package name */
    public final String f8093b;

    /* renamed from: c  reason: collision with root package name */
    public final String f8094c;
    public final boolean d;

    public TraktProfile(String str, String str2, String str3, boolean z7) {
        this.f8092a = str;
        this.f8093b = str2;
        this.f8094c = str3;
        this.d = z7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TraktProfile) {
            TraktProfile traktProfile = (TraktProfile) obj;
            return g.a(this.f8092a, traktProfile.f8092a) && g.a(this.f8093b, traktProfile.f8093b) && g.a(this.f8094c, traktProfile.f8094c) && this.d == traktProfile.d;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int i7 = AbstractC0515y1.i(AbstractC0515y1.i(this.f8092a.hashCode() * 31, 31, this.f8093b), 31, this.f8094c);
        boolean z7 = this.d;
        int i8 = z7;
        if (z7 != 0) {
            i8 = 1;
        }
        return i7 + i8;
    }

    public final String toString() {
        return "TraktProfile(name=" + this.f8092a + ", username=" + this.f8093b + ", location=" + this.f8094c + ", isVip=" + this.d + ")";
    }
}
