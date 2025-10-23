package L2;

import H2.C0002c;
import K2.t;
import K2.u;
import Y2.C0146o;
import Y2.O;
import Z2.AbstractC0156a;
import Z2.H;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import e2.AbstractC0606g;
import e2.C0593J;
import e2.K;
import e2.m0;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import x2.C1461c;
/* loaded from: classes.dex */
public final class o implements O {

    /* renamed from: q  reason: collision with root package name */
    public final l f2053q;

    /* renamed from: r  reason: collision with root package name */
    public final i f2054r;

    /* renamed from: s  reason: collision with root package name */
    public static final Pattern f2045s = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");

    /* renamed from: t  reason: collision with root package name */
    public static final Pattern f2046t = Pattern.compile("VIDEO=\"(.+?)\"");

    /* renamed from: u  reason: collision with root package name */
    public static final Pattern f2047u = Pattern.compile("AUDIO=\"(.+?)\"");

    /* renamed from: v  reason: collision with root package name */
    public static final Pattern f2048v = Pattern.compile("SUBTITLES=\"(.+?)\"");

    /* renamed from: w  reason: collision with root package name */
    public static final Pattern f2049w = Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");

    /* renamed from: x  reason: collision with root package name */
    public static final Pattern f2050x = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");

    /* renamed from: y  reason: collision with root package name */
    public static final Pattern f2051y = Pattern.compile("CHANNELS=\"(.+?)\"");

    /* renamed from: z  reason: collision with root package name */
    public static final Pattern f2052z = Pattern.compile("CODECS=\"(.+?)\"");

    /* renamed from: A  reason: collision with root package name */
    public static final Pattern f2003A = Pattern.compile("RESOLUTION=(\\d+x\\d+)");

    /* renamed from: B  reason: collision with root package name */
    public static final Pattern f2004B = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");

    /* renamed from: C  reason: collision with root package name */
    public static final Pattern f2005C = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");

    /* renamed from: D  reason: collision with root package name */
    public static final Pattern f2006D = Pattern.compile("DURATION=([\\d\\.]+)\\b");

    /* renamed from: E  reason: collision with root package name */
    public static final Pattern f2007E = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");
    public static final Pattern F = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");

    /* renamed from: G  reason: collision with root package name */
    public static final Pattern f2008G = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");

    /* renamed from: H  reason: collision with root package name */
    public static final Pattern f2009H = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");

    /* renamed from: I  reason: collision with root package name */
    public static final Pattern f2010I = a("CAN-SKIP-DATERANGES");

    /* renamed from: J  reason: collision with root package name */
    public static final Pattern f2011J = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");

    /* renamed from: K  reason: collision with root package name */
    public static final Pattern f2012K = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");

    /* renamed from: L  reason: collision with root package name */
    public static final Pattern f2013L = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");

    /* renamed from: M  reason: collision with root package name */
    public static final Pattern f2014M = a("CAN-BLOCK-RELOAD");

    /* renamed from: N  reason: collision with root package name */
    public static final Pattern f2015N = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");

    /* renamed from: O  reason: collision with root package name */
    public static final Pattern f2016O = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");

    /* renamed from: P  reason: collision with root package name */
    public static final Pattern f2017P = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");

    /* renamed from: Q  reason: collision with root package name */
    public static final Pattern f2018Q = Pattern.compile("LAST-MSN=(\\d+)\\b");

    /* renamed from: R  reason: collision with root package name */
    public static final Pattern f2019R = Pattern.compile("LAST-PART=(\\d+)\\b");

    /* renamed from: S  reason: collision with root package name */
    public static final Pattern f2020S = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");

    /* renamed from: T  reason: collision with root package name */
    public static final Pattern f2021T = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");

    /* renamed from: U  reason: collision with root package name */
    public static final Pattern f2022U = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");

    /* renamed from: V  reason: collision with root package name */
    public static final Pattern f2023V = Pattern.compile("BYTERANGE-START=(\\d+)\\b");
    public static final Pattern W = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");

