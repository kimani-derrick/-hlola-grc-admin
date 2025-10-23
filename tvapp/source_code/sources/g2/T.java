package g2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
/* loaded from: classes.dex */
public final class T implements InterfaceC0724o {

    /* renamed from: b  reason: collision with root package name */
    public int f10642b;

    /* renamed from: c  reason: collision with root package name */
    public float f10643c;
    public float d;

    /* renamed from: e  reason: collision with root package name */
    public C0722m f10644e;
    public C0722m f;

    /* renamed from: g  reason: collision with root package name */
    public C0722m f10645g;

    /* renamed from: h  reason: collision with root package name */
    public C0722m f10646h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f10647i;

    /* renamed from: j  reason: collision with root package name */
    public S f10648j;

    /* renamed from: k  reason: collision with root package name */
    public ByteBuffer f10649k;

    /* renamed from: l  reason: collision with root package name */
    public ShortBuffer f10650l;

    /* renamed from: m  reason: collision with root package name */
    public ByteBuffer f10651m;
    public long n;

    /* renamed from: o  reason: collision with root package name */
    public long f10652o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f10653p;

    @Override // g2.InterfaceC0724o
    public final boolean a() {
        if (this.f.f10703a != -1 && (Math.abs(this.f10643c - 1.0f) >= 1.0E-4f || Math.abs(this.d - 1.0f) >= 1.0E-4f || this.f.f10703a != this.f10644e.f10703a)) {
            return true;
        }
        return false;
    }

    @Override // g2.InterfaceC0724o
    public final ByteBuffer b() {
        S s6 = this.f10648j;
        if (s6 != null) {
            int i7 = s6.f10633m;
            int i8 = s6.f10624b;
            int i9 = i7 * i8 * 2;
            if (i9 > 0) {
                if (this.f10649k.capacity() < i9) {
                    ByteBuffer order = ByteBuffer.allocateDirect(i9).order(ByteOrder.nativeOrder());
                    this.f10649k = order;
                    this.f10650l = order.asShortBuffer();
                } else {
                    this.f10649k.clear();
                    this.f10650l.clear();
                }
                ShortBuffer shortBuffer = this.f10650l;
                int min = Math.min(shortBuffer.remaining() / i8, s6.f10633m);
                int i10 = min * i8;
                shortBuffer.put(s6.f10632l, 0, i10);
                int i11 = s6.f10633m - min;
                s6.f10633m = i11;
                short[] sArr = s6.f10632l;
                System.arraycopy(sArr, i10, sArr, 0, i11 * i8);
                this.f10652o += i9;
                this.f10649k.limit(i9);
                this.f10651m = this.f10649k;
            }
        }
        ByteBuffer byteBuffer = this.f10651m;
        this.f10651m = InterfaceC0724o.f10706a;
        return byteBuffer;
    }

    @Override // g2.InterfaceC0724o
    public final C0722m c(C0722m c0722m) {
        if (c0722m.f10705c == 2) {
            int i7 = this.f10642b;
            if (i7 == -1) {
                i7 = c0722m.f10703a;
            }
            this.f10644e = c0722m;
            C0722m c0722m2 = new C0722m(i7, c0722m.f10704b, 2);
            this.f = c0722m2;
            this.f10647i = true;
            return c0722m2;
        }
        throw new C0723n(c0722m);
    }

    @Override // g2.InterfaceC0724o
    public final void d() {
        S s6 = this.f10648j;
        if (s6 != null) {
            int i7 = s6.f10631k;
            float f = s6.f10625c;
            float f7 = s6.d;
            int i8 = s6.f10633m + ((int) ((((i7 / (f / f7)) + s6.f10634o) / (s6.f10626e * f7)) + 0.5f));
            short[] sArr = s6.f10630j;
            int i9 = s6.f10628h * 2;
            s6.f10630j = s6.c(sArr, i7, i9 + i7);
            int i10 = 0;
            while (true) {
                int i11 = s6.f10624b;
                if (i10 >= i9 * i11) {
                    break;
                }
                s6.f10630j[(i11 * i7) + i10] = 0;
                i10++;
            }
            s6.f10631k = i9 + s6.f10631k;
            s6.f();
            if (s6.f10633m > i8) {
                s6.f10633m = i8;
            }
            s6.f10631k = 0;
            s6.f10637r = 0;
            s6.f10634o = 0;
        }
        this.f10653p = true;
    }

    @Override // g2.InterfaceC0724o
    public final boolean e() {
        S s6;
        if (this.f10653p && ((s6 = this.f10648j) == null || s6.f10633m * s6.f10624b * 2 == 0)) {
            return true;
        }
        return false;
    }

    @Override // g2.InterfaceC0724o
    public final void f(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            return;
        }
        S s6 = this.f10648j;
        s6.getClass();
        ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
        int remaining = byteBuffer.remaining();
        this.n += remaining;
        int remaining2 = asShortBuffer.remaining();
        int i7 = s6.f10624b;
        int i8 = remaining2 / i7;
        short[] c5 = s6.c(s6.f10630j, s6.f10631k, i8);
        s6.f10630j = c5;
        asShortBuffer.get(c5, s6.f10631k * i7, ((i8 * i7) * 2) / 2);
        s6.f10631k += i8;
        s6.f();
        byteBuffer.position(byteBuffer.position() + remaining);
    }

    @Override // g2.InterfaceC0724o
    public final void flush() {
        if (a()) {
            C0722m c0722m = this.f10644e;
            this.f10645g = c0722m;
            C0722m c0722m2 = this.f;
            this.f10646h = c0722m2;
            if (this.f10647i) {
                this.f10648j = new S(c0722m.f10703a, c0722m.f10704b, this.f10643c, this.d, c0722m2.f10703a);
            } else {
                S s6 = this.f10648j;
                if (s6 != null) {
                    s6.f10631k = 0;
                    s6.f10633m = 0;
                    s6.f10634o = 0;
                    s6.f10635p = 0;
                    s6.f10636q = 0;
                    s6.f10637r = 0;
                    s6.f10638s = 0;
                    s6.f10639t = 0;
                    s6.f10640u = 0;
                    s6.f10641v = 0;
                }
            }
        }
        this.f10651m = InterfaceC0724o.f10706a;
        this.n = 0L;
        this.f10652o = 0L;
        this.f10653p = false;
    }

    @Override // g2.InterfaceC0724o
    public final void g() {
        this.f10643c = 1.0f;
        this.d = 1.0f;
        C0722m c0722m = C0722m.f10702e;
        this.f10644e = c0722m;
        this.f = c0722m;
        this.f10645g = c0722m;
        this.f10646h = c0722m;
        ByteBuffer byteBuffer = InterfaceC0724o.f10706a;
        this.f10649k = byteBuffer;
        this.f10650l = byteBuffer.asShortBuffer();
        this.f10651m = byteBuffer;
        this.f10642b = -1;
        this.f10647i = false;
        this.f10648j = null;
        this.n = 0L;
        this.f10652o = 0L;
        this.f10653p = false;
    }
}
