package w2;

import Z2.H;
import android.media.MediaCodecInfo;
import java.util.List;
import k.AbstractC0863M;
/* renamed from: w2.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1391m {
    public static int a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i7, int i8, double d) {
        List supportedPerformancePoints;
        boolean covers;
        supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
        if (supportedPerformancePoints != null && !supportedPerformancePoints.isEmpty()) {
            String str = H.f4604b;
            if (!str.equals("sabrina") && !str.equals("boreal")) {
                String str2 = H.d;
                if (!str2.startsWith("Lenovo TB-X605") && !str2.startsWith("Lenovo TB-X606") && !str2.startsWith("Lenovo TB-X616")) {
                    AbstractC0863M.f();
                    MediaCodecInfo.VideoCapabilities.PerformancePoint a7 = AbstractC0863M.a(i7, i8, (int) d);
                    for (int i9 = 0; i9 < supportedPerformancePoints.size(); i9++) {
                        covers = AbstractC0863M.b(supportedPerformancePoints.get(i9)).covers(a7);
                        if (covers) {
                            return 2;
                        }
                    }
                    return 1;
                }
            }
        }
        return 0;
    }
}
