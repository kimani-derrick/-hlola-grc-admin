package v;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.gms.internal.measurement.AbstractC0515y1;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import r.AbstractC1110a;
import r0.AbstractC1111a;
/* renamed from: v.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1310k {
    public static final int[] d = {0, 4, 8};

    /* renamed from: e  reason: collision with root package name */
    public static final SparseIntArray f15234e;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f15235a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final boolean f15236b = true;

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f15237c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f15234e = sparseIntArray;
        sparseIntArray.append(76, 25);
        sparseIntArray.append(77, 26);
        sparseIntArray.append(79, 29);
        sparseIntArray.append(80, 30);
        sparseIntArray.append(86, 36);
        sparseIntArray.append(85, 35);
        sparseIntArray.append(58, 4);
        sparseIntArray.append(57, 3);
        sparseIntArray.append(55, 1);
        sparseIntArray.append(94, 6);
        sparseIntArray.append(95, 7);
        sparseIntArray.append(65, 17);
        sparseIntArray.append(66, 18);
        sparseIntArray.append(67, 19);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(81, 32);
        sparseIntArray.append(82, 33);
        sparseIntArray.append(64, 10);
        sparseIntArray.append(63, 9);
        sparseIntArray.append(98, 13);
        sparseIntArray.append(101, 16);
        sparseIntArray.append(99, 14);
        sparseIntArray.append(96, 11);
        sparseIntArray.append(100, 15);
        sparseIntArray.append(97, 12);
        sparseIntArray.append(89, 40);
        sparseIntArray.append(74, 39);
        sparseIntArray.append(73, 41);
        sparseIntArray.append(88, 42);
        sparseIntArray.append(72, 20);
        sparseIntArray.append(87, 37);
        sparseIntArray.append(62, 5);
        sparseIntArray.append(75, 82);
        sparseIntArray.append(84, 82);
        sparseIntArray.append(78, 82);
        sparseIntArray.append(56, 82);
        sparseIntArray.append(54, 82);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(90, 54);
        sparseIntArray.append(68, 55);
        sparseIntArray.append(91, 56);
        sparseIntArray.append(69, 57);
        sparseIntArray.append(92, 58);
        sparseIntArray.append(70, 59);
        sparseIntArray.append(59, 61);
        sparseIntArray.append(61, 62);
        sparseIntArray.append(60, 63);
        sparseIntArray.append(27, 64);
        sparseIntArray.append(106, 65);
        sparseIntArray.append(33, 66);
        sparseIntArray.append(107, 67);
        sparseIntArray.append(103, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(102, 68);
        sparseIntArray.append(93, 69);
        sparseIntArray.append(71, 70);
        sparseIntArray.append(31, 71);
        sparseIntArray.append(29, 72);
        sparseIntArray.append(30, 73);
        sparseIntArray.append(32, 74);
        sparseIntArray.append(28, 75);
        sparseIntArray.append(104, 76);
        sparseIntArray.append(83, 77);
        sparseIntArray.append(108, 78);
        sparseIntArray.append(53, 80);
        sparseIntArray.append(52, 81);
    }

    public static int[] c(Barrier barrier, String str) {
        int i7;
        HashMap hashMap;
        String[] split = str.split(",");
        Context context = barrier.getContext();
        int[] iArr = new int[split.length];
        int i8 = 0;
        int i9 = 0;
        while (i8 < split.length) {
            String trim = split[i8].trim();
            Object obj = null;
            try {
                i7 = AbstractC1312m.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i7 = 0;
            }
            if (i7 == 0) {
                i7 = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i7 == 0 && barrier.isInEditMode() && (barrier.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) barrier.getParent();
                constraintLayout.getClass();
                if ((trim instanceof String) && (hashMap = constraintLayout.f5574C) != null && hashMap.containsKey(trim)) {
                    obj = constraintLayout.f5574C.get(trim);
                }
                if (obj != null && (obj instanceof Integer)) {
                    i7 = ((Integer) obj).intValue();
                }
            }
            iArr[i9] = i7;
            i8++;
            i9++;
        }
        if (i9 != split.length) {
            return Arrays.copyOf(iArr, i9);
        }
        return iArr;
    }

    public static C1305f d(Context context, AttributeSet attributeSet) {
        StringBuilder sb;
        C1305f c1305f = new C1305f();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1313n.f15238a);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i7 = 0; i7 < indexCount; i7++) {
            int index = obtainStyledAttributes.getIndex(i7);
            C1308i c1308i = c1305f.f15156b;
            C1307h c1307h = c1305f.f15157c;
            C1309j c1309j = c1305f.f15158e;
            C1306g c1306g = c1305f.d;
            if (index != 1 && 23 != index && 24 != index) {
                c1307h.getClass();
                c1306g.getClass();
                c1308i.getClass();
                c1309j.getClass();
            }
            SparseIntArray sparseIntArray = f15234e;
            switch (sparseIntArray.get(index)) {
                case 1:
                    c1306g.f15204o = f(obtainStyledAttributes, index, c1306g.f15204o);
                    break;
                case 2:
                    c1306g.F = obtainStyledAttributes.getDimensionPixelSize(index, c1306g.F);
                    break;
                case 3:
                    c1306g.n = f(obtainStyledAttributes, index, c1306g.n);
                    break;
                case 4:
                    c1306g.f15203m = f(obtainStyledAttributes, index, c1306g.f15203m);
                    break;
                case 5:
                    c1306g.f15211v = obtainStyledAttributes.getString(index);
                    break;
                case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                    c1306g.f15215z = obtainStyledAttributes.getDimensionPixelOffset(index, c1306g.f15215z);
                    break;
                case X.i.DOUBLE_FIELD_NUMBER /* 7 */:
                    c1306g.f15160A = obtainStyledAttributes.getDimensionPixelOffset(index, c1306g.f15160A);
                    break;
                case 8:
                    c1306g.f15165G = obtainStyledAttributes.getDimensionPixelSize(index, c1306g.f15165G);
                    break;
                case 9:
                    c1306g.f15208s = f(obtainStyledAttributes, index, c1306g.f15208s);
                    break;
                case 10:
                    c1306g.f15207r = f(obtainStyledAttributes, index, c1306g.f15207r);
                    break;
                case 11:
                    c1306g.f15170L = obtainStyledAttributes.getDimensionPixelSize(index, c1306g.f15170L);
                    break;
                case 12:
                    c1306g.f15171M = obtainStyledAttributes.getDimensionPixelSize(index, c1306g.f15171M);
                    break;
                case 13:
                    c1306g.f15167I = obtainStyledAttributes.getDimensionPixelSize(index, c1306g.f15167I);
                    break;
                case 14:
                    c1306g.f15169K = obtainStyledAttributes.getDimensionPixelSize(index, c1306g.f15169K);
                    break;
                case 15:
                    c1306g.f15172N = obtainStyledAttributes.getDimensionPixelSize(index, c1306g.f15172N);
                    break;
                case 16:
                    c1306g.f15168J = obtainStyledAttributes.getDimensionPixelSize(index, c1306g.f15168J);
                    break;
                case 17:
                    c1306g.d = obtainStyledAttributes.getDimensionPixelOffset(index, c1306g.d);
                    break;
                case 18:
                    c1306g.f15191e = obtainStyledAttributes.getDimensionPixelOffset(index, c1306g.f15191e);
                    break;
                case 19:
                    c1306g.f = obtainStyledAttributes.getFloat(index, c1306g.f);
                    break;
                case 20:
                    c1306g.f15209t = obtainStyledAttributes.getFloat(index, c1306g.f15209t);
                    break;
                case 21:
                    c1306g.f15188c = obtainStyledAttributes.getLayoutDimension(index, c1306g.f15188c);
                    break;
                case 22:
                    c1308i.f15220a = d[obtainStyledAttributes.getInt(index, c1308i.f15220a)];
                    break;
                case 23:
                    c1306g.f15186b = obtainStyledAttributes.getLayoutDimension(index, c1306g.f15186b);
                    break;
                case 24:
                    c1306g.f15162C = obtainStyledAttributes.getDimensionPixelSize(index, c1306g.f15162C);
                    break;
                case 25:
                    c1306g.f15194g = f(obtainStyledAttributes, index, c1306g.f15194g);
                    break;
                case 26:
                    c1306g.f15196h = f(obtainStyledAttributes, index, c1306g.f15196h);
                    break;
                case 27:
                    c1306g.f15161B = obtainStyledAttributes.getInt(index, c1306g.f15161B);
                    break;
                case 28:
                    c1306g.f15163D = obtainStyledAttributes.getDimensionPixelSize(index, c1306g.f15163D);
                    break;
                case 29:
                    c1306g.f15198i = f(obtainStyledAttributes, index, c1306g.f15198i);
                    break;
                case 30:
                    c1306g.f15200j = f(obtainStyledAttributes, index, c1306g.f15200j);
                    break;
                case 31:
                    c1306g.f15166H = obtainStyledAttributes.getDimensionPixelSize(index, c1306g.f15166H);
                    break;
                case 32:
                    c1306g.f15205p = f(obtainStyledAttributes, index, c1306g.f15205p);
                    break;
                case 33:
                    c1306g.f15206q = f(obtainStyledAttributes, index, c1306g.f15206q);
                    break;
                case 34:
                    c1306g.f15164E = obtainStyledAttributes.getDimensionPixelSize(index, c1306g.f15164E);
                    break;
                case 35:
                    c1306g.f15202l = f(obtainStyledAttributes, index, c1306g.f15202l);
                    break;
                case 36:
                    c1306g.f15201k = f(obtainStyledAttributes, index, c1306g.f15201k);
                    break;
                case 37:
                    c1306g.f15210u = obtainStyledAttributes.getFloat(index, c1306g.f15210u);
                    break;
                case 38:
                    c1305f.f15155a = obtainStyledAttributes.getResourceId(index, c1305f.f15155a);
                    break;
                case 39:
                    c1306g.f15174P = obtainStyledAttributes.getFloat(index, c1306g.f15174P);
                    break;
                case 40:
                    c1306g.f15173O = obtainStyledAttributes.getFloat(index, c1306g.f15173O);
                    break;
                case 41:
                    c1306g.f15175Q = obtainStyledAttributes.getInt(index, c1306g.f15175Q);
                    break;
                case 42:
                    c1306g.f15176R = obtainStyledAttributes.getInt(index, c1306g.f15176R);
                    break;
                case 43:
                    c1308i.f15222c = obtainStyledAttributes.getFloat(index, c1308i.f15222c);
                    break;
                case 44:
                    c1309j.f15232k = true;
                    c1309j.f15233l = obtainStyledAttributes.getDimension(index, c1309j.f15233l);
                    break;
                case 45:
                    c1309j.f15225b = obtainStyledAttributes.getFloat(index, c1309j.f15225b);
                    break;
                case 46:
                    c1309j.f15226c = obtainStyledAttributes.getFloat(index, c1309j.f15226c);
                    break;
                case 47:
                    c1309j.d = obtainStyledAttributes.getFloat(index, c1309j.d);
                    break;
                case 48:
                    c1309j.f15227e = obtainStyledAttributes.getFloat(index, c1309j.f15227e);
                    break;
                case 49:
                    c1309j.f = obtainStyledAttributes.getDimension(index, c1309j.f);
                    break;
                case 50:
                    c1309j.f15228g = obtainStyledAttributes.getDimension(index, c1309j.f15228g);
                    break;
                case 51:
                    c1309j.f15229h = obtainStyledAttributes.getDimension(index, c1309j.f15229h);
                    break;
                case 52:
                    c1309j.f15230i = obtainStyledAttributes.getDimension(index, c1309j.f15230i);
                    break;
                case 53:
                    c1309j.f15231j = obtainStyledAttributes.getDimension(index, c1309j.f15231j);
                    break;
                case 54:
                    c1306g.f15177S = obtainStyledAttributes.getInt(index, c1306g.f15177S);
                    break;
                case 55:
                    c1306g.f15178T = obtainStyledAttributes.getInt(index, c1306g.f15178T);
                    break;
                case 56:
                    c1306g.f15179U = obtainStyledAttributes.getDimensionPixelSize(index, c1306g.f15179U);
                    break;
                case 57:
                    c1306g.f15180V = obtainStyledAttributes.getDimensionPixelSize(index, c1306g.f15180V);
                    break;
                case 58:
                    c1306g.W = obtainStyledAttributes.getDimensionPixelSize(index, c1306g.W);
                    break;
                case 59:
                    c1306g.f15181X = obtainStyledAttributes.getDimensionPixelSize(index, c1306g.f15181X);
                    break;
                case 60:
                    c1309j.f15224a = obtainStyledAttributes.getFloat(index, c1309j.f15224a);
                    break;
                case 61:
                    c1306g.f15212w = f(obtainStyledAttributes, index, c1306g.f15212w);
                    break;
                case 62:
                    c1306g.f15213x = obtainStyledAttributes.getDimensionPixelSize(index, c1306g.f15213x);
                    break;
                case 63:
                    c1306g.f15214y = obtainStyledAttributes.getFloat(index, c1306g.f15214y);
                    break;
                case 64:
                    c1307h.f15217a = f(obtainStyledAttributes, index, c1307h.f15217a);
                    break;
                case 65:
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        obtainStyledAttributes.getString(index);
                    } else {
                        String str = AbstractC1110a.f13409a[obtainStyledAttributes.getInteger(index, 0)];
                    }
                    c1307h.getClass();
                    break;
                case 66:
                    obtainStyledAttributes.getInt(index, 0);
                    c1307h.getClass();
                    break;
                case 67:
                    c1307h.d = obtainStyledAttributes.getFloat(index, c1307h.d);
                    break;
                case 68:
                    c1308i.d = obtainStyledAttributes.getFloat(index, c1308i.d);
                    break;
                case 69:
                    c1306g.f15182Y = obtainStyledAttributes.getFloat(index, 1.0f);
                    break;
                case 70:
                    c1306g.f15183Z = obtainStyledAttributes.getFloat(index, 1.0f);
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    c1306g.f15185a0 = obtainStyledAttributes.getInt(index, c1306g.f15185a0);
                    break;
                case 73:
                    c1306g.f15187b0 = obtainStyledAttributes.getDimensionPixelSize(index, c1306g.f15187b0);
                    break;
                case 74:
                    c1306g.f15192e0 = obtainStyledAttributes.getString(index);
                    break;
                case 75:
                    c1306g.f15199i0 = obtainStyledAttributes.getBoolean(index, c1306g.f15199i0);
                    break;
                case 76:
                    c1307h.f15218b = obtainStyledAttributes.getInt(index, c1307h.f15218b);
                    break;
                case 77:
                    c1306g.f15193f0 = obtainStyledAttributes.getString(index);
                    break;
                case 78:
                    c1308i.f15221b = obtainStyledAttributes.getInt(index, c1308i.f15221b);
                    break;
                case 79:
                    c1307h.f15219c = obtainStyledAttributes.getFloat(index, c1307h.f15219c);
                    break;
                case 80:
                    c1306g.f15195g0 = obtainStyledAttributes.getBoolean(index, c1306g.f15195g0);
                    break;
                case 81:
                    c1306g.f15197h0 = obtainStyledAttributes.getBoolean(index, c1306g.f15197h0);
                    break;
                case 82:
                    sb = new StringBuilder("unused attribute 0x");
                    sb.append(Integer.toHexString(index));
                    sb.append("   ");
                    sb.append(sparseIntArray.get(index));
                    Log.w("ConstraintSet", sb.toString());
                    break;
                default:
                    sb = new StringBuilder("Unknown attribute 0x");
                    sb.append(Integer.toHexString(index));
                    sb.append("   ");
                    sb.append(sparseIntArray.get(index));
                    Log.w("ConstraintSet", sb.toString());
                    break;
            }
        }
        obtainStyledAttributes.recycle();
        return c1305f;
    }

    public static int f(TypedArray typedArray, int i7, int i8) {
        int resourceId = typedArray.getResourceId(i7, i8);
        if (resourceId == -1) {
            return typedArray.getInt(i7, -1);
        }
        return resourceId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1, types: [android.view.ViewGroup] */
    public final void a(ConstraintLayout constraintLayout) {
        ConstraintLayout constraintLayout2;
        int i7;
        HashMap hashMap;
        int i8;
        HashMap hashMap2;
        HashMap hashMap3;
        String str;
        C1310k c1310k = this;
        ConstraintLayout constraintLayout3 = constraintLayout;
        int i9 = 1;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap4 = c1310k.f15237c;
        HashSet hashSet = new HashSet(hashMap4.keySet());
        int i10 = 0;
        while (i10 < childCount) {
            View childAt = constraintLayout3.getChildAt(i10);
            int id = childAt.getId();
            if (!hashMap4.containsKey(Integer.valueOf(id))) {
                StringBuilder sb = new StringBuilder("id unknown ");
                try {
                    str = childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                    str = "UNKNOWN";
                }
                sb.append(str);
                Log.w("ConstraintSet", sb.toString());
            } else if (c1310k.f15236b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else {
                if (id != -1) {
                    if (hashMap4.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        C1305f c1305f = (C1305f) hashMap4.get(Integer.valueOf(id));
                        if (childAt instanceof Barrier) {
                            c1305f.d.f15189c0 = i9;
                        }
                        int i11 = c1305f.d.f15189c0;
                        if (i11 != -1 && i11 == i9) {
                            Barrier barrier = (Barrier) childAt;
                            barrier.setId(id);
                            C1306g c1306g = c1305f.d;
                            barrier.setType(c1306g.f15185a0);
                            barrier.setMargin(c1306g.f15187b0);
                            barrier.setAllowsGoneWidget(c1306g.f15199i0);
                            int[] iArr = c1306g.f15190d0;
                            if (iArr != null) {
                                barrier.setReferencedIds(iArr);
                            } else {
                                String str2 = c1306g.f15192e0;
                                if (str2 != null) {
                                    int[] c5 = c(barrier, str2);
                                    c1306g.f15190d0 = c5;
                                    barrier.setReferencedIds(c5);
                                }
                            }
                        }
                        C1303d c1303d = (C1303d) childAt.getLayoutParams();
                        c1303d.a();
                        c1305f.a(c1303d);
                        HashMap hashMap5 = c1305f.f;
                        Class<?> cls = childAt.getClass();
                        for (String str3 : hashMap5.keySet()) {
                            C1300a c1300a = (C1300a) hashMap5.get(str3);
                            String x7 = AbstractC0515y1.x("set", str3);
                            int i12 = childCount;
                            try {
                                switch (s.h.b(c1300a.f15082a)) {
                                    case 0:
                                        hashMap2 = hashMap4;
                                        hashMap3 = hashMap5;
                                        Class<?>[] clsArr = new Class[1];
                                        try {
                                            clsArr[0] = Integer.TYPE;
                                            cls.getMethod(x7, clsArr).invoke(childAt, Integer.valueOf(c1300a.f15083b));
                                        } catch (IllegalAccessException e3) {
                                            e = e3;
                                            StringBuilder u7 = AbstractC1111a.u(" Custom Attribute \"", str3, "\" not found on ");
                                            u7.append(cls.getName());
                                            Log.e("TransitionLayout", u7.toString());
                                            e.printStackTrace();
                                            childCount = i12;
                                            hashMap5 = hashMap3;
                                            hashMap4 = hashMap2;
                                        } catch (NoSuchMethodException e7) {
                                            e = e7;
                                            Log.e("TransitionLayout", e.getMessage());
                                            Log.e("TransitionLayout", " Custom Attribute \"" + str3 + "\" not found on " + cls.getName());
                                            Log.e("TransitionLayout", cls.getName() + " must have a method " + x7);
                                            childCount = i12;
                                            hashMap5 = hashMap3;
                                            hashMap4 = hashMap2;
                                        } catch (InvocationTargetException e8) {
                                            e = e8;
                                            StringBuilder u72 = AbstractC1111a.u(" Custom Attribute \"", str3, "\" not found on ");
                                            u72.append(cls.getName());
                                            Log.e("TransitionLayout", u72.toString());
                                            e.printStackTrace();
                                            childCount = i12;
                                            hashMap5 = hashMap3;
                                            hashMap4 = hashMap2;
                                        }
                                    case 1:
                                        hashMap2 = hashMap4;
                                        hashMap3 = hashMap5;
                                        cls.getMethod(x7, Float.TYPE).invoke(childAt, Float.valueOf(c1300a.f15084c));
                                        break;
                                    case 2:
                                        hashMap2 = hashMap4;
                                        hashMap3 = hashMap5;
                                        cls.getMethod(x7, Integer.TYPE).invoke(childAt, Integer.valueOf(c1300a.f));
                                        break;
                                    case 3:
                                        hashMap2 = hashMap4;
                                        hashMap3 = hashMap5;
                                        Method method = cls.getMethod(x7, Drawable.class);
                                        ColorDrawable colorDrawable = new ColorDrawable();
                                        colorDrawable.setColor(c1300a.f);
                                        method.invoke(childAt, colorDrawable);
                                        break;
                                    case 4:
                                        hashMap2 = hashMap4;
                                        hashMap3 = hashMap5;
                                        cls.getMethod(x7, CharSequence.class).invoke(childAt, c1300a.d);
                                        break;
                                    case 5:
                                        hashMap3 = hashMap5;
                                        try {
                                            hashMap2 = hashMap4;
                                            try {
                                                cls.getMethod(x7, Boolean.TYPE).invoke(childAt, Boolean.valueOf(c1300a.f15085e));
                                            } catch (IllegalAccessException e9) {
                                                e = e9;
                                                StringBuilder u722 = AbstractC1111a.u(" Custom Attribute \"", str3, "\" not found on ");
                                                u722.append(cls.getName());
                                                Log.e("TransitionLayout", u722.toString());
                                                e.printStackTrace();
                                                childCount = i12;
                                                hashMap5 = hashMap3;
                                                hashMap4 = hashMap2;
                                            } catch (NoSuchMethodException e10) {
                                                e = e10;
                                                Log.e("TransitionLayout", e.getMessage());
                                                Log.e("TransitionLayout", " Custom Attribute \"" + str3 + "\" not found on " + cls.getName());
                                                Log.e("TransitionLayout", cls.getName() + " must have a method " + x7);
                                                childCount = i12;
                                                hashMap5 = hashMap3;
                                                hashMap4 = hashMap2;
                                            } catch (InvocationTargetException e11) {
                                                e = e11;
                                                StringBuilder u7222 = AbstractC1111a.u(" Custom Attribute \"", str3, "\" not found on ");
                                                u7222.append(cls.getName());
                                                Log.e("TransitionLayout", u7222.toString());
                                                e.printStackTrace();
                                                childCount = i12;
                                                hashMap5 = hashMap3;
                                                hashMap4 = hashMap2;
                                            }
                                        } catch (IllegalAccessException e12) {
                                            e = e12;
                                            hashMap2 = hashMap4;
                                            StringBuilder u72222 = AbstractC1111a.u(" Custom Attribute \"", str3, "\" not found on ");
                                            u72222.append(cls.getName());
                                            Log.e("TransitionLayout", u72222.toString());
                                            e.printStackTrace();
                                            childCount = i12;
                                            hashMap5 = hashMap3;
                                            hashMap4 = hashMap2;
                                        } catch (NoSuchMethodException e13) {
                                            e = e13;
                                            hashMap2 = hashMap4;
                                            Log.e("TransitionLayout", e.getMessage());
                                            Log.e("TransitionLayout", " Custom Attribute \"" + str3 + "\" not found on " + cls.getName());
                                            Log.e("TransitionLayout", cls.getName() + " must have a method " + x7);
                                            childCount = i12;
                                            hashMap5 = hashMap3;
                                            hashMap4 = hashMap2;
                                        } catch (InvocationTargetException e14) {
                                            e = e14;
                                            hashMap2 = hashMap4;
                                            StringBuilder u722222 = AbstractC1111a.u(" Custom Attribute \"", str3, "\" not found on ");
                                            u722222.append(cls.getName());
                                            Log.e("TransitionLayout", u722222.toString());
                                            e.printStackTrace();
                                            childCount = i12;
                                            hashMap5 = hashMap3;
                                            hashMap4 = hashMap2;
                                        }
                                    case X.i.STRING_SET_FIELD_NUMBER /* 6 */:
                                        hashMap3 = hashMap5;
                                        try {
                                            cls.getMethod(x7, Float.TYPE).invoke(childAt, Float.valueOf(c1300a.f15084c));
                                            hashMap2 = hashMap4;
                                        } catch (IllegalAccessException e15) {
                                            e = e15;
                                            hashMap2 = hashMap4;
                                            StringBuilder u7222222 = AbstractC1111a.u(" Custom Attribute \"", str3, "\" not found on ");
                                            u7222222.append(cls.getName());
                                            Log.e("TransitionLayout", u7222222.toString());
                                            e.printStackTrace();
                                            childCount = i12;
                                            hashMap5 = hashMap3;
                                            hashMap4 = hashMap2;
                                        } catch (NoSuchMethodException e16) {
                                            e = e16;
                                            hashMap2 = hashMap4;
                                            Log.e("TransitionLayout", e.getMessage());
                                            Log.e("TransitionLayout", " Custom Attribute \"" + str3 + "\" not found on " + cls.getName());
                                            Log.e("TransitionLayout", cls.getName() + " must have a method " + x7);
                                            childCount = i12;
                                            hashMap5 = hashMap3;
                                            hashMap4 = hashMap2;
                                        } catch (InvocationTargetException e17) {
                                            e = e17;
                                            hashMap2 = hashMap4;
                                            StringBuilder u72222222 = AbstractC1111a.u(" Custom Attribute \"", str3, "\" not found on ");
                                            u72222222.append(cls.getName());
                                            Log.e("TransitionLayout", u72222222.toString());
                                            e.printStackTrace();
                                            childCount = i12;
                                            hashMap5 = hashMap3;
                                            hashMap4 = hashMap2;
                                        }
                                    default:
                                        hashMap2 = hashMap4;
                                        hashMap3 = hashMap5;
                                        break;
                                }
                            } catch (IllegalAccessException e18) {
                                e = e18;
                                hashMap2 = hashMap4;
                                hashMap3 = hashMap5;
                            } catch (NoSuchMethodException e19) {
                                e = e19;
                                hashMap2 = hashMap4;
                                hashMap3 = hashMap5;
                            } catch (InvocationTargetException e20) {
                                e = e20;
                                hashMap2 = hashMap4;
                                hashMap3 = hashMap5;
                            }
                            childCount = i12;
                            hashMap5 = hashMap3;
                            hashMap4 = hashMap2;
                        }
                        i7 = childCount;
                        hashMap = hashMap4;
                        childAt.setLayoutParams(c1303d);
                        C1308i c1308i = c1305f.f15156b;
                        if (c1308i.f15221b == 0) {
                            childAt.setVisibility(c1308i.f15220a);
                        }
                        childAt.setAlpha(c1308i.f15222c);
                        C1309j c1309j = c1305f.f15158e;
                        childAt.setRotation(c1309j.f15224a);
                        childAt.setRotationX(c1309j.f15225b);
                        childAt.setRotationY(c1309j.f15226c);
                        childAt.setScaleX(c1309j.d);
                        childAt.setScaleY(c1309j.f15227e);
                        if (!Float.isNaN(c1309j.f)) {
                            childAt.setPivotX(c1309j.f);
                        }
                        if (!Float.isNaN(c1309j.f15228g)) {
                            childAt.setPivotY(c1309j.f15228g);
                        }
                        childAt.setTranslationX(c1309j.f15229h);
                        childAt.setTranslationY(c1309j.f15230i);
                        childAt.setTranslationZ(c1309j.f15231j);
                        if (c1309j.f15232k) {
                            childAt.setElevation(c1309j.f15233l);
                        }
                    } else {
                        i7 = childCount;
                        hashMap = hashMap4;
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                    i8 = 1;
                    i10 += i8;
                    constraintLayout3 = constraintLayout;
                    i9 = i8;
                    childCount = i7;
                    hashMap4 = hashMap;
                    c1310k = this;
                }
            }
            i8 = i9;
            i7 = childCount;
            hashMap = hashMap4;
            i10 += i8;
            constraintLayout3 = constraintLayout;
            i9 = i8;
            childCount = i7;
            hashMap4 = hashMap;
            c1310k = this;
        }
        HashMap hashMap6 = hashMap4;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            HashMap hashMap7 = hashMap6;
            C1305f c1305f2 = (C1305f) hashMap7.get(num);
            C1306g c1306g2 = c1305f2.d;
            int i13 = c1306g2.f15189c0;
            if (i13 != -1) {
                if (i13 != 1) {
                    constraintLayout2 = constraintLayout;
                } else {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    int[] iArr2 = c1306g2.f15190d0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str4 = c1306g2.f15192e0;
                        if (str4 != null) {
                            int[] c6 = c(barrier2, str4);
                            c1306g2.f15190d0 = c6;
                            barrier2.setReferencedIds(c6);
                        }
                    }
                    barrier2.setType(c1306g2.f15185a0);
                    barrier2.setMargin(c1306g2.f15187b0);
                    C1303d a7 = ConstraintLayout.a();
                    barrier2.d();
                    c1305f2.a(a7);
                    constraintLayout2 = constraintLayout;
                    constraintLayout2.addView(barrier2, a7);
                }
            } else {
                constraintLayout2 = constraintLayout;
            }
            if (c1306g2.f15184a) {
                Guideline guideline = new Guideline(constraintLayout.getContext());
                guideline.setId(num.intValue());
                C1303d a8 = ConstraintLayout.a();
                c1305f2.a(a8);
                constraintLayout2.addView(guideline, a8);
            }
            hashMap6 = hashMap7;
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        C1310k c1310k = this;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap = c1310k.f15237c;
        hashMap.clear();
        int i7 = 0;
        while (i7 < childCount) {
            View childAt = constraintLayout.getChildAt(i7);
            C1303d c1303d = (C1303d) childAt.getLayoutParams();
            int id = childAt.getId();
            if (c1310k.f15236b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!hashMap.containsKey(Integer.valueOf(id))) {
                hashMap.put(Integer.valueOf(id), new C1305f());
            }
            C1305f c1305f = (C1305f) hashMap.get(Integer.valueOf(id));
            HashMap hashMap2 = c1310k.f15235a;
            HashMap hashMap3 = new HashMap();
            Class<?> cls = childAt.getClass();
            for (String str : hashMap2.keySet()) {
                C1300a c1300a = (C1300a) hashMap2.get(str);
                try {
                    if (str.equals("BackgroundColor")) {
                        hashMap3.put(str, new C1300a(c1300a, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                    } else {
                        hashMap3.put(str, new C1300a(c1300a, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                    }
                } catch (IllegalAccessException e3) {
                    e = e3;
                    e.printStackTrace();
                } catch (NoSuchMethodException e7) {
                    e = e7;
                    e.printStackTrace();
                } catch (InvocationTargetException e8) {
                    e = e8;
                    e.printStackTrace();
                }
            }
            c1305f.f = hashMap3;
            c1305f.f15155a = id;
            int i8 = c1303d.d;
            C1306g c1306g = c1305f.d;
            c1306g.f15194g = i8;
            c1306g.f15196h = c1303d.f15124e;
            c1306g.f15198i = c1303d.f;
            c1306g.f15200j = c1303d.f15127g;
            c1306g.f15201k = c1303d.f15129h;
            c1306g.f15202l = c1303d.f15131i;
            c1306g.f15203m = c1303d.f15133j;
            c1306g.n = c1303d.f15135k;
            c1306g.f15204o = c1303d.f15137l;
            c1306g.f15205p = c1303d.f15140p;
            c1306g.f15206q = c1303d.f15141q;
            c1306g.f15207r = c1303d.f15142r;
            c1306g.f15208s = c1303d.f15143s;
            c1306g.f15209t = c1303d.f15150z;
            c1306g.f15210u = c1303d.f15093A;
            c1306g.f15211v = c1303d.f15094B;
            c1306g.f15212w = c1303d.f15138m;
            c1306g.f15213x = c1303d.n;
            c1306g.f15214y = c1303d.f15139o;
            c1306g.f15215z = c1303d.f15107P;
            c1306g.f15160A = c1303d.f15108Q;
            c1306g.f15161B = c1303d.f15109R;
            c1306g.f = c1303d.f15121c;
            c1306g.d = c1303d.f15117a;
            c1306g.f15191e = c1303d.f15119b;
            c1306g.f15186b = ((ViewGroup.MarginLayoutParams) c1303d).width;
            c1306g.f15188c = ((ViewGroup.MarginLayoutParams) c1303d).height;
            c1306g.f15162C = ((ViewGroup.MarginLayoutParams) c1303d).leftMargin;
            c1306g.f15163D = ((ViewGroup.MarginLayoutParams) c1303d).rightMargin;
            c1306g.f15164E = ((ViewGroup.MarginLayoutParams) c1303d).topMargin;
            c1306g.F = ((ViewGroup.MarginLayoutParams) c1303d).bottomMargin;
            c1306g.f15173O = c1303d.f15097E;
            c1306g.f15174P = c1303d.f15096D;
            c1306g.f15176R = c1303d.f15098G;
            c1306g.f15175Q = c1303d.F;
            c1306g.f15195g0 = c1303d.f15110S;
            c1306g.f15197h0 = c1303d.f15111T;
            c1306g.f15177S = c1303d.f15099H;
            c1306g.f15178T = c1303d.f15100I;
            c1306g.f15179U = c1303d.f15103L;
            c1306g.f15180V = c1303d.f15104M;
            c1306g.W = c1303d.f15101J;
            c1306g.f15181X = c1303d.f15102K;
            c1306g.f15182Y = c1303d.f15105N;
            c1306g.f15183Z = c1303d.f15106O;
            c1306g.f15193f0 = c1303d.f15112U;
            c1306g.f15168J = c1303d.f15145u;
            c1306g.f15170L = c1303d.f15147w;
            c1306g.f15167I = c1303d.f15144t;
            c1306g.f15169K = c1303d.f15146v;
            c1306g.f15172N = c1303d.f15148x;
            c1306g.f15171M = c1303d.f15149y;
            c1306g.f15165G = c1303d.getMarginEnd();
            c1306g.f15166H = c1303d.getMarginStart();
            int visibility = childAt.getVisibility();
            C1308i c1308i = c1305f.f15156b;
            c1308i.f15220a = visibility;
            c1308i.f15222c = childAt.getAlpha();
            float rotation = childAt.getRotation();
            C1309j c1309j = c1305f.f15158e;
            c1309j.f15224a = rotation;
            c1309j.f15225b = childAt.getRotationX();
            c1309j.f15226c = childAt.getRotationY();
            c1309j.d = childAt.getScaleX();
            c1309j.f15227e = childAt.getScaleY();
            float pivotX = childAt.getPivotX();
            float pivotY = childAt.getPivotY();
            if (pivotX != 0.0d || pivotY != 0.0d) {
                c1309j.f = pivotX;
                c1309j.f15228g = pivotY;
            }
            c1309j.f15229h = childAt.getTranslationX();
            c1309j.f15230i = childAt.getTranslationY();
            c1309j.f15231j = childAt.getTranslationZ();
            if (c1309j.f15232k) {
                c1309j.f15233l = childAt.getElevation();
            }
            if (childAt instanceof Barrier) {
                Barrier barrier = (Barrier) childAt;
                c1306g.f15199i0 = barrier.f5571y.f14425g0;
                c1306g.f15190d0 = barrier.getReferencedIds();
                c1306g.f15185a0 = barrier.getType();
                c1306g.f15187b0 = barrier.getMargin();
            }
            i7++;
            c1310k = this;
        }
    }

    public final void e(Context context, int i7) {
        XmlResourceParser xml = context.getResources().getXml(i7);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType != 0) {
                    if (eventType != 2) {
                        continue;
                    } else {
                        String name = xml.getName();
                        C1305f d7 = d(context, Xml.asAttributeSet(xml));
                        if (name.equalsIgnoreCase("Guideline")) {
                            d7.d.f15184a = true;
                        }
                        this.f15237c.put(Integer.valueOf(d7.f15155a), d7);
                        continue;
                    }
                } else {
                    xml.getName();
                    continue;
                }
            }
        } catch (IOException e3) {
            e3.printStackTrace();
        } catch (XmlPullParserException e7) {
            e7.printStackTrace();
        }
    }
}
