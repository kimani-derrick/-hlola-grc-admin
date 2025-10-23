package s2;

import android.util.Base64;
import android.util.JsonReader;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.util.List;
import w4.D;
import w4.F0;
import w4.G;
import w4.O;
import w4.S;
import w4.Y;
import x4.C1466a;
/* loaded from: classes.dex */
public final /* synthetic */ class l implements N3.f {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f13643q;

    public /* synthetic */ l(int i7) {
        this.f13643q = i7;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r13v28 */
    /* JADX WARN: Type inference failed for: r13v33 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v8 */
    public Object a(JsonReader jsonReader) {
        ?? r22;
        ?? r12;
        String str;
        ?? r13;
        ?? r132;
        String str2 = " name";
        String str3 = "";
        String str4 = null;
        Long l7 = null;
        String str5 = null;
        String str6 = null;
        switch (this.f13643q) {
            case 1:
                jsonReader.beginObject();
                String str7 = null;
                String str8 = null;
                while (jsonReader.hasNext()) {
                    String nextName = jsonReader.nextName();
                    nextName.getClass();
                    nextName.hashCode();
                    nextName.hashCode();
                    switch (nextName.hashCode()) {
                        case -609862170:
                            if (nextName.equals("libraryName")) {
                                r22 = false;
                                break;
                            }
                            r22 = true;
                            break;
                        case 3002454:
                            if (nextName.equals("arch")) {
                                r22 = true;
                                break;
                            }
                            r22 = true;
                            break;
                        case 230943785:
                            if (nextName.equals("buildId")) {
                                r22 = true;
                                break;
                            }
                            r22 = true;
                            break;
                        default:
                            r22 = true;
                            break;
                    }
                    switch (r22) {
                        case 0:
                            str7 = jsonReader.nextString();
                            if (str7 != null) {
                                break;
                            } else {
                                throw new NullPointerException("Null libraryName");
                            }
                        case 1:
                            String nextString = jsonReader.nextString();
                            if (nextString != null) {
                                str4 = nextString;
                                break;
                            } else {
                                throw new NullPointerException("Null arch");
                            }
                        case 2:
                            str8 = jsonReader.nextString();
                            if (str8 != null) {
                                break;
                            } else {
                                throw new NullPointerException("Null buildId");
                            }
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                if (str4 == null) {
                    str3 = " arch";
                }
                if (str7 == null) {
                    str3 = str3.concat(" libraryName");
                }
                if (str8 == null) {
                    str3 = AbstractC0515y1.m(str3, " buildId");
                }
                if (str3.isEmpty()) {
                    return new D(str4, str7, str8);
                }
                throw new IllegalStateException("Missing required properties:".concat(str3));
            case 2:
                jsonReader.beginObject();
                byte[] bArr = null;
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    nextName2.getClass();
                    if (!nextName2.equals("filename")) {
                        if (!nextName2.equals("contents")) {
                            jsonReader.skipValue();
                        } else {
                            bArr = Base64.decode(jsonReader.nextString(), 2);
                            if (bArr == null) {
                                throw new NullPointerException("Null contents");
                            }
                        }
                    } else {
                        String nextString2 = jsonReader.nextString();
                        if (nextString2 != null) {
                            str6 = nextString2;
                        } else {
                            throw new NullPointerException("Null filename");
                        }
                    }
                }
                jsonReader.endObject();
                if (str6 == null) {
                    str3 = " filename";
                }
                if (bArr == null) {
                    str3 = str3.concat(" contents");
                }
                if (str3.isEmpty()) {
                    return new G(str6, bArr);
                }
                throw new IllegalStateException("Missing required properties:".concat(str3));
            case 3:
                C4.b bVar = new C4.b(24, false);
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName3 = jsonReader.nextName();
                    nextName3.getClass();
                    nextName3.hashCode();
                    switch (nextName3.hashCode()) {
                        case -1536268810:
                            if (nextName3.equals("parameterKey")) {
                                r12 = false;
                                break;
                            }
                            r12 = true;
                            break;
                        case -1027290370:
                            if (nextName3.equals("templateVersion")) {
                                r12 = true;
                                break;
                            }
                            r12 = true;
                            break;
                        case 1098747284:
                            if (nextName3.equals("rolloutVariant")) {
                                r12 = true;
                                break;
                            }
                            r12 = true;
                            break;
                        case 1124454216:
                            if (nextName3.equals("parameterValue")) {
                                r12 = true;
                                break;
                            }
                            r12 = true;
                            break;
                        default:
                            r12 = true;
                            break;
                    }
                    switch (r12) {
                        case 0:
                            String nextString3 = jsonReader.nextString();
                            if (nextString3 != null) {
                                bVar.f421r = nextString3;
                                break;
                            } else {
                                throw new NullPointerException("Null parameterKey");
                            }
                        case 1:
                            bVar.f424u = Long.valueOf(jsonReader.nextLong());
                            break;
                        case 2:
                            jsonReader.beginObject();
                            String str9 = null;
                            String str10 = null;
                            while (jsonReader.hasNext()) {
                                String nextName4 = jsonReader.nextName();
                                nextName4.getClass();
                                if (!nextName4.equals("variantId")) {
                                    if (!nextName4.equals("rolloutId")) {
                                        jsonReader.skipValue();
                                    } else {
                                        str9 = jsonReader.nextString();
                                        if (str9 == null) {
                                            throw new NullPointerException("Null rolloutId");
                                        }
                                    }
                                } else {
                                    str10 = jsonReader.nextString();
                                    if (str10 == null) {
                                        throw new NullPointerException("Null variantId");
                                    }
                                }
                            }
                            jsonReader.endObject();
                            if (str9 != null) {
                                str = "";
                            } else {
                                str = " rolloutId";
                            }
                            if (str10 == null) {
                                str = str.concat(" variantId");
                            }
                            if (str.isEmpty()) {
                                bVar.f423t = new Y(str9, str10);
                                break;
                            } else {
                                throw new IllegalStateException("Missing required properties:".concat(str));
                            }
                        case 3:
                            String nextString4 = jsonReader.nextString();
                            if (nextString4 != null) {
                                bVar.f422s = nextString4;
                                break;
                            } else {
                                throw new NullPointerException("Null parameterValue");
                            }
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                return bVar.i();
            case 4:
                jsonReader.beginObject();
                Integer num = null;
                List list = null;
                while (jsonReader.hasNext()) {
                    String nextName5 = jsonReader.nextName();
                    nextName5.getClass();
                    nextName5.hashCode();
                    nextName5.hashCode();
                    switch (nextName5.hashCode()) {
                        case -1266514778:
                            if (nextName5.equals("frames")) {
                                r13 = false;
                                break;
                            }
                            r13 = true;
                            break;
                        case 3373707:
                            if (nextName5.equals("name")) {
                                r13 = true;
                                break;
                            }
                            r13 = true;
                            break;
                        case 2125650548:
                            if (nextName5.equals("importance")) {
                                r13 = true;
                                break;
                            }
                            r13 = true;
                            break;
                        default:
                            r13 = true;
                            break;
                    }
                    switch (r13) {
                        case 0:
                            list = C1466a.d(jsonReader, new l(6));
                            if (list != null) {
                                continue;
                            } else {
                                throw new NullPointerException("Null frames");
                            }
                        case 1:
                            str5 = jsonReader.nextString();
                            if (str5 == null) {
                                throw new NullPointerException("Null name");
                            }
                            break;
                        case 2:
                            num = Integer.valueOf(jsonReader.nextInt());
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                if (str5 != null) {
                    str2 = "";
                }
                if (num == null) {
                    str2 = str2.concat(" importance");
                }
                if (list == null) {
                    str2 = AbstractC0515y1.m(str2, " frames");
                }
                if (str2.isEmpty()) {
                    return new S(str5, num.intValue(), list);
                }
                throw new IllegalStateException("Missing required properties:".concat(str2));
            case 5:
                jsonReader.beginObject();
                Long l8 = null;
                String str11 = null;
                String str12 = null;
                while (jsonReader.hasNext()) {
                    String nextName6 = jsonReader.nextName();
                    nextName6.getClass();
                    nextName6.hashCode();
                    nextName6.hashCode();
                    switch (nextName6.hashCode()) {
                        case 3373707:
                            if (nextName6.equals("name")) {
                                r132 = false;
                                break;
                            }
                            r132 = true;
                            break;
                        case 3530753:
                            if (nextName6.equals("size")) {
                                r132 = true;
                                break;
                            }
                            r132 = true;
                            break;
                        case 3601339:
                            if (nextName6.equals("uuid")) {
                                r132 = true;
                                break;
                            }
                            r132 = true;
                            break;
                        case 1153765347:
                            if (nextName6.equals("baseAddress")) {
                                r132 = true;
                                break;
                            }
                            r132 = true;
                            break;
                        default:
                            r132 = true;
                            break;
                    }
                    switch (r132) {
                        case 0:
                            String nextString5 = jsonReader.nextString();
                            if (nextString5 != null) {
                                str11 = nextString5;
                                break;
                            } else {
                                throw new NullPointerException("Null name");
                            }
                        case 1:
                            l8 = Long.valueOf(jsonReader.nextLong());
                            break;
                        case 2:
                            str12 = new String(Base64.decode(jsonReader.nextString(), 2), F0.f15894a);
                            break;
                        case 3:
                            l7 = Long.valueOf(jsonReader.nextLong());
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                if (l7 == null) {
                    str3 = " baseAddress";
                }
                if (l8 == null) {
                    str3 = str3.concat(" size");
                }
                if (str11 == null) {
                    str3 = AbstractC0515y1.m(str3, " name");
                }
                if (str3.isEmpty()) {
                    return new O(l7.longValue(), l8.longValue(), str11, str12);
                }
                throw new IllegalStateException("Missing required properties:".concat(str3));
            default:
                return C1466a.a(jsonReader);
        }
    }

    @Override // N3.f
    public Object apply(Object obj) {
        return (q) obj;
    }
}
