package androidx.databinding;

import android.view.Choreographer;
/* loaded from: classes.dex */
public final class c implements Choreographer.FrameCallback {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ d f5657q;

    public c(d dVar) {
        this.f5657q = dVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j7) {
        this.f5657q.d.run();
    }
}
