package androidx.media;

import android.media.AudioAttributes;
/* loaded from: classes.dex */
public class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* renamed from: a  reason: collision with root package name */
    public AudioAttributes f6844a;

    /* renamed from: b  reason: collision with root package name */
    public int f6845b = -1;

    public final boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.f6844a.equals(((AudioAttributesImplApi21) obj).f6844a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6844a.hashCode();
    }

    public final String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f6844a;
    }
}
