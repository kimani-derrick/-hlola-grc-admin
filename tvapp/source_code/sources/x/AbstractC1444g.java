package x;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;
/* renamed from: x.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1444g {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal f16144a = new ThreadLocal();

    /* renamed from: b  reason: collision with root package name */
    public static final ThreadLocal f16145b = new ThreadLocal();

    public static void a(ViewParent viewParent, View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            View view2 = (View) parent;
            a(viewParent, view2, matrix);
            matrix.preTranslate(-view2.getScrollX(), -view2.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        if (!view.getMatrix().isIdentity()) {
            matrix.preConcat(view.getMatrix());
        }
    }
}
