package a3;

import Z2.AbstractC0156a;
import android.view.Surface;
/* loaded from: classes.dex */
public abstract class p {
    public static void a(Surface surface, float f) {
        int i7;
        if (f == 0.0f) {
            i7 = 0;
        } else {
            i7 = 1;
        }
        try {
            surface.setFrameRate(f, i7);
        } catch (IllegalStateException e3) {
            AbstractC0156a.r("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e3);
        }
    }
}
