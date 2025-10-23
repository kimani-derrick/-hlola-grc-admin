package D;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes.dex */
public final class m extends h4.b {
    public static Font J(FontFamily fontFamily, int i7) {
        int i8;
        int i9;
        if ((i7 & 1) != 0) {
            i8 = 700;
        } else {
            i8 = 400;
        }
        if ((i7 & 2) != 0) {
            i9 = 1;
        } else {
            i9 = 0;
        }
        FontStyle fontStyle = new FontStyle(i8, i9);
        Font font = fontFamily.getFont(0);
        int K6 = K(fontStyle, font.getStyle());
        for (int i10 = 1; i10 < fontFamily.getSize(); i10++) {
            Font font2 = fontFamily.getFont(i10);
            int K7 = K(fontStyle, font2.getStyle());
            if (K7 < K6) {
                font = font2;
                K6 = K7;
            }
        }
        return font;
    }

    public static int K(FontStyle fontStyle, FontStyle fontStyle2) {
        int i7;
        int abs = Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100;
        if (fontStyle.getSlant() == fontStyle2.getSlant()) {
            i7 = 0;
        } else {
            i7 = 2;
        }
        return abs + i7;
    }

    @Override // h4.b
    public final Typeface k(Context context, C.g gVar, Resources resources, int i7) {
        C.h[] hVarArr;
        try {
            FontFamily.Builder builder = null;
            for (C.h hVar : gVar.f327a) {
                try {
                    Font build = new Font.Builder(resources, hVar.f).setWeight(hVar.f329b).setSlant(hVar.f330c ? 1 : 0).setTtcIndex(hVar.f331e).setFontVariationSettings(hVar.d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(J(build2, i7).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // h4.b
    public final Typeface l(Context context, H.k[] kVarArr, int i7) {
        ParcelFileDescriptor openFileDescriptor;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily.Builder builder = null;
            for (H.k kVar : kVarArr) {
                try {
                    openFileDescriptor = contentResolver.openFileDescriptor(kVar.f795a, "r", null);
                } catch (IOException unused) {
                }
                if (openFileDescriptor == null) {
                    if (openFileDescriptor == null) {
                    }
                } else {
                    try {
                        Font build = new Font.Builder(openFileDescriptor).setWeight(kVar.f797c).setSlant(kVar.d ? 1 : 0).setTtcIndex(kVar.f796b).build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(build);
                        } else {
                            builder.addFont(build);
                        }
                    } catch (Throwable th) {
                        try {
                            openFileDescriptor.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                        break;
                    }
                }
                openFileDescriptor.close();
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(J(build2, i7).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // h4.b
    public final Typeface m(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // h4.b
    public final Typeface n(Context context, Resources resources, int i7, String str, int i8) {
        try {
            Font build = new Font.Builder(resources, i7).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // h4.b
    public final H.k u(H.k[] kVarArr, int i7) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
