package com.bumptech.glide.load;
/* loaded from: classes.dex */
public enum ImageHeaderParser$ImageType {
    GIF(true),
    JPEG(false),
    RAW(false),
    PNG_A(true),
    PNG(false),
    WEBP_A(true),
    WEBP(false),
    UNKNOWN(false);
    

    /* renamed from: q  reason: collision with root package name */
    public final boolean f8114q;

    ImageHeaderParser$ImageType(boolean z7) {
        this.f8114q = z7;
    }

    public boolean hasAlpha() {
        return this.f8114q;
    }
}
