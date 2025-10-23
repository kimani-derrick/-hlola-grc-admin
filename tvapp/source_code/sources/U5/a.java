package U5;

import java.nio.charset.Charset;
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f3474a;

    /* renamed from: b  reason: collision with root package name */
    public static volatile Charset f3475b;

    /* renamed from: c  reason: collision with root package name */
    public static volatile Charset f3476c;

    static {
        Charset forName = Charset.forName("UTF-8");
        M5.g.e(forName, "forName(...)");
        f3474a = forName;
        M5.g.e(Charset.forName("UTF-16"), "forName(...)");
        M5.g.e(Charset.forName("UTF-16BE"), "forName(...)");
        M5.g.e(Charset.forName("UTF-16LE"), "forName(...)");
        M5.g.e(Charset.forName("US-ASCII"), "forName(...)");
        M5.g.e(Charset.forName("ISO-8859-1"), "forName(...)");
    }
}
