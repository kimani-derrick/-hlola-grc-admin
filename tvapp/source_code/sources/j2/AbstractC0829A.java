package j2;

import android.media.MediaDrm;
import android.media.metrics.LogSessionId;
/* renamed from: j2.A  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0829A {
    public static boolean a(MediaDrm mediaDrm, String str) {
        boolean requiresSecureDecoder;
        requiresSecureDecoder = mediaDrm.requiresSecureDecoder(str);
        return requiresSecureDecoder;
    }

    public static void b(MediaDrm mediaDrm, byte[] bArr, f2.m mVar) {
        LogSessionId logSessionId;
        boolean equals;
        MediaDrm.PlaybackComponent playbackComponent;
        f2.l lVar = mVar.f10395a;
        lVar.getClass();
        LogSessionId logSessionId2 = lVar.f10394a;
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        equals = logSessionId2.equals(logSessionId);
        if (!equals) {
            playbackComponent = mediaDrm.getPlaybackComponent(bArr);
            playbackComponent.getClass();
            f2.j.c(playbackComponent).setLogSessionId(logSessionId2);
        }
    }
}
