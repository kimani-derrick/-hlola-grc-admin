package k;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.Method;
/* renamed from: k.V  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0871V {

    /* renamed from: a  reason: collision with root package name */
    public static final Method f11957a;

    /* renamed from: b  reason: collision with root package name */
    public static final Method f11958b;

    /* renamed from: c  reason: collision with root package name */
    public static final Method f11959c;
    public static final boolean d;

    static {
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Float.TYPE;
            Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, Boolean.TYPE, cls2, cls2);
            f11957a = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
            f11958b = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
            f11959c = declaredMethod3;
            declaredMethod3.setAccessible(true);
            d = true;
        } catch (NoSuchMethodException e3) {
            e3.printStackTrace();
        }
    }
}
