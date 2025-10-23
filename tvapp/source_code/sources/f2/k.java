package f2;

import H2.A;
import Z2.H;
import android.content.Context;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import e2.H0;
import e2.I0;
import e2.J0;
import e2.K;
import e2.U;
import e2.o0;
import java.util.HashMap;
/* loaded from: classes.dex */
public final class k {

    /* renamed from: A  reason: collision with root package name */
    public boolean f10369A;

    /* renamed from: a  reason: collision with root package name */
    public final Context f10370a;

    /* renamed from: b  reason: collision with root package name */
    public final h f10371b;

    /* renamed from: c  reason: collision with root package name */
    public final PlaybackSession f10372c;

    /* renamed from: i  reason: collision with root package name */
    public String f10376i;

    /* renamed from: j  reason: collision with root package name */
    public PlaybackMetrics.Builder f10377j;

    /* renamed from: k  reason: collision with root package name */
    public int f10378k;
    public o0 n;

    /* renamed from: o  reason: collision with root package name */
    public C.d f10381o;

    /* renamed from: p  reason: collision with root package name */
    public C.d f10382p;

    /* renamed from: q  reason: collision with root package name */
    public C.d f10383q;

    /* renamed from: r  reason: collision with root package name */
    public K f10384r;

    /* renamed from: s  reason: collision with root package name */
    public K f10385s;

    /* renamed from: t  reason: collision with root package name */
    public K f10386t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f10387u;

    /* renamed from: v  reason: collision with root package name */
    public int f10388v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f10389w;

    /* renamed from: x  reason: collision with root package name */
    public int f10390x;

    /* renamed from: y  reason: collision with root package name */
    public int f10391y;

    /* renamed from: z  reason: collision with root package name */
    public int f10392z;

    /* renamed from: e  reason: collision with root package name */
    public final I0 f10373e = new I0();
    public final H0 f = new H0();

    /* renamed from: h  reason: collision with root package name */
    public final HashMap f10375h = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    public final HashMap f10374g = new HashMap();
    public final long d = SystemClock.elapsedRealtime();

    /* renamed from: l  reason: collision with root package name */
    public int f10379l = 0;

    /* renamed from: m  reason: collision with root package name */
    public int f10380m = 0;

    public k(Context context, PlaybackSession playbackSession) {
        this.f10370a = context.getApplicationContext();
        this.f10372c = playbackSession;
        h hVar = new h();
        this.f10371b = hVar;
        hVar.d = this;
    }

