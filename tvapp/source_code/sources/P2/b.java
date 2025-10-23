package P2;

import M2.g;
import M2.h;
import N2.j;
import Z2.H;
import Z2.y;
import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.Inflater;
/* loaded from: classes.dex */
public final class b extends g {

    /* renamed from: m  reason: collision with root package name */
    public final y f2794m = new y();
    public final y n = new y();

    /* renamed from: o  reason: collision with root package name */
    public final a f2795o = new a();

    /* renamed from: p  reason: collision with root package name */
    public Inflater f2796p;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // M2.g
    public final h f(int i7, boolean z7, byte[] bArr) {
        char c5;
        M2.b bVar;
        int i8;
        M2.b bVar2;
        y yVar;
        int i9;
        int i10;
        int u7;
        int i11;
        y yVar2;
        int i12;
        int w7;
        y yVar3 = this.f2794m;
        yVar3.D(i7, bArr);
        char c6 = 255;
        if (yVar3.a() > 0 && (yVar3.f4691a[yVar3.f4692b] & 255) == 120) {
            if (this.f2796p == null) {
                this.f2796p = new Inflater();
            }
            Inflater inflater = this.f2796p;
            y yVar4 = this.n;
            if (H.F(yVar3, yVar4, inflater)) {
                yVar3.D(yVar4.f4693c, yVar4.f4691a);
            }
        }
        a aVar = this.f2795o;
        int i13 = 0;
        aVar.d = 0;
        aVar.f2790e = 0;
        aVar.f = 0;
        aVar.f2791g = 0;
        aVar.f2792h = 0;
        aVar.f2793i = 0;
        y yVar5 = aVar.f2787a;
        yVar5.C(0);
        aVar.f2789c = false;
        ArrayList arrayList = new ArrayList();
        while (yVar3.a() >= 3) {
            int i14 = yVar3.f4693c;
            int u8 = yVar3.u();
            int z8 = yVar3.z();
            int i15 = yVar3.f4692b + z8;
            if (i15 > i14) {
                yVar3.F(i14);
                yVar = yVar3;
                c5 = c6;
                i8 = i13;
                bVar2 = null;
            } else {
                int[] iArr = aVar.f2788b;
                if (u8 != 128) {
                    switch (u8) {
                        case 20:
                            if (z8 % 5 == 2) {
                                yVar3.G(2);
                                Arrays.fill(iArr, i13);
                                int i16 = z8 / 5;
                                int i17 = i13;
                                while (i17 < i16) {
                                    int u9 = yVar3.u();
                                    int u10 = yVar3.u();
                                    double d = u10;
                                    double u11 = yVar3.u() - 128;
                                    double u12 = yVar3.u() - 128;
                                    iArr[u9] = (H.j((int) ((1.402d * u11) + d), 0, 255) << 16) | (yVar3.u() << 24) | (H.j((int) ((d - (0.34414d * u12)) - (u11 * 0.71414d)), 0, 255) << 8) | H.j((int) ((u12 * 1.772d) + d), 0, 255);
                                    i17++;
                                    c6 = 255;
                                    yVar3 = yVar3;
                                }
                                yVar2 = yVar3;
                                c5 = c6;
                                aVar.f2789c = true;
                                break;
                            }
                            yVar2 = yVar3;
                            c5 = c6;
                            break;
                        case 21:
                            if (z8 >= 4) {
                                yVar3.G(3);
                                if ((128 & yVar3.u()) != 0) {
                                    i12 = 1;
                                } else {
                                    i12 = i13;
                                }
                                int i18 = z8 - 4;
                                if (i12 != 0) {
                                    if (i18 >= 7 && (w7 = yVar3.w()) >= 4) {
                                        aVar.f2792h = yVar3.z();
                                        aVar.f2793i = yVar3.z();
                                        yVar5.C(w7 - 4);
                                        i18 = z8 - 11;
                                    }
                                }
                                int i19 = yVar5.f4692b;
                                int i20 = yVar5.f4693c;
                                if (i19 < i20 && i18 > 0) {
                                    int min = Math.min(i18, i20 - i19);
                                    yVar3.e(yVar5.f4691a, i19, min);
                                    yVar5.F(i19 + min);
                                }
                            }
                            yVar2 = yVar3;
                            c5 = c6;
                            break;
                        case 22:
                            if (z8 >= 19) {
                                aVar.d = yVar3.z();
                                aVar.f2790e = yVar3.z();
                                yVar3.G(11);
                                aVar.f = yVar3.z();
                                aVar.f2791g = yVar3.z();
                            }
                            yVar2 = yVar3;
                            c5 = c6;
                            break;
                        default:
                            yVar2 = yVar3;
                            c5 = c6;
                            break;
                    }
                    yVar = yVar2;
                    i8 = 0;
                    bVar2 = null;
                } else {
                    y yVar6 = yVar3;
                    c5 = c6;
                    if (aVar.d != 0 && aVar.f2790e != 0 && aVar.f2792h != 0 && aVar.f2793i != 0 && (i9 = yVar5.f4693c) != 0 && yVar5.f4692b == i9 && aVar.f2789c) {
                        yVar5.F(0);
                        int i21 = aVar.f2792h * aVar.f2793i;
                        int[] iArr2 = new int[i21];
                        int i22 = 0;
                        while (i22 < i21) {
                            int u13 = yVar5.u();
                            if (u13 != 0) {
                                i10 = i22 + 1;
                                iArr2[i22] = iArr[u13];
                            } else {
                                int u14 = yVar5.u();
                                if (u14 != 0) {
                                    if ((u14 & 64) == 0) {
                                        u7 = u14 & 63;
                                    } else {
                                        u7 = ((u14 & 63) << 8) | yVar5.u();
                                    }
                                    if ((u14 & 128) == 0) {
                                        i11 = 0;
                                    } else {
                                        i11 = iArr[yVar5.u()];
                                    }
                                    i10 = u7 + i22;
                                    Arrays.fill(iArr2, i22, i10, i11);
                                }
                            }
                            i22 = i10;
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(iArr2, aVar.f2792h, aVar.f2793i, Bitmap.Config.ARGB_8888);
                        float f = aVar.d;
                        float f7 = aVar.f2790e;
                        bVar = new M2.b(null, null, null, createBitmap, aVar.f2791g / f7, 0, 0, aVar.f / f, 0, Integer.MIN_VALUE, -3.4028235E38f, aVar.f2792h / f, aVar.f2793i / f7, false, -16777216, Integer.MIN_VALUE, 0.0f);
                    } else {
                        bVar = null;
                    }
                    i8 = 0;
                    aVar.d = 0;
                    aVar.f2790e = 0;
                    aVar.f = 0;
                    aVar.f2791g = 0;
                    aVar.f2792h = 0;
                    aVar.f2793i = 0;
                    yVar5.C(0);
                    aVar.f2789c = false;
                    bVar2 = bVar;
                    yVar = yVar6;
                }
                yVar.F(i15);
            }
            if (bVar2 != null) {
                arrayList.add(bVar2);
            }
            i13 = i8;
            c6 = c5;
            yVar3 = yVar;
        }
        return new j(2, Collections.unmodifiableList(arrayList));
    }
}
