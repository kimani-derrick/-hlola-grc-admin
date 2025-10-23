package k;

import android.text.StaticLayout;
import android.widget.TextView;
/* renamed from: k.O  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0865O {
    public abstract void a(StaticLayout.Builder builder, TextView textView);

    public boolean b(TextView textView) {
        return ((Boolean) C0866P.e(textView, Boolean.FALSE, "getHorizontallyScrolling")).booleanValue();
    }
}
