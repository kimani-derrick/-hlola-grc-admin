package androidx.media;

import I0.a;
import android.media.AudioAttributes;
/* loaded from: classes.dex */
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(a aVar) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f6844a = (AudioAttributes) aVar.g(audioAttributesImplApi21.f6844a, 1);
        audioAttributesImplApi21.f6845b = aVar.f(audioAttributesImplApi21.f6845b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, a aVar) {
        aVar.getClass();
        aVar.k(audioAttributesImplApi21.f6844a, 1);
        aVar.j(audioAttributesImplApi21.f6845b, 2);
    }
}
