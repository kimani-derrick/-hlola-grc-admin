package K2;

import Y2.InterfaceC0141j;
import Z2.AbstractC0156a;
import Z2.H;
import Z2.y;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import e2.C0593J;
import e2.K;
import java.io.EOFException;
import java.util.Arrays;
import k2.C0957v;
import k2.w;
import y2.C1495b;
import z2.C1513a;
/* loaded from: classes.dex */
public final class p implements w {

    /* renamed from: g  reason: collision with root package name */
    public static final K f1754g;

    /* renamed from: h  reason: collision with root package name */
    public static final K f1755h;

    /* renamed from: a  reason: collision with root package name */
    public final C1495b f1756a = new C1495b(1);

    /* renamed from: b  reason: collision with root package name */
    public final w f1757b;

    /* renamed from: c  reason: collision with root package name */
    public final K f1758c;
    public K d;

    /* renamed from: e  reason: collision with root package name */
    public byte[] f1759e;
    public int f;

    static {
        C0593J c0593j = new C0593J();
        c0593j.f9605k = "application/id3";
        f1754g = c0593j.a();
        C0593J c0593j2 = new C0593J();
        c0593j2.f9605k = "application/x-emsg";
        f1755h = c0593j2.a();
    }

    public p(w wVar, int i7) {
        K k5;
        this.f1757b = wVar;
        if (i7 != 1) {
            if (i7 == 3) {
                k5 = f1755h;
            } else {
                throw new IllegalArgumentException(AbstractC0515y1.l("Unknown metadataType: ", i7));
            }
        } else {
            k5 = f1754g;
        }
        this.f1758c = k5;
        this.f1759e = new byte[0];
        this.f = 0;
    }

    @Override // k2.w
    public final int a(InterfaceC0141j interfaceC0141j, int i7, boolean z7) {
        return f(interfaceC0141j, i7, z7);
    }

    @Override // k2.w
    public final void b(int i7, y yVar) {
        int i8 = this.f + i7;
        byte[] bArr = this.f1759e;
        if (bArr.length < i8) {
            this.f1759e = Arrays.copyOf(bArr, (i8 / 2) + i8);
        }
        yVar.e(this.f1759e, this.f, i7);
        this.f += i7;
    }

    @Override // k2.w
    public final void c(long j7, int i7, int i8, int i9, C0957v c0957v) {
        this.d.getClass();
        int i10 = this.f - i9;
        y yVar = new y(Arrays.copyOfRange(this.f1759e, i10 - i8, i10));
        byte[] bArr = this.f1759e;
        System.arraycopy(bArr, i10, bArr, 0, i9);
        this.f = i9;
        String str = this.d.f9655B;
        K k5 = this.f1758c;
        if (!H.a(str, k5.f9655B)) {
            if ("application/x-emsg".equals(this.d.f9655B)) {
                this.f1756a.getClass();
                C1513a J6 = C1495b.J(yVar);
                K f = J6.f();
                String str2 = k5.f9655B;
                if (f != null && H.a(str2, f.f9655B)) {
                    byte[] b7 = J6.b();
                    b7.getClass();
                    yVar = new y(b7);
                } else {
                    K f7 = J6.f();
                    AbstractC0156a.K("HlsSampleStreamWrapper", "Ignoring EMSG. Expected it to contain wrapped " + str2 + " but actual wrapped format: " + f7);
                    return;
                }
            } else {
                AbstractC0156a.K("HlsSampleStreamWrapper", "Ignoring sample for unsupported format: " + this.d.f9655B);
                return;
            }
        }
        int a7 = yVar.a();
        this.f1757b.d(a7, yVar);
        this.f1757b.c(j7, i7, a7, i9, c0957v);
    }

    @Override // k2.w
    public final void d(int i7, y yVar) {
        b(i7, yVar);
    }

    @Override // k2.w
    public final void e(K k5) {
        this.d = k5;
        this.f1757b.e(this.f1758c);
    }

    public final int f(InterfaceC0141j interfaceC0141j, int i7, boolean z7) {
        int i8 = this.f + i7;
        byte[] bArr = this.f1759e;
        if (bArr.length < i8) {
            this.f1759e = Arrays.copyOf(bArr, (i8 / 2) + i8);
        }
        int r3 = interfaceC0141j.r(this.f1759e, this.f, i7);
        if (r3 == -1) {
            if (z7) {
                return -1;
            }
            throw new EOFException();
        }
        this.f += r3;
        return r3;
    }
}
