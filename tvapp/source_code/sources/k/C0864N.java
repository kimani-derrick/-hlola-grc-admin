package k;

import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.widget.TextView;
/* renamed from: k.N  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0864N extends C0862L {
    @Override // k.C0862L, k.AbstractC0865O
    public void a(StaticLayout.Builder builder, TextView textView) {
        TextDirectionHeuristic textDirectionHeuristic;
        textDirectionHeuristic = textView.getTextDirectionHeuristic();
        builder.setTextDirection(textDirectionHeuristic);
    }

    @Override // k.AbstractC0865O
    public boolean b(TextView textView) {
        boolean isHorizontallyScrollable;
        isHorizontallyScrollable = textView.isHorizontallyScrollable();
        return isHorizontallyScrollable;
    }
}
