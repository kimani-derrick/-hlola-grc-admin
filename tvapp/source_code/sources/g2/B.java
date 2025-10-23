package g2;

import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public final class B extends AbstractC0709A {

    /* renamed from: i  reason: collision with root package name */
    public int[] f10514i;

    /* renamed from: j  reason: collision with root package name */
    public int[] f10515j;

    @Override // g2.InterfaceC0724o
    public final void f(ByteBuffer byteBuffer) {
        int[] iArr = this.f10515j;
        iArr.getClass();
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer l7 = l(((limit - position) / this.f10509b.d) * this.f10510c.d);
        while (position < limit) {
            for (int i7 : iArr) {
                l7.putShort(byteBuffer.getShort((i7 * 2) + position));
            }
            position += this.f10509b.d;
        }
        byteBuffer.position(limit);
        l7.flip();
    }

    @Override // g2.AbstractC0709A
    public final C0722m h(C0722m c0722m) {
        boolean z7;
        boolean z8;
        int[] iArr = this.f10514i;
        if (iArr == null) {
            return C0722m.f10702e;
        }
        if (c0722m.f10705c == 2) {
            int length = iArr.length;
            int i7 = c0722m.f10704b;
            if (i7 != length) {
                z7 = true;
            } else {
                z7 = false;
            }
            for (int i8 = 0; i8 < iArr.length; i8++) {
                int i9 = iArr[i8];
                if (i9 < i7) {
                    if (i9 != i8) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    z7 |= z8;
                } else {
                    throw new C0723n(c0722m);
                }
            }
            if (z7) {
                return new C0722m(c0722m.f10703a, iArr.length, 2);
            }
            return C0722m.f10702e;
        }
        throw new C0723n(c0722m);
    }

    @Override // g2.AbstractC0709A
    public final void i() {
        this.f10515j = this.f10514i;
    }

    @Override // g2.AbstractC0709A
    public final void k() {
        this.f10515j = null;
        this.f10514i = null;
    }
}
