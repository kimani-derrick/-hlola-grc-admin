package g2;

import O3.AbstractC0080y;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
/* renamed from: g2.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0714e {
    /* JADX WARN: Type inference failed for: r3v0, types: [O3.G, O3.y] */
    private static final O3.H a() {
        ?? abstractC0080y = new AbstractC0080y();
        abstractC0080y.b(8, 7);
        int i7 = Z2.H.f4603a;
        if (i7 >= 31) {
            abstractC0080y.b(26, 27);
        }
        if (i7 >= 33) {
            abstractC0080y.a(30);
        }
        return abstractC0080y.i();
    }

    public static final boolean b(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        audioManager.getClass();
        AudioDeviceInfo[] devices = audioManager.getDevices(2);
        O3.H a7 = a();
        for (AudioDeviceInfo audioDeviceInfo : devices) {
            if (a7.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                return true;
            }
        }
        return false;
    }
}
