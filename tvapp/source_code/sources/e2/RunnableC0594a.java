package e2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
/* renamed from: e2.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0594a extends BroadcastReceiver implements Runnable {

    /* renamed from: q  reason: collision with root package name */
    public final SurfaceHolder$CallbackC0629y f9810q;

    /* renamed from: r  reason: collision with root package name */
    public final Handler f9811r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ A0.f f9812s;

    public RunnableC0594a(A0.f fVar, Handler handler, SurfaceHolder$CallbackC0629y surfaceHolder$CallbackC0629y) {
        this.f9812s = fVar;
        this.f9811r = handler;
        this.f9810q = surfaceHolder$CallbackC0629y;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f9811r.post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f9812s.f11a) {
            this.f9810q.f10095q.n0(-1, 3, false);
        }
    }
}
