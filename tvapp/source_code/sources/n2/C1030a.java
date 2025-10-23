package n2;

import U4.k;
import k2.C0936a;
import k2.C0937b;
import k2.C0943h;
import k2.InterfaceC0938c;
import k2.InterfaceC0940e;
/* renamed from: n2.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1030a {

    /* renamed from: a  reason: collision with root package name */
    public final C0936a f12649a;

    /* renamed from: b  reason: collision with root package name */
    public final InterfaceC0940e f12650b;

    /* renamed from: c  reason: collision with root package name */
    public C0937b f12651c;
    public final int d;

    public C1030a(InterfaceC0938c interfaceC0938c, InterfaceC0940e interfaceC0940e, long j7, long j8, long j9, long j10, long j11, int i7) {
        this.f12650b = interfaceC0940e;
        this.d = i7;
        this.f12649a = new C0936a(interfaceC0938c, j7, j8, j9, j10, j11);
    }

    public static int a(int i7, byte[] bArr) {
        return (bArr[i7 + 3] & 255) | ((bArr[i7] & 255) << 24) | ((bArr[i7 + 1] & 255) << 16) | ((bArr[i7 + 2] & 255) << 8);
    }

    public static int c(C0943h c0943h, long j7, k kVar) {
        if (j7 == c0943h.f12166t) {
            return 0;
        }
        kVar.f3459a = j7;
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00cf, code lost:
        return c(r28, r8, r29);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(k2.C0943h r28, U4.k r29) {
        /*
            Method dump skipped, instructions count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.C1030a.b(k2.h, U4.k):int");
    }

    public final void d(long j7) {
        C0937b c0937b = this.f12651c;
        if (c0937b != null && c0937b.f12145a == j7) {
            return;
        }
        C0936a c0936a = this.f12649a;
        this.f12651c = new C0937b(j7, c0936a.f12140a.b(j7), c0936a.f12142c, c0936a.d, c0936a.f12143e, c0936a.f, c0936a.f12144g);
    }
}
