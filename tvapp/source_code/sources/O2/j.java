package O2;

import Z2.H;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
/* loaded from: classes.dex */
public final class j {

    /* renamed from: h  reason: collision with root package name */
    public static final byte[] f2581h = {0, 7, 8, 15};

    /* renamed from: i  reason: collision with root package name */
    public static final byte[] f2582i = {0, 119, -120, -1};

    /* renamed from: j  reason: collision with root package name */
    public static final byte[] f2583j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* renamed from: a  reason: collision with root package name */
    public final Paint f2584a;

    /* renamed from: b  reason: collision with root package name */
    public final Paint f2585b;

    /* renamed from: c  reason: collision with root package name */
    public final Canvas f2586c;
    public final c d;

    /* renamed from: e  reason: collision with root package name */
    public final b f2587e;
    public final i f;

    /* renamed from: g  reason: collision with root package name */
    public Bitmap f2588g;

    public j(int i7, int i8) {
        Paint paint = new Paint();
        this.f2584a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f2585b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f2586c = new Canvas();
        this.d = new c(719, 575, 0, 719, 0, 575);
        this.f2587e = new b(0, new int[]{0, -1, -16777216, -8421505}, b(), c());
        this.f = new i(i7, i8);
    }

    public static byte[] a(int i7, int i8, N2.f fVar) {
        byte[] bArr = new byte[i7];
        for (int i9 = 0; i9 < i7; i9++) {
            bArr[i9] = (byte) fVar.i(i8);
        }
        return bArr;
    }

