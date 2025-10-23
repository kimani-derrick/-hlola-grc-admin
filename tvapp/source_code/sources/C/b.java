package C;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import y.AbstractC1489a;
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static final float[][] f319a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* renamed from: b  reason: collision with root package name */
    public static final float[][] f320b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* renamed from: c  reason: collision with root package name */
    public static final float[] f321c = {95.047f, 100.0f, 108.883f};
    public static final float[][] d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    public static d b(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i7) {
        d dVar;
        if (d(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i7, typedValue);
            int i8 = typedValue.type;
            if (i8 >= 28 && i8 <= 31) {
                return new d((Shader) null, (ColorStateList) null, typedValue.data);
            }
            try {
                dVar = d.d(typedArray.getResources(), typedArray.getResourceId(i7, 0), theme);
            } catch (Exception e3) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e3);
                dVar = null;
            }
            if (dVar != null) {
                return dVar;
            }
        }
        return new d((Shader) null, (ColorStateList) null, 0);
    }

    public static String c(TypedArray typedArray, XmlResourceParser xmlResourceParser, String str, int i7) {
        if (!d(xmlResourceParser, str)) {
            return null;
        }
        return typedArray.getString(i7);
    }

    public static boolean d(XmlPullParser xmlPullParser, String str) {
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null) {
            return true;
        }
        return false;
    }

    public static int e(float f) {
        float f7;
        boolean z7;
        float f8;
        if (f < 1.0f) {
            return -16777216;
        }
        if (f > 99.0f) {
            return -1;
        }
        float f9 = (f + 16.0f) / 116.0f;
        if (f > 8.0f) {
            f7 = f9 * f9 * f9;
        } else {
            f7 = f / 903.2963f;
        }
        float f10 = f9 * f9 * f9;
        if (f10 > 0.008856452f) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (z7) {
            f8 = f10;
        } else {
            f8 = ((f9 * 116.0f) - 16.0f) / 903.2963f;
        }
        if (!z7) {
            f10 = ((f9 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f321c;
        return D.a.a(f8 * fArr[0], f7 * fArr[1], f10 * fArr[2]);
    }

    public static float f(int i7) {
        float pow;
        float f = i7 / 255.0f;
        if (f <= 0.04045f) {
            pow = f / 12.92f;
        } else {
            pow = (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d);
        }
        return pow * 100.0f;
    }

    public static TypedArray g(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static f j(XmlResourceParser xmlResourceParser, Resources resources) {
        int next;
        int i7;
        boolean z7;
        int i8;
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            xmlResourceParser.require(2, null, "font-family");
            if (xmlResourceParser.getName().equals("font-family")) {
                TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC1489a.f16347b);
                String string = obtainAttributes.getString(0);
                String string2 = obtainAttributes.getString(4);
                String string3 = obtainAttributes.getString(5);
                int resourceId = obtainAttributes.getResourceId(1, 0);
                int integer = obtainAttributes.getInteger(2, 1);
                int integer2 = obtainAttributes.getInteger(3, 500);
                String string4 = obtainAttributes.getString(6);
                obtainAttributes.recycle();
                if (string != null && string2 != null && string3 != null) {
                    while (xmlResourceParser.next() != 3) {
                        l(xmlResourceParser);
                    }
                    return new i(new H.e(string, string2, string3, k(resources, resourceId)), integer, integer2, string4);
                }
                ArrayList arrayList = new ArrayList();
                while (xmlResourceParser.next() != 3) {
                    if (xmlResourceParser.getEventType() == 2) {
                        if (xmlResourceParser.getName().equals("font")) {
                            TypedArray obtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC1489a.f16348c);
                            int i9 = 8;
                            if (!obtainAttributes2.hasValue(8)) {
                                i9 = 1;
                            }
                            int i10 = obtainAttributes2.getInt(i9, 400);
                            if (obtainAttributes2.hasValue(6)) {
                                i7 = 6;
                            } else {
                                i7 = 2;
                            }
                            if (1 == obtainAttributes2.getInt(i7, 0)) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            int i11 = 9;
                            if (!obtainAttributes2.hasValue(9)) {
                                i11 = 3;
                            }
                            int i12 = 7;
                            if (!obtainAttributes2.hasValue(7)) {
                                i12 = 4;
                            }
                            String string5 = obtainAttributes2.getString(i12);
                            int i13 = obtainAttributes2.getInt(i11, 0);
                            if (obtainAttributes2.hasValue(5)) {
                                i8 = 5;
                            } else {
                                i8 = 0;
                            }
                            int resourceId2 = obtainAttributes2.getResourceId(i8, 0);
                            String string6 = obtainAttributes2.getString(i8);
                            obtainAttributes2.recycle();
                            while (xmlResourceParser.next() != 3) {
                                l(xmlResourceParser);
                            }
                            arrayList.add(new h(i10, i13, resourceId2, string6, string5, z7));
                        } else {
                            l(xmlResourceParser);
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    return new g((h[]) arrayList.toArray(new h[0]));
                }
            } else {
                l(xmlResourceParser);
            }
            return null;
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static List k(Resources resources, int i7) {
        if (i7 == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i7);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (e.a(obtainTypedArray, 0) == 1) {
                for (int i8 = 0; i8 < obtainTypedArray.length(); i8++) {
                    int resourceId = obtainTypedArray.getResourceId(i8, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i7);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static void l(XmlResourceParser xmlResourceParser) {
        int i7 = 1;
        while (i7 > 0) {
            int next = xmlResourceParser.next();
            if (next != 2) {
                if (next == 3) {
                    i7--;
                }
            } else {
                i7++;
            }
        }
    }

    public static float m() {
        return ((float) Math.pow((50.0f + 16.0d) / 116.0d, 3.0d)) * 100.0f;
    }

    public void a(int i7) {
        new Handler(Looper.getMainLooper()).post(new n(i7, 0, this));
    }

    public abstract void h(int i7);

    public abstract void i(Typeface typeface);
}
