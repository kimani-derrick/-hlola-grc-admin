package V2;

import Z2.AbstractC0156a;
import Z2.H;
import Z2.y;
import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a  reason: collision with root package name */
    public static final Pattern f3649a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* renamed from: b  reason: collision with root package name */
    public static final Pattern f3650b = Pattern.compile("(\\S+?):(\\S+)");

    /* renamed from: c  reason: collision with root package name */
    public static final Map f3651c;
    public static final Map d;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f3651c = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        d = Collections.unmodifiableMap(hashMap2);
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0256 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(java.lang.String r19, V2.e r20, java.util.List r21, android.text.SpannableStringBuilder r22, java.util.List r23) {
        /*
            Method dump skipped, instructions count: 624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: V2.h.a(java.lang.String, V2.e, java.util.List, android.text.SpannableStringBuilder, java.util.List):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ArrayList b(List list, String str, e eVar) {
        int i7;
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < list.size(); i8++) {
            b bVar = (b) list.get(i8);
            String str2 = eVar.f3635a;
            if (bVar.f3615a.isEmpty() && bVar.f3616b.isEmpty() && bVar.f3617c.isEmpty() && bVar.d.isEmpty()) {
                i7 = TextUtils.isEmpty(str2);
            } else {
                int a7 = b.a(b.a(b.a(0, 1073741824, bVar.f3615a, str), 2, bVar.f3616b, str2), 4, bVar.d, eVar.f3637c);
                if (a7 != -1) {
                    if (eVar.d.containsAll(bVar.f3617c)) {
                        i7 = a7 + (bVar.f3617c.size() * 4);
                    }
                }
                i7 = 0;
            }
            if (i7 > 0) {
                arrayList.add(new f(i7, bVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static int c(List list, String str, e eVar) {
        ArrayList b7 = b(list, str, eVar);
        for (int i7 = 0; i7 < b7.size(); i7++) {
            int i8 = ((f) b7.get(i7)).f3639r.f3627p;
            if (i8 != -1) {
                return i8;
            }
        }
        return -1;
    }

    public static c d(String str, Matcher matcher, y yVar, ArrayList arrayList) {
        g gVar = new g();
        try {
            String group = matcher.group(1);
            group.getClass();
            gVar.f3640a = j.c(group);
            String group2 = matcher.group(2);
            group2.getClass();
            gVar.f3641b = j.c(group2);
            String group3 = matcher.group(3);
            group3.getClass();
            e(group3, gVar);
            StringBuilder sb = new StringBuilder();
            while (true) {
                String h7 = yVar.h(N3.e.f2497c);
                if (!TextUtils.isEmpty(h7)) {
                    if (sb.length() > 0) {
                        sb.append("\n");
                    }
                    sb.append(h7.trim());
                } else {
                    gVar.f3642c = f(str, sb.toString(), arrayList);
                    return new c(gVar.a().a(), gVar.f3640a, gVar.f3641b);
                }
            }
        } catch (NumberFormatException unused) {
            AbstractC0156a.K("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c5, code lost:
        if (r7.equals("start") == false) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e(java.lang.String r18, V2.g r19) {
        /*
            Method dump skipped, instructions count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: V2.h.e(java.lang.String, V2.g):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    public static SpannedString f(String str, String str2, List list) {
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        char c5;
        int i12 = 2;
        int i13 = 1;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i14 = 0;
        while (true) {
            String str3 = "";
            if (i14 < str2.length()) {
                char charAt = str2.charAt(i14);
                if (charAt != '&') {
                    if (charAt != '<') {
                        spannableStringBuilder.append(charAt);
                        i14 += i13;
                        i7 = i13;
                    } else {
                        int i15 = i14 + 1;
                        if (i15 < str2.length()) {
                            if (str2.charAt(i15) == '/') {
                                i8 = i13;
                            } else {
                                i8 = 0;
                            }
                            int indexOf = str2.indexOf(62, i15);
                            if (indexOf == -1) {
                                i15 = str2.length();
                            } else {
                                i15 = indexOf + i13;
                            }
                            int i16 = i15 - 2;
                            if (str2.charAt(i16) == '/') {
                                i9 = i13;
                            } else {
                                i9 = 0;
                            }
                            if (i8 != 0) {
                                i10 = i12;
                            } else {
                                i10 = i13;
                            }
                            int i17 = i14 + i10;
                            if (i9 == 0) {
                                i16 = i15 - 1;
                            }
                            String substring = str2.substring(i17, i16);
                            if (!substring.trim().isEmpty()) {
                                String trim = substring.trim();
                                AbstractC0156a.f(trim.isEmpty() ^ i13);
                                int i18 = H.f4603a;
                                String str4 = trim.split("[ \\.]", i12)[0];
                                str4.getClass();
                                switch (str4.hashCode()) {
                                    case 98:
                                        if (str4.equals("b")) {
                                            i11 = 0;
                                            break;
                                        }
                                        i11 = -1;
                                        break;
                                    case 99:
                                        if (str4.equals("c")) {
                                            i11 = i13;
                                            break;
                                        }
                                        i11 = -1;
                                        break;
                                    case 105:
                                        if (str4.equals("i")) {
                                            i11 = i12;
                                            break;
                                        }
                                        i11 = -1;
                                        break;
                                    case 117:
                                        if (str4.equals("u")) {
                                            i11 = 3;
                                            break;
                                        }
                                        i11 = -1;
                                        break;
                                    case 118:
                                        if (str4.equals("v")) {
                                            i11 = 4;
                                            break;
                                        }
                                        i11 = -1;
                                        break;
                                    case 3650:
                                        if (str4.equals("rt")) {
                                            i11 = 5;
                                            break;
                                        }
                                        i11 = -1;
                                        break;
                                    case 3314158:
                                        if (str4.equals("lang")) {
                                            i11 = 6;
                                            break;
                                        }
                                        i11 = -1;
                                        break;
                                    case 3511770:
                                        if (str4.equals("ruby")) {
                                            i11 = 7;
                                            break;
                                        }
                                        i11 = -1;
                                        break;
                                    default:
                                        i11 = -1;
                                        break;
                                }
                                switch (i11) {
                                    case 0:
                                    case 1:
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                    case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                                    case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                                        if (i8 != 0) {
                                            while (!arrayDeque.isEmpty()) {
                                                e eVar = (e) arrayDeque.pop();
                                                a(str, eVar, arrayList, spannableStringBuilder, list);
                                                if (!arrayDeque.isEmpty()) {
                                                    arrayList.add(new d(eVar, spannableStringBuilder.length()));
                                                } else {
                                                    arrayList.clear();
                                                }
                                                if (eVar.f3635a.equals(str4)) {
                                                    break;
                                                }
                                            }
                                            break;
                                        } else if (i9 == 0) {
                                            int length = spannableStringBuilder.length();
                                            String trim2 = substring.trim();
                                            AbstractC0156a.f(trim2.isEmpty() ^ i13);
                                            int indexOf2 = trim2.indexOf(" ");
                                            if (indexOf2 == -1) {
                                                c5 = 0;
                                            } else {
                                                str3 = trim2.substring(indexOf2).trim();
                                                c5 = 0;
                                                trim2 = trim2.substring(0, indexOf2);
                                            }
                                            String[] split = trim2.split("\\.", -1);
                                            String str5 = split[c5];
                                            HashSet hashSet = new HashSet();
                                            for (int i19 = i13; i19 < split.length; i19 += i13) {
                                                hashSet.add(split[i19]);
                                            }
                                            arrayDeque.push(new e(str5, length, str3, hashSet));
                                            break;
                                        }
                                        break;
                                }
                            }
                            i14 = i15;
                        }
                        i7 = i13;
                        i14 = i15;
                    }
                } else {
                    i14 += i13;
                    int indexOf3 = str2.indexOf(59, i14);
                    int indexOf4 = str2.indexOf(32, i14);
                    char c6 = 65535;
                    if (indexOf3 == -1) {
                        indexOf3 = indexOf4;
                    } else if (indexOf4 != -1) {
                        indexOf3 = Math.min(indexOf3, indexOf4);
                    }
                    if (indexOf3 != -1) {
                        String substring2 = str2.substring(i14, indexOf3);
                        substring2.getClass();
                        switch (substring2.hashCode()) {
                            case 3309:
                                if (substring2.equals("gt")) {
                                    c6 = 0;
                                    break;
                                }
                                break;
                            case 3464:
                                if (substring2.equals("lt")) {
                                    c6 = 1;
                                    break;
                                }
                                break;
                            case 96708:
                                if (substring2.equals("amp")) {
                                    c6 = 2;
                                    break;
                                }
                                break;
                            case 3374865:
                                if (substring2.equals("nbsp")) {
                                    c6 = 3;
                                    break;
                                }
                                break;
                        }
                        switch (c6) {
                            case 0:
                                spannableStringBuilder.append('>');
                                break;
                            case 1:
                                spannableStringBuilder.append('<');
                                break;
                            case 2:
                                spannableStringBuilder.append('&');
                                break;
                            case 3:
                                spannableStringBuilder.append(' ');
                                break;
                            default:
                                AbstractC0156a.K("WebvttCueParser", "ignoring unsupported entity: '&" + substring2 + ";'");
                                break;
                        }
                        if (indexOf3 == indexOf4) {
                            spannableStringBuilder.append((CharSequence) " ");
                        }
                        i7 = 1;
                        i14 = indexOf3 + 1;
                    } else {
                        i7 = 1;
                        spannableStringBuilder.append(charAt);
                    }
                }
                i13 = i7;
                i12 = 2;
            } else {
                while (!arrayDeque.isEmpty()) {
                    a(str, (e) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
                }
                a(str, new e("", 0, "", Collections.emptySet()), Collections.emptyList(), spannableStringBuilder, list);
                return SpannedString.valueOf(spannableStringBuilder);
            }
        }
    }

    public static void g(String str, g gVar) {
        int indexOf = str.indexOf(44);
        char c5 = 65535;
        if (indexOf != -1) {
            String substring = str.substring(indexOf + 1);
            substring.getClass();
            int i7 = 2;
            switch (substring.hashCode()) {
                case -1364013995:
                    if (substring.equals("center")) {
                        c5 = 0;
                        break;
                    }
                    break;
                case -1074341483:
                    if (substring.equals("middle")) {
                        c5 = 1;
                        break;
                    }
                    break;
                case 100571:
                    if (substring.equals("end")) {
                        c5 = 2;
                        break;
                    }
                    break;
                case 109757538:
                    if (substring.equals("start")) {
                        c5 = 3;
                        break;
                    }
                    break;
            }
            switch (c5) {
                case 0:
                case 1:
                    i7 = 1;
                    break;
                case 2:
                    break;
                case 3:
                    i7 = 0;
                    break;
                default:
                    AbstractC0156a.K("WebvttCueParser", "Invalid anchor value: ".concat(substring));
                    i7 = Integer.MIN_VALUE;
                    break;
            }
            gVar.f3644g = i7;
            str = str.substring(0, indexOf);
        }
        if (str.endsWith("%")) {
            gVar.f3643e = j.b(str);
            gVar.f = 0;
            return;
        }
        gVar.f3643e = Integer.parseInt(str);
        gVar.f = 1;
    }
}
