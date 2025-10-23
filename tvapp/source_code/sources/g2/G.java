package g2;

import android.media.AudioAttributes;
import android.media.AudioTrack;
/* loaded from: classes.dex */
public final class G {

    /* renamed from: a  reason: collision with root package name */
    public final e2.K f10522a;

    /* renamed from: b  reason: collision with root package name */
    public final int f10523b;

    /* renamed from: c  reason: collision with root package name */
    public final int f10524c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public final int f10525e;
    public final int f;

    /* renamed from: g  reason: collision with root package name */
    public final int f10526g;

    /* renamed from: h  reason: collision with root package name */
    public final int f10527h;

    /* renamed from: i  reason: collision with root package name */
    public final C0721l f10528i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f10529j;

    public G(e2.K k5, int i7, int i8, int i9, int i10, int i11, int i12, int i13, C0721l c0721l, boolean z7) {
        this.f10522a = k5;
        this.f10523b = i7;
        this.f10524c = i8;
        this.d = i9;
        this.f10525e = i10;
        this.f = i11;
        this.f10526g = i12;
        this.f10527h = i13;
        this.f10528i = c0721l;
        this.f10529j = z7;
    }

    public static AudioAttributes c(C0713d c0713d, boolean z7) {
        if (z7) {
            return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        }
        return (AudioAttributes) c0713d.a().f4918q;
    }

    public final AudioTrack a(boolean z7, C0713d c0713d, int i7) {
        boolean z8;
        boolean z9;
        int i8 = this.f10524c;
        try {
            AudioTrack b7 = b(z7, c0713d, i7);
            int state = b7.getState();
            if (state == 1) {
                return b7;
            }
            try {
                b7.release();
            } catch (Exception unused) {
            }
            if (i8 == 1) {
                z9 = true;
            } else {
                z9 = false;
            }
            throw new C0728t(state, this.f10525e, this.f, this.f10527h, this.f10522a, z9, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e3) {
            if (i8 == 1) {
                z8 = true;
            } else {
                z8 = false;
            }
            throw new C0728t(0, this.f10525e, this.f, this.f10527h, this.f10522a, z8, e3);
        }
    }

    public final AudioTrack b(boolean z7, C0713d c0713d, int i7) {
        int i8;
        int i9;
        AudioTrack.Builder offloadedPlayback;
        int i10 = Z2.H.f4603a;
        boolean z8 = false;
        int i11 = this.f10526g;
        int i12 = this.f;
        int i13 = this.f10525e;
        if (i10 >= 29) {
            AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(c(c0713d, z7)).setAudioFormat(K.f(i13, i12, i11)).setTransferMode(1).setBufferSizeInBytes(this.f10527h).setSessionId(i7);
            if (this.f10524c == 1) {
                z8 = true;
            }
            offloadedPlayback = sessionId.setOffloadedPlayback(z8);
            return offloadedPlayback.build();
        } else if (i10 >= 21) {
            return new AudioTrack(c(c0713d, z7), K.f(i13, i12, i11), this.f10527h, 1, i7);
        } else {
            int i14 = c0713d.f10680s;
            if (i14 != 13) {
                switch (i14) {
                    case 2:
                        i8 = 0;
                        break;
                    case 3:
                        i9 = 8;
                        i8 = i9;
                        break;
                    case 4:
                        i9 = 4;
                        i8 = i9;
                        break;
                    case 5:
                    case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                    case 8:
                    case 9:
                    case 10:
                        i9 = 5;
                        i8 = i9;
                        break;
                    case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                        i9 = 2;
                        i8 = i9;
                        break;
                    default:
                        i9 = 3;
                        i8 = i9;
                        break;
                }
            } else {
                i8 = 1;
            }
            if (i7 == 0) {
                return new AudioTrack(i8, this.f10525e, this.f, this.f10526g, this.f10527h, 1);
            }
            return new AudioTrack(i8, this.f10525e, this.f, this.f10526g, this.f10527h, 1, i7);
        }
    }
}
