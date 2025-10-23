package y2;

import N2.f;
import N3.e;
import Z2.y;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import x2.C1461c;
import x2.C1463e;
import z2.C1513a;
/* renamed from: y2.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1495b extends h4.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f16371a;

    public static C1513a J(y yVar) {
        String p3 = yVar.p();
        p3.getClass();
        String p5 = yVar.p();
        p5.getClass();
        return new C1513a(p3, p5, yVar.o(), yVar.o(), Arrays.copyOfRange(yVar.f4691a, yVar.f4692b, yVar.f4693c));
    }

    @Override // h4.b
    public final C1461c q(C1463e c1463e, ByteBuffer byteBuffer) {
        switch (this.f16371a) {
            case 0:
                if (byteBuffer.get() == 116) {
                    f fVar = new f(byteBuffer.limit(), byteBuffer.array());
                    int i7 = 12;
                    fVar.s(12);
                    int f = (fVar.f() + fVar.i(12)) - 4;
                    fVar.s(44);
                    fVar.t(fVar.i(12));
                    fVar.s(16);
                    ArrayList arrayList = new ArrayList();
                    while (fVar.f() < f) {
                        fVar.s(48);
                        int i8 = fVar.i(8);
                        fVar.s(4);
                        int f7 = fVar.f() + fVar.i(i7);
                        String str = null;
                        String str2 = null;
                        while (fVar.f() < f7) {
                            int i9 = fVar.i(8);
                            int i10 = fVar.i(8);
                            int f8 = fVar.f() + i10;
                            if (i9 == 2) {
                                int i11 = fVar.i(16);
                                fVar.s(8);
                                if (i11 == 3) {
                                    while (fVar.f() < f8) {
                                        int i12 = fVar.i(8);
                                        Charset charset = e.f2495a;
                                        byte[] bArr = new byte[i12];
                                        fVar.k(i12, bArr);
                                        String str3 = new String(bArr, charset);
                                        int i13 = fVar.i(8);
                                        for (int i14 = 0; i14 < i13; i14++) {
                                            fVar.t(fVar.i(8));
                                        }
                                        str = str3;
                                    }
                                }
                            } else if (i9 == 21) {
                                Charset charset2 = e.f2495a;
                                byte[] bArr2 = new byte[i10];
                                fVar.k(i10, bArr2);
                                str2 = new String(bArr2, charset2);
                            }
                            fVar.p(f8 * 8);
                        }
                        fVar.p(f7 * 8);
                        if (str != null && str2 != null) {
                            arrayList.add(new C1494a(str.concat(str2), i8));
                        }
                        i7 = 12;
                    }
                    if (!arrayList.isEmpty()) {
                        return new C1461c(arrayList);
                    }
                }
                return null;
            default:
                return new C1461c(J(new y(byteBuffer.limit(), byteBuffer.array())));
        }
    }
}
