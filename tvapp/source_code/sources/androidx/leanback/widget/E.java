package androidx.leanback.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
/* loaded from: classes.dex */
public abstract class E {

    /* renamed from: a  reason: collision with root package name */
    public static final Rect f6362a = new Rect();

    public static int a(View view, D d, int i7) {
        View view2;
        int height;
        int width;
        int width2;
        int width3;
        C0317u c0317u = (C0317u) view.getLayoutParams();
        int i8 = d.f6357a;
        if (i8 == 0 || (view2 = view.findViewById(i8)) == null) {
            view2 = view;
        }
        int i9 = d.f6358b;
        Rect rect = f6362a;
        if (i7 == 0) {
            if (view.getLayoutDirection() == 1) {
                if (view2 == view) {
                    c0317u.getClass();
                    width2 = (view2.getWidth() - c0317u.f6656e) - c0317u.f6657g;
                } else {
                    width2 = view2.getWidth();
                }
                int i10 = width2 - i9;
                if (d.d) {
                    float f = d.f6359c;
                    if (f == 0.0f) {
                        i10 -= view2.getPaddingRight();
                    } else if (f == 100.0f) {
                        i10 += view2.getPaddingLeft();
                    }
                }
                if (d.f6359c != -1.0f) {
                    if (view2 == view) {
                        c0317u.getClass();
                        width3 = (view2.getWidth() - c0317u.f6656e) - c0317u.f6657g;
                    } else {
                        width3 = view2.getWidth();
                    }
                    i10 -= (int) ((width3 * d.f6359c) / 100.0f);
                }
                if (view != view2) {
                    rect.right = i10;
                    ((ViewGroup) view).offsetDescendantRectToMyCoords(view2, rect);
                    return rect.right + c0317u.f6657g;
                }
                return i10;
            }
            if (d.d) {
                float f7 = d.f6359c;
                if (f7 == 0.0f) {
                    i9 += view2.getPaddingLeft();
                } else if (f7 == 100.0f) {
                    i9 -= view2.getPaddingRight();
                }
            }
            if (d.f6359c != -1.0f) {
                if (view2 == view) {
                    c0317u.getClass();
                    width = (view2.getWidth() - c0317u.f6656e) - c0317u.f6657g;
                } else {
                    width = view2.getWidth();
                }
                i9 += (int) ((width * d.f6359c) / 100.0f);
            }
            int i11 = i9;
            if (view != view2) {
                rect.left = i11;
                ((ViewGroup) view).offsetDescendantRectToMyCoords(view2, rect);
                return rect.left - c0317u.f6656e;
            }
            return i11;
        }
        if (d.d) {
            float f8 = d.f6359c;
            if (f8 == 0.0f) {
                i9 += view2.getPaddingTop();
            } else if (f8 == 100.0f) {
                i9 -= view2.getPaddingBottom();
            }
        }
        if (d.f6359c != -1.0f) {
            if (view2 == view) {
                c0317u.getClass();
                height = (view2.getHeight() - c0317u.f) - c0317u.f6658h;
            } else {
                height = view2.getHeight();
            }
            i9 += (int) ((height * d.f6359c) / 100.0f);
        }
        if (view != view2) {
            rect.top = i9;
            ((ViewGroup) view).offsetDescendantRectToMyCoords(view2, rect);
            return rect.top - c0317u.f;
        }
        return i9;
    }
}
