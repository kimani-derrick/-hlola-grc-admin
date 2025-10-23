package androidx.leanback.transition;

import android.view.View;
/* loaded from: classes.dex */
public final class c extends h4.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6324a;

    @Override // androidx.leanback.transition.e
    public final float a(View view) {
        switch (this.f6324a) {
            case 0:
                return view.getTranslationX() - view.getWidth();
            case 1:
                return view.getTranslationX() + view.getWidth();
            case 2:
                if (view.getLayoutDirection() == 1) {
                    return view.getTranslationX() + view.getWidth();
                }
                return view.getTranslationX() - view.getWidth();
            default:
                if (view.getLayoutDirection() == 1) {
                    return view.getTranslationX() - view.getWidth();
                }
                return view.getTranslationX() + view.getWidth();
        }
    }
}
