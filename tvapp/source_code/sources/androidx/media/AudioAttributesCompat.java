package androidx.media;

import I0.c;
import android.util.SparseIntArray;
/* loaded from: classes.dex */
public class AudioAttributesCompat implements c {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f6842b = 0;

    /* renamed from: a  reason: collision with root package name */
    public AudioAttributesImpl f6843a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AudioAttributesCompat) {
            AudioAttributesImpl audioAttributesImpl = this.f6843a;
            AudioAttributesImpl audioAttributesImpl2 = ((AudioAttributesCompat) obj).f6843a;
            return audioAttributesImpl == null ? audioAttributesImpl2 == null : audioAttributesImpl.equals(audioAttributesImpl2);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6843a.hashCode();
    }

    public final String toString() {
        return this.f6843a.toString();
    }
}
