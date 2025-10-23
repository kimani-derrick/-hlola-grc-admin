package X5;

import android.os.Looper;
import java.util.List;
/* loaded from: classes.dex */
public final class a {
    public e a(List list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new e(f.a(mainLooper));
        }
        throw new IllegalStateException("The main looper is not available");
    }

    public int b() {
        return 1073741823;
    }

    public String c() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }
}
