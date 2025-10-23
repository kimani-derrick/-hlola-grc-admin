package androidx.leanback.transition;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
/* loaded from: classes.dex */
public final class b extends android.support.v4.media.session.b {
    public final /* synthetic */ FadeAndShortSlide d;

    public b(FadeAndShortSlide fadeAndShortSlide) {
        this.d = fadeAndShortSlide;
    }

    @Override // android.support.v4.media.session.b
    public final float l0(FadeAndShortSlide fadeAndShortSlide, ViewGroup viewGroup, View view, int[] iArr) {
        int height = (view.getHeight() / 2) + iArr[1];
        viewGroup.getLocationOnScreen(iArr);
        Rect epicenter = this.d.getEpicenter();
        int height2 = epicenter == null ? (viewGroup.getHeight() / 2) + iArr[1] : epicenter.centerY();
        float translationY = view.getTranslationY();
        float c5 = fadeAndShortSlide.c(viewGroup);
        return height < height2 ? translationY - c5 : c5 + translationY;
    }
}
