package v;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import android.util.Xml;
import java.util.HashMap;
/* renamed from: v.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1300a {

    /* renamed from: a  reason: collision with root package name */
    public int f15082a;

    /* renamed from: b  reason: collision with root package name */
    public int f15083b;

    /* renamed from: c  reason: collision with root package name */
    public float f15084c;
    public String d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f15085e;
    public int f;

    public C1300a(C1300a c1300a, Object obj) {
        c1300a.getClass();
        this.f15082a = c1300a.f15082a;
        b(obj);
    }

    /* JADX WARN: Type inference failed for: r13v1, types: [v.a, java.lang.Object] */
    public static void a(Context context, XmlResourceParser xmlResourceParser, HashMap hashMap) {
        float dimension;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC1313n.f15240c);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        int i7 = 0;
        Object obj = null;
        for (int i8 = 0; i8 < indexCount; i8++) {
            int index = obtainStyledAttributes.getIndex(i8);
            if (index == 0) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == 1) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                i7 = 6;
            } else {
                int i9 = 3;
                if (index != 3) {
                    i9 = 4;
                    if (index != 2) {
                        if (index == 7) {
                            dimension = TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics());
                        } else if (index == 4) {
                            dimension = obtainStyledAttributes.getDimension(index, 0.0f);
                        } else {
                            i9 = 5;
                            if (index == 5) {
                                obj = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                                i7 = 2;
                            } else if (index == 6) {
                                obj = Integer.valueOf(obtainStyledAttributes.getInteger(index, -1));
                                i7 = 1;
                            } else if (index == 8) {
                                obj = obtainStyledAttributes.getString(index);
                                i7 = i9;
                            }
                        }
                        obj = Float.valueOf(dimension);
                        i7 = 7;
                    }
                }
                obj = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                i7 = i9;
            }
        }
        if (str != null && obj != null) {
            ?? obj2 = new Object();
            obj2.f15082a = i7;
            obj2.b(obj);
            hashMap.put(str, obj2);
        }
        obtainStyledAttributes.recycle();
    }

    public final void b(Object obj) {
        switch (s.h.b(this.f15082a)) {
            case 0:
                this.f15083b = ((Integer) obj).intValue();
                return;
            case 1:
            case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                this.f15084c = ((Float) obj).floatValue();
                return;
            case 2:
            case 3:
                this.f = ((Integer) obj).intValue();
                return;
            case 4:
                this.d = (String) obj;
                return;
            case 5:
                this.f15085e = ((Boolean) obj).booleanValue();
                return;
            default:
                return;
        }
    }
}
