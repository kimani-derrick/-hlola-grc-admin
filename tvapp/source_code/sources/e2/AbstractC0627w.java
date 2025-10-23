package e2;

import K.AbstractC0027c;
import Z2.AbstractC0156a;
import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackSession;
/* renamed from: e2.w  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0627w {
    public static f2.m a(Context context, C0585B c0585b, boolean z7) {
        PlaybackSession createPlaybackSession;
        f2.k kVar;
        LogSessionId sessionId;
        LogSessionId logSessionId;
        MediaMetricsManager d = AbstractC0027c.d(context.getSystemService("media_metrics"));
        if (d != null) {
            createPlaybackSession = d.createPlaybackSession();
            kVar = new f2.k(context, createPlaybackSession);
        } else {
            kVar = null;
        }
        if (kVar == null) {
            AbstractC0156a.K("ExoPlayerImpl", "MediaMetricsService unavailable.");
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            return new f2.m(logSessionId);
        }
        if (z7) {
            c0585b.getClass();
            f2.f fVar = c0585b.f9426H;
            fVar.getClass();
            fVar.f10353v.a(kVar);
        }
        sessionId = kVar.f10372c.getSessionId();
        return new f2.m(sessionId);
    }
}
