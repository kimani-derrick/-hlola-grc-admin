package k;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
/* renamed from: k.P  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0866P {

    /* renamed from: l  reason: collision with root package name */
    public static final RectF f11917l = new RectF();

    /* renamed from: m  reason: collision with root package name */
    public static final ConcurrentHashMap f11918m = new ConcurrentHashMap();

    /* renamed from: a  reason: collision with root package name */
    public int f11919a = 0;

    /* renamed from: b  reason: collision with root package name */
    public boolean f11920b = false;

    /* renamed from: c  reason: collision with root package name */
    public float f11921c = -1.0f;
    public float d = -1.0f;

    /* renamed from: e  reason: collision with root package name */
    public float f11922e = -1.0f;
    public int[] f = new int[0];

    /* renamed from: g  reason: collision with root package name */
    public boolean f11923g = false;

    /* renamed from: h  reason: collision with root package name */
    public TextPaint f11924h;

    /* renamed from: i  reason: collision with root package name */
    public final TextView f11925i;

    /* renamed from: j  reason: collision with root package name */
    public final Context f11926j;

    /* renamed from: k  reason: collision with root package name */
    public final C0862L f11927k;

    static {
        new ConcurrentHashMap();
    }

    public C0866P(TextView textView) {
        C0862L c0862l;
        this.f11925i = textView;
        this.f11926j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            c0862l = new C0864N();
        } else {
            c0862l = new C0862L();
        }
        this.f11927k = c0862l;
    }

    public static int[] b(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i7 : iArr) {
            if (i7 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i7)) < 0) {
                arrayList.add(Integer.valueOf(i7));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i8 = 0; i8 < size; i8++) {
            iArr2[i8] = ((Integer) arrayList.get(i8)).intValue();
        }
        return iArr2;
    }

    public static Method d(String str) {
        try {
            ConcurrentHashMap concurrentHashMap = f11918m;
            Method method = (Method) concurrentHashMap.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, null)) != null) {
                method.setAccessible(true);
                concurrentHashMap.put(str, method);
            }
            return method;
        } catch (Exception e3) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e3);
            return null;
        }
    }

    public static Object e(Object obj, Object obj2, String str) {
        try {
            return d(str).invoke(obj, null);
        } catch (Exception e3) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e3);
            return obj2;
        }
    }

    public final void a() {
        int measuredWidth;
        if (!f()) {
            return;
        }
        if (this.f11920b) {
            if (this.f11925i.getMeasuredHeight() > 0 && this.f11925i.getMeasuredWidth() > 0) {
                if (this.f11927k.b(this.f11925i)) {
                    measuredWidth = 1048576;
                } else {
                    measuredWidth = (this.f11925i.getMeasuredWidth() - this.f11925i.getTotalPaddingLeft()) - this.f11925i.getTotalPaddingRight();
                }
                int height = (this.f11925i.getHeight() - this.f11925i.getCompoundPaddingBottom()) - this.f11925i.getCompoundPaddingTop();
                if (measuredWidth > 0 && height > 0) {
                    RectF rectF = f11917l;
                    synchronized (rectF) {
                        try {
                            rectF.setEmpty();
                            rectF.right = measuredWidth;
                            rectF.bottom = height;
                            float c5 = c(rectF);
                            if (c5 != this.f11925i.getTextSize()) {
                                g(0, c5);
                            }
                        } finally {
                        }
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        this.f11920b = true;
    }

    public final int c(RectF rectF) {
        CharSequence transformation;
        int length = this.f.length;
        if (length != 0) {
            int i7 = length - 1;
            int i8 = 0;
            int i9 = 1;
            while (i9 <= i7) {
                int i10 = (i9 + i7) / 2;
                int i11 = this.f[i10];
                TextView textView = this.f11925i;
                CharSequence text = textView.getText();
                TransformationMethod transformationMethod = textView.getTransformationMethod();
                if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, textView)) != null) {
                    text = transformation;
                }
                int b7 = AbstractC0858I.b(textView);
                TextPaint textPaint = this.f11924h;
                if (textPaint == null) {
                    this.f11924h = new TextPaint();
                } else {
                    textPaint.reset();
                }
                this.f11924h.set(textView.getPaint());
                this.f11924h.setTextSize(i11);
                StaticLayout a7 = AbstractC0861K.a(text, (Layout.Alignment) e(textView, Layout.Alignment.ALIGN_NORMAL, "getLayoutAlignment"), Math.round(rectF.right), b7, this.f11925i, this.f11924h, this.f11927k);
                if ((b7 != -1 && (a7.getLineCount() > b7 || a7.getLineEnd(a7.getLineCount() - 1) != text.length())) || a7.getHeight() > rectF.bottom) {
                    i8 = i10 - 1;
                    i7 = i8;
                } else {
                    int i12 = i10 + 1;
                    i8 = i9;
                    i9 = i12;
                }
            }
            return this.f[i8];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    public final boolean f() {
        if (j() && this.f11919a != 0) {
            return true;
        }
        return false;
    }

    public final void g(int i7, float f) {
        Resources resources;
        Context context = this.f11926j;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        float applyDimension = TypedValue.applyDimension(i7, f, resources.getDisplayMetrics());
        TextView textView = this.f11925i;
        if (applyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(applyDimension);
            boolean a7 = AbstractC0860J.a(textView);
            if (textView.getLayout() != null) {
                this.f11920b = false;
                try {
                    Method d = d("nullLayouts");
                    if (d != null) {
                        d.invoke(textView, null);
                    }
                } catch (Exception e3) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e3);
                }
                if (!a7) {
                    textView.requestLayout();
                } else {
                    textView.forceLayout();
                }
                textView.invalidate();
            }
        }
    }

    public final boolean h() {
        if (j() && this.f11919a == 1) {
            if (!this.f11923g || this.f.length == 0) {
                int floor = ((int) Math.floor((this.f11922e - this.d) / this.f11921c)) + 1;
                int[] iArr = new int[floor];
                for (int i7 = 0; i7 < floor; i7++) {
                    iArr[i7] = Math.round((i7 * this.f11921c) + this.d);
                }
                this.f = b(iArr);
            }
            this.f11920b = true;
        } else {
            this.f11920b = false;
        }
        return this.f11920b;
    }

    public final boolean i() {
        int[] iArr;
        int length;
        boolean z7;
        if (this.f.length > 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.f11923g = z7;
        if (z7) {
            this.f11919a = 1;
            this.d = iArr[0];
            this.f11922e = iArr[length - 1];
            this.f11921c = -1.0f;
        }
        return z7;
    }

    public final boolean j() {
        return !(this.f11925i instanceof AbstractC0908q);
    }

    public final void k(float f, float f7, float f8) {
        if (f > 0.0f) {
            if (f7 > f) {
                if (f8 > 0.0f) {
                    this.f11919a = 1;
                    this.d = f;
                    this.f11922e = f7;
                    this.f11921c = f8;
                    this.f11923g = false;
                    return;
                }
                throw new IllegalArgumentException("The auto-size step granularity (" + f8 + "px) is less or equal to (0px)");
            }
            throw new IllegalArgumentException("Maximum auto-size text size (" + f7 + "px) is less or equal to minimum auto-size text size (" + f + "px)");
        }
        throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
    }
}
