package com.boxhdo.domain.model;

import M5.g;
import com.boxhdo.domain.type.Quality;
import com.boxhdo.domain.type.SubtitleTypeface;
/* loaded from: classes.dex */
public final class GeneralConfig {

    /* renamed from: a  reason: collision with root package name */
    public final int f7985a;

    /* renamed from: b  reason: collision with root package name */
    public final int f7986b;

    /* renamed from: c  reason: collision with root package name */
    public final int f7987c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public final SubtitleTypeface f7988e;
    public final Quality f;

    /* renamed from: g  reason: collision with root package name */
    public final int f7989g;

    /* renamed from: h  reason: collision with root package name */
    public String f7990h;

    public GeneralConfig(int i7, int i8, int i9, int i10, SubtitleTypeface subtitleTypeface, Quality quality, int i11, String str) {
        g.f(subtitleTypeface, "typeFace");
        g.f(quality, "defaultQuality");
        g.f(str, "langCode");
        this.f7985a = i7;
        this.f7986b = i8;
        this.f7987c = i9;
        this.d = i10;
        this.f7988e = subtitleTypeface;
        this.f = quality;
        this.f7989g = i11;
        this.f7990h = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GeneralConfig) {
            GeneralConfig generalConfig = (GeneralConfig) obj;
            return this.f7985a == generalConfig.f7985a && this.f7986b == generalConfig.f7986b && this.f7987c == generalConfig.f7987c && this.d == generalConfig.d && this.f7988e == generalConfig.f7988e && this.f == generalConfig.f && this.f7989g == generalConfig.f7989g && g.a(this.f7990h, generalConfig.f7990h);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f7988e.hashCode();
        int hashCode2 = this.f.hashCode();
        return this.f7990h.hashCode() + ((((hashCode2 + ((hashCode + (((((((this.f7985a * 31) + this.f7986b) * 31) + this.f7987c) * 31) + this.d) * 31)) * 31)) * 31) + this.f7989g) * 31);
    }

    public final String toString() {
        String str = this.f7990h;
        return "GeneralConfig(backgroundColor=" + this.f7985a + ", textColor=" + this.f7986b + ", paddingBottom=" + this.f7987c + ", textSize=" + this.d + ", typeFace=" + this.f7988e + ", defaultQuality=" + this.f + ", defaultResizeMode=" + this.f7989g + ", langCode=" + str + ")";
    }
}
