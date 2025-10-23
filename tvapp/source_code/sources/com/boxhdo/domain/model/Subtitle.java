package com.boxhdo.domain.model;

import M5.g;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
/* loaded from: classes.dex */
public final class Subtitle {

    /* renamed from: a  reason: collision with root package name */
    public final String f8073a;

    /* renamed from: b  reason: collision with root package name */
    public final String f8074b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f8075c;

    public Subtitle(String str, String str2, boolean z7) {
        this.f8073a = str;
        this.f8074b = str2;
        this.f8075c = z7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Subtitle) {
            Subtitle subtitle = (Subtitle) obj;
            return g.a(this.f8073a, subtitle.f8073a) && g.a(this.f8074b, subtitle.f8074b) && this.f8075c == subtitle.f8075c;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int i7 = AbstractC0515y1.i(this.f8073a.hashCode() * 31, 31, this.f8074b);
        boolean z7 = this.f8075c;
        int i8 = z7;
        if (z7 != 0) {
            i8 = 1;
        }
        return i7 + i8;
    }

    public final String toString() {
        return "Subtitle(langCode=" + this.f8073a + ", lang=" + this.f8074b + ", isSelected=" + this.f8075c + ")";
    }
}
