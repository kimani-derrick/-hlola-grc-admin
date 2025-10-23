package g2;

import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
/* renamed from: g2.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0718i extends AudioDeviceCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C0720k f10689a;

    public C0718i(C0720k c0720k) {
        this.f10689a = c0720k;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        C0720k c0720k = this.f10689a;
        C0720k.a(c0720k, C0716g.b((Context) c0720k.f10694b));
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        C0720k c0720k = this.f10689a;
        C0720k.a(c0720k, C0716g.b((Context) c0720k.f10694b));
    }
}
