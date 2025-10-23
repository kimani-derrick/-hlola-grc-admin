package g2;

import android.media.AudioTrack;
/* loaded from: classes.dex */
public final class x {

    /* renamed from: a  reason: collision with root package name */
    public final C0731w f10725a;

    /* renamed from: b  reason: collision with root package name */
    public int f10726b;

    /* renamed from: c  reason: collision with root package name */
    public long f10727c;
    public long d;

    /* renamed from: e  reason: collision with root package name */
    public long f10728e;
    public long f;

    public x(AudioTrack audioTrack) {
        if (Z2.H.f4603a >= 19) {
            this.f10725a = new C0731w(audioTrack);
            a();
            return;
        }
        this.f10725a = null;
        b(3);
    }

    public final void a() {
        if (this.f10725a != null) {
            b(0);
        }
    }

    public final void b(int i7) {
        this.f10726b = i7;
        long j7 = 10000;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2 && i7 != 3) {
                    if (i7 == 4) {
                        j7 = 500000;
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    j7 = 10000000;
                }
            }
        } else {
            this.f10728e = 0L;
            this.f = -1L;
            this.f10727c = System.nanoTime() / 1000;
        }
        this.d = j7;
    }
}
