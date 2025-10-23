package A4;

import x4.C1466a;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: b  reason: collision with root package name */
    public static final C1466a f93b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static final String f94c = a("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");
    public static final String d = a("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");

    /* renamed from: e  reason: collision with root package name */
    public static final a f95e = new a(0);

    /* renamed from: a  reason: collision with root package name */
    public final f f96a;

    public b(f fVar) {
        this.f96a = fVar;
    }

    public static String a(String str, String str2) {
        int length = str.length() - str2.length();
        if (length >= 0 && length <= 1) {
            StringBuilder sb = new StringBuilder(str2.length() + str.length());
            for (int i7 = 0; i7 < str.length(); i7++) {
                sb.append(str.charAt(i7));
                if (str2.length() > i7) {
                    sb.append(str2.charAt(i7));
                }
            }
            return sb.toString();
        }
        throw new IllegalArgumentException("Invalid input received");
    }
}
