package g2;

import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public final class U extends AbstractC0709A {

    /* renamed from: i  reason: collision with root package name */
    public static final int f10654i = Float.floatToIntBits(Float.NaN);

    @Override // g2.InterfaceC0724o
    public final void f(ByteBuffer byteBuffer) {
        ByteBuffer l7;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i7 = limit - position;
        int i8 = this.f10509b.f10705c;
        int i9 = f10654i;
        if (i8 != 536870912) {
            if (i8 == 805306368) {
                l7 = l(i7);
                while (position < limit) {
                    int floatToIntBits = Float.floatToIntBits((float) (((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24)) * 4.656612875245797E-10d));
                    if (floatToIntBits == i9) {
                        floatToIntBits = Float.floatToIntBits(0.0f);
                    }
                    l7.putInt(floatToIntBits);
                    position += 4;
                }
            } else {
                throw new IllegalStateException();
            }
        } else {
            l7 = l((i7 / 3) * 4);
            while (position < limit) {
                int floatToIntBits2 = Float.floatToIntBits((float) ((((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24)) * 4.656612875245797E-10d));
                if (floatToIntBits2 == i9) {
                    floatToIntBits2 = Float.floatToIntBits(0.0f);
                }
                l7.putInt(floatToIntBits2);
                position += 3;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        l7.flip();
    }

    @Override // g2.AbstractC0709A
    public final C0722m h(C0722m c0722m) {
        int i7 = c0722m.f10705c;
        if (i7 != 536870912 && i7 != 805306368 && i7 != 4) {
            throw new C0723n(c0722m);
        }
        if (i7 != 4) {
            return new C0722m(c0722m.f10703a, c0722m.f10704b, 4);
        }
        return C0722m.f10702e;
    }
}
