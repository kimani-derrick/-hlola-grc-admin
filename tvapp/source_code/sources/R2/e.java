package R2;

import X.i;
import Z2.AbstractC0156a;
import android.graphics.Color;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final String f2910a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2911b;

    /* renamed from: c  reason: collision with root package name */
    public final Integer f2912c;
    public final Integer d;

    /* renamed from: e  reason: collision with root package name */
    public final float f2913e;
    public final boolean f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f2914g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f2915h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f2916i;

    /* renamed from: j  reason: collision with root package name */
    public final int f2917j;

    public e(String str, int i7, Integer num, Integer num2, float f, boolean z7, boolean z8, boolean z9, boolean z10, int i8) {
        this.f2910a = str;
        this.f2911b = i7;
        this.f2912c = num;
        this.d = num2;
        this.f2913e = f;
        this.f = z7;
        this.f2914g = z8;
        this.f2915h = z9;
        this.f2916i = z10;
        this.f2917j = i8;
    }

    public static int a(String str) {
        try {
            int parseInt = Integer.parseInt(str.trim());
            switch (parseInt) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case i.STRING_SET_FIELD_NUMBER /* 6 */:
                case i.DOUBLE_FIELD_NUMBER /* 7 */:
                case 8:
                case 9:
                    return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        AbstractC0515y1.w("Ignoring unknown alignment: ", str, "SsaStyle");
        return -1;
    }

    public static boolean b(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            if (parseInt != 1 && parseInt != -1) {
                return false;
            }
            return true;
        } catch (NumberFormatException e3) {
            AbstractC0156a.L("SsaStyle", "Failed to parse boolean value: '" + str + "'", e3);
            return false;
        }
    }

    public static Integer c(String str) {
        long parseLong;
        boolean z7;
        try {
            if (str.startsWith("&H")) {
                parseLong = Long.parseLong(str.substring(2), 16);
            } else {
                parseLong = Long.parseLong(str);
            }
            if (parseLong <= 4294967295L) {
                z7 = true;
            } else {
                z7 = false;
            }
            AbstractC0156a.f(z7);
            int q5 = android.support.v4.media.session.b.q(((parseLong >> 24) & 255) ^ 255);
            int q7 = android.support.v4.media.session.b.q((parseLong >> 16) & 255);
            return Integer.valueOf(Color.argb(q5, android.support.v4.media.session.b.q(parseLong & 255), android.support.v4.media.session.b.q((parseLong >> 8) & 255), q7));
        } catch (IllegalArgumentException e3) {
            AbstractC0156a.L("SsaStyle", "Failed to parse color expression: '" + str + "'", e3);
            return null;
        }
    }
}
