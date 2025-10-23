package e2;

import android.media.AudioManager;
import android.os.Handler;
/* renamed from: e2.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0596b implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final Handler f9842a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0598c f9843b;

    public C0596b(C0598c c0598c, Handler handler) {
        this.f9843b = c0598c;
        this.f9842a = handler;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i7) {
        this.f9842a.post(new C.n(i7, 1, this));
    }
}
