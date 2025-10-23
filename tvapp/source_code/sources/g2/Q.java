package g2;

import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public final class Q extends AbstractC0709A {

    /* renamed from: i  reason: collision with root package name */
    public final long f10612i = 150000;

    /* renamed from: j  reason: collision with root package name */
    public final long f10613j = 20000;

    /* renamed from: k  reason: collision with root package name */
    public final short f10614k = 1024;

    /* renamed from: l  reason: collision with root package name */
    public int f10615l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f10616m;
    public byte[] n;

    /* renamed from: o  reason: collision with root package name */
    public byte[] f10617o;

    /* renamed from: p  reason: collision with root package name */
    public int f10618p;

    /* renamed from: q  reason: collision with root package name */
    public int f10619q;

    /* renamed from: r  reason: collision with root package name */
    public int f10620r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f10621s;

    /* renamed from: t  reason: collision with root package name */
    public long f10622t;

    public Q() {
        byte[] bArr = Z2.H.f;
        this.n = bArr;
        this.f10617o = bArr;
    }

    @Override // g2.AbstractC0709A, g2.InterfaceC0724o
    public final boolean a() {
        return this.f10616m;
    }

    @Override // g2.InterfaceC0724o
    public final void f(ByteBuffer byteBuffer) {
        int position;
        while (byteBuffer.hasRemaining() && !this.f10512g.hasRemaining()) {
            int i7 = this.f10618p;
            if (i7 != 0) {
                if (i7 != 1) {
                    if (i7 == 2) {
                        int limit = byteBuffer.limit();
                        int m7 = m(byteBuffer);
                        byteBuffer.limit(m7);
                        this.f10622t += byteBuffer.remaining() / this.f10615l;
                        o(byteBuffer, this.f10617o, this.f10620r);
                        if (m7 < limit) {
                            n(this.f10620r, this.f10617o);
                            this.f10618p = 0;
                            byteBuffer.limit(limit);
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    int limit2 = byteBuffer.limit();
                    int m8 = m(byteBuffer);
                    int position2 = m8 - byteBuffer.position();
                    byte[] bArr = this.n;
                    int length = bArr.length;
                    int i8 = this.f10619q;
                    int i9 = length - i8;
                    if (m8 < limit2 && position2 < i9) {
                        n(i8, bArr);
                        this.f10619q = 0;
                        this.f10618p = 0;
                    } else {
                        int min = Math.min(position2, i9);
                        byteBuffer.limit(byteBuffer.position() + min);
                        byteBuffer.get(this.n, this.f10619q, min);
                        int i10 = this.f10619q + min;
                        this.f10619q = i10;
                        byte[] bArr2 = this.n;
                        if (i10 == bArr2.length) {
                            if (this.f10621s) {
                                n(this.f10620r, bArr2);
                                this.f10622t += (this.f10619q - (this.f10620r * 2)) / this.f10615l;
                            } else {
                                this.f10622t += (i10 - this.f10620r) / this.f10615l;
                            }
                            o(byteBuffer, this.n, this.f10619q);
                            this.f10619q = 0;
                            this.f10618p = 2;
                        }
                        byteBuffer.limit(limit2);
                    }
                }
            } else {
                int limit3 = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit3, byteBuffer.position() + this.n.length));
                int limit4 = byteBuffer.limit() - 2;
                while (true) {
                    if (limit4 >= byteBuffer.position()) {
                        if (Math.abs((int) byteBuffer.getShort(limit4)) > this.f10614k) {
                            int i11 = this.f10615l;
                            position = ((limit4 / i11) * i11) + i11;
                            break;
                        }
                        limit4 -= 2;
                    } else {
                        position = byteBuffer.position();
                        break;
                    }
                }
                if (position == byteBuffer.position()) {
                    this.f10618p = 1;
                } else {
                    byteBuffer.limit(position);
                    int remaining = byteBuffer.remaining();
                    l(remaining).put(byteBuffer).flip();
                    if (remaining > 0) {
                        this.f10621s = true;
                    }
                }
                byteBuffer.limit(limit3);
            }
        }
    }

    @Override // g2.AbstractC0709A
    public final C0722m h(C0722m c0722m) {
        if (c0722m.f10705c == 2) {
            if (!this.f10616m) {
                return C0722m.f10702e;
            }
            return c0722m;
        }
        throw new C0723n(c0722m);
    }

    @Override // g2.AbstractC0709A
    public final void i() {
        if (this.f10616m) {
            C0722m c0722m = this.f10509b;
            int i7 = c0722m.d;
            this.f10615l = i7;
            int i8 = c0722m.f10703a;
            int i9 = ((int) ((this.f10612i * i8) / 1000000)) * i7;
            if (this.n.length != i9) {
                this.n = new byte[i9];
            }
            int i10 = ((int) ((this.f10613j * i8) / 1000000)) * i7;
            this.f10620r = i10;
            if (this.f10617o.length != i10) {
                this.f10617o = new byte[i10];
            }
        }
        this.f10618p = 0;
        this.f10622t = 0L;
        this.f10619q = 0;
        this.f10621s = false;
    }

    @Override // g2.AbstractC0709A
    public final void j() {
        int i7 = this.f10619q;
        if (i7 > 0) {
            n(i7, this.n);
        }
        if (!this.f10621s) {
            this.f10622t += this.f10620r / this.f10615l;
        }
    }

    @Override // g2.AbstractC0709A
    public final void k() {
        this.f10616m = false;
        this.f10620r = 0;
        byte[] bArr = Z2.H.f;
        this.n = bArr;
        this.f10617o = bArr;
    }

    public final int m(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position(); position < byteBuffer.limit(); position += 2) {
            if (Math.abs((int) byteBuffer.getShort(position)) > this.f10614k) {
                int i7 = this.f10615l;
                return (position / i7) * i7;
            }
        }
        return byteBuffer.limit();
    }

    public final void n(int i7, byte[] bArr) {
        l(i7).put(bArr, 0, i7).flip();
        if (i7 > 0) {
            this.f10621s = true;
        }
    }

    public final void o(ByteBuffer byteBuffer, byte[] bArr, int i7) {
        int min = Math.min(byteBuffer.remaining(), this.f10620r);
        int i8 = this.f10620r - min;
        System.arraycopy(bArr, i7 - i8, this.f10617o, 0, i8);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.f10617o, i8, min);
    }
}
