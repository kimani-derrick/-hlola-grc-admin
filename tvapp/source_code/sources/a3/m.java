package a3;

import android.content.Context;
import android.opengl.GLSurfaceView;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
/* loaded from: classes.dex */
public final class m extends GLSurfaceView implements n {

    /* renamed from: r  reason: collision with root package name */
    public static final /* synthetic */ int f5098r = 0;

    /* renamed from: q  reason: collision with root package name */
    public final l f5099q;

    public m(Context context) {
        super(context, null);
        l lVar = new l(this);
        this.f5099q = lVar;
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(lVar);
        setRenderMode(0);
    }

    public void setOutputBuffer(i2.j jVar) {
        l lVar = this.f5099q;
        AbstractC0515y1.v(lVar.f5096v.getAndSet(jVar));
        lVar.f5091q.requestRender();
    }

    @Deprecated
    public n getVideoDecoderOutputBufferRenderer() {
        return this;
    }
}
