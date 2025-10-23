package w2;

import O3.E;
import Z2.AbstractC0156a;
import Z2.H;
import android.media.MediaCodecInfo;
import android.util.Pair;
import e2.K;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public abstract class y {

    /* renamed from: a  reason: collision with root package name */
    public static final Pattern f15864a = Pattern.compile("^\\D?(\\d+)$");

    /* renamed from: b  reason: collision with root package name */
    public static final HashMap f15865b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public static int f15866c = -1;

    public static void a(String str, ArrayList arrayList) {
        if ("audio/raw".equals(str)) {
            if (H.f4603a < 26 && H.f4604b.equals("R9") && arrayList.size() == 1 && ((C1392n) arrayList.get(0)).f15781a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayList.add(C1392n.h("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false));
            }
            Collections.sort(arrayList, new C1398t(new C1397s(1)));
        }
        int i7 = H.f4603a;
        if (i7 < 21 && arrayList.size() > 1) {
            String str2 = ((C1392n) arrayList.get(0)).f15781a;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                Collections.sort(arrayList, new C1398t(new C1397s(2)));
            }
        }
        if (i7 < 32 && arrayList.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((C1392n) arrayList.get(0)).f15781a)) {
            arrayList.add((C1392n) arrayList.remove(0));
        }
    }

    public static String b(K k5) {
        Pair d;
        if ("audio/eac3-joc".equals(k5.f9655B)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(k5.f9655B) && (d = d(k5)) != null) {
            int intValue = ((Integer) d.first).intValue();
            if (intValue != 16 && intValue != 256) {
                if (intValue == 512) {
                    return "video/avc";
                }
                return null;
            }
            return "video/hevc";
        }
        return null;
    }

    public static String c(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        String[] supportedTypes;
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        } else if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        } else {
            if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
                return "audio/x-lg-flac";
            }
            if (str2.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(str)) {
                return "audio/lg-ac3";
            }
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0367 A[Catch: NumberFormatException -> 0x0377, TRY_LEAVE, TryCatch #0 {NumberFormatException -> 0x0377, blocks: (B:249:0x0320, B:251:0x0332, B:263:0x0350, B:273:0x0367), top: B:559:0x0320 }] */
    /* JADX WARN: Removed duplicated region for block: B:434:0x058e  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x0595  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair d(e2.K r17) {
        /*
            Method dump skipped, instructions count: 2330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.y.d(e2.K):android.util.Pair");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [w2.w] */
    /* JADX WARN: Type inference failed for: r6v2, types: [H.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r8v3, types: [w2.w, java.lang.Object] */
    public static synchronized List e(String str, boolean z7, boolean z8) {
        ?? r62;
        int i7;
        synchronized (y.class) {
            try {
                C1399u c1399u = new C1399u(str, z7, z8);
                HashMap hashMap = f15865b;
                List list = (List) hashMap.get(c1399u);
                if (list != null) {
                    return list;
                }
                int i8 = H.f4603a;
                if (i8 >= 21) {
                    ?? obj = new Object();
                    if (!z7 && !z8) {
                        i7 = 0;
                        obj.f793q = i7;
                        r62 = obj;
                    }
                    i7 = 1;
                    obj.f793q = i7;
                    r62 = obj;
                } else {
                    r62 = new Object();
                }
                ArrayList f = f(c1399u, r62);
                if (z7 && f.isEmpty() && 21 <= i8 && i8 <= 23) {
                    f = f(c1399u, new Object());
                    if (!f.isEmpty()) {
                        AbstractC0156a.K("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((C1392n) f.get(0)).f15781a);
                    }
                }
                a(str, f);
                E s6 = E.s(f);
                hashMap.put(c1399u, s6);
                return s6;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
        if (r8 != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList f(w2.C1399u r23, w2.InterfaceC1401w r24) {
        /*
            Method dump skipped, instructions count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.y.f(w2.u, w2.w):java.util.ArrayList");
    }

    public static boolean g(MediaCodecInfo mediaCodecInfo, String str, boolean z7, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z7 && str.endsWith(".secure"))) {
            return false;
        }
        int i7 = H.f4603a;
        if (i7 < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i7 < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str)) {
            String str3 = H.f4604b;
            if ("a70".equals(str3) || ("Xiaomi".equals(H.f4605c) && str3.startsWith("HM"))) {
                return false;
            }
        }
        if (i7 == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
            String str4 = H.f4604b;
            if ("dlxu".equals(str4) || "protou".equals(str4) || "ville".equals(str4) || "villeplus".equals(str4) || "villec2".equals(str4) || str4.startsWith("gee") || "C6602".equals(str4) || "C6603".equals(str4) || "C6606".equals(str4) || "C6616".equals(str4) || "L36h".equals(str4) || "SO-02E".equals(str4)) {
                return false;
            }
        }
        if (i7 == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
            String str5 = H.f4604b;
            if ("C1504".equals(str5) || "C1505".equals(str5) || "C1604".equals(str5) || "C1605".equals(str5)) {
                return false;
            }
        }
        if (i7 < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(H.f4605c))) {
            String str6 = H.f4604b;
            if (str6.startsWith("zeroflte") || str6.startsWith("zerolte") || str6.startsWith("zenlte") || "SC-05G".equals(str6) || "marinelteatt".equals(str6) || "404SC".equals(str6) || "SC-04G".equals(str6) || "SCV31".equals(str6)) {
                return false;
            }
        }
        if (i7 <= 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(H.f4605c)) {
            String str7 = H.f4604b;
            if (str7.startsWith("d2") || str7.startsWith("serrano") || str7.startsWith("jflte") || str7.startsWith("santos") || str7.startsWith("t0")) {
                return false;
            }
        }
        if (i7 <= 19 && H.f4604b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
            return false;
        }
        if (i7 <= 23 && "audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) {
            return false;
        }
        return true;
    }

    public static boolean h(MediaCodecInfo mediaCodecInfo, String str) {
        boolean isSoftwareOnly;
        if (H.f4603a >= 29) {
            isSoftwareOnly = mediaCodecInfo.isSoftwareOnly();
            return isSoftwareOnly;
        } else if (Z2.r.i(str)) {
            return true;
        } else {
            String T6 = p6.l.T(mediaCodecInfo.getName());
            if (T6.startsWith("arc.")) {
                return false;
            }
            if (T6.startsWith("omx.google.") || T6.startsWith("omx.ffmpeg.")) {
                return true;
            }
            if ((T6.startsWith("omx.sec.") && T6.contains(".sw.")) || T6.equals("omx.qcom.video.decoder.hevcswvdec") || T6.startsWith("c2.android.") || T6.startsWith("c2.google.")) {
                return true;
            }
            if (!T6.startsWith("omx.") && !T6.startsWith("c2.")) {
                return true;
            }
            return false;
        }
    }

    public static int i() {
        C1392n c1392n;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int i7;
        int i8;
        if (f15866c == -1) {
            int i9 = 0;
            List e3 = e("video/avc", false, false);
            if (e3.isEmpty()) {
                c1392n = null;
            } else {
                c1392n = (C1392n) e3.get(0);
            }
            if (c1392n != null) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = c1392n.d;
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                int length = codecProfileLevelArr.length;
                int i10 = 0;
                while (i9 < length) {
                    int i11 = codecProfileLevelArr[i9].level;
                    if (i11 != 1 && i11 != 2) {
                        switch (i11) {
                            case 8:
                            case 16:
                            case 32:
                                i8 = 101376;
                                continue;
                            case 64:
                                i8 = 202752;
                                continue;
                            case 128:
                            case 256:
                                i8 = 414720;
                                continue;
                            case 512:
                                i8 = 921600;
                                continue;
                            case 1024:
                                i8 = 1310720;
                                continue;
                            case 2048:
                            case 4096:
                                i8 = 2097152;
                                continue;
                            case 8192:
                                i8 = 2228224;
                                continue;
                            case 16384:
                                i8 = 5652480;
                                continue;
                            case 32768:
                            case 65536:
                                i8 = 9437184;
                                continue;
                            case 131072:
                            case 262144:
                            case 524288:
                                i8 = 35651584;
                                continue;
                            default:
                                i8 = -1;
                                continue;
                        }
                    } else {
                        i8 = 25344;
                    }
                    i10 = Math.max(i8, i10);
                    i9++;
                }
                if (H.f4603a >= 21) {
                    i7 = 345600;
                } else {
                    i7 = 172800;
                }
                i9 = Math.max(i10, i7);
            }
            f15866c = i9;
        }
        return f15866c;
    }
}
