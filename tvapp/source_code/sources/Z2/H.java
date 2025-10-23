package Z2;

import android.app.UiModeManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import r0.AbstractC1111a;
/* loaded from: classes.dex */
public abstract class H {

    /* renamed from: a  reason: collision with root package name */
    public static final int f4603a;

    /* renamed from: b  reason: collision with root package name */
    public static final String f4604b;

    /* renamed from: c  reason: collision with root package name */
    public static final String f4605c;
    public static final String d;

    /* renamed from: e  reason: collision with root package name */
    public static final String f4606e;
    public static final byte[] f;

    /* renamed from: g  reason: collision with root package name */
    public static final Pattern f4607g;

    /* renamed from: h  reason: collision with root package name */
    public static final Pattern f4608h;

    /* renamed from: i  reason: collision with root package name */
    public static HashMap f4609i;

    /* renamed from: j  reason: collision with root package name */
    public static final String[] f4610j;

    /* renamed from: k  reason: collision with root package name */
    public static final String[] f4611k;

    /* renamed from: l  reason: collision with root package name */
    public static final int[] f4612l;

    /* renamed from: m  reason: collision with root package name */
    public static final int[] f4613m;

    static {
        int i7 = Build.VERSION.SDK_INT;
        f4603a = i7;
        String str = Build.DEVICE;
        f4604b = str;
        String str2 = Build.MANUFACTURER;
        f4605c = str2;
        String str3 = Build.MODEL;
        d = str3;
        f4606e = str + ", " + str3 + ", " + str2 + ", " + i7;
        f = new byte[0];
        f4607g = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        Pattern.compile("%([A-Fa-f0-9]{2})");
        f4608h = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        f4610j = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f4611k = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f4612l = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f4613m = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, ModuleDescriptor.MODULE_VERSION, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243};
    }

    public static String[] A() {
        String locale;
        String[] strArr;
        Configuration configuration = Resources.getSystem().getConfiguration();
        int i7 = f4603a;
        if (i7 >= 24) {
            strArr = B3.a.m(B3.a.g(configuration)).split(",", -1);
        } else {
            Locale locale2 = configuration.locale;
            if (i7 >= 21) {
                locale = locale2.toLanguageTag();
            } else {
                locale = locale2.toString();
            }
            strArr = new String[]{locale};
        }
        for (int i8 = 0; i8 < strArr.length; i8++) {
            strArr[i8] = K(strArr[i8]);
        }
        return strArr;
    }

    public static String B(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e3) {
            AbstractC0156a.r("Util", "Failed to read system property ".concat(str), e3);
            return null;
        }
    }

    public static String C(int i7) {
        switch (i7) {
            case -2:
                return "none";
            case -1:
                return "unknown";
            case 0:
                return "default";
            case 1:
                return "audio";
            case 2:
                return "video";
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return "metadata";
            case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                return "camera motion";
            default:
                if (i7 >= 10000) {
                    return AbstractC1111a.n(i7, "custom (", ")");
                }
                return "?";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean D(e2.v0 r6) {
        /*
            r0 = r6
            e2.B r0 = (e2.C0585B) r0
            int r1 = r0.T()
            r2 = 1
            if (r1 != r2) goto L19
            r3 = 2
            r4 = r6
            P1.c r4 = (P1.c) r4
            boolean r3 = r4.n(r3)
            if (r3 == 0) goto L19
            r0.a0()
        L17:
            r0 = r2
            goto L36
        L19:
            r0 = 0
            r3 = 4
            if (r1 != r3) goto L36
            r1 = r6
            P1.c r1 = (P1.c) r1
            boolean r3 = r1.n(r3)
            if (r3 == 0) goto L36
            r3 = r1
            e2.B r3 = (e2.C0585B) r3
            int r3 = r3.K()
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r1.w(r3, r4, r0)
            goto L17
        L36:
            P1.c r6 = (P1.c) r6
            boolean r1 = r6.n(r2)
            if (r1 == 0) goto L44
            e2.B r6 = (e2.C0585B) r6
            r6.g0(r2)
            goto L45
        L44:
            r2 = r0
        L45:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: Z2.H.D(e2.v0):boolean");
    }

    public static int E(Uri uri, String str) {
        int i7;
        char charAt;
        char charAt2;
        char c5;
        char c6 = 65535;
        if (str == null) {
            String scheme = uri.getScheme();
            if (scheme != null) {
                if ("rtsp" != scheme) {
                    if (4 == scheme.length()) {
                        for (int i8 = 0; i8 < 4; i8++) {
                            if ("rtsp".charAt(i8) == scheme.charAt(i8) || ((c5 = (char) ((charAt | ' ') - 97)) < 26 && c5 == ((char) ((charAt2 | ' ') - 97)))) {
                            }
                        }
                    }
                }
                return 3;
            }
            String lastPathSegment = uri.getLastPathSegment();
            if (lastPathSegment == null) {
                return 4;
            }
            int lastIndexOf = lastPathSegment.lastIndexOf(46);
            if (lastIndexOf >= 0) {
                String T6 = p6.l.T(lastPathSegment.substring(lastIndexOf + 1));
                T6.getClass();
                switch (T6.hashCode()) {
                    case 104579:
                        if (T6.equals("ism")) {
                            c6 = 0;
                            break;
                        }
                        break;
                    case 108321:
                        if (T6.equals("mpd")) {
                            c6 = 1;
                            break;
                        }
                        break;
                    case 3242057:
                        if (T6.equals("isml")) {
                            c6 = 2;
                            break;
                        }
                        break;
                    case 3299913:
                        if (T6.equals("m3u8")) {
                            c6 = 3;
                            break;
                        }
                        break;
                }
                switch (c6) {
                    case 0:
                    case 2:
                        i7 = 1;
                        break;
                    case 1:
                        i7 = 0;
                        break;
                    case 3:
                        i7 = 2;
                        break;
                    default:
                        i7 = 4;
                        break;
                }
                if (i7 != 4) {
                    return i7;
                }
            }
            String path = uri.getPath();
            path.getClass();
            Matcher matcher = f4608h.matcher(path);
            if (!matcher.matches()) {
                return 4;
            }
            String group = matcher.group(2);
            if (group != null) {
                if (group.contains("format=mpd-time-csf")) {
                    return 0;
                }
                if (group.contains("format=m3u8-aapl")) {
                    return 2;
                }
            }
            return 1;
        }
        switch (str.hashCode()) {
            case -979127466:
                if (str.equals("application/x-mpegURL")) {
                    c6 = 0;
                    break;
                }
                break;
            case -156749520:
                if (str.equals("application/vnd.ms-sstr+xml")) {
                    c6 = 1;
                    break;
                }
                break;
            case 64194685:
                if (str.equals("application/dash+xml")) {
                    c6 = 2;
                    break;
                }
                break;
            case 1154777587:
                if (str.equals("application/x-rtsp")) {
                    c6 = 3;
                    break;
                }
                break;
        }
        switch (c6) {
            case 0:
                return 2;
            case 1:
                return 1;
            case 2:
                return 0;
            case 3:
                return 3;
            default:
                return 4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0062, code lost:
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean F(Z2.y r3, Z2.y r4, java.util.zip.Inflater r5) {
        /*
            int r0 = r3.a()
            r1 = 0
            if (r0 > 0) goto L8
            return r1
        L8:
            byte[] r0 = r4.f4691a
            int r0 = r0.length
            int r2 = r3.a()
            if (r0 >= r2) goto L1a
            int r0 = r3.a()
            int r0 = r0 * 2
            r4.b(r0)
        L1a:
            if (r5 != 0) goto L21
            java.util.zip.Inflater r5 = new java.util.zip.Inflater
            r5.<init>()
        L21:
            byte[] r0 = r3.f4691a
            int r2 = r3.f4692b
            int r3 = r3.a()
            r5.setInput(r0, r2, r3)
            r3 = r1
        L2d:
            byte[] r0 = r4.f4691a     // Catch: java.lang.Throwable -> L44 java.util.zip.DataFormatException -> L67
            int r2 = r0.length     // Catch: java.lang.Throwable -> L44 java.util.zip.DataFormatException -> L67
            int r2 = r2 - r3
            int r0 = r5.inflate(r0, r3, r2)     // Catch: java.lang.Throwable -> L44 java.util.zip.DataFormatException -> L67
            int r3 = r3 + r0
            boolean r0 = r5.finished()     // Catch: java.lang.Throwable -> L44 java.util.zip.DataFormatException -> L67
            if (r0 == 0) goto L46
            r4.E(r3)     // Catch: java.lang.Throwable -> L44 java.util.zip.DataFormatException -> L67
            r5.reset()
            r3 = 1
            return r3
        L44:
            r3 = move-exception
            goto L63
        L46:
            boolean r0 = r5.needsDictionary()     // Catch: java.lang.Throwable -> L44 java.util.zip.DataFormatException -> L67
            if (r0 != 0) goto L5f
            boolean r0 = r5.needsInput()     // Catch: java.lang.Throwable -> L44 java.util.zip.DataFormatException -> L67
            if (r0 == 0) goto L53
            goto L5f
        L53:
            byte[] r0 = r4.f4691a     // Catch: java.lang.Throwable -> L44 java.util.zip.DataFormatException -> L67
            int r2 = r0.length     // Catch: java.lang.Throwable -> L44 java.util.zip.DataFormatException -> L67
            if (r3 != r2) goto L2d
            int r0 = r0.length     // Catch: java.lang.Throwable -> L44 java.util.zip.DataFormatException -> L67
            int r0 = r0 * 2
            r4.b(r0)     // Catch: java.lang.Throwable -> L44 java.util.zip.DataFormatException -> L67
            goto L2d
        L5f:
            r5.reset()
            return r1
        L63:
            r5.reset()
            throw r3
        L67:
            r5.reset()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Z2.H.F(Z2.y, Z2.y, java.util.zip.Inflater):boolean");
    }

    public static boolean G(int i7) {
        if (i7 != 3 && i7 != 2 && i7 != 268435456 && i7 != 536870912 && i7 != 805306368 && i7 != 4) {
            return false;
        }
        return true;
    }

    public static boolean H(int i7) {
        if (i7 != 10 && i7 != 13) {
            return false;
        }
        return true;
    }

    public static boolean I(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        if (uiModeManager != null && uiModeManager.getCurrentModeType() == 4) {
            return true;
        }
        return false;
    }

    public static long J(long j7) {
        if (j7 != -9223372036854775807L && j7 != Long.MIN_VALUE) {
            return j7 * 1000;
        }
        return j7;
    }

    public static String K(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !replace.equals("und")) {
            str = replace;
        }
        String T6 = p6.l.T(str);
        int i7 = 0;
        String str2 = T6.split("-", 2)[0];
        if (f4609i == null) {
            String[] iSOLanguages = Locale.getISOLanguages();
            int length = iSOLanguages.length;
            String[] strArr = f4610j;
            HashMap hashMap = new HashMap(length + strArr.length);
            for (String str3 : iSOLanguages) {
                try {
                    String iSO3Language = new Locale(str3).getISO3Language();
                    if (!TextUtils.isEmpty(iSO3Language)) {
                        hashMap.put(iSO3Language, str3);
                    }
                } catch (MissingResourceException unused) {
                }
            }
            for (int i8 = 0; i8 < strArr.length; i8 += 2) {
                hashMap.put(strArr[i8], strArr[i8 + 1]);
            }
            f4609i = hashMap;
        }
        String str4 = (String) f4609i.get(str2);
        if (str4 != null) {
            T6 = str4 + T6.substring(str2.length());
            str2 = str4;
        }
        if (!"no".equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
            return T6;
        }
        while (true) {
            String[] strArr2 = f4611k;
            if (i7 < strArr2.length) {
                if (T6.startsWith(strArr2[i7])) {
                    return strArr2[i7 + 1] + T6.substring(strArr2[i7].length());
                }
                i7 += 2;
            } else {
                return T6;
            }
        }
    }

    public static Object[] L(int i7, Object[] objArr) {
        boolean z7;
        if (i7 <= objArr.length) {
            z7 = true;
        } else {
            z7 = false;
        }
        AbstractC0156a.f(z7);
        return Arrays.copyOf(objArr, i7);
    }

    public static void M(Handler handler, Runnable runnable) {
        if (!handler.getLooper().getThread().isAlive()) {
            return;
        }
        if (handler.getLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }

    public static long N(long j7, int i7) {
        return (j7 * 1000000) / i7;
    }

    public static long O(long j7, long j8, long j9) {
        int i7 = (j9 > j8 ? 1 : (j9 == j8 ? 0 : -1));
        if (i7 >= 0 && j9 % j8 == 0) {
            return j7 / (j9 / j8);
        }
        if (i7 < 0 && j8 % j9 == 0) {
            return (j8 / j9) * j7;
        }
        return (long) (j7 * (j8 / j9));
    }

    public static void P(long[] jArr, long j7) {
        int i7 = (j7 > 1000000L ? 1 : (j7 == 1000000L ? 0 : -1));
        int i8 = 0;
        if (i7 >= 0 && j7 % 1000000 == 0) {
            long j8 = j7 / 1000000;
            while (i8 < jArr.length) {
                jArr[i8] = jArr[i8] / j8;
                i8++;
            }
        } else if (i7 < 0 && 1000000 % j7 == 0) {
            long j9 = 1000000 / j7;
            while (i8 < jArr.length) {
                jArr[i8] = jArr[i8] * j9;
                i8++;
            }
        } else {
            double d7 = 1000000 / j7;
            while (i8 < jArr.length) {
                jArr[i8] = (long) (jArr[i8] * d7);
                i8++;
            }
        }
    }

    public static String[] Q(String str) {
        return str.split("/", -1);
    }

    public static String[] R(String str) {
        if (TextUtils.isEmpty(str)) {
            return new String[0];
        }
        return str.trim().split("(\\s*,\\s*)", -1);
    }

    public static long S(long j7) {
        if (j7 != -9223372036854775807L && j7 != Long.MIN_VALUE) {
            return j7 / 1000;
        }
        return j7;
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 == null) {
                return true;
            }
            return false;
        }
        return obj.equals(obj2);
    }

    public static int b(long[] jArr, long j7, boolean z7) {
        int i7;
        int binarySearch = Arrays.binarySearch(jArr, j7);
        if (binarySearch < 0) {
            return ~binarySearch;
        }
        while (true) {
            i7 = binarySearch + 1;
            if (i7 >= jArr.length || jArr[i7] != j7) {
                break;
            }
            binarySearch = i7;
        }
        if (z7) {
            return binarySearch;
        }
        return i7;
    }

    public static int c(H.j jVar, long j7) {
        int i7 = jVar.f793q - 1;
        int i8 = 0;
        while (i8 <= i7) {
            int i9 = (i8 + i7) >>> 1;
            if (jVar.m(i9) < j7) {
                i8 = i9 + 1;
            } else {
                i7 = i9 - 1;
            }
        }
        int i10 = i7 + 1;
        if (i10 < jVar.f793q && jVar.m(i10) == j7) {
            return i10;
        }
        if (i7 == -1) {
            return 0;
        }
        return i7;
    }

    public static int d(List list, Long l7, boolean z7) {
        int i7;
        int binarySearch = Collections.binarySearch(list, l7);
        if (binarySearch < 0) {
            i7 = -(binarySearch + 2);
        } else {
            while (true) {
                int i8 = binarySearch - 1;
                if (i8 < 0 || ((Comparable) list.get(i8)).compareTo(l7) != 0) {
                    break;
                }
                binarySearch = i8;
            }
            i7 = binarySearch;
        }
        if (z7) {
            return Math.max(0, i7);
        }
        return i7;
    }

    public static int e(int[] iArr, int i7, boolean z7, boolean z8) {
        int i8;
        int i9;
        int binarySearch = Arrays.binarySearch(iArr, i7);
        if (binarySearch < 0) {
            i9 = -(binarySearch + 2);
        } else {
            while (true) {
                i8 = binarySearch - 1;
                if (i8 < 0 || iArr[i8] != i7) {
                    break;
                }
                binarySearch = i8;
            }
            if (z7) {
                i9 = binarySearch;
            } else {
                i9 = i8;
            }
        }
        if (z8) {
            return Math.max(0, i9);
        }
        return i9;
    }

    public static int f(long[] jArr, long j7, boolean z7) {
        int i7;
        int binarySearch = Arrays.binarySearch(jArr, j7);
        if (binarySearch < 0) {
            i7 = -(binarySearch + 2);
        } else {
            while (true) {
                int i8 = binarySearch - 1;
                if (i8 < 0 || jArr[i8] != j7) {
                    break;
                }
                binarySearch = i8;
            }
            i7 = binarySearch;
        }
        if (z7) {
            return Math.max(0, i7);
        }
        return i7;
    }

    public static int g(int i7, int i8) {
        return ((i7 + i8) - 1) / i8;
    }

    public static void h(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    public static float i(float f7, float f8, float f9) {
        return Math.max(f8, Math.min(f7, f9));
    }

    public static int j(int i7, int i8, int i9) {
        return Math.max(i8, Math.min(i7, i9));
    }

    public static long k(long j7, long j8, long j9) {
        return Math.max(j8, Math.min(j7, j9));
    }

    public static boolean l(Object[] objArr, Object obj) {
        for (Object obj2 : objArr) {
            if (a(obj2, obj)) {
                return true;
            }
        }
        return false;
    }

    public static int m(int i7, int i8, int i9, byte[] bArr) {
        while (i7 < i8) {
            i9 = f4612l[((i9 >>> 24) ^ (bArr[i7] & 255)) & 255] ^ (i9 << 8);
            i7++;
        }
        return i9;
    }

    public static Handler n(Handler.Callback callback) {
        Looper myLooper = Looper.myLooper();
        AbstractC0156a.l(myLooper);
        return new Handler(myLooper, callback);
    }

    public static String o(byte[] bArr) {
        return new String(bArr, N3.e.f2497c);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int p(int i7) {
        switch (i7) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return 204;
            case 5:
                return 220;
            case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                return 252;
            case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                return 1276;
            case 8:
                break;
            case 9:
            case 11:
            default:
                return 0;
            case 10:
                if (f4603a >= 32) {
                    return 737532;
                }
                break;
            case 12:
                return 743676;
        }
        return 6396;
    }

    public static int q(String str, int i7) {
        int i8 = 0;
        for (String str2 : R(str)) {
            if (i7 == r.h(r.d(str2))) {
                i8++;
            }
        }
        return i8;
    }

    public static String r(String str, int i7) {
        String[] R6 = R(str);
        if (R6.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : R6) {
            if (i7 == r.h(r.d(str2))) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str2);
            }
        }
        if (sb.length() <= 0) {
            return null;
        }
        return sb.toString();
    }

    public static Drawable s(Context context, Resources resources, int i7) {
        if (f4603a >= 21) {
            return G.a(context, resources, i7);
        }
        return resources.getDrawable(i7);
    }

    public static int t(int i7) {
        if (i7 != 2 && i7 != 4) {
            if (i7 != 10) {
                if (i7 != 7) {
                    if (i7 != 8) {
                        switch (i7) {
                            case 15:
                                return 6003;
                            case 16:
                            case 18:
                                return 6005;
                            case 17:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                                return 6004;
                            default:
                                switch (i7) {
                                    case 24:
                                    case 25:
                                    case 26:
                                    case 27:
                                    case 28:
                                        return 6002;
                                    default:
                                        return 6006;
                                }
                        }
                    }
                    return 6003;
                }
                return 6005;
            }
            return 6004;
        }
        return 6005;
    }

    public static int u(String str) {
        String[] split;
        int length;
        boolean z7;
        if (str == null || (length = (split = str.split("_", -1)).length) < 2) {
            return 0;
        }
        String str2 = split[length - 1];
        if (length >= 3 && "neg".equals(split[length - 2])) {
            z7 = true;
        } else {
            z7 = false;
        }
        try {
            str2.getClass();
            int parseInt = Integer.parseInt(str2);
            if (z7) {
                return -parseInt;
            }
            return parseInt;
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public static long v(long j7, float f7) {
        if (f7 == 1.0f) {
            return j7;
        }
        return Math.round(j7 * f7);
    }

    public static int w(int i7) {
        if (i7 != 8) {
            if (i7 != 16) {
                if (i7 != 24) {
                    if (i7 != 32) {
                        return 0;
                    }
                    return 805306368;
                }
                return 536870912;
            }
            return 2;
        }
        return 3;
    }

    public static int x(int i7, int i8) {
        if (i7 != 2) {
            if (i7 != 3) {
                if (i7 != 4) {
                    if (i7 != 268435456) {
                        if (i7 != 536870912) {
                            if (i7 != 805306368) {
                                throw new IllegalArgumentException();
                            }
                        } else {
                            return i8 * 3;
                        }
                    }
                }
                return i8 * 4;
            }
            return i8;
        }
        return i8 * 2;
    }

    public static long y(long j7, float f7) {
        if (f7 == 1.0f) {
            return j7;
        }
        return Math.round(j7 / f7);
    }

    public static String z(StringBuilder sb, Formatter formatter, long j7) {
        long j8;
        String str;
        Formatter format;
        if (j7 == -9223372036854775807L) {
            j8 = 0;
        } else {
            j8 = j7;
        }
        if (j8 < 0) {
            str = "-";
        } else {
            str = "";
        }
        long abs = (Math.abs(j8) + 500) / 1000;
        long j9 = abs % 60;
        long j10 = (abs / 60) % 60;
        long j11 = abs / 3600;
        sb.setLength(0);
        if (j11 > 0) {
            format = formatter.format("%s%d:%02d:%02d", str, Long.valueOf(j11), Long.valueOf(j10), Long.valueOf(j9));
        } else {
            format = formatter.format("%s%02d:%02d", str, Long.valueOf(j10), Long.valueOf(j9));
        }
        return format.toString();
    }
}
