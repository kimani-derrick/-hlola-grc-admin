package a3;

import Z2.AbstractC0156a;
import e2.m0;
import java.util.ArrayList;
import java.util.List;
/* renamed from: a3.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0201a {

    /* renamed from: a  reason: collision with root package name */
    public final List f5009a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5010b;

    /* renamed from: c  reason: collision with root package name */
    public final int f5011c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public final int f5012e;
    public final int f;

    /* renamed from: g  reason: collision with root package name */
    public final int f5013g;

    /* renamed from: h  reason: collision with root package name */
    public final float f5014h;

    /* renamed from: i  reason: collision with root package name */
    public final String f5015i;

    public C0201a(ArrayList arrayList, int i7, int i8, int i9, int i10, int i11, int i12, float f, String str) {
        this.f5009a = arrayList;
        this.f5010b = i7;
        this.f5011c = i8;
        this.d = i9;
        this.f5012e = i10;
        this.f = i11;
        this.f5013g = i12;
        this.f5014h = f;
        this.f5015i = str;
    }

    public static C0201a a(Z2.y yVar) {
        byte[] bArr;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        float f;
        String str;
        try {
            yVar.G(4);
            int u7 = (yVar.u() & 3) + 1;
            if (u7 != 3) {
                ArrayList arrayList = new ArrayList();
                int u8 = yVar.u() & 31;
                int i12 = 0;
                while (true) {
                    bArr = AbstractC0156a.f4614a;
                    if (i12 >= u8) {
                        break;
                    }
                    int z7 = yVar.z();
                    int i13 = yVar.f4692b;
                    yVar.G(z7);
                    byte[] bArr2 = yVar.f4691a;
                    byte[] bArr3 = new byte[z7 + 4];
                    System.arraycopy(bArr, 0, bArr3, 0, 4);
                    System.arraycopy(bArr2, i13, bArr3, 4, z7);
                    arrayList.add(bArr3);
                    i12++;
                }
                int u9 = yVar.u();
                for (int i14 = 0; i14 < u9; i14++) {
                    int z8 = yVar.z();
                    int i15 = yVar.f4692b;
                    yVar.G(z8);
                    byte[] bArr4 = yVar.f4691a;
                    byte[] bArr5 = new byte[z8 + 4];
                    System.arraycopy(bArr, 0, bArr5, 0, 4);
                    System.arraycopy(bArr4, i15, bArr5, 4, z8);
                    arrayList.add(bArr5);
                }
                if (u8 > 0) {
                    Z2.u E4 = AbstractC0156a.E((byte[]) arrayList.get(0), u7, ((byte[]) arrayList.get(0)).length);
                    int i16 = E4.f4672e;
                    int i17 = E4.f;
                    int i18 = E4.n;
                    int i19 = E4.f4680o;
                    int i20 = E4.f4681p;
                    float f7 = E4.f4673g;
                    str = String.format("avc1.%02X%02X%02X", Integer.valueOf(E4.f4669a), Integer.valueOf(E4.f4670b), Integer.valueOf(E4.f4671c));
                    i10 = i19;
                    i11 = i20;
                    f = f7;
                    i7 = i16;
                    i8 = i17;
                    i9 = i18;
                } else {
                    i7 = -1;
                    i8 = -1;
                    i9 = -1;
                    i10 = -1;
                    i11 = -1;
                    f = 1.0f;
                    str = null;
                }
                return new C0201a(arrayList, u7, i7, i8, i9, i10, i11, f, str);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e3) {
            throw m0.a("Error parsing AVC config", e3);
        }
    }
}
