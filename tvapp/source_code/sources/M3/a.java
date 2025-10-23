package M3;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.boxhdo.android.tv.R;
import i.C0763b;
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f2294a = {16842752, R.attr.theme};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f2295b = {R.attr.materialThemeOverlay};

    /* JADX WARN: Type inference failed for: r4v5, types: [android.content.Context, android.content.ContextWrapper, i.b] */
    public static Context a(Context context, AttributeSet attributeSet, int i7, int i8) {
        boolean z7;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f2295b, i7, i8);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        if ((context instanceof C0763b) && ((C0763b) context).f11274a == resourceId) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (resourceId != 0 && !z7) {
            ?? contextWrapper = new ContextWrapper(context);
            contextWrapper.f11274a = resourceId;
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f2294a);
            int resourceId2 = obtainStyledAttributes2.getResourceId(0, 0);
            int resourceId3 = obtainStyledAttributes2.getResourceId(1, 0);
            obtainStyledAttributes2.recycle();
            if (resourceId2 == 0) {
                resourceId2 = resourceId3;
            }
            if (resourceId2 != 0) {
                contextWrapper.getTheme().applyStyle(resourceId2, true);
            }
            return contextWrapper;
        }
        return context;
    }
}
