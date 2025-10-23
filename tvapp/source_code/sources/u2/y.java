package u2;

import android.util.SparseArray;
import k2.C0943h;
import k2.InterfaceC0946k;
import k2.InterfaceC0947l;
import k2.InterfaceC0948m;
import n2.C1030a;
/* loaded from: classes.dex */
public final class y implements InterfaceC0946k {

    /* renamed from: e  reason: collision with root package name */
    public boolean f14942e;
    public boolean f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f14943g;

    /* renamed from: h  reason: collision with root package name */
    public long f14944h;

    /* renamed from: i  reason: collision with root package name */
    public C1030a f14945i;

    /* renamed from: j  reason: collision with root package name */
    public InterfaceC0948m f14946j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f14947k;

    /* renamed from: a  reason: collision with root package name */
    public final Z2.E f14939a = new Z2.E(0);

    /* renamed from: c  reason: collision with root package name */
    public final Z2.y f14941c = new Z2.y(4096);

    /* renamed from: b  reason: collision with root package name */
    public final SparseArray f14940b = new SparseArray();
    public final w d = new w();

    /* JADX WARN: Removed duplicated region for block: B:102:0x0212  */
    @Override // k2.InterfaceC0946k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int d(k2.InterfaceC0947l r30, U4.k r31) {
        /*
            Method dump skipped, instructions count: 770
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u2.y.d(k2.l, U4.k):int");
    }

    @Override // k2.InterfaceC0946k
    public final void e(InterfaceC0948m interfaceC0948m) {
        this.f14946j = interfaceC0948m;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
        if (r4 != r9) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0028, code lost:
        if (r8 != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002a, code lost:
        r7.f(r9);
     */
    @Override // k2.InterfaceC0946k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(long r7, long r9) {
        /*
            r6 = this;
            Z2.E r7 = r6.f14939a
            long r0 = r7.d()
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r0 = 0
            if (r8 != 0) goto L12
            r8 = 1
            goto L13
        L12:
            r8 = r0
        L13:
            if (r8 != 0) goto L28
            long r4 = r7.c()
            int r8 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r8 == 0) goto L2d
            r1 = 0
            int r8 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r8 == 0) goto L2d
            int r8 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r8 == 0) goto L2d
            goto L2a
        L28:
            if (r8 == 0) goto L2d
        L2a:
            r7.f(r9)
        L2d:
            n2.a r7 = r6.f14945i
            if (r7 == 0) goto L34
            r7.d(r9)
        L34:
            r7 = r0
        L35:
            android.util.SparseArray r8 = r6.f14940b
            int r9 = r8.size()
            if (r7 >= r9) goto L4d
            java.lang.Object r8 = r8.valueAt(r7)
            u2.x r8 = (u2.x) r8
            r8.f = r0
            u2.h r8 = r8.f14934a
            r8.a()
            int r7 = r7 + 1
            goto L35
        L4d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u2.y.h(long, long):void");
    }

    @Override // k2.InterfaceC0946k
    public final boolean j(InterfaceC0947l interfaceC0947l) {
        byte[] bArr = new byte[14];
        C0943h c0943h = (C0943h) interfaceC0947l;
        c0943h.i(bArr, 0, 14, false);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        c0943h.a(bArr[13] & 7, false);
        c0943h.i(bArr, 0, 3, false);
        if (1 != (((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255))) {
            return false;
        }
        return true;
    }

    @Override // k2.InterfaceC0946k
    public final void a() {
    }
}
