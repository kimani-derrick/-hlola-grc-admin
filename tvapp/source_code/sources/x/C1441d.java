package x;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
/* renamed from: x.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1441d extends ViewGroup.MarginLayoutParams {

    /* renamed from: a  reason: collision with root package name */
    public AbstractC1438a f16129a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f16130b;

    /* renamed from: c  reason: collision with root package name */
    public final int f16131c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public final int f16132e;
    public final int f;

    /* renamed from: g  reason: collision with root package name */
    public final int f16133g;

    /* renamed from: h  reason: collision with root package name */
    public int f16134h;

    /* renamed from: i  reason: collision with root package name */
    public int f16135i;

    /* renamed from: j  reason: collision with root package name */
    public int f16136j;

    /* renamed from: k  reason: collision with root package name */
    public View f16137k;

    /* renamed from: l  reason: collision with root package name */
    public View f16138l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f16139m;
    public boolean n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f16140o;

    /* renamed from: p  reason: collision with root package name */
    public final Rect f16141p;

    public C1441d() {
        super(-2, -2);
        this.f16130b = false;
        this.f16131c = 0;
        this.d = 0;
        this.f16132e = -1;
        this.f = -1;
        this.f16133g = 0;
        this.f16134h = 0;
        this.f16141p = new Rect();
    }

    public final boolean a(int i7) {
        if (i7 != 0) {
            if (i7 != 1) {
                return false;
            }
            return this.f16140o;
        }
        return this.n;
    }

    public C1441d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC1438a abstractC1438a;
        this.f16130b = false;
        this.f16131c = 0;
        this.d = 0;
        this.f16132e = -1;
        this.f = -1;
        this.f16133g = 0;
        this.f16134h = 0;
        this.f16141p = new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, w.a.f15431b);
        this.f16131c = obtainStyledAttributes.getInteger(0, 0);
        this.f = obtainStyledAttributes.getResourceId(1, -1);
        this.d = obtainStyledAttributes.getInteger(2, 0);
        this.f16132e = obtainStyledAttributes.getInteger(6, -1);
        this.f16133g = obtainStyledAttributes.getInt(5, 0);
        this.f16134h = obtainStyledAttributes.getInt(4, 0);
        boolean hasValue = obtainStyledAttributes.hasValue(3);
        this.f16130b = hasValue;
        if (hasValue) {
            String string = obtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.f5587J;
            if (TextUtils.isEmpty(string)) {
                abstractC1438a = null;
            } else {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.f5587J;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.f5589L;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f5588K);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    abstractC1438a = (AbstractC1438a) constructor.newInstance(context, attributeSet);
                } catch (Exception e3) {
                    throw new RuntimeException(AbstractC0515y1.x("Could not inflate Behavior subclass ", string), e3);
                }
            }
            this.f16129a = abstractC1438a;
        }
        obtainStyledAttributes.recycle();
        AbstractC1438a abstractC1438a2 = this.f16129a;
        if (abstractC1438a2 != null) {
            abstractC1438a2.c(this);
        }
    }

    public C1441d(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f16130b = false;
        this.f16131c = 0;
        this.d = 0;
        this.f16132e = -1;
        this.f = -1;
        this.f16133g = 0;
        this.f16134h = 0;
        this.f16141p = new Rect();
    }

    public C1441d(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f16130b = false;
        this.f16131c = 0;
        this.d = 0;
        this.f16132e = -1;
        this.f = -1;
        this.f16133g = 0;
        this.f16134h = 0;
        this.f16141p = new Rect();
    }

    public C1441d(C1441d c1441d) {
        super((ViewGroup.MarginLayoutParams) c1441d);
        this.f16130b = false;
        this.f16131c = 0;
        this.d = 0;
        this.f16132e = -1;
        this.f = -1;
        this.f16133g = 0;
        this.f16134h = 0;
        this.f16141p = new Rect();
    }
}
