package i2;

import e2.AbstractC0592I;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public class g extends AbstractC0769a {

    /* renamed from: t  reason: collision with root package name */
    public ByteBuffer f11351t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f11352u;

    /* renamed from: v  reason: collision with root package name */
    public long f11353v;

    /* renamed from: w  reason: collision with root package name */
    public ByteBuffer f11354w;

    /* renamed from: x  reason: collision with root package name */
    public final int f11355x;

    /* renamed from: s  reason: collision with root package name */
    public final c f11350s = new c();

    /* renamed from: y  reason: collision with root package name */
    public final int f11356y = 0;

    static {
        AbstractC0592I.a("goog.exo.decoder");
    }

    public g(int i7) {
        this.f11355x = i7;
    }

    public void f() {
        this.f11331r = 0;
        ByteBuffer byteBuffer = this.f11351t;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f11354w;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f11352u = false;
    }

    public final ByteBuffer g(int i7) {
        int capacity;
        int i8 = this.f11355x;
        if (i8 == 1) {
            return ByteBuffer.allocate(i7);
        }
        if (i8 == 2) {
            return ByteBuffer.allocateDirect(i7);
        }
        ByteBuffer byteBuffer = this.f11351t;
        if (byteBuffer == null) {
            capacity = 0;
        } else {
            capacity = byteBuffer.capacity();
        }
        throw new IllegalStateException("Buffer too small (" + capacity + " < " + i7 + ")");
    }

    public final void i(int i7) {
        int i8 = i7 + this.f11356y;
        ByteBuffer byteBuffer = this.f11351t;
        if (byteBuffer == null) {
            this.f11351t = g(i8);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i9 = i8 + position;
        if (capacity >= i9) {
            this.f11351t = byteBuffer;
            return;
        }
        ByteBuffer g7 = g(i9);
        g7.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            g7.put(byteBuffer);
        }
        this.f11351t = g7;
    }

    public final void j() {
        ByteBuffer byteBuffer = this.f11351t;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f11354w;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
