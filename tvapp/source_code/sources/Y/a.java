package Y;

import L5.l;
import java.util.Map;
/* loaded from: classes.dex */
public final class a extends M5.h implements l {

    /* renamed from: r  reason: collision with root package name */
    public static final a f4296r = new M5.h(1);

    @Override // L5.l
    public final Object c(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        M5.g.f(entry, "entry");
        return "  " + ((d) entry.getKey()).f4302a + " = " + entry.getValue();
    }
}
