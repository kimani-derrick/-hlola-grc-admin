package D;

import android.graphics.Color;
/* loaded from: classes.dex */
public abstract class a {
    static {
        new ThreadLocal();
    }

    public static int a(double d, double d7, double d8) {
        double d9;
        double d10;
        double d11;
        int min;
        int min2;
        double d12 = (((-0.4986d) * d8) + (((-1.5372d) * d7) + (3.2406d * d))) / 100.0d;
        double d13 = ((0.0415d * d8) + ((1.8758d * d7) + ((-0.9689d) * d))) / 100.0d;
        double d14 = ((1.057d * d8) + (((-0.204d) * d7) + (0.0557d * d))) / 100.0d;
        if (d12 > 0.0031308d) {
            d9 = (Math.pow(d12, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d9 = d12 * 12.92d;
        }
        if (d13 > 0.0031308d) {
            d10 = (Math.pow(d13, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d10 = d13 * 12.92d;
        }
        if (d14 > 0.0031308d) {
            d11 = (Math.pow(d14, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d11 = d14 * 12.92d;
        }
        int round = (int) Math.round(d9 * 255.0d);
        int i7 = 0;
        if (round < 0) {
            min = 0;
        } else {
            min = Math.min(round, 255);
        }
        int round2 = (int) Math.round(d10 * 255.0d);
        if (round2 < 0) {
            min2 = 0;
        } else {
            min2 = Math.min(round2, 255);
        }
        int round3 = (int) Math.round(d11 * 255.0d);
        if (round3 >= 0) {
            i7 = Math.min(round3, 255);
        }
        return Color.rgb(min, min2, i7);
    }

    public static int b(int i7, int i8) {
        int alpha = Color.alpha(i8);
        int alpha2 = Color.alpha(i7);
        int i9 = 255 - (((255 - alpha2) * (255 - alpha)) / 255);
        return Color.argb(i9, c(Color.red(i7), alpha2, Color.red(i8), alpha, i9), c(Color.green(i7), alpha2, Color.green(i8), alpha, i9), c(Color.blue(i7), alpha2, Color.blue(i8), alpha, i9));
    }

    public static int c(int i7, int i8, int i9, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        return (((255 - i8) * (i9 * i10)) + ((i7 * 255) * i8)) / (i11 * 255);
    }

    public static int d(int i7, int i8) {
        if (i8 >= 0 && i8 <= 255) {
            return (i7 & 16777215) | (i8 << 24);
        }
        throw new IllegalArgumentException("alpha must be between 0 and 255.");
    }
}
