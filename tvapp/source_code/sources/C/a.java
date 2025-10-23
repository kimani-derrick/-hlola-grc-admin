package C;

import android.graphics.Color;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final float f315a;

    /* renamed from: b  reason: collision with root package name */
    public final float f316b;

    /* renamed from: c  reason: collision with root package name */
    public final float f317c;
    public final float d;

    /* renamed from: e  reason: collision with root package name */
    public final float f318e;
    public final float f;

    public a(float f, float f7, float f8, float f9, float f10, float f11) {
        this.f315a = f;
        this.f316b = f7;
        this.f317c = f8;
        this.d = f9;
        this.f318e = f10;
        this.f = f11;
    }

    public static a a(int i7) {
        float f;
        float pow;
        p pVar = p.f346k;
        float f7 = b.f(Color.red(i7));
        float f8 = b.f(Color.green(i7));
        float f9 = b.f(Color.blue(i7));
        float[][] fArr = b.d;
        float[] fArr2 = fArr[0];
        float f10 = (fArr2[2] * f9) + (fArr2[1] * f8) + (fArr2[0] * f7);
        float[] fArr3 = fArr[1];
        float f11 = (fArr3[2] * f9) + (fArr3[1] * f8) + (fArr3[0] * f7);
        float[] fArr4 = fArr[2];
        float f12 = (f9 * fArr4[2]) + (f8 * fArr4[1]) + (f7 * fArr4[0]);
        float[][] fArr5 = b.f319a;
        float[] fArr6 = fArr5[0];
        float f13 = (fArr6[2] * f12) + (fArr6[1] * f11) + (fArr6[0] * f10);
        float[] fArr7 = fArr5[1];
        float f14 = fArr7[1] * f11;
        float f15 = fArr7[2] * f12;
        float[] fArr8 = fArr5[2];
        float f16 = f10 * fArr8[0];
        float f17 = f12 * fArr8[2];
        float[] fArr9 = pVar.f351g;
        float f18 = fArr9[0] * f13;
        float f19 = fArr9[1] * (f15 + f14 + (fArr7[0] * f10));
        float f20 = fArr9[2] * (f17 + (f11 * fArr8[1]) + f16);
        float abs = Math.abs(f18);
        float f21 = pVar.f352h;
        float pow2 = (float) Math.pow((abs * f21) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((Math.abs(f19) * f21) / 100.0d, 0.42d);
        float pow4 = (float) Math.pow((Math.abs(f20) * f21) / 100.0d, 0.42d);
        float signum = ((Math.signum(f18) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum2 = ((Math.signum(f19) * 400.0f) * pow3) / (pow3 + 27.13f);
        float signum3 = ((Math.signum(f20) * 400.0f) * pow4) / (pow4 + 27.13f);
        double d = signum3;
        float f22 = ((float) (((signum2 * (-12.0d)) + (signum * 11.0d)) + d)) / 11.0f;
        float f23 = ((float) ((signum + signum2) - (d * 2.0d))) / 9.0f;
        float f24 = signum2 * 20.0f;
        float f25 = ((21.0f * signum3) + ((signum * 20.0f) + f24)) / 20.0f;
        float f26 = (((signum * 40.0f) + f24) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f23, f22)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f27 = atan2;
        float f28 = (3.1415927f * f27) / 180.0f;
        float f29 = f26 * pVar.f348b;
        float f30 = pVar.f347a;
        float f31 = pVar.d;
        float pow5 = ((float) Math.pow(f29 / f30, pVar.f354j * f31)) * 100.0f;
        Math.sqrt(pow5 / 100.0f);
        float f32 = f30 + 4.0f;
        if (f27 < 20.14d) {
            f = 360.0f + f27;
        } else {
            f = f27;
        }
        float pow6 = ((float) Math.pow(1.64d - Math.pow(0.29d, pVar.f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((f * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * pVar.f350e) * pVar.f349c) * ((float) Math.sqrt((f23 * f23) + (f22 * f22)))) / (f25 + 0.305f), 0.9d)) * ((float) Math.sqrt(pow5 / 100.0d));
        Math.sqrt((pow * f31) / f32);
        float f33 = (1.7f * pow5) / ((0.007f * pow5) + 1.0f);
        float log = ((float) Math.log((pVar.f353i * pow6 * 0.0228f) + 1.0f)) * 43.85965f;
        double d7 = f28;
        return new a(f27, pow6, pow5, f33, log * ((float) Math.cos(d7)), log * ((float) Math.sin(d7)));
    }

    public static a b(float f, float f7, float f8) {
        p pVar;
        double d;
        float f9 = p.f346k.d;
        Math.sqrt(f / 100.0d);
        Math.sqrt(((f7 / ((float) Math.sqrt(d))) * pVar.d) / (pVar.f347a + 4.0f));
        float f10 = (1.7f * f) / ((0.007f * f) + 1.0f);
        float log = ((float) Math.log((pVar.f353i * f7 * 0.0228d) + 1.0d)) * 43.85965f;
        double d7 = (3.1415927f * f8) / 180.0f;
        return new a(f8, f7, f, f10, log * ((float) Math.cos(d7)), log * ((float) Math.sin(d7)));
    }

    public final int c(p pVar) {
        float f;
        float[] fArr;
        float f7 = this.f316b;
        int i7 = (f7 > 0.0d ? 1 : (f7 == 0.0d ? 0 : -1));
        float f8 = this.f317c;
        if (i7 != 0) {
            double d = f8;
            if (d != 0.0d) {
                f = f7 / ((float) Math.sqrt(d / 100.0d));
                float pow = (float) Math.pow(f / Math.pow(1.64d - Math.pow(0.29d, pVar.f), 0.73d), 1.1111111111111112d);
                double d7 = (this.f315a * 3.1415927f) / 180.0f;
                float pow2 = pVar.f347a * ((float) Math.pow(f8 / 100.0d, (1.0d / pVar.d) / pVar.f354j));
                float cos = ((float) (Math.cos(2.0d + d7) + 3.8d)) * 0.25f * 3846.1538f * pVar.f350e * pVar.f349c;
                float f9 = pow2 / pVar.f348b;
                float sin = (float) Math.sin(d7);
                float cos2 = (float) Math.cos(d7);
                float f10 = (((0.305f + f9) * 23.0f) * pow) / (((pow * 108.0f) * sin) + (((11.0f * pow) * cos2) + (cos * 23.0f)));
                float f11 = cos2 * f10;
                float f12 = f10 * sin;
                float f13 = f9 * 460.0f;
                float f14 = ((288.0f * f12) + ((451.0f * f11) + f13)) / 1403.0f;
                float f15 = ((f13 - (891.0f * f11)) - (261.0f * f12)) / 1403.0f;
                float f16 = ((f13 - (f11 * 220.0f)) - (f12 * 6300.0f)) / 1403.0f;
                float max = (float) Math.max(0.0d, (Math.abs(f14) * 27.13d) / (400.0d - Math.abs(f14)));
                float signum = Math.signum(f14);
                float f17 = 100.0f / pVar.f352h;
                float pow3 = signum * f17 * ((float) Math.pow(max, 2.380952380952381d));
                float signum2 = Math.signum(f15) * f17 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f15) * 27.13d) / (400.0d - Math.abs(f15))), 2.380952380952381d));
                float[] fArr2 = pVar.f351g;
                float f18 = pow3 / fArr2[0];
                float f19 = signum2 / fArr2[1];
                float signum3 = ((Math.signum(f16) * f17) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f16) * 27.13d) / (400.0d - Math.abs(f16))), 2.380952380952381d))) / fArr2[2];
                float[][] fArr3 = b.f320b;
                float[] fArr4 = fArr3[0];
                float f20 = (fArr4[2] * signum3) + (fArr4[1] * f19) + (fArr4[0] * f18);
                float[] fArr5 = fArr3[1];
                float f21 = fArr5[1] * f19;
                float f22 = fArr5[2] * signum3;
                float f23 = f18 * fArr3[2][0];
                return D.a.a(f20, f22 + f21 + (fArr5[0] * f18), (signum3 * fArr[2]) + (f19 * fArr[1]) + f23);
            }
        }
        f = 0.0f;
        float pow4 = (float) Math.pow(f / Math.pow(1.64d - Math.pow(0.29d, pVar.f), 0.73d), 1.1111111111111112d);
        double d72 = (this.f315a * 3.1415927f) / 180.0f;
        float pow22 = pVar.f347a * ((float) Math.pow(f8 / 100.0d, (1.0d / pVar.d) / pVar.f354j));
        float cos3 = ((float) (Math.cos(2.0d + d72) + 3.8d)) * 0.25f * 3846.1538f * pVar.f350e * pVar.f349c;
        float f92 = pow22 / pVar.f348b;
        float sin2 = (float) Math.sin(d72);
        float cos22 = (float) Math.cos(d72);
        float f102 = (((0.305f + f92) * 23.0f) * pow4) / (((pow4 * 108.0f) * sin2) + (((11.0f * pow4) * cos22) + (cos3 * 23.0f)));
        float f112 = cos22 * f102;
        float f122 = f102 * sin2;
        float f132 = f92 * 460.0f;
        float f142 = ((288.0f * f122) + ((451.0f * f112) + f132)) / 1403.0f;
        float f152 = ((f132 - (891.0f * f112)) - (261.0f * f122)) / 1403.0f;
        float f162 = ((f132 - (f112 * 220.0f)) - (f122 * 6300.0f)) / 1403.0f;
        float max2 = (float) Math.max(0.0d, (Math.abs(f142) * 27.13d) / (400.0d - Math.abs(f142)));
        float signum4 = Math.signum(f142);
        float f172 = 100.0f / pVar.f352h;
        float pow32 = signum4 * f172 * ((float) Math.pow(max2, 2.380952380952381d));
        float signum22 = Math.signum(f152) * f172 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f152) * 27.13d) / (400.0d - Math.abs(f152))), 2.380952380952381d));
        float[] fArr22 = pVar.f351g;
        float f182 = pow32 / fArr22[0];
        float f192 = signum22 / fArr22[1];
        float signum32 = ((Math.signum(f162) * f172) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f162) * 27.13d) / (400.0d - Math.abs(f162))), 2.380952380952381d))) / fArr22[2];
        float[][] fArr32 = b.f320b;
        float[] fArr42 = fArr32[0];
        float f202 = (fArr42[2] * signum32) + (fArr42[1] * f192) + (fArr42[0] * f182);
        float[] fArr52 = fArr32[1];
        float f212 = fArr52[1] * f192;
        float f222 = fArr52[2] * signum32;
        float f232 = f182 * fArr32[2][0];
        return D.a.a(f202, f222 + f212 + (fArr52[0] * f182), (signum32 * fArr[2]) + (f192 * fArr[1]) + f232);
    }
}
