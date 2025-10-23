package D;

import android.os.Trace;
import android.view.WindowInsets;
import com.google.android.exoplayer2.ui.DefaultTimeBar;
import java.util.List;
/* loaded from: classes.dex */
public abstract /* synthetic */ class b {
    public static /* synthetic */ WindowInsets.Builder f() {
        return new WindowInsets.Builder();
    }

    public static /* synthetic */ WindowInsets.Builder g(WindowInsets windowInsets) {
        return new WindowInsets.Builder(windowInsets);
    }

    public static /* bridge */ /* synthetic */ void r(DefaultTimeBar defaultTimeBar, List list) {
        defaultTimeBar.setSystemGestureExclusionRects(list);
    }

    public static /* bridge */ /* synthetic */ boolean s() {
        return Trace.isEnabled();
    }
}
