package u0;

import U5.n;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import java.io.File;
import t3.C1251o;
import t3.InterfaceC1243g;
import v4.InterfaceC1325c;
import v6.C1344i;
import v6.w;
import w2.InterfaceC1401w;
/* loaded from: classes.dex */
public final class j implements InterfaceC1243g, InterfaceC1325c, InterfaceC1401w {
    public static final boolean i(w wVar) {
        w wVar2 = w6.c.f16104c;
        wVar.getClass();
        C1344i c1344i = w6.i.f16124a;
        C1344i c1344i2 = wVar.f15417q;
        int k5 = C1344i.k(c1344i2, c1344i);
        if (k5 == -1) {
            k5 = C1344i.k(c1344i2, w6.i.f16125b);
        }
        if (k5 != -1) {
            c1344i2 = C1344i.o(c1344i2, k5 + 1, 0, 2);
        } else if (wVar.f() != null && c1344i2.d() == 2) {
            c1344i2 = C1344i.f15389t;
        }
        return !n.V(c1344i2.q(), ".class", true);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, v6.f] */
    public static w j(String str, boolean z7) {
        M5.g.f(str, "<this>");
        C1344i c1344i = w6.i.f16124a;
        ?? obj = new Object();
        obj.o0(str);
        return w6.i.d(obj, z7);
    }

    public static w k(File file) {
        String str = w.f15416r;
        M5.g.f(file, "<this>");
        String file2 = file.toString();
        M5.g.e(file2, "toString()");
        return j(file2, false);
    }

    @Override // t3.InterfaceC1243g
    public C1251o A(Object obj) {
        Void r12 = (Void) obj;
        return m3.g.m(Boolean.TRUE);
    }

    @Override // w2.InterfaceC1401w
    public boolean a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // v4.InterfaceC1325c
    public String c() {
        return null;
    }

    @Override // w2.InterfaceC1401w
    public int e() {
        return MediaCodecList.getCodecCount();
    }

    @Override // w2.InterfaceC1401w
    public MediaCodecInfo f(int i7) {
        return MediaCodecList.getCodecInfoAt(i7);
    }

    @Override // w2.InterfaceC1401w
    public boolean g(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        if ("secure-playback".equals(str) && "video/avc".equals(str2)) {
            return true;
        }
        return false;
    }

    @Override // w2.InterfaceC1401w
    public boolean h() {
        return false;
    }

    @Override // v4.InterfaceC1325c
    public void b() {
    }

    @Override // v4.InterfaceC1325c
    public void d(long j7, String str) {
    }
}
