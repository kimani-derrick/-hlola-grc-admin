package com.boxhdo.android.data.model.preference;

import M5.g;
import androidx.databinding.d;
import n5.i;
import n5.l;
@l(generateAdapter = d.f5658o)
/* loaded from: classes.dex */
public final class GeneralPreference {

    /* renamed from: a  reason: collision with root package name */
    public final int f7296a;

    /* renamed from: b  reason: collision with root package name */
    public final int f7297b;

    /* renamed from: c  reason: collision with root package name */
    public final int f7298c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public final int f7299e;
    public final int f;

    /* renamed from: g  reason: collision with root package name */
    public final int f7300g;

    /* renamed from: h  reason: collision with root package name */
    public final String f7301h;

    public GeneralPreference(@i(name = "backgroundColor") int i7, @i(name = "textColor") int i8, @i(name = "paddingBottom") int i9, @i(name = "textSize") int i10, @i(name = "typeFace") int i11, @i(name = "defaultQuality") int i12, @i(name = "defaultResizeMode") int i13, @i(name = "langCode") String str) {
        g.f(str, "langCode");
        this.f7296a = i7;
        this.f7297b = i8;
        this.f7298c = i9;
        this.d = i10;
        this.f7299e = i11;
        this.f = i12;
        this.f7300g = i13;
        this.f7301h = str;
    }

    public final GeneralPreference copy(@i(name = "backgroundColor") int i7, @i(name = "textColor") int i8, @i(name = "paddingBottom") int i9, @i(name = "textSize") int i10, @i(name = "typeFace") int i11, @i(name = "defaultQuality") int i12, @i(name = "defaultResizeMode") int i13, @i(name = "langCode") String str) {
        g.f(str, "langCode");
        return new GeneralPreference(i7, i8, i9, i10, i11, i12, i13, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GeneralPreference) {
            GeneralPreference generalPreference = (GeneralPreference) obj;
            return this.f7296a == generalPreference.f7296a && this.f7297b == generalPreference.f7297b && this.f7298c == generalPreference.f7298c && this.d == generalPreference.d && this.f7299e == generalPreference.f7299e && this.f == generalPreference.f && this.f7300g == generalPreference.f7300g && g.a(this.f7301h, generalPreference.f7301h);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7301h.hashCode() + (((((((((((((this.f7296a * 31) + this.f7297b) * 31) + this.f7298c) * 31) + this.d) * 31) + this.f7299e) * 31) + this.f) * 31) + this.f7300g) * 31);
    }

    public final String toString() {
        return "GeneralPreference(backgroundColor=" + this.f7296a + ", textColor=" + this.f7297b + ", paddingBottom=" + this.f7298c + ", textSize=" + this.d + ", typeFace=" + this.f7299e + ", defaultQuality=" + this.f + ", defaultResizeMode=" + this.f7300g + ", langCode=" + this.f7301h + ")";
    }
}
