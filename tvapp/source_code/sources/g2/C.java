package g2;

import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
/* loaded from: classes.dex */
public abstract class C {
    public static void a(AudioTrack audioTrack, E e3) {
        AudioDeviceInfo audioDeviceInfo;
        if (e3 == null) {
            audioDeviceInfo = null;
        } else {
            audioDeviceInfo = e3.f10516a;
        }
        audioTrack.setPreferredDevice(audioDeviceInfo);
    }
}
