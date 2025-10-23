package H0;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.InflateException;
import android.view.animation.AnimationUtils;
import java.util.ArrayList;
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f802a = {16842755, 16843041, 16843093, 16843097, 16843551, 16843754, 16843771, 16843778, 16843779};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f803b = {16842755, 16843189, 16843190, 16843556, 16843557, 16843558, 16843866, 16843867};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f804c = {16842755, 16843780, 16843781, 16843782, 16843783, 16843784, 16843785, 16843786, 16843787, 16843788, 16843789, 16843979, 16843980, 16844062};
    public static final int[] d = {16842755, 16843781, 16844062};

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f805e = {16843161};
    public static final int[] f = {16842755, 16843213};

    /* renamed from: g  reason: collision with root package name */
    public static final int[] f806g = {16843073, 16843160, 16843198, 16843199, 16843200, 16843486, 16843487, 16843488};

    /* renamed from: h  reason: collision with root package name */
    public static final int[] f807h = {16843490};

    /* renamed from: i  reason: collision with root package name */
    public static final int[] f808i = {16843486, 16843487, 16843488, 16843489};

    /* renamed from: j  reason: collision with root package name */
    public static final int[] f809j = {16842788, 16843073, 16843488, 16843992};

    /* renamed from: k  reason: collision with root package name */
    public static final int[] f810k = {16843489, 16843781, 16843892, 16843893};

    /* JADX WARN: Code restructure failed: missing block: B:200:0x03a1, code lost:
        if (r31 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x03a3, code lost:
        if (r13 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x03a5, code lost:
        r1 = new android.animation.Animator[r13.size()];
        r3 = r13.iterator();
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x03b4, code lost:
        if (r3.hasNext() == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x03b6, code lost:
        r1[r14] = (android.animation.Animator) r3.next();
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x03c2, code lost:
        if (r32 != 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x03c4, code lost:
        r31.playTogether(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x03c8, code lost:
        r31.playSequentially(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x03cb, code lost:
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.animation.Animator a(android.content.Context r26, android.content.res.Resources r27, android.content.res.Resources.Theme r28, android.content.res.XmlResourceParser r29, android.util.AttributeSet r30, android.animation.AnimatorSet r31, int r32) {
        /*
            Method dump skipped, instructions count: 972
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: H0.a.a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, android.content.res.XmlResourceParser, android.util.AttributeSet, android.animation.AnimatorSet, int):android.animation.Animator");
    }

    /* JADX WARN: Type inference failed for: r11v26, types: [android.animation.TypeEvaluator, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.animation.TypeEvaluator, java.lang.Object] */
    public static PropertyValuesHolder b(TypedArray typedArray, int i7, int i8, int i9, String str) {
        boolean z7;
        int i10;
        boolean z8;
        int i11;
        boolean z9;
        g gVar;
        int i12;
        int i13;
        int i14;
        float f7;
        PropertyValuesHolder ofFloat;
        float f8;
        float f9;
        PropertyValuesHolder ofObject;
        TypedValue peekValue = typedArray.peekValue(i8);
        if (peekValue != null) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (z7) {
            i10 = peekValue.type;
        } else {
            i10 = 0;
        }
        TypedValue peekValue2 = typedArray.peekValue(i9);
        if (peekValue2 != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            i11 = peekValue2.type;
        } else {
            i11 = 0;
        }
        if (i7 == 4) {
            if ((z7 && c(i10)) || (z8 && c(i11))) {
                i7 = 3;
            } else {
                i7 = 0;
            }
        }
        if (i7 == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        PropertyValuesHolder propertyValuesHolder = null;
        if (i7 == 2) {
            String string = typedArray.getString(i8);
            String string2 = typedArray.getString(i9);
            D.g[] w7 = android.support.v4.media.session.b.w(string);
            D.g[] w8 = android.support.v4.media.session.b.w(string2);
            if (w7 == null && w8 == null) {
                return null;
            }
            if (w7 != null) {
                ?? obj = new Object();
                if (w8 != null) {
                    if (android.support.v4.media.session.b.d(w7, w8)) {
                        ofObject = PropertyValuesHolder.ofObject(str, (TypeEvaluator) obj, w7, w8);
                    } else {
                        throw new InflateException(" Can't morph from " + string + " to " + string2);
                    }
                } else {
                    ofObject = PropertyValuesHolder.ofObject(str, (TypeEvaluator) obj, w7);
                }
                return ofObject;
            } else if (w8 == null) {
                return null;
            } else {
                return PropertyValuesHolder.ofObject(str, (TypeEvaluator) new Object(), w8);
            }
        }
        if (i7 == 3) {
            gVar = g.f821a;
        } else {
            gVar = null;
        }
        if (z9) {
            if (z7) {
                if (i10 == 5) {
                    f8 = typedArray.getDimension(i8, 0.0f);
                } else {
                    f8 = typedArray.getFloat(i8, 0.0f);
                }
                if (z8) {
                    if (i11 == 5) {
                        f9 = typedArray.getDimension(i9, 0.0f);
                    } else {
                        f9 = typedArray.getFloat(i9, 0.0f);
                    }
                    ofFloat = PropertyValuesHolder.ofFloat(str, f8, f9);
                } else {
                    ofFloat = PropertyValuesHolder.ofFloat(str, f8);
                }
            } else {
                if (i11 == 5) {
                    f7 = typedArray.getDimension(i9, 0.0f);
                } else {
                    f7 = typedArray.getFloat(i9, 0.0f);
                }
                ofFloat = PropertyValuesHolder.ofFloat(str, f7);
            }
            propertyValuesHolder = ofFloat;
        } else if (z7) {
            if (i10 == 5) {
                i13 = (int) typedArray.getDimension(i8, 0.0f);
            } else if (c(i10)) {
                i13 = typedArray.getColor(i8, 0);
            } else {
                i13 = typedArray.getInt(i8, 0);
            }
            if (z8) {
                if (i11 == 5) {
                    i14 = (int) typedArray.getDimension(i9, 0.0f);
                } else if (c(i11)) {
                    i14 = typedArray.getColor(i9, 0);
                } else {
                    i14 = typedArray.getInt(i9, 0);
                }
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, i13, i14);
            } else {
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, i13);
            }
        } else if (z8) {
            if (i11 == 5) {
                i12 = (int) typedArray.getDimension(i9, 0.0f);
            } else if (c(i11)) {
                i12 = typedArray.getColor(i9, 0);
            } else {
                i12 = typedArray.getInt(i9, 0);
            }
            propertyValuesHolder = PropertyValuesHolder.ofInt(str, i12);
        }
        if (propertyValuesHolder != null && gVar != null) {
            propertyValuesHolder.setEvaluator(gVar);
            return propertyValuesHolder;
        }
        return propertyValuesHolder;
    }

    public static boolean c(int i7) {
        if (i7 >= 28 && i7 <= 31) {
            return true;
        }
        return false;
    }

    public static ValueAnimator d(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ObjectAnimator objectAnimator, XmlResourceParser xmlResourceParser) {
        ValueAnimator valueAnimator;
        int i7;
        int i8;
        int i9;
        int i10;
        ValueAnimator valueAnimator2;
        int i11;
        TypedArray typedArray;
        TypedArray typedArray2;
        int resourceId;
        ValueAnimator valueAnimator3;
        PropertyValuesHolder propertyValuesHolder;
        PropertyValuesHolder propertyValuesHolder2;
        boolean z7;
        int i12;
        boolean z8;
        int i13;
        TypedArray g7 = C.b.g(resources, theme, attributeSet, f806g);
        TypedArray g8 = C.b.g(resources, theme, attributeSet, f810k);
        if (objectAnimator == null) {
            valueAnimator = new ValueAnimator();
        } else {
            valueAnimator = objectAnimator;
        }
        int i14 = 300;
        if (C.b.d(xmlResourceParser, "duration")) {
            i14 = g7.getInt(1, 300);
        }
        long j7 = i14;
        if (!C.b.d(xmlResourceParser, "startOffset")) {
            i7 = 0;
        } else {
            i7 = g7.getInt(2, 0);
        }
        long j8 = i7;
        if (!C.b.d(xmlResourceParser, "valueType")) {
            i8 = 4;
        } else {
            i8 = g7.getInt(7, 4);
        }
        if (C.b.d(xmlResourceParser, "valueFrom") && C.b.d(xmlResourceParser, "valueTo")) {
            if (i8 == 4) {
                TypedValue peekValue = g7.peekValue(5);
                if (peekValue != null) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (z7) {
                    i12 = peekValue.type;
                } else {
                    i12 = 0;
                }
                TypedValue peekValue2 = g7.peekValue(6);
                if (peekValue2 != null) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (z8) {
                    i13 = peekValue2.type;
                } else {
                    i13 = 0;
                }
                if ((z7 && c(i12)) || (z8 && c(i13))) {
                    i8 = 3;
                } else {
                    i8 = 0;
                }
            }
            PropertyValuesHolder b7 = b(g7, i8, 5, 6, "");
            if (b7 != null) {
                valueAnimator.setValues(b7);
            }
        }
        valueAnimator.setDuration(j7);
        valueAnimator.setStartDelay(j8);
        if (!C.b.d(xmlResourceParser, "repeatCount")) {
            i9 = 0;
        } else {
            i9 = g7.getInt(3, 0);
        }
        valueAnimator.setRepeatCount(i9);
        if (!C.b.d(xmlResourceParser, "repeatMode")) {
            i10 = 1;
        } else {
            i10 = g7.getInt(4, 1);
        }
        valueAnimator.setRepeatMode(i10);
        if (g8 != null) {
            ObjectAnimator objectAnimator2 = (ObjectAnimator) valueAnimator;
            String c5 = C.b.c(g8, xmlResourceParser, "pathData", 1);
            if (c5 != null) {
                String c6 = C.b.c(g8, xmlResourceParser, "propertyXName", 2);
                String c7 = C.b.c(g8, xmlResourceParser, "propertyYName", 3);
                if (c6 == null && c7 == null) {
                    throw new InflateException(g8.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
                }
                Path path = new Path();
                try {
                    D.g.b(android.support.v4.media.session.b.w(c5), path);
                    PathMeasure pathMeasure = new PathMeasure(path, false);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Float.valueOf(0.0f));
                    float f7 = 0.0f;
                    while (true) {
                        f7 += pathMeasure.getLength();
                        arrayList.add(Float.valueOf(f7));
                        if (!pathMeasure.nextContour()) {
                            break;
                        }
                        valueAnimator = valueAnimator;
                    }
                    PathMeasure pathMeasure2 = new PathMeasure(path, false);
                    int min = Math.min(100, ((int) (f7 / 0.5f)) + 1);
                    float[] fArr = new float[min];
                    float[] fArr2 = new float[min];
                    float[] fArr3 = new float[2];
                    float f8 = f7 / (min - 1);
                    valueAnimator2 = valueAnimator;
                    typedArray = g7;
                    int i15 = 0;
                    int i16 = 0;
                    float f9 = 0.0f;
                    while (true) {
                        propertyValuesHolder = null;
                        if (i16 >= min) {
                            break;
                        }
                        int i17 = min;
                        pathMeasure2.getPosTan(f9 - ((Float) arrayList.get(i15)).floatValue(), fArr3, null);
                        fArr[i16] = fArr3[0];
                        fArr2[i16] = fArr3[1];
                        f9 += f8;
                        int i18 = i15 + 1;
                        if (i18 < arrayList.size() && f9 > ((Float) arrayList.get(i18)).floatValue()) {
                            pathMeasure2.nextContour();
                            i15 = i18;
                        }
                        i16++;
                        min = i17;
                    }
                    if (c6 != null) {
                        propertyValuesHolder2 = PropertyValuesHolder.ofFloat(c6, fArr);
                    } else {
                        propertyValuesHolder2 = null;
                    }
                    if (c7 != null) {
                        propertyValuesHolder = PropertyValuesHolder.ofFloat(c7, fArr2);
                    }
                    if (propertyValuesHolder2 == null) {
                        objectAnimator2.setValues(propertyValuesHolder);
                    } else if (propertyValuesHolder == null) {
                        objectAnimator2.setValues(propertyValuesHolder2);
                    } else {
                        objectAnimator2.setValues(propertyValuesHolder2, propertyValuesHolder);
                    }
                    i11 = 0;
                } catch (RuntimeException e3) {
                    throw new RuntimeException("Error in parsing ".concat(c5), e3);
                }
            } else {
                valueAnimator2 = valueAnimator;
                typedArray = g7;
                i11 = 0;
                objectAnimator2.setPropertyName(C.b.c(g8, xmlResourceParser, "propertyName", 0));
            }
        } else {
            valueAnimator2 = valueAnimator;
            i11 = 0;
            typedArray = g7;
        }
        if (!C.b.d(xmlResourceParser, "interpolator")) {
            resourceId = i11;
            typedArray2 = typedArray;
        } else {
            typedArray2 = typedArray;
            resourceId = typedArray2.getResourceId(i11, i11);
        }
        if (resourceId > 0) {
            valueAnimator3 = valueAnimator2;
            valueAnimator3.setInterpolator(AnimationUtils.loadInterpolator(context, resourceId));
        } else {
            valueAnimator3 = valueAnimator2;
        }
        typedArray2.recycle();
        if (g8 != null) {
            g8.recycle();
        }
        return valueAnimator3;
    }
}
