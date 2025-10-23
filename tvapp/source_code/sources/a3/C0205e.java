package a3;

import Z2.AbstractC0156a;
import e2.m0;
import java.util.Collections;
import java.util.List;
/* renamed from: a3.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0205e {

    /* renamed from: a  reason: collision with root package name */
    public final List f5037a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5038b;

    /* renamed from: c  reason: collision with root package name */
    public final int f5039c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public final int f5040e;
    public final float f;

    /* renamed from: g  reason: collision with root package name */
    public final String f5041g;

    public C0205e(List list, int i7, int i8, int i9, int i10, float f, String str) {
        this.f5037a = list;
        this.f5038b = i7;
        this.f5039c = i8;
        this.d = i9;
        this.f5040e = i10;
        this.f = f;
        this.f5041g = str;
    }

    public static C0205e a(Z2.y yVar) {
        List singletonList;
        int i7;
        int i8;
        try {
            yVar.G(21);
            int u7 = yVar.u() & 3;
            int u8 = yVar.u();
            int i9 = yVar.f4692b;
            int i10 = 0;
            int i11 = 0;
            for (int i12 = 0; i12 < u8; i12++) {
                yVar.G(1);
                int z7 = yVar.z();
                for (int i13 = 0; i13 < z7; i13++) {
                    int z8 = yVar.z();
                    i11 += z8 + 4;
                    yVar.G(z8);
                }
            }
            yVar.F(i9);
            byte[] bArr = new byte[i11];
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            float f = 1.0f;
            String str = null;
            int i17 = 0;
            int i18 = 0;
            while (i17 < u8) {
                int u9 = yVar.u() & 63;
                int z9 = yVar.z();
                int i19 = i10;
                while (i19 < z9) {
                    int z10 = yVar.z();
                    int i20 = u8;
                    System.arraycopy(AbstractC0156a.d, i10, bArr, i18, 4);
                    int i21 = i18 + 4;
                    System.arraycopy(yVar.f4691a, yVar.f4692b, bArr, i21, z10);
                    if (u9 == 33 && i19 == 0) {
                        Z2.s D6 = AbstractC0156a.D(bArr, i21, i21 + z10);
                        int i22 = D6.f4664j;
                        i15 = D6.f4665k;
                        i16 = D6.f4666l;
                        f = D6.f4663i;
                        i7 = u9;
                        i8 = z9;
                        i14 = i22;
                        str = AbstractC0156a.d(D6.f4657a, D6.f4658b, D6.f4659c, D6.d, D6.f4660e, D6.f);
                    } else {
                        i7 = u9;
                        i8 = z9;
                    }
                    i18 = i21 + z10;
                    yVar.G(z10);
                    i19++;
                    u8 = i20;
                    u9 = i7;
                    z9 = i8;
                    i10 = 0;
                }
                i17++;
                i10 = 0;
            }
            if (i11 == 0) {
                singletonList = Collections.emptyList();
            } else {
                singletonList = Collections.singletonList(bArr);
            }
            return new C0205e(singletonList, u7 + 1, i14, i15, i16, f, str);
        } catch (ArrayIndexOutOfBoundsException e3) {
            throw m0.a("Error parsing HEVC config", e3);
        }
    }
}
