package h6;

import java.util.List;
import java.util.regex.Pattern;
import v6.C1341f;
import v6.C1344i;
import v6.InterfaceC1342g;
/* loaded from: classes.dex */
public final class x extends E {

    /* renamed from: e  reason: collision with root package name */
    public static final v f11218e;
    public static final v f;

    /* renamed from: g  reason: collision with root package name */
    public static final byte[] f11219g;

    /* renamed from: h  reason: collision with root package name */
    public static final byte[] f11220h;

    /* renamed from: i  reason: collision with root package name */
    public static final byte[] f11221i;

    /* renamed from: a  reason: collision with root package name */
    public final C1344i f11222a;

    /* renamed from: b  reason: collision with root package name */
    public final List f11223b;

    /* renamed from: c  reason: collision with root package name */
    public final v f11224c;
    public long d;

    static {
        Pattern pattern = v.d;
        f11218e = p6.l.r("multipart/mixed");
        p6.l.r("multipart/alternative");
        p6.l.r("multipart/digest");
        p6.l.r("multipart/parallel");
        f = p6.l.r("multipart/form-data");
        f11219g = new byte[]{58, 32};
        f11220h = new byte[]{13, 10};
        f11221i = new byte[]{45, 45};
    }

    public x(C1344i c1344i, v vVar, List list) {
        M5.g.f(c1344i, "boundaryByteString");
        M5.g.f(vVar, "type");
        this.f11222a = c1344i;
        this.f11223b = list;
        Pattern pattern = v.d;
        this.f11224c = p6.l.r(vVar + "; boundary=" + c1344i.q());
        this.d = -1L;
    }

    @Override // h6.E
    public final long a() {
        long j7 = this.d;
        if (j7 == -1) {
            long d = d(null, true);
            this.d = d;
            return d;
        }
        return j7;
    }

    @Override // h6.E
    public final v b() {
        return this.f11224c;
    }

    @Override // h6.E
    public final void c(InterfaceC1342g interfaceC1342g) {
        d(interfaceC1342g, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long d(InterfaceC1342g interfaceC1342g, boolean z7) {
        C1341f c1341f;
        InterfaceC1342g interfaceC1342g2;
        if (z7) {
            Object obj = new Object();
            c1341f = obj;
            interfaceC1342g2 = obj;
        } else {
            c1341f = null;
            interfaceC1342g2 = interfaceC1342g;
        }
        List list = this.f11223b;
        int size = list.size();
        long j7 = 0;
        int i7 = 0;
        while (true) {
            C1344i c1344i = this.f11222a;
            byte[] bArr = f11221i;
            byte[] bArr2 = f11220h;
            if (i7 < size) {
                int i8 = i7 + 1;
                w wVar = (w) list.get(i7);
                r rVar = wVar.f11216a;
                M5.g.c(interfaceC1342g2);
                interfaceC1342g2.e(bArr);
                interfaceC1342g2.i(c1344i);
                interfaceC1342g2.e(bArr2);
                if (rVar != null) {
                    int size2 = rVar.size();
                    for (int i9 = 0; i9 < size2; i9++) {
                        interfaceC1342g2.G(rVar.f(i9)).e(f11219g).G(rVar.h(i9)).e(bArr2);
                    }
                }
                E e3 = wVar.f11217b;
                v b7 = e3.b();
                if (b7 != null) {
                    interfaceC1342g2.G("Content-Type: ").G(b7.f11213a).e(bArr2);
                }
                long a7 = e3.a();
                if (a7 != -1) {
                    interfaceC1342g2.G("Content-Length: ").I(a7).e(bArr2);
                } else if (z7) {
                    M5.g.c(c1341f);
                    c1341f.b();
                    return -1L;
                }
                interfaceC1342g2.e(bArr2);
                if (z7) {
                    j7 += a7;
                } else {
                    e3.c(interfaceC1342g2);
                }
                interfaceC1342g2.e(bArr2);
                i7 = i8;
            } else {
                M5.g.c(interfaceC1342g2);
                interfaceC1342g2.e(bArr);
                interfaceC1342g2.i(c1344i);
                interfaceC1342g2.e(bArr);
                interfaceC1342g2.e(bArr2);
                if (z7) {
                    M5.g.c(c1341f);
                    long j8 = j7 + c1341f.f15388r;
                    c1341f.b();
                    return j8;
                }
                return j7;
            }
        }
    }
}
