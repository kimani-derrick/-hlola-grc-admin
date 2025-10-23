package D;

import android.graphics.Path;
import android.util.Log;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public char f433a;

    /* renamed from: b  reason: collision with root package name */
    public final float[] f434b;

    public g(char c5, float[] fArr) {
        this.f433a = c5;
        this.f434b = fArr;
    }

    public static void a(Path path, float f, float f7, float f8, float f9, float f10, float f11, float f12, boolean z7, boolean z8) {
        double d;
        double d7;
        double radians = Math.toRadians(f12);
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        double d8 = f;
        double d9 = f7;
        double d10 = (d9 * sin) + (d8 * cos);
        double d11 = d8;
        double d12 = f10;
        double d13 = d10 / d12;
        double d14 = f11;
        double d15 = ((d9 * cos) + ((-f) * sin)) / d14;
        double d16 = d9;
        double d17 = f9;
        double d18 = ((d17 * sin) + (f8 * cos)) / d12;
        double d19 = ((d17 * cos) + ((-f8) * sin)) / d14;
        double d20 = d13 - d18;
        double d21 = d15 - d19;
        double d22 = (d13 + d18) / 2.0d;
        double d23 = (d15 + d19) / 2.0d;
        double d24 = (d21 * d21) + (d20 * d20);
        if (d24 == 0.0d) {
            Log.w("PathParser", " Points are coincident");
            return;
        }
        double d25 = (1.0d / d24) - 0.25d;
        if (d25 < 0.0d) {
            Log.w("PathParser", "Points are too far apart " + d24);
            float sqrt = (float) (Math.sqrt(d24) / 1.99999d);
            a(path, f, f7, f8, f9, f10 * sqrt, f11 * sqrt, f12, z7, z8);
            return;
        }
        double sqrt2 = Math.sqrt(d25);
        double d26 = d20 * sqrt2;
        double d27 = sqrt2 * d21;
        if (z7 == z8) {
            d = d22 - d27;
            d7 = d23 + d26;
        } else {
            d = d22 + d27;
            d7 = d23 - d26;
        }
        double atan2 = Math.atan2(d15 - d7, d13 - d);
        double atan22 = Math.atan2(d19 - d7, d18 - d) - atan2;
        int i7 = (atan22 > 0.0d ? 1 : (atan22 == 0.0d ? 0 : -1));
        if (z8 != (i7 >= 0)) {
            atan22 = i7 > 0 ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
        }
        double d28 = d * d12;
        double d29 = d7 * d14;
        double d30 = (d28 * cos) - (d29 * sin);
        double d31 = (d29 * cos) + (d28 * sin);
        int ceil = (int) Math.ceil(Math.abs((atan22 * 4.0d) / 3.141592653589793d));
        double cos2 = Math.cos(radians);
        double sin2 = Math.sin(radians);
        double cos3 = Math.cos(atan2);
        double sin3 = Math.sin(atan2);
        double d32 = -d12;
        double d33 = d32 * cos2;
        double d34 = d14 * sin2;
        double d35 = (d33 * sin3) - (d34 * cos3);
        double d36 = d32 * sin2;
        double d37 = d14 * cos2;
        double d38 = (cos3 * d37) + (sin3 * d36);
        double d39 = d37;
        double d40 = atan22 / ceil;
        int i8 = 0;
        while (i8 < ceil) {
            double d41 = atan2 + d40;
            double sin4 = Math.sin(d41);
            double cos4 = Math.cos(d41);
            double d42 = d40;
            double d43 = (((d12 * cos2) * cos4) + d30) - (d34 * sin4);
            double d44 = d39;
            double d45 = d30;
            double d46 = (d44 * sin4) + (d12 * sin2 * cos4) + d31;
            double d47 = (d33 * sin4) - (d34 * cos4);
            double d48 = (cos4 * d44) + (sin4 * d36);
            double d49 = d41 - atan2;
            double tan = Math.tan(d49 / 2.0d);
            double sqrt3 = ((Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d) * Math.sin(d49)) / 3.0d;
            path.rLineTo(0.0f, 0.0f);
            path.cubicTo((float) ((d35 * sqrt3) + d11), (float) ((d38 * sqrt3) + d16), (float) (d43 - (sqrt3 * d47)), (float) (d46 - (sqrt3 * d48)), (float) d43, (float) d46);
            i8++;
            atan2 = d41;
            d36 = d36;
            cos2 = cos2;
            ceil = ceil;
            d38 = d48;
            d12 = d12;
            d35 = d47;
            d11 = d43;
            d16 = d46;
            d30 = d45;
            d40 = d42;
            d39 = d44;
        }
    }

    public static void b(g[] gVarArr, Path path) {
        int i7;
        int i8;
        char c5;
        int i9;
        int i10;
        g gVar;
        boolean z7;
        boolean z8;
        float f;
        float f7;
        boolean z9;
        boolean z10;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        g[] gVarArr2 = gVarArr;
        int i11 = 6;
        float[] fArr = new float[6];
        int length = gVarArr2.length;
        int i12 = 0;
        char c6 = 'm';
        while (i12 < length) {
            g gVar2 = gVarArr2[i12];
            char c7 = gVar2.f433a;
            float f18 = fArr[0];
            float f19 = fArr[1];
            float f20 = fArr[2];
            float f21 = fArr[3];
            float f22 = fArr[4];
            float f23 = fArr[5];
            switch (c7) {
                case 'A':
                case 'a':
                    i7 = 7;
                    break;
                case 'C':
                case 'c':
                    i7 = i11;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i7 = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case ModuleDescriptor.MODULE_VERSION /* 115 */:
                    i7 = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(f22, f23);
                    f18 = f22;
                    f20 = f18;
                    f19 = f23;
                    f21 = f19;
                default:
                    i7 = 2;
                    break;
            }
            float f24 = f22;
            float f25 = f23;
            float f26 = f18;
            float f27 = f19;
            int i13 = 0;
            while (true) {
                float[] fArr2 = gVar2.f434b;
                if (i13 < fArr2.length) {
                    if (c7 != 'A') {
                        if (c7 != 'C') {
                            if (c7 != 'H') {
                                if (c7 != 'Q') {
                                    if (c7 != 'V') {
                                        if (c7 != 'a') {
                                            if (c7 != 'c') {
                                                if (c7 != 'h') {
                                                    if (c7 != 'q') {
                                                        if (c7 != 'v') {
                                                            if (c7 != 'L') {
                                                                if (c7 != 'M') {
                                                                    if (c7 != 'S') {
                                                                        if (c7 != 'T') {
                                                                            if (c7 != 'l') {
                                                                                if (c7 != 'm') {
                                                                                    if (c7 != 's') {
                                                                                        if (c7 != 't') {
                                                                                            i8 = i13;
                                                                                        } else {
                                                                                            if (c6 != 'q' && c6 != 't' && c6 != 'Q' && c6 != 'T') {
                                                                                                f17 = 0.0f;
                                                                                                f16 = 0.0f;
                                                                                            } else {
                                                                                                f16 = f26 - f20;
                                                                                                f17 = f27 - f21;
                                                                                            }
                                                                                            int i14 = i13 + 1;
                                                                                            path.rQuadTo(f16, f17, fArr2[i13], fArr2[i14]);
                                                                                            float f28 = f16 + f26;
                                                                                            float f29 = f17 + f27;
                                                                                            f26 += fArr2[i13];
                                                                                            f27 += fArr2[i14];
                                                                                            f21 = f29;
                                                                                            i8 = i13;
                                                                                            c5 = c7;
                                                                                            i9 = i12;
                                                                                            i10 = length;
                                                                                            f20 = f28;
                                                                                        }
                                                                                    } else {
                                                                                        if (c6 != 'c' && c6 != 's' && c6 != 'C' && c6 != 'S') {
                                                                                            f14 = 0.0f;
                                                                                            f15 = 0.0f;
                                                                                        } else {
                                                                                            float f30 = f26 - f20;
                                                                                            f14 = f27 - f21;
                                                                                            f15 = f30;
                                                                                        }
                                                                                        int i15 = i13 + 1;
                                                                                        int i16 = i13 + 2;
                                                                                        int i17 = i13 + 3;
                                                                                        i8 = i13;
                                                                                        float f31 = f27;
                                                                                        float f32 = f26;
                                                                                        path.rCubicTo(f15, f14, fArr2[i13], fArr2[i15], fArr2[i16], fArr2[i17]);
                                                                                        f8 = f32 + fArr2[i8];
                                                                                        f9 = f31 + fArr2[i15];
                                                                                        f10 = f32 + fArr2[i16];
                                                                                        f11 = fArr2[i17] + f31;
                                                                                    }
                                                                                } else {
                                                                                    i8 = i13;
                                                                                    float f33 = fArr2[i8];
                                                                                    f26 += f33;
                                                                                    float f34 = fArr2[i8 + 1];
                                                                                    f27 += f34;
                                                                                    if (i8 > 0) {
                                                                                        path.rLineTo(f33, f34);
                                                                                    } else {
                                                                                        path.rMoveTo(f33, f34);
                                                                                        f25 = f27;
                                                                                        f24 = f26;
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                i8 = i13;
                                                                                int i18 = i8 + 1;
                                                                                path.rLineTo(fArr2[i8], fArr2[i18]);
                                                                                f26 += fArr2[i8];
                                                                                f27 += fArr2[i18];
                                                                            }
                                                                        } else {
                                                                            i8 = i13;
                                                                            float f35 = f27;
                                                                            float f36 = f26;
                                                                            if (c6 != 'q' && c6 != 't' && c6 != 'Q' && c6 != 'T') {
                                                                                f8 = f36;
                                                                                f9 = f35;
                                                                            } else {
                                                                                f8 = (f36 * 2.0f) - f20;
                                                                                f9 = (f35 * 2.0f) - f21;
                                                                            }
                                                                            int i19 = i8 + 1;
                                                                            path.quadTo(f8, f9, fArr2[i8], fArr2[i19]);
                                                                            f10 = fArr2[i8];
                                                                            f11 = fArr2[i19];
                                                                        }
                                                                    } else {
                                                                        i8 = i13;
                                                                        float f37 = f27;
                                                                        float f38 = f26;
                                                                        if (c6 != 'c' && c6 != 's' && c6 != 'C' && c6 != 'S') {
                                                                            f13 = f38;
                                                                            f12 = f37;
                                                                        } else {
                                                                            f12 = (f37 * 2.0f) - f21;
                                                                            f13 = (f38 * 2.0f) - f20;
                                                                        }
                                                                        int i20 = i8 + 1;
                                                                        int i21 = i8 + 2;
                                                                        int i22 = i8 + 3;
                                                                        path.cubicTo(f13, f12, fArr2[i8], fArr2[i20], fArr2[i21], fArr2[i22]);
                                                                        float f39 = fArr2[i8];
                                                                        float f40 = fArr2[i20];
                                                                        f26 = fArr2[i21];
                                                                        f27 = fArr2[i22];
                                                                        f21 = f40;
                                                                        f20 = f39;
                                                                    }
                                                                } else {
                                                                    i8 = i13;
                                                                    f26 = fArr2[i8];
                                                                    f27 = fArr2[i8 + 1];
                                                                    if (i8 > 0) {
                                                                        path.lineTo(f26, f27);
                                                                    } else {
                                                                        path.moveTo(f26, f27);
                                                                        f25 = f27;
                                                                        f24 = f26;
                                                                    }
                                                                }
                                                            } else {
                                                                i8 = i13;
                                                                int i23 = i8 + 1;
                                                                path.lineTo(fArr2[i8], fArr2[i23]);
                                                                f26 = fArr2[i8];
                                                                f27 = fArr2[i23];
                                                            }
                                                        } else {
                                                            i8 = i13;
                                                            path.rLineTo(0.0f, fArr2[i8]);
                                                            f27 += fArr2[i8];
                                                        }
                                                    } else {
                                                        i8 = i13;
                                                        float f41 = f27;
                                                        float f42 = f26;
                                                        int i24 = i8 + 1;
                                                        int i25 = i8 + 2;
                                                        int i26 = i8 + 3;
                                                        path.rQuadTo(fArr2[i8], fArr2[i24], fArr2[i25], fArr2[i26]);
                                                        float f43 = f42 + fArr2[i8];
                                                        float f44 = f42 + fArr2[i25];
                                                        f27 = f41 + fArr2[i26];
                                                        f21 = fArr2[i24] + f41;
                                                        f20 = f43;
                                                        c5 = c7;
                                                        i9 = i12;
                                                        i10 = length;
                                                        f26 = f44;
                                                    }
                                                    gVar = gVar2;
                                                } else {
                                                    i8 = i13;
                                                    path.rLineTo(fArr2[i8], 0.0f);
                                                    f26 += fArr2[i8];
                                                }
                                                c5 = c7;
                                                i9 = i12;
                                                i10 = length;
                                                gVar = gVar2;
                                            } else {
                                                i8 = i13;
                                                float f45 = f27;
                                                float f46 = f26;
                                                int i27 = i8 + 2;
                                                int i28 = i8 + 3;
                                                int i29 = i8 + 4;
                                                int i30 = i8 + 5;
                                                path.rCubicTo(fArr2[i8], fArr2[i8 + 1], fArr2[i27], fArr2[i28], fArr2[i29], fArr2[i30]);
                                                f8 = f46 + fArr2[i27];
                                                f9 = f45 + fArr2[i28];
                                                f10 = f46 + fArr2[i29];
                                                f11 = fArr2[i30] + f45;
                                            }
                                            f21 = f9;
                                            f20 = f8;
                                            c5 = c7;
                                            i9 = i12;
                                            i10 = length;
                                            f26 = f10;
                                            f27 = f11;
                                            gVar = gVar2;
                                        } else {
                                            i8 = i13;
                                            float f47 = f27;
                                            float f48 = f26;
                                            int i31 = i8 + 5;
                                            float f49 = fArr2[i31] + f48;
                                            int i32 = i8 + 6;
                                            float f50 = fArr2[i32] + f47;
                                            float f51 = fArr2[i8];
                                            float f52 = fArr2[i8 + 1];
                                            float f53 = fArr2[i8 + 2];
                                            if (fArr2[i8 + 3] != 0.0f) {
                                                z9 = true;
                                            } else {
                                                z9 = false;
                                            }
                                            if (fArr2[i8 + 4] != 0.0f) {
                                                z10 = true;
                                            } else {
                                                z10 = false;
                                            }
                                            c5 = c7;
                                            i10 = length;
                                            gVar = gVar2;
                                            i9 = i12;
                                            a(path, f48, f47, f49, f50, f51, f52, f53, z9, z10);
                                            f26 = f48 + fArr2[i31];
                                            f27 = f47 + fArr2[i32];
                                        }
                                    } else {
                                        i8 = i13;
                                        c5 = c7;
                                        i9 = i12;
                                        i10 = length;
                                        gVar = gVar2;
                                        path.lineTo(f26, fArr2[i8]);
                                        f27 = fArr2[i8];
                                    }
                                } else {
                                    i8 = i13;
                                    c5 = c7;
                                    i9 = i12;
                                    i10 = length;
                                    gVar = gVar2;
                                    float f54 = fArr2[i8];
                                    int i33 = i8 + 1;
                                    float f55 = fArr2[i33];
                                    int i34 = i8 + 2;
                                    int i35 = i8 + 3;
                                    path.quadTo(f54, f55, fArr2[i34], fArr2[i35]);
                                    f = fArr2[i8];
                                    f7 = fArr2[i33];
                                    f26 = fArr2[i34];
                                    f27 = fArr2[i35];
                                }
                            } else {
                                i8 = i13;
                                c5 = c7;
                                i9 = i12;
                                i10 = length;
                                gVar = gVar2;
                                path.lineTo(fArr2[i8], f27);
                                f26 = fArr2[i8];
                            }
                            i13 = i8 + i7;
                            gVar2 = gVar;
                            length = i10;
                            c6 = c5;
                            c7 = c6;
                            i12 = i9;
                        } else {
                            i8 = i13;
                            c5 = c7;
                            i9 = i12;
                            i10 = length;
                            gVar = gVar2;
                            int i36 = i8 + 2;
                            int i37 = i8 + 3;
                            int i38 = i8 + 4;
                            int i39 = i8 + 5;
                            path.cubicTo(fArr2[i8], fArr2[i8 + 1], fArr2[i36], fArr2[i37], fArr2[i38], fArr2[i39]);
                            f26 = fArr2[i38];
                            f27 = fArr2[i39];
                            f = fArr2[i36];
                            f7 = fArr2[i37];
                        }
                        f20 = f;
                        f21 = f7;
                        i13 = i8 + i7;
                        gVar2 = gVar;
                        length = i10;
                        c6 = c5;
                        c7 = c6;
                        i12 = i9;
                    } else {
                        i8 = i13;
                        float f56 = f27;
                        float f57 = f26;
                        c5 = c7;
                        i9 = i12;
                        i10 = length;
                        gVar = gVar2;
                        int i40 = i8 + 5;
                        float f58 = fArr2[i40];
                        int i41 = i8 + 6;
                        float f59 = fArr2[i41];
                        float f60 = fArr2[i8];
                        float f61 = fArr2[i8 + 1];
                        float f62 = fArr2[i8 + 2];
                        if (fArr2[i8 + 3] != 0.0f) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        if (fArr2[i8 + 4] != 0.0f) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        a(path, f57, f56, f58, f59, f60, f61, f62, z7, z8);
                        f26 = fArr2[i40];
                        f27 = fArr2[i41];
                    }
                    f21 = f27;
                    f20 = f26;
                    i13 = i8 + i7;
                    gVar2 = gVar;
                    length = i10;
                    c6 = c5;
                    c7 = c6;
                    i12 = i9;
                }
            }
            fArr[0] = f26;
            fArr[1] = f27;
            fArr[2] = f20;
            fArr[3] = f21;
            fArr[4] = f24;
            fArr[5] = f25;
            c6 = gVar2.f433a;
            i12++;
            gVarArr2 = gVarArr;
            length = length;
            i11 = 6;
        }
    }

    public g(g gVar) {
        this.f433a = gVar.f433a;
        float[] fArr = gVar.f434b;
        this.f434b = android.support.v4.media.session.b.v(fArr, fArr.length);
    }
}
