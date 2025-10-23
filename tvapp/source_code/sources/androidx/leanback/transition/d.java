package androidx.leanback.transition;

import android.view.View;
import k3.AbstractC0958a;
/* loaded from: classes.dex */
public final class d extends AbstractC0958a {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f6325c;

    @Override // androidx.leanback.transition.e
    public final float a(View view) {
        switch (this.f6325c) {
            case 0:
                return view.getTranslationY() - view.getHeight();
            default:
                return view.getTranslationY() + view.getHeight();
        }
    }
}
