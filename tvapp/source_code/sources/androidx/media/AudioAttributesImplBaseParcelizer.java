package androidx.media;

import I0.a;
/* loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(a aVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f6846a = aVar.f(audioAttributesImplBase.f6846a, 1);
        audioAttributesImplBase.f6847b = aVar.f(audioAttributesImplBase.f6847b, 2);
        audioAttributesImplBase.f6848c = aVar.f(audioAttributesImplBase.f6848c, 3);
        audioAttributesImplBase.d = aVar.f(audioAttributesImplBase.d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, a aVar) {
        aVar.getClass();
        aVar.j(audioAttributesImplBase.f6846a, 1);
        aVar.j(audioAttributesImplBase.f6847b, 2);
        aVar.j(audioAttributesImplBase.f6848c, 3);
        aVar.j(audioAttributesImplBase.d, 4);
    }
}
