package K2;

import H2.c0;
import e2.C0593J;
import e2.K;
import java.util.Map;
import k2.C0957v;
import x2.C1461c;
import x2.InterfaceC1460b;
/* loaded from: classes.dex */
public final class q extends c0 {

    /* renamed from: H  reason: collision with root package name */
    public final Map f1760H;

    /* renamed from: I  reason: collision with root package name */
    public j2.i f1761I;

    public q(Y2.r rVar, j2.q qVar, j2.n nVar, Map map) {
        super(rVar, qVar, nVar);
        this.f1760H = map;
    }

    @Override // H2.c0, k2.w
    public final void c(long j7, int i7, int i8, int i9, C0957v c0957v) {
        super.c(j7, i7, i8, i9, c0957v);
    }

    @Override // H2.c0
    public final K l(K k5) {
        j2.i iVar;
        j2.i iVar2 = this.f1761I;
        if (iVar2 == null) {
            iVar2 = k5.f9658E;
        }
        if (iVar2 != null && (iVar = (j2.i) this.f1760H.get(iVar2.f11825s)) != null) {
            iVar2 = iVar;
        }
        C1461c c1461c = k5.f9685z;
        C1461c c1461c2 = null;
        if (c1461c != null) {
            InterfaceC1460b[] interfaceC1460bArr = c1461c.f16206q;
            int length = interfaceC1460bArr.length;
            int i7 = 0;
            while (true) {
                if (i7 < length) {
                    InterfaceC1460b interfaceC1460b = interfaceC1460bArr[i7];
                    if ((interfaceC1460b instanceof C2.m) && "com.apple.streaming.transportStreamTimestamp".equals(((C2.m) interfaceC1460b).f414r)) {
                        break;
                    }
                    i7++;
                } else {
                    i7 = -1;
                    break;
                }
            }
            if (i7 != -1) {
                if (length != 1) {
                    InterfaceC1460b[] interfaceC1460bArr2 = new InterfaceC1460b[length - 1];
                    for (int i8 = 0; i8 < length; i8++) {
                        if (i8 != i7) {
                            interfaceC1460bArr2[i8 < i7 ? i8 : i8 - 1] = interfaceC1460bArr[i8];
                        }
                    }
                    c1461c2 = new C1461c(interfaceC1460bArr2);
                }
            }
            if (iVar2 == k5.f9658E || c1461c != k5.f9685z) {
                C0593J a7 = k5.a();
                a7.n = iVar2;
                a7.f9603i = c1461c;
                k5 = a7.a();
            }
            return super.l(k5);
        }
        c1461c = c1461c2;
        if (iVar2 == k5.f9658E) {
        }
        C0593J a72 = k5.a();
        a72.n = iVar2;
        a72.f9603i = c1461c;
        k5 = a72.a();
        return super.l(k5);
    }
}
