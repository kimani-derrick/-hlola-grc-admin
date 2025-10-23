package androidx.media;

import I0.a;
import I0.c;
/* loaded from: classes.dex */
public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(a aVar) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        c cVar = audioAttributesCompat.f6843a;
        if (aVar.e(1)) {
            cVar = aVar.h();
        }
        audioAttributesCompat.f6843a = (AudioAttributesImpl) cVar;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, a aVar) {
        aVar.getClass();
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.f6843a;
        aVar.i(1);
        aVar.l(audioAttributesImpl);
    }
}
