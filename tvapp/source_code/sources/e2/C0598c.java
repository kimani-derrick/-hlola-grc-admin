package e2;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import g2.C0713d;
/* renamed from: e2.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0598c {

    /* renamed from: a  reason: collision with root package name */
    public final AudioManager f9909a;

    /* renamed from: b  reason: collision with root package name */
    public final C0596b f9910b;

    /* renamed from: c  reason: collision with root package name */
    public SurfaceHolder$CallbackC0629y f9911c;
    public C0713d d;

    /* renamed from: e  reason: collision with root package name */
    public int f9912e;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public float f9913g = 1.0f;

    /* renamed from: h  reason: collision with root package name */
    public AudioFocusRequest f9914h;

    public C0598c(Context context, Handler handler, SurfaceHolder$CallbackC0629y surfaceHolder$CallbackC0629y) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        audioManager.getClass();
        this.f9909a = audioManager;
        this.f9911c = surfaceHolder$CallbackC0629y;
        this.f9910b = new C0596b(this, handler);
        this.f9912e = 0;
    }

    public final void a() {
        if (this.f9912e == 0) {
            return;
        }
        int i7 = Z2.H.f4603a;
        AudioManager audioManager = this.f9909a;
        if (i7 >= 26) {
            AudioFocusRequest audioFocusRequest = this.f9914h;
            if (audioFocusRequest != null) {
                audioManager.abandonAudioFocusRequest(audioFocusRequest);
            }
        } else {
            audioManager.abandonAudioFocus(this.f9910b);
        }
        c(0);
    }

    public final void b() {
        if (!Z2.H.a(this.d, null)) {
            this.d = null;
            this.f = 0;
        }
    }

    public final void c(int i7) {
        float f;
        if (this.f9912e == i7) {
            return;
        }
        this.f9912e = i7;
        if (i7 == 3) {
            f = 0.2f;
        } else {
            f = 1.0f;
        }
        if (this.f9913g == f) {
            return;
        }
        this.f9913g = f;
        SurfaceHolder$CallbackC0629y surfaceHolder$CallbackC0629y = this.f9911c;
        if (surfaceHolder$CallbackC0629y != null) {
            C0585B c0585b = surfaceHolder$CallbackC0629y.f10095q;
            c0585b.e0(1, 2, Float.valueOf(c0585b.f9459p0 * c0585b.f9435Q.f9913g));
        }
    }

    public final int d(int i7, boolean z7) {
        int i8;
        int requestAudioFocus;
        AudioFocusRequest.Builder i9;
        boolean z8;
        AudioFocusRequest.Builder audioAttributes;
        AudioFocusRequest.Builder willPauseWhenDucked;
        AudioFocusRequest.Builder onAudioFocusChangeListener;
        AudioFocusRequest build;
        int i10 = 1;
        if (i7 != 1 && this.f == 1) {
            if (!z7) {
                return -1;
            }
            if (this.f9912e != 1) {
                int i11 = Z2.H.f4603a;
                AudioManager audioManager = this.f9909a;
                C0596b c0596b = this.f9910b;
                if (i11 >= 26) {
                    AudioFocusRequest audioFocusRequest = this.f9914h;
                    if (audioFocusRequest == null) {
                        F1.b.s();
                        if (audioFocusRequest == null) {
                            i9 = F1.b.e(this.f);
                        } else {
                            i9 = F1.b.i(this.f9914h);
                        }
                        C0713d c0713d = this.d;
                        if (c0713d != null && c0713d.f10678q == 1) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        c0713d.getClass();
                        audioAttributes = i9.setAudioAttributes((AudioAttributes) c0713d.a().f4918q);
                        willPauseWhenDucked = audioAttributes.setWillPauseWhenDucked(z8);
                        onAudioFocusChangeListener = willPauseWhenDucked.setOnAudioFocusChangeListener(c0596b);
                        build = onAudioFocusChangeListener.build();
                        this.f9914h = build;
                    }
                    requestAudioFocus = audioManager.requestAudioFocus(this.f9914h);
                } else {
                    C0713d c0713d2 = this.d;
                    c0713d2.getClass();
                    int i12 = c0713d2.f10680s;
                    if (i12 != 13) {
                        switch (i12) {
                            case 2:
                                i8 = 0;
                                break;
                            case 3:
                                i8 = 8;
                                break;
                            case 4:
                                i8 = 4;
                                break;
                            case 5:
                            case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                            case 8:
                            case 9:
                            case 10:
                                i8 = 5;
                                break;
                            case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                                i8 = 2;
                                break;
                            default:
                                i8 = 3;
                                break;
                        }
                    } else {
                        i8 = 1;
                    }
                    requestAudioFocus = audioManager.requestAudioFocus(c0596b, i8, this.f);
                }
                if (requestAudioFocus == 1) {
                    c(1);
                } else {
                    c(0);
                    i10 = -1;
                }
            }
            return i10;
        }
        a();
        if (z7) {
            return 1;
        }
        return -1;
    }
}
