package h6;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class t {

    /* renamed from: k  reason: collision with root package name */
    public static final char[] f11203k = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a  reason: collision with root package name */
    public final String f11204a;

    /* renamed from: b  reason: collision with root package name */
    public final String f11205b;

    /* renamed from: c  reason: collision with root package name */
    public final String f11206c;
    public final String d;

    /* renamed from: e  reason: collision with root package name */
    public final int f11207e;
    public final List f;

    /* renamed from: g  reason: collision with root package name */
    public final List f11208g;

    /* renamed from: h  reason: collision with root package name */
    public final String f11209h;

    /* renamed from: i  reason: collision with root package name */
    public final String f11210i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f11211j;

    public t(String str, String str2, String str3, String str4, int i7, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
        this.f11204a = str;
        this.f11205b = str2;
        this.f11206c = str3;
        this.d = str4;
        this.f11207e = i7;
        this.f = arrayList;
        this.f11208g = arrayList2;
        this.f11209h = str5;
        this.f11210i = str6;
        this.f11211j = M5.g.a(str, "https");
    }

    public final String a() {
        if (this.f11206c.length() == 0) {
            return "";
        }
        String str = this.f11210i;
        String substring = str.substring(U5.f.i0(str, ':', this.f11204a.length() + 3, false, 4) + 1, U5.f.i0(str, '@', 0, false, 6));
        M5.g.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final String b() {
        String str = this.f11210i;
        int i02 = U5.f.i0(str, '/', this.f11204a.length() + 3, false, 4);
        String substring = str.substring(i02, i6.b.f(i02, str.length(), str, "?#"));
        M5.g.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final ArrayList c() {
        String str = this.f11210i;
        int i02 = U5.f.i0(str, '/', this.f11204a.length() + 3, false, 4);
        int f = i6.b.f(i02, str.length(), str, "?#");
        ArrayList arrayList = new ArrayList();
        while (i02 < f) {
            int i7 = i02 + 1;
            int g7 = i6.b.g(str, '/', i7, f);
            String substring = str.substring(i7, g7);
            M5.g.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(substring);
            i02 = g7;
        }
        return arrayList;
    }

    public final String d() {
        if (this.f11208g == null) {
            return null;
        }
        String str = this.f11210i;
        int i02 = U5.f.i0(str, '?', 0, false, 6) + 1;
        String substring = str.substring(i02, i6.b.g(str, '#', i02, str.length()));
        M5.g.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final String e() {
        if (this.f11205b.length() == 0) {
            return "";
        }
        int length = this.f11204a.length() + 3;
        String str = this.f11210i;
        String substring = str.substring(length, i6.b.f(length, str.length(), str, ":@"));
        M5.g.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof t) && M5.g.a(((t) obj).f11210i, this.f11210i)) {
            return true;
        }
        return false;
    }

    public final s f(String str) {
        M5.g.f(str, "link");
        try {
            s sVar = new s();
            sVar.e(this, str);
            return sVar;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final String g() {
        s f = f("/...");
        M5.g.c(f);
        f.f = n.b("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
        f.f11200g = n.b("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
        return f.a().f11210i;
    }

    public final URI h() {
        int i7;
        ArrayList g7;
        String substring;
        String replaceAll;
        String b7;
        s sVar = new s();
        String str = this.f11204a;
        sVar.f11199e = str;
        sVar.f = e();
        sVar.f11200g = a();
        sVar.f11201h = this.d;
        M5.g.f(str, "scheme");
        int i8 = -1;
        if (M5.g.a(str, "http")) {
            i7 = 80;
        } else if (M5.g.a(str, "https")) {
            i7 = 443;
        } else {
            i7 = -1;
        }
        int i9 = this.f11207e;
        if (i9 != i7) {
            i8 = i9;
        }
        sVar.f11198c = i8;
        ArrayList arrayList = sVar.d;
        arrayList.clear();
        arrayList.addAll(c());
        String d = d();
        String str2 = null;
        if (d == null) {
            g7 = null;
        } else {
            g7 = n.g(n.b(d, 0, 0, " \"'<>#", true, false, true, false, 211));
        }
        sVar.f11197b = g7;
        int i10 = 0;
        if (this.f11209h == null) {
            substring = null;
        } else {
            String str3 = this.f11210i;
            substring = str3.substring(U5.f.i0(str3, '#', 0, false, 6) + 1);
            M5.g.e(substring, "this as java.lang.String).substring(startIndex)");
        }
        sVar.f11202i = substring;
        String str4 = (String) sVar.f11201h;
        if (str4 == null) {
            replaceAll = null;
        } else {
            Pattern compile = Pattern.compile("[\"<>^`{|}]");
            M5.g.e(compile, "compile(...)");
            replaceAll = compile.matcher(str4).replaceAll("");
            M5.g.e(replaceAll, "replaceAll(...)");
        }
        sVar.f11201h = replaceAll;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.set(i11, n.b((String) arrayList.get(i11), 0, 0, "[]", true, true, false, false, 227));
        }
        List list = sVar.f11197b;
        if (list != null) {
            int size2 = list.size();
            while (i10 < size2) {
                int i12 = i10 + 1;
                String str5 = (String) list.get(i10);
                if (str5 == null) {
                    b7 = null;
                } else {
                    b7 = n.b(str5, 0, 0, "\\^`{|}", true, true, true, false, 195);
                }
                list.set(i10, b7);
                i10 = i12;
            }
        }
        String str6 = (String) sVar.f11202i;
        if (str6 != null) {
            str2 = n.b(str6, 0, 0, " \"#<>\\^`{|}", true, true, false, true, 163);
        }
        sVar.f11202i = str2;
        String sVar2 = sVar.toString();
        try {
            return new URI(sVar2);
        } catch (URISyntaxException e3) {
            try {
                Pattern compile2 = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                M5.g.e(compile2, "compile(...)");
                String replaceAll2 = compile2.matcher(sVar2).replaceAll("");
                M5.g.e(replaceAll2, "replaceAll(...)");
                URI create = URI.create(replaceAll2);
                M5.g.e(create, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e3);
            }
        }
    }

    public final int hashCode() {
        return this.f11210i.hashCode();
    }

    public final String toString() {
        return this.f11210i;
    }
}
