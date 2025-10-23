package e2;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
/* renamed from: e2.y  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class SurfaceHolder$CallbackC0629y implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ C0585B f10095q;

    public SurfaceHolder$CallbackC0629y(C0585B c0585b) {
        this.f10095q = c0585b;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i8) {
        C0585B c0585b = this.f10095q;
        c0585b.getClass();
        Surface surface = new Surface(surfaceTexture);
        c0585b.k0(surface);
        c0585b.f9450g0 = surface;
        c0585b.Z(i7, i8);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C0585B c0585b = this.f10095q;
        c0585b.k0(null);
        c0585b.Z(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i7, int i8) {
        this.f10095q.Z(i7, i8);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i7, int i8, int i9) {
        this.f10095q.Z(i8, i9);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        C0585B c0585b = this.f10095q;
        if (c0585b.f9453j0) {
            c0585b.k0(surfaceHolder.getSurface());
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        C0585B c0585b = this.f10095q;
        if (c0585b.f9453j0) {
            c0585b.k0(null);
        }
        c0585b.Z(0, 0);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
