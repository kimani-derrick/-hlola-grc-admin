package g2;

import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public final class y {

    /* renamed from: A  reason: collision with root package name */
    public long f10729A;

    /* renamed from: B  reason: collision with root package name */
    public long f10730B;

    /* renamed from: C  reason: collision with root package name */
    public long f10731C;

    /* renamed from: D  reason: collision with root package name */
    public long f10732D;

    /* renamed from: E  reason: collision with root package name */
    public boolean f10733E;
    public long F;

    /* renamed from: G  reason: collision with root package name */
    public long f10734G;

    /* renamed from: a  reason: collision with root package name */
    public final Z5.n f10735a;

    /* renamed from: b  reason: collision with root package name */
    public final long[] f10736b;

    /* renamed from: c  reason: collision with root package name */
    public AudioTrack f10737c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public int f10738e;
    public x f;

    /* renamed from: g  reason: collision with root package name */
    public int f10739g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f10740h;

    /* renamed from: i  reason: collision with root package name */
    public long f10741i;

    /* renamed from: j  reason: collision with root package name */
    public float f10742j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f10743k;

    /* renamed from: l  reason: collision with root package name */
    public long f10744l;

    /* renamed from: m  reason: collision with root package name */
    public long f10745m;
    public Method n;

    /* renamed from: o  reason: collision with root package name */
    public long f10746o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f10747p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f10748q;

    /* renamed from: r  reason: collision with root package name */
    public long f10749r;

    /* renamed from: s  reason: collision with root package name */
    public long f10750s;

    /* renamed from: t  reason: collision with root package name */
    public long f10751t;

    /* renamed from: u  reason: collision with root package name */
    public long f10752u;

    /* renamed from: v  reason: collision with root package name */
    public long f10753v;

    /* renamed from: w  reason: collision with root package name */
    public int f10754w;

    /* renamed from: x  reason: collision with root package name */
    public int f10755x;

    /* renamed from: y  reason: collision with root package name */
    public long f10756y;

    /* renamed from: z  reason: collision with root package name */
    public long f10757z;

    public y(Z5.n nVar) {
        this.f10735a = nVar;
        if (Z2.H.f4603a >= 18) {
            try {
                this.n = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f10736b = new long[10];
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c8, code lost:
        if (r7 != false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ca, code lost:
        r2.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ce, code lost:
        if (r7 == false) goto L109;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0246  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a(boolean r27) {
        /*
            Method dump skipped, instructions count: 769
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.y.a(boolean):long");
    }

    public final long b() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j7 = this.f10756y;
        if (j7 != -9223372036854775807L) {
            return Math.min(this.f10730B, this.f10729A + (((Z2.H.v((elapsedRealtime * 1000) - j7, this.f10742j) * this.f10739g) + 999999) / 1000000));
        }
        if (elapsedRealtime - this.f10750s >= 5) {
            AudioTrack audioTrack = this.f10737c;
            audioTrack.getClass();
            int playState = audioTrack.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
                if (this.f10740h) {
                    if (playState == 2 && playbackHeadPosition == 0) {
                        this.f10753v = this.f10751t;
                    }
                    playbackHeadPosition += this.f10753v;
                }
                if (Z2.H.f4603a <= 29) {
                    if (playbackHeadPosition == 0 && this.f10751t > 0 && playState == 3) {
                        if (this.f10757z == -9223372036854775807L) {
                            this.f10757z = elapsedRealtime;
                        }
                    } else {
                        this.f10757z = -9223372036854775807L;
                    }
                }
                if (this.f10751t > playbackHeadPosition) {
                    this.f10752u++;
                }
                this.f10751t = playbackHeadPosition;
            }
            this.f10750s = elapsedRealtime;
        }
        return this.f10751t + (this.f10752u << 32);
    }

    public final boolean c(long j7) {
        long a7 = a(false);
        int i7 = this.f10739g;
        int i8 = Z2.H.f4603a;
        if (j7 <= ((a7 * i7) + 999999) / 1000000) {
            if (!this.f10740h) {
                return false;
            }
            AudioTrack audioTrack = this.f10737c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() != 2 || b() != 0) {
                return false;
            }
        }
        return true;
    }

    public final void d() {
        this.f10744l = 0L;
        this.f10755x = 0;
        this.f10754w = 0;
        this.f10745m = 0L;
        this.f10732D = 0L;
        this.f10734G = 0L;
        this.f10743k = false;
    }
}
