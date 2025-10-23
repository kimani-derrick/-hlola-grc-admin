package u4;

import Z2.AbstractC0156a;
import Z2.H;
import a.AbstractC0189a;
import android.media.MediaCodec;
import java.io.IOException;
import t3.C1251o;
import t3.InterfaceC1237a;
import v6.C1344i;
import w2.C1387i;
import w2.InterfaceC1388j;
import w2.InterfaceC1389k;
/* renamed from: u4.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1288l implements InterfaceC1237a, InterfaceC1388j, D5.h {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f15008q;

    public /* synthetic */ C1288l(int i7) {
        this.f15008q = i7;
    }

    public static MediaCodec a(C1387i c1387i) {
        c1387i.f15776a.getClass();
        String str = c1387i.f15776a.f15781a;
        AbstractC0156a.b("createCodec:" + str);
        MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
        AbstractC0156a.s();
        return createByCodecName;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x007a, code lost:
        r11 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static v6.C1344i b(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u4.C1288l.b(java.lang.String):v6.i");
    }

    public static C1344i c(String str) {
        if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i7 = 0; i7 < length; i7++) {
                int i8 = i7 * 2;
                bArr[i7] = (byte) (w6.h.a(str.charAt(i8 + 1)) + (w6.h.a(str.charAt(i8)) << 4));
            }
            return new C1344i(bArr);
        }
        throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
    }

    public static C1344i e(String str) {
        M5.g.f(str, "<this>");
        byte[] bytes = str.getBytes(U5.a.f3474a);
        M5.g.e(bytes, "this as java.lang.String).getBytes(charset)");
        C1344i c1344i = new C1344i(bytes);
        c1344i.f15392s = str;
        return c1344i;
    }

    public static C1344i f(byte[] bArr) {
        C1344i c1344i = C1344i.f15389t;
        int length = bArr.length;
        AbstractC0189a.m(bArr.length, 0, length);
        return new C1344i(A5.j.S(bArr, 0, length));
    }

    @Override // t3.InterfaceC1237a
    public /* bridge */ /* synthetic */ Object d(C1251o c1251o) {
        return null;
    }

    @Override // w2.InterfaceC1388j
    public InterfaceC1389k k(C1387i c1387i) {
        switch (this.f15008q) {
            case 3:
                int i7 = H.f4603a;
                if (i7 >= 23 && i7 >= 31) {
                    int h7 = Z2.r.h(c1387i.f15778c.f9655B);
                    AbstractC0156a.x("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + H.C(h7));
                    return new t2.i(h7).k(c1387i);
                }
                return new C1288l(4).k(c1387i);
            default:
                MediaCodec mediaCodec = null;
                try {
                    mediaCodec = a(c1387i);
                    AbstractC0156a.b("configureCodec");
                    mediaCodec.configure(c1387i.f15777b, c1387i.d, c1387i.f15779e, 0);
                    AbstractC0156a.s();
                    AbstractC0156a.b("startCodec");
                    mediaCodec.start();
                    AbstractC0156a.s();
                    return new g5.b(mediaCodec);
                } catch (IOException | RuntimeException e3) {
                    if (mediaCodec != null) {
                        mediaCodec.release();
                    }
                    throw e3;
                }
        }
    }
}
