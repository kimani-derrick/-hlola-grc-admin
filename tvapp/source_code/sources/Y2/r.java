package Y2;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class r {

    /* renamed from: c  reason: collision with root package name */
    public int f4432c;
    public int d;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f4430a = true;

    /* renamed from: b  reason: collision with root package name */
    public final int f4431b = 65536;

    /* renamed from: e  reason: collision with root package name */
    public int f4433e = 0;
    public C0132a[] f = new C0132a[100];

    public final synchronized void a(int i7) {
        boolean z7;
        if (i7 < this.f4432c) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.f4432c = i7;
        if (z7) {
            b();
        }
    }

    public final synchronized void b() {
        int max = Math.max(0, Z2.H.g(this.f4432c, this.f4431b) - this.d);
        int i7 = this.f4433e;
        if (max >= i7) {
            return;
        }
        Arrays.fill(this.f, max, i7, (Object) null);
        this.f4433e = max;
    }
}
