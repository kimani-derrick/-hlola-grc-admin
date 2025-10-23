package T2;

import K.C0040p;
import M2.h;
import M2.j;
import Z2.AbstractC0156a;
import Z2.H;
import android.text.Layout;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import p6.l;
import r0.AbstractC1111a;
/* loaded from: classes.dex */
public final class d extends M2.g {
    public static final Pattern n = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* renamed from: o  reason: collision with root package name */
    public static final Pattern f3283o = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* renamed from: p  reason: collision with root package name */
    public static final Pattern f3284p = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* renamed from: q  reason: collision with root package name */
    public static final Pattern f3285q = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* renamed from: r  reason: collision with root package name */
    public static final Pattern f3286r = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");

    /* renamed from: s  reason: collision with root package name */
    public static final Pattern f3287s = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");

    /* renamed from: t  reason: collision with root package name */
    public static final Pattern f3288t = Pattern.compile("^(\\d+) (\\d+)$");

    /* renamed from: u  reason: collision with root package name */
    public static final c f3289u = new c(30.0f, 1, 1);

    /* renamed from: v  reason: collision with root package name */
    public static final B4.b f3290v = new B4.b(15);

    /* renamed from: m  reason: collision with root package name */
    public final XmlPullParserFactory f3291m;

    public d() {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.f3291m = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e3) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e3);
        }
    }

    public static g i(g gVar) {
        if (gVar == null) {
            return new g();
        }
        return gVar;
    }

    public static boolean j(String str) {
        if (!str.equals("tt") && !str.equals("head") && !str.equals("body") && !str.equals("div") && !str.equals("p") && !str.equals("span") && !str.equals("br") && !str.equals("style") && !str.equals("styling") && !str.equals("layout") && !str.equals("region") && !str.equals("metadata") && !str.equals("image") && !str.equals("data") && !str.equals("information")) {
            return false;
        }
        return true;
    }

    public static Layout.Alignment k(String str) {
        String T6 = l.T(str);
        T6.getClass();
        char c5 = 65535;
        switch (T6.hashCode()) {
            case -1364013995:
                if (T6.equals("center")) {
                    c5 = 0;
                    break;
                }
                break;
            case 100571:
                if (T6.equals("end")) {
                    c5 = 1;
                    break;
                }
                break;
            case 3317767:
                if (T6.equals("left")) {
                    c5 = 2;
                    break;
                }
                break;
            case 108511772:
                if (T6.equals("right")) {
                    c5 = 3;
                    break;
                }
                break;
            case 109757538:
                if (T6.equals("start")) {
                    c5 = 4;
                    break;
                }
                break;
        }
        switch (c5) {
            case 0:
                return Layout.Alignment.ALIGN_CENTER;
            case 1:
            case 3:
                return Layout.Alignment.ALIGN_OPPOSITE;
            case 2:
            case 4:
                return Layout.Alignment.ALIGN_NORMAL;
            default:
                return null;
        }
    }

    public static B4.b l(XmlPullParser xmlPullParser, B4.b bVar) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return bVar;
        }
        Matcher matcher = f3288t.matcher(attributeValue);
        if (!matcher.matches()) {
            AbstractC0156a.K("TtmlDecoder", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return bVar;
        }
        try {
            String group = matcher.group(1);
            group.getClass();
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            group2.getClass();
            int parseInt2 = Integer.parseInt(group2);
            if (parseInt != 0 && parseInt2 != 0) {
                return new B4.b(parseInt2);
            }
            throw new Exception("Invalid cell resolution " + parseInt + " " + parseInt2);
        } catch (NumberFormatException unused) {
            AbstractC0156a.K("TtmlDecoder", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return bVar;
        }
    }

    public static void m(String str, g gVar) {
        Matcher matcher;
        char c5 = 65535;
        int i7 = H.f4603a;
        String[] split = str.split("\\s+", -1);
        int length = split.length;
        Pattern pattern = f3284p;
        if (length == 1) {
            matcher = pattern.matcher(str);
        } else if (split.length == 2) {
            matcher = pattern.matcher(split[1]);
            AbstractC0156a.K("TtmlDecoder", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        } else {
            throw new Exception(AbstractC0515y1.n(new StringBuilder("Invalid number of entries for fontSize: "), split.length, "."));
        }
        if (matcher.matches()) {
            String group = matcher.group(3);
            group.getClass();
            group.hashCode();
            switch (group.hashCode()) {
                case 37:
                    if (group.equals("%")) {
                        c5 = 0;
                        break;
                    }
                    break;
                case 3240:
                    if (group.equals("em")) {
                        c5 = 1;
                        break;
                    }
                    break;
                case 3592:
                    if (group.equals("px")) {
                        c5 = 2;
                        break;
                    }
                    break;
            }
            switch (c5) {
                case 0:
                    gVar.f3318j = 3;
                    break;
                case 1:
                    gVar.f3318j = 2;
                    break;
                case 2:
                    gVar.f3318j = 1;
                    break;
                default:
                    throw new Exception(AbstractC1111a.r("Invalid unit for fontSize: '", group, "'."));
            }
            String group2 = matcher.group(1);
            group2.getClass();
            gVar.f3319k = Float.parseFloat(group2);
            return;
        }
        throw new Exception(AbstractC1111a.r("Invalid expression for fontSize: '", str, "'."));
    }

    public static c n(XmlPullParser xmlPullParser) {
        int i7;
        float f;
        int i8;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        if (attributeValue != null) {
            i7 = Integer.parseInt(attributeValue);
        } else {
            i7 = 30;
        }
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            int i9 = H.f4603a;
            String[] split = attributeValue2.split(" ", -1);
            if (split.length == 2) {
                f = Integer.parseInt(split[0]) / Integer.parseInt(split[1]);
            } else {
                throw new Exception("frameRateMultiplier doesn't have 2 parts");
            }
        } else {
            f = 1.0f;
        }
        c cVar = f3289u;
        int i10 = cVar.f3281b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i10 = Integer.parseInt(attributeValue3);
        }
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i8 = Integer.parseInt(attributeValue4);
        } else {
            i8 = cVar.f3282c;
        }
        return new c(i7 * f, i10, i8);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0200  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void o(org.xmlpull.v1.XmlPullParser r20, java.util.HashMap r21, B4.b r22, K.C0040p r23, java.util.HashMap r24, java.util.HashMap r25) {
        /*
            Method dump skipped, instructions count: 602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: T2.d.o(org.xmlpull.v1.XmlPullParser, java.util.HashMap, B4.b, K.p, java.util.HashMap, java.util.HashMap):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static e p(XmlPullParser xmlPullParser, e eVar, HashMap hashMap, c cVar) {
        long j7;
        long j8;
        char c5;
        String[] split;
        int attributeCount = xmlPullParser.getAttributeCount();
        g q5 = q(xmlPullParser, null);
        String str = null;
        String str2 = "";
        long j9 = -9223372036854775807L;
        long j10 = -9223372036854775807L;
        long j11 = -9223372036854775807L;
        String[] strArr = null;
        for (int i7 = 0; i7 < attributeCount; i7++) {
            String attributeName = xmlPullParser.getAttributeName(i7);
            String attributeValue = xmlPullParser.getAttributeValue(i7);
            attributeName.getClass();
            switch (attributeName.hashCode()) {
                case -934795532:
                    if (attributeName.equals("region")) {
                        c5 = 0;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 99841:
                    if (attributeName.equals("dur")) {
                        c5 = 1;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 100571:
                    if (attributeName.equals("end")) {
                        c5 = 2;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 93616297:
                    if (attributeName.equals("begin")) {
                        c5 = 3;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 109780401:
                    if (attributeName.equals("style")) {
                        c5 = 4;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 1292595405:
                    if (attributeName.equals("backgroundImage")) {
                        c5 = 5;
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
                    if (hashMap.containsKey(attributeValue)) {
                        str2 = attributeValue;
                        continue;
                    }
                case 1:
                    j11 = r(attributeValue, cVar);
                    break;
                case 2:
                    j10 = r(attributeValue, cVar);
                    break;
                case 3:
                    j9 = r(attributeValue, cVar);
                    break;
                case 4:
                    String trim = attributeValue.trim();
                    if (trim.isEmpty()) {
                        split = new String[0];
                    } else {
                        int i8 = H.f4603a;
                        split = trim.split("\\s+", -1);
                    }
                    if (split.length > 0) {
                        strArr = split;
                        break;
                    }
                    break;
                case 5:
                    if (attributeValue.startsWith("#")) {
                        str = attributeValue.substring(1);
                        break;
                    }
                    break;
            }
        }
        if (eVar != null) {
            long j12 = eVar.d;
            j7 = -9223372036854775807L;
            if (j12 != -9223372036854775807L) {
                if (j9 != -9223372036854775807L) {
                    j9 += j12;
                }
                if (j10 != -9223372036854775807L) {
                    j10 += j12;
                }
            }
        } else {
            j7 = -9223372036854775807L;
        }
        if (j10 == j7) {
            if (j11 != j7) {
                j8 = j9 + j11;
            } else if (eVar != null) {
                long j13 = eVar.f3295e;
                if (j13 != j7) {
                    j8 = j13;
                }
            }
            return new e(xmlPullParser.getName(), null, j9, j8, q5, strArr, str2, str, eVar);
        }
        j8 = j10;
        return new e(xmlPullParser.getName(), null, j9, j8, q5, strArr, str2, str, eVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0296  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static T2.g q(org.xmlpull.v1.XmlPullParser r16, T2.g r17) {
        /*
            Method dump skipped, instructions count: 1282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: T2.d.q(org.xmlpull.v1.XmlPullParser, T2.g):T2.g");
    }

    public static long r(String str, c cVar) {
        double d;
        double d7;
        String group;
        String group2;
        String group3;
        double d8;
        double d9;
        String group4;
        Matcher matcher = n.matcher(str);
        if (matcher.matches()) {
            matcher.group(1).getClass();
            matcher.group(2).getClass();
            matcher.group(3).getClass();
            double parseLong = (Long.parseLong(group) * 3600) + (Long.parseLong(group2) * 60) + Long.parseLong(group3);
            String group5 = matcher.group(4);
            double d10 = 0.0d;
            if (group5 != null) {
                d8 = Double.parseDouble(group5);
            } else {
                d8 = 0.0d;
            }
            double d11 = parseLong + d8;
            String group6 = matcher.group(5);
            if (group6 != null) {
                d9 = ((float) Long.parseLong(group6)) / cVar.f3280a;
            } else {
                d9 = 0.0d;
            }
            double d12 = d11 + d9;
            if (matcher.group(6) != null) {
                d10 = (Long.parseLong(group4) / cVar.f3281b) / cVar.f3280a;
            }
            return (long) ((d12 + d10) * 1000000.0d);
        }
        Matcher matcher2 = f3283o.matcher(str);
        if (matcher2.matches()) {
            String group7 = matcher2.group(1);
            group7.getClass();
            double parseDouble = Double.parseDouble(group7);
            String group8 = matcher2.group(2);
            group8.getClass();
            group8.hashCode();
            char c5 = 65535;
            switch (group8.hashCode()) {
                case 102:
                    if (group8.equals("f")) {
                        c5 = 0;
                        break;
                    }
                    break;
                case 104:
                    if (group8.equals("h")) {
                        c5 = 1;
                        break;
                    }
                    break;
                case 109:
                    if (group8.equals("m")) {
                        c5 = 2;
                        break;
                    }
                    break;
                case 116:
                    if (group8.equals("t")) {
                        c5 = 3;
                        break;
                    }
                    break;
                case 3494:
                    if (group8.equals("ms")) {
                        c5 = 4;
                        break;
                    }
                    break;
            }
            switch (c5) {
                case 0:
                    d = cVar.f3280a;
                    parseDouble /= d;
                    return (long) (parseDouble * 1000000.0d);
                case 1:
                    d7 = 3600.0d;
                    parseDouble *= d7;
                    return (long) (parseDouble * 1000000.0d);
                case 2:
                    d7 = 60.0d;
                    parseDouble *= d7;
                    return (long) (parseDouble * 1000000.0d);
                case 3:
                    d = cVar.f3282c;
                    parseDouble /= d;
                    return (long) (parseDouble * 1000000.0d);
                case 4:
                    d = 1000.0d;
                    parseDouble /= d;
                    return (long) (parseDouble * 1000000.0d);
                default:
                    return (long) (parseDouble * 1000000.0d);
            }
        }
        throw new Exception(AbstractC0515y1.x("Malformed time expression: ", str));
    }

    public static C0040p s(XmlPullParser xmlPullParser) {
        String v5 = AbstractC0156a.v(xmlPullParser, "extent");
        if (v5 == null) {
            return null;
        }
        Matcher matcher = f3287s.matcher(v5);
        if (!matcher.matches()) {
            AbstractC0156a.K("TtmlDecoder", "Ignoring non-pixel tts extent: ".concat(v5));
            return null;
        }
        try {
            String group = matcher.group(1);
            group.getClass();
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            group2.getClass();
            return new C0040p(parseInt, Integer.parseInt(group2));
        } catch (NumberFormatException unused) {
            AbstractC0156a.K("TtmlDecoder", "Ignoring malformed tts extent: ".concat(v5));
            return null;
        }
    }

    @Override // M2.g
    public final h f(int i7, boolean z7, byte[] bArr) {
        B4.b bVar;
        c cVar;
        try {
            XmlPullParser newPullParser = this.f3291m.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            hashMap2.put("", new f("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            C0040p c0040p = null;
            newPullParser.setInput(new ByteArrayInputStream(bArr, 0, i7), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            c cVar2 = f3289u;
            B4.b bVar2 = f3290v;
            int i8 = 0;
            H.e eVar = null;
            B4.b bVar3 = bVar2;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                e eVar2 = (e) arrayDeque.peek();
                if (i8 == 0) {
                    String name = newPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            cVar2 = n(newPullParser);
                            bVar3 = l(newPullParser, bVar2);
                            c0040p = s(newPullParser);
                        }
                        B4.b bVar4 = bVar3;
                        C0040p c0040p2 = c0040p;
                        c cVar3 = cVar2;
                        if (!j(name)) {
                            AbstractC0156a.x("TtmlDecoder", "Ignoring unsupported tag: " + newPullParser.getName());
                            i8++;
                            bVar3 = bVar4;
                            cVar2 = cVar3;
                        } else {
                            if ("head".equals(name)) {
                                bVar = bVar4;
                                cVar = cVar3;
                                o(newPullParser, hashMap, bVar4, c0040p2, hashMap2, hashMap3);
                            } else {
                                bVar = bVar4;
                                cVar = cVar3;
                                try {
                                    e p3 = p(newPullParser, eVar2, hashMap2, cVar);
                                    arrayDeque.push(p3);
                                    if (eVar2 != null) {
                                        if (eVar2.f3302m == null) {
                                            eVar2.f3302m = new ArrayList();
                                        }
                                        eVar2.f3302m.add(p3);
                                    }
                                } catch (j e3) {
                                    AbstractC0156a.L("TtmlDecoder", "Suppressing parser error", e3);
                                    i8++;
                                }
                            }
                            bVar3 = bVar;
                            cVar2 = cVar;
                        }
                        c0040p = c0040p2;
                    } else if (eventType == 4) {
                        eVar2.getClass();
                        e a7 = e.a(newPullParser.getText());
                        if (eVar2.f3302m == null) {
                            eVar2.f3302m = new ArrayList();
                        }
                        eVar2.f3302m.add(a7);
                    } else if (eventType == 3) {
                        if (newPullParser.getName().equals("tt")) {
                            e eVar3 = (e) arrayDeque.peek();
                            eVar3.getClass();
                            eVar = new H.e(eVar3, hashMap, hashMap2, hashMap3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i8++;
                } else if (eventType == 3) {
                    i8--;
                }
                newPullParser.next();
            }
            if (eVar != null) {
                return eVar;
            }
            throw new Exception("No TTML subtitles found");
        } catch (IOException e7) {
            throw new IllegalStateException("Unexpected error when reading input.", e7);
        } catch (XmlPullParserException e8) {
            throw new Exception("Unable to decode source", e8);
        }
    }
}
