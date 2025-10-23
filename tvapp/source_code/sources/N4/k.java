package N4;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class k {

    /* renamed from: b  reason: collision with root package name */
    public static final long f2540b = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: c  reason: collision with root package name */
    public static final Pattern f2541c = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static k d;

    /* renamed from: a  reason: collision with root package name */
    public final J3.e f2542a;

    public k(J3.e eVar) {
        this.f2542a = eVar;
    }

    public final boolean a(O4.b bVar) {
        if (TextUtils.isEmpty(bVar.f2725c)) {
            return true;
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f2542a.getClass();
        if (bVar.f + bVar.f2726e < timeUnit.toSeconds(System.currentTimeMillis()) + f2540b) {
            return true;
        }
        return false;
    }
}
