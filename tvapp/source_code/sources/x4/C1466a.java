package x4;

import C4.b;
import H.e;
import I4.d;
import T4.c;
import X.i;
import android.util.Base64;
import android.util.JsonReader;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import s2.l;
import w4.B;
import w4.C;
import w4.C1404A;
import w4.C1408b0;
import w4.E;
import w4.F;
import w4.F0;
import w4.I;
import w4.L;
import w4.M;
import w4.N;
import w4.P;
import w4.Q;
import w4.T;
import w4.U;
import w4.W;
import w4.Z;
import z4.C1518b;
/* renamed from: x4.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1466a {

    /* renamed from: a  reason: collision with root package name */
    public static final c f16220a;

    static {
        d dVar = new d();
        C1404A.f15869a.a(dVar);
        dVar.d = true;
        f16220a = new c(8, dVar);
    }

    public static T a(JsonReader jsonReader) {
        e eVar = new e(8);
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c5 = 65535;
            switch (nextName.hashCode()) {
                case -1019779949:
                    if (nextName.equals("offset")) {
                        c5 = 0;
                        break;
                    }
                    break;
                case -887523944:
                    if (nextName.equals("symbol")) {
                        c5 = 1;
                        break;
                    }
                    break;
                case 3571:
                    if (nextName.equals("pc")) {
                        c5 = 2;
                        break;
                    }
                    break;
                case 3143036:
                    if (nextName.equals("file")) {
                        c5 = 3;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c5 = 4;
                        break;
                    }
                    break;
            }
            switch (c5) {
                case 0:
                    eVar.f780u = Long.valueOf(jsonReader.nextLong());
                    break;
                case 1:
                    String nextString = jsonReader.nextString();
                    if (nextString != null) {
                        eVar.f777r = nextString;
                        break;
                    } else {
                        throw new NullPointerException("Null symbol");
                    }
                case 2:
                    eVar.f779t = Long.valueOf(jsonReader.nextLong());
                    break;
                case 3:
                    eVar.f778s = jsonReader.nextString();
                    break;
                case 4:
                    eVar.f781v = Integer.valueOf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return eVar.s();
    }

    public static E b(JsonReader jsonReader) {
        String str;
        jsonReader.beginObject();
        String str2 = null;
        String str3 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            if (!nextName.equals("key")) {
                if (!nextName.equals("value")) {
                    jsonReader.skipValue();
                } else {
                    str3 = jsonReader.nextString();
                    if (str3 == null) {
                        throw new NullPointerException("Null value");
                    }
                }
            } else {
                str2 = jsonReader.nextString();
                if (str2 == null) {
                    throw new NullPointerException("Null key");
                }
            }
        }
        jsonReader.endObject();
        if (str2 == null) {
            str = " key";
        } else {
            str = "";
        }
        if (str3 == null) {
            str = str.concat(" value");
        }
        if (str.isEmpty()) {
            return new E(str2, str3);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [B4.d, java.lang.Object] */
    public static C c(JsonReader jsonReader) {
        ?? obj = new Object();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c5 = 65535;
            switch (nextName.hashCode()) {
                case -1516200806:
                    if (nextName.equals("buildIdMappingForArch")) {
                        c5 = 0;
                        break;
                    }
                    break;
                case 110987:
                    if (nextName.equals("pid")) {
                        c5 = 1;
                        break;
                    }
                    break;
                case 111312:
                    if (nextName.equals("pss")) {
                        c5 = 2;
                        break;
                    }
                    break;
                case 113234:
                    if (nextName.equals("rss")) {
                        c5 = 3;
                        break;
                    }
                    break;
                case 55126294:
                    if (nextName.equals("timestamp")) {
                        c5 = 4;
                        break;
                    }
                    break;
                case 202325402:
                    if (nextName.equals("processName")) {
                        c5 = 5;
                        break;
                    }
                    break;
                case 722137681:
                    if (nextName.equals("reasonCode")) {
                        c5 = 6;
                        break;
                    }
                    break;
                case 723857505:
                    if (nextName.equals("traceFile")) {
                        c5 = 7;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c5 = '\b';
                        break;
                    }
                    break;
            }
            switch (c5) {
                case 0:
                    obj.f270i = d(jsonReader, new l(1));
                    break;
                case 1:
                    obj.f264a = Integer.valueOf(jsonReader.nextInt());
                    break;
                case 2:
                    obj.f267e = Long.valueOf(jsonReader.nextLong());
                    break;
                case 3:
                    obj.f = Long.valueOf(jsonReader.nextLong());
                    break;
                case 4:
                    obj.f268g = Long.valueOf(jsonReader.nextLong());
                    break;
                case 5:
                    String nextString = jsonReader.nextString();
                    if (nextString != null) {
                        obj.f265b = nextString;
                        break;
                    } else {
                        throw new NullPointerException("Null processName");
                    }
                case i.STRING_SET_FIELD_NUMBER /* 6 */:
                    obj.f266c = Integer.valueOf(jsonReader.nextInt());
                    break;
                case i.DOUBLE_FIELD_NUMBER /* 7 */:
                    obj.f269h = jsonReader.nextString();
                    break;
                case '\b':
                    obj.d = Integer.valueOf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return obj.a();
    }

    public static List d(JsonReader jsonReader, l lVar) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(lVar.a(jsonReader));
        }
        jsonReader.endArray();
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [z4.b, java.lang.Object] */
    public static L e(JsonReader jsonReader) {
        C1518b c1518b;
        String str;
        String str2;
        C1518b c1518b2;
        String str3;
        U u7;
        List list;
        String str4;
        C1518b c1518b3;
        String str5;
        U u8;
        List list2;
        String str6;
        C1518b c1518b4;
        Object obj = new Object();
        jsonReader.beginObject();
        C1518b c1518b5 = obj;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c5 = 65535;
            switch (nextName.hashCode()) {
                case -1335157162:
                    if (nextName.equals("device")) {
                        c5 = 0;
                        break;
                    }
                    break;
                case -259312414:
                    if (nextName.equals("rollouts")) {
                        c5 = 1;
                        break;
                    }
                    break;
                case 96801:
                    if (nextName.equals("app")) {
                        c5 = 2;
                        break;
                    }
                    break;
                case 107332:
                    if (nextName.equals("log")) {
                        c5 = 3;
                        break;
                    }
                    break;
                case 3575610:
                    if (nextName.equals("type")) {
                        c5 = 4;
                        break;
                    }
                    break;
                case 55126294:
                    if (nextName.equals("timestamp")) {
                        c5 = 5;
                        break;
                    }
                    break;
            }
            if (c5 != 0) {
                String str7 = "";
                if (c5 != 1) {
                    if (c5 != 2) {
                        if (c5 != 3) {
                            if (c5 != 4) {
                                if (c5 != 5) {
                                    jsonReader.skipValue();
                                } else {
                                    c1518b5.f16461a = Long.valueOf(jsonReader.nextLong());
                                }
                            } else {
                                String nextString = jsonReader.nextString();
                                if (nextString != null) {
                                    c1518b5.f16462b = nextString;
                                } else {
                                    throw new NullPointerException("Null type");
                                }
                            }
                        } else {
                            jsonReader.beginObject();
                            String str8 = null;
                            while (jsonReader.hasNext()) {
                                if (jsonReader.nextName().equals("content")) {
                                    String nextString2 = jsonReader.nextString();
                                    if (nextString2 != null) {
                                        str8 = nextString2;
                                    } else {
                                        throw new NullPointerException("Null content");
                                    }
                                } else {
                                    jsonReader.skipValue();
                                }
                            }
                            jsonReader.endObject();
                            if (str8 == null) {
                                str7 = " content";
                            }
                            if (str7.isEmpty()) {
                                c1518b5.f16464e = new W(str8);
                            } else {
                                throw new IllegalStateException("Missing required properties:".concat(str7));
                            }
                        }
                        c1518b = c1518b5;
                    } else {
                        jsonReader.beginObject();
                        N n = null;
                        List list3 = null;
                        List list4 = null;
                        Boolean bool = null;
                        U u9 = null;
                        List list5 = null;
                        Integer num = null;
                        C1518b c1518b6 = c1518b5;
                        while (jsonReader.hasNext()) {
                            String nextName2 = jsonReader.nextName();
                            nextName2.getClass();
                            nextName2.hashCode();
                            char c6 = 65535;
                            switch (nextName2.hashCode()) {
                                case -1405314732:
                                    if (nextName2.equals("appProcessDetails")) {
                                        c6 = 0;
                                        break;
                                    }
                                    break;
                                case -1332194002:
                                    if (nextName2.equals("background")) {
                                        c6 = 1;
                                        break;
                                    }
                                    break;
                                case -1090974952:
                                    if (nextName2.equals("execution")) {
                                        c6 = 2;
                                        break;
                                    }
                                    break;
                                case -80231855:
                                    if (nextName2.equals("internalKeys")) {
                                        c6 = 3;
                                        break;
                                    }
                                    break;
                                case 555169704:
                                    if (nextName2.equals("customAttributes")) {
                                        c6 = 4;
                                        break;
                                    }
                                    break;
                                case 928737948:
                                    if (nextName2.equals("uiOrientation")) {
                                        c6 = 5;
                                        break;
                                    }
                                    break;
                                case 1847730860:
                                    if (nextName2.equals("currentProcessDetails")) {
                                        c6 = 6;
                                        break;
                                    }
                                    break;
                            }
                            switch (c6) {
                                case 0:
                                    c1518b2 = c1518b6;
                                    str3 = str7;
                                    u7 = u9;
                                    ArrayList arrayList = new ArrayList();
                                    jsonReader.beginArray();
                                    while (jsonReader.hasNext()) {
                                        arrayList.add(g(jsonReader));
                                    }
                                    jsonReader.endArray();
                                    list5 = Collections.unmodifiableList(arrayList);
                                    u9 = u7;
                                    str7 = str3;
                                    c1518b6 = c1518b2;
                                case 1:
                                    c1518b2 = c1518b6;
                                    str3 = str7;
                                    u7 = u9;
                                    list = list5;
                                    bool = Boolean.valueOf(jsonReader.nextBoolean());
                                    list5 = list;
                                    u9 = u7;
                                    str7 = str3;
                                    c1518b6 = c1518b2;
                                case 2:
                                    jsonReader.beginObject();
                                    List list6 = null;
                                    P p3 = null;
                                    C c7 = null;
                                    Q q5 = null;
                                    List list7 = null;
                                    C1518b c1518b7 = c1518b6;
                                    while (jsonReader.hasNext()) {
                                        String nextName3 = jsonReader.nextName();
                                        nextName3.getClass();
                                        nextName3.hashCode();
                                        char c8 = 65535;
                                        switch (nextName3.hashCode()) {
                                            case -1375141843:
                                                if (nextName3.equals("appExitInfo")) {
                                                    c8 = 0;
                                                    break;
                                                }
                                                break;
                                            case -1337936983:
                                                if (nextName3.equals("threads")) {
                                                    c8 = 1;
                                                    break;
                                                }
                                                break;
                                            case -902467928:
                                                if (nextName3.equals("signal")) {
                                                    c8 = 2;
                                                    break;
                                                }
                                                break;
                                            case 937615455:
                                                if (nextName3.equals("binaries")) {
                                                    c8 = 3;
                                                    break;
                                                }
                                                break;
                                            case 1481625679:
                                                if (nextName3.equals("exception")) {
                                                    c8 = 4;
                                                    break;
                                                }
                                                break;
                                        }
                                        switch (c8) {
                                            case 0:
                                                c1518b3 = c1518b7;
                                                str5 = str7;
                                                u8 = u9;
                                                list2 = list5;
                                                c7 = c(jsonReader);
                                                break;
                                            case 1:
                                                c1518b3 = c1518b7;
                                                str5 = str7;
                                                u8 = u9;
                                                list2 = list5;
                                                list6 = d(jsonReader, new l(4));
                                                break;
                                            case 2:
                                                jsonReader.beginObject();
                                                String str9 = null;
                                                String str10 = null;
                                                Long l7 = null;
                                                C1518b c1518b8 = c1518b7;
                                                while (jsonReader.hasNext()) {
                                                    String str11 = str7;
                                                    String nextName4 = jsonReader.nextName();
                                                    nextName4.getClass();
                                                    nextName4.hashCode();
                                                    char c9 = 65535;
                                                    switch (nextName4.hashCode()) {
                                                        case -1147692044:
                                                            c1518b4 = c1518b8;
                                                            if (nextName4.equals("address")) {
                                                                c9 = 0;
                                                                break;
                                                            }
                                                            break;
                                                        case 3059181:
                                                            c1518b4 = c1518b8;
                                                            if (nextName4.equals("code")) {
                                                                c9 = 1;
                                                                break;
                                                            }
                                                            break;
                                                        case 3373707:
                                                            c1518b4 = c1518b8;
                                                            if (nextName4.equals("name")) {
                                                                c9 = 2;
                                                                break;
                                                            }
                                                            break;
                                                        default:
                                                            c1518b4 = c1518b8;
                                                            break;
                                                    }
                                                    switch (c9) {
                                                        case 0:
                                                            l7 = Long.valueOf(jsonReader.nextLong());
                                                            break;
                                                        case 1:
                                                            str10 = jsonReader.nextString();
                                                            if (str10 != null) {
                                                                break;
                                                            } else {
                                                                throw new NullPointerException("Null code");
                                                            }
                                                        case 2:
                                                            str9 = jsonReader.nextString();
                                                            if (str9 != null) {
                                                                break;
                                                            } else {
                                                                throw new NullPointerException("Null name");
                                                            }
                                                        default:
                                                            jsonReader.skipValue();
                                                            break;
                                                    }
                                                    str7 = str11;
                                                    c1518b8 = c1518b4;
                                                }
                                                c1518b3 = c1518b8;
                                                str5 = str7;
                                                jsonReader.endObject();
                                                if (str9 == null) {
                                                    str6 = " name";
                                                } else {
                                                    str6 = str5;
                                                }
                                                if (str10 == null) {
                                                    str6 = str6.concat(" code");
                                                }
                                                if (l7 == null) {
                                                    str6 = AbstractC0515y1.m(str6, " address");
                                                }
                                                if (str6.isEmpty()) {
                                                    u8 = u9;
                                                    list2 = list5;
                                                    q5 = new Q(l7.longValue(), str9, str10);
                                                    break;
                                                } else {
                                                    throw new IllegalStateException("Missing required properties:".concat(str6));
                                                }
                                            case 3:
                                                list7 = d(jsonReader, new l(5));
                                                if (list7 == null) {
                                                    throw new NullPointerException("Null binaries");
                                                }
                                                c1518b3 = c1518b7;
                                                str5 = str7;
                                                u8 = u9;
                                                list2 = list5;
                                                break;
                                            case 4:
                                                p3 = f(jsonReader);
                                                c1518b3 = c1518b7;
                                                str5 = str7;
                                                u8 = u9;
                                                list2 = list5;
                                                break;
                                            default:
                                                jsonReader.skipValue();
                                                c1518b3 = c1518b7;
                                                str5 = str7;
                                                u8 = u9;
                                                list2 = list5;
                                                break;
                                        }
                                        str7 = str5;
                                        c1518b7 = c1518b3;
                                        list5 = list2;
                                        u9 = u8;
                                    }
                                    c1518b2 = c1518b7;
                                    str3 = str7;
                                    u7 = u9;
                                    list = list5;
                                    jsonReader.endObject();
                                    if (q5 == null) {
                                        str4 = " signal";
                                    } else {
                                        str4 = str3;
                                    }
                                    if (list7 == null) {
                                        str4 = str4.concat(" binaries");
                                    }
                                    if (str4.isEmpty()) {
                                        n = new N(list6, p3, c7, q5, list7);
                                        list5 = list;
                                        u9 = u7;
                                        str7 = str3;
                                        c1518b6 = c1518b2;
                                    } else {
                                        throw new IllegalStateException("Missing required properties:".concat(str4));
                                    }
                                case 3:
                                    ArrayList arrayList2 = new ArrayList();
                                    jsonReader.beginArray();
                                    while (jsonReader.hasNext()) {
                                        arrayList2.add(b(jsonReader));
                                    }
                                    jsonReader.endArray();
                                    list4 = Collections.unmodifiableList(arrayList2);
                                    c1518b2 = c1518b6;
                                    str3 = str7;
                                    str7 = str3;
                                    c1518b6 = c1518b2;
                                case 4:
                                    ArrayList arrayList3 = new ArrayList();
                                    jsonReader.beginArray();
                                    while (jsonReader.hasNext()) {
                                        arrayList3.add(b(jsonReader));
                                    }
                                    jsonReader.endArray();
                                    list3 = Collections.unmodifiableList(arrayList3);
                                    c1518b2 = c1518b6;
                                    str3 = str7;
                                    str7 = str3;
                                    c1518b6 = c1518b2;
                                case 5:
                                    num = Integer.valueOf(jsonReader.nextInt());
                                    c1518b2 = c1518b6;
                                    str3 = str7;
                                    str7 = str3;
                                    c1518b6 = c1518b2;
                                case i.STRING_SET_FIELD_NUMBER /* 6 */:
                                    u9 = g(jsonReader);
                                    c1518b2 = c1518b6;
                                    str3 = str7;
                                    str7 = str3;
                                    c1518b6 = c1518b2;
                                default:
                                    jsonReader.skipValue();
                                    c1518b2 = c1518b6;
                                    str3 = str7;
                                    str7 = str3;
                                    c1518b6 = c1518b2;
                            }
                        }
                        C1518b c1518b9 = c1518b6;
                        String str12 = str7;
                        U u10 = u9;
                        List list8 = list5;
                        jsonReader.endObject();
                        if (n == null) {
                            str2 = " execution";
                        } else {
                            str2 = str12;
                        }
                        if (num == null) {
                            str2 = str2.concat(" uiOrientation");
                        }
                        if (str2.isEmpty()) {
                            M m7 = new M(n, list3, list4, bool, u10, list8, num.intValue());
                            c1518b = c1518b9;
                            c1518b.f16463c = m7;
                        } else {
                            throw new IllegalStateException("Missing required properties:".concat(str2));
                        }
                    }
                } else {
                    c1518b = c1518b5;
                    jsonReader.beginObject();
                    List list9 = null;
                    while (jsonReader.hasNext()) {
                        String nextName5 = jsonReader.nextName();
                        nextName5.getClass();
                        if (!nextName5.equals("assignments")) {
                            jsonReader.skipValue();
                        } else {
                            List d = d(jsonReader, new l(3));
                            if (d != null) {
                                list9 = d;
                            } else {
                                throw new NullPointerException("Null rolloutAssignments");
                            }
                        }
                    }
                    jsonReader.endObject();
                    if (list9 != null) {
                        str = "";
                    } else {
                        str = " rolloutAssignments";
                    }
                    if (str.isEmpty()) {
                        c1518b.f = new Z(list9);
                    } else {
                        throw new IllegalStateException("Missing required properties:".concat(str));
                    }
                }
            } else {
                c1518b = c1518b5;
                ?? obj2 = new Object();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName6 = jsonReader.nextName();
                    nextName6.getClass();
                    nextName6.hashCode();
                    char c10 = 65535;
                    switch (nextName6.hashCode()) {
                        case -1708606089:
                            if (nextName6.equals("batteryLevel")) {
                                c10 = 0;
                                break;
                            }
                            break;
                        case -1455558134:
                            if (nextName6.equals("batteryVelocity")) {
                                c10 = 1;
                                break;
                            }
                            break;
                        case -1439500848:
                            if (nextName6.equals("orientation")) {
                                c10 = 2;
                                break;
                            }
                            break;
                        case 279795450:
                            if (nextName6.equals("diskUsed")) {
                                c10 = 3;
                                break;
                            }
                            break;
                        case 976541947:
                            if (nextName6.equals("ramUsed")) {
                                c10 = 4;
                                break;
                            }
                            break;
                        case 1516795582:
                            if (nextName6.equals("proximityOn")) {
                                c10 = 5;
                                break;
                            }
                            break;
                    }
                    switch (c10) {
                        case 0:
                            obj2.f16461a = Double.valueOf(jsonReader.nextDouble());
                            break;
                        case 1:
                            obj2.f16462b = Integer.valueOf(jsonReader.nextInt());
                            break;
                        case 2:
                            obj2.d = Integer.valueOf(jsonReader.nextInt());
                            break;
                        case 3:
                            obj2.f = Long.valueOf(jsonReader.nextLong());
                            break;
                        case 4:
                            obj2.f16464e = Long.valueOf(jsonReader.nextLong());
                            break;
                        case 5:
                            obj2.f16463c = Boolean.valueOf(jsonReader.nextBoolean());
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                c1518b.d = obj2.h();
            }
            c1518b5 = c1518b;
        }
        jsonReader.endObject();
        return c1518b5.g();
    }

    public static P f(JsonReader jsonReader) {
        String str;
        jsonReader.beginObject();
        Integer num = null;
        String str2 = null;
        String str3 = null;
        List list = null;
        P p3 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            nextName.hashCode();
            char c5 = 65535;
            switch (nextName.hashCode()) {
                case -1266514778:
                    if (nextName.equals("frames")) {
                        c5 = 0;
                        break;
                    }
                    break;
                case -934964668:
                    if (nextName.equals("reason")) {
                        c5 = 1;
                        break;
                    }
                    break;
                case 3575610:
                    if (nextName.equals("type")) {
                        c5 = 2;
                        break;
                    }
                    break;
                case 91997906:
                    if (nextName.equals("causedBy")) {
                        c5 = 3;
                        break;
                    }
                    break;
                case 581754413:
                    if (nextName.equals("overflowCount")) {
                        c5 = 4;
                        break;
                    }
                    break;
            }
            switch (c5) {
                case 0:
                    List d = d(jsonReader, new l(6));
                    if (d != null) {
                        list = d;
                        break;
                    } else {
                        throw new NullPointerException("Null frames");
                    }
                case 1:
                    str3 = jsonReader.nextString();
                    break;
                case 2:
                    String nextString = jsonReader.nextString();
                    if (nextString != null) {
                        str2 = nextString;
                        break;
                    } else {
                        throw new NullPointerException("Null type");
                    }
                case 3:
                    p3 = f(jsonReader);
                    break;
                case 4:
                    num = Integer.valueOf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        if (str2 == null) {
            str = " type";
        } else {
            str = "";
        }
        if (list == null) {
            str = str.concat(" frames");
        }
        if (num == null) {
            str = AbstractC0515y1.m(str, " overflowCount");
        }
        if (str.isEmpty()) {
            return new P(str2, str3, list, p3, num.intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public static U g(JsonReader jsonReader) {
        b bVar = new b(23, false);
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c5 = 65535;
            switch (nextName.hashCode()) {
                case 110987:
                    if (nextName.equals("pid")) {
                        c5 = 0;
                        break;
                    }
                    break;
                case 202325402:
                    if (nextName.equals("processName")) {
                        c5 = 1;
                        break;
                    }
                    break;
                case 1694598382:
                    if (nextName.equals("defaultProcess")) {
                        c5 = 2;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c5 = 3;
                        break;
                    }
                    break;
            }
            switch (c5) {
                case 0:
                    bVar.f422s = Integer.valueOf(jsonReader.nextInt());
                    break;
                case 1:
                    String nextString = jsonReader.nextString();
                    if (nextString != null) {
                        bVar.f421r = nextString;
                        break;
                    } else {
                        throw new NullPointerException("Null processName");
                    }
                case 2:
                    bVar.f424u = Boolean.valueOf(jsonReader.nextBoolean());
                    break;
                case 3:
                    bVar.f423t = Integer.valueOf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return bVar.h();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Type inference failed for: r3v60, types: [B4.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [J3.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v35, types: [J3.j, java.lang.Object] */
    public static B h(JsonReader jsonReader) {
        char c5;
        String str;
        String str2;
        char c6;
        char c7;
        char c8;
        String str3;
        char c9;
        String str4;
        String str5 = " identifier";
        Charset charset = F0.f15894a;
        ?? obj = new Object();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName.hashCode()) {
                case -2118372775:
                    if (nextName.equals("ndkPayload")) {
                        c5 = 0;
                        break;
                    }
                    c5 = 65535;
                    break;
                case -1962630338:
                    if (nextName.equals("sdkVersion")) {
                        c5 = 1;
                        break;
                    }
                    c5 = 65535;
                    break;
                case -1907185581:
                    if (nextName.equals("appQualitySessionId")) {
                        c5 = 2;
                        break;
                    }
                    c5 = 65535;
                    break;
                case -1375141843:
                    if (nextName.equals("appExitInfo")) {
                        c5 = 3;
                        break;
                    }
                    c5 = 65535;
                    break;
                case -911706486:
                    if (nextName.equals("buildVersion")) {
                        c5 = 4;
                        break;
                    }
                    c5 = 65535;
                    break;
                case -401988390:
                    if (nextName.equals("firebaseAuthenticationToken")) {
                        c5 = 5;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 344431858:
                    if (nextName.equals("gmpAppId")) {
                        c5 = 6;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 719853845:
                    if (nextName.equals("installationUuid")) {
                        c5 = 7;
                        break;
                    }
                    c5 = 65535;
                    break;
                case 1047652060:
                    if (nextName.equals("firebaseInstallationId")) {
                        c5 = '\b';
                        break;
                    }
                    c5 = 65535;
                    break;
                case 1874684019:
                    if (nextName.equals("platform")) {
                        c5 = '\t';
                        break;
                    }
                    c5 = 65535;
                    break;
                case 1975623094:
                    if (nextName.equals("displayVersion")) {
                        c5 = '\n';
                        break;
                    }
                    c5 = 65535;
                    break;
                case 1984987798:
                    if (nextName.equals("session")) {
                        c5 = 11;
                        break;
                    }
                    c5 = 65535;
                    break;
                default:
                    c5 = 65535;
                    break;
            }
            String str6 = "";
            switch (c5) {
                case 0:
                    str = str5;
                    jsonReader.beginObject();
                    List list = null;
                    String str7 = null;
                    while (jsonReader.hasNext()) {
                        String nextName2 = jsonReader.nextName();
                        nextName2.getClass();
                        if (!nextName2.equals("files")) {
                            if (!nextName2.equals("orgId")) {
                                jsonReader.skipValue();
                            } else {
                                str7 = jsonReader.nextString();
                            }
                        } else {
                            list = d(jsonReader, new l(2));
                            if (list == null) {
                                throw new NullPointerException("Null files");
                            }
                        }
                    }
                    jsonReader.endObject();
                    if (list == null) {
                        str6 = " files";
                    }
                    if (str6.isEmpty()) {
                        obj.f1381k = new F(str7, list);
                        continue;
                        str5 = str;
                    } else {
                        throw new IllegalStateException("Missing required properties:".concat(str6));
                    }
                case 1:
                    str = str5;
                    String nextString = jsonReader.nextString();
                    if (nextString != null) {
                        obj.f1373a = nextString;
                        break;
                    } else {
                        throw new NullPointerException("Null sdkVersion");
                    }
                case 2:
                    str = str5;
                    obj.f1377g = jsonReader.nextString();
                    break;
                case 3:
                    str = str5;
                    obj.f1382l = c(jsonReader);
                    break;
                case 4:
                    str = str5;
                    String nextString2 = jsonReader.nextString();
                    if (nextString2 != null) {
                        obj.f1378h = nextString2;
                        break;
                    } else {
                        throw new NullPointerException("Null buildVersion");
                    }
                case 5:
                    str = str5;
                    obj.f = jsonReader.nextString();
                    break;
                case i.STRING_SET_FIELD_NUMBER /* 6 */:
                    str = str5;
                    String nextString3 = jsonReader.nextString();
                    if (nextString3 != null) {
                        obj.f1374b = nextString3;
                        break;
                    } else {
                        throw new NullPointerException("Null gmpAppId");
                    }
                case i.DOUBLE_FIELD_NUMBER /* 7 */:
                    str = str5;
                    String nextString4 = jsonReader.nextString();
                    if (nextString4 != null) {
                        obj.d = nextString4;
                        break;
                    } else {
                        throw new NullPointerException("Null installationUuid");
                    }
                case '\b':
                    str = str5;
                    obj.f1376e = jsonReader.nextString();
                    break;
                case '\t':
                    str = str5;
                    obj.f1375c = Integer.valueOf(jsonReader.nextInt());
                    break;
                case '\n':
                    str = str5;
                    String nextString5 = jsonReader.nextString();
                    if (nextString5 != null) {
                        obj.f1379i = nextString5;
                        break;
                    } else {
                        throw new NullPointerException("Null displayVersion");
                    }
                case 11:
                    ?? obj2 = new Object();
                    obj2.f = Boolean.FALSE;
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        nextName3.getClass();
                        switch (nextName3.hashCode()) {
                            case -2128794476:
                                str2 = str5;
                                if (nextName3.equals("startedAt")) {
                                    c6 = 0;
                                    break;
                                }
                                c6 = 65535;
                                break;
                            case -1907185581:
                                str2 = str5;
                                if (nextName3.equals("appQualitySessionId")) {
                                    c6 = 1;
                                    break;
                                }
                                c6 = 65535;
                                break;
                            case -1618432855:
                                str2 = str5;
                                if (nextName3.equals("identifier")) {
                                    c6 = 2;
                                    break;
                                }
                                c6 = 65535;
                                break;
                            case -1606742899:
                                str2 = str5;
                                if (nextName3.equals("endedAt")) {
                                    c6 = 3;
                                    break;
                                }
                                c6 = 65535;
                                break;
                            case -1335157162:
                                str2 = str5;
                                if (nextName3.equals("device")) {
                                    c6 = 4;
                                    break;
                                }
                                c6 = 65535;
                                break;
                            case -1291329255:
                                str2 = str5;
                                if (nextName3.equals("events")) {
                                    c6 = 5;
                                    break;
                                }
                                c6 = 65535;
                                break;
                            case 3556:
                                str2 = str5;
                                if (nextName3.equals("os")) {
                                    c6 = 6;
                                    break;
                                }
                                c6 = 65535;
                                break;
                            case 96801:
                                str2 = str5;
                                if (nextName3.equals("app")) {
                                    c6 = 7;
                                    break;
                                }
                                c6 = 65535;
                                break;
                            case 3599307:
                                str2 = str5;
                                if (nextName3.equals("user")) {
                                    c6 = '\b';
                                    break;
                                }
                                c6 = 65535;
                                break;
                            case 286956243:
                                str2 = str5;
                                if (nextName3.equals("generator")) {
                                    c6 = '\t';
                                    break;
                                }
                                c6 = 65535;
                                break;
                            case 1025385094:
                                str2 = str5;
                                if (nextName3.equals("crashed")) {
                                    c6 = '\n';
                                    break;
                                }
                                c6 = 65535;
                                break;
                            case 2047016109:
                                str2 = str5;
                                if (nextName3.equals("generatorType")) {
                                    c6 = 11;
                                    break;
                                }
                                c6 = 65535;
                                break;
                            default:
                                str2 = str5;
                                c6 = 65535;
                                break;
                        }
                        switch (c6) {
                            case 0:
                                obj2.d = Long.valueOf(jsonReader.nextLong());
                                break;
                            case 1:
                                obj2.f1375c = jsonReader.nextString();
                                break;
                            case 2:
                                obj2.f1374b = new String(Base64.decode(jsonReader.nextString(), 2), F0.f15894a);
                                break;
                            case 3:
                                obj2.f1376e = Long.valueOf(jsonReader.nextLong());
                                break;
                            case 4:
                                ?? obj3 = new Object();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String nextName4 = jsonReader.nextName();
                                    nextName4.getClass();
                                    switch (nextName4.hashCode()) {
                                        case -1981332476:
                                            if (nextName4.equals("simulator")) {
                                                c7 = 0;
                                                break;
                                            }
                                            c7 = 65535;
                                            break;
                                        case -1969347631:
                                            if (nextName4.equals("manufacturer")) {
                                                c7 = 1;
                                                break;
                                            }
                                            c7 = 65535;
                                            break;
                                        case 112670:
                                            if (nextName4.equals("ram")) {
                                                c7 = 2;
                                                break;
                                            }
                                            c7 = 65535;
                                            break;
                                        case 3002454:
                                            if (nextName4.equals("arch")) {
                                                c7 = 3;
                                                break;
                                            }
                                            c7 = 65535;
                                            break;
                                        case 81784169:
                                            if (nextName4.equals("diskSpace")) {
                                                c7 = 4;
                                                break;
                                            }
                                            c7 = 65535;
                                            break;
                                        case 94848180:
                                            if (nextName4.equals("cores")) {
                                                c7 = 5;
                                                break;
                                            }
                                            c7 = 65535;
                                            break;
                                        case 104069929:
                                            if (nextName4.equals("model")) {
                                                c7 = 6;
                                                break;
                                            }
                                            c7 = 65535;
                                            break;
                                        case 109757585:
                                            if (nextName4.equals("state")) {
                                                c7 = 7;
                                                break;
                                            }
                                            c7 = 65535;
                                            break;
                                        case 2078953423:
                                            if (nextName4.equals("modelClass")) {
                                                c7 = '\b';
                                                break;
                                            }
                                            c7 = 65535;
                                            break;
                                        default:
                                            c7 = 65535;
                                            break;
                                    }
                                    switch (c7) {
                                        case 0:
                                            obj3.f = Boolean.valueOf(jsonReader.nextBoolean());
                                            break;
                                        case 1:
                                            String nextString6 = jsonReader.nextString();
                                            if (nextString6 != null) {
                                                obj3.f269h = nextString6;
                                                break;
                                            } else {
                                                throw new NullPointerException("Null manufacturer");
                                            }
                                        case 2:
                                            obj3.d = Long.valueOf(jsonReader.nextLong());
                                            break;
                                        case 3:
                                            obj3.f264a = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        case 4:
                                            obj3.f267e = Long.valueOf(jsonReader.nextLong());
                                            break;
                                        case 5:
                                            obj3.f266c = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        case i.STRING_SET_FIELD_NUMBER /* 6 */:
                                            String nextString7 = jsonReader.nextString();
                                            if (nextString7 != null) {
                                                obj3.f265b = nextString7;
                                                break;
                                            } else {
                                                throw new NullPointerException("Null model");
                                            }
                                        case i.DOUBLE_FIELD_NUMBER /* 7 */:
                                            obj3.f268g = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        case '\b':
                                            String nextString8 = jsonReader.nextString();
                                            if (nextString8 != null) {
                                                obj3.f270i = nextString8;
                                                break;
                                            } else {
                                                throw new NullPointerException("Null modelClass");
                                            }
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                obj2.f1380j = obj3.b();
                                break;
                            case 5:
                                ArrayList arrayList = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList.add(e(jsonReader));
                                }
                                jsonReader.endArray();
                                obj2.f1381k = Collections.unmodifiableList(arrayList);
                                break;
                            case i.STRING_SET_FIELD_NUMBER /* 6 */:
                                b bVar = new b(25, false);
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String nextName5 = jsonReader.nextName();
                                    nextName5.getClass();
                                    switch (nextName5.hashCode()) {
                                        case -911706486:
                                            if (nextName5.equals("buildVersion")) {
                                                c8 = 0;
                                                break;
                                            }
                                            c8 = 65535;
                                            break;
                                        case -293026577:
                                            if (nextName5.equals("jailbroken")) {
                                                c8 = 1;
                                                break;
                                            }
                                            c8 = 65535;
                                            break;
                                        case 351608024:
                                            if (nextName5.equals("version")) {
                                                c8 = 2;
                                                break;
                                            }
                                            c8 = 65535;
                                            break;
                                        case 1874684019:
                                            if (nextName5.equals("platform")) {
                                                c8 = 3;
                                                break;
                                            }
                                            c8 = 65535;
                                            break;
                                        default:
                                            c8 = 65535;
                                            break;
                                    }
                                    switch (c8) {
                                        case 0:
                                            String nextString9 = jsonReader.nextString();
                                            if (nextString9 != null) {
                                                bVar.f422s = nextString9;
                                                break;
                                            } else {
                                                throw new NullPointerException("Null buildVersion");
                                            }
                                        case 1:
                                            bVar.f424u = Boolean.valueOf(jsonReader.nextBoolean());
                                            break;
                                        case 2:
                                            String nextString10 = jsonReader.nextString();
                                            if (nextString10 != null) {
                                                bVar.f421r = nextString10;
                                                break;
                                            } else {
                                                throw new NullPointerException("Null version");
                                            }
                                        case 3:
                                            bVar.f423t = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                obj2.f1379i = bVar.j();
                                break;
                            case i.DOUBLE_FIELD_NUMBER /* 7 */:
                                jsonReader.beginObject();
                                String str8 = null;
                                String str9 = null;
                                String str10 = null;
                                String str11 = null;
                                String str12 = null;
                                String str13 = null;
                                while (jsonReader.hasNext()) {
                                    String nextName6 = jsonReader.nextName();
                                    nextName6.getClass();
                                    switch (nextName6.hashCode()) {
                                        case -1618432855:
                                            if (nextName6.equals("identifier")) {
                                                c9 = 0;
                                                break;
                                            }
                                            c9 = 65535;
                                            break;
                                        case -519438642:
                                            if (nextName6.equals("developmentPlatform")) {
                                                c9 = 1;
                                                break;
                                            }
                                            c9 = 65535;
                                            break;
                                        case 213652010:
                                            if (nextName6.equals("developmentPlatformVersion")) {
                                                c9 = 2;
                                                break;
                                            }
                                            c9 = 65535;
                                            break;
                                        case 351608024:
                                            if (nextName6.equals("version")) {
                                                c9 = 3;
                                                break;
                                            }
                                            c9 = 65535;
                                            break;
                                        case 719853845:
                                            if (nextName6.equals("installationUuid")) {
                                                c9 = 4;
                                                break;
                                            }
                                            c9 = 65535;
                                            break;
                                        case 1975623094:
                                            if (nextName6.equals("displayVersion")) {
                                                c9 = 5;
                                                break;
                                            }
                                            c9 = 65535;
                                            break;
                                        default:
                                            c9 = 65535;
                                            break;
                                    }
                                    switch (c9) {
                                        case 0:
                                            str8 = jsonReader.nextString();
                                            if (str8 != null) {
                                                break;
                                            } else {
                                                throw new NullPointerException("Null identifier");
                                            }
                                        case 1:
                                            str12 = jsonReader.nextString();
                                            break;
                                        case 2:
                                            str13 = jsonReader.nextString();
                                            break;
                                        case 3:
                                            str9 = jsonReader.nextString();
                                            if (str9 != null) {
                                                break;
                                            } else {
                                                throw new NullPointerException("Null version");
                                            }
                                        case 4:
                                            str11 = jsonReader.nextString();
                                            break;
                                        case 5:
                                            str10 = jsonReader.nextString();
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                if (str8 != null) {
                                    str3 = "";
                                } else {
                                    str3 = str2;
                                }
                                if (str9 == null) {
                                    str3 = str3.concat(" version");
                                }
                                if (str3.isEmpty()) {
                                    obj2.f1377g = new I(str8, str9, str10, str11, str12, str13);
                                    break;
                                } else {
                                    throw new IllegalStateException("Missing required properties:".concat(str3));
                                }
                            case '\b':
                                jsonReader.beginObject();
                                String str14 = null;
                                while (jsonReader.hasNext()) {
                                    if (jsonReader.nextName().equals("identifier")) {
                                        str14 = jsonReader.nextString();
                                        if (str14 == null) {
                                            throw new NullPointerException("Null identifier");
                                        }
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                }
                                jsonReader.endObject();
                                if (str14 != null) {
                                    str4 = "";
                                } else {
                                    str4 = str2;
                                }
                                if (str4.isEmpty()) {
                                    obj2.f1378h = new C1408b0(str14);
                                    break;
                                } else {
                                    throw new IllegalStateException("Missing required properties:".concat(str4));
                                }
                            case '\t':
                                String nextString11 = jsonReader.nextString();
                                if (nextString11 != null) {
                                    obj2.f1373a = nextString11;
                                    break;
                                } else {
                                    throw new NullPointerException("Null generator");
                                }
                            case '\n':
                                obj2.f = Boolean.valueOf(jsonReader.nextBoolean());
                                break;
                            case 11:
                                obj2.f1382l = Integer.valueOf(jsonReader.nextInt());
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                        str5 = str2;
                    }
                    str = str5;
                    jsonReader.endObject();
                    obj.f1380j = obj2.c();
                    break;
                default:
                    jsonReader.skipValue();
                    str = str5;
                    continue;
                    str5 = str;
            }
            str5 = str;
        }
        jsonReader.endObject();
        return obj.b();
    }

    public static B i(String str) {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            B h7 = h(jsonReader);
            jsonReader.close();
            return h7;
        } catch (IllegalStateException e3) {
            throw new IOException(e3);
        }
    }
}
