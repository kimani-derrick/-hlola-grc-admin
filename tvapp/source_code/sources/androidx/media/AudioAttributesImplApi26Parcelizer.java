package androidx.media;

import I0.a;
import android.media.AudioAttributes;
/* loaded from: classes.dex */
public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(a aVar) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.f6844a = (AudioAttributes) aVar.g(audioAttributesImplApi26.f6844a, 1);
        audioAttributesImplApi26.f6845b = aVar.f(audioAttributesImplApi26.f6845b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, a aVar) {
        aVar.getClass();
        aVar.k(audioAttributesImplApi26.f6844a, 1);
        aVar.j(audioAttributesImplApi26.f6845b, 2);
    }
}
