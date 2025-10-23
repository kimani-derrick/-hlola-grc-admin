package a3;

import java.util.Arrays;
/* renamed from: a3.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0203c {

    /* renamed from: a  reason: collision with root package name */
    public long f5027a;

    /* renamed from: b  reason: collision with root package name */
    public long f5028b;

    /* renamed from: c  reason: collision with root package name */
    public long f5029c;
    public long d;

    /* renamed from: e  reason: collision with root package name */
    public long f5030e;
    public long f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean[] f5031g = new boolean[15];

    /* renamed from: h  reason: collision with root package name */
    public int f5032h;

    public final boolean a() {
        if (this.d > 15 && this.f5032h == 0) {
            return true;
        }
        return false;
    }

    public final void b(long j7) {
        int i7;
        long j8 = this.d;
        if (j8 == 0) {
            this.f5027a = j7;
        } else if (j8 == 1) {
            long j9 = j7 - this.f5027a;
            this.f5028b = j9;
            this.f = j9;
            this.f5030e = 1L;
        } else {
            long j10 = j7 - this.f5029c;
            int i8 = (int) (j8 % 15);
            int i9 = (Math.abs(j10 - this.f5028b) > 1000000L ? 1 : (Math.abs(j10 - this.f5028b) == 1000000L ? 0 : -1));
            boolean[] zArr = this.f5031g;
            if (i9 <= 0) {
                this.f5030e++;
                this.f += j10;
                if (zArr[i8]) {
                    zArr[i8] = false;
                    i7 = this.f5032h - 1;
                    this.f5032h = i7;
                }
            } else if (!zArr[i8]) {
                zArr[i8] = true;
                i7 = this.f5032h + 1;
                this.f5032h = i7;
            }
        }
        this.d++;
        this.f5029c = j7;
    }

    public final void c() {
        this.d = 0L;
        this.f5030e = 0L;
        this.f = 0L;
        this.f5032h = 0;
        Arrays.fill(this.f5031g, false);
    }
}
