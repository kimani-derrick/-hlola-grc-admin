package k2;

import Y2.InterfaceC0141j;
import Z2.y;
import e2.K;
import java.io.EOFException;
/* renamed from: k2.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0945j implements w {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f12173a = new byte[4096];

    @Override // k2.w
    public final int a(InterfaceC0141j interfaceC0141j, int i7, boolean z7) {
        return f(interfaceC0141j, i7, z7);
    }

    @Override // k2.w
    public final void b(int i7, y yVar) {
        yVar.G(i7);
    }

    @Override // k2.w
    public final void d(int i7, y yVar) {
        yVar.G(i7);
    }

    public final int f(InterfaceC0141j interfaceC0141j, int i7, boolean z7) {
        byte[] bArr = this.f12173a;
        int r3 = interfaceC0141j.r(bArr, 0, Math.min(bArr.length, i7));
        if (r3 == -1) {
            if (z7) {
                return -1;
            }
            throw new EOFException();
        }
        return r3;
    }

    @Override // k2.w
    public final void e(K k5) {
    }

    @Override // k2.w
    public final void c(long j7, int i7, int i8, int i9, C0957v c0957v) {
    }
}
