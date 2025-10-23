package o2;

import H2.o0;
import N2.f;
import Z2.y;
import e2.C0593J;
import e2.K;
import g2.AbstractC0710a;
import g2.P;
import java.util.Collections;
import k2.w;
/* renamed from: o2.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1063a extends P1.c {

    /* renamed from: u  reason: collision with root package name */
    public static final int[] f12890u = {5512, 11025, 22050, 44100};

    /* renamed from: r  reason: collision with root package name */
    public boolean f12891r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f12892s;

    /* renamed from: t  reason: collision with root package name */
    public int f12893t;

    public final boolean E(y yVar) {
        String str;
        C0593J c0593j;
        int i7;
        if (!this.f12891r) {
            int u7 = yVar.u();
            int i8 = (u7 >> 4) & 15;
            this.f12893t = i8;
            w wVar = (w) this.f2765q;
            if (i8 == 2) {
                i7 = f12890u[(u7 >> 2) & 3];
                c0593j = new C0593J();
                c0593j.f9605k = "audio/mpeg";
                c0593j.f9617x = 1;
            } else if (i8 != 7 && i8 != 8) {
                if (i8 != 10) {
                    throw new o0("Audio format not supported: " + this.f12893t);
                }
                this.f12891r = true;
            } else {
                if (i8 == 7) {
                    str = "audio/g711-alaw";
                } else {
                    str = "audio/g711-mlaw";
                }
                c0593j = new C0593J();
                c0593j.f9605k = str;
                c0593j.f9617x = 1;
                i7 = 8000;
            }
            c0593j.f9618y = i7;
            wVar.e(c0593j.a());
            this.f12892s = true;
            this.f12891r = true;
        } else {
            yVar.G(1);
        }
        return true;
    }

    public final boolean F(long j7, y yVar) {
        int i7 = this.f12893t;
        w wVar = (w) this.f2765q;
        if (i7 == 2) {
            int a7 = yVar.a();
            wVar.d(a7, yVar);
            ((w) this.f2765q).c(j7, 1, a7, 0, null);
            return true;
        }
        int u7 = yVar.u();
        if (u7 == 0 && !this.f12892s) {
            int a8 = yVar.a();
            byte[] bArr = new byte[a8];
            yVar.e(bArr, 0, a8);
            P h7 = AbstractC0710a.h(new f(a8, bArr), false);
            C0593J c0593j = new C0593J();
            c0593j.f9605k = "audio/mp4a-latm";
            c0593j.f9602h = (String) h7.f10611c;
            c0593j.f9617x = h7.f10610b;
            c0593j.f9618y = h7.f10609a;
            c0593j.f9607m = Collections.singletonList(bArr);
            wVar.e(new K(c0593j));
            this.f12892s = true;
            return false;
        } else if (this.f12893t == 10 && u7 != 1) {
            return false;
        } else {
            int a9 = yVar.a();
            wVar.d(a9, yVar);
            ((w) this.f2765q).c(j7, 1, a9, 0, null);
            return true;
        }
    }
}
