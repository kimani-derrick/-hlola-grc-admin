package w2;

import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
/* renamed from: w2.o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1393o {
    public static void a(C1387i c1387i, f2.m mVar) {
        LogSessionId logSessionId;
        boolean equals;
        String stringId;
        f2.l lVar = mVar.f10395a;
        lVar.getClass();
        LogSessionId logSessionId2 = lVar.f10394a;
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        equals = logSessionId2.equals(logSessionId);
        if (!equals) {
            MediaFormat mediaFormat = c1387i.f15777b;
            stringId = logSessionId2.getStringId();
            mediaFormat.setString("log-session-id", stringId);
        }
    }
}
