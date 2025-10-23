package g2;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;
/* loaded from: classes.dex */
public abstract class D {
    public static void a(AudioTrack audioTrack, f2.m mVar) {
        LogSessionId logSessionId;
        boolean equals;
        f2.l lVar = mVar.f10395a;
        lVar.getClass();
        LogSessionId logSessionId2 = lVar.f10394a;
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        equals = logSessionId2.equals(logSessionId);
        if (!equals) {
            audioTrack.setLogSessionId(logSessionId2);
        }
    }
}
