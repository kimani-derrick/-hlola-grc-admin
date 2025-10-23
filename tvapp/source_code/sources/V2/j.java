package V2;

import Z2.H;
import Z2.y;
import e2.m0;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    public static final Pattern f3653a = Pattern.compile("^NOTE([ \t].*)?$");

    public static boolean a(y yVar) {
        yVar.getClass();
        String h7 = yVar.h(N3.e.f2497c);
        if (h7 != null && h7.startsWith("WEBVTT")) {
            return true;
        }
        return false;
    }

    public static float b(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long c(String str) {
        int i7 = H.f4603a;
        String[] split = str.split("\\.", 2);
        long j7 = 0;
        for (String str2 : split[0].split(":", -1)) {
            j7 = (j7 * 60) + Long.parseLong(str2);
        }
        long j8 = j7 * 1000;
        if (split.length == 2) {
            j8 += Long.parseLong(split[1]);
        }
        return j8 * 1000;
    }

    public static void d(y yVar) {
        int i7 = yVar.f4692b;
        if (a(yVar)) {
            return;
        }
        yVar.F(i7);
        throw m0.a("Expected WEBVTT. Got " + yVar.h(N3.e.f2497c), null);
    }
}
