package w2;

import e2.K;
/* renamed from: w2.p  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1394p extends Exception {

    /* renamed from: q  reason: collision with root package name */
    public final String f15787q;

    /* renamed from: r  reason: collision with root package name */
    public final boolean f15788r;

    /* renamed from: s  reason: collision with root package name */
    public final C1392n f15789s;

    /* renamed from: t  reason: collision with root package name */
    public final String f15790t;

    public C1394p(K k5, C1400v c1400v, boolean z7, int i7) {
        this("Decoder init failed: [" + i7 + "], " + k5, c1400v, k5.f9655B, z7, null, "com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_" + (i7 < 0 ? "neg_" : "") + Math.abs(i7));
    }

    public C1394p(String str, Throwable th, String str2, boolean z7, C1392n c1392n, String str3) {
        super(str, th);
        this.f15787q = str2;
        this.f15788r = z7;
        this.f15789s = c1392n;
        this.f15790t = str3;
    }
}
