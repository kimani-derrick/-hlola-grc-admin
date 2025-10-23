package g2;

import O3.AbstractC0080y;
import O3.X;
import O3.Y;
import O3.Z;
import O3.i0;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
/* renamed from: g2.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0715f {

    /* renamed from: a  reason: collision with root package name */
    public static final AudioAttributes f10684a = new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build();

    /* JADX WARN: Type inference failed for: r0v1, types: [O3.y, O3.B] */
    public static O3.E a() {
        boolean isDirectPlaybackSupported;
        O3.C c5 = O3.E.f2597r;
        ?? abstractC0080y = new AbstractC0080y();
        Z z7 = C0716g.f10686e;
        X x7 = z7.f2636r;
        if (x7 == null) {
            X x8 = new X(z7, new Y(z7.f2639u, 0, z7.f2640v));
            z7.f2636r = x8;
            x7 = x8;
        }
        i0 n = x7.n();
        while (n.hasNext()) {
            Integer num = (Integer) n.next();
            int intValue = num.intValue();
            if (Z2.H.f4603a >= 34 || intValue != 30) {
                isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(48000).build(), f10684a);
                if (isDirectPlaybackSupported) {
                    abstractC0080y.a(num);
                }
            }
        }
        abstractC0080y.a(2);
        return abstractC0080y.h();
    }

    public static int b(int i7, int i8) {
        boolean isDirectPlaybackSupported;
        for (int i9 = 10; i9 > 0; i9--) {
            isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i7).setSampleRate(i8).setChannelMask(Z2.H.p(i9)).build(), f10684a);
            if (isDirectPlaybackSupported) {
                return i9;
            }
        }
        return 0;
    }
}
