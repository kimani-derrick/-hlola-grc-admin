package U5;

import java.io.Serializable;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class d implements Serializable {

    /* renamed from: q  reason: collision with root package name */
    public final Pattern f3486q;

    public d(String str) {
        Pattern compile = Pattern.compile(str);
        M5.g.e(compile, "compile(...)");
        this.f3486q = compile;
    }

    public final String toString() {
        String pattern = this.f3486q.toString();
        M5.g.e(pattern, "toString(...)");
        return pattern;
    }
}
