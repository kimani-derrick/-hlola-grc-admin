package k2;
/* renamed from: k2.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0942g implements InterfaceC0955t {

    /* renamed from: a  reason: collision with root package name */
    public final long f12158a;

    /* renamed from: b  reason: collision with root package name */
    public final long f12159b;

    /* renamed from: c  reason: collision with root package name */
    public final int f12160c;
    public final long d;

    /* renamed from: e  reason: collision with root package name */
    public final int f12161e;
    public final long f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f12162g;

    public C0942g(long j7, long j8, int i7, int i8, boolean z7) {
        this.f12158a = j7;
        this.f12159b = j8;
        this.f12160c = i8 == -1 ? 1 : i8;
        this.f12161e = i7;
        this.f12162g = z7;
        if (j7 == -1) {
            this.d = -1L;
            this.f = -9223372036854775807L;
            return;
        }
        long j9 = j7 - j8;
        this.d = j9;
        this.f = (Math.max(0L, j9) * 8000000) / i7;
    }

    @Override // k2.InterfaceC0955t
    public final boolean b() {
        if (this.d == -1 && !this.f12162g) {
            return false;
        }
        return true;
    }

    @Override // k2.InterfaceC0955t
    public final C0954s g(long j7) {
        long j8 = this.d;
        int i7 = (j8 > (-1L) ? 1 : (j8 == (-1L) ? 0 : -1));
        long j9 = this.f12159b;
        if (i7 == 0 && !this.f12162g) {
            C0956u c0956u = new C0956u(0L, j9);
            return new C0954s(c0956u, c0956u);
        }
        int i8 = this.f12161e;
        long j10 = this.f12160c;
        long j11 = (((i8 * j7) / 8000000) / j10) * j10;
        if (i7 != 0) {
            j11 = Math.min(j11, j8 - j10);
        }
        long max = Math.max(j11, 0L) + j9;
        long max2 = (Math.max(0L, max - j9) * 8000000) / i8;
        C0956u c0956u2 = new C0956u(max2, max);
        if (i7 != 0 && max2 < j7) {
            long j12 = max + j10;
            if (j12 < this.f12158a) {
                return new C0954s(c0956u2, new C0956u((Math.max(0L, j12 - j9) * 8000000) / i8, j12));
            }
        }
        return new C0954s(c0956u2, c0956u2);
    }

    @Override // k2.InterfaceC0955t
    public final long i() {
        return this.f;
    }
}
