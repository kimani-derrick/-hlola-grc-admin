package g2;

import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
/* loaded from: classes.dex */
public abstract class M {
    public static void a(InterfaceC0730v interfaceC0730v, Object obj) {
        E e3;
        AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
        K k5 = (K) interfaceC0730v;
        if (audioDeviceInfo == null) {
            e3 = null;
        } else {
            k5.getClass();
            e3 = new E(audioDeviceInfo);
        }
        k5.f10561Z = e3;
        AudioTrack audioTrack = k5.f10586v;
        if (audioTrack != null) {
            C.a(audioTrack, e3);
        }
    }
}
