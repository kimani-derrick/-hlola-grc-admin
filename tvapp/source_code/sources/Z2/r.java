package Z2;

import K.C0040p;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a  reason: collision with root package name */
    public static final ArrayList f4655a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public static final Pattern f4656b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    public static boolean a(String str, String str2) {
        C0040p f;
        int a7;
        if (str == null) {
            return false;
        }
        char c5 = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c5 = 0;
                    break;
                }
                break;
            case -432837260:
                if (str.equals("audio/mpeg-L1")) {
                    c5 = 1;
                    break;
                }
                break;
            case -432837259:
                if (str.equals("audio/mpeg-L2")) {
                    c5 = 2;
                    break;
                }
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c5 = 3;
                    break;
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c5 = 4;
                    break;
                }
                break;
            case 187094639:
                if (str.equals("audio/raw")) {
                    c5 = 5;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c5 = 6;
                    break;
                }
                break;
            case 1504619009:
                if (str.equals("audio/flac")) {
                    c5 = 7;
                    break;
                }
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    c5 = '\b';
                    break;
                }
                break;
            case 1903231877:
                if (str.equals("audio/g711-alaw")) {
                    c5 = '\t';
                    break;
                }
                break;
            case 1903589369:
                if (str.equals("audio/g711-mlaw")) {
                    c5 = '\n';
                    break;
                }
                break;
        }
        switch (c5) {
            case 0:
            case 1:
            case 2:
            case 4:
            case 5:
            case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
            case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
            case '\b':
            case '\t':
            case '\n':
                return true;
            case 3:
                if (str2 == null || (f = f(str2)) == null || (a7 = f.a()) == 0 || a7 == 16) {
                    return false;
                }
                return true;
            default:
                return false;
        }
    }

    public static String b(String str, String str2) {
        if (str == null || str2 == null) {
            return null;
        }
        String[] R6 = H.R(str);
        StringBuilder sb = new StringBuilder();
        for (String str3 : R6) {
            if (str2.equals(d(str3))) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str3);
            }
        }
        if (sb.length() <= 0) {
            return null;
        }
        return sb.toString();
    }

    public static int c(String str, String str2) {
        C0040p f;
        char c5 = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c5 = 0;
                    break;
                }
                break;
            case -1365340241:
                if (str.equals("audio/vnd.dts.hd;profile=lbr")) {
                    c5 = 1;
                    break;
                }
                break;
            case -1095064472:
                if (str.equals("audio/vnd.dts")) {
                    c5 = 2;
                    break;
                }
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c5 = 3;
                    break;
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c5 = 4;
                    break;
                }
                break;
            case 187078297:
                if (str.equals("audio/ac4")) {
                    c5 = 5;
                    break;
                }
                break;
            case 550520934:
                if (str.equals("audio/vnd.dts.uhd;profile=p2")) {
                    c5 = 6;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c5 = 7;
                    break;
                }
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    c5 = '\b';
                    break;
                }
                break;
            case 1504891608:
                if (str.equals("audio/opus")) {
                    c5 = '\t';
                    break;
                }
                break;
            case 1505942594:
                if (str.equals("audio/vnd.dts.hd")) {
                    c5 = '\n';
                    break;
                }
                break;
            case 1556697186:
                if (str.equals("audio/true-hd")) {
                    c5 = 11;
                    break;
                }
                break;
        }
        switch (c5) {
            case 0:
                return 18;
            case 1:
                return 8;
            case 2:
                return 7;
            case 3:
                if (str2 == null || (f = f(str2)) == null) {
                    return 0;
                }
                return f.a();
            case 4:
                return 5;
            case 5:
                return 17;
            case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                return 30;
            case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                return 6;
            case '\b':
                return 9;
            case '\t':
                return 20;
            case '\n':
                return 8;
            case 11:
                return 14;
            default:
                return 0;
        }
    }

    public static String d(String str) {
        C0040p f;
        String str2 = null;
        if (str == null) {
            return null;
        }
        String T6 = p6.l.T(str.trim());
        if (!T6.startsWith("avc1") && !T6.startsWith("avc3")) {
            if (!T6.startsWith("hev1") && !T6.startsWith("hvc1")) {
                if (!T6.startsWith("dvav") && !T6.startsWith("dva1") && !T6.startsWith("dvhe") && !T6.startsWith("dvh1")) {
                    if (T6.startsWith("av01")) {
                        return "video/av01";
                    }
                    if (!T6.startsWith("vp9") && !T6.startsWith("vp09")) {
                        if (!T6.startsWith("vp8") && !T6.startsWith("vp08")) {
                            if (T6.startsWith("mp4a")) {
                                if (T6.startsWith("mp4a.") && (f = f(T6)) != null) {
                                    str2 = e(f.f1501a);
                                }
                                if (str2 == null) {
                                    return "audio/mp4a-latm";
                                }
                                return str2;
                            } else if (T6.startsWith("mha1")) {
                                return "audio/mha1";
                            } else {
                                if (T6.startsWith("mhm1")) {
                                    return "audio/mhm1";
                                }
                                if (!T6.startsWith("ac-3") && !T6.startsWith("dac3")) {
                                    if (!T6.startsWith("ec-3") && !T6.startsWith("dec3")) {
                                        if (T6.startsWith("ec+3")) {
                                            return "audio/eac3-joc";
                                        }
                                        if (!T6.startsWith("ac-4") && !T6.startsWith("dac4")) {
                                            if (T6.startsWith("dtsc")) {
                                                return "audio/vnd.dts";
                                            }
                                            if (T6.startsWith("dtse")) {
                                                return "audio/vnd.dts.hd;profile=lbr";
                                            }
                                            if (!T6.startsWith("dtsh") && !T6.startsWith("dtsl")) {
                                                if (T6.startsWith("dtsx")) {
                                                    return "audio/vnd.dts.uhd;profile=p2";
                                                }
                                                if (T6.startsWith("opus")) {
                                                    return "audio/opus";
                                                }
                                                if (T6.startsWith("vorbis")) {
                                                    return "audio/vorbis";
                                                }
                                                if (T6.startsWith("flac")) {
                                                    return "audio/flac";
                                                }
                                                if (T6.startsWith("stpp")) {
                                                    return "application/ttml+xml";
                                                }
                                                if (T6.startsWith("wvtt")) {
                                                    return "text/vtt";
                                                }
                                                if (T6.contains("cea708")) {
                                                    return "application/cea-708";
                                                }
                                                if (!T6.contains("eia608") && !T6.contains("cea608")) {
                                                    ArrayList arrayList = f4655a;
                                                    if (arrayList.size() <= 0) {
                                                        return null;
                                                    }
                                                    AbstractC0515y1.v(arrayList.get(0));
                                                    throw null;
                                                }
                                                return "application/cea-608";
                                            }
                                            return "audio/vnd.dts.hd";
                                        }
                                        return "audio/ac4";
                                    }
                                    return "audio/eac3";
                                }
                                return "audio/ac3";
                            }
                        }
                        return "video/x-vnd.on2.vp8";
                    }
                    return "video/x-vnd.on2.vp9";
                }
                return "video/dolby-vision";
            }
            return "video/hevc";
        }
        return "video/avc";
    }

    public static String e(int i7) {
        if (i7 != 32) {
            if (i7 != 33) {
                if (i7 != 35) {
                    if (i7 != 64) {
                        if (i7 != 163) {
                            if (i7 != 177) {
                                if (i7 != 165) {
                                    if (i7 != 166) {
                                        switch (i7) {
                                            case 96:
                                            case 97:
                                            case 98:
                                            case 99:
                                            case 100:
                                            case 101:
                                                return "video/mpeg2";
                                            case 102:
                                            case 103:
                                            case 104:
                                                return "audio/mp4a-latm";
                                            case 105:
                                            case 107:
                                                return "audio/mpeg";
                                            case 106:
                                                return "video/mpeg";
                                            default:
                                                switch (i7) {
                                                    case 169:
                                                    case 172:
                                                        return "audio/vnd.dts";
                                                    case 170:
                                                    case 171:
                                                        return "audio/vnd.dts.hd";
                                                    case 173:
                                                        return "audio/opus";
                                                    case 174:
                                                        return "audio/ac4";
                                                    default:
                                                        return null;
                                                }
                                        }
                                    }
                                    return "audio/eac3";
                                }
                                return "audio/ac3";
                            }
                            return "video/x-vnd.on2.vp9";
                        }
                        return "video/wvc1";
                    }
                    return "audio/mp4a-latm";
                }
                return "video/hevc";
            }
            return "video/avc";
        }
        return "video/mp4v-es";
    }

    public static C0040p f(String str) {
        int i7;
        Matcher matcher = f4656b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String group = matcher.group(1);
        group.getClass();
        String group2 = matcher.group(2);
        try {
            int parseInt = Integer.parseInt(group, 16);
            if (group2 != null) {
                i7 = Integer.parseInt(group2);
            } else {
                i7 = 0;
            }
            return new C0040p(parseInt, i7);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static String g(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }

    public static int h(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (i(str)) {
            return 1;
        }
        if (k(str)) {
            return 2;
        }
        if (j(str)) {
            return 3;
        }
        if ("image".equals(g(str))) {
            return 4;
        }
        if (!"application/id3".equals(str) && !"application/x-emsg".equals(str) && !"application/x-scte35".equals(str)) {
            if ("application/x-camera-motion".equals(str)) {
                return 6;
            }
            ArrayList arrayList = f4655a;
            if (arrayList.size() <= 0) {
                return -1;
            }
            AbstractC0515y1.v(arrayList.get(0));
            throw null;
        }
        return 5;
    }

    public static boolean i(String str) {
        return "audio".equals(g(str));
    }

    public static boolean j(String str) {
        if (!"text".equals(g(str)) && !"application/cea-608".equals(str) && !"application/cea-708".equals(str) && !"application/x-mp4-cea-608".equals(str) && !"application/x-subrip".equals(str) && !"application/ttml+xml".equals(str) && !"application/x-quicktime-tx3g".equals(str) && !"application/x-mp4-vtt".equals(str) && !"application/x-rawcc".equals(str) && !"application/vobsub".equals(str) && !"application/pgs".equals(str) && !"application/dvbsubs".equals(str)) {
            return false;
        }
        return true;
    }

    public static boolean k(String str) {
        return "video".equals(g(str));
    }
}
