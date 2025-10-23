package a0;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
/* loaded from: classes.dex */
public final class j implements TransformationMethod {

    /* renamed from: a  reason: collision with root package name */
    public final TransformationMethod f4979a;

    public j(TransformationMethod transformationMethod) {
        this.f4979a = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f4979a;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence != null && androidx.emoji2.text.j.a().b() == 1) {
            androidx.emoji2.text.j a7 = androidx.emoji2.text.j.a();
            a7.getClass();
            return a7.f(charSequence, 0, charSequence.length());
        }
        return charSequence;
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z7, int i7, Rect rect) {
        TransformationMethod transformationMethod = this.f4979a;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z7, i7, rect);
        }
    }
}