    /* renamed from: X  reason: collision with root package name */
    public static final Pattern f2024X = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");

    /* renamed from: Y  reason: collision with root package name */
    public static final Pattern f2025Y = Pattern.compile("KEYFORMAT=\"(.+?)\"");

    /* renamed from: Z  reason: collision with root package name */
    public static final Pattern f2026Z = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");

    /* renamed from: a0  reason: collision with root package name */
    public static final Pattern f2027a0 = Pattern.compile("URI=\"(.+?)\"");

    /* renamed from: b0  reason: collision with root package name */
    public static final Pattern f2028b0 = Pattern.compile("IV=([^,.*]+)");

    /* renamed from: c0  reason: collision with root package name */
    public static final Pattern f2029c0 = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");

    /* renamed from: d0  reason: collision with root package name */
    public static final Pattern f2030d0 = Pattern.compile("TYPE=(PART|MAP)");

    /* renamed from: e0  reason: collision with root package name */
    public static final Pattern f2031e0 = Pattern.compile("LANGUAGE=\"(.+?)\"");

    /* renamed from: f0  reason: collision with root package name */
    public static final Pattern f2032f0 = Pattern.compile("NAME=\"(.+?)\"");

    /* renamed from: g0  reason: collision with root package name */
    public static final Pattern f2033g0 = Pattern.compile("GROUP-ID=\"(.+?)\"");

    /* renamed from: h0  reason: collision with root package name */
    public static final Pattern f2034h0 = Pattern.compile("CHARACTERISTICS=\"(.+?)\"");

    /* renamed from: i0  reason: collision with root package name */
    public static final Pattern f2035i0 = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");

    /* renamed from: j0  reason: collision with root package name */
    public static final Pattern f2036j0 = a("AUTOSELECT");

    /* renamed from: k0  reason: collision with root package name */
    public static final Pattern f2037k0 = a("DEFAULT");

    /* renamed from: l0  reason: collision with root package name */
    public static final Pattern f2038l0 = a("FORCED");

    /* renamed from: m0  reason: collision with root package name */
    public static final Pattern f2039m0 = a("INDEPENDENT");

    /* renamed from: n0  reason: collision with root package name */
    public static final Pattern f2040n0 = a("GAP");

    /* renamed from: o0  reason: collision with root package name */
    public static final Pattern f2041o0 = a("PRECISE");

    /* renamed from: p0  reason: collision with root package name */
    public static final Pattern f2042p0 = Pattern.compile("VALUE=\"(.+?)\"");

    /* renamed from: q0  reason: collision with root package name */
    public static final Pattern f2043q0 = Pattern.compile("IMPORT=\"(.+?)\"");

    /* renamed from: r0  reason: collision with root package name */
    public static final Pattern f2044r0 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    public o(l lVar, i iVar) {
        this.f2053q = lVar;
        this.f2054r = iVar;
    }

    public static Pattern a(String str) {
        return Pattern.compile(str.concat("=(NO|YES)"));
    }

    public static j2.i b(String str, j2.h[] hVarArr) {
        j2.h[] hVarArr2 = new j2.h[hVarArr.length];
        for (int i7 = 0; i7 < hVarArr.length; i7++) {
            j2.h hVar = hVarArr[i7];
            hVarArr2[i7] = new j2.h(hVar.f11819r, hVar.f11820s, hVar.f11821t, null);
        }
        return new j2.i(str, true, hVarArr2);
    }

