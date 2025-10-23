package g2;

import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public final class W extends AbstractC0709A {

    /* renamed from: i  reason: collision with root package name */
    public int f10655i;

    /* renamed from: j  reason: collision with root package name */
    public int f10656j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f10657k;

    /* renamed from: l  reason: collision with root package name */
    public int f10658l;

    /* renamed from: m  reason: collision with root package name */
    public byte[] f10659m;
    public int n;

    /* renamed from: o  reason: collision with root package name */
    public long f10660o;

    @Override // g2.AbstractC0709A, g2.InterfaceC0724o
    public final ByteBuffer b() {
        int i7;
        if (super.e() && (i7 = this.n) > 0) {
            l(i7).put(this.f10659m, 0, this.n).flip();
            this.n = 0;
        }
        return super.b();
    }

    @Override // g2.AbstractC0709A, g2.InterfaceC0724o
    public final boolean e() {
        if (super.e() && this.n == 0) {
            return true;
        }
        return false;
    }

    @Override // g2.InterfaceC0724o
    public final void f(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i7 = limit - position;
        if (i7 == 0) {
            return;
        }
        int min = Math.min(i7, this.f10658l);
        this.f10660o += min / this.f10509b.d;
        this.f10658l -= min;
        byteBuffer.position(position + min);
        if (this.f10658l > 0) {
            return;
        }
        int i8 = i7 - min;
        int length = (this.n + i8) - this.f10659m.length;
        ByteBuffer l7 = l(length);
        int j7 = Z2.H.j(length, 0, this.n);
        l7.put(this.f10659m, 0, j7);
        int j8 = Z2.H.j(length - j7, 0, i8);
        byteBuffer.limit(byteBuffer.position() + j8);
        l7.put(byteBuffer);
        byteBuffer.limit(limit);
        int i9 = i8 - j8;
        int i10 = this.n - j7;
        this.n = i10;
        byte[] bArr = this.f10659m;
        System.arraycopy(bArr, j7, bArr, 0, i10);
        byteBuffer.get(this.f10659m, this.n, i9);
        this.n += i9;
        l7.flip();
    }

    @Override // g2.AbstractC0709A
    public final C0722m h(C0722m c0722m) {
        if (c0722m.f10705c == 2) {
            this.f10657k = true;
            if (this.f10655i == 0 && this.f10656j == 0) {
                return C0722m.f10702e;
            }
            return c0722m;
        }
        throw new C0723n(c0722m);
    }

    @Override // g2.AbstractC0709A
    public final void i() {
        if (this.f10657k) {
            this.f10657k = false;
            int i7 = this.f10656j;
            int i8 = this.f10509b.d;
            this.f10659m = new byte[i7 * i8];
            this.f10658l = this.f10655i * i8;
        }
        this.n = 0;
    }

    @Override // g2.AbstractC0709A
    public final void j() {
        int i7;
        if (this.f10657k) {
            if (this.n > 0) {
                this.f10660o += i7 / this.f10509b.d;
            }
            this.n = 0;
        }
    }

    @Override // g2.AbstractC0709A
    public final void k() {
        this.f10659m = Z2.H.f;
    }
}
