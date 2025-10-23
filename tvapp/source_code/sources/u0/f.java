package u0;

import android.view.Choreographer;
/* loaded from: classes.dex */
public abstract class f {
    public static void a(final Runnable runnable) {
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: u0.e
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j7) {
                runnable.run();
            }
        });
    }
}
