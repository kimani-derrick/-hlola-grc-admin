package androidx.leanback.app;

import android.view.View;
/* loaded from: classes.dex */
public final class v implements View.OnLayoutChangeListener {
    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
        view.setPivotX(view.getLayoutDirection() == 1 ? view.getWidth() : 0.0f);
        view.setPivotY(view.getMeasuredHeight() / 2);
    }
}
