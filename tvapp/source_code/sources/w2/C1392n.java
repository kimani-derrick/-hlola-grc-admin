package w2;

import Z2.AbstractC0156a;
import Z2.H;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import e2.K;
import r0.AbstractC1111a;
/* renamed from: w2.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1392n {

    /* renamed from: a  reason: collision with root package name */
    public final String f15781a;

    /* renamed from: b  reason: collision with root package name */
    public final String f15782b;

    /* renamed from: c  reason: collision with root package name */
    public final String f15783c;
    public final MediaCodecInfo.CodecCapabilities d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f15784e;
    public final boolean f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f15785g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f15786h;

    public C1392n(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z7, boolean z8, boolean z9) {
        str.getClass();
        this.f15781a = str;
        this.f15782b = str2;
        this.f15783c = str3;
        this.d = codecCapabilities;
        this.f15785g = z7;
        this.f15784e = z8;
        this.f = z9;
        this.f15786h = Z2.r.k(str2);
    }

    public static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i7, int i8, double d) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point(H.g(i7, widthAlignment) * widthAlignment, H.g(i8, heightAlignment) * heightAlignment);
        int i9 = point.x;
        int i10 = point.y;
        if (d != -1.0d && d >= 1.0d) {
            return videoCapabilities.areSizeAndRateSupported(i9, i10, Math.floor(d));
        }
        return videoCapabilities.isSizeSupported(i9, i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
        if ("Nexus 10".equals(r1) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
        if ("OMX.Exynos.AVC.Decoder.secure".equals(r8) == false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static w2.C1392n h(java.lang.String r8, java.lang.String r9, java.lang.String r10, android.media.MediaCodecInfo.CodecCapabilities r11, boolean r12, boolean r13, boolean r14, boolean r15) {
        /*
            w2.n r13 = new w2.n
            r14 = 0
            r0 = 1
            if (r11 == 0) goto L3d
            int r1 = Z2.H.f4603a
            r2 = 19
            if (r1 < r2) goto L3d
            java.lang.String r2 = "adaptive-playback"
            boolean r2 = r11.isFeatureSupported(r2)
            if (r2 == 0) goto L3d
            r2 = 22
            if (r1 > r2) goto L3b
            java.lang.String r1 = Z2.H.d
            java.lang.String r2 = "ODROID-XU3"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L2a
            java.lang.String r2 = "Nexus 10"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L3b
        L2a:
            java.lang.String r1 = "OMX.Exynos.AVC.Decoder"
            boolean r1 = r1.equals(r8)
            if (r1 != 0) goto L3d
            java.lang.String r1 = "OMX.Exynos.AVC.Decoder.secure"
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L3b
            goto L3d
        L3b:
            r6 = r0
            goto L3e
        L3d:
            r6 = r14
        L3e:
            r1 = 21
            if (r11 == 0) goto L4c
            int r2 = Z2.H.f4603a
            if (r2 < r1) goto L4c
            java.lang.String r2 = "tunneled-playback"
            boolean r2 = r11.isFeatureSupported(r2)
        L4c:
            if (r15 != 0) goto L5f
            if (r11 == 0) goto L5d
            int r15 = Z2.H.f4603a
            if (r15 < r1) goto L5d
            java.lang.String r15 = "secure-playback"
            boolean r15 = r11.isFeatureSupported(r15)
            if (r15 == 0) goto L5d
            goto L5f
        L5d:
            r7 = r14
            goto L60
        L5f:
            r7 = r0
        L60:
            r0 = r13
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.C1392n.h(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean, boolean):w2.n");
    }

    public final i2.i b(K k5, K k7) {
        int i7;
        int i8;
        if (!H.a(k5.f9655B, k7.f9655B)) {
            i7 = 8;
        } else {
            i7 = 0;
        }
        if (this.f15786h) {
            if (k5.f9662J != k7.f9662J) {
                i7 |= 1024;
            }
            if (!this.f15784e && (k5.f9659G != k7.f9659G || k5.f9660H != k7.f9660H)) {
                i7 |= 512;
            }
            if (!H.a(k5.f9666N, k7.f9666N)) {
                i7 |= 2048;
            }
            if (H.d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.f15781a) && !k5.c(k7)) {
                i7 |= 2;
            }
            if (i7 == 0) {
                if (k5.c(k7)) {
                    i8 = 3;
                } else {
                    i8 = 2;
                }
                return new i2.i(this.f15781a, k5, k7, i8, 0);
            }
        } else {
            if (k5.f9667O != k7.f9667O) {
                i7 |= 4096;
            }
            if (k5.f9668P != k7.f9668P) {
                i7 |= 8192;
            }
            if (k5.f9669Q != k7.f9669Q) {
                i7 |= 16384;
            }
            String str = this.f15782b;
            if (i7 == 0 && "audio/mp4a-latm".equals(str)) {
                Pair d = y.d(k5);
                Pair d7 = y.d(k7);
                if (d != null && d7 != null) {
                    int intValue = ((Integer) d.first).intValue();
                    int intValue2 = ((Integer) d7.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new i2.i(this.f15781a, k5, k7, 3, 0);
                    }
                }
            }
            if (!k5.c(k7)) {
                i7 |= 32;
            }
            if ("audio/opus".equals(str)) {
                i7 |= 2;
            }
            if (i7 == 0) {
                return new i2.i(this.f15781a, k5, k7, 1, 0);
            }
        }
        return new i2.i(this.f15781a, k5, k7, 0, i7);
    }

    public final boolean c(K k5, boolean z7) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int i7;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        Pair d = y.d(k5);
        if (d == null) {
            return true;
        }
        int intValue = ((Integer) d.first).intValue();
        int intValue2 = ((Integer) d.second).intValue();
        boolean equals = "video/dolby-vision".equals(k5.f9655B);
        int i8 = 8;
        String str = this.f15782b;
        if (equals) {
            if ("video/avc".equals(str)) {
                intValue2 = 0;
                intValue = 8;
            } else if ("video/hevc".equals(str)) {
                intValue2 = 0;
                intValue = 2;
            }
        }
        if (!this.f15786h && intValue != 42) {
            return true;
        }
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
        }
        if (H.f4603a <= 23 && "video/x-vnd.on2.vp9".equals(str) && codecProfileLevelArr.length == 0) {
            if (codecCapabilities != null && (videoCapabilities = codecCapabilities.getVideoCapabilities()) != null) {
                i7 = videoCapabilities.getBitrateRange().getUpper().intValue();
            } else {
                i7 = 0;
            }
            if (i7 >= 180000000) {
                i8 = 1024;
            } else if (i7 >= 120000000) {
                i8 = 512;
            } else if (i7 >= 60000000) {
                i8 = 256;
            } else if (i7 >= 30000000) {
                i8 = 128;
            } else if (i7 >= 18000000) {
                i8 = 64;
            } else if (i7 >= 12000000) {
                i8 = 32;
            } else if (i7 >= 7200000) {
                i8 = 16;
            } else if (i7 < 3600000) {
                if (i7 >= 1800000) {
                    i8 = 4;
                } else if (i7 >= 800000) {
                    i8 = 2;
                } else {
                    i8 = 1;
                }
            }
            MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
            codecProfileLevel.profile = 1;
            codecProfileLevel.level = i8;
            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : codecProfileLevelArr) {
            if (codecProfileLevel2.profile == intValue && (codecProfileLevel2.level >= intValue2 || !z7)) {
                if ("video/hevc".equals(str) && 2 == intValue) {
                    String str2 = H.f4604b;
                    if (!"sailfish".equals(str2) && !"marlin".equals(str2)) {
                    }
                }
                return true;
            }
        }
        g("codec.profileLevel, " + k5.f9684y + ", " + this.f15783c);
        return false;
    }

    public final boolean d(K k5) {
        boolean z7;
        int i7;
        String str;
        String str2;
        int i8;
        String str3 = k5.f9655B;
        String str4 = this.f15782b;
        boolean z8 = true;
        if (!str4.equals(str3) && !str4.equals(y.b(k5))) {
            z7 = false;
        } else {
            z7 = true;
        }
        if (!z7 || !c(k5, true)) {
            return false;
        }
        if (this.f15786h) {
            int i9 = k5.f9659G;
            if (i9 > 0 && (i8 = k5.f9660H) > 0) {
                if (H.f4603a >= 21) {
                    return f(i9, i8, k5.f9661I);
                }
                if (i9 * i8 > y.i()) {
                    z8 = false;
                }
                if (!z8) {
                    g("legacyFrameSize, " + i9 + "x" + i8);
                }
            }
            return z8;
        }
        int i10 = H.f4603a;
        if (i10 < 21) {
            return true;
        }
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        int i11 = k5.f9668P;
        if (i11 != -1) {
            if (codecCapabilities == null) {
                str2 = "sampleRate.caps";
            } else {
                MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities == null) {
                    str2 = "sampleRate.aCaps";
                } else if (!audioCapabilities.isSampleRateSupported(i11)) {
                    str2 = "sampleRate.support, " + i11;
                }
            }
            g(str2);
            return false;
        }
        int i12 = k5.f9667O;
        if (i12 == -1) {
            return true;
        }
        if (codecCapabilities == null) {
            str = "channelCount.caps";
        } else {
            MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities2 == null) {
                str = "channelCount.aCaps";
            } else {
                int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                if (maxInputChannelCount <= 1 && ((i10 < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str4) && !"audio/3gpp".equals(str4) && !"audio/amr-wb".equals(str4) && !"audio/mp4a-latm".equals(str4) && !"audio/vorbis".equals(str4) && !"audio/opus".equals(str4) && !"audio/raw".equals(str4) && !"audio/flac".equals(str4) && !"audio/g711-alaw".equals(str4) && !"audio/g711-mlaw".equals(str4) && !"audio/gsm".equals(str4))) {
                    if ("audio/ac3".equals(str4)) {
                        i7 = 6;
                    } else if ("audio/eac3".equals(str4)) {
                        i7 = 16;
                    } else {
                        i7 = 30;
                    }
                    AbstractC0156a.K("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + this.f15781a + ", [" + maxInputChannelCount + " to " + i7 + "]");
                    maxInputChannelCount = i7;
                }
                if (maxInputChannelCount >= i12) {
                    return true;
                }
                g("channelCount.support, " + i12);
                return false;
            }
        }
        g(str);
        return false;
    }

    public final boolean e(K k5) {
        if (this.f15786h) {
            return this.f15784e;
        }
        Pair d = y.d(k5);
        if (d != null && ((Integer) d.first).intValue() == 42) {
            return true;
        }
        return false;
    }

    public final boolean f(int i7, int i8, double d) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null) {
            g("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            g("sizeAndRate.vCaps");
            return false;
        }
        if (H.f4603a >= 29) {
            int a7 = AbstractC1391m.a(videoCapabilities, i7, i8, d);
            if (a7 == 2) {
                return true;
            }
            if (a7 == 1) {
                g("sizeAndRate.cover, " + i7 + "x" + i8 + "@" + d);
                return false;
            }
        }
        if (!a(videoCapabilities, i7, i8, d)) {
            if (i7 < i8) {
                String str = this.f15781a;
                if ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(H.f4604b)) && a(videoCapabilities, i8, i7, d)) {
                    AbstractC0156a.p("MediaCodecInfo", "AssumedSupport [" + ("sizeAndRate.rotated, " + i7 + "x" + i8 + "@" + d) + "] [" + str + ", " + this.f15782b + "] [" + H.f4606e + "]");
                }
            }
            g("sizeAndRate.support, " + i7 + "x" + i8 + "@" + d);
            return false;
        }
        return true;
    }

    public final void g(String str) {
        StringBuilder u7 = AbstractC1111a.u("NoSupport [", str, "] [");
        u7.append(this.f15781a);
        u7.append(", ");
        u7.append(this.f15782b);
        u7.append("] [");
        u7.append(H.f4606e);
        u7.append("]");
        AbstractC0156a.p("MediaCodecInfo", u7.toString());
    }

    public final String toString() {
        return this.f15781a;
    }
}