    public final boolean a(C.d dVar) {
        String str;
        if (dVar != null) {
            String str2 = (String) dVar.f326t;
            h hVar = this.f10371b;
            synchronized (hVar) {
                str = hVar.f;
            }
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public final void b() {
        long longValue;
        long longValue2;
        int i7;
        PlaybackMetrics build;
        PlaybackMetrics.Builder builder = this.f10377j;
        if (builder != null && this.f10369A) {
            builder.setAudioUnderrunCount(this.f10392z);
            this.f10377j.setVideoFramesDropped(this.f10390x);
            this.f10377j.setVideoFramesPlayed(this.f10391y);
            Long l7 = (Long) this.f10374g.get(this.f10376i);
            PlaybackMetrics.Builder builder2 = this.f10377j;
            if (l7 == null) {
                longValue = 0;
            } else {
                longValue = l7.longValue();
            }
            builder2.setNetworkTransferDurationMillis(longValue);
            Long l8 = (Long) this.f10375h.get(this.f10376i);
            PlaybackMetrics.Builder builder3 = this.f10377j;
            if (l8 == null) {
                longValue2 = 0;
            } else {
                longValue2 = l8.longValue();
            }
            builder3.setNetworkBytesRead(longValue2);
            PlaybackMetrics.Builder builder4 = this.f10377j;
            if (l8 != null && l8.longValue() > 0) {
                i7 = 1;
            } else {
                i7 = 0;
            }
            builder4.setStreamSource(i7);
            PlaybackSession playbackSession = this.f10372c;
            build = this.f10377j.build();
            playbackSession.reportPlaybackMetrics(build);
        }
        this.f10377j = null;
        this.f10376i = null;
        this.f10392z = 0;
        this.f10390x = 0;
        this.f10391y = 0;
        this.f10384r = null;
        this.f10385s = null;
        this.f10386t = null;
        this.f10369A = false;
    }

    public final void c(J0 j02, A a7) {
        int b7;
        PlaybackMetrics.Builder builder = this.f10377j;
        if (a7 == null || (b7 = j02.b(a7.f1180a)) == -1) {
            return;
        }
        H0 h02 = this.f;
        int i7 = 0;
        j02.g(b7, h02, false);
        int i8 = h02.f9554s;
        I0 i02 = this.f10373e;
        j02.o(i8, i02);
        U u7 = i02.f9584s.f9805r;
        int i9 = 2;
        if (u7 != null) {
            int E4 = H.E(u7.f9761q, u7.f9762r);
            if (E4 != 0) {
                if (E4 != 1) {
                    if (E4 != 2) {
                        i7 = 1;
                    } else {
                        i7 = 4;
                    }
                } else {
                    i7 = 5;
                }
            } else {
                i7 = 3;
            }
        }
        builder.setStreamType(i7);
        if (i02.f9579D != -9223372036854775807L && !i02.f9577B && !i02.f9590y && !i02.a()) {
            builder.setMediaDurationMillis(H.S(i02.f9579D));
        }
        if (!i02.a()) {
            i9 = 1;
        }
        builder.setPlaybackType(i9);
        this.f10369A = true;
    }

    public final void d(C0695a c0695a, String str) {
        A a7 = c0695a.d;
        if ((a7 == null || !a7.a()) && str.equals(this.f10376i)) {
            b();
        }
        this.f10374g.remove(str);
        this.f10375h.remove(str);
    }

    public final void e(int i7, long j7, K k5, int i8) {
        TrackChangeEvent.Builder timeSinceCreatedMillis;
        TrackChangeEvent build;
        int i9;
        String str;
        timeSinceCreatedMillis = i.l(i7).setTimeSinceCreatedMillis(j7 - this.d);
        if (k5 != null) {
            timeSinceCreatedMillis.setTrackState(1);
            if (i8 != 1) {
                i9 = 3;
                if (i8 != 2) {
                    if (i8 != 3) {
                        i9 = 1;
                    } else {
                        i9 = 4;
                    }
                }
            } else {
                i9 = 2;
            }
            timeSinceCreatedMillis.setTrackChangeReason(i9);
            String str2 = k5.f9654A;
            if (str2 != null) {
                timeSinceCreatedMillis.setContainerMimeType(str2);
            }
            String str3 = k5.f9655B;
            if (str3 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str3);
            }
            String str4 = k5.f9684y;
            if (str4 != null) {
                timeSinceCreatedMillis.setCodecName(str4);
            }
            int i10 = k5.f9683x;
            if (i10 != -1) {
                timeSinceCreatedMillis.setBitrate(i10);
            }
            int i11 = k5.f9659G;
            if (i11 != -1) {
                timeSinceCreatedMillis.setWidth(i11);
            }
            int i12 = k5.f9660H;
            if (i12 != -1) {
                timeSinceCreatedMillis.setHeight(i12);
            }
            int i13 = k5.f9667O;
            if (i13 != -1) {
                timeSinceCreatedMillis.setChannelCount(i13);
            }
            int i14 = k5.f9668P;
            if (i14 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i14);
            }
            String str5 = k5.f9678s;
            if (str5 != null) {
                int i15 = H.f4603a;
                String[] split = str5.split("-", -1);
                String str6 = split[0];
                if (split.length >= 2) {
                    str = split[1];
                } else {
                    str = null;
                }
                Pair create = Pair.create(str6, str);
                timeSinceCreatedMillis.setLanguage((String) create.first);
                Object obj = create.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f = k5.f9661I;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.f10369A = true;
        PlaybackSession playbackSession = this.f10372c;
        build = timeSinceCreatedMillis.build();
        playbackSession.reportTrackChangeEvent(build);
    }
}
