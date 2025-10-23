package androidx.leanback.transition;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
/* loaded from: classes.dex */
public final class a extends android.support.v4.media.session.b {
    public final /* synthetic */ int d;

    public /* synthetic */ a(int i7) {
        this.d = i7;
    }

    @Override // android.support.v4.media.session.b
    public float k0(FadeAndShortSlide fadeAndShortSlide, ViewGroup viewGroup, View view, int[] iArr) {
        int centerX;
        switch (this.d) {
            case 0:
                int layoutDirection = viewGroup.getLayoutDirection();
                float translationX = view.getTranslationX();
                float b7 = fadeAndShortSlide.b(viewGroup);
                if (layoutDirection == 1) {
                    return b7 + translationX;
                }
                return translationX - b7;
            case 1:
                int layoutDirection2 = viewGroup.getLayoutDirection();
                float translationX2 = view.getTranslationX();
                float b8 = fadeAndShortSlide.b(viewGroup);
                if (layoutDirection2 == 1) {
                    return translationX2 - b8;
                }
                return translationX2 + b8;
            case 2:
                int width = (view.getWidth() / 2) + iArr[0];
                viewGroup.getLocationOnScreen(iArr);
                Rect epicenter = fadeAndShortSlide.getEpicenter();
                if (epicenter == null) {
                    centerX = (viewGroup.getWidth() / 2) + iArr[0];
                } else {
                    centerX = epicenter.centerX();
                }
                float translationX3 = view.getTranslationX();
                float b9 = fadeAndShortSlide.b(viewGroup);
                if (width < centerX) {
                    return translationX3 - b9;
                }
                return translationX3 + b9;
            default:
                return super.k0(fadeAndShortSlide, viewGroup, view, iArr);
        }
    }

    @Override // android.support.v4.media.session.b
    public float l0(FadeAndShortSlide fadeAndShortSlide, ViewGroup viewGroup, View view, int[] iArr) {
        switch (this.d) {
            case 3:
                return fadeAndShortSlide.c(viewGroup) + view.getTranslationY();
            case 4:
                return view.getTranslationY() - fadeAndShortSlide.c(viewGroup);
            default:
                return super.l0(fadeAndShortSlide, viewGroup, view, iArr);
        }
    }
}