    public static int[] b() {
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i12 = 1; i12 < 16; i12++) {
            if (i12 < 8) {
                if ((i12 & 1) != 0) {
                    i9 = 255;
                } else {
                    i9 = 0;
                }
                if ((i12 & 2) != 0) {
                    i10 = 255;
                } else {
                    i10 = 0;
                }
                if ((i12 & 4) != 0) {
                    i11 = 255;
                } else {
                    i11 = 0;
                }
                iArr[i12] = d(255, i9, i10, i11);
            } else {
                int i13 = 127;
                if ((i12 & 1) != 0) {
                    i7 = 127;
                } else {
                    i7 = 0;
                }
                if ((i12 & 2) != 0) {
                    i8 = 127;
                } else {
                    i8 = 0;
                }
                if ((i12 & 4) == 0) {
                    i13 = 0;
                }
                iArr[i12] = d(255, i7, i8, i13);
            }
        }
        return iArr;
    }

    public static int[] c() {
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i25 = 0; i25 < 256; i25++) {
            int i26 = 255;
            if (i25 < 8) {
                if ((i25 & 1) != 0) {
                    i23 = 255;
                } else {
                    i23 = 0;
                }
                if ((i25 & 2) != 0) {
                    i24 = 255;
                } else {
                    i24 = 0;
                }
                if ((i25 & 4) == 0) {
                    i26 = 0;
                }
                iArr[i25] = d(63, i23, i24, i26);
            } else {
                int i27 = i25 & 136;
                int i28 = 170;
                int i29 = 85;
                if (i27 != 0) {
                    if (i27 != 8) {
                        int i30 = 43;
                        if (i27 != 128) {
                            if (i27 == 136) {
                                if ((i25 & 1) != 0) {
                                    i19 = 43;
                                } else {
                                    i19 = 0;
                                }
                                if ((i25 & 16) != 0) {
                                    i20 = 85;
                                } else {
                                    i20 = 0;
                                }
                                int i31 = i19 + i20;
                                if ((i25 & 2) != 0) {
                                    i21 = 43;
                                } else {
                                    i21 = 0;
                                }
                                if ((i25 & 32) != 0) {
                                    i22 = 85;
                                } else {
                                    i22 = 0;
                                }
                                int i32 = i21 + i22;
                                if ((i25 & 4) == 0) {
                                    i30 = 0;
                                }
                                if ((i25 & 64) == 0) {
                                    i29 = 0;
                                }
                                iArr[i25] = d(255, i31, i32, i30 + i29);
                            }
                        } else {
                            if ((i25 & 1) != 0) {
                                i15 = 43;
                            } else {
                                i15 = 0;
                            }
                            int i33 = i15 + 127;
                            if ((i25 & 16) != 0) {
                                i16 = 85;
                            } else {
                                i16 = 0;
                            }
                            int i34 = i33 + i16;
                            if ((i25 & 2) != 0) {
                                i17 = 43;
                            } else {
                                i17 = 0;
                            }
                            int i35 = i17 + 127;
                            if ((i25 & 32) != 0) {
                                i18 = 85;
                            } else {
                                i18 = 0;
                            }
                            int i36 = i35 + i18;
                            if ((i25 & 4) == 0) {
                                i30 = 0;
                            }
                            int i37 = i30 + 127;
                            if ((i25 & 64) == 0) {
                                i29 = 0;
                            }
                            iArr[i25] = d(255, i34, i36, i37 + i29);
                        }
                    } else {
                        if ((i25 & 1) != 0) {
                            i11 = 85;
                        } else {
                            i11 = 0;
                        }
                        if ((i25 & 16) != 0) {
                            i12 = 170;
                        } else {
                            i12 = 0;
                        }
                        int i38 = i11 + i12;
                        if ((i25 & 2) != 0) {
                            i13 = 85;
                        } else {
                            i13 = 0;
                        }
                        if ((i25 & 32) != 0) {
                            i14 = 170;
                        } else {
                            i14 = 0;
                        }
                        int i39 = i13 + i14;
                        if ((i25 & 4) == 0) {
                            i29 = 0;
                        }
                        if ((i25 & 64) == 0) {
                            i28 = 0;
                        }
                        iArr[i25] = d(127, i38, i39, i29 + i28);
                    }
                } else {
                    if ((i25 & 1) != 0) {
                        i7 = 85;
                    } else {
                        i7 = 0;
                    }
                    if ((i25 & 16) != 0) {
                        i8 = 170;
                    } else {
                        i8 = 0;
                    }
                    int i40 = i7 + i8;
                    if ((i25 & 2) != 0) {
                        i9 = 85;
                    } else {
                        i9 = 0;
                    }
                    if ((i25 & 32) != 0) {
                        i10 = 170;
                    } else {
                        i10 = 0;
                    }
                    int i41 = i9 + i10;
                    if ((i25 & 4) == 0) {
                        i29 = 0;
                    }
                    if ((i25 & 64) == 0) {
                        i28 = 0;
                    }
                    iArr[i25] = d(255, i40, i41, i29 + i28);
                }
            }
        }
        return iArr;
    }

    public static int d(int i7, int i8, int i9, int i10) {
        return (i7 << 24) | (i8 << 16) | (i9 << 8) | i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x01e9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0219 A[LOOP:3: B:88:0x016a->B:117:0x0219, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0141 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0179  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e(byte[] r23, int[] r24, int r25, int r26, int r27, android.graphics.Paint r28, android.graphics.Canvas r29) {
        /*
            Method dump skipped, instructions count: 570
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: O2.j.e(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    public static b f(N2.f fVar, int i7) {
        int[] iArr;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13 = 8;
        int i14 = fVar.i(8);
        fVar.s(8);
        int i15 = 2;
        int i16 = i7 - 2;
        int i17 = 0;
        int[] iArr2 = {0, -1, -16777216, -8421505};
        int[] b7 = b();
        int[] c5 = c();
        while (i16 > 0) {
            int i18 = fVar.i(i13);
            int i19 = fVar.i(i13);
            if ((i19 & 128) != 0) {
                iArr = iArr2;
            } else if ((i19 & 64) != 0) {
                iArr = b7;
            } else {
                iArr = c5;
            }
            if ((i19 & 1) != 0) {
                i11 = fVar.i(i13);
                i12 = fVar.i(i13);
                i8 = fVar.i(i13);
                i10 = fVar.i(i13);
                i9 = i16 - 6;
            } else {
                int i20 = fVar.i(4) << 4;
                i8 = fVar.i(4) << 4;
                i9 = i16 - 4;
                i10 = fVar.i(i15) << 6;
                i11 = fVar.i(6) << i15;
                i12 = i20;
            }
            if (i11 == 0) {
                i12 = i17;
                i8 = i12;
                i10 = 255;
            }
            double d = i11;
            double d7 = i12 - 128;
            double d8 = i8 - 128;
            iArr[i18] = d((byte) (255 - (i10 & 255)), H.j((int) ((1.402d * d7) + d), 0, 255), H.j((int) ((d - (0.34414d * d8)) - (d7 * 0.71414d)), 0, 255), H.j((int) ((d8 * 1.772d) + d), 0, 255));
            i16 = i9;
            i17 = 0;
            i14 = i14;
            c5 = c5;
            i13 = 8;
            i15 = 2;
        }
        return new b(i14, iArr2, b7, c5);
    }

    public static d g(N2.f fVar) {
        byte[] bArr;
        int i7 = fVar.i(16);
        fVar.s(4);
        int i8 = fVar.i(2);
        boolean h7 = fVar.h();
        fVar.s(1);
        byte[] bArr2 = H.f;
        if (i8 == 1) {
            fVar.s(fVar.i(8) * 16);
        } else if (i8 == 0) {
            int i9 = fVar.i(16);
            int i10 = fVar.i(16);
            if (i9 > 0) {
                bArr2 = new byte[i9];
                fVar.k(i9, bArr2);
            }
            if (i10 > 0) {
                bArr = new byte[i10];
                fVar.k(i10, bArr);
                return new d(i7, h7, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new d(i7, h7, bArr2, bArr);
    }
}
