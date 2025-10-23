package n0;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import r0.AbstractC1111a;
import z5.C1527i;
/* loaded from: classes.dex */
public final class t {

    /* renamed from: m  reason: collision with root package name */
    public static final Pattern f12583m = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");

    /* renamed from: a  reason: collision with root package name */
    public final String f12584a;

    /* renamed from: b  reason: collision with root package name */
    public final String f12585b;

    /* renamed from: c  reason: collision with root package name */
    public final String f12586c;
    public final String f;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f12589h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f12590i;

    /* renamed from: j  reason: collision with root package name */
    public final String f12591j;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f12593l;
    public final ArrayList d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final LinkedHashMap f12587e = new LinkedHashMap();

    /* renamed from: g  reason: collision with root package name */
    public final C1527i f12588g = new C1527i(new s(this, 1));

    /* renamed from: k  reason: collision with root package name */
    public final C1527i f12592k = new C1527i(new s(this, 0));

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0, types: [n0.t] */
    /* JADX WARN: Type inference failed for: r3v17, types: [int] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    public t(String str, String str2, String str3) {
        List list;
        int i7;
        List list2;
        boolean z7;
        this.f12584a = str;
        this.f12585b = str2;
        this.f12586c = str3;
        int i8 = 0;
        boolean z8 = true;
        if (str != null) {
            Uri parse = Uri.parse(str);
            if (parse.getQuery() != null) {
                z7 = true;
            } else {
                z7 = false;
            }
            this.f12589h = z7;
            StringBuilder sb = new StringBuilder("^");
            if (!f12583m.matcher(str).find()) {
                sb.append("http[s]?://");
            }
            Pattern compile = Pattern.compile("\\{(.+?)\\}");
            if (z7) {
                Matcher matcher = Pattern.compile("(\\?)").matcher(str);
                if (matcher.find()) {
                    String substring = str.substring(0, matcher.start());
                    M5.g.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    M5.g.e(compile, "fillInPattern");
                    this.f12593l = a(substring, sb, compile);
                }
                for (String str4 : parse.getQueryParameterNames()) {
                    StringBuilder sb2 = new StringBuilder();
                    String queryParameter = parse.getQueryParameter(str4);
                    if (queryParameter == null) {
                        this.f12590i = z8;
                        queryParameter = str4;
                    }
                    Matcher matcher2 = compile.matcher(queryParameter);
                    r rVar = new r();
                    int i9 = i8;
                    ?? r3 = z8;
                    while (matcher2.find()) {
                        String group = matcher2.group((int) r3);
                        if (group != null) {
                            rVar.f12580b.add(group);
                            M5.g.e(queryParameter, "queryParam");
                            String substring2 = queryParameter.substring(i9, matcher2.start());
                            M5.g.e(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                            sb2.append(Pattern.quote(substring2));
                            sb2.append("(.+?)?");
                            i9 = matcher2.end();
                            r3 = 1;
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                    }
                    if (i9 < queryParameter.length()) {
                        String substring3 = queryParameter.substring(i9);
                        M5.g.e(substring3, "this as java.lang.String).substring(startIndex)");
                        sb2.append(Pattern.quote(substring3));
                    }
                    String sb3 = sb2.toString();
                    M5.g.e(sb3, "argRegex.toString()");
                    rVar.f12579a = U5.n.Z(sb3, ".*", "\\E.*\\Q");
                    LinkedHashMap linkedHashMap = this.f12587e;
                    M5.g.e(str4, "paramName");
                    linkedHashMap.put(str4, rVar);
                    i8 = 0;
                    z8 = true;
                }
            } else {
                M5.g.e(compile, "fillInPattern");
                this.f12593l = a(str, sb, compile);
            }
            String sb4 = sb.toString();
            M5.g.e(sb4, "uriRegex.toString()");
            this.f = U5.n.Z(sb4, ".*", "\\E.*\\Q");
        }
        if (this.f12586c != null) {
            if (Pattern.compile("^[\\s\\S]+/[\\s\\S]+$").matcher(this.f12586c).matches()) {
                String str5 = this.f12586c;
                M5.g.f(str5, "mimeType");
                Pattern compile2 = Pattern.compile("/");
                M5.g.e(compile2, "compile(...)");
                U5.f.r0(0);
                Matcher matcher3 = compile2.matcher(str5);
                if (!matcher3.find()) {
                    list = m3.g.z(str5.toString());
                } else {
                    ArrayList arrayList = new ArrayList(10);
                    int i10 = 0;
                    do {
                        arrayList.add(str5.subSequence(i10, matcher3.start()).toString());
                        i10 = matcher3.end();
                    } while (matcher3.find());
                    arrayList.add(str5.subSequence(i10, str5.length()).toString());
                    list = arrayList;
                }
                if (!list.isEmpty()) {
                    ListIterator listIterator = list.listIterator(list.size());
                    while (listIterator.hasPrevious()) {
                        if (((String) listIterator.previous()).length() != 0) {
                            i7 = 1;
                            list2 = A5.k.i0(list, listIterator.nextIndex() + 1);
                            break;
                        }
                    }
                }
                i7 = 1;
                list2 = A5.t.f135q;
                this.f12591j = U5.n.Z("^(" + ((String) list2.get(0)) + "|[*]+)/(" + ((String) list2.get(i7)) + "|[*]+)$", "*|[*]", "[\\s\\S]");
                return;
            }
            throw new IllegalArgumentException(AbstractC1111a.t(new StringBuilder("The given mimeType "), this.f12586c, " does not match to required \"type/subtype\" format").toString());
        }
    }

    public static void b(Bundle bundle, String str, String str2, C1018i c1018i) {
        if (c1018i != null) {
            L l7 = c1018i.f12537a;
            l7.getClass();
            M5.g.f(str, "key");
            l7.d(bundle, str, l7.c(str2));
            return;
        }
        bundle.putString(str, str2);
    }

    public final boolean a(String str, StringBuilder sb, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        boolean z7 = !U5.f.d0(str, ".*");
        int i7 = 0;
        while (matcher.find()) {
            String group = matcher.group(1);
            if (group != null) {
                this.d.add(group);
                String substring = str.substring(i7, matcher.start());
                M5.g.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                sb.append(Pattern.quote(substring));
                sb.append("([^/]+?)");
                i7 = matcher.end();
                z7 = false;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
        }
        if (i7 < str.length()) {
            String substring2 = str.substring(i7);
            M5.g.e(substring2, "this as java.lang.String).substring(startIndex)");
            sb.append(Pattern.quote(substring2));
        }
        sb.append("($|(\\?(.)*)|(\\#(.)*))");
        return z7;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        if (!M5.g.a(this.f12584a, tVar.f12584a) || !M5.g.a(this.f12585b, tVar.f12585b) || !M5.g.a(this.f12586c, tVar.f12586c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i7;
        int i8;
        int i9 = 0;
        String str = this.f12584a;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        int i10 = i7 * 31;
        String str2 = this.f12585b;
        if (str2 != null) {
            i8 = str2.hashCode();
        } else {
            i8 = 0;
        }
        int i11 = (i10 + i8) * 31;
        String str3 = this.f12586c;
        if (str3 != null) {
            i9 = str3.hashCode();
        }
        return i11 + i9;
    }
}
