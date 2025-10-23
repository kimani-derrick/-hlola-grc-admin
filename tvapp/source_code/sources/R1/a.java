package R1;

import T1.l;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import p6.d;
/* loaded from: classes.dex */
public final class a implements l {

    /* renamed from: c  reason: collision with root package name */
    public static final String f2880c = d.s("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
    public static final Set d;

    /* renamed from: e  reason: collision with root package name */
    public static final a f2881e;

    /* renamed from: a  reason: collision with root package name */
    public final String f2882a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2883b;

    static {
        String s6 = d.s("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String s7 = d.s("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new Q1.b("proto"), new Q1.b("json"))));
        f2881e = new a(s6, s7);
    }

    public a(String str, String str2) {
        this.f2882a = str;
        this.f2883b = str2;
    }

    public static a a(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (str.startsWith("1$")) {
            String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
            if (split.length == 2) {
                String str2 = split[0];
                if (!str2.isEmpty()) {
                    String str3 = split[1];
                    if (str3.isEmpty()) {
                        str3 = null;
                    }
                    return new a(str2, str3);
                }
                throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
            }
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        throw new IllegalArgumentException("Version marker missing from extras");
    }
}
