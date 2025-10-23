package i2;

import Z2.H;
import android.media.MediaCodec;
import androidx.fragment.app.D;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public byte[] f11332a;

    /* renamed from: b  reason: collision with root package name */
    public byte[] f11333b;

    /* renamed from: c  reason: collision with root package name */
    public int f11334c;
    public int[] d;

    /* renamed from: e  reason: collision with root package name */
    public int[] f11335e;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public int f11336g;

    /* renamed from: h  reason: collision with root package name */
    public int f11337h;

    /* renamed from: i  reason: collision with root package name */
    public final MediaCodec.CryptoInfo f11338i;

    /* renamed from: j  reason: collision with root package name */
    public final D f11339j;

    public c() {
        D d;
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f11338i = cryptoInfo;
        if (H.f4603a >= 24) {
            d = new D(cryptoInfo);
        } else {
            d = null;
        }
        this.f11339j = d;
    }
}
