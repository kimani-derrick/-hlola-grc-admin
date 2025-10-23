package H2;

import Y2.C0148q;
import Y2.InterfaceC0144m;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class j0 implements Y2.K {

    /* renamed from: a  reason: collision with root package name */
    public final C0148q f1097a;

    /* renamed from: b  reason: collision with root package name */
    public final Y2.V f1098b;

    /* renamed from: c  reason: collision with root package name */
    public byte[] f1099c;

    public j0(InterfaceC0144m interfaceC0144m, C0148q c0148q) {
        C0016q.f1156a.getAndIncrement();
        this.f1097a = c0148q;
        this.f1098b = new Y2.V(interfaceC0144m);
    }

    @Override // Y2.K
    public final void a() {
        int i7;
        byte[] bArr;
        Y2.V v5 = this.f1098b;
        v5.f4366r = 0L;
        try {
            v5.c(this.f1097a);
            do {
                i7 = (int) v5.f4366r;
                byte[] bArr2 = this.f1099c;
                if (bArr2 == null) {
                    this.f1099c = new byte[1024];
                } else if (i7 == bArr2.length) {
                    this.f1099c = Arrays.copyOf(bArr2, bArr2.length * 2);
                }
                bArr = this.f1099c;
            } while (v5.r(bArr, i7, bArr.length - i7) != -1);
            p6.d.e(v5);
        } catch (Throwable th) {
            p6.d.e(v5);
            throw th;
        }
    }

    @Override // Y2.K
    public final void b() {
    }
}