    public static j2.h c(String str, String str2, HashMap hashMap) {
        String i7 = i(str, f2026Z, "1", hashMap);
        boolean equals = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2);
        Pattern pattern = f2027a0;
        if (equals) {
            String k5 = k(str, pattern, hashMap);
            return new j2.h(AbstractC0606g.d, null, "video/mp4", Base64.decode(k5.substring(k5.indexOf(44)), 0));
        } else if ("com.widevine".equals(str2)) {
            UUID uuid = AbstractC0606g.d;
            int i8 = H.f4603a;
            return new j2.h(uuid, null, "hls", str.getBytes(N3.e.f2497c));
        } else if (!"com.microsoft.playready".equals(str2) || !"1".equals(i7)) {
            return null;
        } else {
            String k7 = k(str, pattern, hashMap);
            byte[] decode = Base64.decode(k7.substring(k7.indexOf(44)), 0);
            UUID uuid2 = AbstractC0606g.f9962e;
            return new j2.h(uuid2, null, "video/mp4", s2.k.a(uuid2, decode));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0244, code lost:
        if (r8 != null) goto L285;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static L2.i d(L2.l r95, L2.i r96, H2.C0002c r97, java.lang.String r98) {
        /*
            Method dump skipped, instructions count: 2327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: L2.o.d(L2.l, L2.i, H2.c, java.lang.String):L2.i");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v52 */
    /* JADX WARN: Type inference failed for: r2v53 */
    /* JADX WARN: Type inference failed for: r2v8, types: [int] */
    public static l e(C0002c c0002c, String str) {
        ArrayList arrayList;
        String str2;
        int i7;
        int i8;
        Uri H6;
        char c5;
        K k5;
        ArrayList arrayList2;
        ArrayList arrayList3;
        k kVar;
        String str3;
        ArrayList arrayList4;
        int parseInt;
        String str4;
        K k7;
        int i9;
        k kVar2;
        String str5;
        k kVar3;
        HashMap hashMap;
        HashSet hashSet;
        boolean z7;
        int i10;
        ArrayList arrayList5;
        int i11;
        ArrayList arrayList6;
        ArrayList arrayList7;
        ArrayList arrayList8;
        int i12;
        int i13;
        ArrayList arrayList9;
        float f;
        String l7;
        HashMap hashMap2;
        int i14;
        String str6;
        String str7 = str;
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        ArrayList arrayList10 = new ArrayList();
        ArrayList arrayList11 = new ArrayList();
        ArrayList arrayList12 = new ArrayList();
        ArrayList arrayList13 = new ArrayList();
        ArrayList arrayList14 = new ArrayList();
        ArrayList arrayList15 = new ArrayList();
        ArrayList arrayList16 = new ArrayList();
        ArrayList arrayList17 = new ArrayList();
        boolean z8 = false;
        boolean z9 = false;
        while (true) {
            boolean E4 = c0002c.E();
            String str8 = "application/x-mpegURL";
            Pattern pattern = f2027a0;
            Pattern pattern2 = f2032f0;
            boolean z10 = z8;
            if (E4) {
                String H7 = c0002c.H();
                ArrayList arrayList18 = arrayList14;
                if (H7.startsWith("#EXT")) {
                    arrayList17.add(H7);
                }
                boolean startsWith = H7.startsWith("#EXT-X-I-FRAME-STREAM-INF");
                ArrayList arrayList19 = arrayList17;
                if (H7.startsWith("#EXT-X-DEFINE")) {
                    hashMap4.put(k(H7, pattern2, hashMap4), k(H7, f2042p0, hashMap4));
                } else if (H7.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                    arrayList8 = arrayList11;
                    arrayList7 = arrayList12;
                    arrayList6 = arrayList13;
                    arrayList9 = arrayList15;
                    arrayList5 = arrayList16;
                    z8 = true;
                    hashMap2 = hashMap3;
                    hashMap3 = hashMap2;
                    arrayList14 = arrayList18;
                    arrayList17 = arrayList19;
                    arrayList16 = arrayList5;
                    arrayList13 = arrayList6;
                    arrayList12 = arrayList7;
                    arrayList11 = arrayList8;
                    arrayList15 = arrayList9;
                } else if (H7.startsWith("#EXT-X-MEDIA")) {
                    arrayList15.add(H7);
                } else if (H7.startsWith("#EXT-X-SESSION-KEY")) {
                    j2.h c6 = c(H7, i(H7, f2025Y, "identity", hashMap4), hashMap4);
                    if (c6 != null) {
                        String k8 = k(H7, f2024X, hashMap4);
                        if (!"SAMPLE-AES-CENC".equals(k8) && !"SAMPLE-AES-CTR".equals(k8)) {
                            str6 = "cbcs";
                        } else {
                            str6 = "cenc";
                        }
                        arrayList16.add(new j2.i(str6, true, c6));
                    }
                } else if (H7.startsWith("#EXT-X-STREAM-INF") || startsWith) {
                    boolean contains = z9 | H7.contains("CLOSED-CAPTIONS=NONE");
                    if (startsWith) {
                        i10 = 16384;
                    } else {
                        i10 = 0;
                    }
                    int parseInt2 = Integer.parseInt(k(H7, f2050x, Collections.emptyMap()));
                    Matcher matcher = f2045s.matcher(H7);
                    if (matcher.find()) {
                        arrayList5 = arrayList16;
                        String group = matcher.group(1);
                        group.getClass();
                        i11 = Integer.parseInt(group);
                    } else {
                        arrayList5 = arrayList16;
                        i11 = -1;
                    }
                    arrayList6 = arrayList13;
                    String i15 = i(H7, f2052z, null, hashMap4);
                    arrayList7 = arrayList12;
                    String i16 = i(H7, f2003A, null, hashMap4);
                    if (i16 != null) {
                        int i17 = H.f4603a;
                        arrayList8 = arrayList11;
                        String[] split = i16.split("x", -1);
                        int parseInt3 = Integer.parseInt(split[0]);
                        i13 = Integer.parseInt(split[1]);
                        if (parseInt3 > 0 && i13 > 0) {
                            i14 = parseInt3;
                        } else {
                            i13 = -1;
                            i14 = -1;
                        }
                        i12 = i14;
                    } else {
                        arrayList8 = arrayList11;
                        i12 = -1;
                        i13 = -1;
                    }
                    arrayList9 = arrayList15;
                    String i18 = i(H7, f2004B, null, hashMap4);
                    if (i18 != null) {
                        f = Float.parseFloat(i18);
                    } else {
                        f = -1.0f;
                    }
                    HashMap hashMap5 = hashMap3;
                    String i19 = i(H7, f2046t, null, hashMap4);
                    String i20 = i(H7, f2047u, null, hashMap4);
                    String i21 = i(H7, f2048v, null, hashMap4);
                    String i22 = i(H7, f2049w, null, hashMap4);
                    if (startsWith) {
                        l7 = k(H7, pattern, hashMap4);
                    } else if (c0002c.E()) {
                        l7 = l(c0002c.H(), hashMap4);
                    } else {
                        throw m0.b("#EXT-X-STREAM-INF must be followed by another line");
                    }
                    Uri H8 = AbstractC0156a.H(str7, l7);
                    C0593J c0593j = new C0593J();
                    c0593j.f9597a = Integer.toString(arrayList10.size());
                    c0593j.f9604j = "application/x-mpegURL";
                    c0593j.f9602h = i15;
                    c0593j.f = i11;
                    c0593j.f9601g = parseInt2;
                    c0593j.f9609p = i12;
                    c0593j.f9610q = i13;
                    c0593j.f9611r = f;
                    c0593j.f9600e = i10;
                    arrayList10.add(new k(H8, new K(c0593j), i19, i20, i21, i22));
                    hashMap2 = hashMap5;
                    ArrayList arrayList20 = (ArrayList) hashMap2.get(H8);
                    if (arrayList20 == null) {
                        arrayList20 = new ArrayList();
                        hashMap2.put(H8, arrayList20);
                    }
                    arrayList20.add(new t(i11, parseInt2, i19, i20, i21, i22));
                    z8 = z10;
                    z9 = contains;
                    hashMap3 = hashMap2;
                    arrayList14 = arrayList18;
                    arrayList17 = arrayList19;
                    arrayList16 = arrayList5;
                    arrayList13 = arrayList6;
                    arrayList12 = arrayList7;
                    arrayList11 = arrayList8;
                    arrayList15 = arrayList9;
                }
                arrayList8 = arrayList11;
                arrayList7 = arrayList12;
                arrayList6 = arrayList13;
                arrayList9 = arrayList15;
                arrayList5 = arrayList16;
                z8 = z10;
                hashMap2 = hashMap3;
                hashMap3 = hashMap2;
                arrayList14 = arrayList18;
                arrayList17 = arrayList19;
                arrayList16 = arrayList5;
                arrayList13 = arrayList6;
                arrayList12 = arrayList7;
                arrayList11 = arrayList8;
                arrayList15 = arrayList9;
            } else {
                ArrayList arrayList21 = arrayList11;
                ArrayList arrayList22 = arrayList12;
                ArrayList arrayList23 = arrayList13;
                ArrayList arrayList24 = arrayList14;
                ArrayList arrayList25 = arrayList15;
                ArrayList arrayList26 = arrayList17;
                ArrayList arrayList27 = arrayList16;
                HashMap hashMap6 = hashMap3;
                ArrayList arrayList28 = new ArrayList();
                HashSet hashSet2 = new HashSet();
                int i23 = 0;
                while (i23 < arrayList10.size()) {
                    k kVar4 = (k) arrayList10.get(i23);
                    if (hashSet2.add(kVar4.f1989a)) {
                        K k9 = kVar4.f1990b;
                        if (k9.f9685z == null) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        AbstractC0156a.k(z7);
                        ArrayList arrayList29 = (ArrayList) hashMap6.get(kVar4.f1989a);
                        arrayList29.getClass();
                        hashMap = hashMap6;
                        C1461c c1461c = new C1461c(new u(null, null, arrayList29));
                        C0593J a7 = k9.a();
                        a7.f9603i = c1461c;
                        hashSet = hashSet2;
                        arrayList28.add(new k(kVar4.f1989a, new K(a7), kVar4.f1991c, kVar4.d, kVar4.f1992e, kVar4.f));
                    } else {
                        hashMap = hashMap6;
                        hashSet = hashSet2;
                    }
                    i23++;
                    hashSet2 = hashSet;
                    hashMap6 = hashMap;
                }
                ArrayList arrayList30 = null;
                K k10 = null;
                int i24 = 0;
                while (i24 < arrayList25.size()) {
                    String str9 = (String) arrayList25.get(i24);
                    String k11 = k(str9, f2033g0, hashMap4);
                    String k12 = k(str9, pattern2, hashMap4);
                    C0593J c0593j2 = new C0593J();
                    Pattern pattern3 = pattern2;
                    c0593j2.f9597a = k11 + ":" + k12;
                    c0593j2.f9598b = k12;
                    c0593j2.f9604j = str8;
                    boolean f7 = f(str9, f2037k0);
                    boolean z11 = f7;
                    if (f(str9, f2038l0)) {
                        z11 = (f7 ? 1 : 0) | true;
                    }
                    ?? r22 = z11;
                    if (f(str9, f2036j0)) {
                        r22 = (z11 ? 1 : 0) | true;
                    }
                    c0593j2.d = r22;
                    String i25 = i(str9, f2034h0, null, hashMap4);
                    if (TextUtils.isEmpty(i25)) {
                        str2 = str8;
                        i8 = 0;
                    } else {
                        int i26 = H.f4603a;
                        str2 = str8;
                        String[] split2 = i25.split(",", -1);
                        if (H.l(split2, "public.accessibility.describes-video")) {
                            i7 = 512;
                        } else {
                            i7 = 0;
                        }
                        if (H.l(split2, "public.accessibility.transcribes-spoken-dialog")) {
                            i7 |= 4096;
                        }
                        if (H.l(split2, "public.accessibility.describes-music-and-sound")) {
                            i7 |= 1024;
                        }
                        if (H.l(split2, "public.easy-to-read")) {
                            i8 = i7 | 8192;
                        } else {
                            i8 = i7;
                        }
                    }
                    c0593j2.f9600e = i8;
                    c0593j2.f9599c = i(str9, f2031e0, null, hashMap4);
                    String i27 = i(str9, pattern, null, hashMap4);
                    if (i27 == null) {
                        H6 = null;
                    } else {
                        H6 = AbstractC0156a.H(str7, i27);
                    }
                    Pattern pattern4 = pattern;
                    C1461c c1461c2 = new C1461c(new u(k11, k12, Collections.emptyList()));
                    String k13 = k(str9, f2029c0, hashMap4);
                    switch (k13.hashCode()) {
                        case -959297733:
                            if (k13.equals("SUBTITLES")) {
                                c5 = 0;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case -333210994:
                            if (k13.equals("CLOSED-CAPTIONS")) {
                                c5 = 1;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case 62628790:
                            if (k13.equals("AUDIO")) {
                                c5 = 2;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case 81665115:
                            if (k13.equals("VIDEO")) {
                                c5 = 3;
                                break;
                            }
                            c5 = 65535;
                            break;
                        default:
                            c5 = 65535;
                            break;
                    }
                    switch (c5) {
                        case 0:
                            k5 = k10;
                            arrayList2 = arrayList22;
                            arrayList3 = arrayList21;
                            int i28 = 0;
                            while (true) {
                                if (i28 < arrayList10.size()) {
                                    kVar = (k) arrayList10.get(i28);
                                    if (!k11.equals(kVar.f1992e)) {
                                        i28++;
                                    }
                                } else {
                                    kVar = null;
                                }
                            }
                            if (kVar != null) {
                                String r3 = H.r(kVar.f1990b.f9684y, 3);
                                c0593j2.f9602h = r3;
                                str3 = Z2.r.d(r3);
                            } else {
                                str3 = null;
                            }
                            if (str3 == null) {
                                str3 = "text/vtt";
                            }
                            c0593j2.f9605k = str3;
                            c0593j2.f9603i = c1461c2;
                            if (H6 != null) {
                                arrayList4 = arrayList23;
                                arrayList4.add(new j(H6, new K(c0593j2), k12));
                            } else {
                                arrayList4 = arrayList23;
                                AbstractC0156a.K("HlsPlaylistParser", "EXT-X-MEDIA tag with missing mandatory URI attribute: skipping");
                            }
                            k7 = k5;
                            i24++;
                            str7 = str;
                            arrayList21 = arrayList3;
                            arrayList23 = arrayList4;
                            arrayList22 = arrayList2;
                            pattern2 = pattern3;
                            pattern = pattern4;
                            k10 = k7;
                            str8 = str2;
                        case 1:
                            K k14 = k10;
                            arrayList2 = arrayList22;
                            arrayList3 = arrayList21;
                            String k15 = k(str9, f2035i0, hashMap4);
                            if (k15.startsWith("CC")) {
                                parseInt = Integer.parseInt(k15.substring(2));
                                str4 = "application/cea-608";
                            } else {
                                parseInt = Integer.parseInt(k15.substring(7));
                                str4 = "application/cea-708";
                            }
                            if (arrayList30 == null) {
                                arrayList30 = new ArrayList();
                            }
                            c0593j2.f9605k = str4;
                            c0593j2.f9594C = parseInt;
                            arrayList30.add(new K(c0593j2));
                            k7 = k14;
                            arrayList4 = arrayList23;
                            i24++;
                            str7 = str;
                            arrayList21 = arrayList3;
                            arrayList23 = arrayList4;
                            arrayList22 = arrayList2;
                            pattern2 = pattern3;
                            pattern = pattern4;
                            k10 = k7;
                            str8 = str2;
                        case 2:
                            arrayList3 = arrayList21;
                            int i29 = 0;
                            while (true) {
                                if (i29 < arrayList10.size()) {
                                    kVar2 = (k) arrayList10.get(i29);
                                    k5 = k10;
                                    if (k11.equals(kVar2.d)) {
                                        i9 = 1;
                                    } else {
                                        i29++;
                                        k10 = k5;
                                    }
                                } else {
                                    k5 = k10;
                                    i9 = 1;
                                    kVar2 = null;
                                }
                            }
                            if (kVar2 != null) {
                                String r5 = H.r(kVar2.f1990b.f9684y, i9);
                                c0593j2.f9602h = r5;
                                str5 = Z2.r.d(r5);
                            } else {
                                str5 = null;
                            }
                            String i30 = i(str9, f2051y, null, hashMap4);
                            if (i30 != null) {
                                int i31 = H.f4603a;
                                c0593j2.f9617x = Integer.parseInt(i30.split("/", 2)[0]);
                                if ("audio/eac3".equals(str5) && i30.endsWith("/JOC")) {
                                    c0593j2.f9602h = "ec+3";
                                    str5 = "audio/eac3-joc";
                                }
                            }
                            c0593j2.f9605k = str5;
                            if (H6 != null) {
                                c0593j2.f9603i = c1461c2;
                                arrayList2 = arrayList22;
                                arrayList2.add(new j(H6, new K(c0593j2), k12));
                            } else {
                                arrayList2 = arrayList22;
                                if (kVar2 != null) {
                                    k7 = new K(c0593j2);
                                    arrayList4 = arrayList23;
                                    i24++;
                                    str7 = str;
                                    arrayList21 = arrayList3;
                                    arrayList23 = arrayList4;
                                    arrayList22 = arrayList2;
                                    pattern2 = pattern3;
                                    pattern = pattern4;
                                    k10 = k7;
                                    str8 = str2;
                                }
                            }
                            arrayList4 = arrayList23;
                            k7 = k5;
                            i24++;
                            str7 = str;
                            arrayList21 = arrayList3;
                            arrayList23 = arrayList4;
                            arrayList22 = arrayList2;
                            pattern2 = pattern3;
                            pattern = pattern4;
                            k10 = k7;
                            str8 = str2;
                            break;
                        case 3:
                            int i32 = 0;
                            while (true) {
                                if (i32 < arrayList10.size()) {
                                    kVar3 = (k) arrayList10.get(i32);
                                    if (!k11.equals(kVar3.f1991c)) {
                                        i32++;
                                    }
                                } else {
                                    kVar3 = null;
                                }
                            }
                            if (kVar3 != null) {
                                K k16 = kVar3.f1990b;
                                String r7 = H.r(k16.f9684y, 2);
                                c0593j2.f9602h = r7;
                                c0593j2.f9605k = Z2.r.d(r7);
                                c0593j2.f9609p = k16.f9659G;
                                c0593j2.f9610q = k16.f9660H;
                                c0593j2.f9611r = k16.f9661I;
                            }
                            if (H6 != null) {
                                c0593j2.f9603i = c1461c2;
                                arrayList3 = arrayList21;
                                arrayList3.add(new j(H6, new K(c0593j2), k12));
                                k5 = k10;
                                arrayList4 = arrayList23;
                                arrayList2 = arrayList22;
                                k7 = k5;
                                i24++;
                                str7 = str;
                                arrayList21 = arrayList3;
                                arrayList23 = arrayList4;
                                arrayList22 = arrayList2;
                                pattern2 = pattern3;
                                pattern = pattern4;
                                k10 = k7;
                                str8 = str2;
                            }
                            k5 = k10;
                            arrayList4 = arrayList23;
                            arrayList2 = arrayList22;
                            arrayList3 = arrayList21;
                            k7 = k5;
                            i24++;
                            str7 = str;
                            arrayList21 = arrayList3;
                            arrayList23 = arrayList4;
                            arrayList22 = arrayList2;
                            pattern2 = pattern3;
                            pattern = pattern4;
                            k10 = k7;
                            str8 = str2;
                        default:
                            k5 = k10;
                            arrayList4 = arrayList23;
                            arrayList2 = arrayList22;
                            arrayList3 = arrayList21;
                            k7 = k5;
                            i24++;
                            str7 = str;
                            arrayList21 = arrayList3;
                            arrayList23 = arrayList4;
                            arrayList22 = arrayList2;
                            pattern2 = pattern3;
                            pattern = pattern4;
                            k10 = k7;
                            str8 = str2;
                    }
                }
                K k17 = k10;
                ArrayList arrayList31 = arrayList23;
                ArrayList arrayList32 = arrayList22;
                ArrayList arrayList33 = arrayList21;
                if (z9) {
                    arrayList = Collections.emptyList();
                } else {
                    arrayList = arrayList30;
                }
                return new l(str, arrayList26, arrayList28, arrayList33, arrayList32, arrayList31, arrayList24, k17, arrayList, z10, hashMap4, arrayList27);
            }
        }
    }

    public static boolean f(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return "YES".equals(matcher.group(1));
        }
        return false;
    }

    public static double g(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            String group = matcher.group(1);
            group.getClass();
            return Double.parseDouble(group);
        }
        return -9.223372036854776E18d;
    }

    public static long h(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            String group = matcher.group(1);
            group.getClass();
            return Long.parseLong(group);
        }
        return -1L;
    }

    public static String i(String str, Pattern pattern, String str2, Map map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = matcher.group(1);
            str2.getClass();
        }
        if (!map.isEmpty() && str2 != null) {
            return l(str2, map);
        }
        return str2;
    }

    public static String k(String str, Pattern pattern, Map map) {
        String i7 = i(str, pattern, null, map);
        if (i7 != null) {
            return i7;
        }
        throw m0.b("Couldn't match " + pattern.pattern() + " in " + str);
    }

    public static String l(String str, Map map) {
        Matcher matcher = f2044r0.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String group = matcher.group(1);
            if (map.containsKey(group)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement((String) map.get(group)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    @Override // Y2.O
    public final m j(Uri uri, C0146o c0146o) {
        m e3;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(c0146o));
        ArrayDeque arrayDeque = new ArrayDeque();
        try {
            int read = bufferedReader.read();
            if (read == 239) {
                if (bufferedReader.read() == 187 && bufferedReader.read() == 191) {
                    read = bufferedReader.read();
                }
                throw m0.b("Input does not start with the #EXTM3U header.");
            }
            while (read != -1 && Character.isWhitespace(read)) {
                read = bufferedReader.read();
            }
            int i7 = 0;
            while (true) {
                if (i7 < 7) {
                    if (read != "#EXTM3U".charAt(i7)) {
                        break;
                    }
                    read = bufferedReader.read();
                    i7++;
                } else {
                    while (read != -1 && Character.isWhitespace(read) && !H.H(read)) {
                        read = bufferedReader.read();
                    }
                    if (H.H(read)) {
                        while (true) {
                            String readLine = bufferedReader.readLine();
                            if (readLine != null) {
                                String trim = readLine.trim();
                                if (!trim.isEmpty()) {
                                    if (trim.startsWith("#EXT-X-STREAM-INF")) {
                                        arrayDeque.add(trim);
                                        e3 = e(new C0002c(arrayDeque, bufferedReader), uri.toString());
                                        break;
                                    } else if (trim.startsWith("#EXT-X-TARGETDURATION") || trim.startsWith("#EXT-X-MEDIA-SEQUENCE") || trim.startsWith("#EXTINF") || trim.startsWith("#EXT-X-KEY") || trim.startsWith("#EXT-X-BYTERANGE") || trim.equals("#EXT-X-DISCONTINUITY") || trim.equals("#EXT-X-DISCONTINUITY-SEQUENCE") || trim.equals("#EXT-X-ENDLIST")) {
                                        break;
                                    } else {
                                        arrayDeque.add(trim);
                                    }
                                }
                            } else {
                                H.h(bufferedReader);
                                throw m0.b("Failed to parse the playlist, could not identify any tags.");
                            }
                        }
                        return e3;
                    }
                }
            }
        } finally {
            H.h(bufferedReader);
        }
    }
}
