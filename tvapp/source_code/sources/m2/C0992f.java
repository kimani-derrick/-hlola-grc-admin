package m2;

import O3.AbstractC0072p;
import O3.AbstractC0080y;
import O3.C;
import O3.E;
import O3.U;
import Z2.AbstractC0156a;
import Z2.H;
import Z2.y;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import e2.C0593J;
import e2.K;
import java.util.Arrays;
/* renamed from: m2.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0992f implements InterfaceC0987a {

    /* renamed from: a  reason: collision with root package name */
    public final E f12413a;

    /* renamed from: b  reason: collision with root package name */
    public final int f12414b;

    public C0992f(int i7, U u7) {
        this.f12414b = i7;
        this.f12413a = u7;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static C0992f c(int i7, y yVar) {
        String str;
        String str2;
        InterfaceC0987a c0989c;
        int i8;
        int i9 = 4;
        AbstractC0072p.c("initialCapacity", 4);
        Object[] objArr = new Object[4];
        int i10 = yVar.f4693c;
        int i11 = 0;
        int i12 = -2;
        int i13 = 0;
        while (yVar.a() > 8) {
            int i14 = yVar.i();
            int i15 = yVar.f4692b + yVar.i();
            yVar.E(i15);
            if (i14 == 1414744396) {
                c0989c = c(yVar.i(), yVar);
            } else {
                C0993g c0993g = null;
                switch (i14) {
                    case 1718776947:
                        if (i12 == 2) {
                            yVar.G(i9);
                            int i16 = yVar.i();
                            int i17 = yVar.i();
                            yVar.G(i9);
                            int i18 = yVar.i();
                            switch (i18) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str2 = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str2 = "video/avc";
                                    break;
                                case 842289229:
                                    str2 = "video/mp42";
                                    break;
                                case 859066445:
                                    str2 = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str2 = "video/mjpeg";
                                    break;
                                default:
                                    str2 = null;
                                    break;
                            }
                            if (str2 == null) {
                                AbstractC0515y1.q(i18, "Ignoring track with unsupported compression ", "StreamFormatChunk");
                            } else {
                                C0593J c0593j = new C0593J();
                                c0593j.f9609p = i16;
                                c0593j.f9610q = i17;
                                c0593j.f9605k = str2;
                                c0993g = new C0993g(new K(c0593j));
                            }
                        } else if (i12 == 1) {
                            int n = yVar.n();
                            if (n == 1) {
                                str = "audio/raw";
                            } else if (n != 85) {
                                if (n == 255) {
                                    str = "audio/mp4a-latm";
                                } else if (n != 8192) {
                                    if (n != 8193) {
                                        str = null;
                                    } else {
                                        str = "audio/vnd.dts";
                                    }
                                } else {
                                    str = "audio/ac3";
                                }
                            } else {
                                str = "audio/mpeg";
                            }
                            if (str == null) {
                                AbstractC0515y1.q(n, "Ignoring track with unsupported format tag ", "StreamFormatChunk");
                            } else {
                                int n7 = yVar.n();
                                int i19 = yVar.i();
                                yVar.G(6);
                                int w7 = H.w(yVar.z());
                                int n8 = yVar.n();
                                byte[] bArr = new byte[n8];
                                yVar.e(bArr, i11, n8);
                                C0593J c0593j2 = new C0593J();
                                c0593j2.f9605k = str;
                                c0593j2.f9617x = n7;
                                c0593j2.f9618y = i19;
                                if ("audio/raw".equals(str) && w7 != 0) {
                                    c0593j2.f9619z = w7;
                                }
                                if ("audio/mp4a-latm".equals(str) && n8 > 0) {
                                    c0593j2.f9607m = E.x(bArr);
                                }
                                c0993g = new C0993g(new K(c0593j2));
                            }
                        } else {
                            AbstractC0156a.K("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + H.C(i12));
                        }
                        c0989c = c0993g;
                        break;
                    case 1751742049:
                        int i20 = yVar.i();
                        yVar.G(8);
                        int i21 = yVar.i();
                        int i22 = yVar.i();
                        yVar.G(i9);
                        yVar.i();
                        yVar.G(12);
                        c0989c = new C0989c(i20, i21, i22);
                        break;
                    case 1752331379:
                        int i23 = yVar.i();
                        yVar.G(12);
                        yVar.i();
                        int i24 = yVar.i();
                        int i25 = yVar.i();
                        yVar.G(i9);
                        int i26 = yVar.i();
                        int i27 = yVar.i();
                        yVar.G(8);
                        c0989c = new C0990d(i23, i24, i25, i26, i27);
                        break;
                    case 1852994675:
                        c0989c = new C0994h(yVar.s(yVar.a(), N3.e.f2497c));
                        break;
                    default:
                        c0989c = c0993g;
                        break;
                }
            }
            if (c0989c != null) {
                if (c0989c.a() == 1752331379) {
                    int i28 = ((C0990d) c0989c).f12399a;
                    if (i28 != 1935960438) {
                        if (i28 != 1935963489) {
                            if (i28 != 1937012852) {
                                AbstractC0156a.K("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(i28));
                                i8 = -1;
                            } else {
                                i8 = 3;
                            }
                            i12 = i8;
                        } else {
                            i12 = 1;
                        }
                    } else {
                        i12 = 2;
                    }
                }
                int i29 = i13 + 1;
                if (objArr.length < i29) {
                    objArr = Arrays.copyOf(objArr, AbstractC0080y.f(objArr.length, i29));
                }
                objArr[i13] = c0989c;
                i13 = i29;
            }
            yVar.F(i15);
            yVar.E(i10);
            i9 = 4;
            i11 = 0;
        }
        return new C0992f(i7, E.o(i13, objArr));
    }

    @Override // m2.InterfaceC0987a
    public final int a() {
        return this.f12414b;
    }

    public final InterfaceC0987a b(Class cls) {
        C listIterator = this.f12413a.listIterator(0);
        while (listIterator.hasNext()) {
            InterfaceC0987a interfaceC0987a = (InterfaceC0987a) listIterator.next();
            if (interfaceC0987a.getClass() == cls) {
                return interfaceC0987a;
            }
        }
        return null;
    }
}
