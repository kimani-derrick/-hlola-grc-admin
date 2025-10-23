package k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import e.AbstractC0565a;
/* renamed from: k.H0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0857H0 {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal f11903a = new ThreadLocal();

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f11904b = {-16842910};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f11905c = {16842908};
    public static final int[] d = {16842919};

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f11906e = {16842912};
    public static final int[] f = new int[0];

    /* renamed from: g  reason: collision with root package name */
    public static final int[] f11907g = new int[1];

    public static void a(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(AbstractC0565a.f9346h);
        try {
            if (!obtainStyledAttributes.hasValue(117)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int b(Context context, int i7) {
        ColorStateList d7 = d(context, i7);
        if (d7 != null && d7.isStateful()) {
            return d7.getColorForState(f11904b, d7.getDefaultColor());
        }
        ThreadLocal threadLocal = f11903a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(16842803, typedValue, true);
        float f7 = typedValue.getFloat();
        int c5 = c(context, i7);
        return D.a.d(c5, Math.round(Color.alpha(c5) * f7));
    }

    public static int c(Context context, int i7) {
        int[] iArr = f11907g;
        iArr[0] = i7;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return obtainStyledAttributes.getColor(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static ColorStateList d(Context context, int i7) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = f11907g;
        iArr[0] = i7;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0 || (colorStateList = android.support.v4.media.session.b.h0(context, resourceId)) == null) {
                colorStateList = obtainStyledAttributes.getColorStateList(0);
            }
            return colorStateList;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
