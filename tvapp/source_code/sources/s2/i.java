package s2;

import Z2.H;
import Z2.y;
import k2.w;
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final w f13601a;
    public t d;

    /* renamed from: e  reason: collision with root package name */
    public g f13604e;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public int f13605g;

    /* renamed from: h  reason: collision with root package name */
    public int f13606h;

    /* renamed from: i  reason: collision with root package name */
    public int f13607i;

    /* renamed from: l  reason: collision with root package name */
    public boolean f13610l;

    /* renamed from: b  reason: collision with root package name */
    public final s f13602b = new s();

    /* renamed from: c  reason: collision with root package name */
    public final y f13603c = new y();

    /* renamed from: j  reason: collision with root package name */
    public final y f13608j = new y(1);

    /* renamed from: k  reason: collision with root package name */
    public final y f13609k = new y();

    public i(w wVar, t tVar, g gVar) {
        this.f13601a = wVar;
        this.d = tVar;
        this.f13604e = gVar;
        this.d = tVar;
        this.f13604e = gVar;
        wVar.e(tVar.f13700a.f);
        d();
    }

    public final r a() {
        if (!this.f13610l) {
            return null;
        }
        s sVar = this.f13602b;
        g gVar = sVar.f13686a;
        int i7 = H.f4603a;
        int i8 = gVar.f13595a;
        r rVar = sVar.f13696m;
        if (rVar == null) {
            r[] rVarArr = this.d.f13700a.f13681k;
            if (rVarArr == null) {
                rVar = null;
            } else {
                rVar = rVarArr[i8];
            }
        }
        if (rVar == null || !rVar.f13682a) {
            return null;
        }
        return rVar;
    }

    public final boolean b() {
        this.f++;
        if (!this.f13610l) {
            return false;
        }
        int i7 = this.f13605g + 1;
        this.f13605g = i7;
        int[] iArr = this.f13602b.f13690g;
        int i8 = this.f13606h;
        if (i7 != iArr[i8]) {
            return true;
        }
        this.f13606h = i8 + 1;
        this.f13605g = 0;
        return false;
    }

    public final int c(int i7, int i8) {
        y yVar;
        boolean z7;
        boolean z8;
        int i9;
        r a7 = a();
        if (a7 == null) {
            return 0;
        }
        s sVar = this.f13602b;
        int i10 = a7.d;
        if (i10 != 0) {
            yVar = sVar.n;
        } else {
            int i11 = H.f4603a;
            byte[] bArr = a7.f13685e;
            int length = bArr.length;
            y yVar2 = this.f13609k;
            yVar2.D(length, bArr);
            i10 = bArr.length;
            yVar = yVar2;
        }
        int i12 = this.f;
        if (sVar.f13694k && sVar.f13695l[i12]) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (!z7 && i8 == 0) {
            z8 = false;
        } else {
            z8 = true;
        }
        y yVar3 = this.f13608j;
        byte[] bArr2 = yVar3.f4691a;
        if (z8) {
            i9 = 128;
        } else {
            i9 = 0;
        }
        bArr2[0] = (byte) (i9 | i10);
        yVar3.F(0);
        w wVar = this.f13601a;
        wVar.b(1, yVar3);
        wVar.b(i10, yVar);
        if (!z8) {
            return i10 + 1;
        }
        y yVar4 = this.f13603c;
        if (!z7) {
            yVar4.C(8);
            byte[] bArr3 = yVar4.f4691a;
            bArr3[0] = 0;
            bArr3[1] = 1;
            bArr3[2] = (byte) 0;
            bArr3[3] = (byte) (i8 & 255);
            bArr3[4] = (byte) ((i7 >> 24) & 255);
            bArr3[5] = (byte) ((i7 >> 16) & 255);
            bArr3[6] = (byte) ((i7 >> 8) & 255);
            bArr3[7] = (byte) (i7 & 255);
            wVar.b(8, yVar4);
            return i10 + 9;
        }
        y yVar5 = sVar.n;
        int z9 = yVar5.z();
        yVar5.G(-2);
        int i13 = (z9 * 6) + 2;
        if (i8 != 0) {
            yVar4.C(i13);
            byte[] bArr4 = yVar4.f4691a;
            yVar5.e(bArr4, 0, i13);
            int i14 = (((bArr4[2] & 255) << 8) | (bArr4[3] & 255)) + i8;
            bArr4[2] = (byte) ((i14 >> 8) & 255);
            bArr4[3] = (byte) (i14 & 255);
        } else {
            yVar4 = yVar5;
        }
        wVar.b(i13, yVar4);
        return i10 + 1 + i13;
    }

    public final void d() {
        s sVar = this.f13602b;
        sVar.d = 0;
        sVar.f13698p = 0L;
        sVar.f13699q = false;
        sVar.f13694k = false;
        sVar.f13697o = false;
        sVar.f13696m = null;
        this.f = 0;
        this.f13606h = 0;
        this.f13605g = 0;
        this.f13607i = 0;
        this.f13610l = false;
    }
}
